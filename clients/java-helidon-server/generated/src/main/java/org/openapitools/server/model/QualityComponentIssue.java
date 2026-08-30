package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details of an issue with a quality component.
 */
public class QualityComponentIssue   {

    private String id;
    private String name;
    private String reason;

    /**
     * Default constructor.
     */
    public QualityComponentIssue() {
    // JSON-B / Jackson
    }

    /**
     * Create QualityComponentIssue.
     *
     * @param id Unique identifier for the issue check.
     * @param name Human-readable name of the issue.
     * @param reason Detailed reason for the issue.
     */
    public QualityComponentIssue(
        String id, 
        String name, 
        String reason
    ) {
        this.id = id;
        this.name = name;
        this.reason = reason;
    }



    /**
     * Unique identifier for the issue check.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Human-readable name of the issue.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Detailed reason for the issue.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityComponentIssue {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

