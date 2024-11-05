# LeadFormUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | Option<**String**> | Internal name of the lead form. | [optional]
**privacy_policy_link** | Option<**String**> | A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. | [optional]
**has_accepted_terms** | Option<**bool**> | Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO | [optional]
**completion_message** | Option<**String**> | A message for people who complete the form to let them know what happens next. | [optional]
**status** | Option<[**models::LeadFormStatus**](LeadFormStatus.md)> |  | [optional]
**disclosure_language** | Option<**String**> | Additional disclosure language to be included in the lead form. | [optional]
**questions** | Option<[**Vec<models::LeadFormQuestion>**](LeadFormQuestion.md)> | List of questions to be displayed on the lead form. | [optional]
**policy_links** | Option<[**Vec<models::LeadFormCommonPolicyLinksInner>**](LeadFormCommon_policy_links_inner.md)> | List of additional policy links to be displayed on the lead form. | [optional]
**id** | **String** | The ID of this lead form to be updated | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


