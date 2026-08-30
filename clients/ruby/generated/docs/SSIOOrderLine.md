# PinterestSdkClient::SSIOOrderLine

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **accepted_terms_id** | **String** | The SFDC id for the terms | [optional] |
| **accepted_terms_time** | **String** | The UTC timestamp (to the nearest second) when terms were accepted. | [optional] |
| **ads_manager_order_line_id** | **String** | Ads manager order line id | [optional] |
| **agency_link** | **String** | Agency link | [optional] |
| **bill_to_company_name** | **String** | Bill-to company name | [optional] |
| **billing_contact_email** | **String** | Billing contact email | [optional] |
| **billing_contact_firstname** | **String** | Billing contact first name | [optional] |
| **billing_contact_lastname** | **String** | Billing contact last name | [optional] |
| **budget_amount** | **Float** | If budget order line, the budget amount. | [optional] |
| **currency_info** | [**Currency**](Currency.md) |  | [optional] |
| **end_date** | **Date** | End date of the order line. | [optional] |
| **estimated_monthly_spend** | **Float** | If ongoing (perpetual) order line, the estimated monthly spend. | [optional] |
| **last_modified_date_time** | **String** | Last modified date. | [optional] |
| **media_contact_email** | **String** | Billing media email | [optional] |
| **media_contact_firstname** | **String** | Billing media contact first name | [optional] |
| **media_contact_lastname** | **String** | Billing media contact last name | [optional] |
| **order_name** | **String** | The order name | [optional] |
| **pin_order_id** | **String** | The pin order id associated with the order line in SFDC | [optional] |
| **pmp_name** | **String** | The Pinterest marketing partner name | [optional] |
| **po_number** | **String** | The PO number | [optional] |
| **salesforce_order_line_id** | **String** | Order line id in SFDC | [optional] |
| **start_date** | **Date** | Start date of the order line. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOOrderLine.new(
  accepted_terms_id: null,
  accepted_terms_time: 2020-10-06T13:07:04.000Z,
  ads_manager_order_line_id: null,
  agency_link: ,
  bill_to_company_name: Home Depot Inc.,
  billing_contact_email: mail@test.com,
  billing_contact_firstname: Mary,
  billing_contact_lastname: Smith,
  budget_amount: 5000000,
  currency_info: null,
  end_date: null,
  estimated_monthly_spend: null,
  last_modified_date_time: 2020-10-06T13:07:04.000Z,
  media_contact_email: mail@test.com,
  media_contact_firstname: John,
  media_contact_lastname: Doe,
  order_name: null,
  pin_order_id: null,
  pmp_name: null,
  po_number: null,
  salesforce_order_line_id: null,
  start_date: null
)
```

