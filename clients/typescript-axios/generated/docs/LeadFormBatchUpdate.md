# LeadFormBatchUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_message** | **string** | A message for people who complete the form to let them know what happens next. | [optional] [default to undefined]
**disclosure_language** | **string** | Additional disclosure language to be included in the lead form. | [optional] [default to undefined]
**has_accepted_terms** | **boolean** | Whether the advertiser has accepted Pinterest\&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest\&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | [optional] [default to undefined]
**id** | **string** | The ID of this lead form | [default to undefined]
**name** | **string** | Internal name of the lead form. | [optional] [default to undefined]
**policy_links** | [**Array&lt;LeadFormPolicyLink&gt;**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] [default to undefined]
**privacy_policy_link** | **string** | A link to the advertiser\&#39;s privacy policy. This will be included in the lead form\&#39;s disclosure language. | [optional] [default to undefined]
**questions** | [**Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] [default to undefined]
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] [default to undefined]

## Example

```typescript
import { LeadFormBatchUpdate } from './api';

const instance: LeadFormBatchUpdate = {
    completion_message,
    disclosure_language,
    has_accepted_terms,
    id,
    name,
    policy_links,
    privacy_policy_link,
    questions,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
