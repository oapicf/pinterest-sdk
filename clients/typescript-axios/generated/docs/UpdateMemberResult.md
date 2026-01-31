# UpdateMemberResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | **string** | The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. | [optional] [default to undefined]
**member_id** | **string** | Unique identifier of the business member. | [optional] [default to undefined]

## Example

```typescript
import { UpdateMemberResult } from './api';

const instance: UpdateMemberResult = {
    business_role,
    member_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
