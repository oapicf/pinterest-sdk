package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BatchOperation
import org.openapitools.model.Country
import org.openapitools.model.ItemDeleteDiscontinuedBatchRecord
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
 * Request object to discontinue catalogs items
 * @param country 
 * @param items Array with catalogs items
 * @param language We recommend using the CatalogsLocale values.
 * @param operation 
 */
data class CatalogsItemsDeleteDiscontinuedBatchRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @Schema(example = "null", required = true, description = "Array with catalogs items")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<ItemDeleteDiscontinuedBatchRecord>,

    @Schema(example = "null", required = true, description = "We recommend using the CatalogsLocale values.")
    @get:JsonProperty("language", required = true) val language: CatalogsItemsDeleteDiscontinuedBatchRequest.Language,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: BatchOperation
) {

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsItemsDeleteDiscontinuedBatchRequest'")
            }
        }
    }

}

