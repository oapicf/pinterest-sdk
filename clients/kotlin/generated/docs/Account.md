
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountType** | [**inline**](#AccountType) | Type of account |  [optional]
**id** | **kotlin.String** | User account ID. |  [optional]
**profileImage** | **kotlin.String** |  |  [optional]
**websiteUrl** | **kotlin.String** |  |  [optional]
**username** | **kotlin.String** |  |  [optional]
**about** | **kotlin.String** | Profile about description. |  [optional]
**businessName** | **kotlin.String** |  |  [optional]
**boardCount** | **kotlin.Int** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. |  [optional] [readonly]
**pinCount** | **kotlin.Int** | User account pin count. This includes both created and saved pins. |  [optional] [readonly]
**followerCount** | **kotlin.Int** | User account follower count. |  [optional] [readonly]
**followingCount** | **kotlin.Int** | User account following count. |  [optional] [readonly]
**monthlyViews** | **kotlin.Int** | User account monthly views. |  [optional] [readonly]


<a id="AccountType"></a>
## Enum: account_type
Name | Value
---- | -----
accountType | PINNER, BUSINESS



