# Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] [readonly] 
**Name** | **string** |  | 
**Description** | Pointer to **NullableString** |  | [optional] 
**Owner** | Pointer to [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**Privacy** | Pointer to **string** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to "PUBLIC"]

## Methods

### NewBoard

`func NewBoard(name string, ) *Board`

NewBoard instantiates a new Board object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBoardWithDefaults

`func NewBoardWithDefaults() *Board`

NewBoardWithDefaults instantiates a new Board object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Board) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Board) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Board) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Board) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Board) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Board) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Board) SetName(v string)`

SetName sets Name field to given value.


### GetDescription

`func (o *Board) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Board) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Board) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *Board) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *Board) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *Board) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetOwner

`func (o *Board) GetOwner() BoardOwner`

GetOwner returns the Owner field if non-nil, zero value otherwise.

### GetOwnerOk

`func (o *Board) GetOwnerOk() (*BoardOwner, bool)`

GetOwnerOk returns a tuple with the Owner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwner

`func (o *Board) SetOwner(v BoardOwner)`

SetOwner sets Owner field to given value.

### HasOwner

`func (o *Board) HasOwner() bool`

HasOwner returns a boolean if a field has been set.

### GetPrivacy

`func (o *Board) GetPrivacy() string`

GetPrivacy returns the Privacy field if non-nil, zero value otherwise.

### GetPrivacyOk

`func (o *Board) GetPrivacyOk() (*string, bool)`

GetPrivacyOk returns a tuple with the Privacy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivacy

`func (o *Board) SetPrivacy(v string)`

SetPrivacy sets Privacy field to given value.

### HasPrivacy

`func (o *Board) HasPrivacy() bool`

HasPrivacy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


