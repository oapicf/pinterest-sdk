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
* Advertiser's ISO two character country code.
* Values: US,GB,CA,IE,AU,NZ,FR,SE,IL,DE,AT,IT,ES,NL,BE,PT,CH,HK,JP,KR,SG,NO,DK,FI,CY,LU,MT,PL,RO,HU,CZ,GR,SK,BR,MX,AR,CL,CO
*/
enum class TargetingAdvertiserCountry(@get:JsonValue val value: kotlin.String) {

    US("US"),
    GB("GB"),
    CA("CA"),
    IE("IE"),
    AU("AU"),
    NZ("NZ"),
    FR("FR"),
    SE("SE"),
    IL("IL"),
    DE("DE"),
    AT("AT"),
    IT("IT"),
    ES("ES"),
    NL("NL"),
    BE("BE"),
    PT("PT"),
    CH("CH"),
    HK("HK"),
    JP("JP"),
    KR("KR"),
    SG("SG"),
    NO("NO"),
    DK("DK"),
    FI("FI"),
    CY("CY"),
    LU("LU"),
    MT("MT"),
    PL("PL"),
    RO("RO"),
    HU("HU"),
    CZ("CZ"),
    GR("GR"),
    SK("SK"),
    BR("BR"),
    MX("MX"),
    AR("AR"),
    CL("CL"),
    CO("CO");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): TargetingAdvertiserCountry {
                return values().first{it -> it.value == value}
        }
    }
}

