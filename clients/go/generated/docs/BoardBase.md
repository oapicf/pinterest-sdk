# BoardBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BoardPinsModifiedAt** | Pointer to **time.Time** | Date and time of last board pins modified. | [optional] [readonly] 
**CollaboratorCount** | Pointer to **int32** | Count of collaborators on the board. | [optional] [readonly] 
**CreatedAt** | Pointer to **time.Time** | Date and time of board creation. | [optional] [readonly] 
**Description** | Pointer to **NullableString** |  | [optional] 
**FollowerCount** | Pointer to **int32** | Board follower count. | [optional] [readonly] 
**Id** | **string** |  | [readonly] 
**IsAdsOnly** | Pointer to **bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**Media** | Pointer to [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] 
**Name** | **string** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**Owner** | Pointer to [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**PinCount** | Pointer to **int32** | Count of Pins on the board. | [optional] [readonly] 

## Methods

### NewBoardBase

`func NewBoardBase(id string, name string, ) *BoardBase`

NewBoardBase instantiates a new BoardBase object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBoardBaseWithDefaults

`func NewBoardBaseWithDefaults() *BoardBase`

NewBoardBaseWithDefaults instantiates a new BoardBase object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBoardPinsModifiedAt

`func (o *BoardBase) GetBoardPinsModifiedAt() time.Time`

GetBoardPinsModifiedAt returns the BoardPinsModifiedAt field if non-nil, zero value otherwise.

### GetBoardPinsModifiedAtOk

`func (o *BoardBase) GetBoardPinsModifiedAtOk() (*time.Time, bool)`

GetBoardPinsModifiedAtOk returns a tuple with the BoardPinsModifiedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardPinsModifiedAt

`func (o *BoardBase) SetBoardPinsModifiedAt(v time.Time)`

SetBoardPinsModifiedAt sets BoardPinsModifiedAt field to given value.

### HasBoardPinsModifiedAt

`func (o *BoardBase) HasBoardPinsModifiedAt() bool`

HasBoardPinsModifiedAt returns a boolean if a field has been set.

### GetCollaboratorCount

`func (o *BoardBase) GetCollaboratorCount() int32`

GetCollaboratorCount returns the CollaboratorCount field if non-nil, zero value otherwise.

### GetCollaboratorCountOk

`func (o *BoardBase) GetCollaboratorCountOk() (*int32, bool)`

GetCollaboratorCountOk returns a tuple with the CollaboratorCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollaboratorCount

`func (o *BoardBase) SetCollaboratorCount(v int32)`

SetCollaboratorCount sets CollaboratorCount field to given value.

### HasCollaboratorCount

`func (o *BoardBase) HasCollaboratorCount() bool`

HasCollaboratorCount returns a boolean if a field has been set.

### GetCreatedAt

`func (o *BoardBase) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *BoardBase) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *BoardBase) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *BoardBase) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetDescription

`func (o *BoardBase) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *BoardBase) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *BoardBase) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *BoardBase) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *BoardBase) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *BoardBase) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFollowerCount

`func (o *BoardBase) GetFollowerCount() int32`

GetFollowerCount returns the FollowerCount field if non-nil, zero value otherwise.

### GetFollowerCountOk

`func (o *BoardBase) GetFollowerCountOk() (*int32, bool)`

GetFollowerCountOk returns a tuple with the FollowerCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFollowerCount

`func (o *BoardBase) SetFollowerCount(v int32)`

SetFollowerCount sets FollowerCount field to given value.

### HasFollowerCount

`func (o *BoardBase) HasFollowerCount() bool`

HasFollowerCount returns a boolean if a field has been set.

### GetId

`func (o *BoardBase) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BoardBase) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BoardBase) SetId(v string)`

SetId sets Id field to given value.


### GetIsAdsOnly

`func (o *BoardBase) GetIsAdsOnly() bool`

GetIsAdsOnly returns the IsAdsOnly field if non-nil, zero value otherwise.

### GetIsAdsOnlyOk

`func (o *BoardBase) GetIsAdsOnlyOk() (*bool, bool)`

GetIsAdsOnlyOk returns a tuple with the IsAdsOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAdsOnly

`func (o *BoardBase) SetIsAdsOnly(v bool)`

SetIsAdsOnly sets IsAdsOnly field to given value.

### HasIsAdsOnly

`func (o *BoardBase) HasIsAdsOnly() bool`

HasIsAdsOnly returns a boolean if a field has been set.

### GetMedia

`func (o *BoardBase) GetMedia() BoardMedia`

GetMedia returns the Media field if non-nil, zero value otherwise.

### GetMediaOk

`func (o *BoardBase) GetMediaOk() (*BoardMedia, bool)`

GetMediaOk returns a tuple with the Media field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedia

`func (o *BoardBase) SetMedia(v BoardMedia)`

SetMedia sets Media field to given value.

### HasMedia

`func (o *BoardBase) HasMedia() bool`

HasMedia returns a boolean if a field has been set.

### GetName

`func (o *BoardBase) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BoardBase) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BoardBase) SetName(v string)`

SetName sets Name field to given value.


### GetOwner

`func (o *BoardBase) GetOwner() BoardOwner`

GetOwner returns the Owner field if non-nil, zero value otherwise.

### GetOwnerOk

`func (o *BoardBase) GetOwnerOk() (*BoardOwner, bool)`

GetOwnerOk returns a tuple with the Owner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwner

`func (o *BoardBase) SetOwner(v BoardOwner)`

SetOwner sets Owner field to given value.

### HasOwner

`func (o *BoardBase) HasOwner() bool`

HasOwner returns a boolean if a field has been set.

### GetPinCount

`func (o *BoardBase) GetPinCount() int32`

GetPinCount returns the PinCount field if non-nil, zero value otherwise.

### GetPinCountOk

`func (o *BoardBase) GetPinCountOk() (*int32, bool)`

GetPinCountOk returns a tuple with the PinCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinCount

`func (o *BoardBase) SetPinCount(v int32)`

SetPinCount sets PinCount field to given value.

### HasPinCount

`func (o *BoardBase) HasPinCount() bool`

HasPinCount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


