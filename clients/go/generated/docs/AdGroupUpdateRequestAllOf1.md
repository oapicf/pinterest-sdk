# AdGroupUpdateRequestAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidMultiplier** | Pointer to **float32** | &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. | [optional] 
**Id** | **string** | Ad group ID. | 
**TargetingSpecOperations** | Pointer to [**[]TargetingSpecOperations**](TargetingSpecOperations.md) | &lt;div&gt;Targeting spec operations define modifications to apply to the targeting spec.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;&lt;strong&gt;NOTE:&lt;/strong&gt; The &lt;code&gt;targeting_spec&lt;/code&gt; and &lt;code&gt;targeting_spec_operations&lt;/code&gt; cannot be sent at the same time.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;The supported operations are:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;SET&lt;/code&gt;: sets the field with the given values. If value is set to &lt;code&gt;null&lt;/code&gt;, the field will be removed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ADD&lt;/code&gt;: adds the given values to the field.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMOVE&lt;/code&gt;: removes the given values from the field.&lt;/li&gt; &lt;/ul&gt; &lt;div&gt;Note the following:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;Same items are not added and removed at the same time.&lt;/li&gt; &lt;li&gt;For a given field, only &lt;code&gt;ADD&lt;/code&gt;/&lt;code&gt;REMOVE&lt;/code&gt; or &lt;code&gt;SET&lt;/code&gt; operations are allowed, not a mix of them.&lt;/li&gt; &lt;li&gt;Only one SET operation is allowed for a given field.&lt;/li&gt; &lt;li&gt;The &lt;code&gt;AGE_BUCKET&lt;/code&gt;, &lt;code&gt;MAXIMUM_AGE&lt;/code&gt;, &lt;code&gt;MINIMUM_AGE&lt;/code&gt; and &lt;code&gt;SHOPPING_RETARGETING&lt;/code&gt; fields only support the &lt;code&gt;SET&lt;/code&gt; operation.&lt;/li&gt; &lt;/ul&gt; | [optional] 

## Methods

### NewAdGroupUpdateRequestAllOf1

`func NewAdGroupUpdateRequestAllOf1(id string, ) *AdGroupUpdateRequestAllOf1`

NewAdGroupUpdateRequestAllOf1 instantiates a new AdGroupUpdateRequestAllOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupUpdateRequestAllOf1WithDefaults

`func NewAdGroupUpdateRequestAllOf1WithDefaults() *AdGroupUpdateRequestAllOf1`

NewAdGroupUpdateRequestAllOf1WithDefaults instantiates a new AdGroupUpdateRequestAllOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBidMultiplier

`func (o *AdGroupUpdateRequestAllOf1) GetBidMultiplier() float32`

GetBidMultiplier returns the BidMultiplier field if non-nil, zero value otherwise.

### GetBidMultiplierOk

`func (o *AdGroupUpdateRequestAllOf1) GetBidMultiplierOk() (*float32, bool)`

GetBidMultiplierOk returns a tuple with the BidMultiplier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidMultiplier

`func (o *AdGroupUpdateRequestAllOf1) SetBidMultiplier(v float32)`

SetBidMultiplier sets BidMultiplier field to given value.

### HasBidMultiplier

`func (o *AdGroupUpdateRequestAllOf1) HasBidMultiplier() bool`

HasBidMultiplier returns a boolean if a field has been set.

### GetId

`func (o *AdGroupUpdateRequestAllOf1) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdGroupUpdateRequestAllOf1) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdGroupUpdateRequestAllOf1) SetId(v string)`

SetId sets Id field to given value.


### GetTargetingSpecOperations

`func (o *AdGroupUpdateRequestAllOf1) GetTargetingSpecOperations() []TargetingSpecOperations`

GetTargetingSpecOperations returns the TargetingSpecOperations field if non-nil, zero value otherwise.

### GetTargetingSpecOperationsOk

`func (o *AdGroupUpdateRequestAllOf1) GetTargetingSpecOperationsOk() (*[]TargetingSpecOperations, bool)`

GetTargetingSpecOperationsOk returns a tuple with the TargetingSpecOperations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpecOperations

`func (o *AdGroupUpdateRequestAllOf1) SetTargetingSpecOperations(v []TargetingSpecOperations)`

SetTargetingSpecOperations sets TargetingSpecOperations field to given value.

### HasTargetingSpecOperations

`func (o *AdGroupUpdateRequestAllOf1) HasTargetingSpecOperations() bool`

HasTargetingSpecOperations returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


