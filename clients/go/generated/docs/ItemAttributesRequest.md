# ItemAttributesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdLink** | Pointer to **NullableString** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. | [optional] 
**Adult** | Pointer to **NullableBool** | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. | [optional] 
**AgeGroup** | Pointer to **NullableString** | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. | [optional] 
**Availability** | Pointer to **string** | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’. | [optional] 
**AverageReviewRating** | Pointer to **NullableFloat32** | Average reviews for the item. Can be a number from 1-5. | [optional] 
**Brand** | Pointer to **NullableString** | The brand of the product. | [optional] 
**CheckoutEnabled** | Pointer to **NullableBool** | This attribute is not supported anymore. | [optional] 
**Color** | Pointer to **NullableString** | The primary color of the product. | [optional] 
**Condition** | Pointer to **NullableString** | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. | [optional] 
**CustomLabel0** | Pointer to **NullableString** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**CustomLabel1** | Pointer to **NullableString** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**CustomLabel2** | Pointer to **NullableString** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**CustomLabel3** | Pointer to **NullableString** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**CustomLabel4** | Pointer to **NullableString** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**Description** | Pointer to **string** | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; | [optional] 
**FreeShippingLabel** | Pointer to **NullableBool** | The item is free to ship. | [optional] 
**FreeShippingLimit** | Pointer to **NullableString** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. | [optional] 
**Gender** | Pointer to **NullableString** | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’. | [optional] 
**GoogleProductCategory** | Pointer to **NullableString** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**Gtin** | Pointer to **NullableInt32** | The unique universal product identifier. | [optional] 
**Id** | Pointer to **string** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; | [optional] 
**ItemGroupId** | Pointer to **NullableString** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; | [optional] 
**LastUpdatedTime** | Pointer to **NullableInt64** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 
**Link** | Pointer to **string** | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; | [optional] 
**Material** | Pointer to **NullableString** | The material used to make the product. | [optional] 
**MinAdPrice** | Pointer to **NullableString** | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**MobileLink** | Pointer to **NullableString** | The mobile-optimized version of your landing page. Must begin with http:// or https://. | [optional] 
**Mpn** | Pointer to **NullableString** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. | [optional] 
**NumberOfRatings** | Pointer to **NullableInt32** | The number of ratings for the item. | [optional] 
**NumberOfReviews** | Pointer to **NullableInt32** | The number of reviews available for the item. | [optional] 
**Pattern** | Pointer to **NullableString** | The description of the pattern used for the product. | [optional] 
**Price** | Pointer to **string** | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**ProductType** | Pointer to **NullableString** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; | [optional] 
**SalePrice** | Pointer to **NullableString** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**Shipping** | Pointer to **NullableString** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. | [optional] 
**ShippingHeight** | Pointer to **NullableString** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**ShippingWeight** | Pointer to **NullableString** | The weight of the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**ShippingWidth** | Pointer to **NullableString** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**Size** | Pointer to **NullableString** | The size of the product. | [optional] 
**SizeSystem** | Pointer to **NullableString** | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’. | [optional] 
**SizeType** | Pointer to **NullableString** | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’. | [optional] 
**Tax** | Pointer to **NullableString** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. | [optional] 
**Title** | Pointer to **string** | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; | [optional] 
**VariantNames** | Pointer to **[]string** | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. | [optional] 
**VariantValues** | Pointer to **[]string** | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. | [optional] 
**AdditionalImageLink** | Pointer to **[]string** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt; | [optional] 
**ImageLink** | Pointer to [**ItemAttributesRequestAllOfImageLink**](ItemAttributesRequestAllOfImageLink.md) |  | [optional] 
**VideoLink** | Pointer to **NullableString** | &lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt; | [optional] 

## Methods

### NewItemAttributesRequest

`func NewItemAttributesRequest() *ItemAttributesRequest`

NewItemAttributesRequest instantiates a new ItemAttributesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemAttributesRequestWithDefaults

`func NewItemAttributesRequestWithDefaults() *ItemAttributesRequest`

NewItemAttributesRequestWithDefaults instantiates a new ItemAttributesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdLink

`func (o *ItemAttributesRequest) GetAdLink() string`

GetAdLink returns the AdLink field if non-nil, zero value otherwise.

### GetAdLinkOk

`func (o *ItemAttributesRequest) GetAdLinkOk() (*string, bool)`

GetAdLinkOk returns a tuple with the AdLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdLink

`func (o *ItemAttributesRequest) SetAdLink(v string)`

SetAdLink sets AdLink field to given value.

### HasAdLink

`func (o *ItemAttributesRequest) HasAdLink() bool`

HasAdLink returns a boolean if a field has been set.

### SetAdLinkNil

`func (o *ItemAttributesRequest) SetAdLinkNil(b bool)`

 SetAdLinkNil sets the value for AdLink to be an explicit nil

### UnsetAdLink
`func (o *ItemAttributesRequest) UnsetAdLink()`

UnsetAdLink ensures that no value is present for AdLink, not even an explicit nil
### GetAdult

`func (o *ItemAttributesRequest) GetAdult() bool`

GetAdult returns the Adult field if non-nil, zero value otherwise.

### GetAdultOk

`func (o *ItemAttributesRequest) GetAdultOk() (*bool, bool)`

GetAdultOk returns a tuple with the Adult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdult

`func (o *ItemAttributesRequest) SetAdult(v bool)`

SetAdult sets Adult field to given value.

### HasAdult

`func (o *ItemAttributesRequest) HasAdult() bool`

HasAdult returns a boolean if a field has been set.

### SetAdultNil

`func (o *ItemAttributesRequest) SetAdultNil(b bool)`

 SetAdultNil sets the value for Adult to be an explicit nil

### UnsetAdult
`func (o *ItemAttributesRequest) UnsetAdult()`

UnsetAdult ensures that no value is present for Adult, not even an explicit nil
### GetAgeGroup

