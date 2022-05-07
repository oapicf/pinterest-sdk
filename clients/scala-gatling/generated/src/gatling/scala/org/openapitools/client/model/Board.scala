
package org.openapitools.client.model


case class Board (
    _id: Option[String],
    _name: String,
    _description: Option[String],
    _owner: Option[BoardOwner],
    /* Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> */
    _privacy: Option[String]
)
object Board {
    def toStringBody(var_id: Object, var_name: Object, var_description: Object, var_owner: Object, var_privacy: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"description":$var_description,"owner":$var_owner,"privacy":$var_privacy
        | }
        """.stripMargin
}
