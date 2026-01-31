# TargetingTemplateGetResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] [default to undefined]
**name** | **string** | targeting template name | [optional] [default to undefined]
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to undefined]
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]
**ad_account_id** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] [default to undefined]
**created_time** | **number** | Targeting template created time. Unix timestamp in seconds. | [optional] [default to undefined]
**id** | **string** | Targeting template ID. | [optional] [default to undefined]
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [default to undefined]
**status** | **string** | Indicate targeting template is active or Deleted | [optional] [default to StatusEnum_Active]
**updated_time** | **number** | Targeting template updated time.Unix timestamp in seconds. | [optional] [default to undefined]
**valid** | **boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [default to undefined]

## Example

```typescript
import { TargetingTemplateGetResponseData } from './api';

const instance: TargetingTemplateGetResponseData = {
    auto_targeting_enabled,
    keywords,
    name,
    placement_group,
    targeting_attributes,
    tracking_urls,
    ad_account_id,
    created_time,
    id,
    sizing,
    status,
    updated_time,
    valid,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