`func (o *ItemAttributesRequest) GetAgeGroup() string`

GetAgeGroup returns the AgeGroup field if non-nil, zero value otherwise.

### GetAgeGroupOk

`func (o *ItemAttributesRequest) GetAgeGroupOk() (*string, bool)`

GetAgeGroupOk returns a tuple with the AgeGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgeGroup

`func (o *ItemAttributesRequest) SetAgeGroup(v string)`

SetAgeGroup sets AgeGroup field to given value.

### HasAgeGroup

`func (o *ItemAttributesRequest) HasAgeGroup() bool`

HasAgeGroup returns a boolean if a field has been set.

### SetAgeGroupNil

`func (o *ItemAttributesRequest) SetAgeGroupNil(b bool)`

 SetAgeGroupNil sets the value for AgeGroup to be an explicit nil

### UnsetAgeGroup
`func (o *ItemAttributesRequest) UnsetAgeGroup()`

UnsetAgeGroup ensures that no value is present for AgeGroup, not even an explicit nil
### GetAvailability

`func (o *ItemAttributesRequest) GetAvailability() string`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *ItemAttributesRequest) GetAvailabilityOk() (*string, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *ItemAttributesRequest) SetAvailability(v string)`

SetAvailability sets Availability field to given value.

### HasAvailability

`func (o *ItemAttributesRequest) HasAvailability() bool`

HasAvailability returns a boolean if a field has been set.

### GetAverageReviewRating

`func (o *ItemAttributesRequest) GetAverageReviewRating() float32`

GetAverageReviewRating returns the AverageReviewRating field if non-nil, zero value otherwise.

### GetAverageReviewRatingOk

`func (o *ItemAttributesRequest) GetAverageReviewRatingOk() (*float32, bool)`

GetAverageReviewRatingOk returns a tuple with the AverageReviewRating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAverageReviewRating

`func (o *ItemAttributesRequest) SetAverageReviewRating(v float32)`

SetAverageReviewRating sets AverageReviewRating field to given value.

### HasAverageReviewRating

`func (o *ItemAttributesRequest) HasAverageReviewRating() bool`

HasAverageReviewRating returns a boolean if a field has been set.

### SetAverageReviewRatingNil

`func (o *ItemAttributesRequest) SetAverageReviewRatingNil(b bool)`

 SetAverageReviewRatingNil sets the value for AverageReviewRating to be an explicit nil

### UnsetAverageReviewRating
`func (o *ItemAttributesRequest) UnsetAverageReviewRating()`

UnsetAverageReviewRating ensures that no value is present for AverageReviewRating, not even an explicit nil
### GetBrand

`func (o *ItemAttributesRequest) GetBrand() string`

GetBrand returns the Brand field if non-nil, zero value otherwise.

### GetBrandOk

`func (o *ItemAttributesRequest) GetBrandOk() (*string, bool)`

GetBrandOk returns a tuple with the Brand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrand

`func (o *ItemAttributesRequest) SetBrand(v string)`

SetBrand sets Brand field to given value.

### HasBrand

`func (o *ItemAttributesRequest) HasBrand() bool`

HasBrand returns a boolean if a field has been set.

### SetBrandNil

`func (o *ItemAttributesRequest) SetBrandNil(b bool)`

 SetBrandNil sets the value for Brand to be an explicit nil

### UnsetBrand
`func (o *ItemAttributesRequest) UnsetBrand()`

UnsetBrand ensures that no value is present for Brand, not even an explicit nil
### GetCheckoutEnabled

`func (o *ItemAttributesRequest) GetCheckoutEnabled() bool`

GetCheckoutEnabled returns the CheckoutEnabled field if non-nil, zero value otherwise.

### GetCheckoutEnabledOk

`func (o *ItemAttributesRequest) GetCheckoutEnabledOk() (*bool, bool)`

GetCheckoutEnabledOk returns a tuple with the CheckoutEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckoutEnabled

`func (o *ItemAttributesRequest) SetCheckoutEnabled(v bool)`

SetCheckoutEnabled sets CheckoutEnabled field to given value.

### HasCheckoutEnabled

`func (o *ItemAttributesRequest) HasCheckoutEnabled() bool`

HasCheckoutEnabled returns a boolean if a field has been set.

### SetCheckoutEnabledNil

`func (o *ItemAttributesRequest) SetCheckoutEnabledNil(b bool)`

 SetCheckoutEnabledNil sets the value for CheckoutEnabled to be an explicit nil

### UnsetCheckoutEnabled
`func (o *ItemAttributesRequest) UnsetCheckoutEnabled()`

UnsetCheckoutEnabled ensures that no value is present for CheckoutEnabled, not even an explicit nil
### GetColor

`func (o *ItemAttributesRequest) GetColor() string`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *ItemAttributesRequest) GetColorOk() (*string, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *ItemAttributesRequest) SetColor(v string)`

SetColor sets Color field to given value.

### HasColor

`func (o *ItemAttributesRequest) HasColor() bool`

HasColor returns a boolean if a field has been set.

### SetColorNil

`func (o *ItemAttributesRequest) SetColorNil(b bool)`

 SetColorNil sets the value for Color to be an explicit nil

### UnsetColor
`func (o *ItemAttributesRequest) UnsetColor()`

UnsetColor ensures that no value is present for Color, not even an explicit nil
### GetCondition

`func (o *ItemAttributesRequest) GetCondition() string`

GetCondition returns the Condition field if non-nil, zero value otherwise.

### GetConditionOk

`func (o *ItemAttributesRequest) GetConditionOk() (*string, bool)`

GetConditionOk returns a tuple with the Condition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCondition

`func (o *ItemAttributesRequest) SetCondition(v string)`

SetCondition sets Condition field to given value.

### HasCondition

`func (o *ItemAttributesRequest) HasCondition() bool`

HasCondition returns a boolean if a field has been set.

### SetConditionNil

