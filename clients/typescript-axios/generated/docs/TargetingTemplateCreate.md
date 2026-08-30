# TargetingTemplateCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**keywords** | [**Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] [default to undefined]
**name** | **string** | targeting template name | [default to undefined]
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to undefined]
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]

## Example

```typescript
import { TargetingTemplateCreate } from './api';

const instance: TargetingTemplateCreate = {
    auto_targeting_enabled,
    keywords,
    name,
    placement_group,
    targeting_attributes,
    tracking_urls,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
