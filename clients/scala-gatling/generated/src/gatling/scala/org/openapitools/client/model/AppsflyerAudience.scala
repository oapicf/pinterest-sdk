
package org.openapitools.client.model


case class AppsflyerAudience (
    /* The ID of the audience container */
    _containerId: String,
    /* The name of the audience */
    _name: String,
    /* The platform of the audience */
    _platform: AppsflyerPlatform
)
object AppsflyerAudience {
    def toStringBody(var_containerId: Object, var_name: Object, var_platform: Object) =
        s"""
        | {
        | "containerId":$var_containerId,"name":$var_name,"platform":$var_platform
        | }
        """.stripMargin
}
