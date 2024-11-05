package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import org.openapitools.model.CreativeAssetsIdFilter;
import org.openapitools.model.CustomLabel0Filter;
import org.openapitools.model.CustomLabel1Filter;
import org.openapitools.model.CustomLabel2Filter;
import org.openapitools.model.CustomLabel3Filter;
import org.openapitools.model.CustomLabel4Filter;
import org.openapitools.model.GoogleProductCategory0Filter;
import org.openapitools.model.GoogleProductCategory1Filter;
import org.openapitools.model.GoogleProductCategory2Filter;
import org.openapitools.model.GoogleProductCategory3Filter;
import org.openapitools.model.GoogleProductCategory4Filter;
import org.openapitools.model.GoogleProductCategory5Filter;
import org.openapitools.model.GoogleProductCategory6Filter;
import org.openapitools.model.MediaTypeFilter;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsProductGroupFilterKeys   {
  @JsonProperty("CREATIVE_ASSETS_ID")
  private CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID;

  @JsonProperty("CUSTOM_LABEL_0")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0;

  @JsonProperty("CUSTOM_LABEL_1")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1;

  @JsonProperty("CUSTOM_LABEL_2")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2;

  @JsonProperty("CUSTOM_LABEL_3")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;

  @JsonProperty("CUSTOM_LABEL_4")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;

  @JsonProperty("MEDIA_TYPE")
  private CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys CREATIVE_ASSETS_ID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
    this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CREATIVE_ASSETS_ID")
  public CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID() {
    return CREATIVE_ASSETS_ID;
  }
  public void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
    this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys CUSTOM_LABEL_0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_0")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }
  public void setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys CUSTOM_LABEL_1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_1")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }
  public void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys CUSTOM_LABEL_2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_2")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }
  public void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys CUSTOM_LABEL_3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_3")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }
  public void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys CUSTOM_LABEL_4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_4")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }
  public void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
    return GOOGLE_PRODUCT_CATEGORY_6;
  }
  public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }
  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }
  public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }
  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
    return GOOGLE_PRODUCT_CATEGORY_2;
  }
  public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }
  public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }
  public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilterKeys MEDIA_TYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MEDIA_TYPE")
  public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
    return MEDIA_TYPE;
  }
  public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsProductGroupFilterKeys catalogsCreativeAssetsProductGroupFilterKeys = (CatalogsCreativeAssetsProductGroupFilterKeys) o;
    return Objects.equals(CREATIVE_ASSETS_ID, catalogsCreativeAssetsProductGroupFilterKeys.CREATIVE_ASSETS_ID) &&
        Objects.equals(CUSTOM_LABEL_0, catalogsCreativeAssetsProductGroupFilterKeys.CUSTOM_LABEL_0) &&
        Objects.equals(CUSTOM_LABEL_1, catalogsCreativeAssetsProductGroupFilterKeys.CUSTOM_LABEL_1) &&
        Objects.equals(CUSTOM_LABEL_2, catalogsCreativeAssetsProductGroupFilterKeys.CUSTOM_LABEL_2) &&
        Objects.equals(CUSTOM_LABEL_3, catalogsCreativeAssetsProductGroupFilterKeys.CUSTOM_LABEL_3) &&
        Objects.equals(CUSTOM_LABEL_4, catalogsCreativeAssetsProductGroupFilterKeys.CUSTOM_LABEL_4) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_6, catalogsCreativeAssetsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_6) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_5, catalogsCreativeAssetsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_5) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_4, catalogsCreativeAssetsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_4) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_3, catalogsCreativeAssetsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_3) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_2, catalogsCreativeAssetsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_2) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_1, catalogsCreativeAssetsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_1) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_0, catalogsCreativeAssetsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_0) &&
        Objects.equals(MEDIA_TYPE, catalogsCreativeAssetsProductGroupFilterKeys.MEDIA_TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CREATIVE_ASSETS_ID, CUSTOM_LABEL_0, CUSTOM_LABEL_1, CUSTOM_LABEL_2, CUSTOM_LABEL_3, CUSTOM_LABEL_4, GOOGLE_PRODUCT_CATEGORY_6, GOOGLE_PRODUCT_CATEGORY_5, GOOGLE_PRODUCT_CATEGORY_4, GOOGLE_PRODUCT_CATEGORY_3, GOOGLE_PRODUCT_CATEGORY_2, GOOGLE_PRODUCT_CATEGORY_1, GOOGLE_PRODUCT_CATEGORY_0, MEDIA_TYPE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupFilterKeys {\n");
    
    sb.append("    CREATIVE_ASSETS_ID: ").append(toIndentedString(CREATIVE_ASSETS_ID)).append("\n");
    sb.append("    CUSTOM_LABEL_0: ").append(toIndentedString(CUSTOM_LABEL_0)).append("\n");
    sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
    sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
    sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
    sb.append("    CUSTOM_LABEL_4: ").append(toIndentedString(CUSTOM_LABEL_4)).append("\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_6: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_6)).append("\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_5: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_5)).append("\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_4: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_4)).append("\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_3: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_3)).append("\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_2: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_2)).append("\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_1: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_1)).append("\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_0: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_0)).append("\n");
    sb.append("    MEDIA_TYPE: ").append(toIndentedString(MEDIA_TYPE)).append("\n");
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

