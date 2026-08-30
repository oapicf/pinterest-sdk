# SSIOInsertionOrderCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_terms_id** | **str** | The SFDC id for the terms | 
**accepted_terms_time** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**agency_link** | **str** | URL link for agency | [optional] 
**billing_contact_email** | **str** | The billing contact email | 
**billing_contact_firstname** | **str** | The billing contact first name | 
**billing_contact_lastname** | **str** | The billing contact last name | 
**billto_billing_address_id** | **str** | The bill-to billing address id | 
**billto_business_address_id** | **str** | The bill-to business address id | 
**billto_company_id** | **str** | The bill-to company id | 
**budget_amount** | **float** | If Budget order line, the budget amount. | [optional] 
**currency_info** | [**Currency**](Currency.md) |  | 
**end_date** | **str** | End date of time period. Format: YYYY-MM-DD | [optional] 
**estimated_monthly_spend** | **float** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**media_contact_email** | **str** | The media contact email | 
**media_contact_firstname** | **str** | The media contact first name | 
**media_contact_lastname** | **str** | The media contact last name | 
**order_line_type** | [**SSIOOrderLineType**](SSIOOrderLineType.md) | Type can be Budget or Perpetual | 
**order_name** | **str** | The order name | 
**pmp_id** | **str** | The pmp id | 
**po_number** | **str** | The po number | 
**start_date** | **str** | Starting date of time period. Format: YYYY-MM-DD | 
**user_email** | **str** | The email of user submitting the insertion order | [optional] 

## Example

```python
from pinterestsdk.models.ssio_insertion_order_create import SSIOInsertionOrderCreate

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOInsertionOrderCreate from a JSON string
ssio_insertion_order_create_instance = SSIOInsertionOrderCreate.from_json(json)
# print the JSON string representation of the object
print(SSIOInsertionOrderCreate.to_json())

# convert the object into a dict
ssio_insertion_order_create_dict = ssio_insertion_order_create_instance.to_dict()
# create an instance of SSIOInsertionOrderCreate from a dict
ssio_insertion_order_create_from_dict = SSIOInsertionOrderCreate.from_dict(ssio_insertion_order_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


