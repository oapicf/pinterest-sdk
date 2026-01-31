package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTypeFilter.
  * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTypeFilter(
  targetingTypes: Option[TargetingTypeFilter.TargetingTypes.Value]
)

object TargetingTypeFilter {
  implicit lazy val targetingTypeFilterJsonFormat: Format[TargetingTypeFilter] = Json.format[TargetingTypeFilter]

  // noinspection TypeAnnotation
  object TargetingTypes extends Enumeration {
    val KEYWORD = Value("KEYWORD")
    val APPTYPE = Value("APPTYPE")
    val GENDER = Value("GENDER")
    val LOCATION = Value("LOCATION")
    val PLACEMENT = Value("PLACEMENT")
    val COUNTRY = Value("COUNTRY")
    val TARGETEDINTEREST = Value("TARGETED_INTEREST")
    val PINNERINTEREST = Value("PINNER_INTEREST")
    val AUDIENCEINCLUDE = Value("AUDIENCE_INCLUDE")
    val GEO = Value("GEO")
    val AGEBUCKET = Value("AGE_BUCKET")
    val REGION = Value("REGION")
    val MEDIATYPE = Value("MEDIA_TYPE")
    val AGEBUCKETANDGENDER = Value("AGE_BUCKET_AND_GENDER")
    val AUDIENCEMULTIPLIER = Value("AUDIENCE_MULTIPLIER")
    val CREATIVEENHANCEMENTS = Value("CREATIVE_ENHANCEMENTS")
    val LOCALADSSTORECODE = Value("LOCAL_ADS_STORE_CODE")

    type TargetingTypes = Value
    implicit lazy val TargetingTypesJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

