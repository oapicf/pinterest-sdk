# SSIOOrderLine

A Salesforce SSIO order line.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_terms_id** | **string** | The SFDC id for the terms | [optional] [default to undefined]
**accepted_terms_time** | **string** | The UTC timestamp (to the nearest second) when terms were accepted. | [optional] [default to undefined]
**ads_manager_order_line_id** | **string** | Ads manager order line id | [optional] [default to undefined]
**agency_link** | **string** | Agency link | [optional] [default to undefined]
**bill_to_company_name** | **string** | Bill-to company name | [optional] [default to undefined]
**billing_contact_email** | **string** | Billing contact email | [optional] [default to undefined]
**billing_contact_firstname** | **string** | Billing contact first name | [optional] [default to undefined]
**billing_contact_lastname** | **string** | Billing contact last name | [optional] [default to undefined]
**budget_amount** | **number** | If budget order line, the budget amount. | [optional] [default to undefined]
**currency_info** | [**Currency**](Currency.md) |  | [optional] [default to undefined]
**end_date** | **string** | End date of the order line. | [optional] [default to undefined]
**estimated_monthly_spend** | **number** | If ongoing (perpetual) order line, the estimated monthly spend. | [optional] [default to undefined]
**last_modified_date_time** | **string** | Last modified date. | [optional] [default to undefined]
**media_contact_email** | **string** | Billing media email | [optional] [default to undefined]
**media_contact_firstname** | **string** | Billing media contact first name | [optional] [default to undefined]
**media_contact_lastname** | **string** | Billing media contact last name | [optional] [default to undefined]
**order_name** | **string** | The order name | [optional] [default to undefined]
**pin_order_id** | **string** | The pin order id associated with the order line in SFDC | [optional] [default to undefined]
**pmp_name** | **string** | The Pinterest marketing partner name | [optional] [default to undefined]
**po_number** | **string** | The PO number | [optional] [default to undefined]
**salesforce_order_line_id** | **string** | Order line id in SFDC | [optional] [default to undefined]
**start_date** | **string** | Start date of the order line. | [optional] [default to undefined]

## Example

```typescript
import { SSIOOrderLine } from './api';

const instance: SSIOOrderLine = {
    accepted_terms_id,
    accepted_terms_time,
    ads_manager_order_line_id,
    agency_link,
    bill_to_company_name,
    billing_contact_email,
    billing_contact_firstname,
    billing_contact_lastname,
    budget_amount,
    currency_info,
    end_date,
    estimated_monthly_spend,
    last_modified_date_time,
    media_contact_email,
    media_contact_firstname,
    media_contact_lastname,
    order_name,
    pin_order_id,
    pmp_name,
    po_number,
    salesforce_order_line_id,
    start_date,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
