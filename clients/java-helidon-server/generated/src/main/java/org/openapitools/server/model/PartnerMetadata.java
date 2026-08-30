package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PartnerMetadata   {

    private String subscriberKey;

    /**
     * Default constructor.
     */
    public PartnerMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create PartnerMetadata.
     *
     * @param subscriberKey Text field value that uniquely identifies a subscriber.
     */
    public PartnerMetadata(
        String subscriberKey
    ) {
        this.subscriberKey = subscriberKey;
    }



    /**
     * Text field value that uniquely identifies a subscriber.
     * @return subscriberKey
     */
    public String getSubscriberKey() {
        return subscriberKey;
    }

    public void setSubscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartnerMetadata {\n");
        
        sb.append("    subscriberKey: ").append(toIndentedString(subscriberKey)).append("\n");
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

