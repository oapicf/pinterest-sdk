package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.KeywordMetricsResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeywordsMetricsArrayResponse   {

    private List<@Valid KeywordMetricsResponse> data = new ArrayList<>();

    /**
     * Default constructor.
     */
    public KeywordsMetricsArrayResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordsMetricsArrayResponse.
     *
     * @param data data
     */
    public KeywordsMetricsArrayResponse(
        List<@Valid KeywordMetricsResponse> data
    ) {
        this.data = data;
    }



    /**
     * Get data
     * @return data
     */
    public List<@Valid KeywordMetricsResponse> getData() {
        return data;
    }

    public void setData(List<@Valid KeywordMetricsResponse> data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsMetricsArrayResponse {\n");
        
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

