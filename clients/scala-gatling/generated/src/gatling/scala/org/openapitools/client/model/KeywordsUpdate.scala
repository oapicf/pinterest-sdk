
package org.openapitools.client.model


case class KeywordsUpdate (
    /* Keywords */
    _keywords: Option[List[KeywordUpdateItem]]
)
object KeywordsUpdate {
    def toStringBody(var_keywords: Object) =
        s"""
        | {
        | "keywords":$var_keywords
        | }
        """.stripMargin
}
