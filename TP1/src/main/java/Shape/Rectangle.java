package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO (done)
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super();
        for (Double x = -width; x <= width; x += 0.5){
            for (Double y = -height; y <= height; y += 0.5) {
                add(new Point2d(x, y));
            }
        }
    }

    /** TODO (done)
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());

    }

    /** TODO (done)
     * Translate the rectangle by a given 2D point
     * @param point Point by which to translate
     * @return Translated rectangle
     */
    @Override
    public Rectangle translate(Point2d point) {
        super.translate(point);
        return this;
    }

    /** TODO (done)
     * Rotate the rectangle by a given angle
     * @param angle The angle by which to rotate
     * @return Rotated rectangle
     */

    @Override
    public Rectangle rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    /** TODO (done)
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() { return (Rectangle)super.clone(); }
}
