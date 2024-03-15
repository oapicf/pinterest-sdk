# Account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountType** | Pointer to **string** | Type of account | [optional] 
**Id** | Pointer to **string** | User account ID. | [optional] 
**ProfileImage** | Pointer to **string** |  | [optional] 
**WebsiteUrl** | Pointer to **string** |  | [optional] 
**Username** | Pointer to **string** |  | [optional] 
**About** | Pointer to **string** | Profile about description. | [optional] 
**BusinessName** | Pointer to **NullableString** |  | [optional] 
**BoardCount** | Pointer to **NullableInt32** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional] [readonly] 
**PinCount** | Pointer to **NullableInt32** | User account pin count. This includes both created and saved pins. | [optional] [readonly] 
**FollowerCount** | Pointer to **NullableInt32** | User account follower count. | [optional] [readonly] 
**FollowingCount** | Pointer to **NullableInt32** | User account following count. | [optional] [readonly] 
**MonthlyViews** | Pointer to **NullableInt32** | User account monthly views. | [optional] [readonly] 

## Methods

### NewAccount

`func NewAccount() *Account`

NewAccount instantiates a new Account object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAccountWithDefaults

`func NewAccountWithDefaults() *Account`

NewAccountWithDefaults instantiates a new Account object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccountType

`func (o *Account) GetAccountType() string`

GetAccountType returns the AccountType field if non-nil, zero value otherwise.

### GetAccountTypeOk

`func (o *Account) GetAccountTypeOk() (*string, bool)`

GetAccountTypeOk returns a tuple with the AccountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountType

`func (o *Account) SetAccountType(v string)`

SetAccountType sets AccountType field to given value.

### HasAccountType

`func (o *Account) HasAccountType() bool`

HasAccountType returns a boolean if a field has been set.

### GetId

`func (o *Account) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Account) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Account) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Account) HasId() bool`

HasId returns a boolean if a field has been set.

### GetProfileImage

`func (o *Account) GetProfileImage() string`

GetProfileImage returns the ProfileImage field if non-nil, zero value otherwise.

### GetProfileImageOk

`func (o *Account) GetProfileImageOk() (*string, bool)`

GetProfileImageOk returns a tuple with the ProfileImage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileImage

`func (o *Account) SetProfileImage(v string)`

SetProfileImage sets ProfileImage field to given value.

### HasProfileImage

`func (o *Account) HasProfileImage() bool`

HasProfileImage returns a boolean if a field has been set.

### GetWebsiteUrl

`func (o *Account) GetWebsiteUrl() string`

GetWebsiteUrl returns the WebsiteUrl field if non-nil, zero value otherwise.

### GetWebsiteUrlOk

`func (o *Account) GetWebsiteUrlOk() (*string, bool)`

GetWebsiteUrlOk returns a tuple with the WebsiteUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsiteUrl

`func (o *Account) SetWebsiteUrl(v string)`

SetWebsiteUrl sets WebsiteUrl field to given value.

### HasWebsiteUrl

`func (o *Account) HasWebsiteUrl() bool`

HasWebsiteUrl returns a boolean if a field has been set.

### GetUsername

