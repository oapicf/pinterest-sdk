# LeadFormCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **NullableString** | Internal name of the lead form. | [optional] 
**PrivacyPolicyLink** | Pointer to **NullableString** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**HasAcceptedTerms** | Pointer to **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. | [optional] 
**CompletionMessage** | Pointer to **NullableString** | A message for people who complete the form to let them know what happens next. | [optional] 
**Status** | Pointer to [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 
**DisclosureLanguage** | Pointer to **NullableString** | Additional disclosure language to be included in the lead form. | [optional] 
**Questions** | Pointer to [**[]LeadFormQuestion**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 

## Methods

### NewLeadFormCommon

`func NewLeadFormCommon() *LeadFormCommon`

NewLeadFormCommon instantiates a new LeadFormCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadFormCommonWithDefaults

`func NewLeadFormCommonWithDefaults() *LeadFormCommon`

NewLeadFormCommonWithDefaults instantiates a new LeadFormCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *LeadFormCommon) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LeadFormCommon) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LeadFormCommon) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *LeadFormCommon) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *LeadFormCommon) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *LeadFormCommon) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPrivacyPolicyLink

`func (o *LeadFormCommon) GetPrivacyPolicyLink() string`

GetPrivacyPolicyLink returns the PrivacyPolicyLink field if non-nil, zero value otherwise.

### GetPrivacyPolicyLinkOk

`func (o *LeadFormCommon) GetPrivacyPolicyLinkOk() (*string, bool)`

GetPrivacyPolicyLinkOk returns a tuple with the PrivacyPolicyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivacyPolicyLink

`func (o *LeadFormCommon) SetPrivacyPolicyLink(v string)`

SetPrivacyPolicyLink sets PrivacyPolicyLink field to given value.

### HasPrivacyPolicyLink

`func (o *LeadFormCommon) HasPrivacyPolicyLink() bool`

HasPrivacyPolicyLink returns a boolean if a field has been set.

### SetPrivacyPolicyLinkNil

`func (o *LeadFormCommon) SetPrivacyPolicyLinkNil(b bool)`

 SetPrivacyPolicyLinkNil sets the value for PrivacyPolicyLink to be an explicit nil

### UnsetPrivacyPolicyLink
`func (o *LeadFormCommon) UnsetPrivacyPolicyLink()`

UnsetPrivacyPolicyLink ensures that no value is present for PrivacyPolicyLink, not even an explicit nil
### GetHasAcceptedTerms

`func (o *LeadFormCommon) GetHasAcceptedTerms() bool`

GetHasAcceptedTerms returns the HasAcceptedTerms field if non-nil, zero value otherwise.

### GetHasAcceptedTermsOk

`func (o *LeadFormCommon) GetHasAcceptedTermsOk() (*bool, bool)`

GetHasAcceptedTermsOk returns a tuple with the HasAcceptedTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasAcceptedTerms

`func (o *LeadFormCommon) SetHasAcceptedTerms(v bool)`

SetHasAcceptedTerms sets HasAcceptedTerms field to given value.

### HasHasAcceptedTerms

`func (o *LeadFormCommon) HasHasAcceptedTerms() bool`

HasHasAcceptedTerms returns a boolean if a field has been set.

### GetCompletionMessage

`func (o *LeadFormCommon) GetCompletionMessage() string`

GetCompletionMessage returns the CompletionMessage field if non-nil, zero value otherwise.

### GetCompletionMessageOk

`func (o *LeadFormCommon) GetCompletionMessageOk() (*string, bool)`

GetCompletionMessageOk returns a tuple with the CompletionMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionMessage

`func (o *LeadFormCommon) SetCompletionMessage(v string)`

SetCompletionMessage sets CompletionMessage field to given value.

### HasCompletionMessage

`func (o *LeadFormCommon) HasCompletionMessage() bool`

HasCompletionMessage returns a boolean if a field has been set.

### SetCompletionMessageNil

`func (o *LeadFormCommon) SetCompletionMessageNil(b bool)`

 SetCompletionMessageNil sets the value for CompletionMessage to be an explicit nil

### UnsetCompletionMessage
`func (o *LeadFormCommon) UnsetCompletionMessage()`

UnsetCompletionMessage ensures that no value is present for CompletionMessage, not even an explicit nil
### GetStatus

`func (o *LeadFormCommon) GetStatus() LeadFormStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LeadFormCommon) GetStatusOk() (*LeadFormStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LeadFormCommon) SetStatus(v LeadFormStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LeadFormCommon) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetDisclosureLanguage

`func (o *LeadFormCommon) GetDisclosureLanguage() string`

GetDisclosureLanguage returns the DisclosureLanguage field if non-nil, zero value otherwise.

### GetDisclosureLanguageOk

`func (o *LeadFormCommon) GetDisclosureLanguageOk() (*string, bool)`

GetDisclosureLanguageOk returns a tuple with the DisclosureLanguage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureLanguage

`func (o *LeadFormCommon) SetDisclosureLanguage(v string)`

SetDisclosureLanguage sets DisclosureLanguage field to given value.

### HasDisclosureLanguage

`func (o *LeadFormCommon) HasDisclosureLanguage() bool`

HasDisclosureLanguage returns a boolean if a field has been set.

### SetDisclosureLanguageNil

`func (o *LeadFormCommon) SetDisclosureLanguageNil(b bool)`

 SetDisclosureLanguageNil sets the value for DisclosureLanguage to be an explicit nil

### UnsetDisclosureLanguage
`func (o *LeadFormCommon) UnsetDisclosureLanguage()`

UnsetDisclosureLanguage ensures that no value is present for DisclosureLanguage, not even an explicit nil
### GetQuestions

`func (o *LeadFormCommon) GetQuestions() []LeadFormQuestion`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *LeadFormCommon) GetQuestionsOk() (*[]LeadFormQuestion, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *LeadFormCommon) SetQuestions(v []LeadFormQuestion)`

SetQuestions sets Questions field to given value.

### HasQuestions

`func (o *LeadFormCommon) HasQuestions() bool`

HasQuestions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


