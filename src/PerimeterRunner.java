import java.util.ArrayList;
import java.util.List;
public class PerimeterRunner {
    public double getPerimeter(List<Point> points){
        double totalPerim= 0.0;
        Point prevPt= points.get(points.size()-1);
        for (Point currPt : points){
            totalPerim += prevPt.distance(currPt);
            prevPt =currPt;
        }
        return totalPerim;
    }
}
