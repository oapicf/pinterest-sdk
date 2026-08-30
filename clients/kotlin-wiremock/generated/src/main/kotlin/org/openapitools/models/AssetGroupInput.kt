@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupInput(
    @field:JsonProperty("asset_group")
    val assetGroup: AssetGroupBinding? = null,

)
