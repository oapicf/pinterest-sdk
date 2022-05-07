# ItemAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdLink** | Pointer to **string** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. | [optional] 
**AdditionalImageLink** | Pointer to **[]string** | The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https:// | [optional] 
**Adult** | Pointer to **bool** | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. | [optional] 
**AgeGroup** | Pointer to **string** | The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’. | [optional] 
**Availability** | Pointer to **string** | The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’. | [optional] 
**AverageReviewRating** | Pointer to **float32** | Average reviews for the item. Can be a number from 1-5. | [optional] 
**Brand** | Pointer to **string** | The brand of the product. | [optional] 
**Color** | Pointer to **string** | The primary color of the product. | [optional] 
**Condition** | Pointer to **string** | The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’. | [optional] 
**CustomLabel0** | Pointer to **string** | Custom grouping of products. | [optional] 
**CustomLabel1** | Pointer to **string** | Custom grouping of products. | [optional] 
**CustomLabel2** | Pointer to **string** | Custom grouping of products. | [optional] 
**CustomLabel3** | Pointer to **string** | Custom grouping of products. | [optional] 
**CustomLabel4** | Pointer to **string** | Custom grouping of products. | [optional] 
**Description** | Pointer to **string** | The description of the product. | [optional] 
**FreeShippingLabel** | Pointer to **bool** | The item is free to ship. | [optional] 
**FreeShippingLimit** | Pointer to **string** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. | [optional] 
**Gender** | Pointer to **string** | The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’. | [optional] 
**GoogleProductCategory** | Pointer to **string** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**Gtin** | Pointer to **int32** | The unique universal product identifier. | [optional] 
**Id** | Pointer to **string** | The user-created unique ID that represents the product. Only Unicode characters are accepted. | [optional] 
**ImageLink** | Pointer to **[]string** | The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https:// | [optional] 
**ItemGroupId** | Pointer to **string** | The parent ID of the product. | [optional] 
**LastUpdatedTime** | Pointer to **int64** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 
**Link** | Pointer to **string** | The landing page for the product. | [optional] 
**Material** | Pointer to **string** | The material used to make the product. | [optional] 
**MinAdPrice** | Pointer to **string** | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**MobileLink** | Pointer to **string** | The mobile-optimized version of your landing page. Must begin with http:// or https://. | [optional] 
**Mpn** | Pointer to **string** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. | [optional] 
**NumberOfRatings** | Pointer to **int32** | The number of ratings for the item. | [optional] 
**NumberOfReviews** | Pointer to **int32** | The number of reviews available for the item. | [optional] 
**Pattern** | Pointer to **string** | The description of the pattern used for the product. | [optional] 
**Price** | Pointer to **string** | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**ProductType** | Pointer to **string** | The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe. | [optional] 
**SalePrice** | Pointer to **string** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**Shipping** | Pointer to **string** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. | [optional] 
**ShippingHeight** | Pointer to **string** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**ShippingWeight** | Pointer to **string** | The weight of the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**ShippingWidth** | Pointer to **string** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**Size** | Pointer to **string** | The size of the product. | [optional] 
**SizeSystem** | Pointer to **string** | Indicates the country’s sizing system in which you are submitting your product. | [optional] 
**SizeType** | Pointer to **string** | Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’. | [optional] 
**Tax** | Pointer to **string** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. | [optional] 
**Title** | Pointer to **string** | The name of the product. | [optional] 

## Methods

### NewItemAttributes

`func NewItemAttributes() *ItemAttributes`

NewItemAttributes instantiates a new ItemAttributes object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemAttributesWithDefaults

`func NewItemAttributesWithDefaults() *ItemAttributes`

NewItemAttributesWithDefaults instantiates a new ItemAttributes object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdLink

`func (o *ItemAttributes) GetAdLink() string`

GetAdLink returns the AdLink field if non-nil, zero value otherwise.

### GetAdLinkOk

`func (o *ItemAttributes) GetAdLinkOk() (*string, bool)`

