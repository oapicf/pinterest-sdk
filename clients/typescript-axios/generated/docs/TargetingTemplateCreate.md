# TargetingTemplateCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Name of targeting template. | [default to undefined]
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [default to undefined]
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to undefined]
**keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]

## Example

```typescript
import { TargetingTemplateCreate } from './api';

const instance: TargetingTemplateCreate = {
    name,
    auto_targeting_enabled,
    targeting_attributes,
    placement_group,
    keywords,
    tracking_urls,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
