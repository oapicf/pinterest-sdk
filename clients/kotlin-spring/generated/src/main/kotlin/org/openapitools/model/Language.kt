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
* Language code, which is among the offical ISO 639-1 language list.
* Values: AM,AR,AZ,BG,BN,BS,CA,CS,DA,DV,DZ,DE,EL,EN,ES,ET,FA,FI,FR,HE,HI,HR,HU,HY,ID,IN,IS,IT,IW,JA,KA,KM,KO,LO,LT,LV,MK,MN,MS,MY,NB,NE,NL,NO,PL,PT,RO,RU,SK,SL,SQ,SR,SV,TL,UK,VI,TE,TH,TR,XX,ZH
*/
enum class Language(val value: kotlin.String) {

    @JsonProperty("AM") AM("AM"),
    @JsonProperty("AR") AR("AR"),
    @JsonProperty("AZ") AZ("AZ"),
    @JsonProperty("BG") BG("BG"),
    @JsonProperty("BN") BN("BN"),
    @JsonProperty("BS") BS("BS"),
    @JsonProperty("CA") CA("CA"),
    @JsonProperty("CS") CS("CS"),
    @JsonProperty("DA") DA("DA"),
    @JsonProperty("DV") DV("DV"),
    @JsonProperty("DZ") DZ("DZ"),
    @JsonProperty("DE") DE("DE"),
    @JsonProperty("EL") EL("EL"),
    @JsonProperty("EN") EN("EN"),
    @JsonProperty("ES") ES("ES"),
    @JsonProperty("ET") ET("ET"),
    @JsonProperty("FA") FA("FA"),
    @JsonProperty("FI") FI("FI"),
    @JsonProperty("FR") FR("FR"),
    @JsonProperty("HE") HE("HE"),
    @JsonProperty("HI") HI("HI"),
    @JsonProperty("HR") HR("HR"),
    @JsonProperty("HU") HU("HU"),
    @JsonProperty("HY") HY("HY"),
    @JsonProperty("ID") ID("ID"),
    @JsonProperty("IN") IN("IN"),
    @JsonProperty("IS") IS("IS"),
    @JsonProperty("IT") IT("IT"),
    @JsonProperty("IW") IW("IW"),
    @JsonProperty("JA") JA("JA"),
    @JsonProperty("KA") KA("KA"),
    @JsonProperty("KM") KM("KM"),
    @JsonProperty("KO") KO("KO"),
    @JsonProperty("LO") LO("LO"),
    @JsonProperty("LT") LT("LT"),
    @JsonProperty("LV") LV("LV"),
    @JsonProperty("MK") MK("MK"),
    @JsonProperty("MN") MN("MN"),
    @JsonProperty("MS") MS("MS"),
    @JsonProperty("MY") MY("MY"),
    @JsonProperty("NB") NB("NB"),
    @JsonProperty("NE") NE("NE"),
    @JsonProperty("NL") NL("NL"),
    @JsonProperty("NO") NO("NO"),
    @JsonProperty("PL") PL("PL"),
    @JsonProperty("PT") PT("PT"),
    @JsonProperty("RO") RO("RO"),
    @JsonProperty("RU") RU("RU"),
    @JsonProperty("SK") SK("SK"),
    @JsonProperty("SL") SL("SL"),
    @JsonProperty("SQ") SQ("SQ"),
    @JsonProperty("SR") SR("SR"),
    @JsonProperty("SV") SV("SV"),
    @JsonProperty("TL") TL("TL"),
    @JsonProperty("UK") UK("UK"),
    @JsonProperty("VI") VI("VI"),
    @JsonProperty("TE") TE("TE"),
    @JsonProperty("TH") TH("TH"),
    @JsonProperty("TR") TR("TR"),
    @JsonProperty("XX") XX("XX"),
    @JsonProperty("ZH") ZH("ZH")
}

