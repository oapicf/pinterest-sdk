@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TrendsSupportedRegion {
    @JsonProperty(value = "US") US,
    @JsonProperty(value = "CA") CA,
    @JsonProperty(value = "DE") DE,
    @JsonProperty(value = "FR") FR,
    @JsonProperty(value = "ES") ES,
    @JsonProperty(value = "IT") IT,
    @JsonProperty(value = "DE+AT+CH") DEPlusATPlusCH,
    @JsonProperty(value = "GB+IE") GBPlusIE,
    @JsonProperty(value = "IT+ES+PT+GR+MT") ITPlusESPlusPTPlusGRPlusMT,
    @JsonProperty(value = "PL+RO+HU+SK+CZ") PLPlusROPlusHUPlusSKPlusCZ,
    @JsonProperty(value = "SE+DK+FI+NO") SEPlusDKPlusFIPlusNO,
    @JsonProperty(value = "NL+BE+LU") NLPlusBEPlusLU,
    @JsonProperty(value = "AR") AR,
    @JsonProperty(value = "BR") BR,
    @JsonProperty(value = "CO") CO,
    @JsonProperty(value = "MX") MX,
    @JsonProperty(value = "MX+AR+CO+CL") MXPlusARPlusCOPlusCL,
    @JsonProperty(value = "AU+NZ") AUPlusNZ,
}
