package org.openapitools.server.model


/**
 * @param relatedTerms  for example: ''["shoes","cute clothes"]''
 * @param term  for example: ''clothes''
*/
final case class RelatedTermsRelatedTermsListInner (
  relatedTerms: Option[Seq[String]] = None,
  term: Option[String] = None
)

