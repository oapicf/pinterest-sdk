# openapi::CatalogsReportDistributionStats


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | **character** |  | [optional] [Enum: [DISTRIBUTION_ISSUES]] 
**catalog_id** | **character** | ID of the catalog entity. | [optional] [Pattern: ^\\d+$] 
**code** | **integer** | The event code that a diagnostics aggregated number references | [optional] 
**code_label** | **character** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] 
**message** | **character** | Title message describing the diagnostic issue | [optional] 
**occurrences** | **integer** | Number of occurrences of the issue | [optional] 
**ineligible_for_ads** | **character** | Indicates if issue makes items ineligible for ads distribution | [optional] 
**ineligible_for_organic** | **character** | Indicates if issue makes items ineligible for organic distribution | [optional] 


