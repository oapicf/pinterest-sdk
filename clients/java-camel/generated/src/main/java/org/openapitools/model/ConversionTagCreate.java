package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConversionTagCreate
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionTagCreate {

  private String name;

  private JsonNullable<Boolean> aemEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<BigDecimal> mdFrequency = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<Boolean> aemFnlnEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> aemPhEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> aemGeEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> aemDbEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> aemLocEnabled = JsonNullable.<Boolean>undefined();

  public ConversionTagCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionTagCreate(String name) {
    this.name = name;
  }

  public ConversionTagCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Conversion tag name.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "ACME Tools Tag", description = "Conversion tag name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionTagCreate aemEnabled(Boolean aemEnabled) {
    this.aemEnabled = JsonNullable.of(aemEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemEnabled
  */
  
  @Schema(name = "aem_enabled", example = "true", description = "Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_enabled")
  public JsonNullable<Boolean> getAemEnabled() {
    return aemEnabled;
  }

  public void setAemEnabled(JsonNullable<Boolean> aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  public ConversionTagCreate mdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = JsonNullable.of(mdFrequency);
    return this;
  }

  /**
   * Metadata ingestion frequency.
   * @return mdFrequency
  */
  @Valid 
  @Schema(name = "md_frequency", example = "0.6", description = "Metadata ingestion frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("md_frequency")
  public JsonNullable<BigDecimal> getMdFrequency() {
    return mdFrequency;
  }

  public void setMdFrequency(JsonNullable<BigDecimal> mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

  public ConversionTagCreate aemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = JsonNullable.of(aemFnlnEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemFnlnEnabled
  */
  
  @Schema(name = "aem_fnln_enabled", example = "true", description = "Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_fnln_enabled")
  public JsonNullable<Boolean> getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }

  public void setAemFnlnEnabled(JsonNullable<Boolean> aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  public ConversionTagCreate aemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = JsonNullable.of(aemPhEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemPhEnabled
  */
  
  @Schema(name = "aem_ph_enabled", example = "true", description = "Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_ph_enabled")
  public JsonNullable<Boolean> getAemPhEnabled() {
    return aemPhEnabled;
  }

  public void setAemPhEnabled(JsonNullable<Boolean> aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  public ConversionTagCreate aemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = JsonNullable.of(aemGeEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemGeEnabled
  */
  
  @Schema(name = "aem_ge_enabled", example = "true", description = "Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_ge_enabled")
  public JsonNullable<Boolean> getAemGeEnabled() {
    return aemGeEnabled;
  }

  public void setAemGeEnabled(JsonNullable<Boolean> aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  public ConversionTagCreate aemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = JsonNullable.of(aemDbEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemDbEnabled
  */
  
  @Schema(name = "aem_db_enabled", example = "true", description = "Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_db_enabled")
  public JsonNullable<Boolean> getAemDbEnabled() {
    return aemDbEnabled;
  }

  public void setAemDbEnabled(JsonNullable<Boolean> aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  public ConversionTagCreate aemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = JsonNullable.of(aemLocEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemLocEnabled
  */
  
  @Schema(name = "aem_loc_enabled", example = "true", description = "Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_loc_enabled")
  public JsonNullable<Boolean> getAemLocEnabled() {
    return aemLocEnabled;
  }

  public void setAemLocEnabled(JsonNullable<Boolean> aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTagCreate conversionTagCreate = (ConversionTagCreate) o;
    return Objects.equals(this.name, conversionTagCreate.name) &&
        equalsNullable(this.aemEnabled, conversionTagCreate.aemEnabled) &&
        equalsNullable(this.mdFrequency, conversionTagCreate.mdFrequency) &&
        equalsNullable(this.aemFnlnEnabled, conversionTagCreate.aemFnlnEnabled) &&
        equalsNullable(this.aemPhEnabled, conversionTagCreate.aemPhEnabled) &&
        equalsNullable(this.aemGeEnabled, conversionTagCreate.aemGeEnabled) &&
        equalsNullable(this.aemDbEnabled, conversionTagCreate.aemDbEnabled) &&
        equalsNullable(this.aemLocEnabled, conversionTagCreate.aemLocEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hashCodeNullable(aemEnabled), hashCodeNullable(mdFrequency), hashCodeNullable(aemFnlnEnabled), hashCodeNullable(aemPhEnabled), hashCodeNullable(aemGeEnabled), hashCodeNullable(aemDbEnabled), hashCodeNullable(aemLocEnabled));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    aemEnabled: ").append(toIndentedString(aemEnabled)).append("\n");
    sb.append("    mdFrequency: ").append(toIndentedString(mdFrequency)).append("\n");
    sb.append("    aemFnlnEnabled: ").append(toIndentedString(aemFnlnEnabled)).append("\n");
    sb.append("    aemPhEnabled: ").append(toIndentedString(aemPhEnabled)).append("\n");
    sb.append("    aemGeEnabled: ").append(toIndentedString(aemGeEnabled)).append("\n");
    sb.append("    aemDbEnabled: ").append(toIndentedString(aemDbEnabled)).append("\n");
    sb.append("    aemLocEnabled: ").append(toIndentedString(aemLocEnabled)).append("\n");
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

