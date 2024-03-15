package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 */
@ApiModel(description="Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.")

public class PinMediaSourcePinURL  {
  
public enum SourceTypeEnum {

    @JsonProperty("pin_url") PIN_URL(String.valueOf("pin_url"));

    private String value;

    SourceTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String value) {
        for (SourceTypeEnum b : SourceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private SourceTypeEnum sourceType;

 /**
  * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  */
  @ApiModelProperty(value = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")
  private Boolean isAffiliateLink = false;
 /**
  * Get sourceType
  * @return sourceType
  */
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    return sourceType == null ? null : sourceType.value();
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
 public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
  public PinMediaSourcePinURL sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
  * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  * @return isAffiliateLink
  */
  @JsonProperty("is_affiliate_link")
  public Boolean getIsAffiliateLink() {
    return isAffiliateLink;
  }

  /**
   * Sets the <code>isAffiliateLink</code> property.
   */
 public void setIsAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
  }

  /**
   * Sets the <code>isAffiliateLink</code> property.
   */
  public PinMediaSourcePinURL isAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
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
    PinMediaSourcePinURL pinMediaSourcePinURL = (PinMediaSourcePinURL) o;
    return Objects.equals(this.sourceType, pinMediaSourcePinURL.sourceType) &&
        Objects.equals(this.isAffiliateLink, pinMediaSourcePinURL.isAffiliateLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, isAffiliateLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourcePinURL {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    isAffiliateLink: ").append(toIndentedString(isAffiliateLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

