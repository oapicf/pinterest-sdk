# conversion_events_user_data_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ph** | **list_t \*** | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**ge** | **list_t \*** | Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. | [optional] 
**db** | **list_t \*** | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. | [optional] 
**ln** | **list_t \*** | Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**fn** | **list_t \*** | Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**ct** | **list_t \*** | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). | [optional] 
**st** | **list_t \*** | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). | [optional] 
**zp** | **list_t \*** | Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). | [optional] 
**country** | **list_t \*** | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. | [optional] 
**external_id** | **list_t \*** | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. | [optional] 
**click_id** | **char \*** | The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**partner_id** | **char \*** | A unique identifier of visitors&#39; information defined by third party partners. e.g RampID | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


