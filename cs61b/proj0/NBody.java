/**
 * Created by ty on 2017/4/4.
 */
public class NBody {

    public static void main(String[] args){
        StdAudio.loop("./audio/2001.mid");
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        Planet[] planets = NBody.readPlanets(filename);
        double radius = NBody.readRadius(filename);

        String imageToDraw = "./images/starfield.jpg";
        StdDraw.setScale(-100, 100);
        StdDraw.clear();
        StdDraw.picture(0, 0, imageToDraw);
        for(Planet p : planets){
            p.draw();
        }
        double time = 0;
        int len = planets.length;
        for (time = 0; time < T; time += dt){
            double [] xForces = new double[len];
            double [] yForces = new double[len];
            for (int i = 0; i < len; i++){
                Planet p = planets[i];
                xForces[i] = p.calcNetForceExertedByX(planets);
                yForces[i] = p.calcNetForceExertedByY(planets);
            }
            for (int i = 0; i < len; i++){
                Planet p = planets[i];
                p.update(dt, xForces[i], yForces[i]);
                StdDraw.picture(0, 0, imageToDraw);
                for(Planet p1 : planets){
                    p1.draw();
                }
                StdDraw.show(10);
            }
        }
        StdOut.printf("%d\n", planets.length);
        StdOut.printf("%.2e\n", radius);
        for (int i = 0; i < planets.length; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                    planets[i].xxPos, planets[i].yyPos, planets[i].xxVel, planets[i].yyVel, planets[i].mass, planets[i].imgFileName);
        }

    }
    public static double readRadius(String path){
        In in = new In(path);
        int num = in.readInt();
        double radius = in.readDouble();
        return radius;
    }
    public static Planet[] readPlanets(String path){
        Planet[] planets = new Planet[5];
        In in = new In(path);
        int num = in.readInt();
        double redius = in.readDouble();
        for(int i = 0; i < 5; i++){
            planets[i] = new Planet(in.readDouble(), in.readDouble(), in.readDouble(),
                    in.readDouble(), in.readDouble(), in.readString());
        }
        return planets;
    }

}
