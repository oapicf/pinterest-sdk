

# Account


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**about** | **String** | Profile about description. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of account |  [optional] |
|**boardCount** | **Integer** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. |  [optional] [readonly] |
|**businessName** | **String** |  |  [optional] |
|**followerCount** | **Integer** | User account follower count. |  [optional] [readonly] |
|**followingCount** | **Integer** | User account following count. |  [optional] [readonly] |
|**id** | **String** | User account ID. |  [optional] |
|**monthlyViews** | **Integer** | User account monthly views. |  [optional] [readonly] |
|**pinCount** | **Integer** | User account pin count. This includes both created and saved pins. |  [optional] [readonly] |
|**profileImage** | **String** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**websiteUrl** | **String** |  |  [optional] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| PINNER | &quot;PINNER&quot; |
| BUSINESS | &quot;BUSINESS&quot; |