GetAdLinkOk returns a tuple with the AdLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdLink

`func (o *ItemAttributes) SetAdLink(v string)`

SetAdLink sets AdLink field to given value.

### HasAdLink

`func (o *ItemAttributes) HasAdLink() bool`

HasAdLink returns a boolean if a field has been set.

### GetAdditionalImageLink

`func (o *ItemAttributes) GetAdditionalImageLink() []string`

GetAdditionalImageLink returns the AdditionalImageLink field if non-nil, zero value otherwise.

### GetAdditionalImageLinkOk

`func (o *ItemAttributes) GetAdditionalImageLinkOk() (*[]string, bool)`

GetAdditionalImageLinkOk returns a tuple with the AdditionalImageLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalImageLink

`func (o *ItemAttributes) SetAdditionalImageLink(v []string)`

SetAdditionalImageLink sets AdditionalImageLink field to given value.

### HasAdditionalImageLink

`func (o *ItemAttributes) HasAdditionalImageLink() bool`

HasAdditionalImageLink returns a boolean if a field has been set.

### GetAdult

`func (o *ItemAttributes) GetAdult() bool`

GetAdult returns the Adult field if non-nil, zero value otherwise.

### GetAdultOk

`func (o *ItemAttributes) GetAdultOk() (*bool, bool)`

GetAdultOk returns a tuple with the Adult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdult

`func (o *ItemAttributes) SetAdult(v bool)`

SetAdult sets Adult field to given value.

### HasAdult

`func (o *ItemAttributes) HasAdult() bool`

HasAdult returns a boolean if a field has been set.

### GetAgeGroup

`func (o *ItemAttributes) GetAgeGroup() string`

GetAgeGroup returns the AgeGroup field if non-nil, zero value otherwise.

### GetAgeGroupOk

`func (o *ItemAttributes) GetAgeGroupOk() (*string, bool)`

GetAgeGroupOk returns a tuple with the AgeGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgeGroup

`func (o *ItemAttributes) SetAgeGroup(v string)`

SetAgeGroup sets AgeGroup field to given value.

### HasAgeGroup

`func (o *ItemAttributes) HasAgeGroup() bool`

HasAgeGroup returns a boolean if a field has been set.

### GetAvailability

`func (o *ItemAttributes) GetAvailability() string`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *ItemAttributes) GetAvailabilityOk() (*string, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *ItemAttributes) SetAvailability(v string)`

SetAvailability sets Availability field to given value.

### HasAvailability

`func (o *ItemAttributes) HasAvailability() bool`

HasAvailability returns a boolean if a field has been set.

### GetAverageReviewRating

`func (o *ItemAttributes) GetAverageReviewRating() float32`

GetAverageReviewRating returns the AverageReviewRating field if non-nil, zero value otherwise.

### GetAverageReviewRatingOk

`func (o *ItemAttributes) GetAverageReviewRatingOk() (*float32, bool)`

GetAverageReviewRatingOk returns a tuple with the AverageReviewRating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAverageReviewRating

`func (o *ItemAttributes) SetAverageReviewRating(v float32)`

SetAverageReviewRating sets AverageReviewRating field to given value.

### HasAverageReviewRating

`func (o *ItemAttributes) HasAverageReviewRating() bool`

HasAverageReviewRating returns a boolean if a field has been set.

### GetBrand

`func (o *ItemAttributes) GetBrand() string`

GetBrand returns the Brand field if non-nil, zero value otherwise.

### GetBrandOk

`func (o *ItemAttributes) GetBrandOk() (*string, bool)`

GetBrandOk returns a tuple with the Brand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrand

`func (o *ItemAttributes) SetBrand(v string)`

SetBrand sets Brand field to given value.

### HasBrand

`func (o *ItemAttributes) HasBrand() bool`

HasBrand returns a boolean if a field has been set.

### GetColor

`func (o *ItemAttributes) GetColor() string`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *ItemAttributes) GetColorOk() (*string, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *ItemAttributes) SetColor(v string)`

