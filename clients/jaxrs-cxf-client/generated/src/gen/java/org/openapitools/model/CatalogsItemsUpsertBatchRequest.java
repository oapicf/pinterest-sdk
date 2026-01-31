package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.Country;
import org.openapitools.model.ItemUpsertBatchRecord;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request object to upsert catalogs items
 */
@ApiModel(description="Request object to upsert catalogs items")

public class CatalogsItemsUpsertBatchRequest  {
  
  @ApiModelProperty(required = true, value = "")

  private Country country;

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

  @ApiModelProperty(required = true, value = "")

  private BatchOperation operation;

 /**
  * Array with catalogs items
  */
  @ApiModelProperty(required = true, value = "Array with catalogs items")

  private List<ItemUpsertBatchRecord> items = new ArrayList<>();
 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsItemsUpsertBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * We recommend using the CatalogsLocale values.
   * @return language
  **/
  @JsonProperty("language")
  public String getLanguage() {
    if (language == null) {
      return null;
    }
    return language.value();
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public CatalogsItemsUpsertBatchRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public BatchOperation getOperation() {
    return operation;
  }

  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  public CatalogsItemsUpsertBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Array with catalogs items
   * @return items
  **/
  @JsonProperty("items")
  public List<ItemUpsertBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemUpsertBatchRecord> items) {
    this.items = items;
  }

  public CatalogsItemsUpsertBatchRequest items(List<ItemUpsertBatchRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsUpsertBatchRequest addItemsItem(ItemUpsertBatchRecord itemsItem) {
    this.items.add(itemsItem);
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
    CatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest = (CatalogsItemsUpsertBatchRequest) o;
    return Objects.equals(this.country, catalogsItemsUpsertBatchRequest.country) &&
        Objects.equals(this.language, catalogsItemsUpsertBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsUpsertBatchRequest.operation) &&
        Objects.equals(this.items, catalogsItemsUpsertBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsUpsertBatchRequest {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

