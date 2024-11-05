# PinterestSdk.ConversionEventsUserDataAnyOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**em** | **[String]** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | 
**hashedMaids** | **[String]** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**clientIpAddress** | **String** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] 
**clientUserAgent** | **String** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] 


