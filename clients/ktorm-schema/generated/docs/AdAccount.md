
# Table `AdAccount`
(mapped from: AdAccount)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**createdTime** | created_time | int |  | **kotlin.Int** |  Creation time. Unix timestamp in seconds. |  [optional] [readonly]
**currency** | currency | long |  | [**Currency**](Currency.md) |  |  [optional] [foreignkey]
**name** | name | text |  | **kotlin.String** | Ad account name. |  [optional]
**owner** | owner | long |  | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner |  [optional] [readonly] [foreignkey]
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  |  [optional] [readonly]
**timeZone** | time_zone | text |  | **kotlin.String** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** |  |  [optional] [readonly]








# **Table `AdAccountBusinessAccessRole`**
(mapped from: AdAccountBusinessAccessRole)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccount | adAccount | long | | kotlin.Long | Primary Key | *one*
businessAccessRole | businessAccessRole | long | | kotlin.Long | Foreign Key | *many*





