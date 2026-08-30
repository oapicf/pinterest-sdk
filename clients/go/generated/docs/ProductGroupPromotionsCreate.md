# ProductGroupPromotionsCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group the product group promotion belongs to. | 
**ProductGroupPromotion** | [**[]ProductGroupPromotion**](ProductGroupPromotion.md) | List of product group promotions to create or update. | 

## Methods

### NewProductGroupPromotionsCreate

`func NewProductGroupPromotionsCreate(adGroupId string, productGroupPromotion []ProductGroupPromotion, ) *ProductGroupPromotionsCreate`

NewProductGroupPromotionsCreate instantiates a new ProductGroupPromotionsCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductGroupPromotionsCreateWithDefaults

`func NewProductGroupPromotionsCreateWithDefaults() *ProductGroupPromotionsCreate`

NewProductGroupPromotionsCreateWithDefaults instantiates a new ProductGroupPromotionsCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupId

`func (o *ProductGroupPromotionsCreate) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *ProductGroupPromotionsCreate) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *ProductGroupPromotionsCreate) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetProductGroupPromotion

`func (o *ProductGroupPromotionsCreate) GetProductGroupPromotion() []ProductGroupPromotion`

GetProductGroupPromotion returns the ProductGroupPromotion field if non-nil, zero value otherwise.

### GetProductGroupPromotionOk

`func (o *ProductGroupPromotionsCreate) GetProductGroupPromotionOk() (*[]ProductGroupPromotion, bool)`

GetProductGroupPromotionOk returns a tuple with the ProductGroupPromotion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupPromotion

`func (o *ProductGroupPromotionsCreate) SetProductGroupPromotion(v []ProductGroupPromotion)`

SetProductGroupPromotion sets ProductGroupPromotion field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


