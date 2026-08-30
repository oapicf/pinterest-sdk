package org.openapitools.server.model


/**
 * Information of the published editorial article.
 *
 * @param boardUrl URL of the editorial board for example: ''null''
 * @param description Description of the editorial article for example: ''null''
 * @param interests List of interests related to the editorial article for example: ''null''
 * @param pinsUrl URL of the pins related to the editorial article for example: ''null''
 * @param relatedKeywords List of keywords related to the editorial article for example: ''null''
 * @param title Title of the editorial article for example: ''null''
*/
final case class TrendsEditorial (
  boardUrl: String,
  description: String,
  interests: Seq[String],
  pinsUrl: Seq[String],
  relatedKeywords: Seq[KeywordInfo],
  title: String
)

