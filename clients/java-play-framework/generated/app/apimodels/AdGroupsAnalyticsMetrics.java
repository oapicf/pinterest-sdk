package apimodels;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdGroupsAnalyticsMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdGroupsAnalyticsMetrics   {
  @JsonProperty("AD_GROUP_ID")
  @Pattern(regexp="^\\d+$")

  private String AD_GROUP_ID;

  @JsonProperty("DATE")
  @Valid

  private LocalDate DATE;

  public AdGroupsAnalyticsMetrics AD_GROUP_ID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
    return this;
  }

   /**
   * The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   * @return AD_GROUP_ID
  **/
  public String getADGROUPID() {
    return AD_GROUP_ID;
  }

  public void setADGROUPID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
  }

  public AdGroupsAnalyticsMetrics DATE(LocalDate DATE) {
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
    AdGroupsAnalyticsMetrics adGroupsAnalyticsMetrics = (AdGroupsAnalyticsMetrics) o;
    return Objects.equals(AD_GROUP_ID, adGroupsAnalyticsMetrics.AD_GROUP_ID) &&
        Objects.equals(DATE, adGroupsAnalyticsMetrics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_GROUP_ID, DATE);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsAnalyticsMetrics {\n");
    
    sb.append("    AD_GROUP_ID: ").append(toIndentedString(AD_GROUP_ID)).append("\n");
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

