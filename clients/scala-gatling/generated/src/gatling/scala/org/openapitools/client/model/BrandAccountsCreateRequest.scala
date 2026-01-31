
package org.openapitools.client.model


case class BrandAccountsCreateRequest (
    /* Brand Account name */
    _name: String,
    /* Brand Account username */
    _username: String,
    _country: Country,
    /* Brand Account about information */
    _about: Option[String],
    /* Brand Account website */
    _website: Option[String],
    _profileImage: Option[ImageBase64]
)
object BrandAccountsCreateRequest {
    def toStringBody(var_name: Object, var_username: Object, var_country: Object, var_about: Object, var_website: Object, var_profileImage: Object) =
        s"""
        | {
        | "name":$var_name,"username":$var_username,"country":$var_country,"about":$var_about,"website":$var_website,"profileImage":$var_profileImage
        | }
        """.stripMargin
}
