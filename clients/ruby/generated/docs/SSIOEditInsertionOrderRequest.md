# PinterestSdkClient::SSIOEditInsertionOrderRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **String** | Starting date of time period. Format: YYYY-MM-DD | [optional] |
| **end_date** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] |
| **po_number** | **String** | The po number | [optional] |
| **budget_amount** | **Float** | If Budget order line, the budget amount. | [optional] |
| **billing_contact_firstname** | **String** | The billing contact first name | [optional] |
| **billing_contact_lastname** | **String** | The billing contact last name | [optional] |
| **billing_contact_email** | **String** | The billing contact email | [optional] |
| **media_contact_firstname** | **String** | The media contact first name | [optional] |
| **media_contact_lastname** | **String** | The media contact last name | [optional] |
| **media_contact_email** | **String** | The media contact email | [optional] |
| **agency_link** | **String** | URL link for agency | [optional] |
| **user_email** | **String** | The email of user submitting the insertion order | [optional] |
| **oracle_line_id** | **String** | LineId in the Oracle DB | [optional] |
| **salesforce_order_id** | **String** | OrderId in SFDC | [optional] |
| **salesforce_order_line_id** | **String** | OrderLineId in SFDC | [optional] |
| **ads_manager_order_line_id** | **String** | Ads manager OrderLineId | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOEditInsertionOrderRequest.new(
  start_date: 2020-12-20,
  end_date: 2020-12-20,
  po_number: null,
  budget_amount: 5000000,
  billing_contact_firstname: null,
  billing_contact_lastname: null,
  billing_contact_email: test@example,
  media_contact_firstname: null,
  media_contact_lastname: null,
  media_contact_email: test@example,
  agency_link: null,
  user_email: test@example,
  oracle_line_id: null,
  salesforce_order_id: null,
  salesforce_order_line_id: null,
  ads_manager_order_line_id: null
)
```

