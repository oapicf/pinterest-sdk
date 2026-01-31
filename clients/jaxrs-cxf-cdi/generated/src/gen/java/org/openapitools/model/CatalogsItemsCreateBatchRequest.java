package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.Country;
import org.openapitools.model.ItemCreateBatchRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object to create catalogs items
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Request object to create catalogs items")
public class CatalogsItemsCreateBatchRequest   {
  
  private Country country;

  private List<@Valid ItemCreateBatchRecord> items = new ArrayList<>();


public enum LanguageEnum {

    @JsonProperty("af-ZA") AF_ZA(String.valueOf("af-ZA")), @JsonProperty("ar-SA") AR_SA(String.valueOf("ar-SA")), @JsonProperty("bg-BG") BG_BG(String.valueOf("bg-BG")), @JsonProperty("bn-IN") BN_IN(String.valueOf("bn-IN")), @JsonProperty("cs-CZ") CS_CZ(String.valueOf("cs-CZ")), @JsonProperty("da-DK") DA_DK(String.valueOf("da-DK")), @JsonProperty("de") DE(String.valueOf("de")), @JsonProperty("el-GR") EL_GR(String.valueOf("el-GR")), @JsonProperty("en-AU") EN_AU(String.valueOf("en-AU")), @JsonProperty("en-CA") EN_CA(String.valueOf("en-CA")), @JsonProperty("en-GB") EN_GB(String.valueOf("en-GB")), @JsonProperty("en-IN") EN_IN(String.valueOf("en-IN")), @JsonProperty("en-US") EN_US(String.valueOf("en-US")), @JsonProperty("es-419") ES_419(String.valueOf("es-419")), @JsonProperty("es-AR") ES_AR(String.valueOf("es-AR")), @JsonProperty("es-ES") ES_ES(String.valueOf("es-ES")), @JsonProperty("es-MX") ES_MX(String.valueOf("es-MX")), @JsonProperty("fi-FI") FI_FI(String.valueOf("fi-FI")), @JsonProperty("fr") FR(String.valueOf("fr")), @JsonProperty("fr-CA") FR_CA(String.valueOf("fr-CA")), @JsonProperty("he-IL") HE_IL(String.valueOf("he-IL")), @JsonProperty("hi-IN") HI_IN(String.valueOf("hi-IN")), @JsonProperty("hr-HR") HR_HR(String.valueOf("hr-HR")), @JsonProperty("hu-HU") HU_HU(String.valueOf("hu-HU")), @JsonProperty("id-ID") ID_ID(String.valueOf("id-ID")), @JsonProperty("it") IT(String.valueOf("it")), @JsonProperty("ja") JA(String.valueOf("ja")), @JsonProperty("ko-KR") KO_KR(String.valueOf("ko-KR")), @JsonProperty("ms-MY") MS_MY(String.valueOf("ms-MY")), @JsonProperty("nb-NO") NB_NO(String.valueOf("nb-NO")), @JsonProperty("nl") NL(String.valueOf("nl")), @JsonProperty("pl-PL") PL_PL(String.valueOf("pl-PL")), @JsonProperty("pt-BR") PT_BR(String.valueOf("pt-BR")), @JsonProperty("pt-PT") PT_PT(String.valueOf("pt-PT")), @JsonProperty("ro-RO") RO_RO(String.valueOf("ro-RO")), @JsonProperty("ru-RU") RU_RU(String.valueOf("ru-RU")), @JsonProperty("sk-SK") SK_SK(String.valueOf("sk-SK")), @JsonProperty("sv-SE") SV_SE(String.valueOf("sv-SE")), @JsonProperty("te-IN") TE_IN(String.valueOf("te-IN")), @JsonProperty("th-TH") TH_TH(String.valueOf("th-TH")), @JsonProperty("tl-PH") TL_PH(String.valueOf("tl-PH")), @JsonProperty("tr") TR(String.valueOf("tr")), @JsonProperty("uk-UA") UK_UA(String.valueOf("uk-UA")), @JsonProperty("vi-VN") VI_VN(String.valueOf("vi-VN")), @JsonProperty("zh-CN") ZH_CN(String.valueOf("zh-CN")), @JsonProperty("zh-TW") ZH_TW(String.valueOf("zh-TW")), @JsonProperty("AM") AM(String.valueOf("AM")), @JsonProperty("AR") AR(String.valueOf("AR")), @JsonProperty("AZ") AZ(String.valueOf("AZ")), @JsonProperty("BG") BG(String.valueOf("BG")), @JsonProperty("BN") BN(String.valueOf("BN")), @JsonProperty("BS") BS(String.valueOf("BS")), @JsonProperty("CA") CA(String.valueOf("CA")), @JsonProperty("CS") CS(String.valueOf("CS")), @JsonProperty("DA") DA(String.valueOf("DA")), @JsonProperty("DV") DV(String.valueOf("DV")), @JsonProperty("DZ") DZ(String.valueOf("DZ")), @JsonProperty("DE") DE2(String.valueOf("DE")), @JsonProperty("EL") EL(String.valueOf("EL")), @JsonProperty("EN") EN(String.valueOf("EN")), @JsonProperty("ES") ES(String.valueOf("ES")), @JsonProperty("ET") ET(String.valueOf("ET")), @JsonProperty("FA") FA(String.valueOf("FA")), @JsonProperty("FI") FI(String.valueOf("FI")), @JsonProperty("FR") FR2(String.valueOf("FR")), @JsonProperty("HE") HE(String.valueOf("HE")), @JsonProperty("HI") HI(String.valueOf("HI")), @JsonProperty("HR") HR(String.valueOf("HR")), @JsonProperty("HU") HU(String.valueOf("HU")), @JsonProperty("HY") HY(String.valueOf("HY")), @JsonProperty("ID") ID(String.valueOf("ID")), @JsonProperty("IN") IN(String.valueOf("IN")), @JsonProperty("IS") IS(String.valueOf("IS")), @JsonProperty("IT") IT2(String.valueOf("IT")), @JsonProperty("IW") IW(String.valueOf("IW")), @JsonProperty("JA") JA2(String.valueOf("JA")), @JsonProperty("KA") KA(String.valueOf("KA")), @JsonProperty("KM") KM(String.valueOf("KM")), @JsonProperty("KO") KO(String.valueOf("KO")), @JsonProperty("LO") LO(String.valueOf("LO")), @JsonProperty("LT") LT(String.valueOf("LT")), @JsonProperty("LV") LV(String.valueOf("LV")), @JsonProperty("MK") MK(String.valueOf("MK")), @JsonProperty("MN") MN(String.valueOf("MN")), @JsonProperty("MS") MS(String.valueOf("MS")), @JsonProperty("MY") MY(String.valueOf("MY")), @JsonProperty("NB") NB(String.valueOf("NB")), @JsonProperty("NE") NE(String.valueOf("NE")), @JsonProperty("NL") NL2(String.valueOf("NL")), @JsonProperty("NO") NO(String.valueOf("NO")), @JsonProperty("PL") PL(String.valueOf("PL")), @JsonProperty("PT") PT(String.valueOf("PT")), @JsonProperty("RO") RO(String.valueOf("RO")), @JsonProperty("RU") RU(String.valueOf("RU")), @JsonProperty("SK") SK(String.valueOf("SK")), @JsonProperty("SL") SL(String.valueOf("SL")), @JsonProperty("SQ") SQ(String.valueOf("SQ")), @JsonProperty("SR") SR(String.valueOf("SR")), @JsonProperty("SV") SV(String.valueOf("SV")), @JsonProperty("TL") TL(String.valueOf("TL")), @JsonProperty("UK") UK(String.valueOf("UK")), @JsonProperty("VI") VI(String.valueOf("VI")), @JsonProperty("TE") TE(String.valueOf("TE")), @JsonProperty("TH") TH(String.valueOf("TH")), @JsonProperty("TR") TR2(String.valueOf("TR")), @JsonProperty("XX") XX(String.valueOf("XX")), @JsonProperty("ZH") ZH(String.valueOf("ZH"));


