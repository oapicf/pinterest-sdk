/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelBatchItem;
import org.openapitools.model.Country;



/**
 * Request object to update catalogs hotel items
 */

@ApiModel(description = "Request object to update catalogs hotel items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-26T05:36:38.375136112Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsHotelBatchRequest   {
  


  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private Country country;


  public enum LanguageEnum {
    AF_ZA("af-ZA"),
    AR_SA("ar-SA"),
    BG_BG("bg-BG"),
    BN_IN("bn-IN"),
    CS_CZ("cs-CZ"),
    DA_DK("da-DK"),
    DE("de"),
    EL_GR("el-GR"),
    EN_AU("en-AU"),
    EN_CA("en-CA"),
    EN_GB("en-GB"),
    EN_IN("en-IN"),
    EN_US("en-US"),
    ES_419("es-419"),
    ES_AR("es-AR"),
    ES_ES("es-ES"),
    ES_MX("es-MX"),
    FI_FI("fi-FI"),
    FR("fr"),
    FR_CA("fr-CA"),
    HE_IL("he-IL"),
    HI_IN("hi-IN"),
    HR_HR("hr-HR"),
    HU_HU("hu-HU"),
    ID_ID("id-ID"),
    IT("it"),
    JA("ja"),
    KO_KR("ko-KR"),
    MS_MY("ms-MY"),
    NB_NO("nb-NO"),
    NL("nl"),
    PL_PL("pl-PL"),
    PT_BR("pt-BR"),
    PT_PT("pt-PT"),
    RO_RO("ro-RO"),
    RU_RU("ru-RU"),
    SK_SK("sk-SK"),
    SV_SE("sv-SE"),
    TE_IN("te-IN"),
    TH_TH("th-TH"),
    TL_PH("tl-PH"),
    TR("tr"),
    UK_UA("uk-UA"),
    VI_VN("vi-VN"),
    ZH_CN("zh-CN"),
    ZH_TW("zh-TW"),
    AM("AM"),
    AR("AR"),
    AZ("AZ"),
    BG("BG"),
    BN("BN"),
    BS("BS"),
    CA("CA"),
    CS("CS"),
    DA("DA"),
    DV("DV"),
    DZ("DZ"),
    DE2("DE"),
    EL("EL"),
    EN("EN"),
    ES("ES"),
    ET("ET"),
    FA("FA"),
    FI("FI"),
    FR2("FR"),
    HE("HE"),
    HI("HI"),
    HR("HR"),
    HU("HU"),
    HY("HY"),
    ID("ID"),
    IN("IN"),
    IS("IS"),
    IT2("IT"),
    IW("IW"),
    JA2("JA"),
    KA("KA"),
    KM("KM"),
    KO("KO"),
    LO("LO"),
    LT("LT"),
    LV("LV"),
    MK("MK"),
    MN("MN"),
    MS("MS"),
    MY("MY"),
    NB("NB"),
    NE("NE"),
    NL2("NL"),
    NO("NO"),
    PL("PL"),
    PT("PT"),
    RO("RO"),
    RU("RU"),
    SK("SK"),
    SL("SL"),
    SQ("SQ"),
    SR("SR"),
    SV("SV"),
    TL("TL"),
    UK("UK"),
    VI("VI"),
    TE("TE"),
    TH("TH"),
    TR2("TR"),
    XX("XX"),
    ZH("ZH");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LanguageEnum language;
  private List<CatalogsHotelBatchItem> items = new ArrayList<>();
  private String catalogId;

  /**
   */
  public CatalogsHotelBatchRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   */
  public CatalogsHotelBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * We recommend using the CatalogsLocale values.
   */
  public CatalogsHotelBatchRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "We recommend using the CatalogsLocale values.")
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  /**
   * Array with catalogs item operations
   */
  public CatalogsHotelBatchRequest items(List<CatalogsHotelBatchItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs item operations")
  @JsonProperty("items")
  public List<CatalogsHotelBatchItem> getItems() {
    return items;
  }
  public void setItems(List<CatalogsHotelBatchItem> items) {
    this.items = items;
  }

  /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   */
  public CatalogsHotelBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelBatchRequest catalogsHotelBatchRequest = (CatalogsHotelBatchRequest) o;
    return Objects.equals(catalogType, catalogsHotelBatchRequest.catalogType) &&
        Objects.equals(country, catalogsHotelBatchRequest.country) &&
        Objects.equals(language, catalogsHotelBatchRequest.language) &&
        Objects.equals(items, catalogsHotelBatchRequest.items) &&
        Objects.equals(catalogId, catalogsHotelBatchRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, country, language, items, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelBatchRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

