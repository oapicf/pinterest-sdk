# ProductGroupPromotionUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group the product group belongs to. | 
**ProductGroupPromotion** | [**[]ProductGroupPromotion**](ProductGroupPromotion.md) |  | 

## Methods

### NewProductGroupPromotionUpdateRequest

`func NewProductGroupPromotionUpdateRequest(adGroupId string, productGroupPromotion []ProductGroupPromotion, ) *ProductGroupPromotionUpdateRequest`

NewProductGroupPromotionUpdateRequest instantiates a new ProductGroupPromotionUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductGroupPromotionUpdateRequestWithDefaults

`func NewProductGroupPromotionUpdateRequestWithDefaults() *ProductGroupPromotionUpdateRequest`

NewProductGroupPromotionUpdateRequestWithDefaults instantiates a new ProductGroupPromotionUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupId

`func (o *ProductGroupPromotionUpdateRequest) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *ProductGroupPromotionUpdateRequest) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *ProductGroupPromotionUpdateRequest) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetProductGroupPromotion

`func (o *ProductGroupPromotionUpdateRequest) GetProductGroupPromotion() []ProductGroupPromotion`

GetProductGroupPromotion returns the ProductGroupPromotion field if non-nil, zero value otherwise.

### GetProductGroupPromotionOk

`func (o *ProductGroupPromotionUpdateRequest) GetProductGroupPromotionOk() (*[]ProductGroupPromotion, bool)`

GetProductGroupPromotionOk returns a tuple with the ProductGroupPromotion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupPromotion

`func (o *ProductGroupPromotionUpdateRequest) SetProductGroupPromotion(v []ProductGroupPromotion)`

SetProductGroupPromotion sets ProductGroupPromotion field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


