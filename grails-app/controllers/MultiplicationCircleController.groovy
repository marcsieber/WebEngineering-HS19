class MultiplicationCircleController {
    static int radius = 200
    static int cx = radius
    static int cy = radius
    static int tableBase =2

    def index(MultiplicationCircleModel circleModel) {
        circleModel.lines = []
        for(int i = 0; i< circleModel.segmentCount; i++) {
            circleModel.lines.add( new Line (
                x1: xValueOf(i, circleModel.segmentCount),
                y1: yValueOf(i, circleModel.segmentCount),
                x2: xValueOf(i * tableBase, circleModel.segmentCount),
                y2: yValueOf(i * tableBase, circleModel.segmentCount)
            ))
        }
        render view:"show", model:[circleInstance: circleModel]
    }

    private static double arc(int segment, int segmentCount) {
        2 * Math.PI * segment / segmentCount
    }
    def xValueOf(int segment, int segmentCount) {
        return cx + Math.cos(arc(segment, segmentCount)) * radius
    }
    def yValueOf(int segment, int segmentCount) {
        return cy + Math.sin(arc(segment, segmentCount)) * radius
    }
}

class MultiplicationCircleModel {
    int segmentCount = 10

    // todo: add a property tableBase such that we can modify and refer to it

    List<Line> lines = Collections.EMPTY_LIST
}

class Line {
    double x1, y1, x2, y2
}
