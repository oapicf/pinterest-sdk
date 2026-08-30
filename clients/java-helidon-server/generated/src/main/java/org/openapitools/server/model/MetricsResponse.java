package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MetricsResponseDataItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MetricsResponse   {

    private List<@Valid MetricsResponseDataItems> data = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MetricsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create MetricsResponse.
     *
     * @param data data
     */
    public MetricsResponse(
        List<@Valid MetricsResponseDataItems> data
    ) {
        this.data = data;
    }



    /**
     * Get data
     * @return data
     */
    public List<@Valid MetricsResponseDataItems> getData() {
        return data;
    }

    public void setData(List<@Valid MetricsResponseDataItems> data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricsResponse {\n");
        
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

