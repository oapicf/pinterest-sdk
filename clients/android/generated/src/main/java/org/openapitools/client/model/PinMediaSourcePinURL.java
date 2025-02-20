/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 **/
@ApiModel(description = "Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.")
public class PinMediaSourcePinURL {
  
  public enum SourceTypeEnum {
     pin_url, 
  };
  @SerializedName("source_type")
  private SourceTypeEnum sourceType = null;
  @SerializedName("is_affiliate_link")
  private Boolean isAffiliateLink = false;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   **/
  @ApiModelProperty(value = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")
  public Boolean getIsAffiliateLink() {
    return isAffiliateLink;
  }
  public void setIsAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourcePinURL pinMediaSourcePinURL = (PinMediaSourcePinURL) o;
    return (this.sourceType == null ? pinMediaSourcePinURL.sourceType == null : this.sourceType.equals(pinMediaSourcePinURL.sourceType)) &&
        (this.isAffiliateLink == null ? pinMediaSourcePinURL.isAffiliateLink == null : this.isAffiliateLink.equals(pinMediaSourcePinURL.isAffiliateLink));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sourceType == null ? 0: this.sourceType.hashCode());
    result = 31 * result + (this.isAffiliateLink == null ? 0: this.isAffiliateLink.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourcePinURL {\n");
    
    sb.append("  sourceType: ").append(sourceType).append("\n");
    sb.append("  isAffiliateLink: ").append(isAffiliateLink).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
