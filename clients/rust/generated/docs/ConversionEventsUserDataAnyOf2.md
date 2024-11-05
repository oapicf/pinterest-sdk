# ConversionEventsUserDataAnyOf2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**em** | Option<**Vec<String>**> | Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional]
**hashed_maids** | Option<**Vec<String>**> | Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional]
**client_ip_address** | **String** | The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 
**client_user_agent** | **String** | The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


