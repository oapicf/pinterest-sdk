package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 * @param xAmzDate 
 * @param xAmzSignature 
 * @param xAmzSecurityToken 
 * @param xAmzAlgorithm 
 * @param key 
 * @param policy 
 * @param xAmzCredential 
 * @param contentType 
 */
data class MediaUploadAllOfUploadParameters(

    @field:JsonProperty("x-amz-date") val xAmzDate: kotlin.String? = null,

    @field:JsonProperty("x-amz-signature") val xAmzSignature: kotlin.String? = null,

    @field:JsonProperty("x-amz-security-token") val xAmzSecurityToken: kotlin.String? = null,

    @field:JsonProperty("x-amz-algorithm") val xAmzAlgorithm: kotlin.String? = null,

    @field:JsonProperty("key") val key: kotlin.String? = null,

    @field:JsonProperty("policy") val policy: kotlin.String? = null,

    @field:JsonProperty("x-amz-credential") val xAmzCredential: kotlin.String? = null,

    @field:JsonProperty("Content-Type") val contentType: kotlin.String? = null
) {

}