`func (o *ItemAttributesRequest) SetConditionNil(b bool)`

 SetConditionNil sets the value for Condition to be an explicit nil

### UnsetCondition
`func (o *ItemAttributesRequest) UnsetCondition()`

UnsetCondition ensures that no value is present for Condition, not even an explicit nil
### GetCustomLabel0

`func (o *ItemAttributesRequest) GetCustomLabel0() string`

GetCustomLabel0 returns the CustomLabel0 field if non-nil, zero value otherwise.

### GetCustomLabel0Ok

`func (o *ItemAttributesRequest) GetCustomLabel0Ok() (*string, bool)`

GetCustomLabel0Ok returns a tuple with the CustomLabel0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel0

`func (o *ItemAttributesRequest) SetCustomLabel0(v string)`

SetCustomLabel0 sets CustomLabel0 field to given value.

### HasCustomLabel0

`func (o *ItemAttributesRequest) HasCustomLabel0() bool`

HasCustomLabel0 returns a boolean if a field has been set.

### SetCustomLabel0Nil

`func (o *ItemAttributesRequest) SetCustomLabel0Nil(b bool)`

 SetCustomLabel0Nil sets the value for CustomLabel0 to be an explicit nil

### UnsetCustomLabel0
`func (o *ItemAttributesRequest) UnsetCustomLabel0()`

UnsetCustomLabel0 ensures that no value is present for CustomLabel0, not even an explicit nil
### GetCustomLabel1

`func (o *ItemAttributesRequest) GetCustomLabel1() string`

GetCustomLabel1 returns the CustomLabel1 field if non-nil, zero value otherwise.

### GetCustomLabel1Ok

`func (o *ItemAttributesRequest) GetCustomLabel1Ok() (*string, bool)`

GetCustomLabel1Ok returns a tuple with the CustomLabel1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel1

`func (o *ItemAttributesRequest) SetCustomLabel1(v string)`

SetCustomLabel1 sets CustomLabel1 field to given value.

### HasCustomLabel1

`func (o *ItemAttributesRequest) HasCustomLabel1() bool`

HasCustomLabel1 returns a boolean if a field has been set.

### SetCustomLabel1Nil

`func (o *ItemAttributesRequest) SetCustomLabel1Nil(b bool)`

 SetCustomLabel1Nil sets the value for CustomLabel1 to be an explicit nil

### UnsetCustomLabel1
`func (o *ItemAttributesRequest) UnsetCustomLabel1()`

UnsetCustomLabel1 ensures that no value is present for CustomLabel1, not even an explicit nil
### GetCustomLabel2

`func (o *ItemAttributesRequest) GetCustomLabel2() string`

GetCustomLabel2 returns the CustomLabel2 field if non-nil, zero value otherwise.

### GetCustomLabel2Ok

`func (o *ItemAttributesRequest) GetCustomLabel2Ok() (*string, bool)`

GetCustomLabel2Ok returns a tuple with the CustomLabel2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel2

`func (o *ItemAttributesRequest) SetCustomLabel2(v string)`

SetCustomLabel2 sets CustomLabel2 field to given value.

### HasCustomLabel2

`func (o *ItemAttributesRequest) HasCustomLabel2() bool`

HasCustomLabel2 returns a boolean if a field has been set.

### SetCustomLabel2Nil

`func (o *ItemAttributesRequest) SetCustomLabel2Nil(b bool)`

 SetCustomLabel2Nil sets the value for CustomLabel2 to be an explicit nil

### UnsetCustomLabel2
`func (o *ItemAttributesRequest) UnsetCustomLabel2()`

UnsetCustomLabel2 ensures that no value is present for CustomLabel2, not even an explicit nil
### GetCustomLabel3

`func (o *ItemAttributesRequest) GetCustomLabel3() string`

GetCustomLabel3 returns the CustomLabel3 field if non-nil, zero value otherwise.

### GetCustomLabel3Ok

`func (o *ItemAttributesRequest) GetCustomLabel3Ok() (*string, bool)`

GetCustomLabel3Ok returns a tuple with the CustomLabel3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel3

`func (o *ItemAttributesRequest) SetCustomLabel3(v string)`

SetCustomLabel3 sets CustomLabel3 field to given value.

### HasCustomLabel3

`func (o *ItemAttributesRequest) HasCustomLabel3() bool`

HasCustomLabel3 returns a boolean if a field has been set.

### SetCustomLabel3Nil

`func (o *ItemAttributesRequest) SetCustomLabel3Nil(b bool)`

 SetCustomLabel3Nil sets the value for CustomLabel3 to be an explicit nil

### UnsetCustomLabel3
`func (o *ItemAttributesRequest) UnsetCustomLabel3()`

UnsetCustomLabel3 ensures that no value is present for CustomLabel3, not even an explicit nil
### GetCustomLabel4

`func (o *ItemAttributesRequest) GetCustomLabel4() string`

GetCustomLabel4 returns the CustomLabel4 field if non-nil, zero value otherwise.

### GetCustomLabel4Ok

`func (o *ItemAttributesRequest) GetCustomLabel4Ok() (*string, bool)`

GetCustomLabel4Ok returns a tuple with the CustomLabel4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel4

`func (o *ItemAttributesRequest) SetCustomLabel4(v string)`

SetCustomLabel4 sets CustomLabel4 field to given value.

### HasCustomLabel4

`func (o *ItemAttributesRequest) HasCustomLabel4() bool`

HasCustomLabel4 returns a boolean if a field has been set.

### SetCustomLabel4Nil

`func (o *ItemAttributesRequest) SetCustomLabel4Nil(b bool)`

 SetCustomLabel4Nil sets the value for CustomLabel4 to be an explicit nil

### UnsetCustomLabel4
`func (o *ItemAttributesRequest) UnsetCustomLabel4()`

UnsetCustomLabel4 ensures that no value is present for CustomLabel4, not even an explicit nil
### GetDescription

