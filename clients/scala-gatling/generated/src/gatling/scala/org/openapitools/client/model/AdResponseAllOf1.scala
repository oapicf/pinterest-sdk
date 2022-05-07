
package org.openapitools.client.model


case class AdResponseAllOf1 (
    /* The ID of the advertiser that this ad belongs to. */
    _adAccountId: Option[String],
    /* ID of the ad campaign that contains this ad. */
    _campaignId: Option[String],
    /* Destination URL template for all items within a collections drawer. */
    _collectionItemsDestinationUrlTemplate: Option[String],
    /* Pin creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* The ID of this ad. */
    _id: Option[String],
    /* Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
    _rejectedReasons: Option[List[String]],
    /* Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
    _rejectionLabels: Option[List[String]],
    /* Ad review status */
    _reviewStatus: Option[String],
    /* Always \"ad\". */
    _type: Option[String],
    /* Last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer],
    /* Ad summary status */
    _summaryStatus: Option[PinPromotionSummaryStatus]
)
object AdResponseAllOf1 {
    def toStringBody(var_adAccountId: Object, var_campaignId: Object, var_collectionItemsDestinationUrlTemplate: Object, var_createdTime: Object, var_id: Object, var_rejectedReasons: Object, var_rejectionLabels: Object, var_reviewStatus: Object, var_type: Object, var_updatedTime: Object, var_summaryStatus: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"campaignId":$var_campaignId,"collectionItemsDestinationUrlTemplate":$var_collectionItemsDestinationUrlTemplate,"createdTime":$var_createdTime,"id":$var_id,"rejectedReasons":$var_rejectedReasons,"rejectionLabels":$var_rejectionLabels,"reviewStatus":$var_reviewStatus,"type":$var_type,"updatedTime":$var_updatedTime,"summaryStatus":$var_summaryStatus
        | }
        """.stripMargin
}
