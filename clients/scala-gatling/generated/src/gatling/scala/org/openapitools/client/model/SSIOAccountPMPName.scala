
package org.openapitools.client.model


case class SSIOAccountPMPName (
    /* Salesforce id for PMP */
    _id: Option[String],
    /* Display name */
    _name: Option[String]
)
object SSIOAccountPMPName {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
