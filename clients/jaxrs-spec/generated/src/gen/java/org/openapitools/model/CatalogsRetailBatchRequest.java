package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsRetailBatchRequestItemsInner;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A request object that can have multiple operations on a single retail batch
 **/
@ApiModel(description = "A request object that can have multiple operations on a single retail batch")
@JsonTypeName("CatalogsRetailBatchRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsRetailBatchRequest   {
  private String catalogId;
  public enum CatalogTypeEnum {

    RETAIL(String.valueOf("RETAIL"));


    private String value;

    CatalogTypeEnum (String v) {
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
    public static CatalogTypeEnum fromString(String s) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CatalogTypeEnum catalogType;
  private Country country;
  private @Valid List<CatalogsRetailBatchRequestItemsInner> items = new ArrayList<>();
  public enum LanguageEnum {

    AF_ZA(String.valueOf("af-ZA")), AR_SA(String.valueOf("ar-SA")), BG_BG(String.valueOf("bg-BG")), BN_IN(String.valueOf("bn-IN")), CS_CZ(String.valueOf("cs-CZ")), DA_DK(String.valueOf("da-DK")), DE(String.valueOf("de")), EL_GR(String.valueOf("el-GR")), EN_AU(String.valueOf("en-AU")), EN_CA(String.valueOf("en-CA")), EN_GB(String.valueOf("en-GB")), EN_IN(String.valueOf("en-IN")), EN_US(String.valueOf("en-US")), ES_419(String.valueOf("es-419")), ES_AR(String.valueOf("es-AR")), ES_ES(String.valueOf("es-ES")), ES_MX(String.valueOf("es-MX")), FI_FI(String.valueOf("fi-FI")), FR(String.valueOf("fr")), FR_CA(String.valueOf("fr-CA")), HE_IL(String.valueOf("he-IL")), HI_IN(String.valueOf("hi-IN")), HR_HR(String.valueOf("hr-HR")), HU_HU(String.valueOf("hu-HU")), ID_ID(String.valueOf("id-ID")), IT(String.valueOf("it")), JA(String.valueOf("ja")), KO_KR(String.valueOf("ko-KR")), MS_MY(String.valueOf("ms-MY")), NB_NO(String.valueOf("nb-NO")), NL(String.valueOf("nl")), PL_PL(String.valueOf("pl-PL")), PT_BR(String.valueOf("pt-BR")), PT_PT(String.valueOf("pt-PT")), RO_RO(String.valueOf("ro-RO")), RU_RU(String.valueOf("ru-RU")), SK_SK(String.valueOf("sk-SK")), SV_SE(String.valueOf("sv-SE")), TE_IN(String.valueOf("te-IN")), TH_TH(String.valueOf("th-TH")), TL_PH(String.valueOf("tl-PH")), TR(String.valueOf("tr")), UK_UA(String.valueOf("uk-UA")), VI_VN(String.valueOf("vi-VN")), ZH_CN(String.valueOf("zh-CN")), ZH_TW(String.valueOf("zh-TW")), AM(String.valueOf("AM")), AR(String.valueOf("AR")), AZ(String.valueOf("AZ")), BG(String.valueOf("BG")), BN(String.valueOf("BN")), BS(String.valueOf("BS")), CA(String.valueOf("CA")), CS(String.valueOf("CS")), DA(String.valueOf("DA")), DV(String.valueOf("DV")), DZ(String.valueOf("DZ")), DE2(String.valueOf("DE")), EL(String.valueOf("EL")), EN(String.valueOf("EN")), ES(String.valueOf("ES")), ET(String.valueOf("ET")), FA(String.valueOf("FA")), FI(String.valueOf("FI")), FR2(String.valueOf("FR")), HE(String.valueOf("HE")), HI(String.valueOf("HI")), HR(String.valueOf("HR")), HU(String.valueOf("HU")), HY(String.valueOf("HY")), ID(String.valueOf("ID")), IN(String.valueOf("IN")), IS(String.valueOf("IS")), IT2(String.valueOf("IT")), IW(String.valueOf("IW")), JA2(String.valueOf("JA")), KA(String.valueOf("KA")), KM(String.valueOf("KM")), KO(String.valueOf("KO")), LO(String.valueOf("LO")), LT(String.valueOf("LT")), LV(String.valueOf("LV")), MK(String.valueOf("MK")), MN(String.valueOf("MN")), MS(String.valueOf("MS")), MY(String.valueOf("MY")), NB(String.valueOf("NB")), NE(String.valueOf("NE")), NL2(String.valueOf("NL")), NO(String.valueOf("NO")), PL(String.valueOf("PL")), PT(String.valueOf("PT")), RO(String.valueOf("RO")), RU(String.valueOf("RU")), SK(String.valueOf("SK")), SL(String.valueOf("SL")), SQ(String.valueOf("SQ")), SR(String.valueOf("SR")), SV(String.valueOf("SV")), TL(String.valueOf("TL")), UK(String.valueOf("UK")), VI(String.valueOf("VI")), TE(String.valueOf("TE")), TH(String.valueOf("TH")), TR2(String.valueOf("TR")), XX(String.valueOf("XX")), ZH(String.valueOf("ZH"));


    private String value;

    LanguageEnum (String v) {
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
    public static LanguageEnum fromString(String s) {
        for (LanguageEnum b : LanguageEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static LanguageEnum fromValue(String value) {
        for (LanguageEnum b : LanguageEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private LanguageEnum language;

  public CatalogsRetailBatchRequest() {
  }

  @JsonCreator
  public CatalogsRetailBatchRequest(
    @JsonProperty(required = true, value = "catalog_type") CatalogTypeEnum catalogType,
    @JsonProperty(required = true, value = "country") Country country,
    @JsonProperty(required = true, value = "items") List<@Valid CatalogsRetailBatchRequestItemsInner> items,
    @JsonProperty(required = true, value = "language") LanguageEnum language
  ) {
    this.catalogType = catalogType;
    this.country = country;
    this.items = items;
    this.language = language;
  }

  /**
   * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
   **/
  public CatalogsRetailBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog")
  @JsonProperty("catalog_id")
   @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   **/
  public CatalogsRetailBatchRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "catalog_type")
  @NotNull public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  @JsonProperty(required = true, value = "catalog_type")
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsRetailBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "country")
  @NotNull public Country getCountry() {
    return country;
  }

  @JsonProperty(required = true, value = "country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Array with catalogs item operations
   **/
  public CatalogsRetailBatchRequest items(List<CatalogsRetailBatchRequestItemsInner> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs item operations")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid  @Size(min=1,max=1000)public List<@Valid CatalogsRetailBatchRequestItemsInner> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<CatalogsRetailBatchRequestItemsInner> items) {
    this.items = items;
  }

  public CatalogsRetailBatchRequest addItemsItem(CatalogsRetailBatchRequestItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public CatalogsRetailBatchRequest removeItemsItem(CatalogsRetailBatchRequestItemsInner itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

    return this;
  }
  /**
   * We recommend using the CatalogsLocale values.
   **/
  public CatalogsRetailBatchRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "We recommend using the CatalogsLocale values.")
  @JsonProperty(required = true, value = "language")
  @NotNull public LanguageEnum getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailBatchRequest catalogsRetailBatchRequest = (CatalogsRetailBatchRequest) o;
    return Objects.equals(this.catalogId, catalogsRetailBatchRequest.catalogId) &&
        Objects.equals(this.catalogType, catalogsRetailBatchRequest.catalogType) &&
        Objects.equals(this.country, catalogsRetailBatchRequest.country) &&
        Objects.equals(this.items, catalogsRetailBatchRequest.items) &&
        Objects.equals(this.language, catalogsRetailBatchRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, items, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailBatchRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

