
# Table `Account`
(mapped from: Account)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accountType** | account_type | text |  | [**account_type**](#AccountType) | Type of account |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | User account ID. |  [optional]
**profileImage** | profile_image | text |  | **kotlin.String** |  |  [optional]
**websiteUrl** | website_url | text |  | **kotlin.String** |  |  [optional]
**username** | username | text |  | **kotlin.String** |  |  [optional]
**about** | about | text |  | **kotlin.String** | Profile about description. |  [optional]
**businessName** | business_name | text |  | **kotlin.String** |  |  [optional]
**boardCount** | board_count | int |  | **kotlin.Int** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. |  [optional] [readonly]
**pinCount** | pin_count | int |  | **kotlin.Int** | User account pin count. This includes both created and saved pins. |  [optional] [readonly]
**followerCount** | follower_count | int |  | **kotlin.Int** | User account follower count. |  [optional] [readonly]
**followingCount** | following_count | int |  | **kotlin.Int** | User account following count. |  [optional] [readonly]
**monthlyViews** | monthly_views | int |  | **kotlin.Int** | User account monthly views. |  [optional] [readonly]














