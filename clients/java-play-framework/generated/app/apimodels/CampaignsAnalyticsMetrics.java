package apimodels;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CampaignsAnalyticsMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignsAnalyticsMetrics   {
  @JsonProperty("CAMPAIGN_ID")
  @Pattern(regexp="^\\d+$")

  private String CAMPAIGN_ID;

  @JsonProperty("DATE")
  @Valid

  private LocalDate DATE;

  public CampaignsAnalyticsMetrics CAMPAIGN_ID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
    return this;
  }

   /**
   * The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   * @return CAMPAIGN_ID
  **/
  public String getCAMPAIGNID() {
    return CAMPAIGN_ID;
  }

  public void setCAMPAIGNID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
  }

  public CampaignsAnalyticsMetrics DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

   /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
  **/
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsAnalyticsMetrics campaignsAnalyticsMetrics = (CampaignsAnalyticsMetrics) o;
    return Objects.equals(CAMPAIGN_ID, campaignsAnalyticsMetrics.CAMPAIGN_ID) &&
        Objects.equals(DATE, campaignsAnalyticsMetrics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CAMPAIGN_ID, DATE);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsAnalyticsMetrics {\n");
    
    sb.append("    CAMPAIGN_ID: ").append(toIndentedString(CAMPAIGN_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