    private String value;

    LanguageEnum(String v) {
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

  private LanguageEnum language;

  private BatchOperation operation;

  /**
   **/
  public CatalogsItemsCreateBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }


  /**
   * Array with catalogs items
   **/
  public CatalogsItemsCreateBatchRequest items(List<@Valid ItemCreateBatchRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid ItemCreateBatchRecord> getItems() {
    return items;
  }
  public void setItems(List<@Valid ItemCreateBatchRecord> items) {
    this.items = items;
  }

  public CatalogsItemsCreateBatchRequest addItemsItem(ItemCreateBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   * We recommend using the CatalogsLocale values.
   **/
  public CatalogsItemsCreateBatchRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "We recommend using the CatalogsLocale values.")
  @JsonProperty("language")
  @NotNull
  public LanguageEnum getLanguage() {
    return language;
  }
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  /**
   **/
  public CatalogsItemsCreateBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
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
    CatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest = (CatalogsItemsCreateBatchRequest) o;
    return Objects.equals(this.country, catalogsItemsCreateBatchRequest.country) &&
        Objects.equals(this.items, catalogsItemsCreateBatchRequest.items) &&
        Objects.equals(this.language, catalogsItemsCreateBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsCreateBatchRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, items, language, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsCreateBatchRequest {\n");
    
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

