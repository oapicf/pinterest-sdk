package apimodels;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdPinAnalytics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdPinAnalytics   {
  @JsonProperty("DATE")
  @Valid

  private LocalDate DATE;

  @JsonProperty("PIN_ID")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String PIN_ID;

  public AdPinAnalytics DATE(LocalDate DATE) {
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

  public AdPinAnalytics PIN_ID(String PIN_ID) {
    this.PIN_ID = PIN_ID;
    return this;
  }

   /**
   * The ID of the pin that the metric belongs to.
   * @return PIN_ID
  **/
  public String getPINID() {
    return PIN_ID;
  }

  public void setPINID(String PIN_ID) {
    this.PIN_ID = PIN_ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdPinAnalytics adPinAnalytics = (AdPinAnalytics) o;
    return Objects.equals(DATE, adPinAnalytics.DATE) &&
        Objects.equals(PIN_ID, adPinAnalytics.PIN_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE, PIN_ID);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPinAnalytics {\n");
    
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("    PIN_ID: ").append(toIndentedString(PIN_ID)).append("\n");
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

