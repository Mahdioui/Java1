public class TroisPoints {
    private Point premier;
    private Point deuxième;
    private Point troisième;

    public TroisPoints(Point P1, Point P2,Point P3 ){
        this.premier= new Point(P1);
        this.deuxième= new Point(P2);
        this.troisième= new Point(P3);
    }
    public void setPremier(Point P1){
        premier.setA(P1.getA());
        premier.setO(P1.getO());
    }
    public void setDeuxième(Point P1){
        deuxième.setA(P1.getA());
        deuxième.setO(P1.getO());
    }
    public void setTroisième(Point P1){
        troisième.setA(P1.getA());
        troisième.setO(P1.getO());
    }
    public Point getPremier(){
        return premier;
    }
    public Point getDeuxième(){
        return deuxième;
    }
    public Point getTroisième(){
        return troisième;
    }

    public boolean sontAlignés(){
        return(premier.calculerDistance(deuxième)== (deuxième.calculerDistance(troisième))+ troisième.calculerDistance(premier));
    }
    public boolean sontIsocèles(){
        return(premier.calculerDistance(deuxième)== premier.calculerDistance(troisième) || deuxième.calculerDistance(troisième)==deuxième.calculerDistance(premier));
    }
}
