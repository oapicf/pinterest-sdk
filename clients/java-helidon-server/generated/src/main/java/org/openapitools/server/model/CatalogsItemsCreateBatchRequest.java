package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Country;
import org.openapitools.server.model.ItemCreateBatchRecord;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object to create catalogs items
 */
public class CatalogsItemsCreateBatchRequest   {

    private Country country;
    private List<@Valid ItemCreateBatchRecord> items = new ArrayList<>();

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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static LanguageEnum fromValue(String text) {
            for (LanguageEnum b : LanguageEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private LanguageEnum language;

    /**
    * Gets or Sets operation
    */
    public enum OperationEnum {
        CREATE("CREATE");

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String text) {
            for (OperationEnum b : OperationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private OperationEnum operation;

    /**
     * Default constructor.
     */
    public CatalogsItemsCreateBatchRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsItemsCreateBatchRequest.
     *
     * @param country country
     * @param items Array with catalogs items
     * @param language We recommend using the CatalogsLocale values.
     * @param operation operation
     */
    public CatalogsItemsCreateBatchRequest(
        Country country, 
        List<@Valid ItemCreateBatchRecord> items, 
        LanguageEnum language, 
        OperationEnum operation
    ) {
        this.country = country;
        this.items = items;
        this.language = language;
        this.operation = operation;
    }



    /**
     * Get country
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * Array with catalogs items
     * @return items
     */
    public List<@Valid ItemCreateBatchRecord> getItems() {
        return items;
    }

    public void setItems(List<@Valid ItemCreateBatchRecord> items) {
        this.items = items;
    }

    /**
     * We recommend using the CatalogsLocale values.
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    /**
     * Get operation
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

