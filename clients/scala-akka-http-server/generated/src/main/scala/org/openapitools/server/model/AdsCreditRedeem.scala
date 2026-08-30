package org.openapitools.server.model


/**
 * Ads credit redemption
 *
 * @param errorCode Error code type if error occurs for example: ''2708''
 * @param errorMessage Reason for failure for example: ''The offer has already been redeemed by this advertiser''
 * @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). for example: ''false''
*/
final case class AdsCreditRedeem (
  errorCode: Option[Int] = None,
  errorMessage: Option[String] = None,
  success: Option[Boolean] = None
)

