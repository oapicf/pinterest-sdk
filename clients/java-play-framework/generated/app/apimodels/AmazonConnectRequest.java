package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Request containing OTP and Amazon storefront info called by Amazon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AmazonConnectRequest   {
  @JsonProperty("amazon_storefront_id")
  
  private String amazonStorefrontId;

  @JsonProperty("amazon_storefront_name")
  @NotNull

  private String amazonStorefrontName;

  @JsonProperty("amazon_storefront_url")
  @NotNull

  private String amazonStorefrontUrl;

  @JsonProperty("amazon_user_id")
  
  private String amazonUserId;

  @JsonProperty("is_amazon_account_linked")
  @NotNull

  private Boolean isAmazonAccountLinked;

  @JsonProperty("one_time_passcode")
  
  private String oneTimePasscode;

  @JsonProperty("pinterest_user_id")
  @Pattern(regexp="^\\d+$")

  private String pinterestUserId;

  public AmazonConnectRequest amazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
    return this;
  }

   /**
   * The Amazon storefront id
   * @return amazonStorefrontId
  **/
  public String getAmazonStorefrontId() {
    return amazonStorefrontId;
  }

  public void setAmazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
  }

  public AmazonConnectRequest amazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
    return this;
  }

   /**
   * The Amazon storefront name
   * @return amazonStorefrontName
  **/
  public String getAmazonStorefrontName() {
    return amazonStorefrontName;
  }

  public void setAmazonStorefrontName(String amazonStorefrontName) {
    this.amazonStorefrontName = amazonStorefrontName;
  }

  public AmazonConnectRequest amazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
    return this;
  }

   /**
   * The Amazon storefront url
   * @return amazonStorefrontUrl
  **/
  public String getAmazonStorefrontUrl() {
    return amazonStorefrontUrl;
  }

  public void setAmazonStorefrontUrl(String amazonStorefrontUrl) {
    this.amazonStorefrontUrl = amazonStorefrontUrl;
  }

  public AmazonConnectRequest amazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
    return this;
  }

   /**
   * The Amazon user id
   * @return amazonUserId
  **/
  public String getAmazonUserId() {
    return amazonUserId;
  }

  public void setAmazonUserId(String amazonUserId) {
    this.amazonUserId = amazonUserId;
  }

  public AmazonConnectRequest isAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
    return this;
  }

   /**
   * The Amazon account linking status
   * @return isAmazonAccountLinked
  **/
  public Boolean getIsAmazonAccountLinked() {
    return isAmazonAccountLinked;
  }

  public void setIsAmazonAccountLinked(Boolean isAmazonAccountLinked) {
    this.isAmazonAccountLinked = isAmazonAccountLinked;
  }

  public AmazonConnectRequest oneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
    return this;
  }

   /**
   * The one time passcode for Pinterest-initiated linking requests
   * @return oneTimePasscode
  **/
  public String getOneTimePasscode() {
    return oneTimePasscode;
  }

  public void setOneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
  }

  public AmazonConnectRequest pinterestUserId(String pinterestUserId) {
    this.pinterestUserId = pinterestUserId;
    return this;
  }

   /**
   * The Pinterest user id for Amazon-initiated linking requests
   * @return pinterestUserId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

