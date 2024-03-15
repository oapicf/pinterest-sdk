package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionTagCreate   {
  
  private String name;
  private Boolean aemEnabled = false;
  private BigDecimal mdFrequency = new BigDecimal("1");
  private Boolean aemFnlnEnabled = false;
  private Boolean aemPhEnabled = false;
  private Boolean aemGeEnabled = false;
  private Boolean aemDbEnabled = false;
  private Boolean aemLocEnabled = false;

  public ConversionTagCreate () {

  }

  public ConversionTagCreate (String name, Boolean aemEnabled, BigDecimal mdFrequency, Boolean aemFnlnEnabled, Boolean aemPhEnabled, Boolean aemGeEnabled, Boolean aemDbEnabled, Boolean aemLocEnabled) {
    this.name = name;
    this.aemEnabled = aemEnabled;
    this.mdFrequency = mdFrequency;
    this.aemFnlnEnabled = aemFnlnEnabled;
    this.aemPhEnabled = aemPhEnabled;
    this.aemGeEnabled = aemGeEnabled;
    this.aemDbEnabled = aemDbEnabled;
    this.aemLocEnabled = aemLocEnabled;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("aem_enabled")
  public Boolean getAemEnabled() {
    return aemEnabled;
  }
  public void setAemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

    
  @JsonProperty("md_frequency")
  public BigDecimal getMdFrequency() {
    return mdFrequency;
  }
  public void setMdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

    
  @JsonProperty("aem_fnln_enabled")
  public Boolean getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }
  public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

    
  @JsonProperty("aem_ph_enabled")
  public Boolean getAemPhEnabled() {
    return aemPhEnabled;
  }
  public void setAemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

    
  @JsonProperty("aem_ge_enabled")
  public Boolean getAemGeEnabled() {
    return aemGeEnabled;
  }
  public void setAemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

    
  @JsonProperty("aem_db_enabled")
  public Boolean getAemDbEnabled() {
    return aemDbEnabled;
  }
  public void setAemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

    
  @JsonProperty("aem_loc_enabled")
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
