
package org.openapitools.client.model


case class BidOptionsAppTypeMultipliers (
    _androidMobile: Option[Number],
    _androidTablet: Option[Number],
    _ipad: Option[Number],
    _iphone: Option[Number],
    _web: Option[Number],
    _webMobile: Option[Number]
)
object BidOptionsAppTypeMultipliers {
    def toStringBody(var_androidMobile: Object, var_androidTablet: Object, var_ipad: Object, var_iphone: Object, var_web: Object, var_webMobile: Object) =
        s"""
        | {
        | "androidMobile":$var_androidMobile,"androidTablet":$var_androidTablet,"ipad":$var_ipad,"iphone":$var_iphone,"web":$var_web,"webMobile":$var_webMobile
        | }
        """.stripMargin
}
