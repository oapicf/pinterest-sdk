
package org.openapitools.client.model


case class RelatedTermsRelatedTermsListInner (
    _term: Option[String],
    _relatedTerms: Option[List[String]]
)
object RelatedTermsRelatedTermsListInner {
    def toStringBody(var_term: Object, var_relatedTerms: Object) =
        s"""
        | {
        | "term":$var_term,"relatedTerms":$var_relatedTerms
        | }
        """.stripMargin
}
