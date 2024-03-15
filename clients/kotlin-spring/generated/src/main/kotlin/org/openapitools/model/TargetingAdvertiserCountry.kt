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
* Advertiser's ISO two character country code.
* Values: US,GB,CA,IE,AU,NZ,FR,SE,IL,DE,AT,IT,ES,NL,BE,PT,CH,HK,JP,KR,SG,NO,DK,FI,CY,LU,MT,PL,RO,HU,CZ,GR,SK,BR,MX,AR,CL,CO
*/
enum class TargetingAdvertiserCountry(val value: kotlin.String) {

    @JsonProperty("US") US("US"),
    @JsonProperty("GB") GB("GB"),
    @JsonProperty("CA") CA("CA"),
    @JsonProperty("IE") IE("IE"),
    @JsonProperty("AU") AU("AU"),
    @JsonProperty("NZ") NZ("NZ"),
    @JsonProperty("FR") FR("FR"),
    @JsonProperty("SE") SE("SE"),
    @JsonProperty("IL") IL("IL"),
    @JsonProperty("DE") DE("DE"),
    @JsonProperty("AT") AT("AT"),
    @JsonProperty("IT") IT("IT"),
    @JsonProperty("ES") ES("ES"),
    @JsonProperty("NL") NL("NL"),
    @JsonProperty("BE") BE("BE"),
    @JsonProperty("PT") PT("PT"),
    @JsonProperty("CH") CH("CH"),
    @JsonProperty("HK") HK("HK"),
    @JsonProperty("JP") JP("JP"),
    @JsonProperty("KR") KR("KR"),
    @JsonProperty("SG") SG("SG"),
    @JsonProperty("NO") NO("NO"),
    @JsonProperty("DK") DK("DK"),
    @JsonProperty("FI") FI("FI"),
    @JsonProperty("CY") CY("CY"),
    @JsonProperty("LU") LU("LU"),
    @JsonProperty("MT") MT("MT"),
    @JsonProperty("PL") PL("PL"),
    @JsonProperty("RO") RO("RO"),
    @JsonProperty("HU") HU("HU"),
    @JsonProperty("CZ") CZ("CZ"),
    @JsonProperty("GR") GR("GR"),
    @JsonProperty("SK") SK("SK"),
    @JsonProperty("BR") BR("BR"),
    @JsonProperty("MX") MX("MX"),
    @JsonProperty("AR") AR("AR"),
    @JsonProperty("CL") CL("CL"),
    @JsonProperty("CO") CO("CO")
}

