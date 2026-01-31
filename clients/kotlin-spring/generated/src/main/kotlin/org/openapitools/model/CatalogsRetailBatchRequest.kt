package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsRetailBatchRequestItemsInner
import org.openapitools.model.Country
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * A request object that can have multiple operations on a single retail batch
 * @param catalogType 
 * @param country 
 * @param items Array with catalogs item operations
 * @param language We recommend using the CatalogsLocale values.
 * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 */
data class CatalogsRetailBatchRequest(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsRetailBatchRequest.CatalogType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @get:Size(min=1,max=1000) 
    @Schema(example = "null", required = true, description = "Array with catalogs item operations")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<CatalogsRetailBatchRequestItemsInner>,

    @Schema(example = "null", required = true, description = "We recommend using the CatalogsLocale values.")
    @get:JsonProperty("language", required = true) val language: CatalogsRetailBatchRequest.Language,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null
) {

    /**
    * 
    * Values: RETAIL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        RETAIL("RETAIL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsRetailBatchRequest'")
            }
        }
    }

    /**
    * We recommend using the CatalogsLocale values.
    * Values: afMinusZA,arMinusSA,bgMinusBG,bnMinusIN,csMinusCZ,daMinusDK,de,elMinusGR,enMinusAU,enMinusCA,enMinusGB,enMinusIN,enMinusUS,esMinus419,esMinusAR,esMinusES,esMinusMX,fiMinusFI,fr,frMinusCA,heMinusIL,hiMinusIN,hrMinusHR,huMinusHU,idMinusID,`it`,ja,koMinusKR,msMinusMY,nbMinusNO,nl,plMinusPL,ptMinusBR,ptMinusPT,roMinusRO,ruMinusRU,skMinusSK,svMinusSE,teMinusIN,thMinusTH,tlMinusPH,tr,ukMinusUA,viMinusVN,zhMinusCN,zhMinusTW,AM,AR,AZ,BG,BN,BS,CA,CS,DA,DV,DZ,DE,EL,EN,ES,ET,FA,FI,FR,HE,HI,HR,HU,HY,ID,IN,IS,IT,IW,JA,KA,KM,KO,LO,LT,LV,MK,MN,MS,MY,NB,NE,NL,NO,PL,PT,RO,RU,SK,SL,SQ,SR,SV,TL,UK,VI,TE,TH,TR,XX,ZH
    */
    enum class Language(@get:JsonValue val value: kotlin.String) {

        afMinusZA("af-ZA"),
        arMinusSA("ar-SA"),
        bgMinusBG("bg-BG"),
        bnMinusIN("bn-IN"),
        csMinusCZ("cs-CZ"),
        daMinusDK("da-DK"),
        de("de"),
        elMinusGR("el-GR"),
        enMinusAU("en-AU"),
        enMinusCA("en-CA"),
        enMinusGB("en-GB"),
        enMinusIN("en-IN"),
        enMinusUS("en-US"),
        esMinus419("es-419"),
        esMinusAR("es-AR"),
        esMinusES("es-ES"),
        esMinusMX("es-MX"),
        fiMinusFI("fi-FI"),
        fr("fr"),
        frMinusCA("fr-CA"),
        heMinusIL("he-IL"),
        hiMinusIN("hi-IN"),
        hrMinusHR("hr-HR"),
        huMinusHU("hu-HU"),
        idMinusID("id-ID"),
        `it`("it"),
        ja("ja"),
        koMinusKR("ko-KR"),
        msMinusMY("ms-MY"),
        nbMinusNO("nb-NO"),
        nl("nl"),
        plMinusPL("pl-PL"),
        ptMinusBR("pt-BR"),
        ptMinusPT("pt-PT"),
        roMinusRO("ro-RO"),
        ruMinusRU("ru-RU"),
        skMinusSK("sk-SK"),
        svMinusSE("sv-SE"),
        teMinusIN("te-IN"),
        thMinusTH("th-TH"),
        tlMinusPH("tl-PH"),
        tr("tr"),
        ukMinusUA("uk-UA"),
        viMinusVN("vi-VN"),
        zhMinusCN("zh-CN"),
        zhMinusTW("zh-TW"),
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
        DE("DE"),
        EL("EL"),
        EN("EN"),
        ES("ES"),
        ET("ET"),
        FA("FA"),
        FI("FI"),
        FR("FR"),
        HE("HE"),
        HI("HI"),
        HR("HR"),
        HU("HU"),
        HY("HY"),
        ID("ID"),
        IN("IN"),
        IS("IS"),
        IT("IT"),
        IW("IW"),
        JA("JA"),
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
        NL("NL"),
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
        TR("TR"),
        XX("XX"),
        ZH("ZH");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Language {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsRetailBatchRequest'")
            }
        }
    }

}

