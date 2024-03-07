    public class Point{
        private double abs, ord;
        public void setA(double P){
            abs= P;
        }
        public void setO(double P){
            ord= P;
        }
        public double getA(){
            return abs;
        }
        public double getO(){
            return ord;
        }
         public String toString(){
            return "("+getA()+","+getO()+")";
        }
        public Point(double abs, double ord){
            this.abs= abs;
            this.ord= ord;
        }
        public Point(Point P){
            double x= getA();
            double y= getO();

        }
        public double calculerDistance(Point P){
            double a= P.getA();
            double b= P.getO();
            double x= this.getA();
            double y= this.getO();
            double squareDistance= Math.pow(a-x, 2) + Math.pow(b-y, 2);
            return Math.sqrt(squareDistance);
        }
        /*
        public String calculerMilieu(Point P){
            double a= P.getA();
            double b= P.getO();
            double x= this.getA();
            double y= this.getO();
            double Xm= (x+a)/2;
            double Ym=(y+b)/2;
            Point P2= new Point(abs, ord);
            Xm = abs;
            Ym= ord;
            return P2.toString();
        }
        this method is not demanded, and it returns a string */
        public Point calculerMilieu(Point P) {
            double a = P.getA();
            double b = P.getO();
            double x = this.getA();
            double y = this.getO();
            double Xm = (x + a) / 2;
            double Ym = (y + b) / 2;
            Point P2 = new Point(Xm, Ym);
            return P2;
        }
    }

