package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AiDisclosureItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * AI disclosure declarations the creator has made about the Pin.
 */
public class AiDisclosures   {

    private List<AiDisclosureItem> values = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AiDisclosures() {
    // JSON-B / Jackson
    }

    /**
     * Create AiDisclosures.
     *
     * @param values List of AI disclosure declarations the creator has made about this Pin.
     */
    public AiDisclosures(
        List<AiDisclosureItem> values
    ) {
        this.values = values;
    }



    /**
     * List of AI disclosure declarations the creator has made about this Pin.
     * @return values
     */
    public List<AiDisclosureItem> getValues() {
        return values;
    }

    public void setValues(List<AiDisclosureItem> values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiDisclosures {\n");
        
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

