# ProductGroupPromotionCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the Ad Group the Product Group Promotion belongs to. | 
**ProductGroupPromotion** | [**[]ProductGroupPromotion**](ProductGroupPromotion.md) |  | 

## Methods

### NewProductGroupPromotionCreateRequest

`func NewProductGroupPromotionCreateRequest(adGroupId string, productGroupPromotion []ProductGroupPromotion, ) *ProductGroupPromotionCreateRequest`

NewProductGroupPromotionCreateRequest instantiates a new ProductGroupPromotionCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductGroupPromotionCreateRequestWithDefaults

`func NewProductGroupPromotionCreateRequestWithDefaults() *ProductGroupPromotionCreateRequest`

NewProductGroupPromotionCreateRequestWithDefaults instantiates a new ProductGroupPromotionCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupId

`func (o *ProductGroupPromotionCreateRequest) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *ProductGroupPromotionCreateRequest) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *ProductGroupPromotionCreateRequest) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetProductGroupPromotion

`func (o *ProductGroupPromotionCreateRequest) GetProductGroupPromotion() []ProductGroupPromotion`

GetProductGroupPromotion returns the ProductGroupPromotion field if non-nil, zero value otherwise.

### GetProductGroupPromotionOk

`func (o *ProductGroupPromotionCreateRequest) GetProductGroupPromotionOk() (*[]ProductGroupPromotion, bool)`

GetProductGroupPromotionOk returns a tuple with the ProductGroupPromotion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupPromotion

`func (o *ProductGroupPromotionCreateRequest) SetProductGroupPromotion(v []ProductGroupPromotion)`

SetProductGroupPromotion sets ProductGroupPromotion field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


