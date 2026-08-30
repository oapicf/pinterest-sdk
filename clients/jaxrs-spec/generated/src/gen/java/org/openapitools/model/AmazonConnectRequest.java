package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Request containing OTP and Amazon storefront info called by Amazon
 **/
@ApiModel(description = "Request containing OTP and Amazon storefront info called by Amazon")
@JsonTypeName("AmazonConnectRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AmazonConnectRequest   {
  private String amazonStorefrontId;
  private String amazonStorefrontName;
  private String amazonStorefrontUrl;
  private String amazonUserId;
  private Boolean isAmazonAccountLinked;
  private String oneTimePasscode;
  private String pinterestUserId;

  public AmazonConnectRequest() {
  }

  @JsonCreator
  public AmazonConnectRequest(
    @JsonProperty(required = true, value = "amazon_storefront_name") String amazonStorefrontName,
    @JsonProperty(required = true, value = "amazon_storefront_url") String amazonStorefrontUrl,
    @JsonProperty(required = true, value = "is_amazon_account_linked") Boolean isAmazonAccountLinked
  ) {
    this.amazonStorefrontName = amazonStorefrontName;
    this.amazonStorefrontUrl = amazonStorefrontUrl;
    this.isAmazonAccountLinked = isAmazonAccountLinked;
  }

  /**
   * The Amazon storefront id
   **/
  public AmazonConnectRequest amazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
    return this;
  }

  
  @ApiModelProperty(value = "The Amazon storefront id")
  @JsonProperty("amazon_storefront_id")
  public String getAmazonStorefrontId() {
    return amazonStorefrontId;
  }

  @JsonProperty("amazon_storefront_id")
  public void setAmazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
  }

  /**
   * The Amazon storefront name
   **/
  public AmazonConnectRequest amazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Amazon storefront name")
  @JsonProperty(required = true, value = "amazon_storefront_name")
  @NotNull public String getAmazonStorefrontName() {
    return amazonStorefrontName;
  }

  @JsonProperty(required = true, value = "amazon_storefront_name")
  public void setAmazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
  }

  /**
   * The Amazon storefront url
   **/
  public AmazonConnectRequest amazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Amazon storefront url")
  @JsonProperty(required = true, value = "amazon_storefront_url")
  @NotNull public String getAmazonStorefrontUrl() {
    return amazonStorefrontUrl;
  }

  @JsonProperty(required = true, value = "amazon_storefront_url")
  public void setAmazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
  }

  /**
   * The Amazon user id
   **/
  public AmazonConnectRequest amazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
    return this;
  }

  
  @ApiModelProperty(value = "The Amazon user id")
  @JsonProperty("amazon_user_id")
  public String getAmazonUserId() {
    return amazonUserId;
  }

  @JsonProperty("amazon_user_id")
  public void setAmazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
  }

  /**
   * The Amazon account linking status
   **/
  public AmazonConnectRequest isAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Amazon account linking status")
  @JsonProperty(required = true, value = "is_amazon_account_linked")
  @NotNull public Boolean getIsAmazonAccountLinked() {
    return isAmazonAccountLinked;
  }

  @JsonProperty(required = true, value = "is_amazon_account_linked")
  public void setIsAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
  }

  /**
   * The one time passcode for Pinterest-initiated linking requests
   **/
  public AmazonConnectRequest oneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
    return this;
  }

  
  @ApiModelProperty(example = "089aee0d-92d3-4f8f-a947-6dc016d85bf0", value = "The one time passcode for Pinterest-initiated linking requests")
  @JsonProperty("one_time_passcode")
  public String getOneTimePasscode() {
    return oneTimePasscode;
  }

  @JsonProperty("one_time_passcode")
  public void setOneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
  }

  /**
   * The Pinterest user id for Amazon-initiated linking requests
   **/
  public AmazonConnectRequest pinterestUserId(String pinterestUserId) {
    this.pinterestUserId = pinterestUserId;
    return this;
  }

  
  @ApiModelProperty(example = "902057137772013006", value = "The Pinterest user id for Amazon-initiated linking requests")
  @JsonProperty("pinterest_user_id")
   @Pattern(regexp="^\\d+$")public String getPinterestUserId() {
    return pinterestUserId;
  }

  @JsonProperty("pinterest_user_id")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
