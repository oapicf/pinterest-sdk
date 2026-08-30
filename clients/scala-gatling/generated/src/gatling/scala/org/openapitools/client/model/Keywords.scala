
package org.openapitools.client.model


case class Keywords (
    /* Keyword error */
    _errors: List[KeywordError],
    /* Keywords */
    _keywords: List[Keyword]
)
object Keywords {
    def toStringBody(var_errors: Object, var_keywords: Object) =
        s"""
        | {
        | "errors":$var_errors,"keywords":$var_keywords
        | }
        """.stripMargin
}
