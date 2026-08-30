# TargetingTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] [default to undefined]
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**created_time** | **number** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**id** | **string** | Targeting template ID. | [optional] [readonly] [default to undefined]
**keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] [default to undefined]
**name** | **string** | targeting template name | [default to undefined]
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to undefined]
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] [default to undefined]
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] [default to undefined]
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]
**updated_time** | **number** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**valid** | **boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] [default to undefined]

## Example

```typescript
import { TargetingTemplate } from './api';

const instance: TargetingTemplate = {
    ad_account_id,
    auto_targeting_enabled,
    created_time,
    id,
    keywords,
    name,
    placement_group,
    sizing,
    status,
    targeting_attributes,
    tracking_urls,
    updated_time,
    valid,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
