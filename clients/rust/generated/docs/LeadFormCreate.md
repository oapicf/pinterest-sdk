# LeadFormCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_message** | Option<**String**> | A message for people who complete the form to let them know what happens next. | 
**disclosure_language** | Option<**String**> | Additional disclosure language to be included in the lead form. | [optional]
**has_accepted_terms** | **bool** | Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**name** | Option<**String**> | Internal name of the lead form. | 
**policy_links** | Option<[**Vec<models::LeadFormPolicyLink>**](LeadFormPolicyLink.md)> | List of additional policy links to be displayed on the lead form. | [optional]
**privacy_policy_link** | Option<**String**> | A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. | 
**questions** | [**Vec<models::LeadFormQuestion>**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**status** | Option<[**models::LeadFormStatus**](LeadFormStatus.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


