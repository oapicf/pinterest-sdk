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
import org.openapitools.model.CatalogsCreativeAssetsBatchItem;
import org.openapitools.model.CatalogsCreativeAssetsBatchRequest;
import org.openapitools.model.CatalogsHotelBatchRequest;
import org.openapitools.model.CatalogsRetailBatchRequest;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="A request object that can have multiple operations on a single batch")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-26T05:37:49.085059204Z[Etc/UTC]", comments = "Generator version: 7.18.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsBatchRequest.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelBatchRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailBatchRequest.class, name = "RETAIL"),
})

public class CatalogsVerticalBatchRequest   {
  

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");
    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CatalogTypeEnum catalogType;
  private Country country;

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
  private List<@Valid CatalogsCreativeAssetsBatchItem> items = new ArrayList<>();
  private String catalogId;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  
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
   * Array with creative assets item operations
   **/
  
  @ApiModelProperty(required = true, value = "Array with creative assets item operations")
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid CatalogsCreativeAssetsBatchItem> getItems() {
    return items;
  }
  public void setItems(List<@Valid CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
  }

  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   **/
  
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
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
    CatalogsVerticalBatchRequest catalogsVerticalBatchRequest = (CatalogsVerticalBatchRequest) o;
    return Objects.equals(this.catalogType, catalogsVerticalBatchRequest.catalogType) &&
        Objects.equals(this.country, catalogsVerticalBatchRequest.country) &&
        Objects.equals(this.language, catalogsVerticalBatchRequest.language) &&
        Objects.equals(this.items, catalogsVerticalBatchRequest.items) &&
        Objects.equals(this.catalogId, catalogsVerticalBatchRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, country, language, items, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalBatchRequest {\n");
    
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

