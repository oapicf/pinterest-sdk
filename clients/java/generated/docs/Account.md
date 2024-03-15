

# Account


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of account |  [optional] |
|**id** | **String** | User account ID. |  [optional] |
|**profileImage** | **String** |  |  [optional] |
|**websiteUrl** | **String** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**about** | **String** | Profile about description. |  [optional] |
|**businessName** | **String** |  |  [optional] |
|**boardCount** | **Integer** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. |  [optional] [readonly] |
|**pinCount** | **Integer** | User account pin count. This includes both created and saved pins. |  [optional] [readonly] |
|**followerCount** | **Integer** | User account follower count. |  [optional] [readonly] |
|**followingCount** | **Integer** | User account following count. |  [optional] [readonly] |
|**monthlyViews** | **Integer** | User account monthly views. |  [optional] [readonly] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| PINNER | &quot;PINNER&quot; |
| BUSINESS | &quot;BUSINESS&quot; |



