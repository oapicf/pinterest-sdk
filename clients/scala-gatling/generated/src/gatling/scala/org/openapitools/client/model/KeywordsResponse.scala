
package org.openapitools.client.model


case class KeywordsResponse (
    _errors: Option[List[KeywordError]],
    _keywords: Option[List[Keyword]]
)
object KeywordsResponse {
    def toStringBody(var_errors: Object, var_keywords: Object) =
        s"""
        | {
        | "errors":$var_errors,"keywords":$var_keywords
        | }
        """.stripMargin
}
