
package org.openapitools.client.model


case class TrendingTopic (
    /* Description of the trending topic */
    _description: String,
    /* Unique identifier for the trending topic */
    _id: String,
    /* Month-over-month growth percentage */
    _percentGrowthMom: Option[Integer],
    /* Array of pin images related to this trend (up to 6) */
    _pins: List[TrendingPin],
    /* List of related interest categories */
    _relatedInterests: List[String],
    /* List of related search terms */
    _relatedSearches: List[String],
    /* Time series data showing trend values over time, with dates as keys and values as numeric */
    _timeSeries: Map[String, Number],
    /* Title of the trending topic */
    _title: String
)
object TrendingTopic {
    def toStringBody(var_description: Object, var_id: Object, var_percentGrowthMom: Object, var_pins: Object, var_relatedInterests: Object, var_relatedSearches: Object, var_timeSeries: Object, var_title: Object) =
        s"""
        | {
        | "description":$var_description,"id":$var_id,"percentGrowthMom":$var_percentGrowthMom,"pins":$var_pins,"relatedInterests":$var_relatedInterests,"relatedSearches":$var_relatedSearches,"timeSeries":$var_timeSeries,"title":$var_title
        | }
        """.stripMargin
}
