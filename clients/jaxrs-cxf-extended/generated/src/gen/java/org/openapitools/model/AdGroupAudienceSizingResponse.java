package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupAudienceSizingResponse  {
  
 /**
  * The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  */
  @ApiModelProperty(example = "100000", value = "The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.")
  @Valid
  private BigDecimal audienceSizeLowerBound;

 /**
  * The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  */
  @ApiModelProperty(example = "150000", value = "The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.")
  @Valid
  private BigDecimal audienceSizeUpperBound;
 /**
  * The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  * @return audienceSizeLowerBound
  */
  @JsonProperty("audience_size_lower_bound")
  public BigDecimal getAudienceSizeLowerBound() {
    return audienceSizeLowerBound;
  }

  /**
   * Sets the <code>audienceSizeLowerBound</code> property.
   */
 public void setAudienceSizeLowerBound(BigDecimal audienceSizeLowerBound) {
    this.audienceSizeLowerBound = audienceSizeLowerBound;
  }

  /**
   * Sets the <code>audienceSizeLowerBound</code> property.
   */
  public AdGroupAudienceSizingResponse audienceSizeLowerBound(BigDecimal audienceSizeLowerBound) {
    this.audienceSizeLowerBound = audienceSizeLowerBound;
    return this;
  }

 /**
  * The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  * @return audienceSizeUpperBound
  */
  @JsonProperty("audience_size_upper_bound")
  public BigDecimal getAudienceSizeUpperBound() {
    return audienceSizeUpperBound;
  }

  /**
   * Sets the <code>audienceSizeUpperBound</code> property.
   */
 public void setAudienceSizeUpperBound(BigDecimal audienceSizeUpperBound) {
    this.audienceSizeUpperBound = audienceSizeUpperBound;
  }

  /**
   * Sets the <code>audienceSizeUpperBound</code> property.
   */
  public AdGroupAudienceSizingResponse audienceSizeUpperBound(BigDecimal audienceSizeUpperBound) {
    this.audienceSizeUpperBound = audienceSizeUpperBound;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAudienceSizingResponse adGroupAudienceSizingResponse = (AdGroupAudienceSizingResponse) o;
    return Objects.equals(this.audienceSizeLowerBound, adGroupAudienceSizingResponse.audienceSizeLowerBound) &&
        Objects.equals(this.audienceSizeUpperBound, adGroupAudienceSizingResponse.audienceSizeUpperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceSizeLowerBound, audienceSizeUpperBound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAudienceSizingResponse {\n");
    
    sb.append("    audienceSizeLowerBound: ").append(toIndentedString(audienceSizeLowerBound)).append("\n");
    sb.append("    audienceSizeUpperBound: ").append(toIndentedString(audienceSizeUpperBound)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

