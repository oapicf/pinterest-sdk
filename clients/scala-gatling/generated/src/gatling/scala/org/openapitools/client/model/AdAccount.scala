
package org.openapitools.client.model


case class AdAccount (
    _id: Option[String],
    _name: Option[String],
    _owner: Option[AdAccountOwner],
    _country: Option[Country],
    _currency: Option[Currency],
    _permissions: Option[List[BusinessAccessRole]],
    /* Creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer]
)
object AdAccount {
    def toStringBody(var_id: Object, var_name: Object, var_owner: Object, var_country: Object, var_currency: Object, var_permissions: Object, var_createdTime: Object, var_updatedTime: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"owner":$var_owner,"country":$var_country,"currency":$var_currency,"permissions":$var_permissions,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