SetColor sets Color field to given value.

### HasColor

`func (o *ItemAttributes) HasColor() bool`

HasColor returns a boolean if a field has been set.

### GetCondition

`func (o *ItemAttributes) GetCondition() string`

GetCondition returns the Condition field if non-nil, zero value otherwise.

### GetConditionOk

`func (o *ItemAttributes) GetConditionOk() (*string, bool)`

GetConditionOk returns a tuple with the Condition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCondition

`func (o *ItemAttributes) SetCondition(v string)`

SetCondition sets Condition field to given value.

### HasCondition

`func (o *ItemAttributes) HasCondition() bool`

HasCondition returns a boolean if a field has been set.

### GetCustomLabel0

`func (o *ItemAttributes) GetCustomLabel0() string`

GetCustomLabel0 returns the CustomLabel0 field if non-nil, zero value otherwise.

### GetCustomLabel0Ok

`func (o *ItemAttributes) GetCustomLabel0Ok() (*string, bool)`

GetCustomLabel0Ok returns a tuple with the CustomLabel0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel0

`func (o *ItemAttributes) SetCustomLabel0(v string)`

SetCustomLabel0 sets CustomLabel0 field to given value.

### HasCustomLabel0

`func (o *ItemAttributes) HasCustomLabel0() bool`

HasCustomLabel0 returns a boolean if a field has been set.

### GetCustomLabel1

`func (o *ItemAttributes) GetCustomLabel1() string`

GetCustomLabel1 returns the CustomLabel1 field if non-nil, zero value otherwise.

### GetCustomLabel1Ok

`func (o *ItemAttributes) GetCustomLabel1Ok() (*string, bool)`

GetCustomLabel1Ok returns a tuple with the CustomLabel1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel1

`func (o *ItemAttributes) SetCustomLabel1(v string)`

SetCustomLabel1 sets CustomLabel1 field to given value.

### HasCustomLabel1

`func (o *ItemAttributes) HasCustomLabel1() bool`

HasCustomLabel1 returns a boolean if a field has been set.

### GetCustomLabel2

`func (o *ItemAttributes) GetCustomLabel2() string`

GetCustomLabel2 returns the CustomLabel2 field if non-nil, zero value otherwise.

### GetCustomLabel2Ok

`func (o *ItemAttributes) GetCustomLabel2Ok() (*string, bool)`

GetCustomLabel2Ok returns a tuple with the CustomLabel2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel2

`func (o *ItemAttributes) SetCustomLabel2(v string)`

SetCustomLabel2 sets CustomLabel2 field to given value.

### HasCustomLabel2

`func (o *ItemAttributes) HasCustomLabel2() bool`

HasCustomLabel2 returns a boolean if a field has been set.

### GetCustomLabel3

`func (o *ItemAttributes) GetCustomLabel3() string`

GetCustomLabel3 returns the CustomLabel3 field if non-nil, zero value otherwise.

### GetCustomLabel3Ok

`func (o *ItemAttributes) GetCustomLabel3Ok() (*string, bool)`

GetCustomLabel3Ok returns a tuple with the CustomLabel3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel3

`func (o *ItemAttributes) SetCustomLabel3(v string)`

SetCustomLabel3 sets CustomLabel3 field to given value.

### HasCustomLabel3

`func (o *ItemAttributes) HasCustomLabel3() bool`

HasCustomLabel3 returns a boolean if a field has been set.

### GetCustomLabel4

`func (o *ItemAttributes) GetCustomLabel4() string`

GetCustomLabel4 returns the CustomLabel4 field if non-nil, zero value otherwise.

### GetCustomLabel4Ok

`func (o *ItemAttributes) GetCustomLabel4Ok() (*string, bool)`

GetCustomLabel4Ok returns a tuple with the CustomLabel4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel4

`func (o *ItemAttributes) SetCustomLabel4(v string)`

SetCustomLabel4 sets CustomLabel4 field to given value.

### HasCustomLabel4

