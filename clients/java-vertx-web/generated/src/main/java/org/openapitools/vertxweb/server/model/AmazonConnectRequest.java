package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request containing OTP and Amazon storefront info called by Amazon
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmazonConnectRequest   {
  
  private String amazonStorefrontId;
  private String amazonStorefrontName;
  private String amazonStorefrontUrl;
  private String amazonUserId;
  private Boolean isAmazonAccountLinked;
  private String oneTimePasscode;
  private String pinterestUserId;

  public AmazonConnectRequest () {

  }

  public AmazonConnectRequest (String amazonStorefrontId, String amazonStorefrontName, String amazonStorefrontUrl, String amazonUserId, Boolean isAmazonAccountLinked, String oneTimePasscode, String pinterestUserId) {
    this.amazonStorefrontId = amazonStorefrontId;
    this.amazonStorefrontName = amazonStorefrontName;
    this.amazonStorefrontUrl = amazonStorefrontUrl;
    this.amazonUserId = amazonUserId;
    this.isAmazonAccountLinked = isAmazonAccountLinked;
    this.oneTimePasscode = oneTimePasscode;
    this.pinterestUserId = pinterestUserId;
  }

    
  @JsonProperty("amazon_storefront_id")
  public String getAmazonStorefrontId() {
    return amazonStorefrontId;
  }
  public void setAmazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
  }

    
  @JsonProperty("amazon_storefront_name")
  public String getAmazonStorefrontName() {
    return amazonStorefrontName;
  }
  public void setAmazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
  }

    
  @JsonProperty("amazon_storefront_url")
  public String getAmazonStorefrontUrl() {
    return amazonStorefrontUrl;
  }
  public void setAmazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
  }

    
  @JsonProperty("amazon_user_id")
  public String getAmazonUserId() {
    return amazonUserId;
  }
  public void setAmazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
  }

    
  @JsonProperty("is_amazon_account_linked")
  public Boolean getIsAmazonAccountLinked() {
    return isAmazonAccountLinked;
  }
  public void setIsAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
  }

    
  @JsonProperty("one_time_passcode")
  public String getOneTimePasscode() {
    return oneTimePasscode;
  }
  public void setOneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
  }

    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
