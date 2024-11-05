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
* Values: US,CA,DE,FR,ES,IT,DEPlusATPlusCH,GBPlusIE,ITPlusESPlusPTPlusGRPlusMT,PLPlusROPlusHUPlusSKPlusCZ,SEPlusDKPlusFIPlusNO,NLPlusBEPlusLU,AR,BR,CO,MX,MXPlusARPlusCOPlusCL,AUPlusNZ
*/
enum class TrendsSupportedRegion(@get:JsonValue val value: kotlin.String) {

    US("US"),
    CA("CA"),
    DE("DE"),
    FR("FR"),
    ES("ES"),
    IT("IT"),
    DEPlusATPlusCH("DE+AT+CH"),
    GBPlusIE("GB+IE"),
    ITPlusESPlusPTPlusGRPlusMT("IT+ES+PT+GR+MT"),
    PLPlusROPlusHUPlusSKPlusCZ("PL+RO+HU+SK+CZ"),
    SEPlusDKPlusFIPlusNO("SE+DK+FI+NO"),
    NLPlusBEPlusLU("NL+BE+LU"),
    AR("AR"),
    BR("BR"),
    CO("CO"),
    MX("MX"),
    MXPlusARPlusCOPlusCL("MX+AR+CO+CL"),
    AUPlusNZ("AU+NZ");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): TrendsSupportedRegion {
                return values().first{it -> it.value == value}
        }
    }
}

