# UserWebsiteVerificationCode


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dns_txt_record** | **str** | DNS TXT record to check against for the website to be claimed | [optional] 
**file_content** | **str** | A full html file to upload to the website in order for it to be claimed | [optional] 
**filename** | **str** | File expected to find on the website being claimed | [optional] 
**metatag** | **str** | Metatag the verification process searchs for the website to be claimed | [optional] 
**verification_code** | **str** | Code to check against the user claiming the website | [optional] 

## Example

```python
from pinterestsdk.models.user_website_verification_code import UserWebsiteVerificationCode

# TODO update the JSON string below
json = "{}"
# create an instance of UserWebsiteVerificationCode from a JSON string
user_website_verification_code_instance = UserWebsiteVerificationCode.from_json(json)
# print the JSON string representation of the object
print(UserWebsiteVerificationCode.to_json())

# convert the object into a dict
user_website_verification_code_dict = user_website_verification_code_instance.to_dict()
# create an instance of UserWebsiteVerificationCode from a dict
user_website_verification_code_from_dict = UserWebsiteVerificationCode.from_dict(user_website_verification_code_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


