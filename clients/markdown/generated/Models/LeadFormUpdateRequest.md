# LeadFormUpdateRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **name** | **String** | Internal name of the lead form. | [optional] [default to null] |
| **privacy\_policy\_link** | **String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] [default to null] |
| **has\_accepted\_terms** | **Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | [optional] [default to null] |
| **completion\_message** | **String** | A message for people who complete the form to let them know what happens next. | [optional] [default to null] |
| **status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] [default to null] |
| **disclosure\_language** | **String** | Additional disclosure language to be included in the lead form. | [optional] [default to null] |
| **questions** | [**List**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] [default to null] |
| **policy\_links** | [**List**](LeadFormCommon_policy_links_inner.md) | List of additional policy links to be displayed on the lead form. | [optional] [default to null] |
| **id** | **String** | The ID of this lead form to be updated | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

