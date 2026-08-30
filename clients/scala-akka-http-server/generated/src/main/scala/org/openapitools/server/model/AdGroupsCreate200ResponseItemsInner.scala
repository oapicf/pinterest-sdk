package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class AdGroupsCreate200ResponseItemsInner (
  data: Option[AdGroup] = None,
  exceptions: Option[Seq[BatchItemException]] = None
)

