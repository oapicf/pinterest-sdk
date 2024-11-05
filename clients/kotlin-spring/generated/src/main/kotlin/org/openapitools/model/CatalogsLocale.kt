package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
* 
* Values: afMinusZA,arMinusSA,bgMinusBG,bnMinusIN,csMinusCZ,daMinusDK,de,elMinusGR,enMinusAU,enMinusCA,enMinusGB,enMinusIN,enMinusUS,esMinus419,esMinusAR,esMinusES,esMinusMX,fiMinusFI,fr,frMinusCA,heMinusIL,hiMinusIN,hrMinusHR,huMinusHU,idMinusID,`it`,ja,koMinusKR,msMinusMY,nbMinusNO,nl,plMinusPL,ptMinusBR,ptMinusPT,roMinusRO,ruMinusRU,skMinusSK,svMinusSE,teMinusIN,thMinusTH,tlMinusPH,tr,ukMinusUA,viMinusVN,zhMinusCN,zhMinusTW
*/
enum class CatalogsLocale(@get:JsonValue val value: kotlin.String) {

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
    zhMinusTW("zh-TW");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CatalogsLocale {
                return values().first{it -> it.value == value}
        }
    }
}

