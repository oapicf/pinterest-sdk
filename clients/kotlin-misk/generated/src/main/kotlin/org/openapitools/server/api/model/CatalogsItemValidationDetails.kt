package org.openapitools.server.api.model

import org.openapitools.server.api.model.NullableCatalogsItemFieldType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemValidationDetails(
    /** Attribute that has a validation issue. */
    val attributeName: NullableCatalogsItemFieldType,
    /** Provided value that caused the validation issue. */
    val providedValue: kotlin.String
)
