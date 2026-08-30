package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ConversionEventsDataItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Conversion events.
 */
public class ConversionEventsCreate   {

    private List<@Valid ConversionEventsDataItems> data = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ConversionEventsCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEventsCreate.
     *
     * @param data A list of events (one or more) encapsulated by a data object.
     */
    public ConversionEventsCreate(
        List<@Valid ConversionEventsDataItems> data
    ) {
        this.data = data;
    }



    /**
     * A list of events (one or more) encapsulated by a data object.
     * @return data
     */
    public List<@Valid ConversionEventsDataItems> getData() {
        return data;
    }

    public void setData(List<@Valid ConversionEventsDataItems> data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionEventsCreate {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

