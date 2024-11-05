package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BusinessAccessUserSummary
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
 * @param id Asset Group ID.
 * @param assetGroupName Asset Group name
 * @param assetGroupDescription Asset group description
 * @param assetGroupTypes Asset group types
 * @param adAccountsIds A list of ad account IDs under the asset group
 * @param profilesIds A list of profile IDs under asset group
 * @param createdTime The creation time of the asset group
 * @param updatedTime The last update time of the asset group
 * @param owner The data of the business that owns the asset group.
 * @param createdBy The data of the user that created the asset group.
 */
data class AssetGroupBinding(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "666791336903426391", description = "Asset Group ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "Canada Ad Accounts", description = "Asset Group name")
    @get:JsonProperty("asset_group_name") val assetGroupName: kotlin.String? = null,

    @Schema(example = "Asset group that has ad accounts used in Canada", description = "Asset group description")
    @get:JsonProperty("asset_group_description") val assetGroupDescription: kotlin.String? = null,

    @Schema(example = "[\"LOCATION_OR_LANGUAGE\"]", description = "Asset group types")
    @get:JsonProperty("asset_group_types") val assetGroupTypes: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "[\"549755885175\"]", description = "A list of ad account IDs under the asset group")
    @get:JsonProperty("ad_accounts_ids") val adAccountsIds: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "[\"630433785246278264\"]", description = "A list of profile IDs under asset group")
    @get:JsonProperty("profiles_ids") val profilesIds: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "1646767577816", description = "The creation time of the asset group")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @Schema(example = "1646767577816", description = "The last update time of the asset group")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "The data of the business that owns the asset group.")
    @get:JsonProperty("owner") val owner: BusinessAccessUserSummary? = null,

    @field:Valid
    @Schema(example = "null", description = "The data of the user that created the asset group.")
    @get:JsonProperty("created_by") val createdBy: BusinessAccessUserSummary? = null
    ) {

}

