
package org.openapitools.client.model


case class AdAccountCreate (
    _country: Option[Country],
    _currency: Option[Currency],
    /* Ad account name. */
    _name: Option[String],
    /* Advertiser's owning user ID. */
    _ownerUserId: Option[String],
    /* The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. */
    _timeZone: Option[String]
)
object AdAccountCreate {
    def toStringBody(var_country: Object, var_currency: Object, var_name: Object, var_ownerUserId: Object, var_timeZone: Object) =
        s"""
        | {
        | "country":$var_country,"currency":$var_currency,"name":$var_name,"ownerUserId":$var_ownerUserId,"timeZone":$var_timeZone
        | }
        """.stripMargin
}
