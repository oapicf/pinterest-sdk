# UserWebsiteVerification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dns_txt_record** | **string** | DNS TXT record to check against for the website to be claimed | [optional] [default to undefined]
**file_content** | **string** | A full html file to upload to the website in order for it to be claimed | [optional] [default to undefined]
**filename** | **string** | File expected to find on the website being claimed | [optional] [default to undefined]
**metatag** | **string** | Metatag the verification process searchs for the website to be claimed | [optional] [default to undefined]
**verification_code** | **string** | Code to check against the user claiming the website | [optional] [default to undefined]

## Example

```typescript
import { UserWebsiteVerification } from './api';

const instance: UserWebsiteVerification = {
    dns_txt_record,
    file_content,
    filename,
    metatag,
    verification_code,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
