# LeadFormCommon

Creation fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Internal name of the lead form. | [optional] [default to undefined]
**privacy_policy_link** | **string** | A link to the advertiser\&#39;s privacy policy. This will be included in the lead form\&#39;s disclosure language. | [optional] [default to undefined]
**has_accepted_terms** | **boolean** | Whether the advertiser has accepted Pinterest\&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest\&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | [optional] [default to undefined]
**completion_message** | **string** | A message for people who complete the form to let them know what happens next. | [optional] [default to undefined]
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] [default to undefined]
**disclosure_language** | **string** | Additional disclosure language to be included in the lead form. | [optional] [default to undefined]
**questions** | [**Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] [default to undefined]
**policy_links** | [**Array&lt;LeadFormCommonPolicyLinksInner&gt;**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. | [optional] [default to undefined]

## Example

```typescript
import { LeadFormCommon } from './api';

const instance: LeadFormCommon = {
    name,
    privacy_policy_link,
    has_accepted_terms,
    completion_message,
    status,
    disclosure_language,
    questions,
    policy_links,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
