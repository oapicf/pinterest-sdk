package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequestAccessesInner
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
 * 
 * @param accesses List of members asset access to be deleted
 */
data class BusinessMembersAssetAccessDeleteRequest(

    @field:Valid
    @get:Size(min=1,max=100) 
    @Schema(example = "null", required = true, description = "List of members asset access to be deleted")
    @get:JsonProperty("accesses", required = true) val accesses: kotlin.collections.List<BusinessMembersAssetAccessDeleteRequestAccessesInner>
    ) {

}

