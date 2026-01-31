package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PromotionResponse   {
  /**
   * Discount status based on the current time and start and end time of discount
   */
  public enum DiscountStatusEnum {
    OTHER("OTHER"),
    
    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    SCHEDULED("SCHEDULED"),
    
    EXPIRED("EXPIRED");

    private String value;

    DiscountStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiscountStatusEnum fromValue(String text) {
      for (DiscountStatusEnum b : DiscountStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("discount_status")
  private DiscountStatusEnum discountStatus;

  @JsonProperty("end_time")
  private Integer endTime;

  @JsonProperty("external_id")
  private String externalId;

  @JsonProperty("platform_type")
  private String platformType;

  @JsonProperty("promotion_code")
  private String promotionCode;

  @JsonProperty("promotion_custom_id")
  private String promotionCustomId;

  @JsonProperty("promotion_title")
  private String promotionTitle;

  @JsonProperty("promotion_type")
  private PromotionType promotionType;

  @JsonProperty("start_time")
  private Integer startTime;

  @JsonProperty("template_values")
  private List<PromotionTemplateValue> templateValues = null;

  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("status")
  private EntityStatus status;

  /**
   * Discount status based on the current time and start and end time of discount
   **/
  public PromotionResponse discountStatus(DiscountStatusEnum discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

  
  @ApiModelProperty(example = "ACTIVE", value = "Discount status based on the current time and start and end time of discount")
  @JsonProperty("discount_status")
  public DiscountStatusEnum getDiscountStatus() {
    return discountStatus;
  }
  public void setDiscountStatus(DiscountStatusEnum discountStatus) {
    this.discountStatus = discountStatus;
  }

  /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   **/
  public PromotionResponse endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "1678003860", value = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   **/
  public PromotionResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(example = "abc", value = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
   **/
  public PromotionResponse platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

  
  @ApiModelProperty(example = "DEFAULT", value = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")
  @JsonProperty("platform_type")
  public String getPlatformType() {
    return platformType;
  }
  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  /**
   * Code that can be used to redeem a promotion.
   **/
  public PromotionResponse promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

  
  @ApiModelProperty(example = "blackfriday10", value = "Code that can be used to redeem a promotion.")
  @JsonProperty("promotion_code")
  public String getPromotionCode() {
    return promotionCode;
  }
  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

  /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   **/
  public PromotionResponse promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

  
  @ApiModelProperty(example = "freeshipping_2025", value = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")
  @JsonProperty("promotion_custom_id")
  public String getPromotionCustomId() {
    return promotionCustomId;
  }
  public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

  /**
   * Internal name for the promotion.
   **/
  public PromotionResponse promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

  
  @ApiModelProperty(example = "Black Friday 10% off", value = "Internal name for the promotion.")
  @JsonProperty("promotion_title")
  public String getPromotionTitle() {
    return promotionTitle;
  }
  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  /**
   **/
  public PromotionResponse promotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("promotion_type")
  public PromotionType getPromotionType() {
    return promotionType;
  }
  public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }

  /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   **/
  public PromotionResponse startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "1677003860", value = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * List of values to be inserted in the promotion type-specific template.
   **/
  public PromotionResponse templateValues(List<PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")
  @JsonProperty("template_values")
  public List<PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }
  public void setTemplateValues(List<PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
  }

  /**
   * The Ad Account ID that this promotion belongs to.
   **/
  public PromotionResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "The Ad Account ID that this promotion belongs to.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Promotion ID
   **/
  public PromotionResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "7834020347906", value = "Promotion ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public PromotionResponse status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionResponse promotionResponse = (PromotionResponse) o;
    return Objects.equals(discountStatus, promotionResponse.discountStatus) &&
        Objects.equals(endTime, promotionResponse.endTime) &&
        Objects.equals(externalId, promotionResponse.externalId) &&
        Objects.equals(platformType, promotionResponse.platformType) &&
        Objects.equals(promotionCode, promotionResponse.promotionCode) &&
        Objects.equals(promotionCustomId, promotionResponse.promotionCustomId) &&
        Objects.equals(promotionTitle, promotionResponse.promotionTitle) &&
        Objects.equals(promotionType, promotionResponse.promotionType) &&
        Objects.equals(startTime, promotionResponse.startTime) &&
        Objects.equals(templateValues, promotionResponse.templateValues) &&
        Objects.equals(adAccountId, promotionResponse.adAccountId) &&
        Objects.equals(id, promotionResponse.id) &&
        Objects.equals(status, promotionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues, adAccountId, id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionResponse {\n");
    
    sb.append("    discountStatus: ").append(toIndentedString(discountStatus)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    promotionCode: ").append(toIndentedString(promotionCode)).append("\n");
    sb.append("    promotionCustomId: ").append(toIndentedString(promotionCustomId)).append("\n");
    sb.append("    promotionTitle: ").append(toIndentedString(promotionTitle)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    templateValues: ").append(toIndentedString(templateValues)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

