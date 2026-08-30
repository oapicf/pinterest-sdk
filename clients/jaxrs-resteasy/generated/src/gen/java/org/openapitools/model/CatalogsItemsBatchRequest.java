package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsItemsCreateBatchRequest;
import org.openapitools.model.CatalogsItemsDeleteBatchRequest;
import org.openapitools.model.CatalogsItemsDeleteDiscontinuedBatchRequest;
import org.openapitools.model.CatalogsItemsUpdateBatchRequest;
import org.openapitools.model.CatalogsItemsUpsertBatchRequest;
import org.openapitools.model.Country;
import org.openapitools.model.ItemDeleteBatchRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Request object of catalogs items batch")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsItemsCreateBatchRequest.class, name = "CREATE"),
  @JsonSubTypes.Type(value = CatalogsItemsDeleteBatchRequest.class, name = "DELETE"),
  @JsonSubTypes.Type(value = CatalogsItemsDeleteDiscontinuedBatchRequest.class, name = "DELETE_DISCONTINUED"),
  @JsonSubTypes.Type(value = CatalogsItemsUpdateBatchRequest.class, name = "UPDATE"),
  @JsonSubTypes.Type(value = CatalogsItemsUpsertBatchRequest.class, name = "UPSERT"),
})

public class CatalogsItemsBatchRequest   {
  
  private Country country;
  private List<@Valid ItemDeleteBatchRecord> items = new ArrayList<>();

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
    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private LanguageEnum language;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    DELETE("DELETE");
    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OperationEnum operation;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
  @Valid
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Array with catalogs items
   **/
  
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @JsonProperty("items")
  @NotNull
  @Valid
  public List<@Valid ItemDeleteBatchRecord> getItems() {
    return items;
  }
  public void setItems(List<@Valid ItemDeleteBatchRecord> items) {
    this.items = items;
  }

  /**
   * We recommend using the CatalogsLocale values.
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
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
    CatalogsItemsBatchRequest catalogsItemsBatchRequest = (CatalogsItemsBatchRequest) o;
    return Objects.equals(this.country, catalogsItemsBatchRequest.country) &&
        Objects.equals(this.items, catalogsItemsBatchRequest.items) &&
        Objects.equals(this.language, catalogsItemsBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsBatchRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, items, language, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsBatchRequest {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

