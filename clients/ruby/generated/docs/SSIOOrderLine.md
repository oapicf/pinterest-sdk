# PinterestSdkClient::SSIOOrderLine

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **salesforce_order_line_id** | **String** | OrderLineId in SFDC | [optional] |
| **ads_manager_order_line_id** | **String** | Ads manager OrderLineId | [optional] |
| **pin_order_id** | **String** | The pin order id associated with the order line in SFDC | [optional] |
| **last_modified_date_time** | **String** | Last modified date. | [optional] |
| **start_date** | **Date** | Start date of the order line. | [optional] |
| **end_date** | **Date** | End date of the order line. | [optional] |
| **bill_to_company_name** | **String** | Bill To Company name | [optional] |
| **billing_contact_firstname** | **String** | Billing contact first name | [optional] |
| **billing_contact_lastname** | **String** | Billing contact last name | [optional] |
| **billing_contact_email** | **String** | Billing contact email | [optional] |
| **media_contact_email** | **String** | Billing media email | [optional] |
| **media_contact_firstname** | **String** | Billing contact first name | [optional] |
| **media_contact_lastname** | **String** | Billing contact first name | [optional] |
| **currency_info** | [**Currency**](Currency.md) |  | [optional] |
| **agency_link** | **String** | Agency link | [optional] |
| **po_number** | **String** | The po number | [optional] |
| **order_name** | **String** | The order name | [optional] |
| **pmp_name** | **String** | The Pinterest marketing partner name | [optional] |
| **accepted_terms_id** | **String** | The SFDC id for the terms | [optional] |
| **accepted_terms_time** | **String** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] |
| **budget_amount** | **Float** | If Budget order line, the budget amount. | [optional] |
| **estimated_monthly_spend** | **Float** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOOrderLine.new(
  salesforce_order_line_id: null,
  ads_manager_order_line_id: null,
  pin_order_id: null,
  last_modified_date_time: 2020-10-06T13:07:04.000Z,
  start_date: Thu Mar 01 00:00:00 UTC 2018,
  end_date: Mon Oct 05 00:00:00 UTC 2020,
  bill_to_company_name: Home Depot Inc.,
  billing_contact_firstname: Mary,
  billing_contact_lastname: Smith,
  billing_contact_email: mail@test.com,
  media_contact_email: mail@test.com,
  media_contact_firstname: John,
  media_contact_lastname: Doe,
  currency_info: null,
  agency_link: ,
  po_number: null,
  order_name: null,
  pmp_name: null,
  accepted_terms_id: null,
  accepted_terms_time: 2020-10-06T13:07:04.000Z,
  budget_amount: 5000000,
  estimated_monthly_spend: null
)
```

