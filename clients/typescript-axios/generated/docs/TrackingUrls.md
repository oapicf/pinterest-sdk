# TrackingUrls

Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_verification** | **Array&lt;string&gt;** |  | [optional] [default to undefined]
**buyable_button** | **Array&lt;string&gt;** |  | [optional] [default to undefined]
**click** | **Array&lt;string&gt;** |  | [optional] [default to undefined]
**engagement** | **Array&lt;string&gt;** |  | [optional] [default to undefined]
**impression** | **Array&lt;string&gt;** |  | [optional] [default to undefined]

## Example

```typescript
import { TrackingUrls } from './api';

const instance: TrackingUrls = {
    audience_verification,
    buyable_button,
    click,
    engagement,
    impression,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
