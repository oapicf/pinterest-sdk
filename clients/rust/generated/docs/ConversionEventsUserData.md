# ConversionEventsUserData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ph** | Option<**Vec<String>**> | Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional]
**ge** | Option<**Vec<String>**> | Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. | [optional]
**db** | Option<**Vec<String>**> | Sha256 hashes of user's date of birthday, given as year, month, and day. | [optional]
**ln** | Option<**Vec<String>**> | Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional]
**r#fn** | Option<**Vec<String>**> | Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional]
**ct** | Option<**Vec<String>**> | Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). | [optional]
**st** | Option<**Vec<String>**> | Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). | [optional]
**zp** | Option<**Vec<String>**> | Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). | [optional]
**country** | Option<**Vec<String>**> | Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. | [optional]
**external_id** | Option<**Vec<String>**> | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. | [optional]
**click_id** | Option<**String**> | The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional]
**partner_id** | Option<**String**> | A unique identifier of visitors' information defined by third party partners. e.g RampID | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