`func (o *ItemAttributesRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ItemAttributesRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ItemAttributesRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ItemAttributesRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetFreeShippingLabel

`func (o *ItemAttributesRequest) GetFreeShippingLabel() bool`

GetFreeShippingLabel returns the FreeShippingLabel field if non-nil, zero value otherwise.

### GetFreeShippingLabelOk

`func (o *ItemAttributesRequest) GetFreeShippingLabelOk() (*bool, bool)`

GetFreeShippingLabelOk returns a tuple with the FreeShippingLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreeShippingLabel

`func (o *ItemAttributesRequest) SetFreeShippingLabel(v bool)`

SetFreeShippingLabel sets FreeShippingLabel field to given value.

### HasFreeShippingLabel

`func (o *ItemAttributesRequest) HasFreeShippingLabel() bool`

HasFreeShippingLabel returns a boolean if a field has been set.

### SetFreeShippingLabelNil

`func (o *ItemAttributesRequest) SetFreeShippingLabelNil(b bool)`

 SetFreeShippingLabelNil sets the value for FreeShippingLabel to be an explicit nil

### UnsetFreeShippingLabel
`func (o *ItemAttributesRequest) UnsetFreeShippingLabel()`

UnsetFreeShippingLabel ensures that no value is present for FreeShippingLabel, not even an explicit nil
### GetFreeShippingLimit

`func (o *ItemAttributesRequest) GetFreeShippingLimit() string`

GetFreeShippingLimit returns the FreeShippingLimit field if non-nil, zero value otherwise.

### GetFreeShippingLimitOk

`func (o *ItemAttributesRequest) GetFreeShippingLimitOk() (*string, bool)`

GetFreeShippingLimitOk returns a tuple with the FreeShippingLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreeShippingLimit

`func (o *ItemAttributesRequest) SetFreeShippingLimit(v string)`

SetFreeShippingLimit sets FreeShippingLimit field to given value.

### HasFreeShippingLimit

`func (o *ItemAttributesRequest) HasFreeShippingLimit() bool`

HasFreeShippingLimit returns a boolean if a field has been set.

### SetFreeShippingLimitNil

`func (o *ItemAttributesRequest) SetFreeShippingLimitNil(b bool)`

 SetFreeShippingLimitNil sets the value for FreeShippingLimit to be an explicit nil

### UnsetFreeShippingLimit
`func (o *ItemAttributesRequest) UnsetFreeShippingLimit()`

UnsetFreeShippingLimit ensures that no value is present for FreeShippingLimit, not even an explicit nil
### GetGender

`func (o *ItemAttributesRequest) GetGender() string`

GetGender returns the Gender field if non-nil, zero value otherwise.

### GetGenderOk

`func (o *ItemAttributesRequest) GetGenderOk() (*string, bool)`

GetGenderOk returns a tuple with the Gender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGender

`func (o *ItemAttributesRequest) SetGender(v string)`

SetGender sets Gender field to given value.

### HasGender

`func (o *ItemAttributesRequest) HasGender() bool`

HasGender returns a boolean if a field has been set.

### SetGenderNil

`func (o *ItemAttributesRequest) SetGenderNil(b bool)`

 SetGenderNil sets the value for Gender to be an explicit nil

### UnsetGender
`func (o *ItemAttributesRequest) UnsetGender()`

UnsetGender ensures that no value is present for Gender, not even an explicit nil
### GetGoogleProductCategory

`func (o *ItemAttributesRequest) GetGoogleProductCategory() string`

GetGoogleProductCategory returns the GoogleProductCategory field if non-nil, zero value otherwise.

### GetGoogleProductCategoryOk

`func (o *ItemAttributesRequest) GetGoogleProductCategoryOk() (*string, bool)`

GetGoogleProductCategoryOk returns a tuple with the GoogleProductCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoogleProductCategory

`func (o *ItemAttributesRequest) SetGoogleProductCategory(v string)`

SetGoogleProductCategory sets GoogleProductCategory field to given value.

### HasGoogleProductCategory

`func (o *ItemAttributesRequest) HasGoogleProductCategory() bool`

HasGoogleProductCategory returns a boolean if a field has been set.

### SetGoogleProductCategoryNil

`func (o *ItemAttributesRequest) SetGoogleProductCategoryNil(b bool)`

 SetGoogleProductCategoryNil sets the value for GoogleProductCategory to be an explicit nil

### UnsetGoogleProductCategory
`func (o *ItemAttributesRequest) UnsetGoogleProductCategory()`

UnsetGoogleProductCategory ensures that no value is present for GoogleProductCategory, not even an explicit nil
### GetGtin

`func (o *ItemAttributesRequest) GetGtin() int32`

GetGtin returns the Gtin field if non-nil, zero value otherwise.

### GetGtinOk

`func (o *ItemAttributesRequest) GetGtinOk() (*int32, bool)`

GetGtinOk returns a tuple with the Gtin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGtin

`func (o *ItemAttributesRequest) SetGtin(v int32)`

SetGtin sets Gtin field to given value.

### HasGtin

`func (o *ItemAttributesRequest) HasGtin() bool`

HasGtin returns a boolean if a field has been set.

### SetGtinNil

`func (o *ItemAttributesRequest) SetGtinNil(b bool)`

 SetGtinNil sets the value for Gtin to be an explicit nil

### UnsetGtin
`func (o *ItemAttributesRequest) UnsetGtin()`

UnsetGtin ensures that no value is present for Gtin, not even an explicit nil
### GetId

`func (o *ItemAttributesRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemAttributesRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemAttributesRequest) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ItemAttributesRequest) HasId() bool`

HasId returns a boolean if a field has been set.

### GetItemGroupId

`func (o *ItemAttributesRequest) GetItemGroupId() string`

GetItemGroupId returns the ItemGroupId field if non-nil, zero value otherwise.

### GetItemGroupIdOk

`func (o *ItemAttributesRequest) GetItemGroupIdOk() (*string, bool)`

GetItemGroupIdOk returns a tuple with the ItemGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemGroupId

`func (o *ItemAttributesRequest) SetItemGroupId(v string)`

SetItemGroupId sets ItemGroupId field to given value.

### HasItemGroupId

`func (o *ItemAttributesRequest) HasItemGroupId() bool`

HasItemGroupId returns a boolean if a field has been set.

### SetItemGroupIdNil

`func (o *ItemAttributesRequest) SetItemGroupIdNil(b bool)`

 SetItemGroupIdNil sets the value for ItemGroupId to be an explicit nil

### UnsetItemGroupId
`func (o *ItemAttributesRequest) UnsetItemGroupId()`

UnsetItemGroupId ensures that no value is present for ItemGroupId, not even an explicit nil
### GetLastUpdatedTime

`func (o *ItemAttributesRequest) GetLastUpdatedTime() int64`

GetLastUpdatedTime returns the LastUpdatedTime field if non-nil, zero value otherwise.

### GetLastUpdatedTimeOk

`func (o *ItemAttributesRequest) GetLastUpdatedTimeOk() (*int64, bool)`

GetLastUpdatedTimeOk returns a tuple with the LastUpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdatedTime

`func (o *ItemAttributesRequest) SetLastUpdatedTime(v int64)`

SetLastUpdatedTime sets LastUpdatedTime field to given value.

### HasLastUpdatedTime

`func (o *ItemAttributesRequest) HasLastUpdatedTime() bool`

HasLastUpdatedTime returns a boolean if a field has been set.

### SetLastUpdatedTimeNil

`func (o *ItemAttributesRequest) SetLastUpdatedTimeNil(b bool)`

 SetLastUpdatedTimeNil sets the value for LastUpdatedTime to be an explicit nil

### UnsetLastUpdatedTime
`func (o *ItemAttributesRequest) UnsetLastUpdatedTime()`

UnsetLastUpdatedTime ensures that no value is present for LastUpdatedTime, not even an explicit nil
### GetLink

`func (o *ItemAttributesRequest) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *ItemAttributesRequest) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *ItemAttributesRequest) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *ItemAttributesRequest) HasLink() bool`

HasLink returns a boolean if a field has been set.

### GetMaterial

`func (o *ItemAttributesRequest) GetMaterial() string`

GetMaterial returns the Material field if non-nil, zero value otherwise.

### GetMaterialOk

`func (o *ItemAttributesRequest) GetMaterialOk() (*string, bool)`

GetMaterialOk returns a tuple with the Material field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaterial

`func (o *ItemAttributesRequest) SetMaterial(v string)`

SetMaterial sets Material field to given value.

### HasMaterial

`func (o *ItemAttributesRequest) HasMaterial() bool`

HasMaterial returns a boolean if a field has been set.

### SetMaterialNil

`func (o *ItemAttributesRequest) SetMaterialNil(b bool)`

 SetMaterialNil sets the value for Material to be an explicit nil

### UnsetMaterial
`func (o *ItemAttributesRequest) UnsetMaterial()`

UnsetMaterial ensures that no value is present for Material, not even an explicit nil
### GetMinAdPrice

`func (o *ItemAttributesRequest) GetMinAdPrice() string`

GetMinAdPrice returns the MinAdPrice field if non-nil, zero value otherwise.

### GetMinAdPriceOk

`func (o *ItemAttributesRequest) GetMinAdPriceOk() (*string, bool)`

GetMinAdPriceOk returns a tuple with the MinAdPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinAdPrice

`func (o *ItemAttributesRequest) SetMinAdPrice(v string)`

SetMinAdPrice sets MinAdPrice field to given value.

### HasMinAdPrice

`func (o *ItemAttributesRequest) HasMinAdPrice() bool`

HasMinAdPrice returns a boolean if a field has been set.

### SetMinAdPriceNil

`func (o *ItemAttributesRequest) SetMinAdPriceNil(b bool)`

 SetMinAdPriceNil sets the value for MinAdPrice to be an explicit nil

### UnsetMinAdPrice
`func (o *ItemAttributesRequest) UnsetMinAdPrice()`

UnsetMinAdPrice ensures that no value is present for MinAdPrice, not even an explicit nil
### GetMobileLink

`func (o *ItemAttributesRequest) GetMobileLink() string`

GetMobileLink returns the MobileLink field if non-nil, zero value otherwise.

### GetMobileLinkOk

`func (o *ItemAttributesRequest) GetMobileLinkOk() (*string, bool)`

GetMobileLinkOk returns a tuple with the MobileLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMobileLink

`func (o *ItemAttributesRequest) SetMobileLink(v string)`

SetMobileLink sets MobileLink field to given value.

### HasMobileLink

`func (o *ItemAttributesRequest) HasMobileLink() bool`

HasMobileLink returns a boolean if a field has been set.

### SetMobileLinkNil

`func (o *ItemAttributesRequest) SetMobileLinkNil(b bool)`

 SetMobileLinkNil sets the value for MobileLink to be an explicit nil

### UnsetMobileLink
`func (o *ItemAttributesRequest) UnsetMobileLink()`

UnsetMobileLink ensures that no value is present for MobileLink, not even an explicit nil
### GetMpn

`func (o *ItemAttributesRequest) GetMpn() string`

GetMpn returns the Mpn field if non-nil, zero value otherwise.

### GetMpnOk

`func (o *ItemAttributesRequest) GetMpnOk() (*string, bool)`

GetMpnOk returns a tuple with the Mpn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMpn

`func (o *ItemAttributesRequest) SetMpn(v string)`

SetMpn sets Mpn field to given value.

### HasMpn

`func (o *ItemAttributesRequest) HasMpn() bool`

HasMpn returns a boolean if a field has been set.

### SetMpnNil

`func (o *ItemAttributesRequest) SetMpnNil(b bool)`

 SetMpnNil sets the value for Mpn to be an explicit nil

### UnsetMpn
`func (o *ItemAttributesRequest) UnsetMpn()`

UnsetMpn ensures that no value is present for Mpn, not even an explicit nil
### GetNumberOfRatings

`func (o *ItemAttributesRequest) GetNumberOfRatings() int32`

GetNumberOfRatings returns the NumberOfRatings field if non-nil, zero value otherwise.

### GetNumberOfRatingsOk

`func (o *ItemAttributesRequest) GetNumberOfRatingsOk() (*int32, bool)`

GetNumberOfRatingsOk returns a tuple with the NumberOfRatings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfRatings

`func (o *ItemAttributesRequest) SetNumberOfRatings(v int32)`

SetNumberOfRatings sets NumberOfRatings field to given value.

### HasNumberOfRatings

`func (o *ItemAttributesRequest) HasNumberOfRatings() bool`

HasNumberOfRatings returns a boolean if a field has been set.

### SetNumberOfRatingsNil

`func (o *ItemAttributesRequest) SetNumberOfRatingsNil(b bool)`

 SetNumberOfRatingsNil sets the value for NumberOfRatings to be an explicit nil

### UnsetNumberOfRatings
`func (o *ItemAttributesRequest) UnsetNumberOfRatings()`

UnsetNumberOfRatings ensures that no value is present for NumberOfRatings, not even an explicit nil
### GetNumberOfReviews

`func (o *ItemAttributesRequest) GetNumberOfReviews() int32`

GetNumberOfReviews returns the NumberOfReviews field if non-nil, zero value otherwise.

### GetNumberOfReviewsOk

`func (o *ItemAttributesRequest) GetNumberOfReviewsOk() (*int32, bool)`

GetNumberOfReviewsOk returns a tuple with the NumberOfReviews field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfReviews

`func (o *ItemAttributesRequest) SetNumberOfReviews(v int32)`

SetNumberOfReviews sets NumberOfReviews field to given value.

### HasNumberOfReviews

`func (o *ItemAttributesRequest) HasNumberOfReviews() bool`

HasNumberOfReviews returns a boolean if a field has been set.

### SetNumberOfReviewsNil

`func (o *ItemAttributesRequest) SetNumberOfReviewsNil(b bool)`

 SetNumberOfReviewsNil sets the value for NumberOfReviews to be an explicit nil

### UnsetNumberOfReviews
`func (o *ItemAttributesRequest) UnsetNumberOfReviews()`

UnsetNumberOfReviews ensures that no value is present for NumberOfReviews, not even an explicit nil
### GetPattern

`func (o *ItemAttributesRequest) GetPattern() string`

GetPattern returns the Pattern field if non-nil, zero value otherwise.

### GetPatternOk

`func (o *ItemAttributesRequest) GetPatternOk() (*string, bool)`

GetPatternOk returns a tuple with the Pattern field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPattern

`func (o *ItemAttributesRequest) SetPattern(v string)`

SetPattern sets Pattern field to given value.

### HasPattern

`func (o *ItemAttributesRequest) HasPattern() bool`

HasPattern returns a boolean if a field has been set.

### SetPatternNil

`func (o *ItemAttributesRequest) SetPatternNil(b bool)`

 SetPatternNil sets the value for Pattern to be an explicit nil

### UnsetPattern
`func (o *ItemAttributesRequest) UnsetPattern()`

UnsetPattern ensures that no value is present for Pattern, not even an explicit nil
### GetPrice

`func (o *ItemAttributesRequest) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *ItemAttributesRequest) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *ItemAttributesRequest) SetPrice(v string)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *ItemAttributesRequest) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetProductType

