
package org.openapitools.client.model


case class CustomerSegmentCreate (
    /* Audience IDs included in the customer segment. */
    _audienceIds: List[String],
    /* Customer segment name. */
    _name: String
)
object CustomerSegmentCreate {
    def toStringBody(var_audienceIds: Object, var_name: Object) =
        s"""
        | {
        | "audienceIds":$var_audienceIds,"name":$var_name
        | }
        """.stripMargin
}
