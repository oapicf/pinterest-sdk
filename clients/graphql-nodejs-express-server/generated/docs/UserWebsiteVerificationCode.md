# UserWebsiteVerificationCode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verificationCode** | **String!** | Code to check against the user claiming the website | [optional] [default to null]
**dnsTxtRecord** | **String!** | DNS TXT record to check against for the website to be claimed | [optional] [default to null]
**metatag** | **String!** | Metatag the verification process searchs for the website to be claimed | [optional] [default to null]
**filename** | **String!** | File expected to find on the website being claimed | [optional] [default to null]
**fileContent** | **String!** | A full html file to upload to the website in order for it to be claimed | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


