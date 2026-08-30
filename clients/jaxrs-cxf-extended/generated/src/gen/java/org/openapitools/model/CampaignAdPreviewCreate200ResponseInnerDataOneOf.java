package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PinterestLibError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignAdPreviewCreate200ResponseInnerDataOneOf  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private PinterestLibError exceptions;
 /**
  * Get exceptions
  * @return exceptions
  */
  @JsonProperty("exceptions")
  @NotNull
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
 public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
  public CampaignAdPreviewCreate200ResponseInnerDataOneOf exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
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
    CampaignAdPreviewCreate200ResponseInnerDataOneOf campaignAdPreviewCreate200ResponseInnerDataOneOf = (CampaignAdPreviewCreate200ResponseInnerDataOneOf) o;
    return Objects.equals(this.exceptions, campaignAdPreviewCreate200ResponseInnerDataOneOf.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewCreate200ResponseInnerDataOneOf {\n");
    
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

