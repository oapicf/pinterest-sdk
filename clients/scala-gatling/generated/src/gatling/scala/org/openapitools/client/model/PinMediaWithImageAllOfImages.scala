
package org.openapitools.client.model


case class PinMediaWithImageAllOfImages (
    _150x150: Option[Any],
    _400x300: Option[Any],
    _600x: Option[Any],
    _1200x: Option[Any]
)
object PinMediaWithImageAllOfImages {
    def toStringBody(var_150x150: Object, var_400x300: Object, var_600x: Object, var_1200x: Object) =
        s"""
        | {
        | "150x150":$var_150x150,"400x300":$var_400x300,"600x":$var_600x,"1200x":$var_1200x
        | }
        """.stripMargin
}
