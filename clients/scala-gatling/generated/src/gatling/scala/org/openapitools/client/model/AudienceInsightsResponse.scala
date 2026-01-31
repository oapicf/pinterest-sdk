
package org.openapitools.client.model


case class AudienceInsightsResponse (
    /* Category interest distribution */
    _categories: Option[List[AudienceCategory]],
    /* Generation date */
    _date: Option[String],
    _demographics: Option[AudienceDemographics],
    /* Population count. */
    _size: Option[Integer],
    /* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
    _sizeIsUpperBound: Option[Boolean],
    _type: Option[AudienceInsightType]
)
object AudienceInsightsResponse {
    def toStringBody(var_categories: Object, var_date: Object, var_demographics: Object, var_size: Object, var_sizeIsUpperBound: Object, var_type: Object) =
        s"""
        | {
        | "categories":$var_categories,"date":$var_date,"demographics":$var_demographics,"size":$var_size,"sizeIsUpperBound":$var_sizeIsUpperBound,"type":$var_type
        | }
        """.stripMargin
}