`func (o *ItemAttributes) HasCustomLabel4() bool`

HasCustomLabel4 returns a boolean if a field has been set.

### GetDescription

`func (o *ItemAttributes) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ItemAttributes) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ItemAttributes) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ItemAttributes) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetFreeShippingLabel

`func (o *ItemAttributes) GetFreeShippingLabel() bool`

GetFreeShippingLabel returns the FreeShippingLabel field if non-nil, zero value otherwise.

### GetFreeShippingLabelOk

`func (o *ItemAttributes) GetFreeShippingLabelOk() (*bool, bool)`

GetFreeShippingLabelOk returns a tuple with the FreeShippingLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreeShippingLabel

`func (o *ItemAttributes) SetFreeShippingLabel(v bool)`

SetFreeShippingLabel sets FreeShippingLabel field to given value.

### HasFreeShippingLabel

`func (o *ItemAttributes) HasFreeShippingLabel() bool`

HasFreeShippingLabel returns a boolean if a field has been set.

### GetFreeShippingLimit

`func (o *ItemAttributes) GetFreeShippingLimit() string`

GetFreeShippingLimit returns the FreeShippingLimit field if non-nil, zero value otherwise.

### GetFreeShippingLimitOk

`func (o *ItemAttributes) GetFreeShippingLimitOk() (*string, bool)`

GetFreeShippingLimitOk returns a tuple with the FreeShippingLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreeShippingLimit

`func (o *ItemAttributes) SetFreeShippingLimit(v string)`

SetFreeShippingLimit sets FreeShippingLimit field to given value.

### HasFreeShippingLimit

`func (o *ItemAttributes) HasFreeShippingLimit() bool`

HasFreeShippingLimit returns a boolean if a field has been set.

### GetGender

`func (o *ItemAttributes) GetGender() string`

GetGender returns the Gender field if non-nil, zero value otherwise.

### GetGenderOk

`func (o *ItemAttributes) GetGenderOk() (*string, bool)`

GetGenderOk returns a tuple with the Gender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGender

`func (o *ItemAttributes) SetGender(v string)`

SetGender sets Gender field to given value.

### HasGender

`func (o *ItemAttributes) HasGender() bool`

HasGender returns a boolean if a field has been set.

### GetGoogleProductCategory

`func (o *ItemAttributes) GetGoogleProductCategory() string`

GetGoogleProductCategory returns the GoogleProductCategory field if non-nil, zero value otherwise.

### GetGoogleProductCategoryOk

`func (o *ItemAttributes) GetGoogleProductCategoryOk() (*string, bool)`

GetGoogleProductCategoryOk returns a tuple with the GoogleProductCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoogleProductCategory

`func (o *ItemAttributes) SetGoogleProductCategory(v string)`

SetGoogleProductCategory sets GoogleProductCategory field to given value.

### HasGoogleProductCategory

`func (o *ItemAttributes) HasGoogleProductCategory() bool`

HasGoogleProductCategory returns a boolean if a field has been set.

### GetGtin

`func (o *ItemAttributes) GetGtin() int32`

GetGtin returns the Gtin field if non-nil, zero value otherwise.

### GetGtinOk

`func (o *ItemAttributes) GetGtinOk() (*int32, bool)`

GetGtinOk returns a tuple with the Gtin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGtin

`func (o *ItemAttributes) SetGtin(v int32)`

SetGtin sets Gtin field to given value.

### HasGtin

`func (o *ItemAttributes) HasGtin() bool`

HasGtin returns a boolean if a field has been set.

### GetId

`func (o *ItemAttributes) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemAttributes) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemAttributes) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ItemAttributes) HasId() bool`

HasId returns a boolean if a field has been set.

### GetImageLink

`func (o *ItemAttributes) GetImageLink() []string`

GetImageLink returns the ImageLink field if non-nil, zero value otherwise.

### GetImageLinkOk

`func (o *ItemAttributes) GetImageLinkOk() (*[]string, bool)`

GetImageLinkOk returns a tuple with the ImageLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageLink

`func (o *ItemAttributes) SetImageLink(v []string)`

SetImageLink sets ImageLink field to given value.

### HasImageLink

`func (o *ItemAttributes) HasImageLink() bool`

HasImageLink returns a boolean if a field has been set.

### GetItemGroupId

`func (o *ItemAttributes) GetItemGroupId() string`

GetItemGroupId returns the ItemGroupId field if non-nil, zero value otherwise.

### GetItemGroupIdOk

`func (o *ItemAttributes) GetItemGroupIdOk() (*string, bool)`

GetItemGroupIdOk returns a tuple with the ItemGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemGroupId

`func (o *ItemAttributes) SetItemGroupId(v string)`

SetItemGroupId sets ItemGroupId field to given value.

### HasItemGroupId

`func (o *ItemAttributes) HasItemGroupId() bool`

HasItemGroupId returns a boolean if a field has been set.

### GetLastUpdatedTime

`func (o *ItemAttributes) GetLastUpdatedTime() int64`

GetLastUpdatedTime returns the LastUpdatedTime field if non-nil, zero value otherwise.

### GetLastUpdatedTimeOk

`func (o *ItemAttributes) GetLastUpdatedTimeOk() (*int64, bool)`

GetLastUpdatedTimeOk returns a tuple with the LastUpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdatedTime

`func (o *ItemAttributes) SetLastUpdatedTime(v int64)`

SetLastUpdatedTime sets LastUpdatedTime field to given value.

### HasLastUpdatedTime

`func (o *ItemAttributes) HasLastUpdatedTime() bool`

HasLastUpdatedTime returns a boolean if a field has been set.

### GetLink

`func (o *ItemAttributes) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *ItemAttributes) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *ItemAttributes) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *ItemAttributes) HasLink() bool`

HasLink returns a boolean if a field has been set.

### GetMaterial

`func (o *ItemAttributes) GetMaterial() string`

GetMaterial returns the Material field if non-nil, zero value otherwise.

### GetMaterialOk

`func (o *ItemAttributes) GetMaterialOk() (*string, bool)`

GetMaterialOk returns a tuple with the Material field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaterial

`func (o *ItemAttributes) SetMaterial(v string)`

SetMaterial sets Material field to given value.

### HasMaterial

`func (o *ItemAttributes) HasMaterial() bool`

HasMaterial returns a boolean if a field has been set.

### GetMinAdPrice

`func (o *ItemAttributes) GetMinAdPrice() string`

GetMinAdPrice returns the MinAdPrice field if non-nil, zero value otherwise.

### GetMinAdPriceOk

`func (o *ItemAttributes) GetMinAdPriceOk() (*string, bool)`

GetMinAdPriceOk returns a tuple with the MinAdPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinAdPrice

`func (o *ItemAttributes) SetMinAdPrice(v string)`

SetMinAdPrice sets MinAdPrice field to given value.

### HasMinAdPrice

`func (o *ItemAttributes) HasMinAdPrice() bool`

HasMinAdPrice returns a boolean if a field has been set.

### GetMobileLink

`func (o *ItemAttributes) GetMobileLink() string`

GetMobileLink returns the MobileLink field if non-nil, zero value otherwise.

### GetMobileLinkOk

`func (o *ItemAttributes) GetMobileLinkOk() (*string, bool)`

GetMobileLinkOk returns a tuple with the MobileLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMobileLink

`func (o *ItemAttributes) SetMobileLink(v string)`

SetMobileLink sets MobileLink field to given value.

### HasMobileLink

`func (o *ItemAttributes) HasMobileLink() bool`

HasMobileLink returns a boolean if a field has been set.

### GetMpn

`func (o *ItemAttributes) GetMpn() string`

GetMpn returns the Mpn field if non-nil, zero value otherwise.

### GetMpnOk

`func (o *ItemAttributes) GetMpnOk() (*string, bool)`

GetMpnOk returns a tuple with the Mpn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMpn

`func (o *ItemAttributes) SetMpn(v string)`

SetMpn sets Mpn field to given value.

### HasMpn

`func (o *ItemAttributes) HasMpn() bool`

HasMpn returns a boolean if a field has been set.

### GetNumberOfRatings

`func (o *ItemAttributes) GetNumberOfRatings() int32`

GetNumberOfRatings returns the NumberOfRatings field if non-nil, zero value otherwise.

### GetNumberOfRatingsOk

`func (o *ItemAttributes) GetNumberOfRatingsOk() (*int32, bool)`

GetNumberOfRatingsOk returns a tuple with the NumberOfRatings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfRatings

`func (o *ItemAttributes) SetNumberOfRatings(v int32)`

SetNumberOfRatings sets NumberOfRatings field to given value.

### HasNumberOfRatings

`func (o *ItemAttributes) HasNumberOfRatings() bool`

HasNumberOfRatings returns a boolean if a field has been set.

### GetNumberOfReviews

`func (o *ItemAttributes) GetNumberOfReviews() int32`

GetNumberOfReviews returns the NumberOfReviews field if non-nil, zero value otherwise.

### GetNumberOfReviewsOk

`func (o *ItemAttributes) GetNumberOfReviewsOk() (*int32, bool)`

GetNumberOfReviewsOk returns a tuple with the NumberOfReviews field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfReviews

`func (o *ItemAttributes) SetNumberOfReviews(v int32)`

SetNumberOfReviews sets NumberOfReviews field to given value.

### HasNumberOfReviews

`func (o *ItemAttributes) HasNumberOfReviews() bool`

HasNumberOfReviews returns a boolean if a field has been set.

### GetPattern

`func (o *ItemAttributes) GetPattern() string`

GetPattern returns the Pattern field if non-nil, zero value otherwise.

### GetPatternOk

`func (o *ItemAttributes) GetPatternOk() (*string, bool)`

GetPatternOk returns a tuple with the Pattern field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPattern

`func (o *ItemAttributes) SetPattern(v string)`

SetPattern sets Pattern field to given value.

### HasPattern

`func (o *ItemAttributes) HasPattern() bool`

HasPattern returns a boolean if a field has been set.

### GetPrice

`func (o *ItemAttributes) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *ItemAttributes) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *ItemAttributes) SetPrice(v string)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *ItemAttributes) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetProductType

