# CONVERSION_EVENTS_USER_DATA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ph** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to null]
**ge** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format. | [optional] [default to null]
**db** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format. | [optional] [default to null]
**ln** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to null]
**fn** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to null]
**ct** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. | [optional] [default to null]
**st** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. | [optional] [default to null]
**zp** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. | [optional] [default to null]
**country** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format. | [optional] [default to null]
**external_id** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to null]
**click_id** | [**STRING_32**](STRING_32.md) | The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] [default to null]
**partner_id** | [**STRING_32**](STRING_32.md) | A unique identifier of visitors&#39; information defined by third party partners. e.g RampID | [optional] [default to null]
**em** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [default to null]
**hashed_maids** | [**LIST [STRING_32]**](STRING_32.md) | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [default to null]
**client_ip_address** | [**STRING_32**](STRING_32.md) | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [default to null]
**client_user_agent** | [**STRING_32**](STRING_32.md) | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


