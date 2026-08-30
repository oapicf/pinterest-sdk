package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Lead form test action: submit sample answers and receive the resulting subscription id.
 */
public class LeadFormTest   {

    private String subscriptionId;

    /**
     * Default constructor.
     */
    public LeadFormTest() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadFormTest.
     *
     * @param subscriptionId Subscription ID.
     */
    public LeadFormTest(
        String subscriptionId
    ) {
        this.subscriptionId = subscriptionId;
    }



    /**
     * Subscription ID.
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadFormTest {\n");
        
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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

