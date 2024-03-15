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
 * AdsAnalyticsResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdsAnalyticsResponseInner extends HashMap<String, Object>  {
  @JsonProperty("AD_ID")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String AD_ID;

  @JsonProperty("DATE")
  @Valid

  private LocalDate DATE;

  public AdsAnalyticsResponseInner AD_ID(String AD_ID) {
    this.AD_ID = AD_ID;
    return this;
  }

   /**
   * The ID of the ad that this metrics belongs to.
   * @return AD_ID
  **/
  public String getADID() {
    return AD_ID;
  }

  public void setADID(String AD_ID) {
    this.AD_ID = AD_ID;
  }

  public AdsAnalyticsResponseInner DATE(LocalDate DATE) {
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
    AdsAnalyticsResponseInner adsAnalyticsResponseInner = (AdsAnalyticsResponseInner) o;
    return Objects.equals(AD_ID, adsAnalyticsResponseInner.AD_ID) &&
        Objects.equals(DATE, adsAnalyticsResponseInner.DATE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ID, DATE, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    AD_ID: ").append(toIndentedString(AD_ID)).append("\n");
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

