package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param contentType 
 * @param key 
 * @param policy 
 * @param xAmzAlgorithm 
 * @param xAmzCredential 
 * @param xAmzDate 
 * @param xAmzSecurityToken 
 * @param xAmzSignature 
 */
data class MediaUploadParameters(

    @Schema(example = "multipart/form-data", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("Content-Type")
    @get:JsonProperty("Content-Type") val contentType: kotlin.String? = null,

    @Schema(example = "uploads/11/aa/22/3:video:203014033110991560:5212123920968240771", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("key")
    @get:JsonProperty("key") val key: kotlin.String? = null,

    @Schema(example = "eyJleHBpcmF0aW9uIjoiMj..==", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("policy")
    @get:JsonProperty("policy") val policy: kotlin.String? = null,

    @Schema(example = "AWS4-HMAC-SHA256", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("x-amz-algorithm")
    @get:JsonProperty("x-amz-algorithm") val xAmzAlgorithm: kotlin.String? = null,

    @Schema(example = "ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("x-amz-credential")
    @get:JsonProperty("x-amz-credential") val xAmzCredential: kotlin.String? = null,

    @Schema(example = "20220127T185143Z", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("x-amz-date")
    @get:JsonProperty("x-amz-date") val xAmzDate: kotlin.String? = null,

    @Schema(example = "IQoJb3JpZ2luX2VjEJr...==", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("x-amz-security-token")
    @get:JsonProperty("x-amz-security-token") val xAmzSecurityToken: kotlin.String? = null,

    @Schema(example = "fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("x-amz-signature")
    @get:JsonProperty("x-amz-signature") val xAmzSignature: kotlin.String? = null
) {

}

