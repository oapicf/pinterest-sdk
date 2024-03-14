# ConversionEventsUserData
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ph** | **List** | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. | [optional] [default to null] |
| **ge** | **List** | Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. | [optional] [default to null] |
| **db** | **List** | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. | [optional] [default to null] |
| **ln** | **List** | Sha256 hashes of user&#39;s last name, in lowercase. | [optional] [default to null] |
| **fn** | **List** | Sha256 hashes of user&#39;s first name, in lowercase. | [optional] [default to null] |
| **ct** | **List** | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. | [optional] [default to null] |
| **st** | **List** | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. | [optional] [default to null] |
| **zp** | **List** | Sha256 hashes of user&#39;s zipcode, only digits. | [optional] [default to null] |
| **country** | **List** | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. | [optional] [default to null] |
| **external\_id** | **List** | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

