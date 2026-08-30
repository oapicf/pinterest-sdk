package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsItemValidationErrors
import org.openapitools.server.api.model.CatalogsItemValidationWarnings
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemValidationIssues(
    val errors: CatalogsItemValidationErrors,
    /** The merchant-created unique ID that represents the product. */
    val itemId: kotlin.String,
    /** Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. */
    val itemNumber: kotlin.Int,
    val warnings: CatalogsItemValidationWarnings
)
