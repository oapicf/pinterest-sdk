package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LeadsExportsCreate   {
  @JsonProperty("ad_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String adId;

  @JsonProperty("end_date")
  @NotNull
@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String endDate;

  @JsonProperty("start_date")
  @NotNull
@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String startDate;

  public LeadsExportsCreate adId(String adId) {
    this.adId = adId;
    return this;
  }

   /**
   * ID for the ad collecting leads.
   * @return adId
  **/
  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  public LeadsExportsCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public LeadsExportsCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsExportsCreate leadsExportsCreate = (LeadsExportsCreate) o;
    return Objects.equals(adId, leadsExportsCreate.adId) &&
        Objects.equals(endDate, leadsExportsCreate.endDate) &&
        Objects.equals(startDate, leadsExportsCreate.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, endDate, startDate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportsCreate {\n");
    
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

