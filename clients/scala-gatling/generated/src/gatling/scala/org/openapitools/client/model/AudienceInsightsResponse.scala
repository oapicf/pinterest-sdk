
package org.openapitools.client.model


case class AudienceInsightsResponse (
    /* Category interest distribution */
    _categories: Option[List[AudienceCategory]],
    _demographics: Option[AudienceDemographics],
    _type: Option[AudienceInsightType],
    /* Generation date */
    _date: Option[String],
    /* Population count. */
    _size: Option[Integer],
    /* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
    _sizeIsUpperBound: Option[Boolean]
)
object AudienceInsightsResponse {
    def toStringBody(var_categories: Object, var_demographics: Object, var_type: Object, var_date: Object, var_size: Object, var_sizeIsUpperBound: Object) =
        s"""
        | {
        | "categories":$var_categories,"demographics":$var_demographics,"type":$var_type,"date":$var_date,"size":$var_size,"sizeIsUpperBound":$var_sizeIsUpperBound
        | }
        """.stripMargin
}
