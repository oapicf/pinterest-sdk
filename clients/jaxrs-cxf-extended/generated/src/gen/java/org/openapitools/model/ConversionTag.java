package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTag  {
  
 /**
  * Tag code snippet.
  */
  @ApiModelProperty(example = "<script type=text/javascript> [...]", value = "Tag code snippet.")
  private String codeSnippet;

  @ApiModelProperty(value = "")
  @Valid
  private ConversionTagConfigs configs;

 /**
  * The enhanced match status of the tag
  */
  @ApiModelProperty(example = "VALIDATION_COMPLETE", value = "The enhanced match status of the tag")
  @Valid
  private EnhancedMatchStatusType enhancedMatchStatus;

 /**
  * Tag ID.
  */
  @ApiModelProperty(example = "2617998078212", value = "Tag ID.")
  private String id;

 /**
  * Time for the last event fired.
  */
  @ApiModelProperty(example = "1599030000000", value = "Time for the last event fired.")
  @Valid
  private BigDecimal lastFiredTimeMs;

 /**
  * Conversion tag name.
  */
  @ApiModelProperty(example = "download_picture", required = true, value = "Conversion tag name.")
  private String name;

 /**
  * Version number.
  */
  @ApiModelProperty(example = "3", value = "Version number.")
  private String version;

 /**
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Ad account ID.")
  private String adAccountId;

  @ApiModelProperty(value = "")
  @Valid
  private EntityStatus status;
 /**
  * Tag code snippet.
  * @return codeSnippet
  */
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }

  /**
   * Sets the <code>codeSnippet</code> property.
   * <br><em>N.B. <code>codeSnippet</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  /**
   * Sets the <code>codeSnippet</code> property.
   * <br><em>N.B. <code>codeSnippet</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionTag codeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

 /**
  * Get configs
  * @return configs
  */
  @JsonProperty("configs")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }

  /**
   * Sets the <code>configs</code> property.
   * <br><em>N.B. <code>configs</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setConfigs(ConversionTagConfigs configs) {
    this.configs = configs;
  }

  /**
   * Sets the <code>configs</code> property.
   * <br><em>N.B. <code>configs</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionTag configs(ConversionTagConfigs configs) {
    this.configs = configs;
    return this;
  }

 /**
  * The enhanced match status of the tag
  * @return enhancedMatchStatus
  */
  @JsonProperty("enhanced_match_status")
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

  /**
   * Sets the <code>enhancedMatchStatus</code> property.
   * <br><em>N.B. <code>enhancedMatchStatus</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  /**
   * Sets the <code>enhancedMatchStatus</code> property.
   * <br><em>N.B. <code>enhancedMatchStatus</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionTag enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
    return this;
  }

 /**
  * Tag ID.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionTag id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Time for the last event fired.
  * @return lastFiredTimeMs
  */
  @JsonProperty("last_fired_time_ms")
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  /**
   * Sets the <code>lastFiredTimeMs</code> property.
   * <br><em>N.B. <code>lastFiredTimeMs</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  /**
   * Sets the <code>lastFiredTimeMs</code> property.
   * <br><em>N.B. <code>lastFiredTimeMs</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionTag lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
    return this;
  }

 /**
  * Conversion tag name.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ConversionTag name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Version number.
  * @return version
  */
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Sets the <code>version</code> property.
   * <br><em>N.B. <code>version</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Sets the <code>version</code> property.
   * <br><em>N.B. <code>version</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionTag version(String version) {
    this.version = version;
    return this;
  }

 /**
  * Ad account ID.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  @NotNull
  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionTag adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionTag status(EntityStatus status) {
    this.status = status;
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
    ConversionTag conversionTag = (ConversionTag) o;
    return Objects.equals(this.codeSnippet, conversionTag.codeSnippet) &&
        Objects.equals(this.configs, conversionTag.configs) &&
        Objects.equals(this.enhancedMatchStatus, conversionTag.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTag.id) &&
        Objects.equals(this.lastFiredTimeMs, conversionTag.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTag.name) &&
        Objects.equals(this.version, conversionTag.version) &&
        Objects.equals(this.adAccountId, conversionTag.adAccountId) &&
        Objects.equals(this.status, conversionTag.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSnippet, configs, enhancedMatchStatus, id, lastFiredTimeMs, name, version, adAccountId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTag {\n");
    
    sb.append("    codeSnippet: ").append(toIndentedString(codeSnippet)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    enhancedMatchStatus: ").append(toIndentedString(enhancedMatchStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastFiredTimeMs: ").append(toIndentedString(lastFiredTimeMs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

