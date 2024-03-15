package org.openapitools.server.model


/**
 * @param offerCodeHash Takes in a SHA256 hash of the offerCode. for example: ''138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67''
 * @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account for example: ''true''
*/
final case class AdsCreditRedeemRequest (
  offerCodeHash: String,
  validateOnly: Boolean
)

