package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsItemsBatchRequest;
import org.openapitools.model.CatalogsVerticalBatchRequest;
import org.openapitools.model.Country;
import org.openapitools.model.ItemDeleteBatchRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsItemsBatchPostRequest  {
  
 /**
  * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
  private String catalogId;

public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));

    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

 /**
  * Array with catalogs items
  */
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @Valid
  private List<@Valid ItemDeleteBatchRecord> items = new ArrayList<>();

public enum LanguageEnum {

    @JsonProperty("af-ZA") AF_ZA(String.valueOf("af-ZA")),
    @JsonProperty("ar-SA") AR_SA(String.valueOf("ar-SA")),
    @JsonProperty("bg-BG") BG_BG(String.valueOf("bg-BG")),
    @JsonProperty("bn-IN") BN_IN(String.valueOf("bn-IN")),
    @JsonProperty("cs-CZ") CS_CZ(String.valueOf("cs-CZ")),
    @JsonProperty("da-DK") DA_DK(String.valueOf("da-DK")),
    @JsonProperty("de") DE(String.valueOf("de")),
    @JsonProperty("el-GR") EL_GR(String.valueOf("el-GR")),
    @JsonProperty("en-AU") EN_AU(String.valueOf("en-AU")),
    @JsonProperty("en-CA") EN_CA(String.valueOf("en-CA")),
    @JsonProperty("en-GB") EN_GB(String.valueOf("en-GB")),
    @JsonProperty("en-IN") EN_IN(String.valueOf("en-IN")),
    @JsonProperty("en-US") EN_US(String.valueOf("en-US")),
    @JsonProperty("es-419") ES_419(String.valueOf("es-419")),
    @JsonProperty("es-AR") ES_AR(String.valueOf("es-AR")),
    @JsonProperty("es-ES") ES_ES(String.valueOf("es-ES")),
    @JsonProperty("es-MX") ES_MX(String.valueOf("es-MX")),
    @JsonProperty("fi-FI") FI_FI(String.valueOf("fi-FI")),
    @JsonProperty("fr") FR(String.valueOf("fr")),
    @JsonProperty("fr-CA") FR_CA(String.valueOf("fr-CA")),
    @JsonProperty("he-IL") HE_IL(String.valueOf("he-IL")),
    @JsonProperty("hi-IN") HI_IN(String.valueOf("hi-IN")),
    @JsonProperty("hr-HR") HR_HR(String.valueOf("hr-HR")),
    @JsonProperty("hu-HU") HU_HU(String.valueOf("hu-HU")),
    @JsonProperty("id-ID") ID_ID(String.valueOf("id-ID")),
    @JsonProperty("it") IT(String.valueOf("it")),
    @JsonProperty("ja") JA(String.valueOf("ja")),
    @JsonProperty("ko-KR") KO_KR(String.valueOf("ko-KR")),
    @JsonProperty("ms-MY") MS_MY(String.valueOf("ms-MY")),
    @JsonProperty("nb-NO") NB_NO(String.valueOf("nb-NO")),
    @JsonProperty("nl") NL(String.valueOf("nl")),
    @JsonProperty("pl-PL") PL_PL(String.valueOf("pl-PL")),
    @JsonProperty("pt-BR") PT_BR(String.valueOf("pt-BR")),
    @JsonProperty("pt-PT") PT_PT(String.valueOf("pt-PT")),
    @JsonProperty("ro-RO") RO_RO(String.valueOf("ro-RO")),
    @JsonProperty("ru-RU") RU_RU(String.valueOf("ru-RU")),
    @JsonProperty("sk-SK") SK_SK(String.valueOf("sk-SK")),
    @JsonProperty("sv-SE") SV_SE(String.valueOf("sv-SE")),
    @JsonProperty("te-IN") TE_IN(String.valueOf("te-IN")),
    @JsonProperty("th-TH") TH_TH(String.valueOf("th-TH")),
    @JsonProperty("tl-PH") TL_PH(String.valueOf("tl-PH")),
    @JsonProperty("tr") TR(String.valueOf("tr")),
    @JsonProperty("uk-UA") UK_UA(String.valueOf("uk-UA")),
    @JsonProperty("vi-VN") VI_VN(String.valueOf("vi-VN")),
    @JsonProperty("zh-CN") ZH_CN(String.valueOf("zh-CN")),
    @JsonProperty("zh-TW") ZH_TW(String.valueOf("zh-TW")),
    @JsonProperty("AM") AM(String.valueOf("AM")),
    @JsonProperty("AR") AR(String.valueOf("AR")),
    @JsonProperty("AZ") AZ(String.valueOf("AZ")),
    @JsonProperty("BG") BG(String.valueOf("BG")),
    @JsonProperty("BN") BN(String.valueOf("BN")),
    @JsonProperty("BS") BS(String.valueOf("BS")),
    @JsonProperty("CA") CA(String.valueOf("CA")),
    @JsonProperty("CS") CS(String.valueOf("CS")),
    @JsonProperty("DA") DA(String.valueOf("DA")),
    @JsonProperty("DV") DV(String.valueOf("DV")),
    @JsonProperty("DZ") DZ(String.valueOf("DZ")),
    @JsonProperty("DE") DE2(String.valueOf("DE")),
    @JsonProperty("EL") EL(String.valueOf("EL")),
    @JsonProperty("EN") EN(String.valueOf("EN")),
    @JsonProperty("ES") ES(String.valueOf("ES")),
    @JsonProperty("ET") ET(String.valueOf("ET")),
    @JsonProperty("FA") FA(String.valueOf("FA")),
    @JsonProperty("FI") FI(String.valueOf("FI")),
    @JsonProperty("FR") FR2(String.valueOf("FR")),
    @JsonProperty("HE") HE(String.valueOf("HE")),
    @JsonProperty("HI") HI(String.valueOf("HI")),
    @JsonProperty("HR") HR(String.valueOf("HR")),
    @JsonProperty("HU") HU(String.valueOf("HU")),
    @JsonProperty("HY") HY(String.valueOf("HY")),
    @JsonProperty("ID") ID(String.valueOf("ID")),
    @JsonProperty("IN") IN(String.valueOf("IN")),
    @JsonProperty("IS") IS(String.valueOf("IS")),
    @JsonProperty("IT") IT2(String.valueOf("IT")),
    @JsonProperty("IW") IW(String.valueOf("IW")),
    @JsonProperty("JA") JA2(String.valueOf("JA")),
    @JsonProperty("KA") KA(String.valueOf("KA")),
    @JsonProperty("KM") KM(String.valueOf("KM")),
    @JsonProperty("KO") KO(String.valueOf("KO")),
    @JsonProperty("LO") LO(String.valueOf("LO")),
    @JsonProperty("LT") LT(String.valueOf("LT")),
    @JsonProperty("LV") LV(String.valueOf("LV")),
    @JsonProperty("MK") MK(String.valueOf("MK")),
    @JsonProperty("MN") MN(String.valueOf("MN")),
    @JsonProperty("MS") MS(String.valueOf("MS")),
    @JsonProperty("MY") MY(String.valueOf("MY")),
    @JsonProperty("NB") NB(String.valueOf("NB")),
    @JsonProperty("NE") NE(String.valueOf("NE")),
    @JsonProperty("NL") NL2(String.valueOf("NL")),
    @JsonProperty("false") FALSE(String.valueOf("false")),
    @JsonProperty("PL") PL(String.valueOf("PL")),
    @JsonProperty("PT") PT(String.valueOf("PT")),
    @JsonProperty("RO") RO(String.valueOf("RO")),
    @JsonProperty("RU") RU(String.valueOf("RU")),
    @JsonProperty("SK") SK(String.valueOf("SK")),
    @JsonProperty("SL") SL(String.valueOf("SL")),
    @JsonProperty("SQ") SQ(String.valueOf("SQ")),
    @JsonProperty("SR") SR(String.valueOf("SR")),
    @JsonProperty("SV") SV(String.valueOf("SV")),
    @JsonProperty("TL") TL(String.valueOf("TL")),
    @JsonProperty("UK") UK(String.valueOf("UK")),
    @JsonProperty("VI") VI(String.valueOf("VI")),
    @JsonProperty("TE") TE(String.valueOf("TE")),
    @JsonProperty("TH") TH(String.valueOf("TH")),
    @JsonProperty("TR") TR2(String.valueOf("TR")),
    @JsonProperty("XX") XX(String.valueOf("XX")),
    @JsonProperty("ZH") ZH(String.valueOf("ZH"));

    private String value;

    LanguageEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String value) {
        for (LanguageEnum b : LanguageEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * We recommend using the CatalogsLocale values.
  */
  @ApiModelProperty(required = true, value = "We recommend using the CatalogsLocale values.")
  private LanguageEnum language;

public enum OperationEnum {

    @JsonProperty("DELETE") DELETE(String.valueOf("DELETE"));

    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private OperationEnum operation;
 /**
  * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  * @return catalogId
  */
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsItemsBatchPostRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsItemsBatchPostRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public CatalogsItemsBatchPostRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Array with catalogs items
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid ItemDeleteBatchRecord> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid ItemDeleteBatchRecord> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CatalogsItemsBatchPostRequest items(List<@Valid ItemDeleteBatchRecord> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CatalogsItemsBatchPostRequest addItemsItem(ItemDeleteBatchRecord itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * We recommend using the CatalogsLocale values.
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public String getLanguage() {
    return language == null ? null : language.value();
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public CatalogsItemsBatchPostRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    return operation == null ? null : operation.value();
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public CatalogsItemsBatchPostRequest operation(OperationEnum operation) {
    this.operation = operation;
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
    CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest = (CatalogsItemsBatchPostRequest) o;
    return Objects.equals(this.catalogId, catalogsItemsBatchPostRequest.catalogId) &&
        Objects.equals(this.catalogType, catalogsItemsBatchPostRequest.catalogType) &&
        Objects.equals(this.country, catalogsItemsBatchPostRequest.country) &&
        Objects.equals(this.items, catalogsItemsBatchPostRequest.items) &&
        Objects.equals(this.language, catalogsItemsBatchPostRequest.language) &&
        Objects.equals(this.operation, catalogsItemsBatchPostRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, items, language, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsBatchPostRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