`func (o *ItemAttributesRequest) GetProductType() string`

GetProductType returns the ProductType field if non-nil, zero value otherwise.

### GetProductTypeOk

`func (o *ItemAttributesRequest) GetProductTypeOk() (*string, bool)`

GetProductTypeOk returns a tuple with the ProductType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductType

`func (o *ItemAttributesRequest) SetProductType(v string)`

SetProductType sets ProductType field to given value.

### HasProductType

`func (o *ItemAttributesRequest) HasProductType() bool`

HasProductType returns a boolean if a field has been set.

### SetProductTypeNil

`func (o *ItemAttributesRequest) SetProductTypeNil(b bool)`

 SetProductTypeNil sets the value for ProductType to be an explicit nil

### UnsetProductType
`func (o *ItemAttributesRequest) UnsetProductType()`

UnsetProductType ensures that no value is present for ProductType, not even an explicit nil
### GetSalePrice

`func (o *ItemAttributesRequest) GetSalePrice() string`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *ItemAttributesRequest) GetSalePriceOk() (*string, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *ItemAttributesRequest) SetSalePrice(v string)`

SetSalePrice sets SalePrice field to given value.

### HasSalePrice

`func (o *ItemAttributesRequest) HasSalePrice() bool`

HasSalePrice returns a boolean if a field has been set.

### SetSalePriceNil

`func (o *ItemAttributesRequest) SetSalePriceNil(b bool)`

 SetSalePriceNil sets the value for SalePrice to be an explicit nil

### UnsetSalePrice
`func (o *ItemAttributesRequest) UnsetSalePrice()`

UnsetSalePrice ensures that no value is present for SalePrice, not even an explicit nil
### GetShipping

`func (o *ItemAttributesRequest) GetShipping() string`

GetShipping returns the Shipping field if non-nil, zero value otherwise.

### GetShippingOk

`func (o *ItemAttributesRequest) GetShippingOk() (*string, bool)`

GetShippingOk returns a tuple with the Shipping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipping

`func (o *ItemAttributesRequest) SetShipping(v string)`

SetShipping sets Shipping field to given value.

### HasShipping

`func (o *ItemAttributesRequest) HasShipping() bool`

HasShipping returns a boolean if a field has been set.

### SetShippingNil

`func (o *ItemAttributesRequest) SetShippingNil(b bool)`

 SetShippingNil sets the value for Shipping to be an explicit nil

### UnsetShipping
`func (o *ItemAttributesRequest) UnsetShipping()`

UnsetShipping ensures that no value is present for Shipping, not even an explicit nil
### GetShippingHeight

`func (o *ItemAttributesRequest) GetShippingHeight() string`

GetShippingHeight returns the ShippingHeight field if non-nil, zero value otherwise.

### GetShippingHeightOk

`func (o *ItemAttributesRequest) GetShippingHeightOk() (*string, bool)`

GetShippingHeightOk returns a tuple with the ShippingHeight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingHeight

`func (o *ItemAttributesRequest) SetShippingHeight(v string)`

SetShippingHeight sets ShippingHeight field to given value.

### HasShippingHeight

`func (o *ItemAttributesRequest) HasShippingHeight() bool`

HasShippingHeight returns a boolean if a field has been set.

### SetShippingHeightNil

`func (o *ItemAttributesRequest) SetShippingHeightNil(b bool)`

 SetShippingHeightNil sets the value for ShippingHeight to be an explicit nil

### UnsetShippingHeight
`func (o *ItemAttributesRequest) UnsetShippingHeight()`

UnsetShippingHeight ensures that no value is present for ShippingHeight, not even an explicit nil
### GetShippingWeight

`func (o *ItemAttributesRequest) GetShippingWeight() string`

GetShippingWeight returns the ShippingWeight field if non-nil, zero value otherwise.

### GetShippingWeightOk

`func (o *ItemAttributesRequest) GetShippingWeightOk() (*string, bool)`

GetShippingWeightOk returns a tuple with the ShippingWeight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingWeight

`func (o *ItemAttributesRequest) SetShippingWeight(v string)`

SetShippingWeight sets ShippingWeight field to given value.

### HasShippingWeight

`func (o *ItemAttributesRequest) HasShippingWeight() bool`

HasShippingWeight returns a boolean if a field has been set.

### SetShippingWeightNil

`func (o *ItemAttributesRequest) SetShippingWeightNil(b bool)`

 SetShippingWeightNil sets the value for ShippingWeight to be an explicit nil

### UnsetShippingWeight
`func (o *ItemAttributesRequest) UnsetShippingWeight()`

UnsetShippingWeight ensures that no value is present for ShippingWeight, not even an explicit nil
### GetShippingWidth

`func (o *ItemAttributesRequest) GetShippingWidth() string`

GetShippingWidth returns the ShippingWidth field if non-nil, zero value otherwise.

### GetShippingWidthOk

`func (o *ItemAttributesRequest) GetShippingWidthOk() (*string, bool)`

GetShippingWidthOk returns a tuple with the ShippingWidth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingWidth

`func (o *ItemAttributesRequest) SetShippingWidth(v string)`

SetShippingWidth sets ShippingWidth field to given value.

### HasShippingWidth

`func (o *ItemAttributesRequest) HasShippingWidth() bool`

HasShippingWidth returns a boolean if a field has been set.

### SetShippingWidthNil

`func (o *ItemAttributesRequest) SetShippingWidthNil(b bool)`

 SetShippingWidthNil sets the value for ShippingWidth to be an explicit nil

### UnsetShippingWidth
`func (o *ItemAttributesRequest) UnsetShippingWidth()`

UnsetShippingWidth ensures that no value is present for ShippingWidth, not even an explicit nil
### GetSize

`func (o *ItemAttributesRequest) GetSize() string`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *ItemAttributesRequest) GetSizeOk() (*string, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *ItemAttributesRequest) SetSize(v string)`

