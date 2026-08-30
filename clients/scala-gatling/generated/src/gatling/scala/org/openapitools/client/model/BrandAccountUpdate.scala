
package org.openapitools.client.model


case class BrandAccountUpdate (
    /* Brand Account about information */
    _about: Option[String],
    _country: Option[Country],
    /* Brand Account name */
    _name: Option[String],
    _profileImage: Option[BrandAccountProfileImageUpdate],
    /* Brand Account username */
    _username: Option[String],
    /* Brand Account website */
    _website: Option[String]
)
object BrandAccountUpdate {
    def toStringBody(var_about: Object, var_country: Object, var_name: Object, var_profileImage: Object, var_username: Object, var_website: Object) =
        s"""
        | {
        | "about":$var_about,"country":$var_country,"name":$var_name,"profileImage":$var_profileImage,"username":$var_username,"website":$var_website
        | }
        """.stripMargin
}
