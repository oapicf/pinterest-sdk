package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class ItemsIssuesList200Response (
  items: Seq[CatalogsItemValidationIssues],
  bookmark: Option[String] = None
)

