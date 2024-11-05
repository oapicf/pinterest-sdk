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
* Currency Codes from ISO 4217
* Values: UNK,USD,GBP,CAD,EUR,AUD,NZD,SEK,ILS,CHF,HKD,JPY,SGD,KRW,NOK,DKK,PLN,RON,HUF,CZK,BRL,MXN,ARS,CLP,COP,INR,TRY
*/
enum class Currency(@get:JsonValue val value: kotlin.String) {

    UNK("UNK"),
    USD("USD"),
    GBP("GBP"),
    CAD("CAD"),
    EUR("EUR"),
    AUD("AUD"),
    NZD("NZD"),
    SEK("SEK"),
    ILS("ILS"),
    CHF("CHF"),
    HKD("HKD"),
    JPY("JPY"),
    SGD("SGD"),
    KRW("KRW"),
    NOK("NOK"),
    DKK("DKK"),
    PLN("PLN"),
    RON("RON"),
    HUF("HUF"),
    CZK("CZK"),
    BRL("BRL"),
    MXN("MXN"),
    ARS("ARS"),
    CLP("CLP"),
    COP("COP"),
    INR("INR"),
    TRY("TRY");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): Currency {
                return values().first{it -> it.value == value}
        }
    }
}

