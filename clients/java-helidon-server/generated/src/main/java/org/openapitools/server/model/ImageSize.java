package org.openapitools.server.model;

import org.openapitools.server.model.ImageDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ImageSize   {

    private ImageDetails _1200x;
    private ImageDetails _150x150;
    private ImageDetails _400x300;
    private ImageDetails _600x;

    /**
     * Default constructor.
     */
    public ImageSize() {
    // JSON-B / Jackson
    }

    /**
     * Create ImageSize.
     *
     * @param _1200x _1200x
     * @param _150x150 _150x150
     * @param _400x300 _400x300
     * @param _600x _600x
     */
    public ImageSize(
        ImageDetails _1200x, 
        ImageDetails _150x150, 
        ImageDetails _400x300, 
        ImageDetails _600x
    ) {
        this._1200x = _1200x;
        this._150x150 = _150x150;
        this._400x300 = _400x300;
        this._600x = _600x;
    }



    /**
     * Get _1200x
     * @return _1200x
     */
    public ImageDetails get1200x() {
        return _1200x;
    }

    public void set1200x(ImageDetails _1200x) {
        this._1200x = _1200x;
    }

    /**
     * Get _150x150
     * @return _150x150
     */
    public ImageDetails get150x150() {
        return _150x150;
    }

    public void set150x150(ImageDetails _150x150) {
        this._150x150 = _150x150;
    }

    /**
     * Get _400x300
     * @return _400x300
     */
    public ImageDetails get400x300() {
        return _400x300;
    }

    public void set400x300(ImageDetails _400x300) {
        this._400x300 = _400x300;
    }

    /**
     * Get _600x
     * @return _600x
     */
    public ImageDetails get600x() {
        return _600x;
    }

    public void set600x(ImageDetails _600x) {
        this._600x = _600x;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSize {\n");
        
        sb.append("    _1200x: ").append(toIndentedString(_1200x)).append("\n");
        sb.append("    _150x150: ").append(toIndentedString(_150x150)).append("\n");
        sb.append("    _400x300: ").append(toIndentedString(_400x300)).append("\n");
        sb.append("    _600x: ").append(toIndentedString(_600x)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

