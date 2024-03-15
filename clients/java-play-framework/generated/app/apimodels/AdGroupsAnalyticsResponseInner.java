package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdGroupsAnalyticsResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdGroupsAnalyticsResponseInner extends HashMap<String, Object>  {
  @JsonProperty("AD_GROUP_ID")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String AD_GROUP_ID;

  @JsonProperty("DATE")
  @Valid

  private LocalDate DATE;

  public AdGroupsAnalyticsResponseInner AD_GROUP_ID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
    return this;
  }

   /**
   * The ID of the ad group that this metrics belongs to.
   * @return AD_GROUP_ID
  **/
  public String getADGROUPID() {
    return AD_GROUP_ID;
  }

  public void setADGROUPID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
  }

  public AdGroupsAnalyticsResponseInner DATE(LocalDate DATE) {
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
    AdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner = (AdGroupsAnalyticsResponseInner) o;
    return Objects.equals(AD_GROUP_ID, adGroupsAnalyticsResponseInner.AD_GROUP_ID) &&
        Objects.equals(DATE, adGroupsAnalyticsResponseInner.DATE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_GROUP_ID, DATE, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

