package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BatchOperation;
import org.openapitools.vertxweb.server.model.CatalogsItemsCreateBatchRequest;
import org.openapitools.vertxweb.server.model.CatalogsItemsDeleteBatchRequest;
import org.openapitools.vertxweb.server.model.CatalogsItemsDeleteDiscontinuedBatchRequest;
import org.openapitools.vertxweb.server.model.CatalogsItemsUpdateBatchRequest;
import org.openapitools.vertxweb.server.model.CatalogsItemsUpsertBatchRequest;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.ItemDeleteBatchRecord;

/**
 * Request object of catalogs items batch
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemsBatchRequest   {
  
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
  private BatchOperation operation;
  private List<ItemDeleteBatchRecord> items = new ArrayList<>();

  public CatalogsItemsBatchRequest () {

  }

  public CatalogsItemsBatchRequest (Country country, LanguageEnum language, BatchOperation operation, List<ItemDeleteBatchRecord> items) {
    this.country = country;
    this.language = language;
    this.operation = operation;
    this.items = items;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

    
  @JsonProperty("operation")
  public BatchOperation getOperation() {
    return operation;
  }
  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

    
  @JsonProperty("items")
  public List<ItemDeleteBatchRecord> getItems() {
    return items;
  }
  public void setItems(List<ItemDeleteBatchRecord> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsBatchRequest catalogsItemsBatchRequest = (CatalogsItemsBatchRequest) o;
    return Objects.equals(country, catalogsItemsBatchRequest.country) &&
        Objects.equals(language, catalogsItemsBatchRequest.language) &&
        Objects.equals(operation, catalogsItemsBatchRequest.operation) &&
        Objects.equals(items, catalogsItemsBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsBatchRequest {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
