# openapi::BulkDownloadRequestCampaignFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_time** | **character** | Unix UTC timestamp. | [optional] [Pattern: ^\\d+$] 
**end_time** | **character** | Unix UTC timestamp. | [optional] [Pattern: ^\\d+$] 
**name** | **character** | Campaign name | [optional] 
**campaign_status** | [**array[CampaignSummaryStatus]**](CampaignSummaryStatus.md) |  | [optional] 
**objective_type** | [**array[ObjectiveType]**](ObjectiveType.md) |  | [optional] 


