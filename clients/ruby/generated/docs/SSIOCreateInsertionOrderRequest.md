# PinterestSdkClient::SSIOCreateInsertionOrderRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **agency_link** | **String** | URL link for agency | [optional] |
| **billing_contact_email** | **String** | The billing contact email |  |
| **billing_contact_firstname** | **String** | The billing contact first name |  |
| **billing_contact_lastname** | **String** | The billing contact last name |  |
| **budget_amount** | **Float** | If Budget order line, the budget amount. | [optional] |
| **end_date** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] |
| **media_contact_email** | **String** | The media contact email |  |
| **media_contact_firstname** | **String** | The media contact first name |  |
| **media_contact_lastname** | **String** | The media contact last name |  |
| **po_number** | **String** | The po number |  |
| **start_date** | **String** | Starting date of time period. Format: YYYY-MM-DD |  |
| **user_email** | **String** | The email of user submitting the insertion order | [optional] |
| **accepted_terms_id** | **String** | The SFDC id for the terms |  |
| **accepted_terms_time** | **Integer** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] |
| **billto_billing_address_id** | **String** | The bill-to billing address id |  |
| **billto_business_address_id** | **String** | The bill-to business address id |  |
| **billto_company_id** | **String** | The bill-to company id |  |
| **currency_info** | [**Currency**](Currency.md) |  |  |
| **estimated_monthly_spend** | **Float** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] |
| **order_line_type** | **String** | Type can be Budget or Perpetual |  |
| **order_name** | **String** | The order name |  |
| **pmp_id** | **String** | The pmp id |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOCreateInsertionOrderRequest.new(
  agency_link: null,
  billing_contact_email: test@example,
  billing_contact_firstname: null,
  billing_contact_lastname: null,
  budget_amount: 5000000,
  end_date: 2020-12-20,
  media_contact_email: test@example,
  media_contact_firstname: null,
  media_contact_lastname: null,
  po_number: null,
  start_date: 2020-12-20,
  user_email: test@example,
  accepted_terms_id: null,
  accepted_terms_time: null,
  billto_billing_address_id: null,
  billto_business_address_id: null,
  billto_company_id: null,
  currency_info: null,
  estimated_monthly_spend: null,
  order_line_type: null,
  order_name: null,
  pmp_id: null
)
```

