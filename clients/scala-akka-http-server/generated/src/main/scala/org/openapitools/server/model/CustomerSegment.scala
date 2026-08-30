package org.openapitools.server.model


/**
 * @param adAccountId The ID of the ad account that this customer segment belongs to. for example: ''null''
 * @param audienceIds Audience IDs included in the customer segment. for example: ''null''
 * @param createdTime Customer segment created time. Unix timestamp in seconds. for example: ''null''
 * @param id Customer segment ID. for example: ''null''
 * @param name Customer segment name. for example: ''null''
 * @param status Indicates whether the customer segment is active or deleted. for example: ''null''
 * @param updatedTime Customer segment updated time. Unix timestamp in seconds. for example: ''null''
*/
final case class CustomerSegment (
  adAccountId: Option[String] = None,
  audienceIds: Seq[String],
  createdTime: Option[Int] = None,
  id: Option[String] = None,
  name: String,
  status: Option[TargetingTemplateStatus] = None,
  updatedTime: Option[Int] = None
)

