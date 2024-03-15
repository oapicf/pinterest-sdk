# AudienceRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** | Valid countries include: \"US\", \"CA\", and \"GB\". | [optional] [default to None]
**customer_list_id** | **String** | Customer list ID. For CUSTOMER_LIST `audience_type`. | [optional] [default to None]
**engagement_domain** | **Vec<String>** | The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. | [optional] [default to None]
**engagement_type** | **String** | Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.  | [optional] [default to None]
**event** | **String** | A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. | [optional] [default to None]
**event_data** | [***models::PinterestTagEventData**](PinterestTagEventData.md) |  | [optional] [default to None]
**percentage** | **i32** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional] [default to None]
**pin_id** | **Vec<String>** | IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] | [optional] [default to None]
**prefill** | **bool** | Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. | [optional] [default to None]
**retention_days** | **i32** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. | [optional] [default to None]
**seed_id** | **Vec<String>** | Audience ID(s). For ACTALIKE `audience_type`.  | [optional] [default to None]
**url** | **Vec<String>** | Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} | [optional] [default to None]
**visitor_source_id** | **String** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. | [optional] [default to None]
**event_source** | [***serde_json::Value**](.md) | Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline | [optional] [default to None]
**ingestion_source** | [***serde_json::Value**](.md) | Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional] [default to None]
**engager_type** | **i32** | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional] [default to None]
**campaign_id** | **Vec<String>** | Campaign ID for engagement audience filter. | [optional] [default to None]
**ad_id** | **Vec<String>** | Ad ID for engagement audience filter. | [optional] [default to None]
**objective_type** | [**Vec<models::ObjectiveType>**](ObjectiveType.md) | Objective for engagement audience filter. | [optional] [default to None]
**ad_account_id** | **String** | Ad account ID. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


