# PinterestSdkClient::TargetingTemplateCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional][default to true] |
| **keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] |
| **name** | **String** | targeting template name |  |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional][default to &#39;ALL&#39;] |
| **targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes |  |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplateCreate.new(
  auto_targeting_enabled: null,
  keywords: null,
  name: null,
  placement_group: null,
  targeting_attributes: null,
  tracking_urls: null
)
```

