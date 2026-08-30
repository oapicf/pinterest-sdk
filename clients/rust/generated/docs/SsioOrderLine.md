# SsioOrderLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_terms_id** | Option<**String**> | The SFDC id for the terms | [optional]
**accepted_terms_time** | Option<**String**> | The UTC timestamp (to the nearest second) when terms were accepted. | [optional]
**ads_manager_order_line_id** | Option<**String**> | Ads manager order line id | [optional]
**agency_link** | Option<**String**> | Agency link | [optional]
**bill_to_company_name** | Option<**String**> | Bill-to company name | [optional]
**billing_contact_email** | Option<**String**> | Billing contact email | [optional]
**billing_contact_firstname** | Option<**String**> | Billing contact first name | [optional]
**billing_contact_lastname** | Option<**String**> | Billing contact last name | [optional]
**budget_amount** | Option<**f64**> | If budget order line, the budget amount. | [optional]
**currency_info** | Option<[**models::Currency**](Currency.md)> |  | [optional]
**end_date** | Option<**chrono::NaiveDate**> | End date of the order line. | [optional]
**estimated_monthly_spend** | Option<**f64**> | If ongoing (perpetual) order line, the estimated monthly spend. | [optional]
**last_modified_date_time** | Option<**String**> | Last modified date. | [optional]
**media_contact_email** | Option<**String**> | Billing media email | [optional]
**media_contact_firstname** | Option<**String**> | Billing media contact first name | [optional]
**media_contact_lastname** | Option<**String**> | Billing media contact last name | [optional]
**order_name** | Option<**String**> | The order name | [optional]
**pin_order_id** | Option<**String**> | The pin order id associated with the order line in SFDC | [optional]
**pmp_name** | Option<**String**> | The Pinterest marketing partner name | [optional]
**po_number** | Option<**String**> | The PO number | [optional]
**salesforce_order_line_id** | Option<**String**> | Order line id in SFDC | [optional]
**start_date** | Option<**chrono::NaiveDate**> | Start date of the order line. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


