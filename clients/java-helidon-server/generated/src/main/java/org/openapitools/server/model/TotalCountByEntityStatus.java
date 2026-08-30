package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Breakdown of asset counts by entity status.
 */
public class TotalCountByEntityStatus   {

    private Integer ACTIVE;
    private Integer ARCHIVED;
    private Integer PAUSED;

    /**
     * Default constructor.
     */
    public TotalCountByEntityStatus() {
    // JSON-B / Jackson
    }

    /**
     * Create TotalCountByEntityStatus.
     *
     * @param ACTIVE Count of ACTIVE assets
     * @param ARCHIVED Count of ARCHIVED assets
     * @param PAUSED Count of PAUSED assets
     */
    public TotalCountByEntityStatus(
        Integer ACTIVE, 
        Integer ARCHIVED, 
        Integer PAUSED
    ) {
        this.ACTIVE = ACTIVE;
        this.ARCHIVED = ARCHIVED;
        this.PAUSED = PAUSED;
    }



    /**
     * Count of ACTIVE assets
     * @return ACTIVE
     */
    public Integer getACTIVE() {
        return ACTIVE;
    }

    public void setACTIVE(Integer ACTIVE) {
        this.ACTIVE = ACTIVE;
    }

    /**
     * Count of ARCHIVED assets
     * @return ARCHIVED
     */
    public Integer getARCHIVED() {
        return ARCHIVED;
    }

    public void setARCHIVED(Integer ARCHIVED) {
        this.ARCHIVED = ARCHIVED;
    }

    /**
     * Count of PAUSED assets
     * @return PAUSED
     */
    public Integer getPAUSED() {
        return PAUSED;
    }

    public void setPAUSED(Integer PAUSED) {
        this.PAUSED = PAUSED;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TotalCountByEntityStatus {\n");
        
        sb.append("    ACTIVE: ").append(toIndentedString(ACTIVE)).append("\n");
        sb.append("    ARCHIVED: ").append(toIndentedString(ARCHIVED)).append("\n");
        sb.append("    PAUSED: ").append(toIndentedString(PAUSED)).append("\n");
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

