
package org.openapitools.client.model


case class AdAccount (
    _country: Option[Country],
    /*  Creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    _currency: Option[Currency],
    _id: String,
    /* Ad account name. */
    _name: Option[String],
    /* Ad account owner */
    _owner: Option[AdAccountOwner],
    _permissions: Option[List[BusinessAccessRole]],
    _updatedTime: Option[Integer]
)
object AdAccount {
    def toStringBody(var_country: Object, var_createdTime: Object, var_currency: Object, var_id: Object, var_name: Object, var_owner: Object, var_permissions: Object, var_updatedTime: Object) =
        s"""
        | {
        | "country":$var_country,"createdTime":$var_createdTime,"currency":$var_currency,"id":$var_id,"name":$var_name,"owner":$var_owner,"permissions":$var_permissions,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
