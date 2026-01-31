
package org.openapitools.client.model


case class SingleInterestTargetingOptionResponse (
    _childInterests: Option[List[String]],
    _id: Option[String],
    _level: Option[Integer],
    _name: Option[String]
)
object SingleInterestTargetingOptionResponse {
    def toStringBody(var_childInterests: Object, var_id: Object, var_level: Object, var_name: Object) =
        s"""
        | {
        | "childInterests":$var_childInterests,"id":$var_id,"level":$var_level,"name":$var_name
        | }
        """.stripMargin
}
