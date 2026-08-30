package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DynamicTitlesProcessCSVError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DynamicTitlesProcessCSV   {

    private List<@Valid DynamicTitlesProcessCSVError> errors = new ArrayList<>();
    private String status;

    /**
     * Default constructor.
     */
    public DynamicTitlesProcessCSV() {
    // JSON-B / Jackson
    }

    /**
     * Create DynamicTitlesProcessCSV.
     *
     * @param errors List of validation errors. Empty on success.
     * @param status Processing status. Present on success.
     */
    public DynamicTitlesProcessCSV(
        List<@Valid DynamicTitlesProcessCSVError> errors, 
        String status
    ) {
        this.errors = errors;
        this.status = status;
    }



    /**
     * List of validation errors. Empty on success.
     * @return errors
     */
    public List<@Valid DynamicTitlesProcessCSVError> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid DynamicTitlesProcessCSVError> errors) {
        this.errors = errors;
    }

    /**
     * Processing status. Present on success.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicTitlesProcessCSV {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

