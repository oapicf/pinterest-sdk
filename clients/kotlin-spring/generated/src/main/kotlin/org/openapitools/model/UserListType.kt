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
* User list type
* Values: EMAIL,IDFA,MAID,LR_ID,DLX_ID,HASHED_PINNER_ID
*/
enum class UserListType(val value: kotlin.String) {

    @JsonProperty("EMAIL") EMAIL("EMAIL"),
    @JsonProperty("IDFA") IDFA("IDFA"),
    @JsonProperty("MAID") MAID("MAID"),
    @JsonProperty("LR_ID") LR_ID("LR_ID"),
    @JsonProperty("DLX_ID") DLX_ID("DLX_ID"),
    @JsonProperty("HASHED_PINNER_ID") HASHED_PINNER_ID("HASHED_PINNER_ID")
}

