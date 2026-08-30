package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AudienceSubcategory
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
 * @param id Interest ID.
 * @param index Interest affinity index.
 * @param key Interest unique key (same as ID).
 * @param name Interest name.
 * @param ratio Interest's percent of category's total audience.
 * @param subcategories Subcategory interest distribution
 */
data class AudienceCategory(

    @Schema(example = "1234567", description = "Interest ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "1.2", description = "Interest affinity index.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("index")
    @get:JsonProperty("index") val index: java.math.BigDecimal? = null,

    @Schema(example = "1234567", description = "Interest unique key (same as ID).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("key")
    @get:JsonProperty("key") val key: kotlin.String? = null,

    @Schema(example = "travel", description = "Interest name.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "0.551", description = "Interest's percent of category's total audience.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ratio")
    @get:JsonProperty("ratio") val ratio: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "Subcategory interest distribution")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("subcategories")
    @get:JsonProperty("subcategories") val subcategories: kotlin.collections.List<AudienceSubcategory>? = null
) {

}

