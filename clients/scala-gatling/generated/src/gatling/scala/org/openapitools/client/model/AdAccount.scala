
package org.openapitools.client.model


case class AdAccount (
    _id: Option[String],
    _name: Option[String],
    _owner: Option[AdAccountOwner],
    _country: Option[Country],
    _currency: Option[Currency]
)
object AdAccount {
    def toStringBody(var_id: Object, var_name: Object, var_owner: Object, var_country: Object, var_currency: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"owner":$var_owner,"country":$var_country,"currency":$var_currency
        | }
        """.stripMargin
}
