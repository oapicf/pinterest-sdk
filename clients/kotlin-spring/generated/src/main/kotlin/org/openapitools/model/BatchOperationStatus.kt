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
* The status of the operation performed by the batch
* Values: pROCESSING,cOMPLETED
*/
enum class BatchOperationStatus(val value: kotlin.String) {

    @JsonProperty("PROCESSING") pROCESSING("PROCESSING"),

    @JsonProperty("COMPLETED") cOMPLETED("COMPLETED");

}

