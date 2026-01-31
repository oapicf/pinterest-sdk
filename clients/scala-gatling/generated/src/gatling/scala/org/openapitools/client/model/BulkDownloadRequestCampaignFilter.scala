
package org.openapitools.client.model


case class BulkDownloadRequestCampaignFilter (
    _campaignStatus: Option[List[CampaignSummaryStatus]],
    /* Unix UTC timestamp. */
    _endTime: Option[String],
    /* Campaign name */
    _name: Option[String],
    _objectiveType: Option[List[ObjectiveType]],
    /* Unix UTC timestamp. */
    _startTime: Option[String]
)
object BulkDownloadRequestCampaignFilter {
    def toStringBody(var_campaignStatus: Object, var_endTime: Object, var_name: Object, var_objectiveType: Object, var_startTime: Object) =
        s"""
        | {
        | "campaignStatus":$var_campaignStatus,"endTime":$var_endTime,"name":$var_name,"objectiveType":$var_objectiveType,"startTime":$var_startTime
        | }
        """.stripMargin
}
