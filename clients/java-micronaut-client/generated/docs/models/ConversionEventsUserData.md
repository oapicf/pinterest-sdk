

# ConversionEventsUserData

Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.

The class is defined in **[ConversionEventsUserData.java](../../src/main/java/org/openapitools/model/ConversionEventsUserData.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ph** | `List&lt;String&gt;` | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. |  [optional property]
**ge** | `List&lt;String&gt;` | Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. |  [optional property]
**db** | `List&lt;String&gt;` | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. |  [optional property]
**ln** | `List&lt;String&gt;` | Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. |  [optional property]
**fn** | `List&lt;String&gt;` | Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. |  [optional property]
**ct** | `List&lt;String&gt;` | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). |  [optional property]
**st** | `List&lt;String&gt;` | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). |  [optional property]
**zp** | `List&lt;String&gt;` | Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). |  [optional property]
**country** | `List&lt;String&gt;` | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. |  [optional property]
**externalId** | `List&lt;String&gt;` | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. |  [optional property]
**clickId** | `String` | The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. |  [optional property]
**partnerId** | `String` | A unique identifier of visitors&#39; information defined by third party partners. e.g RampID |  [optional property]














