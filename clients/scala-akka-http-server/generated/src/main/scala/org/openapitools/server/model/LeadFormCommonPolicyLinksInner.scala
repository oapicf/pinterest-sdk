package org.openapitools.server.model


/**
 * @param label Policy label for an additional policy link. for example: ''null''
 * @param link Policy link for an additional policy link. for example: ''null''
*/
final case class LeadFormCommonPolicyLinksInner (
  label: Option[String] = None,
  link: Option[String] = None
)

