# # SSIOCreateInsertionOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agency_link** | **string** | URL link for agency | [optional]
**billing_contact_email** | **string** | The billing contact email |
**billing_contact_firstname** | **string** | The billing contact first name |
**billing_contact_lastname** | **string** | The billing contact last name |
**budget_amount** | **float** | If Budget order line, the budget amount. | [optional]
**end_date** | **string** | End date of time period. Format: YYYY-MM-DD | [optional]
**media_contact_email** | **string** | The media contact email |
**media_contact_firstname** | **string** | The media contact first name |
**media_contact_lastname** | **string** | The media contact last name |
**po_number** | **string** | The po number |
**start_date** | **string** | Starting date of time period. Format: YYYY-MM-DD |
**user_email** | **string** | The email of user submitting the insertion order | [optional]
**accepted_terms_id** | **string** | The SFDC id for the terms |
**accepted_terms_time** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional]
**billto_billing_address_id** | **string** | The bill-to billing address id |
**billto_business_address_id** | **string** | The bill-to business address id |
**billto_company_id** | **string** | The bill-to company id |
**currency_info** | [**\OpenAPI\Client\Model\Currency**](Currency.md) |  |
**estimated_monthly_spend** | **float** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional]
**order_line_type** | **string** | Type can be Budget or Perpetual |
**order_name** | **string** | The order name |
**pmp_id** | **string** | The pmp id |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
