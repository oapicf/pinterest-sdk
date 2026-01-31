package apimodels;

import apimodels.BatchOperation;
import apimodels.Country;
import apimodels.ItemUpdateBatchRecord;
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
 * Request object to update catalogs items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsItemsUpdateBatchRequest   {
  @JsonProperty("country")
  @NotNull
@Valid

  private Country country;

  @JsonProperty("items")
  @NotNull
@Size(min=1,max=1000)
@Valid

  private List<@Valid ItemUpdateBatchRecord> items = new ArrayList<>();

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

  @JsonProperty("operation")
  @NotNull
@Valid

  private BatchOperation operation;

  public CatalogsItemsUpdateBatchRequest country(Country country) {
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

  public CatalogsItemsUpdateBatchRequest items(List<@Valid ItemUpdateBatchRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsUpdateBatchRequest addItemsItem(ItemUpdateBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array with catalogs items
   * @return items
  **/
  public List<@Valid ItemUpdateBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid ItemUpdateBatchRecord> items) {
    this.items = items;
  }

  public CatalogsItemsUpdateBatchRequest language(LanguageEnum language) {
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

  public CatalogsItemsUpdateBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  public BatchOperation getOperation() {
    return operation;
  }

  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest = (CatalogsItemsUpdateBatchRequest) o;
    return Objects.equals(country, catalogsItemsUpdateBatchRequest.country) &&
        Objects.equals(items, catalogsItemsUpdateBatchRequest.items) &&
        Objects.equals(language, catalogsItemsUpdateBatchRequest.language) &&
        Objects.equals(operation, catalogsItemsUpdateBatchRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, items, language, operation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsUpdateBatchRequest {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

