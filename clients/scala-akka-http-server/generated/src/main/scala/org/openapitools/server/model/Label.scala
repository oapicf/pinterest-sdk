package org.openapitools.server.model


/**
 * @param id Label ID. for example: ''1106385754497''
 * @param labelType  for example: ''null''
 * @param parentId Label parent entity ID. for example: ''626753052072''
 * @param parentType Label parent entity type. for example: ''CAMPAIGN''
 * @param status  for example: ''null''
 * @param value Label name. for example: ''null''
*/
final case class Label (
  id: Option[String] = None,
  labelType: Option[LabelType] = None,
  parentId: Option[String] = None,
  parentType: Option[String] = None,
  status: Option[LabelStatus] = None,
  value: Option[String] = None
)

