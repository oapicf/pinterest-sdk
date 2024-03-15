package apimodels;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionTagCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionTagCreate   {
  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("aem_enabled")
  
  private Boolean aemEnabled = false;

  @JsonProperty("md_frequency")
  @Valid

  private BigDecimal mdFrequency = new BigDecimal("1");

  @JsonProperty("aem_fnln_enabled")
  
  private Boolean aemFnlnEnabled = false;

  @JsonProperty("aem_ph_enabled")
  
  private Boolean aemPhEnabled = false;

  @JsonProperty("aem_ge_enabled")
  
  private Boolean aemGeEnabled = false;

  @JsonProperty("aem_db_enabled")
  
  private Boolean aemDbEnabled = false;

  @JsonProperty("aem_loc_enabled")
  
  private Boolean aemLocEnabled = false;

  public ConversionTagCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Conversion tag name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionTagCreate aemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemEnabled
  **/
  public Boolean getAemEnabled() {
    return aemEnabled;
  }

  public void setAemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  public ConversionTagCreate mdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
    return this;
  }

   /**
   * Metadata ingestion frequency.
   * @return mdFrequency
  **/
  public BigDecimal getMdFrequency() {
    return mdFrequency;
  }

  public void setMdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

  public ConversionTagCreate aemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemFnlnEnabled
  **/
  public Boolean getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }

  public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  public ConversionTagCreate aemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemPhEnabled
  **/
  public Boolean getAemPhEnabled() {
    return aemPhEnabled;
  }

  public void setAemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  public ConversionTagCreate aemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemGeEnabled
  **/
  public Boolean getAemGeEnabled() {
    return aemGeEnabled;
  }

  public void setAemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  public ConversionTagCreate aemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemDbEnabled
  **/
  public Boolean getAemDbEnabled() {
    return aemDbEnabled;
  }

  public void setAemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  public ConversionTagCreate aemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemLocEnabled
  **/
  public Boolean getAemLocEnabled() {
    return aemLocEnabled;
  }

  public void setAemLocEnabled(Boolean aemLocEnabled) {
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
    return Objects.equals(name, conversionTagCreate.name) &&
        Objects.equals(aemEnabled, conversionTagCreate.aemEnabled) &&
        Objects.equals(mdFrequency, conversionTagCreate.mdFrequency) &&
        Objects.equals(aemFnlnEnabled, conversionTagCreate.aemFnlnEnabled) &&
        Objects.equals(aemPhEnabled, conversionTagCreate.aemPhEnabled) &&
        Objects.equals(aemGeEnabled, conversionTagCreate.aemGeEnabled) &&
        Objects.equals(aemDbEnabled, conversionTagCreate.aemDbEnabled) &&
        Objects.equals(aemLocEnabled, conversionTagCreate.aemLocEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, aemEnabled, mdFrequency, aemFnlnEnabled, aemPhEnabled, aemGeEnabled, aemDbEnabled, aemLocEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