SetSize sets Size field to given value.

### HasSize

`func (o *ItemAttributesRequest) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *ItemAttributesRequest) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *ItemAttributesRequest) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil
### GetSizeSystem

`func (o *ItemAttributesRequest) GetSizeSystem() string`

GetSizeSystem returns the SizeSystem field if non-nil, zero value otherwise.

### GetSizeSystemOk

`func (o *ItemAttributesRequest) GetSizeSystemOk() (*string, bool)`

GetSizeSystemOk returns a tuple with the SizeSystem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizeSystem

`func (o *ItemAttributesRequest) SetSizeSystem(v string)`

SetSizeSystem sets SizeSystem field to given value.

### HasSizeSystem

`func (o *ItemAttributesRequest) HasSizeSystem() bool`

HasSizeSystem returns a boolean if a field has been set.

### SetSizeSystemNil

`func (o *ItemAttributesRequest) SetSizeSystemNil(b bool)`

 SetSizeSystemNil sets the value for SizeSystem to be an explicit nil

### UnsetSizeSystem
`func (o *ItemAttributesRequest) UnsetSizeSystem()`

UnsetSizeSystem ensures that no value is present for SizeSystem, not even an explicit nil
### GetSizeType

`func (o *ItemAttributesRequest) GetSizeType() string`

GetSizeType returns the SizeType field if non-nil, zero value otherwise.

### GetSizeTypeOk

`func (o *ItemAttributesRequest) GetSizeTypeOk() (*string, bool)`

GetSizeTypeOk returns a tuple with the SizeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizeType

`func (o *ItemAttributesRequest) SetSizeType(v string)`

SetSizeType sets SizeType field to given value.

### HasSizeType

`func (o *ItemAttributesRequest) HasSizeType() bool`

HasSizeType returns a boolean if a field has been set.

### SetSizeTypeNil

`func (o *ItemAttributesRequest) SetSizeTypeNil(b bool)`

 SetSizeTypeNil sets the value for SizeType to be an explicit nil

### UnsetSizeType
`func (o *ItemAttributesRequest) UnsetSizeType()`

UnsetSizeType ensures that no value is present for SizeType, not even an explicit nil
### GetTax

`func (o *ItemAttributesRequest) GetTax() string`

GetTax returns the Tax field if non-nil, zero value otherwise.

### GetTaxOk

`func (o *ItemAttributesRequest) GetTaxOk() (*string, bool)`

GetTaxOk returns a tuple with the Tax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTax

`func (o *ItemAttributesRequest) SetTax(v string)`

SetTax sets Tax field to given value.

### HasTax

`func (o *ItemAttributesRequest) HasTax() bool`

HasTax returns a boolean if a field has been set.

### SetTaxNil

`func (o *ItemAttributesRequest) SetTaxNil(b bool)`

 SetTaxNil sets the value for Tax to be an explicit nil

### UnsetTax
`func (o *ItemAttributesRequest) UnsetTax()`

UnsetTax ensures that no value is present for Tax, not even an explicit nil
### GetTitle

`func (o *ItemAttributesRequest) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ItemAttributesRequest) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ItemAttributesRequest) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ItemAttributesRequest) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetVariantNames

