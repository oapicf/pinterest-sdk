# PinterestSdkClient::TargetingTemplateGetResponseData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | targeting template name | [optional] |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional][default to true] |
| **targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional][default to &#39;ALL&#39;] |
| **keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |
| **id** | **String** | Targeting template ID. | [optional] |
| **created_time** | **Integer** | Targeting template created time. Unix timestamp in seconds. | [optional] |
| **updated_time** | **Integer** | Targeting template updated time.Unix timestamp in seconds. | [optional] |
| **ad_account_id** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] |
| **status** | **String** | Indicate targeting template is active or Deleted | [optional][default to &#39;ACTIVE&#39;] |
| **sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] |
| **valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplateGetResponseData.new(
  name: Gaming,
  auto_targeting_enabled: null,
  targeting_attributes: null,
  placement_group: null,
  keywords: [{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}],
  tracking_urls: null,
  id: 643,
  created_time: 1432744744,
  updated_time: 1432744744,
  ad_account_id: 549755885175,
  status: ACTIVE,
  sizing: null,
  valid: true
)
```

