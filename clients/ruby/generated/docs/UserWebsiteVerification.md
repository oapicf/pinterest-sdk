# PinterestSdkClient::UserWebsiteVerification

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dns_txt_record** | **String** | DNS TXT record to check against for the website to be claimed | [optional] |
| **file_content** | **String** | A full html file to upload to the website in order for it to be claimed | [optional] |
| **filename** | **String** | File expected to find on the website being claimed | [optional] |
| **metatag** | **String** | Metatag the verification process searchs for the website to be claimed | [optional] |
| **verification_code** | **String** | Code to check against the user claiming the website | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserWebsiteVerification.new(
  dns_txt_record: null,
  file_content: null,
  filename: null,
  metatag: null,
  verification_code: null
)
```

