package apimodels;

import apimodels.CatalogsHotelBatchItem;
import apimodels.Country;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Request object to update catalogs hotel items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsHotelBatchRequest   {
  @JsonProperty("catalog_id")
  @Pattern(regexp="^\\d+$")

  private String catalogId;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("catalog_type")
  @NotNull

  private CatalogTypeEnum catalogType;

  @JsonProperty("country")
  @NotNull
@Valid

  private Country country;

  @JsonProperty("items")
  @NotNull
@Size(min=1,max=1000)
@Valid

  private List<@Valid CatalogsHotelBatchItem> items = new ArrayList<>();

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

    @Override
    @JsonValue
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

  @JsonProperty("language")
  @NotNull

  private LanguageEnum language;

  public CatalogsHotelBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   * @return catalogId
  **/
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsHotelBatchRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsHotelBatchRequest items(List<@Valid CatalogsHotelBatchItem> items) {
    this.items = items;
    return this;
  }

  public CatalogsHotelBatchRequest addItemsItem(CatalogsHotelBatchItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array with catalogs item operations
   * @return items
  **/
  public List<@Valid CatalogsHotelBatchItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid CatalogsHotelBatchItem> items) {
    this.items = items;
  }

  public CatalogsHotelBatchRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * We recommend using the CatalogsLocale values.
   * @return language
  **/
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
    CatalogsHotelBatchRequest catalogsHotelBatchRequest = (CatalogsHotelBatchRequest) o;
    return Objects.equals(catalogId, catalogsHotelBatchRequest.catalogId) &&
        Objects.equals(catalogType, catalogsHotelBatchRequest.catalogType) &&
        Objects.equals(country, catalogsHotelBatchRequest.country) &&
        Objects.equals(items, catalogsHotelBatchRequest.items) &&
        Objects.equals(language, catalogsHotelBatchRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, items, language);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelBatchRequest {\n");
    
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

