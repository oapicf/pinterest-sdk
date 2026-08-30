package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ConversionObjectiveType;
import org.openapitools.server.model.SummaryStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BulkDownloadCampaignFilter   {

    private List<SummaryStatus> campaignStatus = new ArrayList<>();
    private String endTime;
    private String name;
    private List<ConversionObjectiveType> objectiveType = new ArrayList<>();
    private String startTime;

    /**
     * Default constructor.
     */
    public BulkDownloadCampaignFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkDownloadCampaignFilter.
     *
     * @param campaignStatus campaignStatus
     * @param endTime Unix UTC timestamp.
     * @param name Campaign name
     * @param objectiveType objectiveType
     * @param startTime Unix UTC timestamp.
     */
    public BulkDownloadCampaignFilter(
        List<SummaryStatus> campaignStatus, 
        String endTime, 
        String name, 
        List<ConversionObjectiveType> objectiveType, 
        String startTime
    ) {
        this.campaignStatus = campaignStatus;
        this.endTime = endTime;
        this.name = name;
        this.objectiveType = objectiveType;
        this.startTime = startTime;
    }



    /**
     * Get campaignStatus
     * @return campaignStatus
     */
    public List<SummaryStatus> getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(List<SummaryStatus> campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * Unix UTC timestamp.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * Campaign name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get objectiveType
     * @return objectiveType
     */
    public List<ConversionObjectiveType> getObjectiveType() {
        return objectiveType;
    }

    public void setObjectiveType(List<ConversionObjectiveType> objectiveType) {
        this.objectiveType = objectiveType;
    }

    /**
     * Unix UTC timestamp.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkDownloadCampaignFilter {\n");
        
        sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

