# PinterestSdkClient::SSIOInsertionOrderCommon

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

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOInsertionOrderCommon.new(
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
  user_email: test@example
)
```

