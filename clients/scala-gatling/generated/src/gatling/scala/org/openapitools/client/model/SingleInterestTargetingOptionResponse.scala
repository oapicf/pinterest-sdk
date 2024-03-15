
package org.openapitools.client.model


case class SingleInterestTargetingOptionResponse (
    _id: Option[String],
    _name: Option[String],
    _childInterests: Option[List[String]],
    _level: Option[Integer]
)
object SingleInterestTargetingOptionResponse {
    def toStringBody(var_id: Object, var_name: Object, var_childInterests: Object, var_level: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"childInterests":$var_childInterests,"level":$var_level
        | }
        """.stripMargin
}
