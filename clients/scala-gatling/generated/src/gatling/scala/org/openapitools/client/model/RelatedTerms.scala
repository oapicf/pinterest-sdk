
package org.openapitools.client.model


case class RelatedTerms (
    /* First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" */
    _id: Option[String],
    /* Total number of related terms returned */
    _relatedTermCount: Option[Integer],
    /* The id of the advertiser. */
    _relatedTermsList: Option[List[RelatedTermsRelatedTermsListInner]]
)
object RelatedTerms {
    def toStringBody(var_id: Object, var_relatedTermCount: Object, var_relatedTermsList: Object) =
        s"""
        | {
        | "id":$var_id,"relatedTermCount":$var_relatedTermCount,"relatedTermsList":$var_relatedTermsList
        | }
        """.stripMargin
}
