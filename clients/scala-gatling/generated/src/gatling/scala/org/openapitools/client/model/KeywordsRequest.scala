
package org.openapitools.client.model


case class KeywordsRequest (
    /* Keyword JSON array. Each array element has 3 fields */
    _keywords: List[KeywordsCommon],
    /* Keyword parent entity ID (advertiser, campaign, ad group). */
    _parentId: String
)
object KeywordsRequest {
    def toStringBody(var_keywords: Object, var_parentId: Object) =
        s"""
        | {
        | "keywords":$var_keywords,"parentId":$var_parentId
        | }
        """.stripMargin
}
