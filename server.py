from tokenize import String
from spyne import Application, ServiceBase
from spyne.decorator import srpc
from spyne.model.primitive import String
from spyne.model.complex import Iterable
from spyne.protocol.soap import Soap11
from spyne.server.wsgi import WsgiApplication
from wsgiref.simple_server import make_server

import logging

class server(ServiceBase):
    @srpc(_returns=Iterable(String))
    def listAllCustomers():
        data_file = open('data.txt', 'r')
        all_customer_data = data_file.readlines()

        for customer_data in all_customer_data:
            yield customer_data.strip()


application = Application([server], 'spyne.examples.hello.soap',
                          in_protocol=Soap11(validator='lxml'),
                          out_protocol=Soap11())

wsgi_application = WsgiApplication(application)

if __name__ == '__main__':
    server = make_server('127.0.0.1', 8000, wsgi_application)
    server.serve_forever()