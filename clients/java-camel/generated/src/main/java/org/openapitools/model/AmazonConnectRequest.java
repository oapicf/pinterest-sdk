package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request containing OTP and Amazon storefront info called by Amazon
 */

@Schema(name = "AmazonConnectRequest", description = "Request containing OTP and Amazon storefront info called by Amazon")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AmazonConnectRequest {

  private String amazonStorefrontId;

  private String amazonStorefrontName;

  private String amazonStorefrontUrl;

  private String amazonUserId;

  private Boolean isAmazonAccountLinked;

  private String oneTimePasscode;

  private String pinterestUserId;

  public AmazonConnectRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AmazonConnectRequest(String amazonStorefrontName, String amazonStorefrontUrl, Boolean isAmazonAccountLinked) {
    this.amazonStorefrontName = amazonStorefrontName;
    this.amazonStorefrontUrl = amazonStorefrontUrl;
    this.isAmazonAccountLinked = isAmazonAccountLinked;
  }

  public AmazonConnectRequest amazonStorefrontId(String amazonStorefrontId) {
    this.amazonStorefrontId = amazonStorefrontId;
    return this;
  }

  /**
   * The Amazon storefront id
   * @return amazonStorefrontId
   */
  
  @Schema(name = "amazon_storefront_id", description = "The Amazon storefront id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amazon_storefront_id")
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
   */
  @NotNull 
  @Schema(name = "amazon_storefront_name", description = "The Amazon storefront name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amazon_storefront_name")
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
   */
  @NotNull 
  @Schema(name = "amazon_storefront_url", description = "The Amazon storefront url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amazon_storefront_url")
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
   */
  
  @Schema(name = "amazon_user_id", description = "The Amazon user id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amazon_user_id")
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
   */
  @NotNull 
  @Schema(name = "is_amazon_account_linked", description = "The Amazon account linking status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_amazon_account_linked")
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
   */
  
  @Schema(name = "one_time_passcode", example = "089aee0d-92d3-4f8f-a947-6dc016d85bf0", description = "The one time passcode for Pinterest-initiated linking requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("one_time_passcode")
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
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "pinterest_user_id", example = "902057137772013006", description = "The Pinterest user id for Amazon-initiated linking requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

