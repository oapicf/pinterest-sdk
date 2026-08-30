# PinterestSdkClient::TargetingTemplate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional][readonly] |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional][default to true] |
| **created_time** | **Integer** | Targeting template created time. Unix timestamp in seconds. | [optional][readonly] |
| **id** | **String** | Targeting template ID. | [optional][readonly] |
| **keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] |
| **name** | **String** | targeting template name |  |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional][default to &#39;ALL&#39;] |
| **sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional][readonly] |
| **status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional][readonly] |
| **targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes |  |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |
| **updated_time** | **Integer** | Targeting template updated time.Unix timestamp in seconds. | [optional][readonly] |
| **valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplate.new(
  ad_account_id: null,
  auto_targeting_enabled: null,
  created_time: null,
  id: null,
  keywords: null,
  name: null,
  placement_group: null,
  sizing: null,
  status: null,
  targeting_attributes: null,
  tracking_urls: null,
  updated_time: null,
  valid: null
)
```

