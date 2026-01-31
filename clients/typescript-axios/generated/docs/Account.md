# Account


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_type** | **string** | Type of account | [optional] [default to undefined]
**id** | **string** | User account ID. | [optional] [default to undefined]
**profile_image** | **string** |  | [optional] [default to undefined]
**website_url** | **string** |  | [optional] [default to undefined]
**username** | **string** |  | [optional] [default to undefined]
**about** | **string** | Profile about description. | [optional] [default to undefined]
**business_name** | **string** |  | [optional] [default to undefined]
**board_count** | **number** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional] [readonly] [default to undefined]
**pin_count** | **number** | User account pin count. This includes both created and saved pins. | [optional] [readonly] [default to undefined]
**follower_count** | **number** | User account follower count. | [optional] [readonly] [default to undefined]
**following_count** | **number** | User account following count. | [optional] [readonly] [default to undefined]
**monthly_views** | **number** | User account monthly views. | [optional] [readonly] [default to undefined]

## Example

```typescript
import { Account } from './api';

const instance: Account = {
    account_type,
    id,
    profile_image,
    website_url,
    username,
    about,
    business_name,
    board_count,
    pin_count,
    follower_count,
    following_count,
    monthly_views,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
