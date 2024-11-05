# lead_form_update_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **char \*** | Internal name of the lead form. | [optional] 
**privacy_policy_link** | **char \*** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**has_accepted_terms** | **int** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | [optional] 
**completion_message** | **char \*** | A message for people who complete the form to let them know what happens next. | [optional] 
**status** | **lead_form_status_t \*** |  | [optional] 
**disclosure_language** | **char \*** | Additional disclosure language to be included in the lead form. | [optional] 
**questions** | [**list_t**](lead_form_question.md) \* | List of questions to be displayed on the lead form. | [optional] 
**policy_links** | [**list_t**](lead_form_common_policy_links_inner.md) \* | List of additional policy links to be displayed on the lead form. | [optional] 
**id** | **char \*** | The ID of this lead form to be updated | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


