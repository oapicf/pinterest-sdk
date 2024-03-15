package org.openapitools.server.model


/**
 * @param term  for example: ''clothes''
 * @param relatedTerms  for example: ''["shoes","cute clothes"]''
*/
final case class RelatedTermsRelatedTermsListInner (
  term: Option[String] = None,
  relatedTerms: Option[Seq[String]] = None
)

