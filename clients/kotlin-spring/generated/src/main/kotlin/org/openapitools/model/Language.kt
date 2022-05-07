package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
* Language code, which is among the offical ISO 639-1 language list.
* Values: aM,aR,aZ,bG,bN,bS,cA,cS,dA,dV,dZ,dE,eL,eN,eS,eT,fA,fI,fR,hE,hI,hR,hU,hY,iD,iN,iS,iT,iW,jA,kA,kM,kO,lO,lT,lV,mK,mN,mS,mY,nB,nE,nL,nO,pL,pT,rO,rU,sK,sL,sQ,sR,sV,tL,uK,vI,tE,tH,tR,xX,zH
*/
enum class Language(val value: kotlin.String) {

    @JsonProperty("AM") aM("AM"),

    @JsonProperty("AR") aR("AR"),

    @JsonProperty("AZ") aZ("AZ"),

    @JsonProperty("BG") bG("BG"),

    @JsonProperty("BN") bN("BN"),

    @JsonProperty("BS") bS("BS"),

    @JsonProperty("CA") cA("CA"),

    @JsonProperty("CS") cS("CS"),

    @JsonProperty("DA") dA("DA"),

    @JsonProperty("DV") dV("DV"),

    @JsonProperty("DZ") dZ("DZ"),

    @JsonProperty("DE") dE("DE"),

    @JsonProperty("EL") eL("EL"),

    @JsonProperty("EN") eN("EN"),

    @JsonProperty("ES") eS("ES"),

    @JsonProperty("ET") eT("ET"),

    @JsonProperty("FA") fA("FA"),

    @JsonProperty("FI") fI("FI"),

    @JsonProperty("FR") fR("FR"),

    @JsonProperty("HE") hE("HE"),

    @JsonProperty("HI") hI("HI"),

    @JsonProperty("HR") hR("HR"),

    @JsonProperty("HU") hU("HU"),

    @JsonProperty("HY") hY("HY"),

    @JsonProperty("ID") iD("ID"),

    @JsonProperty("IN") iN("IN"),

    @JsonProperty("IS") iS("IS"),

    @JsonProperty("IT") iT("IT"),

    @JsonProperty("IW") iW("IW"),

    @JsonProperty("JA") jA("JA"),

    @JsonProperty("KA") kA("KA"),

    @JsonProperty("KM") kM("KM"),

    @JsonProperty("KO") kO("KO"),

    @JsonProperty("LO") lO("LO"),

    @JsonProperty("LT") lT("LT"),

    @JsonProperty("LV") lV("LV"),

    @JsonProperty("MK") mK("MK"),

    @JsonProperty("MN") mN("MN"),

    @JsonProperty("MS") mS("MS"),

    @JsonProperty("MY") mY("MY"),

    @JsonProperty("NB") nB("NB"),

    @JsonProperty("NE") nE("NE"),

    @JsonProperty("NL") nL("NL"),

    @JsonProperty("NO") nO("NO"),

    @JsonProperty("PL") pL("PL"),

    @JsonProperty("PT") pT("PT"),

    @JsonProperty("RO") rO("RO"),

    @JsonProperty("RU") rU("RU"),

    @JsonProperty("SK") sK("SK"),

    @JsonProperty("SL") sL("SL"),

    @JsonProperty("SQ") sQ("SQ"),

    @JsonProperty("SR") sR("SR"),

    @JsonProperty("SV") sV("SV"),

    @JsonProperty("TL") tL("TL"),

    @JsonProperty("UK") uK("UK"),

    @JsonProperty("VI") vI("VI"),

    @JsonProperty("TE") tE("TE"),

    @JsonProperty("TH") tH("TH"),

    @JsonProperty("TR") tR("TR"),

    @JsonProperty("XX") xX("XX"),

    @JsonProperty("ZH") zH("ZH");

}

