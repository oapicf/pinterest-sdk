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
* The file format of a feed.
* Values: tSV,cSV,xML
*/
enum class CatalogsFormat(val value: kotlin.String) {

    @JsonProperty("TSV") tSV("TSV"),

    @JsonProperty("CSV") cSV("CSV"),

    @JsonProperty("XML") xML("XML");

}

