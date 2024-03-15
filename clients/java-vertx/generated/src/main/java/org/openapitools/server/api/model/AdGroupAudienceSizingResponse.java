package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupAudienceSizingResponse   {
  
  private BigDecimal audienceSizeLowerBound;
  private BigDecimal audienceSizeUpperBound;

  public AdGroupAudienceSizingResponse () {

  }

  public AdGroupAudienceSizingResponse (BigDecimal audienceSizeLowerBound, BigDecimal audienceSizeUpperBound) {
    this.audienceSizeLowerBound = audienceSizeLowerBound;
    this.audienceSizeUpperBound = audienceSizeUpperBound;
  }

    
  @JsonProperty("audience_size_lower_bound")
  public BigDecimal getAudienceSizeLowerBound() {
    return audienceSizeLowerBound;
  }
  public void setAudienceSizeLowerBound(BigDecimal audienceSizeLowerBound) {
    this.audienceSizeLowerBound = audienceSizeLowerBound;
  }

    
  @JsonProperty("audience_size_upper_bound")
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
    AdGroupAudienceSizingResponse adGroupAudienceSizingResponse = (AdGroupAudienceSizingResponse) o;
    return Objects.equals(audienceSizeLowerBound, adGroupAudienceSizingResponse.audienceSizeLowerBound) &&
        Objects.equals(audienceSizeUpperBound, adGroupAudienceSizingResponse.audienceSizeUpperBound);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
