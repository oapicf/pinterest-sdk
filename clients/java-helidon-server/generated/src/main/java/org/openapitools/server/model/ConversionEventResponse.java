package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ConversionTagType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionEventResponse   {

    private String adAccountId;
    private ConversionTagType conversionEvent;
    private String conversionTagId;
    private Integer createdTime;
    private String reportingConversionEvent;

    /**
     * Default constructor.
     */
    public ConversionEventResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEventResponse.
     *
     * @param adAccountId Id of the ad account.
     * @param conversionEvent conversionEvent
     * @param conversionTagId Id of the tag.
     * @param createdTime Creation date in epoch format.
     * @param reportingConversionEvent For advertiser-defined events, the reporting event label shown in optimization UIs.
     */
    public ConversionEventResponse(
        String adAccountId, 
        ConversionTagType conversionEvent, 
        String conversionTagId, 
        Integer createdTime, 
        String reportingConversionEvent
    ) {
        this.adAccountId = adAccountId;
        this.conversionEvent = conversionEvent;
        this.conversionTagId = conversionTagId;
        this.createdTime = createdTime;
        this.reportingConversionEvent = reportingConversionEvent;
    }



    /**
     * Id of the ad account.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Get conversionEvent
     * @return conversionEvent
     */
    public ConversionTagType getConversionEvent() {
        return conversionEvent;
    }

    public void setConversionEvent(ConversionTagType conversionEvent) {
        this.conversionEvent = conversionEvent;
    }

    /**
     * Id of the tag.
     * @return conversionTagId
     */
    public String getConversionTagId() {
        return conversionTagId;
    }

    public void setConversionTagId(String conversionTagId) {
        this.conversionTagId = conversionTagId;
    }

    /**
     * Creation date in epoch format.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * For advertiser-defined events, the reporting event label shown in optimization UIs.
     * @return reportingConversionEvent
     */
    public String getReportingConversionEvent() {
        return reportingConversionEvent;
    }

    public void setReportingConversionEvent(String reportingConversionEvent) {
        this.reportingConversionEvent = reportingConversionEvent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionEventResponse {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    conversionEvent: ").append(toIndentedString(conversionEvent)).append("\n");
        sb.append("    conversionTagId: ").append(toIndentedString(conversionTagId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    reportingConversionEvent: ").append(toIndentedString(reportingConversionEvent)).append("\n");
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

