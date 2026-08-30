package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request containing OTP and Amazon storefront info called by Amazon
 */
public class AmazonConnectRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The Amazon storefront id
   */
  @JsonProperty("amazon_storefront_id")
  private String amazonStorefrontId;

  /**
   * The Amazon storefront name
   */
  @JsonProperty("amazon_storefront_name")
  private String amazonStorefrontName;

  /**
   * The Amazon storefront url
   */
  @JsonProperty("amazon_storefront_url")
  private String amazonStorefrontUrl;

  /**
   * The Amazon user id
   */
  @JsonProperty("amazon_user_id")
  private String amazonUserId;

  /**
   * The Amazon account linking status
   */
  @JsonProperty("is_amazon_account_linked")
  private Boolean isAmazonAccountLinked;

  /**
   * The one time passcode for Pinterest-initiated linking requests
   */
  @JsonProperty("one_time_passcode")
  private String oneTimePasscode;

  /**
   * The Pinterest user id for Amazon-initiated linking requests
   */
  @JsonProperty("pinterest_user_id")
  private String pinterestUserId;

  /**
   * The Amazon storefront id
   * @return amazonStorefrontId
   */
  public String getAmazonStorefrontId() {
    return amazonStorefrontId;
  }

  public void setAmazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
  }

  /**
   * The Amazon storefront name
   * @return amazonStorefrontName
   */
  public String getAmazonStorefrontName() {
    return amazonStorefrontName;
  }

  public void setAmazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
  }

  /**
   * The Amazon storefront url
   * @return amazonStorefrontUrl
   */
  public String getAmazonStorefrontUrl() {
    return amazonStorefrontUrl;
  }

  public void setAmazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
  }

  /**
   * The Amazon user id
   * @return amazonUserId
   */
  public String getAmazonUserId() {
    return amazonUserId;
  }

  public void setAmazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
  }

  /**
   * The Amazon account linking status
   * @return isAmazonAccountLinked
   */
  public Boolean getIsAmazonAccountLinked() {
    return isAmazonAccountLinked;
  }

  public void setIsAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
  }

  /**
   * The one time passcode for Pinterest-initiated linking requests
   * @return oneTimePasscode
   */
  public String getOneTimePasscode() {
    return oneTimePasscode;
  }

  public void setOneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
  }

  /**
   * The Pinterest user id for Amazon-initiated linking requests
   * @return pinterestUserId
   */
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
