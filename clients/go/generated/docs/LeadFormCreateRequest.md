# LeadFormCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionMessage** | Pointer to **NullableString** | A message for people who complete the form to let them know what happens next. | [optional] 
**DisclosureLanguage** | Pointer to **NullableString** | Additional disclosure language to be included in the lead form. | [optional] 
**HasAcceptedTerms** | Pointer to **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | [optional] 
**Name** | Pointer to **NullableString** | Internal name of the lead form. | [optional] 
**PolicyLinks** | Pointer to [**[]LeadFormCommonPolicyLinksInner**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**PrivacyPolicyLink** | Pointer to **NullableString** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**Questions** | Pointer to [**[]LeadFormQuestion**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 
**Status** | Pointer to [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 

## Methods

### NewLeadFormCreateRequest

`func NewLeadFormCreateRequest() *LeadFormCreateRequest`

NewLeadFormCreateRequest instantiates a new LeadFormCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadFormCreateRequestWithDefaults

`func NewLeadFormCreateRequestWithDefaults() *LeadFormCreateRequest`

NewLeadFormCreateRequestWithDefaults instantiates a new LeadFormCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompletionMessage

`func (o *LeadFormCreateRequest) GetCompletionMessage() string`

GetCompletionMessage returns the CompletionMessage field if non-nil, zero value otherwise.

### GetCompletionMessageOk

`func (o *LeadFormCreateRequest) GetCompletionMessageOk() (*string, bool)`

GetCompletionMessageOk returns a tuple with the CompletionMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionMessage

`func (o *LeadFormCreateRequest) SetCompletionMessage(v string)`

SetCompletionMessage sets CompletionMessage field to given value.

### HasCompletionMessage

`func (o *LeadFormCreateRequest) HasCompletionMessage() bool`

HasCompletionMessage returns a boolean if a field has been set.

### SetCompletionMessageNil

`func (o *LeadFormCreateRequest) SetCompletionMessageNil(b bool)`

 SetCompletionMessageNil sets the value for CompletionMessage to be an explicit nil

### UnsetCompletionMessage
`func (o *LeadFormCreateRequest) UnsetCompletionMessage()`

UnsetCompletionMessage ensures that no value is present for CompletionMessage, not even an explicit nil
### GetDisclosureLanguage

`func (o *LeadFormCreateRequest) GetDisclosureLanguage() string`

GetDisclosureLanguage returns the DisclosureLanguage field if non-nil, zero value otherwise.

### GetDisclosureLanguageOk

`func (o *LeadFormCreateRequest) GetDisclosureLanguageOk() (*string, bool)`

GetDisclosureLanguageOk returns a tuple with the DisclosureLanguage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureLanguage

`func (o *LeadFormCreateRequest) SetDisclosureLanguage(v string)`

SetDisclosureLanguage sets DisclosureLanguage field to given value.

### HasDisclosureLanguage

`func (o *LeadFormCreateRequest) HasDisclosureLanguage() bool`

HasDisclosureLanguage returns a boolean if a field has been set.

### SetDisclosureLanguageNil

`func (o *LeadFormCreateRequest) SetDisclosureLanguageNil(b bool)`

 SetDisclosureLanguageNil sets the value for DisclosureLanguage to be an explicit nil

### UnsetDisclosureLanguage
`func (o *LeadFormCreateRequest) UnsetDisclosureLanguage()`

UnsetDisclosureLanguage ensures that no value is present for DisclosureLanguage, not even an explicit nil
### GetHasAcceptedTerms

`func (o *LeadFormCreateRequest) GetHasAcceptedTerms() bool`

GetHasAcceptedTerms returns the HasAcceptedTerms field if non-nil, zero value otherwise.

### GetHasAcceptedTermsOk

`func (o *LeadFormCreateRequest) GetHasAcceptedTermsOk() (*bool, bool)`

GetHasAcceptedTermsOk returns a tuple with the HasAcceptedTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasAcceptedTerms

`func (o *LeadFormCreateRequest) SetHasAcceptedTerms(v bool)`

SetHasAcceptedTerms sets HasAcceptedTerms field to given value.

### HasHasAcceptedTerms

`func (o *LeadFormCreateRequest) HasHasAcceptedTerms() bool`

HasHasAcceptedTerms returns a boolean if a field has been set.

### GetName

`func (o *LeadFormCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LeadFormCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LeadFormCreateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *LeadFormCreateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *LeadFormCreateRequest) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *LeadFormCreateRequest) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPolicyLinks

`func (o *LeadFormCreateRequest) GetPolicyLinks() []LeadFormCommonPolicyLinksInner`

GetPolicyLinks returns the PolicyLinks field if non-nil, zero value otherwise.

### GetPolicyLinksOk

`func (o *LeadFormCreateRequest) GetPolicyLinksOk() (*[]LeadFormCommonPolicyLinksInner, bool)`

GetPolicyLinksOk returns a tuple with the PolicyLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPolicyLinks

`func (o *LeadFormCreateRequest) SetPolicyLinks(v []LeadFormCommonPolicyLinksInner)`

SetPolicyLinks sets PolicyLinks field to given value.

### HasPolicyLinks

`func (o *LeadFormCreateRequest) HasPolicyLinks() bool`

HasPolicyLinks returns a boolean if a field has been set.

### GetPrivacyPolicyLink

`func (o *LeadFormCreateRequest) GetPrivacyPolicyLink() string`

GetPrivacyPolicyLink returns the PrivacyPolicyLink field if non-nil, zero value otherwise.

### GetPrivacyPolicyLinkOk

`func (o *LeadFormCreateRequest) GetPrivacyPolicyLinkOk() (*string, bool)`

GetPrivacyPolicyLinkOk returns a tuple with the PrivacyPolicyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivacyPolicyLink

`func (o *LeadFormCreateRequest) SetPrivacyPolicyLink(v string)`

SetPrivacyPolicyLink sets PrivacyPolicyLink field to given value.

### HasPrivacyPolicyLink

`func (o *LeadFormCreateRequest) HasPrivacyPolicyLink() bool`

HasPrivacyPolicyLink returns a boolean if a field has been set.

### SetPrivacyPolicyLinkNil

`func (o *LeadFormCreateRequest) SetPrivacyPolicyLinkNil(b bool)`

 SetPrivacyPolicyLinkNil sets the value for PrivacyPolicyLink to be an explicit nil

### UnsetPrivacyPolicyLink
`func (o *LeadFormCreateRequest) UnsetPrivacyPolicyLink()`

UnsetPrivacyPolicyLink ensures that no value is present for PrivacyPolicyLink, not even an explicit nil
### GetQuestions

`func (o *LeadFormCreateRequest) GetQuestions() []LeadFormQuestion`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *LeadFormCreateRequest) GetQuestionsOk() (*[]LeadFormQuestion, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *LeadFormCreateRequest) SetQuestions(v []LeadFormQuestion)`

SetQuestions sets Questions field to given value.

### HasQuestions

`func (o *LeadFormCreateRequest) HasQuestions() bool`

HasQuestions returns a boolean if a field has been set.

### GetStatus

`func (o *LeadFormCreateRequest) GetStatus() LeadFormStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LeadFormCreateRequest) GetStatusOk() (*LeadFormStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LeadFormCreateRequest) SetStatus(v LeadFormStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LeadFormCreateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


