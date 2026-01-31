
package org.openapitools.client.model


case class RelatedTermsRelatedTermsListInner (
    _relatedTerms: Option[List[String]],
    _term: Option[String]
)
object RelatedTermsRelatedTermsListInner {
    def toStringBody(var_relatedTerms: Object, var_term: Object) =
        s"""
        | {
        | "relatedTerms":$var_relatedTerms,"term":$var_term
        | }
        """.stripMargin
}
