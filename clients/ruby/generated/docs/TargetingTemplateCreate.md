# PinterestSdkClient::TargetingTemplateCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional][default to true] |
| **keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] |
| **name** | **String** | Name of targeting template. |  |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional][default to &#39;ALL&#39;] |
| **targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  |  |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplateCreate.new(
  auto_targeting_enabled: null,
  keywords: [{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}],
  name: Gaming,
  placement_group: null,
  targeting_attributes: null,
  tracking_urls: null
)
```

