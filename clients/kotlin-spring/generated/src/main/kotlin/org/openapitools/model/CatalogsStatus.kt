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
* Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
* Values: aCTIVE,iNACTIVE
*/
enum class CatalogsStatus(val value: kotlin.String) {

    @JsonProperty("ACTIVE") aCTIVE("ACTIVE"),

    @JsonProperty("INACTIVE") iNACTIVE("INACTIVE");

}

