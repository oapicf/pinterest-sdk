/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class SSIOAccountResponse(
  /* Advertiser eligible to create order lines */
  eligible: Option[Boolean],

  /* Advertiser eligible to update order lines */
  canEdit: Option[Boolean],

  /* An array of Salesforce account information that includes address, io terms, etc. */
  billtoInfos: Option[List[SSIOAccountItem]],

  currency: Option[String],

  pmpNames: Option[List[SSIOAccountPMPName]],

  /* Error indicator from Salesforce which could be \"No Error\" */
  error: Option[String]

 )
