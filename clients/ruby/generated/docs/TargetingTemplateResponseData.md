# PinterestSdkClient::TargetingTemplateResponseData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional][default to true] |
| **keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] |
| **name** | **String** | targeting template name | [optional] |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional][default to &#39;ALL&#39;] |
| **targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |
| **ad_account_id** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] |
| **created_time** | **Integer** | Targeting template created time. Unix timestamp in seconds. | [optional] |
| **id** | **String** | Targeting template ID. | [optional] |
| **sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] |
| **status** | **String** | Indicate targeting template is active or Deleted | [optional][default to &#39;ACTIVE&#39;] |
| **updated_time** | **Integer** | Targeting template updated time.Unix timestamp in seconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplateResponseData.new(
  auto_targeting_enabled: null,
  keywords: [{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}],
  name: Gaming,
  placement_group: null,
  targeting_attributes: null,
  tracking_urls: null,
  ad_account_id: 549755885175,
  created_time: 1432744744,
  id: 643,
  sizing: null,
  status: ACTIVE,
  updated_time: 1432744744
)
```

