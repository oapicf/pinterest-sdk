
package org.openapitools.client.model


case class TrendsEditorial (
    /* URL of the editorial board */
    _boardUrl: String,
    /* Description of the editorial article */
    _description: String,
    /* List of interests related to the editorial article */
    _interests: List[String],
    /* URL of the pins related to the editorial article */
    _pinsUrl: List[String],
    /* List of keywords related to the editorial article */
    _relatedKeywords: List[KeywordInfo],
    /* Title of the editorial article */
    _title: String
)
object TrendsEditorial {
    def toStringBody(var_boardUrl: Object, var_description: Object, var_interests: Object, var_pinsUrl: Object, var_relatedKeywords: Object, var_title: Object) =
        s"""
        | {
        | "boardUrl":$var_boardUrl,"description":$var_description,"interests":$var_interests,"pinsUrl":$var_pinsUrl,"relatedKeywords":$var_relatedKeywords,"title":$var_title
        | }
        """.stripMargin
}
