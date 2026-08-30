package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleAudienceMultipliers extends HashMap<String, Double>  {
  
  private String AUDIENCE_ID;

  public ScheduleAudienceMultipliers () {

  }

  public ScheduleAudienceMultipliers (String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
  }

    
  @JsonProperty("AUDIENCE_ID")
  public String getAUDIENCEID() {
    return AUDIENCE_ID;
  }
  public void setAUDIENCEID(String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleAudienceMultipliers scheduleAudienceMultipliers = (ScheduleAudienceMultipliers) o;
    return super.equals(o) && Objects.equals(AUDIENCE_ID, scheduleAudienceMultipliers.AUDIENCE_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), AUDIENCE_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAudienceMultipliers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    AUDIENCE_ID: ").append(toIndentedString(AUDIENCE_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
