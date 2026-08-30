package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LeadForm;
import org.openapitools.server.model.PinterestLibBatchItemException;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadFormsCreate200ResponseItemsInner   {

    private LeadForm data;
    private List<@Valid PinterestLibBatchItemException> exceptions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LeadFormsCreate200ResponseItemsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadFormsCreate200ResponseItemsInner.
     *
     * @param data data
     * @param exceptions exceptions
     */
    public LeadFormsCreate200ResponseItemsInner(
        LeadForm data, 
        List<@Valid PinterestLibBatchItemException> exceptions
    ) {
        this.data = data;
        this.exceptions = exceptions;
    }



    /**
     * Get data
     * @return data
     */
    public LeadForm getData() {
        return data;
    }

    public void setData(LeadForm data) {
        this.data = data;
    }

    /**
     * Get exceptions
     * @return exceptions
     */
    public List<@Valid PinterestLibBatchItemException> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<@Valid PinterestLibBatchItemException> exceptions) {
        this.exceptions = exceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadFormsCreate200ResponseItemsInner {\n");
        
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

