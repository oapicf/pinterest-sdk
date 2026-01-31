/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Request containing OTP and Amazon storefront info called by Amazon
 */

@ApiModel(description = "Request containing OTP and Amazon storefront info called by Amazon")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AmazonConnectRequest   {
  
  private String amazonStorefrontId;
  private String amazonStorefrontName;
  private String amazonStorefrontUrl;
  private String amazonUserId;
  private Boolean isAmazonAccountLinked;
  private String oneTimePasscode;
  private String pinterestUserId;

  /**
   * The Amazon storefront id
   */
  public AmazonConnectRequest amazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
    return this;
  }

  
  @ApiModelProperty(value = "The Amazon storefront id")
  @JsonProperty("amazon_storefront_id")
  public String getAmazonStorefrontId() {
    return amazonStorefrontId;
  }
  public void setAmazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
  }

  /**
   * The Amazon storefront name
   */
  public AmazonConnectRequest amazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Amazon storefront name")
  @JsonProperty("amazon_storefront_name")
  public String getAmazonStorefrontName() {
    return amazonStorefrontName;
  }
  public void setAmazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
  }

  /**
   * The Amazon storefront url
   */
  public AmazonConnectRequest amazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Amazon storefront url")
  @JsonProperty("amazon_storefront_url")
  public String getAmazonStorefrontUrl() {
    return amazonStorefrontUrl;
  }
  public void setAmazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
  }

  /**
   * The Amazon user id
   */
  public AmazonConnectRequest amazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
    return this;
  }

  
  @ApiModelProperty(value = "The Amazon user id")
  @JsonProperty("amazon_user_id")
  public String getAmazonUserId() {
    return amazonUserId;
  }
  public void setAmazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
  }

  /**
   * The Amazon account linking status
   */
  public AmazonConnectRequest isAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Amazon account linking status")
  @JsonProperty("is_amazon_account_linked")
  public Boolean getIsAmazonAccountLinked() {
    return isAmazonAccountLinked;
  }
  public void setIsAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
  }

  /**
   * The one time passcode for Pinterest-initiated linking requests
   */
  public AmazonConnectRequest oneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
    return this;
  }

  
  @ApiModelProperty(example = "089aee0d-92d3-4f8f-a947-6dc016d85bf0", value = "The one time passcode for Pinterest-initiated linking requests")
  @JsonProperty("one_time_passcode")
  public String getOneTimePasscode() {
    return oneTimePasscode;
  }
  public void setOneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
  }

  /**
   * The Pinterest user id for Amazon-initiated linking requests
   */
  public AmazonConnectRequest pinterestUserId(String pinterestUserId) {
    this.pinterestUserId = pinterestUserId;
    return this;
  }

  
  @ApiModelProperty(example = "902057137772013006", value = "The Pinterest user id for Amazon-initiated linking requests")
  @JsonProperty("pinterest_user_id")
  public String getPinterestUserId() {
    return pinterestUserId;
  }
  public void setPinterestUserId(String pinterestUserId) {
    this.pinterestUserId = pinterestUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonConnectRequest amazonConnectRequest = (AmazonConnectRequest) o;
    return Objects.equals(amazonStorefrontId, amazonConnectRequest.amazonStorefrontId) &&
        Objects.equals(amazonStorefrontName, amazonConnectRequest.amazonStorefrontName) &&
        Objects.equals(amazonStorefrontUrl, amazonConnectRequest.amazonStorefrontUrl) &&
        Objects.equals(amazonUserId, amazonConnectRequest.amazonUserId) &&
        Objects.equals(isAmazonAccountLinked, amazonConnectRequest.isAmazonAccountLinked) &&
        Objects.equals(oneTimePasscode, amazonConnectRequest.oneTimePasscode) &&
        Objects.equals(pinterestUserId, amazonConnectRequest.pinterestUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonStorefrontId, amazonStorefrontName, amazonStorefrontUrl, amazonUserId, isAmazonAccountLinked, oneTimePasscode, pinterestUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonConnectRequest {\n");
    
    sb.append("    amazonStorefrontId: ").append(toIndentedString(amazonStorefrontId)).append("\n");
    sb.append("    amazonStorefrontName: ").append(toIndentedString(amazonStorefrontName)).append("\n");
    sb.append("    amazonStorefrontUrl: ").append(toIndentedString(amazonStorefrontUrl)).append("\n");
    sb.append("    amazonUserId: ").append(toIndentedString(amazonUserId)).append("\n");
    sb.append("    isAmazonAccountLinked: ").append(toIndentedString(isAmazonAccountLinked)).append("\n");
    sb.append("    oneTimePasscode: ").append(toIndentedString(oneTimePasscode)).append("\n");
    sb.append("    pinterestUserId: ").append(toIndentedString(pinterestUserId)).append("\n");
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