`func (o *ItemAttributesRequest) GetVariantNames() []string`

GetVariantNames returns the VariantNames field if non-nil, zero value otherwise.

### GetVariantNamesOk

`func (o *ItemAttributesRequest) GetVariantNamesOk() (*[]string, bool)`

GetVariantNamesOk returns a tuple with the VariantNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVariantNames

`func (o *ItemAttributesRequest) SetVariantNames(v []string)`

SetVariantNames sets VariantNames field to given value.

### HasVariantNames

`func (o *ItemAttributesRequest) HasVariantNames() bool`

HasVariantNames returns a boolean if a field has been set.

### SetVariantNamesNil

`func (o *ItemAttributesRequest) SetVariantNamesNil(b bool)`

 SetVariantNamesNil sets the value for VariantNames to be an explicit nil

### UnsetVariantNames
`func (o *ItemAttributesRequest) UnsetVariantNames()`

UnsetVariantNames ensures that no value is present for VariantNames, not even an explicit nil
### GetVariantValues

`func (o *ItemAttributesRequest) GetVariantValues() []string`

GetVariantValues returns the VariantValues field if non-nil, zero value otherwise.

### GetVariantValuesOk

`func (o *ItemAttributesRequest) GetVariantValuesOk() (*[]string, bool)`

GetVariantValuesOk returns a tuple with the VariantValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVariantValues

