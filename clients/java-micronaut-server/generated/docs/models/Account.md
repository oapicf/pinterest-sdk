

# Account

The class is defined in **[Account.java](../../src/main/java/org/openapitools/model/Account.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**about** | `String` | Profile about description. |  [optional property]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of account |  [optional property]
**boardCount** | `Integer` | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. |  [optional property] [readonly property]
**businessName** | `String` |  |  [optional property]
**followerCount** | `Integer` | User account follower count. |  [optional property] [readonly property]
**followingCount** | `Integer` | User account following count. |  [optional property] [readonly property]
**id** | `String` | User account ID. |  [optional property]
**monthlyViews** | `Integer` | User account monthly views. |  [optional property] [readonly property]
**pinCount** | `Integer` | User account pin count. This includes both created and saved pins. |  [optional property] [readonly property]
**profileImage** | `String` |  |  [optional property]
**username** | `String` |  |  [optional property]
**websiteUrl** | `String` |  |  [optional property]


## AccountTypeEnum

Name | Value
---- | -----
PINNER | `"PINNER"`
BUSINESS | `"BUSINESS"`












