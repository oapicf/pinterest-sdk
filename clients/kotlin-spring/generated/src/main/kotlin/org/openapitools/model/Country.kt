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
* Country ID from ISO 3166-1 alpha-2.
* Values: aD,aE,aF,aG,aI,aL,aM,aO,aQ,aR,aS,aT,aU,aW,aX,aZ,bA,bB,bD,bE,bF,bG,bH,bI,bJ,bL,bM,bN,bO,bQ,bR,bS,bT,bV,bW,bY,bZ,cA,cC,cD,cF,cG,cH,cI,cK,cL,cM,cO,cR,cU,cV,cW,cX,cY,cZ,dE,dJ,dK,dM,dO,dZ,eC,eE,eG,eH,eR,eS,eT,fI,fJ,fK,fM,fO,fR,gA,gB,gD,gE,gF,gG,gH,gI,gL,gM,gN,gP,gQ,gR,gS,gT,gU,gW,gY,hK,hM,hN,hR,hT,hU,iD,iE,iL,iM,iN,iO,iQ,iR,iS,iT,jE,jM,jO,jP,kE,kG,kH,kI,kM,kN,kR,kW,kY,kZ,lA,lB,lC,lI,lK,lR,lS,lT,lU,lV,lY,mA,mC,mD,mE,mF,mG,mH,mK,mL,mM,mN,mO,mP,mQ,mR,mS,mT,mU,mV,mW,mX,mY,mZ,nA,nC,nE,nF,nG,nI,nL,nO,nP,nR,nU,nZ,oM,pA,pE,pF,pG,pH,pK,pL,pM,pN,pR,pS,pT,pW,pY,qA,rE,rO,rS,rU,rW,sA,sB,sC,sD,sE,sG,sH,sI,sJ,sK,sL,sM,sN,sO,sR,sS,sT,sV,sX,sY,sZ,tC,tD,tF,tG,tH,tJ,tK,tL,tM,tN,tO,tR,tT,tV,tW,tZ,uA,uG,uM,uS,uY,uZ,vA,vC,vE,vG,vI,vN,vU,wF,wS,yE,yT,zA,zM,zW
*/
enum class Country(val value: kotlin.String) {

    @JsonProperty("AD") aD("AD"),

    @JsonProperty("AE") aE("AE"),

    @JsonProperty("AF") aF("AF"),

    @JsonProperty("AG") aG("AG"),

    @JsonProperty("AI") aI("AI"),

    @JsonProperty("AL") aL("AL"),

    @JsonProperty("AM") aM("AM"),

    @JsonProperty("AO") aO("AO"),

    @JsonProperty("AQ") aQ("AQ"),

    @JsonProperty("AR") aR("AR"),

    @JsonProperty("AS") aS("AS"),

    @JsonProperty("AT") aT("AT"),

    @JsonProperty("AU") aU("AU"),

    @JsonProperty("AW") aW("AW"),

    @JsonProperty("AX") aX("AX"),

    @JsonProperty("AZ") aZ("AZ"),

    @JsonProperty("BA") bA("BA"),

    @JsonProperty("BB") bB("BB"),

    @JsonProperty("BD") bD("BD"),

    @JsonProperty("BE") bE("BE"),

    @JsonProperty("BF") bF("BF"),

    @JsonProperty("BG") bG("BG"),

    @JsonProperty("BH") bH("BH"),

    @JsonProperty("BI") bI("BI"),

    @JsonProperty("BJ") bJ("BJ"),

    @JsonProperty("BL") bL("BL"),

    @JsonProperty("BM") bM("BM"),

    @JsonProperty("BN") bN("BN"),

    @JsonProperty("BO") bO("BO"),

    @JsonProperty("BQ") bQ("BQ"),

    @JsonProperty("BR") bR("BR"),

    @JsonProperty("BS") bS("BS"),

    @JsonProperty("BT") bT("BT"),

    @JsonProperty("BV") bV("BV"),

    @JsonProperty("BW") bW("BW"),

    @JsonProperty("BY") bY("BY"),

    @JsonProperty("BZ") bZ("BZ"),

    @JsonProperty("CA") cA("CA"),

    @JsonProperty("CC") cC("CC"),

    @JsonProperty("CD") cD("CD"),

    @JsonProperty("CF") cF("CF"),

    @JsonProperty("CG") cG("CG"),

    @JsonProperty("CH") cH("CH"),

    @JsonProperty("CI") cI("CI"),

    @JsonProperty("CK") cK("CK"),

    @JsonProperty("CL") cL("CL"),

    @JsonProperty("CM") cM("CM"),

    @JsonProperty("CO") cO("CO"),

    @JsonProperty("CR") cR("CR"),

    @JsonProperty("CU") cU("CU"),

    @JsonProperty("CV") cV("CV"),

    @JsonProperty("CW") cW("CW"),

    @JsonProperty("CX") cX("CX"),

    @JsonProperty("CY") cY("CY"),

