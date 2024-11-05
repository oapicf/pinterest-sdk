# PinterestSdkClient::TargetingTemplateCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Name of targeting template. |  |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional][default to true] |
| **targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  |  |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional][default to &#39;ALL&#39;] |
| **keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplateCreate.new(
  name: Gaming,
  auto_targeting_enabled: null,
  targeting_attributes: null,
  placement_group: null,
  keywords: [{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}],
  tracking_urls: null
)
```

