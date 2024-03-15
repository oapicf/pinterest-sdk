# WWW::OpenAPIClient::Object::UserWebsiteVerificationCode

## Load the model package
```perl
use WWW::OpenAPIClient::Object::UserWebsiteVerificationCode;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verification_code** | **string** | Code to check against the user claiming the website | [optional] 
**dns_txt_record** | **string** | DNS TXT record to check against for the website to be claimed | [optional] 
**metatag** | **string** | Metatag the verification process searchs for the website to be claimed | [optional] 
**filename** | **string** | File expected to find on the website being claimed | [optional] 
**file_content** | **string** | A full html file to upload to the website in order for it to be claimed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


