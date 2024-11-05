# CONVERSION_EVENTS_USER_DATA_ANY_OF_1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**em** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to null]
**hashed_maids** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [default to null]
**client_ip_address** | [**STRING_32**](STRING_32.md) | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] [default to null]
**client_user_agent** | [**STRING_32**](STRING_32.md) | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


