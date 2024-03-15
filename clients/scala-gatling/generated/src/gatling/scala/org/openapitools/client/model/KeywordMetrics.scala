
package org.openapitools.client.model


case class KeywordMetrics (
    /* Average cost per click */
    _avgCpcInMicroCurrency: Option[Number],
    /* Keyword's search frequency. This value is based on keyword frequency in pepsi client response */
    _keywordQueryVolume: Option[String]
)
object KeywordMetrics {
    def toStringBody(var_avgCpcInMicroCurrency: Object, var_keywordQueryVolume: Object) =
        s"""
        | {
        | "avgCpcInMicroCurrency":$var_avgCpcInMicroCurrency,"keywordQueryVolume":$var_keywordQueryVolume
        | }
        """.stripMargin
}
