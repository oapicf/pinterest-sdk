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
* Values: US,CA,DE,FR,ES,IT,DEPlusATPlusCH,GBPlusIE,ITPlusESPlusPTPlusGRPlusMT,PLPlusROPlusHUPlusSKPlusCZ,SEPlusDKPlusFIPlusNO,NLPlusBEPlusLU,AR,BR,CO,MX,MXPlusARPlusCOPlusCL,AUPlusNZ
*/
enum class TrendsSupportedRegion(val value: kotlin.String) {

    @JsonProperty("US") US("US"),
    @JsonProperty("CA") CA("CA"),
    @JsonProperty("DE") DE("DE"),
    @JsonProperty("FR") FR("FR"),
    @JsonProperty("ES") ES("ES"),
    @JsonProperty("IT") IT("IT"),
    @JsonProperty("DE+AT+CH") DEPlusATPlusCH("DE+AT+CH"),
    @JsonProperty("GB+IE") GBPlusIE("GB+IE"),
    @JsonProperty("IT+ES+PT+GR+MT") ITPlusESPlusPTPlusGRPlusMT("IT+ES+PT+GR+MT"),
    @JsonProperty("PL+RO+HU+SK+CZ") PLPlusROPlusHUPlusSKPlusCZ("PL+RO+HU+SK+CZ"),
    @JsonProperty("SE+DK+FI+NO") SEPlusDKPlusFIPlusNO("SE+DK+FI+NO"),
    @JsonProperty("NL+BE+LU") NLPlusBEPlusLU("NL+BE+LU"),
    @JsonProperty("AR") AR("AR"),
    @JsonProperty("BR") BR("BR"),
    @JsonProperty("CO") CO("CO"),
    @JsonProperty("MX") MX("MX"),
    @JsonProperty("MX+AR+CO+CL") MXPlusARPlusCOPlusCL("MX+AR+CO+CL"),
    @JsonProperty("AU+NZ") AUPlusNZ("AU+NZ")
}

