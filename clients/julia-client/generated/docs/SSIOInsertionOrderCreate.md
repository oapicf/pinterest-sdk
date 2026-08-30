# SSIOInsertionOrderCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`accepted_terms_id`** | **`String`** | The SFDC id for the terms | [default to nothing]
**`accepted_terms_time`** | **`Int64`** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] [default to nothing]
**`agency_link`** | **`String`** | URL link for agency | [optional] [default to nothing]
**`billing_contact_email`** | **`String`** | The billing contact email | [default to nothing]
**`billing_contact_firstname`** | **`String`** | The billing contact first name | [default to nothing]
**`billing_contact_lastname`** | **`String`** | The billing contact last name | [default to nothing]
**`billto_billing_address_id`** | **`String`** | The bill-to billing address id | [default to nothing]
**`billto_business_address_id`** | **`String`** | The bill-to business address id | [default to nothing]
**`billto_company_id`** | **`String`** | The bill-to company id | [default to nothing]
**`budget_amount`** | **`Float64`** | If Budget order line, the budget amount. | [optional] [default to nothing]
**`currency_info`** | [**`*Currency`**](Currency.md) |  | [default to nothing]
**`end_date`** | **`String`** | End date of time period. Format: YYYY-MM-DD | [optional] [default to nothing]
**`estimated_monthly_spend`** | **`Float64`** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] [default to nothing]
**`media_contact_email`** | **`String`** | The media contact email | [default to nothing]
**`media_contact_firstname`** | **`String`** | The media contact first name | [default to nothing]
**`media_contact_lastname`** | **`String`** | The media contact last name | [default to nothing]
**`order_line_type`** | [**`*SSIOOrderLineType`**](SSIOOrderLineType.md) | Type can be Budget or Perpetual | [default to nothing]
**`order_name`** | **`String`** | The order name | [default to nothing]
**`pmp_id`** | **`String`** | The pmp id | [default to nothing]
**`po_number`** | **`String`** | The po number | [default to nothing]
**`start_date`** | **`String`** | Starting date of time period. Format: YYYY-MM-DD | [default to nothing]
**`user_email`** | **`String`** | The email of user submitting the insertion order | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


