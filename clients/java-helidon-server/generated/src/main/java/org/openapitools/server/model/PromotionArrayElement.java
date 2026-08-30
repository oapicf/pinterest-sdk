package org.openapitools.server.model;

import org.openapitools.server.model.Exception;
import org.openapitools.server.model.Promotion;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PromotionArrayElement   {

    private Promotion data;
    private Exception exception;

    /**
     * Default constructor.
     */
    public PromotionArrayElement() {
    // JSON-B / Jackson
    }

    /**
     * Create PromotionArrayElement.
     *
     * @param data data
     * @param exception exception
     */
    public PromotionArrayElement(
        Promotion data, 
        Exception exception
    ) {
        this.data = data;
        this.exception = exception;
    }



    /**
     * Get data
     * @return data
     */
    public Promotion getData() {
        return data;
    }

    public void setData(Promotion data) {
        this.data = data;
    }

    /**
     * Get exception
     * @return exception
     */
    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromotionArrayElement {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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

