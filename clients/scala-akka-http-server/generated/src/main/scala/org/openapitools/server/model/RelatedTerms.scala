package org.openapitools.server.model


/**
 * @param id First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" for example: ''clothes''
 * @param relatedTermCount Total number of related terms returned for example: ''2''
 * @param relatedTermsList The id of the advertiser. for example: ''null''
*/
final case class RelatedTerms (
  id: Option[String] = None,
  relatedTermCount: Option[Int] = None,
  relatedTermsList: Option[Seq[RelatedTermsRelatedTermsListInner]] = None
)

