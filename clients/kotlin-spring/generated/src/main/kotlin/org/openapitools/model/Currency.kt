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
* Currency Codes from ISO 4217
* Values: uNK,uSD,gBP,cAD,eUR,aUD,nZD,sEK,iLS,cHF,hKD,jPY,sGD,kRW,nOK,dKK,pLN,rON,hUF,cZK,bRL,mXN,aRS,cLP,cOP
*/
enum class Currency(val value: kotlin.String) {

    @JsonProperty("UNK") uNK("UNK"),

    @JsonProperty("USD") uSD("USD"),

    @JsonProperty("GBP") gBP("GBP"),

    @JsonProperty("CAD") cAD("CAD"),

    @JsonProperty("EUR") eUR("EUR"),

    @JsonProperty("AUD") aUD("AUD"),

    @JsonProperty("NZD") nZD("NZD"),

    @JsonProperty("SEK") sEK("SEK"),

    @JsonProperty("ILS") iLS("ILS"),

    @JsonProperty("CHF") cHF("CHF"),

    @JsonProperty("HKD") hKD("HKD"),

    @JsonProperty("JPY") jPY("JPY"),

    @JsonProperty("SGD") sGD("SGD"),

    @JsonProperty("KRW") kRW("KRW"),

    @JsonProperty("NOK") nOK("NOK"),

    @JsonProperty("DKK") dKK("DKK"),

    @JsonProperty("PLN") pLN("PLN"),

    @JsonProperty("RON") rON("RON"),

    @JsonProperty("HUF") hUF("HUF"),

    @JsonProperty("CZK") cZK("CZK"),

    @JsonProperty("BRL") bRL("BRL"),

    @JsonProperty("MXN") mXN("MXN"),

    @JsonProperty("ARS") aRS("ARS"),

    @JsonProperty("CLP") cLP("CLP"),

    @JsonProperty("COP") cOP("COP");

}

