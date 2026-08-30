package org.openapitools.server.model


/**
 * @param relatedTerms  for example: ''null''
 * @param term  for example: ''null''
*/
final case class RelatedTermsRelatedTermsListItems (
  relatedTerms: Option[Seq[String]] = None,
  term: Option[String] = None
)

