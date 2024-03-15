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
* Currency Codes from ISO 4217
* Values: UNK,USD,GBP,CAD,EUR,AUD,NZD,SEK,ILS,CHF,HKD,JPY,SGD,KRW,NOK,DKK,PLN,RON,HUF,CZK,BRL,MXN,ARS,CLP,COP
*/
enum class Currency(val value: kotlin.String) {

    @JsonProperty("UNK") UNK("UNK"),
    @JsonProperty("USD") USD("USD"),
    @JsonProperty("GBP") GBP("GBP"),
    @JsonProperty("CAD") CAD("CAD"),
    @JsonProperty("EUR") EUR("EUR"),
    @JsonProperty("AUD") AUD("AUD"),
    @JsonProperty("NZD") NZD("NZD"),
    @JsonProperty("SEK") SEK("SEK"),
    @JsonProperty("ILS") ILS("ILS"),
    @JsonProperty("CHF") CHF("CHF"),
    @JsonProperty("HKD") HKD("HKD"),
    @JsonProperty("JPY") JPY("JPY"),
    @JsonProperty("SGD") SGD("SGD"),
    @JsonProperty("KRW") KRW("KRW"),
    @JsonProperty("NOK") NOK("NOK"),
    @JsonProperty("DKK") DKK("DKK"),
    @JsonProperty("PLN") PLN("PLN"),
    @JsonProperty("RON") RON("RON"),
    @JsonProperty("HUF") HUF("HUF"),
    @JsonProperty("CZK") CZK("CZK"),
    @JsonProperty("BRL") BRL("BRL"),
    @JsonProperty("MXN") MXN("MXN"),
    @JsonProperty("ARS") ARS("ARS"),
    @JsonProperty("CLP") CLP("CLP"),
    @JsonProperty("COP") COP("COP")
}

