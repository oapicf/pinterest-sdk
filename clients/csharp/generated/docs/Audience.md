# Org.OpenAPITools.Model.Audience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | Ad account ID. | [optional] 
**Id** | **string** | Audience ID. | [optional] 
**Name** | **string** | Audience name. | [optional] 
**AudienceType** | **string** | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**Description** | **string** | Audience description. | [optional] 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**Size** | **int?** | Audience size. | [optional] 
**Status** | **string** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**Type** | **string** | Always \&quot;audience\&quot;. | [optional] 
**CreatedTimestamp** | **int?** | Creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTimestamp** | **int?** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

