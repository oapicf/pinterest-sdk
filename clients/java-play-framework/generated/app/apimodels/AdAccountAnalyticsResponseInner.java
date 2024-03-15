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
 * AdAccountAnalyticsResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdAccountAnalyticsResponseInner extends HashMap<String, Object>  {
  @JsonProperty("AD_ACCOUNT_ID")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String AD_ACCOUNT_ID;

  @JsonProperty("DATE")
  @Valid

  private LocalDate DATE;

  public AdAccountAnalyticsResponseInner AD_ACCOUNT_ID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
    return this;
  }

   /**
   * The ID of the advertiser that this metrics belongs to.
   * @return AD_ACCOUNT_ID
  **/
  public String getADACCOUNTID() {
    return AD_ACCOUNT_ID;
  }

  public void setADACCOUNTID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
  }

  public AdAccountAnalyticsResponseInner DATE(LocalDate DATE) {
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
    AdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner = (AdAccountAnalyticsResponseInner) o;
    return Objects.equals(AD_ACCOUNT_ID, adAccountAnalyticsResponseInner.AD_ACCOUNT_ID) &&
        Objects.equals(DATE, adAccountAnalyticsResponseInner.DATE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ACCOUNT_ID, DATE, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    AD_ACCOUNT_ID: ").append(toIndentedString(AD_ACCOUNT_ID)).append("\n");
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

