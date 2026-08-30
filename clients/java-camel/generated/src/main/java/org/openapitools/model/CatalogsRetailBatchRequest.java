package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsRetailBatchRequestItemsItems;
import org.openapitools.model.Country;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A request object that can have multiple operations on a single retail batch
 */

@Schema(name = "CatalogsRetailBatchRequest", description = "A request object that can have multiple operations on a single retail batch")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailBatchRequest implements CatalogsVerticalBatchRequest {

  private String catalogId;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  @Valid
  private List<@Valid CatalogsRetailBatchRequestItemsItems> items = new ArrayList<>();

  /**
   * We recommend using the CatalogsLocale values.
   */
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
    
    FALSE("false"),
    
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

    private final String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailBatchRequest(CatalogTypeEnum catalogType, Country country, List<@Valid CatalogsRetailBatchRequestItemsItems> items, LanguageEnum language) {
    this.catalogType = catalogType;
    this.country = country;
    this.items = items;
    this.language = language;
  }

  public CatalogsRetailBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
   * @return catalogId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", example = "2680059592705", description = "Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailBatchRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @NotNull @Valid 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsRetailBatchRequest items(List<@Valid CatalogsRetailBatchRequestItemsItems> items) {
    this.items = items;
    return this;
  }

  public CatalogsRetailBatchRequest addItemsItem(CatalogsRetailBatchRequestItemsItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array with catalogs item operations
   * @return items
   */
  @NotNull @Valid @Size(min = 1, max = 1000) 
  @Schema(name = "items", description = "Array with catalogs item operations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid CatalogsRetailBatchRequestItemsItems> getItems() {
    return items;
  }

  public void setItems(List<@Valid CatalogsRetailBatchRequestItemsItems> items) {
    this.items = items;
  }

  public CatalogsRetailBatchRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  /**
   * We recommend using the CatalogsLocale values.
   * @return language
   */
  @NotNull 
  @Schema(name = "language", description = "We recommend using the CatalogsLocale values.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }

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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

