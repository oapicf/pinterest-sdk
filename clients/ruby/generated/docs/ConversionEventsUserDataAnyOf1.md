# PinterestSdkClient::ConversionEventsUserDataAnyOf1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **em** | **Array&lt;String&gt;** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] |
| **hashed_maids** | **Array&lt;String&gt;** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. |  |
| **client_ip_address** | **String** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] |
| **client_user_agent** | **String** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEventsUserDataAnyOf1.new(
  em: [&quot;411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8&quot;,&quot;09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969&quot;],
  hashed_maids: [&quot;0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1&quot;,&quot;837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46&quot;],
  client_ip_address: 216.3.128.12,
  client_user_agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36
)
```

