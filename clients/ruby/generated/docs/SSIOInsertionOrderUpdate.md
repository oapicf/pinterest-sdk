# PinterestSdkClient::SSIOInsertionOrderUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ads_manager_order_line_id** | **String** | Ads manager OrderLineId | [optional] |
| **agency_link** | **String** | URL link for agency | [optional] |
| **billing_contact_email** | **String** | The billing contact email | [optional] |
| **billing_contact_firstname** | **String** | The billing contact first name | [optional] |
| **billing_contact_lastname** | **String** | The billing contact last name | [optional] |
| **budget_amount** | **Float** | If Budget order line, the budget amount. | [optional] |
| **end_date** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] |
| **media_contact_email** | **String** | The media contact email | [optional] |
| **media_contact_firstname** | **String** | The media contact first name | [optional] |
| **media_contact_lastname** | **String** | The media contact last name | [optional] |
| **oracle_line_id** | **String** | LineId in the Oracle DB | [optional] |
| **po_number** | **String** | The po number | [optional] |
| **salesforce_order_id** | **String** | OrderId in SFDC | [optional] |
| **salesforce_order_line_id** | **String** | OrderLineId in SFDC | [optional] |
| **start_date** | **String** | Starting date of time period. Format: YYYY-MM-DD | [optional] |
| **user_email** | **String** | The email of user submitting the insertion order | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOInsertionOrderUpdate.new(
  ads_manager_order_line_id: null,
  agency_link: null,
  billing_contact_email: null,
  billing_contact_firstname: null,
  billing_contact_lastname: null,
  budget_amount: null,
  end_date: null,
  media_contact_email: null,
  media_contact_firstname: null,
  media_contact_lastname: null,
  oracle_line_id: null,
  po_number: null,
  salesforce_order_id: null,
  salesforce_order_line_id: null,
  start_date: null,
  user_email: null
)
```

