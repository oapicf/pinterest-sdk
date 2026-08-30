# LeadFormCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionMessage** | **NullableString** | A message for people who complete the form to let them know what happens next. | 
**DisclosureLanguage** | Pointer to **NullableString** | Additional disclosure language to be included in the lead form. | [optional] 
**HasAcceptedTerms** | **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**Name** | **NullableString** | Internal name of the lead form. | 
**PolicyLinks** | Pointer to [**[]LeadFormPolicyLink**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**PrivacyPolicyLink** | **NullableString** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**Questions** | [**[]LeadFormQuestion**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**Status** | Pointer to [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 

## Methods

### NewLeadFormCreate

`func NewLeadFormCreate(completionMessage NullableString, hasAcceptedTerms bool, name NullableString, privacyPolicyLink NullableString, questions []LeadFormQuestion, ) *LeadFormCreate`

NewLeadFormCreate instantiates a new LeadFormCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadFormCreateWithDefaults

`func NewLeadFormCreateWithDefaults() *LeadFormCreate`

NewLeadFormCreateWithDefaults instantiates a new LeadFormCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompletionMessage

`func (o *LeadFormCreate) GetCompletionMessage() string`

GetCompletionMessage returns the CompletionMessage field if non-nil, zero value otherwise.

### GetCompletionMessageOk

`func (o *LeadFormCreate) GetCompletionMessageOk() (*string, bool)`

GetCompletionMessageOk returns a tuple with the CompletionMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionMessage

`func (o *LeadFormCreate) SetCompletionMessage(v string)`

SetCompletionMessage sets CompletionMessage field to given value.


### SetCompletionMessageNil

`func (o *LeadFormCreate) SetCompletionMessageNil(b bool)`

 SetCompletionMessageNil sets the value for CompletionMessage to be an explicit nil

### UnsetCompletionMessage
`func (o *LeadFormCreate) UnsetCompletionMessage()`

UnsetCompletionMessage ensures that no value is present for CompletionMessage, not even an explicit nil
### GetDisclosureLanguage

`func (o *LeadFormCreate) GetDisclosureLanguage() string`

GetDisclosureLanguage returns the DisclosureLanguage field if non-nil, zero value otherwise.

### GetDisclosureLanguageOk

`func (o *LeadFormCreate) GetDisclosureLanguageOk() (*string, bool)`

GetDisclosureLanguageOk returns a tuple with the DisclosureLanguage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureLanguage

`func (o *LeadFormCreate) SetDisclosureLanguage(v string)`

SetDisclosureLanguage sets DisclosureLanguage field to given value.

### HasDisclosureLanguage

`func (o *LeadFormCreate) HasDisclosureLanguage() bool`

HasDisclosureLanguage returns a boolean if a field has been set.

### SetDisclosureLanguageNil

`func (o *LeadFormCreate) SetDisclosureLanguageNil(b bool)`

 SetDisclosureLanguageNil sets the value for DisclosureLanguage to be an explicit nil

### UnsetDisclosureLanguage
`func (o *LeadFormCreate) UnsetDisclosureLanguage()`

UnsetDisclosureLanguage ensures that no value is present for DisclosureLanguage, not even an explicit nil
### GetHasAcceptedTerms

`func (o *LeadFormCreate) GetHasAcceptedTerms() bool`

GetHasAcceptedTerms returns the HasAcceptedTerms field if non-nil, zero value otherwise.

### GetHasAcceptedTermsOk

`func (o *LeadFormCreate) GetHasAcceptedTermsOk() (*bool, bool)`

GetHasAcceptedTermsOk returns a tuple with the HasAcceptedTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasAcceptedTerms

`func (o *LeadFormCreate) SetHasAcceptedTerms(v bool)`

SetHasAcceptedTerms sets HasAcceptedTerms field to given value.


### GetName

`func (o *LeadFormCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LeadFormCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LeadFormCreate) SetName(v string)`

SetName sets Name field to given value.


### SetNameNil

`func (o *LeadFormCreate) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *LeadFormCreate) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPolicyLinks

`func (o *LeadFormCreate) GetPolicyLinks() []LeadFormPolicyLink`

GetPolicyLinks returns the PolicyLinks field if non-nil, zero value otherwise.

### GetPolicyLinksOk

`func (o *LeadFormCreate) GetPolicyLinksOk() (*[]LeadFormPolicyLink, bool)`

GetPolicyLinksOk returns a tuple with the PolicyLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPolicyLinks

`func (o *LeadFormCreate) SetPolicyLinks(v []LeadFormPolicyLink)`

SetPolicyLinks sets PolicyLinks field to given value.

### HasPolicyLinks

`func (o *LeadFormCreate) HasPolicyLinks() bool`

HasPolicyLinks returns a boolean if a field has been set.

### GetPrivacyPolicyLink

`func (o *LeadFormCreate) GetPrivacyPolicyLink() string`

GetPrivacyPolicyLink returns the PrivacyPolicyLink field if non-nil, zero value otherwise.

### GetPrivacyPolicyLinkOk

`func (o *LeadFormCreate) GetPrivacyPolicyLinkOk() (*string, bool)`

GetPrivacyPolicyLinkOk returns a tuple with the PrivacyPolicyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivacyPolicyLink

`func (o *LeadFormCreate) SetPrivacyPolicyLink(v string)`

SetPrivacyPolicyLink sets PrivacyPolicyLink field to given value.


### SetPrivacyPolicyLinkNil

`func (o *LeadFormCreate) SetPrivacyPolicyLinkNil(b bool)`

 SetPrivacyPolicyLinkNil sets the value for PrivacyPolicyLink to be an explicit nil

### UnsetPrivacyPolicyLink
`func (o *LeadFormCreate) UnsetPrivacyPolicyLink()`

UnsetPrivacyPolicyLink ensures that no value is present for PrivacyPolicyLink, not even an explicit nil
### GetQuestions

`func (o *LeadFormCreate) GetQuestions() []LeadFormQuestion`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *LeadFormCreate) GetQuestionsOk() (*[]LeadFormQuestion, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *LeadFormCreate) SetQuestions(v []LeadFormQuestion)`

SetQuestions sets Questions field to given value.


### GetStatus

`func (o *LeadFormCreate) GetStatus() LeadFormStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LeadFormCreate) GetStatusOk() (*LeadFormStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LeadFormCreate) SetStatus(v LeadFormStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LeadFormCreate) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


