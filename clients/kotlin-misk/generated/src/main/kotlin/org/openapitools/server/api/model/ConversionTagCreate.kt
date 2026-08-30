package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionTagCreate(
    /** Conversion tag name. */
    val name: kotlin.String,
    /** Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    val aemDbEnabled: kotlin.Boolean? = false,
    /** Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    val aemEnabled: kotlin.Boolean? = false,
    /** Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    val aemExternalIdEnabled: kotlin.Boolean? = false,
    /** Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    val aemFnlnEnabled: kotlin.Boolean? = false,
    /** Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    val aemGeEnabled: kotlin.Boolean? = false,
    /** Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    val aemLocEnabled: kotlin.Boolean? = false,
    /** Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    val aemPhEnabled: kotlin.Boolean? = false,
    /** Metadata ingestion frequency. */
    val mdFrequency: java.math.BigDecimal? = java.math.BigDecimal("1")
)
