
package org.openapitools.client.model


case class AdAccountCreateRequest (
    _country: Option[Country],
    /* Ad Account name. */
    _name: Option[String],
    /* Advertiser's owning user ID. */
    _ownerUserId: Option[String]
)
object AdAccountCreateRequest {
    def toStringBody(var_country: Object, var_name: Object, var_ownerUserId: Object) =
        s"""
        | {
        | "country":$var_country,"name":$var_name,"ownerUserId":$var_ownerUserId
        | }
        """.stripMargin
}
