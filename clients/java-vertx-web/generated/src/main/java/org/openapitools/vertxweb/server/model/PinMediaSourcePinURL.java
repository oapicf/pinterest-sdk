package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaSourcePinURL   {
  


  public enum SourceTypeEnum {
    PIN_URL("pin_url");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SourceTypeEnum sourceType;
  private Boolean isAffiliateLink = false;

  public PinMediaSourcePinURL () {

  }

  public PinMediaSourcePinURL (SourceTypeEnum sourceType, Boolean isAffiliateLink) {
    this.sourceType = sourceType;
    this.isAffiliateLink = isAffiliateLink;
  }

    
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

    
  @JsonProperty("is_affiliate_link")
  public Boolean getIsAffiliateLink() {
    return isAffiliateLink;
  }
  public void setIsAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
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
    return Objects.equals(sourceType, pinMediaSourcePinURL.sourceType) &&
        Objects.equals(isAffiliateLink, pinMediaSourcePinURL.isAffiliateLink);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
