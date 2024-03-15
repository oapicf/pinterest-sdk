
package org.openapitools.client.model


case class SSIOAccountPMPName (
    /* Display name */
    _name: Option[String],
    /* Salesforce id for PMP */
    _id: Option[String]
)
object SSIOAccountPMPName {
    def toStringBody(var_name: Object, var_id: Object) =
        s"""
        | {
        | "name":$var_name,"id":$var_id
        | }
        """.stripMargin
}
