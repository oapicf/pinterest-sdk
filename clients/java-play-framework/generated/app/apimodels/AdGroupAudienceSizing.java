package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdGroupAudienceSizing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdGroupAudienceSizing   {
  @JsonProperty("audience_size_lower_bound")
  @Valid

  private BigDecimal audienceSizeLowerBound;

  @JsonProperty("audience_size_upper_bound")
  @Valid

  private BigDecimal audienceSizeUpperBound;

  public AdGroupAudienceSizing audienceSizeLowerBound(BigDecimal audienceSizeLowerBound) {
    this.audienceSizeLowerBound = audienceSizeLowerBound;
    return this;
  }

   /**
   * The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
   * @return audienceSizeLowerBound
  **/
  public BigDecimal getAudienceSizeLowerBound() {
    return audienceSizeLowerBound;
  }

  public void setAudienceSizeLowerBound(BigDecimal audienceSizeLowerBound) {
    this.audienceSizeLowerBound = audienceSizeLowerBound;
  }

  public AdGroupAudienceSizing audienceSizeUpperBound(BigDecimal audienceSizeUpperBound) {
    this.audienceSizeUpperBound = audienceSizeUpperBound;
    return this;
  }

   /**
   * The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
   * @return audienceSizeUpperBound
  **/
  public BigDecimal getAudienceSizeUpperBound() {
    return audienceSizeUpperBound;
  }

  public void setAudienceSizeUpperBound(BigDecimal audienceSizeUpperBound) {
    this.audienceSizeUpperBound = audienceSizeUpperBound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAudienceSizing adGroupAudienceSizing = (AdGroupAudienceSizing) o;
    return Objects.equals(audienceSizeLowerBound, adGroupAudienceSizing.audienceSizeLowerBound) &&
        Objects.equals(audienceSizeUpperBound, adGroupAudienceSizing.audienceSizeUpperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceSizeLowerBound, audienceSizeUpperBound);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAudienceSizing {\n");
    
    sb.append("    audienceSizeLowerBound: ").append(toIndentedString(audienceSizeLowerBound)).append("\n");
    sb.append("    audienceSizeUpperBound: ").append(toIndentedString(audienceSizeUpperBound)).append("\n");
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

