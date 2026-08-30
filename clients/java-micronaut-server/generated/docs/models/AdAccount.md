

# AdAccount

The class is defined in **[AdAccount.java](../../src/main/java/org/openapitools/model/AdAccount.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | `Country` |  |  [optional property]
**createdTime** | `Integer` |  Creation time. Unix timestamp in seconds. |  [optional property] [readonly property]
**currency** | `Currency` |  |  [optional property]
**id** | `String` |  | 
**name** | `String` | Ad account name. |  [optional property]
**owner** | [`AdAccountOwner`](AdAccountOwner.md) | Ad account owner |  [optional property] [readonly property]
**permissions** | `List&lt;BusinessAccessRole&gt;` |  |  [optional property] [readonly property]
**timeZone** | `String` | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. |  [optional property]
**updatedTime** | `Integer` |  |  [optional property] [readonly property]











