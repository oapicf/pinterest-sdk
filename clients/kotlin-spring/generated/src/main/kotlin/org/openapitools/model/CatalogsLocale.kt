package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
enum class CatalogsLocale(val value: kotlin.String) {

    @JsonProperty("af-ZA") afMinusZA("af-ZA"),
    @JsonProperty("ar-SA") arMinusSA("ar-SA"),
    @JsonProperty("bg-BG") bgMinusBG("bg-BG"),
    @JsonProperty("bn-IN") bnMinusIN("bn-IN"),
    @JsonProperty("cs-CZ") csMinusCZ("cs-CZ"),
    @JsonProperty("da-DK") daMinusDK("da-DK"),
    @JsonProperty("de") de("de"),
    @JsonProperty("el-GR") elMinusGR("el-GR"),
    @JsonProperty("en-AU") enMinusAU("en-AU"),
    @JsonProperty("en-CA") enMinusCA("en-CA"),
    @JsonProperty("en-GB") enMinusGB("en-GB"),
    @JsonProperty("en-IN") enMinusIN("en-IN"),
    @JsonProperty("en-US") enMinusUS("en-US"),
    @JsonProperty("es-419") esMinus419("es-419"),
    @JsonProperty("es-AR") esMinusAR("es-AR"),
    @JsonProperty("es-ES") esMinusES("es-ES"),
    @JsonProperty("es-MX") esMinusMX("es-MX"),
    @JsonProperty("fi-FI") fiMinusFI("fi-FI"),
    @JsonProperty("fr") fr("fr"),
    @JsonProperty("fr-CA") frMinusCA("fr-CA"),
    @JsonProperty("he-IL") heMinusIL("he-IL"),
    @JsonProperty("hi-IN") hiMinusIN("hi-IN"),
    @JsonProperty("hr-HR") hrMinusHR("hr-HR"),
    @JsonProperty("hu-HU") huMinusHU("hu-HU"),
    @JsonProperty("id-ID") idMinusID("id-ID"),
    @JsonProperty("it") `it`("it"),
    @JsonProperty("ja") ja("ja"),
    @JsonProperty("ko-KR") koMinusKR("ko-KR"),
    @JsonProperty("ms-MY") msMinusMY("ms-MY"),
    @JsonProperty("nb-NO") nbMinusNO("nb-NO"),
    @JsonProperty("nl") nl("nl"),
    @JsonProperty("pl-PL") plMinusPL("pl-PL"),
    @JsonProperty("pt-BR") ptMinusBR("pt-BR"),
    @JsonProperty("pt-PT") ptMinusPT("pt-PT"),
    @JsonProperty("ro-RO") roMinusRO("ro-RO"),
    @JsonProperty("ru-RU") ruMinusRU("ru-RU"),
    @JsonProperty("sk-SK") skMinusSK("sk-SK"),
    @JsonProperty("sv-SE") svMinusSE("sv-SE"),
    @JsonProperty("te-IN") teMinusIN("te-IN"),
    @JsonProperty("th-TH") thMinusTH("th-TH"),
    @JsonProperty("tl-PH") tlMinusPH("tl-PH"),
    @JsonProperty("tr") tr("tr"),
    @JsonProperty("uk-UA") ukMinusUA("uk-UA"),
    @JsonProperty("vi-VN") viMinusVN("vi-VN"),
    @JsonProperty("zh-CN") zhMinusCN("zh-CN"),
    @JsonProperty("zh-TW") zhMinusTW("zh-TW")
}

