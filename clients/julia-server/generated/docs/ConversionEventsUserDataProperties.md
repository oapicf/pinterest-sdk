# ConversionEventsUserDataProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`click_id`** | **`String`** | The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] [default to nothing]
**`client_ip_address`** | **`String`** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] [default to nothing]
**`client_user_agent`** | **`String`** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] [default to nothing]
**`country`** | **`Vector{String}`** | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`ct`** | **`Vector{String}`** | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. | [optional] [default to nothing]
**`db`** | **`Vector{String}`** | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`em`** | **`Vector{String}`** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`external_id`** | **`Vector{String}`** | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`fn`** | **`Vector{String}`** | Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`ge`** | **`Vector{String}`** | Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`hashed_maids`** | **`Vector{String}`** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`ln`** | **`Vector{String}`** | Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`partner_id`** | **`String`** | A unique identifier of visitors&#39; information defined by third party partners. e.g RampID | [optional] [default to nothing]
**`ph`** | **`Vector{String}`** | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to nothing]
**`st`** | **`Vector{String}`** | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. | [optional] [default to nothing]
**`zp`** | **`Vector{String}`** | Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


