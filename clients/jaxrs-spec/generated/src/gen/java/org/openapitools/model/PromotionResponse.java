package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PromotionResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PromotionResponse   {
  public enum DiscountStatusEnum {

    OTHER(String.valueOf("OTHER")), ACTIVE(String.valueOf("ACTIVE")), PAUSED(String.valueOf("PAUSED")), SCHEDULED(String.valueOf("SCHEDULED")), EXPIRED(String.valueOf("EXPIRED"));


    private String value;

    DiscountStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static DiscountStatusEnum fromString(String s) {
        for (DiscountStatusEnum b : DiscountStatusEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static DiscountStatusEnum fromValue(String value) {
        for (DiscountStatusEnum b : DiscountStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private DiscountStatusEnum discountStatus;
  private Integer endTime;
  private String externalId;
  private String platformType;
  private String promotionCode;
  private String promotionCustomId;
  private String promotionTitle;
  private PromotionType promotionType;
  private Integer startTime;
  private @Valid List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();
  private String adAccountId;
  private String id;
  private EntityStatus status;

  public PromotionResponse() {
  }

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

  @JsonProperty("discount_status")
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

  @JsonProperty("end_time")
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
   @Size(max=64)public String getExternalId() {
    return externalId;
  }

  @JsonProperty("external_id")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
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

  @JsonProperty("platform_type")
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

  @JsonProperty("promotion_code")
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
   @Size(max=50)public String getPromotionCustomId() {
    return promotionCustomId;
  }

  @JsonProperty("promotion_custom_id")
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

  @JsonProperty("promotion_title")
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

  @JsonProperty("promotion_type")
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

  @JsonProperty("start_time")
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * List of values to be inserted in the promotion type-specific template.
   **/
  public PromotionResponse templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")
  @JsonProperty("template_values")
  @Valid  @Size(min=0,max=2)public List<@Valid PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }

  @JsonProperty("template_values")
  public void setTemplateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
  }

  public PromotionResponse addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    if (this.templateValues == null) {
      this.templateValues = new ArrayList<>();
    }

    this.templateValues.add(templateValuesItem);
    return this;
  }

  public PromotionResponse removeTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    if (templateValuesItem != null && this.templateValues != null) {
      this.templateValues.remove(templateValuesItem);
    }

    return this;
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
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
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
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
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

  @JsonProperty("status")
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
    return Objects.equals(this.discountStatus, promotionResponse.discountStatus) &&
        Objects.equals(this.endTime, promotionResponse.endTime) &&
        Objects.equals(this.externalId, promotionResponse.externalId) &&
        Objects.equals(this.platformType, promotionResponse.platformType) &&
        Objects.equals(this.promotionCode, promotionResponse.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotionResponse.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotionResponse.promotionTitle) &&
        Objects.equals(this.promotionType, promotionResponse.promotionType) &&
        Objects.equals(this.startTime, promotionResponse.startTime) &&
        Objects.equals(this.templateValues, promotionResponse.templateValues) &&
        Objects.equals(this.adAccountId, promotionResponse.adAccountId) &&
        Objects.equals(this.id, promotionResponse.id) &&
        Objects.equals(this.status, promotionResponse.status);
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

