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
* The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
* Values: UPDATE,UPSERT,CREATE,DELETE_DISCONTINUED,DELETE
*/
enum class BatchOperation(@get:JsonValue val value: kotlin.String) {

    UPDATE("UPDATE"),
    UPSERT("UPSERT"),
    CREATE("CREATE"),
    DELETE_DISCONTINUED("DELETE_DISCONTINUED"),
    DELETE("DELETE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): BatchOperation {
                return values().first{it -> it.value == value}
        }
    }
}

