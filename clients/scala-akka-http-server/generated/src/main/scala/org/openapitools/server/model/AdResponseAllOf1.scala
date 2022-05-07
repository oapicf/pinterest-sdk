package org.openapitools.server.model


/**
 * @param adAccountId The ID of the advertiser that this ad belongs to. for example: ''549755885175''
 * @param campaignId ID of the ad campaign that contains this ad. for example: ''626735565838''
 * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer. for example: ''null''
 * @param createdTime Pin creation time. Unix timestamp in seconds. for example: ''1451431341''
 * @param id The ID of this ad. for example: ''687195134316''
 * @param rejectedReasons Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". for example: ''null''
 * @param rejectionLabels Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". for example: ''null''
 * @param reviewStatus Ad review status for example: ''PENDING''
 * @param `type` Always \"ad\". for example: ''pinpromotion''
 * @param updatedTime Last update time. Unix timestamp in seconds. for example: ''1451431341''
 * @param summaryStatus Ad summary status for example: ''null''
*/
final case class AdResponseAllOf1 (
  adAccountId: Option[String],
  campaignId: Option[String],
  collectionItemsDestinationUrlTemplate: Option[String],
  createdTime: Option[Int],
  id: Option[String],
  rejectedReasons: Option[Seq[String]],
  rejectionLabels: Option[Seq[String]],
  reviewStatus: Option[String],
  `type`: Option[String],
  updatedTime: Option[Int],
  summaryStatus: Option[PinPromotionSummaryStatus]
)

