package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EventData
import org.openapitools.models.ObjectiveType
import scala.collection.immutable.Seq

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1}<br>Learn more about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience\" target=\"_blank\">engagement audiences</a>.
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param adUnderscoreid Ad ID for engagement audience filter.
 * @param campaignUnderscoreid Campaign ID for engagement audience filter.
 * @param country Valid countries include: \"US\", \"CA\", and \"GB\".
 * @param customerUnderscorelistUnderscoreid Customer list ID. For CUSTOMER_LIST `audience_type`.
 * @param engagementUnderscoredomain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
 * @param engagementUnderscoretype Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
 * @param engagerUnderscoretype Optional for ENGAGEMENT. Engager type value should be 1-2.
 * @param event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
 * @param eventUnderscoredata 
 * @param eventUnderscoresource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
 * @param ingestionUnderscoresource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
 * @param objectiveUnderscoretype Objective for engagement audience filter.
 * @param percentage Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
 * @param pinUnderscoreid IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
 * @param prefill Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
 * @param retentionUnderscoredays Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
 * @param seedUnderscoreid Audience ID(s). For ACTALIKE `audience_type`. 
 * @param url Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
 * @param visitorUnderscoresourceUnderscoreid The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
 */
case class AudienceRule(adUnderscoreaccountUnderscoreid: Option[String],
                adUnderscoreid: Option[Seq[String]],
                campaignUnderscoreid: Option[Seq[String]],
                country: Option[String],
                customerUnderscorelistUnderscoreid: Option[String],
                engagementUnderscoredomain: Option[Seq[String]],
                engagementUnderscoretype: Option[String],
                engagerUnderscoretype: Option[Int],
                event: Option[String],
                eventUnderscoredata: Option[EventData],
                eventUnderscoresource: Option[Object],
                ingestionUnderscoresource: Option[Object],
                objectiveUnderscoretype: Option[Seq[ObjectiveType]],
                percentage: Option[Int],
                pinUnderscoreid: Option[Seq[String]],
                prefill: Option[Boolean],
                retentionUnderscoredays: Option[Int],
                seedUnderscoreid: Option[Seq[String]],
                url: Option[Seq[String]],
                visitorUnderscoresourceUnderscoreid: Option[String]
                )

object AudienceRule {
    /**
     * Creates the codec for converting AudienceRule from and to JSON.
     */
    implicit val decoder: Decoder[AudienceRule] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceRule] = deriveEncoder
}
