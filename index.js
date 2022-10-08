const express = require('express');
const app = express();

app.use(express.json());

const fs = require('fs');

const cors = require('cors');
app.use(cors({
    origin: '*'
}));

// Read Request handlers    
// display simple message when URL is only '\'
app.get('/', (req, res) => {
    res.send('Welcome to our Ice Cream Storag!');
});
fs.readFileSync('./test.txt', (err, data) => {
    console.log("aaya");
    if (err) {
        console.log(err);
    } else {
        console.log(data);
        res.send(data);
    }
}
);
// Display list of Ice Cream Flavors
app.get('/allCustomers', (req, res) => {
    console.log('GET /allCustomers');
    fs.readFile('test.txt', 'utf8', (err, data) => {
        if (err) {
          console.error(err);
          return;
        }
        console.log(JSON.parse(data));
        res.send(data);
      });
    // res.send(data);
});


const port = process.env.PORT || 3000;
app.listen(port, () => {
    console.log(`Listening on port ${port}...`)
});
