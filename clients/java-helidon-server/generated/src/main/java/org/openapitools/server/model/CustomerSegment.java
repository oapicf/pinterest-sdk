package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TargetingTemplateStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomerSegment   {

    private String adAccountId;
    private List<String> audienceIds = new ArrayList<>();
    private Integer createdTime;
    private String id;
    private String name;
    private TargetingTemplateStatus status;
    private Integer updatedTime;

    /**
     * Default constructor.
     */
    public CustomerSegment() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerSegment.
     *
     * @param adAccountId The ID of the ad account that this customer segment belongs to.
     * @param audienceIds Audience IDs included in the customer segment.
     * @param createdTime Customer segment created time. Unix timestamp in seconds.
     * @param id Customer segment ID.
     * @param name Customer segment name.
     * @param status Indicates whether the customer segment is active or deleted.
     * @param updatedTime Customer segment updated time. Unix timestamp in seconds.
     */
    public CustomerSegment(
        String adAccountId, 
        List<String> audienceIds, 
        Integer createdTime, 
        String id, 
        String name, 
        TargetingTemplateStatus status, 
        Integer updatedTime
    ) {
        this.adAccountId = adAccountId;
        this.audienceIds = audienceIds;
        this.createdTime = createdTime;
        this.id = id;
        this.name = name;
        this.status = status;
        this.updatedTime = updatedTime;
    }



    /**
     * The ID of the ad account that this customer segment belongs to.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Audience IDs included in the customer segment.
     * @return audienceIds
     */
    public List<String> getAudienceIds() {
        return audienceIds;
    }

    public void setAudienceIds(List<String> audienceIds) {
        this.audienceIds = audienceIds;
    }

    /**
     * Customer segment created time. Unix timestamp in seconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Customer segment ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Customer segment name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Indicates whether the customer segment is active or deleted.
     * @return status
     */
    public TargetingTemplateStatus getStatus() {
        return status;
    }

    public void setStatus(TargetingTemplateStatus status) {
        this.status = status;
    }

    /**
     * Customer segment updated time. Unix timestamp in seconds.
     * @return updatedTime
     */
    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerSegment {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