`func (o *Account) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *Account) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *Account) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *Account) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### GetAbout

`func (o *Account) GetAbout() string`

GetAbout returns the About field if non-nil, zero value otherwise.

### GetAboutOk

`func (o *Account) GetAboutOk() (*string, bool)`

GetAboutOk returns a tuple with the About field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbout

`func (o *Account) SetAbout(v string)`

SetAbout sets About field to given value.

### HasAbout

`func (o *Account) HasAbout() bool`

HasAbout returns a boolean if a field has been set.

### GetBusinessName

`func (o *Account) GetBusinessName() string`

GetBusinessName returns the BusinessName field if non-nil, zero value otherwise.

### GetBusinessNameOk

`func (o *Account) GetBusinessNameOk() (*string, bool)`

GetBusinessNameOk returns a tuple with the BusinessName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessName

`func (o *Account) SetBusinessName(v string)`

SetBusinessName sets BusinessName field to given value.

### HasBusinessName

`func (o *Account) HasBusinessName() bool`

HasBusinessName returns a boolean if a field has been set.

### SetBusinessNameNil

`func (o *Account) SetBusinessNameNil(b bool)`

 SetBusinessNameNil sets the value for BusinessName to be an explicit nil

### UnsetBusinessName
`func (o *Account) UnsetBusinessName()`

UnsetBusinessName ensures that no value is present for BusinessName, not even an explicit nil
### GetBoardCount

`func (o *Account) GetBoardCount() int32`

GetBoardCount returns the BoardCount field if non-nil, zero value otherwise.

### GetBoardCountOk

`func (o *Account) GetBoardCountOk() (*int32, bool)`

GetBoardCountOk returns a tuple with the BoardCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardCount

`func (o *Account) SetBoardCount(v int32)`

SetBoardCount sets BoardCount field to given value.

### HasBoardCount

`func (o *Account) HasBoardCount() bool`

HasBoardCount returns a boolean if a field has been set.

### SetBoardCountNil

`func (o *Account) SetBoardCountNil(b bool)`

 SetBoardCountNil sets the value for BoardCount to be an explicit nil

### UnsetBoardCount
`func (o *Account) UnsetBoardCount()`

UnsetBoardCount ensures that no value is present for BoardCount, not even an explicit nil
### GetPinCount

`func (o *Account) GetPinCount() int32`

GetPinCount returns the PinCount field if non-nil, zero value otherwise.

### GetPinCountOk

`func (o *Account) GetPinCountOk() (*int32, bool)`

GetPinCountOk returns a tuple with the PinCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinCount

`func (o *Account) SetPinCount(v int32)`

SetPinCount sets PinCount field to given value.

### HasPinCount

`func (o *Account) HasPinCount() bool`

HasPinCount returns a boolean if a field has been set.

### SetPinCountNil

`func (o *Account) SetPinCountNil(b bool)`

 SetPinCountNil sets the value for PinCount to be an explicit nil

### UnsetPinCount
`func (o *Account) UnsetPinCount()`

UnsetPinCount ensures that no value is present for PinCount, not even an explicit nil
### GetFollowerCount

`func (o *Account) GetFollowerCount() int32`

GetFollowerCount returns the FollowerCount field if non-nil, zero value otherwise.

### GetFollowerCountOk

`func (o *Account) GetFollowerCountOk() (*int32, bool)`

GetFollowerCountOk returns a tuple with the FollowerCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFollowerCount

`func (o *Account) SetFollowerCount(v int32)`

SetFollowerCount sets FollowerCount field to given value.

### HasFollowerCount

`func (o *Account) HasFollowerCount() bool`

HasFollowerCount returns a boolean if a field has been set.

### SetFollowerCountNil

`func (o *Account) SetFollowerCountNil(b bool)`

 SetFollowerCountNil sets the value for FollowerCount to be an explicit nil

### UnsetFollowerCount
`func (o *Account) UnsetFollowerCount()`

UnsetFollowerCount ensures that no value is present for FollowerCount, not even an explicit nil
### GetFollowingCount

`func (o *Account) GetFollowingCount() int32`

GetFollowingCount returns the FollowingCount field if non-nil, zero value otherwise.

### GetFollowingCountOk

`func (o *Account) GetFollowingCountOk() (*int32, bool)`

GetFollowingCountOk returns a tuple with the FollowingCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFollowingCount

`func (o *Account) SetFollowingCount(v int32)`

SetFollowingCount sets FollowingCount field to given value.

### HasFollowingCount

`func (o *Account) HasFollowingCount() bool`

HasFollowingCount returns a boolean if a field has been set.

### SetFollowingCountNil

`func (o *Account) SetFollowingCountNil(b bool)`

 SetFollowingCountNil sets the value for FollowingCount to be an explicit nil

### UnsetFollowingCount
`func (o *Account) UnsetFollowingCount()`

UnsetFollowingCount ensures that no value is present for FollowingCount, not even an explicit nil
### GetMonthlyViews

`func (o *Account) GetMonthlyViews() int32`

GetMonthlyViews returns the MonthlyViews field if non-nil, zero value otherwise.

### GetMonthlyViewsOk

`func (o *Account) GetMonthlyViewsOk() (*int32, bool)`

GetMonthlyViewsOk returns a tuple with the MonthlyViews field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonthlyViews

`func (o *Account) SetMonthlyViews(v int32)`

SetMonthlyViews sets MonthlyViews field to given value.

### HasMonthlyViews

`func (o *Account) HasMonthlyViews() bool`

HasMonthlyViews returns a boolean if a field has been set.

### SetMonthlyViewsNil

`func (o *Account) SetMonthlyViewsNil(b bool)`

 SetMonthlyViewsNil sets the value for MonthlyViews to be an explicit nil

### UnsetMonthlyViews
`func (o *Account) UnsetMonthlyViews()`

UnsetMonthlyViews ensures that no value is present for MonthlyViews, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


