
package org.openapitools.client.model


case class KeywordsCreate (
    /* Keywords */
    _keywords: List[KeywordCreateItem],
    /* Keyword data */
    _parentId: String
)
object KeywordsCreate {
    def toStringBody(var_keywords: Object, var_parentId: Object) =
        s"""
        | {
        | "keywords":$var_keywords,"parentId":$var_parentId
        | }
        """.stripMargin
}
