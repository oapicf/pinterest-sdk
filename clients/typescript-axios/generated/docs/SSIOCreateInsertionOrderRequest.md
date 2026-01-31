# SSIOCreateInsertionOrderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **string** | Starting date of time period. Format: YYYY-MM-DD | [default to undefined]
**end_date** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] [default to undefined]
**po_number** | **string** | The po number | [default to undefined]
**budget_amount** | **number** | If Budget order line, the budget amount. | [optional] [default to undefined]
**billing_contact_firstname** | **string** | The billing contact first name | [default to undefined]
**billing_contact_lastname** | **string** | The billing contact last name | [default to undefined]
**billing_contact_email** | **string** | The billing contact email | [default to undefined]
**media_contact_firstname** | **string** | The media contact first name | [default to undefined]
**media_contact_lastname** | **string** | The media contact last name | [default to undefined]
**media_contact_email** | **string** | The media contact email | [default to undefined]
**agency_link** | **string** | URL link for agency | [optional] [default to undefined]
**user_email** | **string** | The email of user submitting the insertion order | [optional] [default to undefined]
**accepted_terms_time** | **number** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] [default to undefined]
**pmp_id** | **string** | The pmp id | [default to undefined]
**order_name** | **string** | The order name | [default to undefined]
**order_line_type** | **string** | Type can be Budget or Perpetual | [default to undefined]
**accepted_terms_id** | **string** | The SFDC id for the terms | [default to undefined]
**billto_company_id** | **string** | The bill-to company id | [default to undefined]
**billto_business_address_id** | **string** | The bill-to business address id | [default to undefined]
**billto_billing_address_id** | **string** | The bill-to billing address id | [default to undefined]
**estimated_monthly_spend** | **number** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] [default to undefined]
**currency_info** | [**Currency**](Currency.md) |  | [default to undefined]

## Example

```typescript
import { SSIOCreateInsertionOrderRequest } from './api';

const instance: SSIOCreateInsertionOrderRequest = {
    start_date,
    end_date,
    po_number,
    budget_amount,
    billing_contact_firstname,
    billing_contact_lastname,
    billing_contact_email,
    media_contact_firstname,
    media_contact_lastname,
    media_contact_email,
    agency_link,
    user_email,
    accepted_terms_time,
    pmp_id,
    order_name,
    order_line_type,
    accepted_terms_id,
    billto_company_id,
    billto_business_address_id,
    billto_billing_address_id,
    estimated_monthly_spend,
    currency_info,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
