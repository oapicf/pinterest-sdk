package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateAssetAccessRequestBodyAssetRequestsInner
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
 * An object containing a list of all the asset access requests
 * @param assetRequests 
 */
data class CreateAssetAccessRequestBody(

    @field:Valid
    @get:Size(min=1,max=100) 
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("asset_requests", required = true) val assetRequests: kotlin.collections.List<CreateAssetAccessRequestBodyAssetRequestsInner>
    ) {

}

