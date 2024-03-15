# AudienceRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | Option<**String**> | Valid countries include: \"US\", \"CA\", and \"GB\". | [optional]
**customer_list_id** | Option<**String**> | Customer list ID. For CUSTOMER_LIST `audience_type`. | [optional]
**engagement_domain** | Option<**Vec<String>**> | The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. | [optional]
**engagement_type** | Option<**String**> | Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.  | [optional]
**event** | Option<**String**> | A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. | [optional]
**event_data** | Option<[**models::PinterestTagEventData**](PinterestTagEventData.md)> |  | [optional]
**percentage** | Option<**i32**> | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional]
**pin_id** | Option<**Vec<String>**> | IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] | [optional]
**prefill** | Option<**bool**> | Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. | [optional]
**retention_days** | Option<**i32**> | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. | [optional]
**seed_id** | Option<**Vec<String>**> | Audience ID(s). For ACTALIKE `audience_type`.  | [optional]
**url** | Option<**Vec<String>**> | Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} | [optional]
**visitor_source_id** | Option<**String**> | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. | [optional]
**event_source** | Option<[**serde_json::Value**](.md)> | Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline | [optional]
**ingestion_source** | Option<[**serde_json::Value**](.md)> | Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional]
**engager_type** | Option<**i32**> | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional]
**campaign_id** | Option<**Vec<String>**> | Campaign ID for engagement audience filter. | [optional]
**ad_id** | Option<**Vec<String>**> | Ad ID for engagement audience filter. | [optional]
**objective_type** | Option<[**Vec<models::ObjectiveType>**](ObjectiveType.md)> | Objective for engagement audience filter. | [optional]
**ad_account_id** | Option<**String**> | Ad account ID. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


