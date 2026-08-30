
package org.openapitools.client.model


case class AdAccount (
    _country: Option[Country],
    /*  Creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    _currency: Option[Currency],
    _id: String,
    /* Ad account name. */
    _name: Option[String],
    /* Ad account owner */
    _owner: Option[AdAccountOwner],
    _permissions: Option[List[BusinessAccessRole]],
    /* The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. */
    _timeZone: Option[String],
    _updatedTime: Option[Integer]
)
object AdAccount {
    def toStringBody(var_country: Object, var_createdTime: Object, var_currency: Object, var_id: Object, var_name: Object, var_owner: Object, var_permissions: Object, var_timeZone: Object, var_updatedTime: Object) =
        s"""
        | {
        | "country":$var_country,"createdTime":$var_createdTime,"currency":$var_currency,"id":$var_id,"name":$var_name,"owner":$var_owner,"permissions":$var_permissions,"timeZone":$var_timeZone,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
