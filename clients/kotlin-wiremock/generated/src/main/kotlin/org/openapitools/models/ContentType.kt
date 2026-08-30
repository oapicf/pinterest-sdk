@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ContentType {
    @JsonProperty(value = "image/jpeg") imageSlashJpeg,
    @JsonProperty(value = "image/png") imageSlashPng,
}
