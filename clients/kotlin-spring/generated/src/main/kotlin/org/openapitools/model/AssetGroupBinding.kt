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
 * @param adAccountsIds A list of ad account IDs under the asset group
 * @param assetGroupDescription Asset group description
 * @param assetGroupName Asset Group name
 * @param assetGroupTypes Asset group types
 * @param catalogsIds A list of catalog IDs under asset group
 * @param createdBy The data of the user that created the asset group.
 * @param createdTime The creation time of the asset group
 * @param id Asset Group ID.
 * @param owner The data of the business that owns the asset group.
 * @param profilesIds A list of profile IDs under asset group
 * @param updatedTime The last update time of the asset group
 */
data class AssetGroupBinding(

    @Schema(example = "[\"549755885175\"]", required = true, description = "A list of ad account IDs under the asset group")
    @param:JsonProperty("ad_accounts_ids")
    @get:JsonProperty("ad_accounts_ids", required = true) val adAccountsIds: kotlin.collections.List<kotlin.String>,

    @Schema(example = "Asset group that has ad accounts used in Canada", required = true, description = "Asset group description")
    @param:JsonProperty("asset_group_description")
    @get:JsonProperty("asset_group_description", required = true) val assetGroupDescription: kotlin.String?,

    @Schema(example = "Canada Ad Accounts", required = true, description = "Asset Group name")
    @param:JsonProperty("asset_group_name")
    @get:JsonProperty("asset_group_name", required = true) val assetGroupName: kotlin.String?,

    @Schema(example = "[\"LOCATION_OR_LANGUAGE\"]", required = true, description = "Asset group types")
    @param:JsonProperty("asset_group_types")
    @get:JsonProperty("asset_group_types", required = true) val assetGroupTypes: kotlin.collections.List<kotlin.String>,

    @Schema(example = "[\"4836859046874\"]", required = true, description = "A list of catalog IDs under asset group")
    @param:JsonProperty("catalogs_ids")
    @get:JsonProperty("catalogs_ids", required = true) val catalogsIds: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(required = true, description = "The data of the user that created the asset group.")
    @param:JsonProperty("created_by")
    @get:JsonProperty("created_by", required = true) val createdBy: BusinessAccessUserSummary,

    @Schema(example = "1646767577816", required = true, description = "The creation time of the asset group")
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time", required = true) val createdTime: kotlin.Int?,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "666791336903426391", required = true, description = "Asset Group ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The data of the business that owns the asset group.")
    @param:JsonProperty("owner")
    @get:JsonProperty("owner", required = true) val owner: BusinessAccessUserSummary,

    @Schema(example = "[\"630433785246278264\"]", required = true, description = "A list of profile IDs under asset group")
    @param:JsonProperty("profiles_ids")
    @get:JsonProperty("profiles_ids", required = true) val profilesIds: kotlin.collections.List<kotlin.String>,

    @Schema(example = "1646767577816", required = true, description = "The last update time of the asset group")
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time", required = true) val updatedTime: kotlin.Int?
) {

}

