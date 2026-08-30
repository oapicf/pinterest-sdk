package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class LeadFormTestCreate   {

    private List<String> answers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LeadFormTestCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadFormTestCreate.
     *
     * @param answers Test lead answers. Should follow the creation order.
     */
    public LeadFormTestCreate(
        List<String> answers
    ) {
        this.answers = answers;
    }



    /**
     * Test lead answers. Should follow the creation order.
     * @return answers
     */
    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadFormTestCreate {\n");
        
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

