# SSIOCreateInsertionOrderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agency_link** | **str** | URL link for agency | [optional] 
**billing_contact_email** | **str** | The billing contact email | 
**billing_contact_firstname** | **str** | The billing contact first name | 
**billing_contact_lastname** | **str** | The billing contact last name | 
**budget_amount** | **float** | If Budget order line, the budget amount. | [optional] 
**end_date** | **str** | End date of time period. Format: YYYY-MM-DD | [optional] 
**media_contact_email** | **str** | The media contact email | 
**media_contact_firstname** | **str** | The media contact first name | 
**media_contact_lastname** | **str** | The media contact last name | 
**po_number** | **str** | The po number | 
**start_date** | **str** | Starting date of time period. Format: YYYY-MM-DD | 
**user_email** | **str** | The email of user submitting the insertion order | [optional] 
**accepted_terms_id** | **str** | The SFDC id for the terms | 
**accepted_terms_time** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**billto_billing_address_id** | **str** | The bill-to billing address id | 
**billto_business_address_id** | **str** | The bill-to business address id | 
**billto_company_id** | **str** | The bill-to company id | 
**currency_info** | [**Currency**](Currency.md) |  | 
**estimated_monthly_spend** | **float** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**order_line_type** | **str** | Type can be Budget or Perpetual | 
**order_name** | **str** | The order name | 
**pmp_id** | **str** | The pmp id | 

## Example

```python
from pinterestsdk.models.ssio_create_insertion_order_request import SSIOCreateInsertionOrderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOCreateInsertionOrderRequest from a JSON string
ssio_create_insertion_order_request_instance = SSIOCreateInsertionOrderRequest.from_json(json)
# print the JSON string representation of the object
print(SSIOCreateInsertionOrderRequest.to_json())

# convert the object into a dict
ssio_create_insertion_order_request_dict = ssio_create_insertion_order_request_instance.to_dict()
# create an instance of SSIOCreateInsertionOrderRequest from a dict
ssio_create_insertion_order_request_from_dict = SSIOCreateInsertionOrderRequest.from_dict(ssio_create_insertion_order_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


