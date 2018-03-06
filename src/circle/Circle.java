class Circle { 
    /** The radius of this circle */
    double radius;
    
    /** Construct a circle object */
    Circle(){
        radius = 1;
    }
    
    /** Construct a circle object */
    Circle(double newRadius) {
        radius = newRadius;
    }
    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
    /** Return the perimeter of this circle */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    /** Set new radius for this circle */
    public void setRadius(double radius){
        this.radius = radius;
    }
}