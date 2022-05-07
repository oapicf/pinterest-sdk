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
* The operation performed by the batch
* Values: uPDATE,cREATE,uPSERT
*/
enum class BatchOperation(val value: kotlin.String) {

    @JsonProperty("UPDATE") uPDATE("UPDATE"),

    @JsonProperty("CREATE") cREATE("CREATE"),

    @JsonProperty("UPSERT") uPSERT("UPSERT");

}

