/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file format of a feed.
 *
 * Values: TSV,CSV,XML
 */

@JsonClass(generateAdapter = false)
enum class CatalogsFormat(val value: kotlin.String) {

    @Json(name = "TSV")
    TSV("TSV"),

    @Json(name = "CSV")
    CSV("CSV"),

    @Json(name = "XML")
    XML("XML");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CatalogsFormat) "$data" else null

        /**
         * Returns a valid [CatalogsFormat] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CatalogsFormat? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
