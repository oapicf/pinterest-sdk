

# AdAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **Country** |  |  [optional]
**createdTime** | **Int** |  Creation time. Unix timestamp in seconds. |  [optional] [readonly]
**currency** | **Currency** |  |  [optional]
**id** | **String** |  | 
**name** | **String** | Ad account name. |  [optional]
**owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner |  [optional] [readonly]
**permissions** | **Seq&lt;BusinessAccessRole&gt;** |  |  [optional] [readonly]
**timeZone** | **String** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. |  [optional]
**updatedTime** | **Int** |  |  [optional] [readonly]



