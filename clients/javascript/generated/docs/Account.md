# PinterestSdk.Account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountType** | **String** | Type of account | [optional] 
**id** | **String** | User account ID. | [optional] 
**profileImage** | **String** |  | [optional] 
**websiteUrl** | **String** |  | [optional] 
**username** | **String** |  | [optional] 
**about** | **String** | Profile about description. | [optional] 
**businessName** | **String** |  | [optional] 
**boardCount** | **Number** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional] [readonly] 
**pinCount** | **Number** | User account pin count. This includes both created and saved pins. | [optional] [readonly] 
**followerCount** | **Number** | User account follower count. | [optional] [readonly] 
**followingCount** | **Number** | User account following count. | [optional] [readonly] 
**monthlyViews** | **Number** | User account monthly views. | [optional] [readonly] 



## Enum: AccountTypeEnum


* `PINNER` (value: `"PINNER"`)

* `BUSINESS` (value: `"BUSINESS"`)




