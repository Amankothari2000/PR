#include <bits/stdc++.h>
using namespace std;
void circle_circle_intersection(double x0, double y0, double r0, double x1, double y1, double r1, double *xi, double *yi, double *xi_prime, double *yi_prime){
	double a, dx, dy, d, h, rx, ry;
	double x2, y2;

	dx = x1 - x0;
	dy = y1 - y0;

	d = sqrt((dy*dy) + (dx*dx));

	a = ((r0*r0) - (r1*r1) + (d*d)) / (2.0 * d) ;

	x2 = x0 + (dx * a/d);
	y2 = y0 + (dy * a/d);

	h = sqrt((r0*r0) - (a*a));

	rx = -dy * (h/d);
	ry = dx * (h/d);

	*xi = x2 + rx;
	*xi_prime = x2 - rx;

	*yi = y2 + ry;
	*yi_prime = y2 - ry;

	return;
}
int main(){
    double x0, y0, r0, x1, y1, r1, xi, yi, xi_prime, yi_prime;
    std::cin >> x0 >> y0 >> r0 >> x1 >> y1 >> r1;
    circle_circle_intersection(x0, y0, r0, x1, y1, r1, &xi, &yi, &xi_prime, &yi_prime);
    std::cout << xi << " " << yi << " " << xi_prime << " " << yi_prime << std::endl;
    return 0;
}