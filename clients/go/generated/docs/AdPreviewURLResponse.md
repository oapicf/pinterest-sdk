# AdPreviewURLResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | Pointer to **string** | &#39;Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19&#39; | [optional] 

## Methods

### NewAdPreviewURLResponse

`func NewAdPreviewURLResponse() *AdPreviewURLResponse`

NewAdPreviewURLResponse instantiates a new AdPreviewURLResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdPreviewURLResponseWithDefaults

`func NewAdPreviewURLResponseWithDefaults() *AdPreviewURLResponse`

NewAdPreviewURLResponseWithDefaults instantiates a new AdPreviewURLResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUrl

`func (o *AdPreviewURLResponse) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *AdPreviewURLResponse) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *AdPreviewURLResponse) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *AdPreviewURLResponse) HasUrl() bool`

HasUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


