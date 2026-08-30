# BusinessMemberAssetsGetResponse

Paginated response for business member assets with total count metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **string** |  | [optional] [default to undefined]
**items** | [**Array&lt;AssetIdPermissions&gt;**](AssetIdPermissions.md) |  | [default to undefined]
**total_data_count** | **number** | Total number of assets matching the query | [default to undefined]
**total_data_count_by_status** | [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) | [optional] [default to undefined]

## Example

```typescript
import { BusinessMemberAssetsGetResponse } from './api';

const instance: BusinessMemberAssetsGetResponse = {
    bookmark,
    items,
    total_data_count,
    total_data_count_by_status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
