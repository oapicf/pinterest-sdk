package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadFormPolicyLink   {

    private String label;
    private String link;

    /**
     * Default constructor.
     */
    public LeadFormPolicyLink() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadFormPolicyLink.
     *
     * @param label Policy label for an additional policy link.
     * @param link Policy link for an additional policy link.
     */
    public LeadFormPolicyLink(
        String label, 
        String link
    ) {
        this.label = label;
        this.link = link;
    }



    /**
     * Policy label for an additional policy link.
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Policy link for an additional policy link.
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadFormPolicyLink {\n");
        
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

