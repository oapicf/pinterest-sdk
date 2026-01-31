
package org.openapitools.client.model


case class KeywordMetrics (
    /* Keyword's search frequency. This value is based on keyword frequency in pepsi client response */
    _keywordQueryVolume: Option[String]
)
object KeywordMetrics {
    def toStringBody(var_keywordQueryVolume: Object) =
        s"""
        | {
        | "keywordQueryVolume":$var_keywordQueryVolume
        | }
        """.stripMargin
}
