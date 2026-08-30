# openapi::Account

User account model containing properties related to a user's account.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**about** | **character** | Profile about description. | [optional] 
**account_type** | [**UserAccountType**](UserAccountType.md) | Type of account | [optional] [Enum: ] 
**board_count** | **integer** |   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional] [readonly] 
**business_name** | **character** |  | [optional] 
**follower_count** | **integer** | User account follower count. | [optional] [readonly] 
**following_count** | **integer** | User account following count. | [optional] [readonly] 
**id** | **character** | User account ID. | [optional] [Pattern: ^\\d+$] 
**monthly_views** | **integer** | User account monthly views. | [optional] [readonly] 
**pin_count** | **integer** | User account pin count. This includes both created and saved pins. | [optional] [readonly] 
**profile_image** | **character** |  | [optional] 
**username** | **character** |  | [optional] 
**website_url** | **character** |  | [optional] 