    @JsonProperty("CZ") cZ("CZ"),

    @JsonProperty("DE") dE("DE"),

    @JsonProperty("DJ") dJ("DJ"),

    @JsonProperty("DK") dK("DK"),

    @JsonProperty("DM") dM("DM"),

    @JsonProperty("DO") dO("DO"),

    @JsonProperty("DZ") dZ("DZ"),

    @JsonProperty("EC") eC("EC"),

    @JsonProperty("EE") eE("EE"),

    @JsonProperty("EG") eG("EG"),

    @JsonProperty("EH") eH("EH"),

    @JsonProperty("ER") eR("ER"),

    @JsonProperty("ES") eS("ES"),

    @JsonProperty("ET") eT("ET"),

    @JsonProperty("FI") fI("FI"),

    @JsonProperty("FJ") fJ("FJ"),

    @JsonProperty("FK") fK("FK"),

    @JsonProperty("FM") fM("FM"),

    @JsonProperty("FO") fO("FO"),

    @JsonProperty("FR") fR("FR"),

    @JsonProperty("GA") gA("GA"),

    @JsonProperty("GB") gB("GB"),

    @JsonProperty("GD") gD("GD"),

    @JsonProperty("GE") gE("GE"),

    @JsonProperty("GF") gF("GF"),

    @JsonProperty("GG") gG("GG"),

    @JsonProperty("GH") gH("GH"),

    @JsonProperty("GI") gI("GI"),

    @JsonProperty("GL") gL("GL"),

    @JsonProperty("GM") gM("GM"),

    @JsonProperty("GN") gN("GN"),

    @JsonProperty("GP") gP("GP"),

    @JsonProperty("GQ") gQ("GQ"),

    @JsonProperty("GR") gR("GR"),

    @JsonProperty("GS") gS("GS"),

    @JsonProperty("GT") gT("GT"),

    @JsonProperty("GU") gU("GU"),

    @JsonProperty("GW") gW("GW"),

    @JsonProperty("GY") gY("GY"),

    @JsonProperty("HK") hK("HK"),

    @JsonProperty("HM") hM("HM"),

    @JsonProperty("HN") hN("HN"),

    @JsonProperty("HR") hR("HR"),

    @JsonProperty("HT") hT("HT"),

    @JsonProperty("HU") hU("HU"),

    @JsonProperty("ID") iD("ID"),

    @JsonProperty("IE") iE("IE"),

    @JsonProperty("IL") iL("IL"),

    @JsonProperty("IM") iM("IM"),

    @JsonProperty("IN") iN("IN"),

    @JsonProperty("IO") iO("IO"),

    @JsonProperty("IQ") iQ("IQ"),

    @JsonProperty("IR") iR("IR"),

    @JsonProperty("IS") iS("IS"),

    @JsonProperty("IT") iT("IT"),

    @JsonProperty("JE") jE("JE"),

    @JsonProperty("JM") jM("JM"),

    @JsonProperty("JO") jO("JO"),

    @JsonProperty("JP") jP("JP"),

    @JsonProperty("KE") kE("KE"),

    @JsonProperty("KG") kG("KG"),

    @JsonProperty("KH") kH("KH"),

    @JsonProperty("KI") kI("KI"),

    @JsonProperty("KM") kM("KM"),

    @JsonProperty("KN") kN("KN"),

    @JsonProperty("KR") kR("KR"),

    @JsonProperty("KW") kW("KW"),

    @JsonProperty("KY") kY("KY"),

    @JsonProperty("KZ") kZ("KZ"),

    @JsonProperty("LA") lA("LA"),

    @JsonProperty("LB") lB("LB"),

    @JsonProperty("LC") lC("LC"),

    @JsonProperty("LI") lI("LI"),

    @JsonProperty("LK") lK("LK"),

    @JsonProperty("LR") lR("LR"),

    @JsonProperty("LS") lS("LS"),

    @JsonProperty("LT") lT("LT"),

    @JsonProperty("LU") lU("LU"),

    @JsonProperty("LV") lV("LV"),

    @JsonProperty("LY") lY("LY"),

    @JsonProperty("MA") mA("MA"),

    @JsonProperty("MC") mC("MC"),

    @JsonProperty("MD") mD("MD"),

    @JsonProperty("ME") mE("ME"),

    @JsonProperty("MF") mF("MF"),

    @JsonProperty("MG") mG("MG"),

    @JsonProperty("MH") mH("MH"),

    @JsonProperty("MK") mK("MK"),

    @JsonProperty("ML") mL("ML"),

    @JsonProperty("MM") mM("MM"),

    @JsonProperty("MN") mN("MN"),

    @JsonProperty("MO") mO("MO"),

    @JsonProperty("MP") mP("MP"),

    @JsonProperty("MQ") mQ("MQ"),

    @JsonProperty("MR") mR("MR"),

    @JsonProperty("MS") mS("MS"),

