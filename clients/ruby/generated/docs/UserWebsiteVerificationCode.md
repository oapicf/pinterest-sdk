# PinterestSdkClient::UserWebsiteVerificationCode

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **verification_code** | **String** | Code to check against the user claiming the website | [optional] |
| **dns_txt_record** | **String** | DNS TXT record to check against for the website to be claimed | [optional] |
| **metatag** | **String** | Metatag the verification process searchs for the website to be claimed | [optional] |
| **filename** | **String** | File expected to find on the website being claimed | [optional] |
| **file_content** | **String** | A full html file to upload to the website in order for it to be claimed | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserWebsiteVerificationCode.new(
  verification_code: e1edcc1a43976c646367e9c6c9a9b7b6,
  dns_txt_record: pinterest-site-verification&#x3D;e1edcc1a43976c646367e9c6c9a9b7b6,
  metatag: &lt;meta name&#x3D;&quot;p:domain_verify&quot; content&#x3D;&quot;e1edcc1a43976c646367e9c6c9a9b7b6&quot;/&gt;,
  filename: pinterest-e1edc.html,
  file_content: null
)
```

