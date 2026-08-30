
package org.openapitools.client.model


case class BrandAccountCreate (
    /* Brand Account about information */
    _about: Option[String],
    _country: Country,
    /* Brand Account name */
    _name: String,
    _profileImage: Option[BrandAccountProfileImage],
    /* Brand Account username */
    _username: String,
    /* Brand Account website */
    _website: Option[String]
)
object BrandAccountCreate {
    def toStringBody(var_about: Object, var_country: Object, var_name: Object, var_profileImage: Object, var_username: Object, var_website: Object) =
        s"""
        | {
        | "about":$var_about,"country":$var_country,"name":$var_name,"profileImage":$var_profileImage,"username":$var_username,"website":$var_website
        | }
        """.stripMargin
}
