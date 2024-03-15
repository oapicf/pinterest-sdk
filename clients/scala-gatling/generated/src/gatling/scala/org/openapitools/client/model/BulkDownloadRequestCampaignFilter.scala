
package org.openapitools.client.model


case class BulkDownloadRequestCampaignFilter (
    /* Unix UTC timestamp. */
    _startTime: Option[String],
    /* Unix UTC timestamp. */
    _endTime: Option[String],
    /* Campaign name */
    _name: Option[String],
    _campaignStatus: Option[List[CampaignSummaryStatus]],
    _objectiveType: Option[List[ObjectiveType]]
)
object BulkDownloadRequestCampaignFilter {
    def toStringBody(var_startTime: Object, var_endTime: Object, var_name: Object, var_campaignStatus: Object, var_objectiveType: Object) =
        s"""
        | {
        | "startTime":$var_startTime,"endTime":$var_endTime,"name":$var_name,"campaignStatus":$var_campaignStatus,"objectiveType":$var_objectiveType
        | }
        """.stripMargin
}
