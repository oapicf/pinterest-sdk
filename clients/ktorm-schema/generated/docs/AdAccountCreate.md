
# Table `AdAccountCreate`
(mapped from: AdAccountCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**currency** | currency | long |  | [**Currency**](Currency.md) |  |  [optional] [foreignkey]
**name** | name | text |  | **kotlin.String** | Ad account name. |  [optional]
**ownerUserId** | owner_user_id | text |  | **kotlin.String** | Advertiser&#39;s owning user ID. |  [optional]
**timeZone** | time_zone | text |  | **kotlin.String** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. |  [optional]







