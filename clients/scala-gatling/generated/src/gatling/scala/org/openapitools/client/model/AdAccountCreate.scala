
package org.openapitools.client.model


case class AdAccountCreate (
    _country: Option[Country],
    _currency: Option[Currency],
    /* Ad account name. */
    _name: Option[String],
    /* Advertiser's owning user ID. */
    _ownerUserId: Option[String]
)
object AdAccountCreate {
    def toStringBody(var_country: Object, var_currency: Object, var_name: Object, var_ownerUserId: Object) =
        s"""
        | {
        | "country":$var_country,"currency":$var_currency,"name":$var_name,"ownerUserId":$var_ownerUserId
        | }
        """.stripMargin
}
