package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LeadsExportCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LeadsExportCreateRequest   {
  @JsonProperty("start_date")
  @NotNull
@Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")

  private String startDate;

  @JsonProperty("end_date")
  @NotNull
@Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")

  private String endDate;

  @JsonProperty("ad_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String adId;

  public LeadsExportCreateRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public LeadsExportCreateRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public LeadsExportCreateRequest adId(String adId) {
    this.adId = adId;
    return this;
  }

   /**
   * ID for the ad collecting leads
   * @return adId
  **/
  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsExportCreateRequest leadsExportCreateRequest = (LeadsExportCreateRequest) o;
    return Objects.equals(startDate, leadsExportCreateRequest.startDate) &&
        Objects.equals(endDate, leadsExportCreateRequest.endDate) &&
        Objects.equals(adId, leadsExportCreateRequest.adId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, adId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportCreateRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
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

