# LeadFormUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **NullableString** | Internal name of the lead form. | [optional] 
**PrivacyPolicyLink** | Pointer to **NullableString** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**HasAcceptedTerms** | Pointer to **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | [optional] 
**CompletionMessage** | Pointer to **NullableString** | A message for people who complete the form to let them know what happens next. | [optional] 
**Status** | Pointer to [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 
**DisclosureLanguage** | Pointer to **NullableString** | Additional disclosure language to be included in the lead form. | [optional] 
**Questions** | Pointer to [**[]LeadFormQuestion**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 
**PolicyLinks** | Pointer to [**[]LeadFormCommonPolicyLinksInner**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**Id** | **string** | The ID of this lead form to be updated | 

## Methods

### NewLeadFormUpdateRequest

`func NewLeadFormUpdateRequest(id string, ) *LeadFormUpdateRequest`

NewLeadFormUpdateRequest instantiates a new LeadFormUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadFormUpdateRequestWithDefaults

`func NewLeadFormUpdateRequestWithDefaults() *LeadFormUpdateRequest`

NewLeadFormUpdateRequestWithDefaults instantiates a new LeadFormUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *LeadFormUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LeadFormUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LeadFormUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *LeadFormUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *LeadFormUpdateRequest) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *LeadFormUpdateRequest) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPrivacyPolicyLink

`func (o *LeadFormUpdateRequest) GetPrivacyPolicyLink() string`

GetPrivacyPolicyLink returns the PrivacyPolicyLink field if non-nil, zero value otherwise.

### GetPrivacyPolicyLinkOk

`func (o *LeadFormUpdateRequest) GetPrivacyPolicyLinkOk() (*string, bool)`

GetPrivacyPolicyLinkOk returns a tuple with the PrivacyPolicyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivacyPolicyLink

`func (o *LeadFormUpdateRequest) SetPrivacyPolicyLink(v string)`

SetPrivacyPolicyLink sets PrivacyPolicyLink field to given value.

### HasPrivacyPolicyLink

`func (o *LeadFormUpdateRequest) HasPrivacyPolicyLink() bool`

HasPrivacyPolicyLink returns a boolean if a field has been set.

### SetPrivacyPolicyLinkNil

`func (o *LeadFormUpdateRequest) SetPrivacyPolicyLinkNil(b bool)`

 SetPrivacyPolicyLinkNil sets the value for PrivacyPolicyLink to be an explicit nil

### UnsetPrivacyPolicyLink
`func (o *LeadFormUpdateRequest) UnsetPrivacyPolicyLink()`

UnsetPrivacyPolicyLink ensures that no value is present for PrivacyPolicyLink, not even an explicit nil
### GetHasAcceptedTerms

`func (o *LeadFormUpdateRequest) GetHasAcceptedTerms() bool`

GetHasAcceptedTerms returns the HasAcceptedTerms field if non-nil, zero value otherwise.

### GetHasAcceptedTermsOk

`func (o *LeadFormUpdateRequest) GetHasAcceptedTermsOk() (*bool, bool)`

GetHasAcceptedTermsOk returns a tuple with the HasAcceptedTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasAcceptedTerms

`func (o *LeadFormUpdateRequest) SetHasAcceptedTerms(v bool)`

SetHasAcceptedTerms sets HasAcceptedTerms field to given value.

### HasHasAcceptedTerms

`func (o *LeadFormUpdateRequest) HasHasAcceptedTerms() bool`

HasHasAcceptedTerms returns a boolean if a field has been set.

### GetCompletionMessage

`func (o *LeadFormUpdateRequest) GetCompletionMessage() string`

GetCompletionMessage returns the CompletionMessage field if non-nil, zero value otherwise.

### GetCompletionMessageOk

`func (o *LeadFormUpdateRequest) GetCompletionMessageOk() (*string, bool)`

GetCompletionMessageOk returns a tuple with the CompletionMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionMessage

`func (o *LeadFormUpdateRequest) SetCompletionMessage(v string)`

SetCompletionMessage sets CompletionMessage field to given value.

### HasCompletionMessage

`func (o *LeadFormUpdateRequest) HasCompletionMessage() bool`

HasCompletionMessage returns a boolean if a field has been set.

### SetCompletionMessageNil

`func (o *LeadFormUpdateRequest) SetCompletionMessageNil(b bool)`

 SetCompletionMessageNil sets the value for CompletionMessage to be an explicit nil

### UnsetCompletionMessage
`func (o *LeadFormUpdateRequest) UnsetCompletionMessage()`

UnsetCompletionMessage ensures that no value is present for CompletionMessage, not even an explicit nil
### GetStatus

`func (o *LeadFormUpdateRequest) GetStatus() LeadFormStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LeadFormUpdateRequest) GetStatusOk() (*LeadFormStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LeadFormUpdateRequest) SetStatus(v LeadFormStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LeadFormUpdateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetDisclosureLanguage

`func (o *LeadFormUpdateRequest) GetDisclosureLanguage() string`

GetDisclosureLanguage returns the DisclosureLanguage field if non-nil, zero value otherwise.

### GetDisclosureLanguageOk

`func (o *LeadFormUpdateRequest) GetDisclosureLanguageOk() (*string, bool)`

GetDisclosureLanguageOk returns a tuple with the DisclosureLanguage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureLanguage

`func (o *LeadFormUpdateRequest) SetDisclosureLanguage(v string)`

SetDisclosureLanguage sets DisclosureLanguage field to given value.

### HasDisclosureLanguage

`func (o *LeadFormUpdateRequest) HasDisclosureLanguage() bool`

HasDisclosureLanguage returns a boolean if a field has been set.

### SetDisclosureLanguageNil

`func (o *LeadFormUpdateRequest) SetDisclosureLanguageNil(b bool)`

 SetDisclosureLanguageNil sets the value for DisclosureLanguage to be an explicit nil

### UnsetDisclosureLanguage
`func (o *LeadFormUpdateRequest) UnsetDisclosureLanguage()`

UnsetDisclosureLanguage ensures that no value is present for DisclosureLanguage, not even an explicit nil
### GetQuestions

`func (o *LeadFormUpdateRequest) GetQuestions() []LeadFormQuestion`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *LeadFormUpdateRequest) GetQuestionsOk() (*[]LeadFormQuestion, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *LeadFormUpdateRequest) SetQuestions(v []LeadFormQuestion)`

SetQuestions sets Questions field to given value.

### HasQuestions

`func (o *LeadFormUpdateRequest) HasQuestions() bool`

HasQuestions returns a boolean if a field has been set.

### GetPolicyLinks

`func (o *LeadFormUpdateRequest) GetPolicyLinks() []LeadFormCommonPolicyLinksInner`

GetPolicyLinks returns the PolicyLinks field if non-nil, zero value otherwise.

### GetPolicyLinksOk

`func (o *LeadFormUpdateRequest) GetPolicyLinksOk() (*[]LeadFormCommonPolicyLinksInner, bool)`

GetPolicyLinksOk returns a tuple with the PolicyLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPolicyLinks

`func (o *LeadFormUpdateRequest) SetPolicyLinks(v []LeadFormCommonPolicyLinksInner)`

SetPolicyLinks sets PolicyLinks field to given value.

### HasPolicyLinks

`func (o *LeadFormUpdateRequest) HasPolicyLinks() bool`

HasPolicyLinks returns a boolean if a field has been set.

### GetId

`func (o *LeadFormUpdateRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LeadFormUpdateRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LeadFormUpdateRequest) SetId(v string)`

SetId sets Id field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


