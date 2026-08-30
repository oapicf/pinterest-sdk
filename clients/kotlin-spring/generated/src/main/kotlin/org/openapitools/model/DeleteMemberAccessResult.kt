package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * The terminated asset access.
 * @param assetId Unique identifier of the business asset.
 * @param memberId Unique identifier of the business member.
 */
data class DeleteMemberAccessResult(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Unique identifier of the business asset.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_id")
    @get:JsonProperty("asset_id") val assetId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "140943737684417", description = "Unique identifier of the business member.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("member_id")
    @get:JsonProperty("member_id") val memberId: kotlin.String? = null
) {

}

