# openapi::Account


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_type** | **character** | Type of account | [optional] [Enum: [PINNER, BUSINESS]] 
**id** | **character** | User account ID. | [optional] [Pattern: ^\\d+$] 
**profile_image** | **character** |  | [optional] 
**website_url** | **character** |  | [optional] 
**username** | **character** |  | [optional] 
**about** | **character** | Profile about description. | [optional] 
**business_name** | **character** |  | [optional] 
**board_count** | **integer** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional] [readonly] 
**pin_count** | **integer** | User account pin count. This includes both created and saved pins. | [optional] [readonly] 
**follower_count** | **integer** | User account follower count. | [optional] [readonly] 
**following_count** | **integer** | User account following count. | [optional] [readonly] 
**monthly_views** | **integer** | User account monthly views. | [optional] [readonly] 


