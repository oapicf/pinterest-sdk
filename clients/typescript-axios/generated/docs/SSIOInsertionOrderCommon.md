# SSIOInsertionOrderCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agency_link** | **string** | URL link for agency | [optional] [default to undefined]
**billing_contact_email** | **string** | The billing contact email | [optional] [default to undefined]
**billing_contact_firstname** | **string** | The billing contact first name | [optional] [default to undefined]
**billing_contact_lastname** | **string** | The billing contact last name | [optional] [default to undefined]
**budget_amount** | **number** | If Budget order line, the budget amount. | [optional] [default to undefined]
**end_date** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] [default to undefined]
**media_contact_email** | **string** | The media contact email | [optional] [default to undefined]
**media_contact_firstname** | **string** | The media contact first name | [optional] [default to undefined]
**media_contact_lastname** | **string** | The media contact last name | [optional] [default to undefined]
**po_number** | **string** | The po number | [optional] [default to undefined]
**start_date** | **string** | Starting date of time period. Format: YYYY-MM-DD | [optional] [default to undefined]
**user_email** | **string** | The email of user submitting the insertion order | [optional] [default to undefined]

## Example

```typescript
import { SSIOInsertionOrderCommon } from './api';

const instance: SSIOInsertionOrderCommon = {
    agency_link,
    billing_contact_email,
    billing_contact_firstname,
    billing_contact_lastname,
    budget_amount,
    end_date,
    media_contact_email,
    media_contact_firstname,
    media_contact_lastname,
    po_number,
    start_date,
    user_email,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
