package org.openapitools.server.model


/**
 * @param eligible Advertiser eligible to create order lines for example: ''true''
 * @param canEdit Advertiser eligible to update order lines for example: ''true''
 * @param billtoInfos An array of Salesforce account information that includes address, io terms, etc. for example: ''null''
 * @param currency  for example: ''USD''
 * @param pmpNames  for example: ''null''
 * @param error Error indicator from Salesforce which could be \"No Error\" for example: ''No Error''
*/
final case class SSIOAccountResponse (
  eligible: Option[Boolean] = None,
  canEdit: Option[Boolean] = None,
  billtoInfos: Option[Seq[SSIOAccountItem]] = None,
  currency: Option[String] = None,
  pmpNames: Option[Seq[SSIOAccountPMPName]] = None,
  error: Option[String] = None
)

