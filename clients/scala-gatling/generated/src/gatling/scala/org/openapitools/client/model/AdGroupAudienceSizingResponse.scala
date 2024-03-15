
package org.openapitools.client.model


case class AdGroupAudienceSizingResponse (
    /* The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. */
    _audienceSizeLowerBound: Option[Number],
    /* The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. */
    _audienceSizeUpperBound: Option[Number]
)
object AdGroupAudienceSizingResponse {
    def toStringBody(var_audienceSizeLowerBound: Object, var_audienceSizeUpperBound: Object) =
        s"""
        | {
        | "audienceSizeLowerBound":$var_audienceSizeLowerBound,"audienceSizeUpperBound":$var_audienceSizeUpperBound
        | }
        """.stripMargin
}
