# openapi::ConversionEventResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Id of the ad account. | [optional] [Pattern: ^\\d+$] 
**conversion_event** | [**ConversionTagType**](ConversionTagType.md) |  | [optional] [Enum: ] 
**conversion_tag_id** | **character** | Id of the tag. | [optional] [Pattern: ^\\d+$] 
**created_time** | **integer** | Creation date in epoch format. | [optional] 
**reporting_conversion_event** | **character** | For advertiser-defined events, the reporting event label shown in optimization UIs. | [optional] 


