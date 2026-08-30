
package org.openapitools.client.model


case class AppsflyerAudienceCreate (
    /* The name of the audience */
    _name: String,
    /* The platform of the audience */
    _platform: AppsflyerPlatform
)
object AppsflyerAudienceCreate {
    def toStringBody(var_name: Object, var_platform: Object) =
        s"""
        | {
        | "name":$var_name,"platform":$var_platform
        | }
        """.stripMargin
}