    @JsonProperty("MT") mT("MT"),

    @JsonProperty("MU") mU("MU"),

    @JsonProperty("MV") mV("MV"),

    @JsonProperty("MW") mW("MW"),

    @JsonProperty("MX") mX("MX"),

    @JsonProperty("MY") mY("MY"),

    @JsonProperty("MZ") mZ("MZ"),

    @JsonProperty("NA") nA("NA"),

    @JsonProperty("NC") nC("NC"),

    @JsonProperty("NE") nE("NE"),

    @JsonProperty("NF") nF("NF"),

    @JsonProperty("NG") nG("NG"),

    @JsonProperty("NI") nI("NI"),

    @JsonProperty("NL") nL("NL"),

    @JsonProperty("NO") nO("NO"),

    @JsonProperty("NP") nP("NP"),

    @JsonProperty("NR") nR("NR"),

    @JsonProperty("NU") nU("NU"),

    @JsonProperty("NZ") nZ("NZ"),

    @JsonProperty("OM") oM("OM"),

    @JsonProperty("PA") pA("PA"),

    @JsonProperty("PE") pE("PE"),

    @JsonProperty("PF") pF("PF"),

    @JsonProperty("PG") pG("PG"),

    @JsonProperty("PH") pH("PH"),

    @JsonProperty("PK") pK("PK"),

    @JsonProperty("PL") pL("PL"),

    @JsonProperty("PM") pM("PM"),

    @JsonProperty("PN") pN("PN"),

    @JsonProperty("PR") pR("PR"),

    @JsonProperty("PS") pS("PS"),

    @JsonProperty("PT") pT("PT"),

    @JsonProperty("PW") pW("PW"),

    @JsonProperty("PY") pY("PY"),

    @JsonProperty("QA") qA("QA"),

    @JsonProperty("RE") rE("RE"),

    @JsonProperty("RO") rO("RO"),

    @JsonProperty("RS") rS("RS"),

    @JsonProperty("RU") rU("RU"),

    @JsonProperty("RW") rW("RW"),

    @JsonProperty("SA") sA("SA"),

    @JsonProperty("SB") sB("SB"),

    @JsonProperty("SC") sC("SC"),

    @JsonProperty("SD") sD("SD"),

    @JsonProperty("SE") sE("SE"),

    @JsonProperty("SG") sG("SG"),

    @JsonProperty("SH") sH("SH"),

    @JsonProperty("SI") sI("SI"),

    @JsonProperty("SJ") sJ("SJ"),

    @JsonProperty("SK") sK("SK"),

    @JsonProperty("SL") sL("SL"),

    @JsonProperty("SM") sM("SM"),

    @JsonProperty("SN") sN("SN"),

    @JsonProperty("SO") sO("SO"),

    @JsonProperty("SR") sR("SR"),

    @JsonProperty("SS") sS("SS"),

    @JsonProperty("ST") sT("ST"),

    @JsonProperty("SV") sV("SV"),

    @JsonProperty("SX") sX("SX"),

    @JsonProperty("SY") sY("SY"),

    @JsonProperty("SZ") sZ("SZ"),

    @JsonProperty("TC") tC("TC"),

    @JsonProperty("TD") tD("TD"),

    @JsonProperty("TF") tF("TF"),

    @JsonProperty("TG") tG("TG"),

    @JsonProperty("TH") tH("TH"),

    @JsonProperty("TJ") tJ("TJ"),

    @JsonProperty("TK") tK("TK"),

    @JsonProperty("TL") tL("TL"),

    @JsonProperty("TM") tM("TM"),

    @JsonProperty("TN") tN("TN"),

    @JsonProperty("TO") tO("TO"),

    @JsonProperty("TR") tR("TR"),

    @JsonProperty("TT") tT("TT"),

    @JsonProperty("TV") tV("TV"),

    @JsonProperty("TW") tW("TW"),

    @JsonProperty("TZ") tZ("TZ"),

    @JsonProperty("UA") uA("UA"),

    @JsonProperty("UG") uG("UG"),

    @JsonProperty("UM") uM("UM"),

    @JsonProperty("US") uS("US"),

    @JsonProperty("UY") uY("UY"),

    @JsonProperty("UZ") uZ("UZ"),

    @JsonProperty("VA") vA("VA"),

    @JsonProperty("VC") vC("VC"),

    @JsonProperty("VE") vE("VE"),

    @JsonProperty("VG") vG("VG"),

    @JsonProperty("VI") vI("VI"),

    @JsonProperty("VN") vN("VN"),

    @JsonProperty("VU") vU("VU"),

    @JsonProperty("WF") wF("WF"),

    @JsonProperty("WS") wS("WS"),

    @JsonProperty("YE") yE("YE"),

    @JsonProperty("YT") yT("YT"),

    @JsonProperty("ZA") zA("ZA"),

    @JsonProperty("ZM") zM("ZM"),

    @JsonProperty("ZW") zW("ZW");

}

