# PinterestSdkClient::CreateAssetAccessRequestResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **exceptions** | [**Array&lt;AssetAccessRequestError&gt;**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional] |
| **invites** | **Hash&lt;String, String&gt;** | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CreateAssetAccessRequestResponse.new(
  exceptions: null,
  invites: {&quot;766456567741825556&quot;:&quot;5349280584552211583&quot;,&quot;733242520489967216&quot;:&quot;5349280584552211845&quot;}
)
```

