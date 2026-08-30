# SSIOInsertionOrderUpdate

Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ads_manager_order_line_id** | **string** | Ads manager OrderLineId | [optional] [default to undefined]
**agency_link** | **string** | URL link for agency | [optional] [default to undefined]
**billing_contact_email** | **string** | The billing contact email | [optional] [default to undefined]
**billing_contact_firstname** | **string** | The billing contact first name | [optional] [default to undefined]
**billing_contact_lastname** | **string** | The billing contact last name | [optional] [default to undefined]
**budget_amount** | **number** | If Budget order line, the budget amount. | [optional] [default to undefined]
**end_date** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] [default to undefined]
**media_contact_email** | **string** | The media contact email | [optional] [default to undefined]
**media_contact_firstname** | **string** | The media contact first name | [optional] [default to undefined]
**media_contact_lastname** | **string** | The media contact last name | [optional] [default to undefined]
**oracle_line_id** | **string** | LineId in the Oracle DB | [optional] [default to undefined]
**po_number** | **string** | The po number | [optional] [default to undefined]
**salesforce_order_id** | **string** | OrderId in SFDC | [optional] [default to undefined]
**salesforce_order_line_id** | **string** | OrderLineId in SFDC | [optional] [default to undefined]
**start_date** | **string** | Starting date of time period. Format: YYYY-MM-DD | [optional] [default to undefined]
**user_email** | **string** | The email of user submitting the insertion order | [optional] [default to undefined]

## Example

```typescript
import { SSIOInsertionOrderUpdate } from './api';

const instance: SSIOInsertionOrderUpdate = {
    ads_manager_order_line_id,
    agency_link,
    billing_contact_email,
    billing_contact_firstname,
    billing_contact_lastname,
    budget_amount,
    end_date,
    media_contact_email,
    media_contact_firstname,
    media_contact_lastname,
    oracle_line_id,
    po_number,
    salesforce_order_id,
    salesforce_order_line_id,
    start_date,
    user_email,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
