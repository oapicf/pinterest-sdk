
package org.openapitools.client.model


case class Audience (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    _audienceType: Option[String],
    /* The company that created this audience. */
    _createdByCompanyName: Option[String],
    /* Creation time. Unix timestamp in seconds. */
    _createdTimestamp: Option[Integer],
    /* Audience description. */
    _description: Option[String],
    /* Audience ID. */
    _id: Option[String],
    /* Audience name. */
    _name: Option[String],
    _rule: Option[AudienceRule],
    /* Audience size. */
    _size: Option[Integer],
    /* Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. */
    _status: Option[String],
    /* Always \"audience\". */
    _type: Option[String],
    /* Last update time. Unix timestamp in seconds. */
    _updatedTimestamp: Option[Integer]
)
object Audience {
    def toStringBody(var_adAccountId: Object, var_audienceType: Object, var_createdByCompanyName: Object, var_createdTimestamp: Object, var_description: Object, var_id: Object, var_name: Object, var_rule: Object, var_size: Object, var_status: Object, var_type: Object, var_updatedTimestamp: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"audienceType":$var_audienceType,"createdByCompanyName":$var_createdByCompanyName,"createdTimestamp":$var_createdTimestamp,"description":$var_description,"id":$var_id,"name":$var_name,"rule":$var_rule,"size":$var_size,"status":$var_status,"type":$var_type,"updatedTimestamp":$var_updatedTimestamp
        | }
        """.stripMargin
}