`func (o *ItemAttributes) GetProductType() string`

GetProductType returns the ProductType field if non-nil, zero value otherwise.

### GetProductTypeOk

`func (o *ItemAttributes) GetProductTypeOk() (*string, bool)`

GetProductTypeOk returns a tuple with the ProductType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductType

`func (o *ItemAttributes) SetProductType(v string)`

SetProductType sets ProductType field to given value.

### HasProductType

`func (o *ItemAttributes) HasProductType() bool`

HasProductType returns a boolean if a field has been set.

### GetSalePrice

`func (o *ItemAttributes) GetSalePrice() string`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *ItemAttributes) GetSalePriceOk() (*string, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *ItemAttributes) SetSalePrice(v string)`

SetSalePrice sets SalePrice field to given value.

### HasSalePrice

`func (o *ItemAttributes) HasSalePrice() bool`

HasSalePrice returns a boolean if a field has been set.

### GetShipping

`func (o *ItemAttributes) GetShipping() string`

GetShipping returns the Shipping field if non-nil, zero value otherwise.

### GetShippingOk

`func (o *ItemAttributes) GetShippingOk() (*string, bool)`

GetShippingOk returns a tuple with the Shipping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipping

`func (o *ItemAttributes) SetShipping(v string)`

SetShipping sets Shipping field to given value.

### HasShipping

`func (o *ItemAttributes) HasShipping() bool`

HasShipping returns a boolean if a field has been set.

### GetShippingHeight

`func (o *ItemAttributes) GetShippingHeight() string`

GetShippingHeight returns the ShippingHeight field if non-nil, zero value otherwise.

### GetShippingHeightOk

`func (o *ItemAttributes) GetShippingHeightOk() (*string, bool)`

GetShippingHeightOk returns a tuple with the ShippingHeight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingHeight

`func (o *ItemAttributes) SetShippingHeight(v string)`

SetShippingHeight sets ShippingHeight field to given value.

### HasShippingHeight

`func (o *ItemAttributes) HasShippingHeight() bool`

HasShippingHeight returns a boolean if a field has been set.

### GetShippingWeight

`func (o *ItemAttributes) GetShippingWeight() string`

GetShippingWeight returns the ShippingWeight field if non-nil, zero value otherwise.

### GetShippingWeightOk

`func (o *ItemAttributes) GetShippingWeightOk() (*string, bool)`

GetShippingWeightOk returns a tuple with the ShippingWeight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingWeight

`func (o *ItemAttributes) SetShippingWeight(v string)`

SetShippingWeight sets ShippingWeight field to given value.

### HasShippingWeight

`func (o *ItemAttributes) HasShippingWeight() bool`

HasShippingWeight returns a boolean if a field has been set.

### GetShippingWidth

`func (o *ItemAttributes) GetShippingWidth() string`

GetShippingWidth returns the ShippingWidth field if non-nil, zero value otherwise.

### GetShippingWidthOk

`func (o *ItemAttributes) GetShippingWidthOk() (*string, bool)`

GetShippingWidthOk returns a tuple with the ShippingWidth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingWidth

`func (o *ItemAttributes) SetShippingWidth(v string)`

SetShippingWidth sets ShippingWidth field to given value.

### HasShippingWidth

`func (o *ItemAttributes) HasShippingWidth() bool`

HasShippingWidth returns a boolean if a field has been set.

### GetSize

`func (o *ItemAttributes) GetSize() string`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *ItemAttributes) GetSizeOk() (*string, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *ItemAttributes) SetSize(v string)`

