
package org.openapitools.client.model


case class LabeledEntitiesCreate (
    /* Entity IDs to apply label to. */
    _entityIds: List[String]
)
object LabeledEntitiesCreate {
    def toStringBody(var_entityIds: Object) =
        s"""
        | {
        | "entityIds":$var_entityIds
        | }
        """.stripMargin
}
