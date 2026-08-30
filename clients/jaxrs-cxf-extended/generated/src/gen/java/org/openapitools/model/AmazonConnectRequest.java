package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request containing OTP and Amazon storefront info called by Amazon
 */
@ApiModel(description="Request containing OTP and Amazon storefront info called by Amazon")

public class AmazonConnectRequest  {
  
 /**
  * The Amazon storefront id
  */
  @ApiModelProperty(value = "The Amazon storefront id")
  private String amazonStorefrontId;

 /**
  * The Amazon storefront name
  */
  @ApiModelProperty(required = true, value = "The Amazon storefront name")
  private String amazonStorefrontName;

 /**
  * The Amazon storefront url
  */
  @ApiModelProperty(required = true, value = "The Amazon storefront url")
  private String amazonStorefrontUrl;

 /**
  * The Amazon user id
  */
  @ApiModelProperty(value = "The Amazon user id")
  private String amazonUserId;

 /**
  * The Amazon account linking status
  */
  @ApiModelProperty(required = true, value = "The Amazon account linking status")
  private Boolean isAmazonAccountLinked;

 /**
  * The one time passcode for Pinterest-initiated linking requests
  */
  @ApiModelProperty(example = "089aee0d-92d3-4f8f-a947-6dc016d85bf0", value = "The one time passcode for Pinterest-initiated linking requests")
  private String oneTimePasscode;

 /**
  * The Pinterest user id for Amazon-initiated linking requests
  */
  @ApiModelProperty(example = "902057137772013006", value = "The Pinterest user id for Amazon-initiated linking requests")
  private String pinterestUserId;
 /**
  * The Amazon storefront id
  * @return amazonStorefrontId
  */
  @JsonProperty("amazon_storefront_id")
  public String getAmazonStorefrontId() {
    return amazonStorefrontId;
  }

  /**
   * Sets the <code>amazonStorefrontId</code> property.
   */
 public void setAmazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
  }

  /**
   * Sets the <code>amazonStorefrontId</code> property.
   */
  public AmazonConnectRequest amazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
    return this;
  }

 /**
  * The Amazon storefront name
  * @return amazonStorefrontName
  */
  @JsonProperty("amazon_storefront_name")
  @NotNull
  public String getAmazonStorefrontName() {
    return amazonStorefrontName;
  }

  /**
   * Sets the <code>amazonStorefrontName</code> property.
   */
 public void setAmazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
  }

  /**
   * Sets the <code>amazonStorefrontName</code> property.
   */
  public AmazonConnectRequest amazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
    return this;
  }

 /**
  * The Amazon storefront url
  * @return amazonStorefrontUrl
  */
  @JsonProperty("amazon_storefront_url")
  @NotNull
  public String getAmazonStorefrontUrl() {
    return amazonStorefrontUrl;
  }

  /**
   * Sets the <code>amazonStorefrontUrl</code> property.
   */
 public void setAmazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
  }

  /**
   * Sets the <code>amazonStorefrontUrl</code> property.
   */
  public AmazonConnectRequest amazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
    return this;
  }

 /**
  * The Amazon user id
  * @return amazonUserId
  */
  @JsonProperty("amazon_user_id")
  public String getAmazonUserId() {
    return amazonUserId;
  }

  /**
   * Sets the <code>amazonUserId</code> property.
   */
 public void setAmazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
  }

  /**
   * Sets the <code>amazonUserId</code> property.
   */
  public AmazonConnectRequest amazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
    return this;
  }

 /**
  * The Amazon account linking status
  * @return isAmazonAccountLinked
  */
  @JsonProperty("is_amazon_account_linked")
  @NotNull
  public Boolean getIsAmazonAccountLinked() {
    return isAmazonAccountLinked;
  }

  /**
   * Sets the <code>isAmazonAccountLinked</code> property.
   */
 public void setIsAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
  }

  /**
   * Sets the <code>isAmazonAccountLinked</code> property.
   */
  public AmazonConnectRequest isAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
    return this;
  }

 /**
  * The one time passcode for Pinterest-initiated linking requests
  * @return oneTimePasscode
  */
  @JsonProperty("one_time_passcode")
  public String getOneTimePasscode() {
    return oneTimePasscode;
  }

  /**
   * Sets the <code>oneTimePasscode</code> property.
   */
 public void setOneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
  }

  /**
   * Sets the <code>oneTimePasscode</code> property.
   */
  public AmazonConnectRequest oneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
    return this;
  }

 /**
  * The Pinterest user id for Amazon-initiated linking requests
  * @return pinterestUserId
  */
  @JsonProperty("pinterest_user_id")
 @Pattern(regexp="^\\d+$")  public String getPinterestUserId() {
    return pinterestUserId;
  }

  /**
   * Sets the <code>pinterestUserId</code> property.
   */
 public void setPinterestUserId(String pinterestUserId) {
    this.pinterestUserId = pinterestUserId;
  }

  /**
   * Sets the <code>pinterestUserId</code> property.
   */
  public AmazonConnectRequest pinterestUserId(String pinterestUserId) {
    this.pinterestUserId = pinterestUserId;
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
    AmazonConnectRequest amazonConnectRequest = (AmazonConnectRequest) o;
    return Objects.equals(this.amazonStorefrontId, amazonConnectRequest.amazonStorefrontId) &&
        Objects.equals(this.amazonStorefrontName, amazonConnectRequest.amazonStorefrontName) &&
        Objects.equals(this.amazonStorefrontUrl, amazonConnectRequest.amazonStorefrontUrl) &&
        Objects.equals(this.amazonUserId, amazonConnectRequest.amazonUserId) &&
        Objects.equals(this.isAmazonAccountLinked, amazonConnectRequest.isAmazonAccountLinked) &&
        Objects.equals(this.oneTimePasscode, amazonConnectRequest.oneTimePasscode) &&
        Objects.equals(this.pinterestUserId, amazonConnectRequest.pinterestUserId);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