SetSize sets Size field to given value.

### HasSize

`func (o *ItemAttributes) HasSize() bool`

HasSize returns a boolean if a field has been set.

### GetSizeSystem

`func (o *ItemAttributes) GetSizeSystem() string`

GetSizeSystem returns the SizeSystem field if non-nil, zero value otherwise.

### GetSizeSystemOk

`func (o *ItemAttributes) GetSizeSystemOk() (*string, bool)`

GetSizeSystemOk returns a tuple with the SizeSystem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizeSystem

`func (o *ItemAttributes) SetSizeSystem(v string)`

SetSizeSystem sets SizeSystem field to given value.

### HasSizeSystem

`func (o *ItemAttributes) HasSizeSystem() bool`

HasSizeSystem returns a boolean if a field has been set.

### GetSizeType

`func (o *ItemAttributes) GetSizeType() string`

GetSizeType returns the SizeType field if non-nil, zero value otherwise.

### GetSizeTypeOk

`func (o *ItemAttributes) GetSizeTypeOk() (*string, bool)`

GetSizeTypeOk returns a tuple with the SizeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizeType

`func (o *ItemAttributes) SetSizeType(v string)`

SetSizeType sets SizeType field to given value.

### HasSizeType

`func (o *ItemAttributes) HasSizeType() bool`

HasSizeType returns a boolean if a field has been set.

### GetTax

`func (o *ItemAttributes) GetTax() string`

GetTax returns the Tax field if non-nil, zero value otherwise.

### GetTaxOk

`func (o *ItemAttributes) GetTaxOk() (*string, bool)`

GetTaxOk returns a tuple with the Tax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTax

`func (o *ItemAttributes) SetTax(v string)`

SetTax sets Tax field to given value.

### HasTax

`func (o *ItemAttributes) HasTax() bool`

HasTax returns a boolean if a field has been set.

### GetTitle

`func (o *ItemAttributes) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ItemAttributes) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ItemAttributes) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ItemAttributes) HasTitle() bool`

HasTitle returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


