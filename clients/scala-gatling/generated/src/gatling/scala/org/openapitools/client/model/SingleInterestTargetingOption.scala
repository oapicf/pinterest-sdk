
package org.openapitools.client.model


case class SingleInterestTargetingOption (
    _childInterests: List[String],
    _id: String,
    _level: Integer,
    _name: String
)
object SingleInterestTargetingOption {
    def toStringBody(var_childInterests: Object, var_id: Object, var_level: Object, var_name: Object) =
        s"""
        | {
        | "childInterests":$var_childInterests,"id":$var_id,"level":$var_level,"name":$var_name
        | }
        """.stripMargin
}
