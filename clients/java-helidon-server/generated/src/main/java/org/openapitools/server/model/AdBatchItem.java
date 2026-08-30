package org.openapitools.server.model;

import org.openapitools.server.model.Ad;
import org.openapitools.server.model.PinterestLibError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdBatchItem   {

    private Ad data;
    private PinterestLibError exceptions;

    /**
     * Default constructor.
     */
    public AdBatchItem() {
    // JSON-B / Jackson
    }

    /**
     * Create AdBatchItem.
     *
     * @param data data
     * @param exceptions exceptions
     */
    public AdBatchItem(
        Ad data, 
        PinterestLibError exceptions
    ) {
        this.data = data;
        this.exceptions = exceptions;
    }



    /**
     * Get data
     * @return data
     */
    public Ad getData() {
        return data;
    }

    public void setData(Ad data) {
        this.data = data;
    }

    /**
     * Get exceptions
     * @return exceptions
     */
    public PinterestLibError getExceptions() {
        return exceptions;
    }

    public void setExceptions(PinterestLibError exceptions) {
        this.exceptions = exceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdBatchItem {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

