
package org.openapitools.client.model


case class AdsCreditRedeemRequest (
    /* Takes in a SHA256 hash of the offerCode. */
    _offerCodeHash: String,
    /* If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account */
    _validateOnly: Boolean
)
object AdsCreditRedeemRequest {
    def toStringBody(var_offerCodeHash: Object, var_validateOnly: Object) =
        s"""
        | {
        | "offerCodeHash":$var_offerCodeHash,"validateOnly":$var_validateOnly
        | }
        """.stripMargin
}