`func (o *ItemAttributesRequest) SetVariantValues(v []string)`

SetVariantValues sets VariantValues field to given value.

### HasVariantValues

`func (o *ItemAttributesRequest) HasVariantValues() bool`

HasVariantValues returns a boolean if a field has been set.

### SetVariantValuesNil

`func (o *ItemAttributesRequest) SetVariantValuesNil(b bool)`

 SetVariantValuesNil sets the value for VariantValues to be an explicit nil

### UnsetVariantValues
`func (o *ItemAttributesRequest) UnsetVariantValues()`

UnsetVariantValues ensures that no value is present for VariantValues, not even an explicit nil
### GetAdditionalImageLink

`func (o *ItemAttributesRequest) GetAdditionalImageLink() []string`

GetAdditionalImageLink returns the AdditionalImageLink field if non-nil, zero value otherwise.

### GetAdditionalImageLinkOk

`func (o *ItemAttributesRequest) GetAdditionalImageLinkOk() (*[]string, bool)`

GetAdditionalImageLinkOk returns a tuple with the AdditionalImageLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalImageLink

`func (o *ItemAttributesRequest) SetAdditionalImageLink(v []string)`

SetAdditionalImageLink sets AdditionalImageLink field to given value.

### HasAdditionalImageLink

`func (o *ItemAttributesRequest) HasAdditionalImageLink() bool`

HasAdditionalImageLink returns a boolean if a field has been set.

### SetAdditionalImageLinkNil

`func (o *ItemAttributesRequest) SetAdditionalImageLinkNil(b bool)`

 SetAdditionalImageLinkNil sets the value for AdditionalImageLink to be an explicit nil

### UnsetAdditionalImageLink
`func (o *ItemAttributesRequest) UnsetAdditionalImageLink()`

UnsetAdditionalImageLink ensures that no value is present for AdditionalImageLink, not even an explicit nil
### GetImageLink

`func (o *ItemAttributesRequest) GetImageLink() ItemAttributesRequestAllOfImageLink`

GetImageLink returns the ImageLink field if non-nil, zero value otherwise.

### GetImageLinkOk

`func (o *ItemAttributesRequest) GetImageLinkOk() (*ItemAttributesRequestAllOfImageLink, bool)`

GetImageLinkOk returns a tuple with the ImageLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageLink

`func (o *ItemAttributesRequest) SetImageLink(v ItemAttributesRequestAllOfImageLink)`

SetImageLink sets ImageLink field to given value.

### HasImageLink

`func (o *ItemAttributesRequest) HasImageLink() bool`

HasImageLink returns a boolean if a field has been set.

### GetVideoLink

`func (o *ItemAttributesRequest) GetVideoLink() string`

GetVideoLink returns the VideoLink field if non-nil, zero value otherwise.

### GetVideoLinkOk

`func (o *ItemAttributesRequest) GetVideoLinkOk() (*string, bool)`

GetVideoLinkOk returns a tuple with the VideoLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoLink

`func (o *ItemAttributesRequest) SetVideoLink(v string)`

SetVideoLink sets VideoLink field to given value.

### HasVideoLink

`func (o *ItemAttributesRequest) HasVideoLink() bool`

HasVideoLink returns a boolean if a field has been set.

### SetVideoLinkNil

`func (o *ItemAttributesRequest) SetVideoLinkNil(b bool)`

 SetVideoLinkNil sets the value for VideoLink to be an explicit nil

### UnsetVideoLink
`func (o *ItemAttributesRequest) UnsetVideoLink()`

UnsetVideoLink ensures that no value is present for VideoLink, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


