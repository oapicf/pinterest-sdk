package org.openapitools.server.model


/**
 * @param billtoInfos An array of Salesforce account information that includes address, io terms, etc. for example: ''null''
 * @param canEdit Advertiser eligible to update order lines for example: ''true''
 * @param currency  for example: ''USD''
 * @param eligible Advertiser eligible to create order lines for example: ''true''
 * @param error Error indicator from Salesforce which could be \"No Error\" for example: ''No Error''
 * @param pmpNames  for example: ''null''
*/
final case class SSIOAccountResponse (
  billtoInfos: Option[Seq[SSIOAccountItem]] = None,
  canEdit: Option[Boolean] = None,
  currency: Option[String] = None,
  eligible: Option[Boolean] = None,
  error: Option[String] = None,
  pmpNames: Option[Seq[SSIOAccountPMPName]] = None
)

