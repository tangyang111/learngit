/**
 * Created by ty on 2017/4/4.
 */
public class Planet {
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    public Planet(double xxPos, double yyPos, double xxVel,
                  double yyVel, double mass, String imgFileName) {
        this.xxPos = xxPos;
        this.yyPos = yyPos;
        this.xxVel = xxVel;
        this.yyVel = yyVel;
        this.mass = mass;
        this.imgFileName = imgFileName;
    }
    public Planet(Planet p){
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }
    public double calcDistance(Planet p){
        return Math.pow((Math.pow((this.xxPos - p.xxPos), 2)
                + Math.pow((this.yyPos - p.yyPos), 2)), 0.5);
    }
    public double calcForceExertedBy(Planet p){
        double dis = calcDistance(p);
        return 6.67 * Math.pow(10, -11) *
                this.mass * p.mass / Math.pow(dis, 2);
    }
    public double calcForceExertedByX(Planet p){
        return calcForceExertedBy(p) * (p.xxPos - this.xxPos) / calcDistance(p);
    }
    public double calcForceExertedByY(Planet p){
        return calcForceExertedBy(p) * (p.yyPos - this.yyPos) / calcDistance(p);
    }
    public double calcNetForceExertedByX(Planet[] ps){
        double fx = 0;
        for(Planet p : ps){
            if(!this.equals(p)){
                fx += calcForceExertedByX(p);
            }
        }
        return fx;
    }
    public double calcNetForceExertedByY(Planet[] ps){
        double fy = 0;
        for(Planet p : ps){
            if(!this.equals(p)){
                fy += calcForceExertedByY(p);
            }
        }
        return fy;
    }
    public void update(double time, double forcex, double forcey){
        double ax = forcex / this.mass;
        double ay = forcey / this.mass;
        this.xxVel = this.xxVel + time * ax;
        this.yyVel = this.yyVel + time * ay;
        this.xxPos = this.xxPos + time * this.xxVel;
        this.yyPos = this.yyPos + time * this.yyVel;

    }
    public void draw(){
        String imageToDraw = "./images/" + this.imgFileName;
//        StdDraw.setScale(-100, 100);

		/* Clears the drawing window. */
//        StdDraw.clear();

		/* Stamps three copies of advice.png in a triangular pattern. */
        StdDraw.picture(100*this.xxPos/2.50e+11, 100*this.yyPos/2.50e+11, imageToDraw);
    }
}
