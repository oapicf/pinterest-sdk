# ConversionEventsUserData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ph** | **String[]** | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**Ge** | **String[]** | Sha256 hashes of user&#39;s gender, in lowercase. Either &quot;&quot;f&quot;&quot; or &quot;&quot;m&quot;&quot; or &quot;&quot;n&quot;&quot; for non-binary gender. The string should be in the UTF-8 format. | [optional] 
**Db** | **String[]** | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format. | [optional] 
**Ln** | **String[]** | Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**Fn** | **String[]** | Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**Ct** | **String[]** | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. | [optional] 
**St** | **String[]** | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. | [optional] 
**Zp** | **String[]** | Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. | [optional] 
**Country** | **String[]** | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format. | [optional] 
**ExternalId** | **String[]** | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**ClickId** | **String** | The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**PartnerId** | **String** | A unique identifier of visitors&#39; information defined by third party partners. e.g RampID | [optional] 
**Em** | **String[]** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | 
**HashedMaids** | **String[]** | Sha256 hashes of user&#39;s &quot;&quot;Google Advertising IDs&quot;&quot; (GAIDs) or &quot;&quot;Apple&#39;s Identifier for Advertisers&quot;&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | 
**ClientIpAddress** | **String** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 
**ClientUserAgent** | **String** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 

## Examples

- Prepare the resource
```powershell
$ConversionEventsUserData = Initialize-PSOpenAPIToolsConversionEventsUserData  -Ph [&quot;45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d&quot;] `
 -Ge [&quot;0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf&quot;] `
 -Db [&quot;d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739&quot;] `
 -Ln [&quot;7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19&quot;] `
 -Fn [&quot;ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2&quot;] `
 -Ct [&quot;4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36&quot;] `
 -St [&quot;49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34&quot;] `
 -Zp [&quot;fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145&quot;] `
 -Country [&quot;9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d&quot;] `
 -ExternalId [&quot;6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee&quot;] `
 -ClickId dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv `
 -PartnerId BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc `
 -Em [411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8, 09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969] `
 -HashedMaids [0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1, 837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46] `
 -ClientIpAddress 216.3.128.12 `
 -ClientUserAgent Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36
```

- Convert the resource to JSON
```powershell
$ConversionEventsUserData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

