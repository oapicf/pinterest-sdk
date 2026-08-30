# LeadFormBatchUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionMessage** | Pointer to **NullableString** | A message for people who complete the form to let them know what happens next. | [optional] 
**DisclosureLanguage** | Pointer to **NullableString** | Additional disclosure language to be included in the lead form. | [optional] 
**HasAcceptedTerms** | Pointer to **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | [optional] 
**Id** | **string** | The ID of this lead form | 
**Name** | Pointer to **NullableString** | Internal name of the lead form. | [optional] 
**PolicyLinks** | Pointer to [**[]LeadFormPolicyLink**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**PrivacyPolicyLink** | Pointer to **NullableString** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**Questions** | Pointer to [**[]LeadFormQuestion**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 
**Status** | Pointer to [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 

## Methods

### NewLeadFormBatchUpdate

`func NewLeadFormBatchUpdate(id string, ) *LeadFormBatchUpdate`

NewLeadFormBatchUpdate instantiates a new LeadFormBatchUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadFormBatchUpdateWithDefaults

`func NewLeadFormBatchUpdateWithDefaults() *LeadFormBatchUpdate`

NewLeadFormBatchUpdateWithDefaults instantiates a new LeadFormBatchUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompletionMessage

`func (o *LeadFormBatchUpdate) GetCompletionMessage() string`

GetCompletionMessage returns the CompletionMessage field if non-nil, zero value otherwise.

### GetCompletionMessageOk

`func (o *LeadFormBatchUpdate) GetCompletionMessageOk() (*string, bool)`

GetCompletionMessageOk returns a tuple with the CompletionMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionMessage

`func (o *LeadFormBatchUpdate) SetCompletionMessage(v string)`

SetCompletionMessage sets CompletionMessage field to given value.

### HasCompletionMessage

`func (o *LeadFormBatchUpdate) HasCompletionMessage() bool`

HasCompletionMessage returns a boolean if a field has been set.

### SetCompletionMessageNil

`func (o *LeadFormBatchUpdate) SetCompletionMessageNil(b bool)`

 SetCompletionMessageNil sets the value for CompletionMessage to be an explicit nil

### UnsetCompletionMessage
`func (o *LeadFormBatchUpdate) UnsetCompletionMessage()`

UnsetCompletionMessage ensures that no value is present for CompletionMessage, not even an explicit nil
### GetDisclosureLanguage

`func (o *LeadFormBatchUpdate) GetDisclosureLanguage() string`

GetDisclosureLanguage returns the DisclosureLanguage field if non-nil, zero value otherwise.

### GetDisclosureLanguageOk

`func (o *LeadFormBatchUpdate) GetDisclosureLanguageOk() (*string, bool)`

GetDisclosureLanguageOk returns a tuple with the DisclosureLanguage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureLanguage

`func (o *LeadFormBatchUpdate) SetDisclosureLanguage(v string)`

SetDisclosureLanguage sets DisclosureLanguage field to given value.

### HasDisclosureLanguage

`func (o *LeadFormBatchUpdate) HasDisclosureLanguage() bool`

HasDisclosureLanguage returns a boolean if a field has been set.

### SetDisclosureLanguageNil

`func (o *LeadFormBatchUpdate) SetDisclosureLanguageNil(b bool)`

 SetDisclosureLanguageNil sets the value for DisclosureLanguage to be an explicit nil

### UnsetDisclosureLanguage
`func (o *LeadFormBatchUpdate) UnsetDisclosureLanguage()`

UnsetDisclosureLanguage ensures that no value is present for DisclosureLanguage, not even an explicit nil
### GetHasAcceptedTerms

`func (o *LeadFormBatchUpdate) GetHasAcceptedTerms() bool`

GetHasAcceptedTerms returns the HasAcceptedTerms field if non-nil, zero value otherwise.

### GetHasAcceptedTermsOk

`func (o *LeadFormBatchUpdate) GetHasAcceptedTermsOk() (*bool, bool)`

GetHasAcceptedTermsOk returns a tuple with the HasAcceptedTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasAcceptedTerms

`func (o *LeadFormBatchUpdate) SetHasAcceptedTerms(v bool)`

SetHasAcceptedTerms sets HasAcceptedTerms field to given value.

### HasHasAcceptedTerms

`func (o *LeadFormBatchUpdate) HasHasAcceptedTerms() bool`

HasHasAcceptedTerms returns a boolean if a field has been set.

### GetId

`func (o *LeadFormBatchUpdate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LeadFormBatchUpdate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LeadFormBatchUpdate) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *LeadFormBatchUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LeadFormBatchUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LeadFormBatchUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *LeadFormBatchUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *LeadFormBatchUpdate) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *LeadFormBatchUpdate) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPolicyLinks

`func (o *LeadFormBatchUpdate) GetPolicyLinks() []LeadFormPolicyLink`

GetPolicyLinks returns the PolicyLinks field if non-nil, zero value otherwise.

### GetPolicyLinksOk

`func (o *LeadFormBatchUpdate) GetPolicyLinksOk() (*[]LeadFormPolicyLink, bool)`

GetPolicyLinksOk returns a tuple with the PolicyLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPolicyLinks

`func (o *LeadFormBatchUpdate) SetPolicyLinks(v []LeadFormPolicyLink)`

SetPolicyLinks sets PolicyLinks field to given value.

### HasPolicyLinks

`func (o *LeadFormBatchUpdate) HasPolicyLinks() bool`

HasPolicyLinks returns a boolean if a field has been set.

### GetPrivacyPolicyLink

`func (o *LeadFormBatchUpdate) GetPrivacyPolicyLink() string`

GetPrivacyPolicyLink returns the PrivacyPolicyLink field if non-nil, zero value otherwise.

### GetPrivacyPolicyLinkOk

`func (o *LeadFormBatchUpdate) GetPrivacyPolicyLinkOk() (*string, bool)`

GetPrivacyPolicyLinkOk returns a tuple with the PrivacyPolicyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivacyPolicyLink

`func (o *LeadFormBatchUpdate) SetPrivacyPolicyLink(v string)`

SetPrivacyPolicyLink sets PrivacyPolicyLink field to given value.

### HasPrivacyPolicyLink

`func (o *LeadFormBatchUpdate) HasPrivacyPolicyLink() bool`

HasPrivacyPolicyLink returns a boolean if a field has been set.

### SetPrivacyPolicyLinkNil

`func (o *LeadFormBatchUpdate) SetPrivacyPolicyLinkNil(b bool)`

 SetPrivacyPolicyLinkNil sets the value for PrivacyPolicyLink to be an explicit nil

### UnsetPrivacyPolicyLink
`func (o *LeadFormBatchUpdate) UnsetPrivacyPolicyLink()`

UnsetPrivacyPolicyLink ensures that no value is present for PrivacyPolicyLink, not even an explicit nil
### GetQuestions

`func (o *LeadFormBatchUpdate) GetQuestions() []LeadFormQuestion`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *LeadFormBatchUpdate) GetQuestionsOk() (*[]LeadFormQuestion, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *LeadFormBatchUpdate) SetQuestions(v []LeadFormQuestion)`

SetQuestions sets Questions field to given value.

### HasQuestions

`func (o *LeadFormBatchUpdate) HasQuestions() bool`

HasQuestions returns a boolean if a field has been set.

### GetStatus

`func (o *LeadFormBatchUpdate) GetStatus() LeadFormStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LeadFormBatchUpdate) GetStatusOk() (*LeadFormStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LeadFormBatchUpdate) SetStatus(v LeadFormStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LeadFormBatchUpdate) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


