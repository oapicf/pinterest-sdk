
package org.openapitools.client.model


case class CampaignResponseAllOf1 (
    _objectiveType: Option[ObjectiveType],
    /* Campaign creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* UTC timestamp. Last update time. */
    _updatedTime: Option[Integer],
    /* Always \"campaign\". */
    _type: Option[String]
)
object CampaignResponseAllOf1 {
    def toStringBody(var_objectiveType: Object, var_createdTime: Object, var_updatedTime: Object, var_type: Object) =
        s"""
        | {
        | "objectiveType":$var_objectiveType,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime,"type":$var_type
        | }
        """.stripMargin
}
