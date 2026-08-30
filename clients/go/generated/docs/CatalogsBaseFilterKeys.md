# CatalogsBaseFilterKeys

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MIN_PRICE** | [**CatalogsProductGroupPricingCriteria**](CatalogsProductGroupPricingCriteria.md) |  | 
**MAX_PRICE** | [**CatalogsProductGroupPricingCriteria**](CatalogsProductGroupPricingCriteria.md) |  | 
**CURRENCY** | [**CatalogsProductGroupCurrencyCriteria**](CatalogsProductGroupCurrencyCriteria.md) |  | 
**ITEM_ID** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**AVAILABILITY** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**BRAND** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CONDITION** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CUSTOMLABEL0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**ITEM_GROUP_ID** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**GENDER** | [**CatalogsProductGroupMultipleGenderCriteria**](CatalogsProductGroupMultipleGenderCriteria.md) |  | 
**MEDIA_TYPE** | [**CatalogsProductGroupMultipleMediaTypesCriteria**](CatalogsProductGroupMultipleMediaTypesCriteria.md) |  | 
**PRODUCTTYPE4** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**PRODUCTTYPE3** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**PRODUCTTYPE2** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**PRODUCTTYPE1** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**PRODUCTTYPE0** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY6** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY5** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY4** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY3** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY2** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY1** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY0** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**CUSTOMNUMBER0** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**CUSTOMNUMBER1** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**CUSTOMNUMBER2** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**CUSTOMNUMBER3** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**CUSTOMNUMBER4** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**TITLE_KEYWORDS** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**PINTEREST_PRODUCT_CATEGORIES** | [**CatalogsProductGroupMultiplePinterestProductCategoryCriteria**](CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md) |  | 

## Methods

### NewCatalogsBaseFilterKeys

`func NewCatalogsBaseFilterKeys(mINPRICE CatalogsProductGroupPricingCriteria, mAXPRICE CatalogsProductGroupPricingCriteria, cURRENCY CatalogsProductGroupCurrencyCriteria, iTEMID CatalogsProductGroupMultipleStringCriteria, aVAILABILITY CatalogsProductGroupMultipleStringCriteria, bRAND CatalogsProductGroupMultipleStringCriteria, cONDITION CatalogsProductGroupMultipleStringCriteria, cUSTOMLABEL0 CatalogsProductGroupFilterOperatorTypeCriteria, cUSTOMLABEL1 CatalogsProductGroupFilterOperatorTypeCriteria, cUSTOMLABEL2 CatalogsProductGroupFilterOperatorTypeCriteria, cUSTOMLABEL3 CatalogsProductGroupFilterOperatorTypeCriteria, cUSTOMLABEL4 CatalogsProductGroupFilterOperatorTypeCriteria, iTEMGROUPID CatalogsProductGroupMultipleStringCriteria, gENDER CatalogsProductGroupMultipleGenderCriteria, mEDIATYPE CatalogsProductGroupMultipleMediaTypesCriteria, pRODUCTTYPE4 CatalogsProductGroupMultipleStringListCriteria, pRODUCTTYPE3 CatalogsProductGroupMultipleStringListCriteria, pRODUCTTYPE2 CatalogsProductGroupMultipleStringListCriteria, pRODUCTTYPE1 CatalogsProductGroupMultipleStringListCriteria, pRODUCTTYPE0 CatalogsProductGroupMultipleStringListCriteria, gOOGLEPRODUCTCATEGORY6 CatalogsProductGroupMultipleStringListCriteria, gOOGLEPRODUCTCATEGORY5 CatalogsProductGroupMultipleStringListCriteria, gOOGLEPRODUCTCATEGORY4 CatalogsProductGroupMultipleStringListCriteria, gOOGLEPRODUCTCATEGORY3 CatalogsProductGroupMultipleStringListCriteria, gOOGLEPRODUCTCATEGORY2 CatalogsProductGroupMultipleStringListCriteria, gOOGLEPRODUCTCATEGORY1 CatalogsProductGroupMultipleStringListCriteria, gOOGLEPRODUCTCATEGORY0 CatalogsProductGroupMultipleStringListCriteria, cUSTOMNUMBER0 CatalogsProductGroupUint32Criteria, cUSTOMNUMBER1 CatalogsProductGroupUint32Criteria, cUSTOMNUMBER2 CatalogsProductGroupUint32Criteria, cUSTOMNUMBER3 CatalogsProductGroupUint32Criteria, cUSTOMNUMBER4 CatalogsProductGroupUint32Criteria, tITLEKEYWORDS CatalogsProductGroupMultipleStringCriteria, pINTERESTPRODUCTCATEGORIES CatalogsProductGroupMultiplePinterestProductCategoryCriteria, ) *CatalogsBaseFilterKeys`

NewCatalogsBaseFilterKeys instantiates a new CatalogsBaseFilterKeys object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsBaseFilterKeysWithDefaults

`func NewCatalogsBaseFilterKeysWithDefaults() *CatalogsBaseFilterKeys`

NewCatalogsBaseFilterKeysWithDefaults instantiates a new CatalogsBaseFilterKeys object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMIN_PRICE

`func (o *CatalogsBaseFilterKeys) GetMIN_PRICE() CatalogsProductGroupPricingCriteria`

GetMIN_PRICE returns the MIN_PRICE field if non-nil, zero value otherwise.

### GetMIN_PRICEOk

`func (o *CatalogsBaseFilterKeys) GetMIN_PRICEOk() (*CatalogsProductGroupPricingCriteria, bool)`

GetMIN_PRICEOk returns a tuple with the MIN_PRICE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMIN_PRICE

`func (o *CatalogsBaseFilterKeys) SetMIN_PRICE(v CatalogsProductGroupPricingCriteria)`

SetMIN_PRICE sets MIN_PRICE field to given value.


### GetMAX_PRICE

`func (o *CatalogsBaseFilterKeys) GetMAX_PRICE() CatalogsProductGroupPricingCriteria`

GetMAX_PRICE returns the MAX_PRICE field if non-nil, zero value otherwise.

### GetMAX_PRICEOk

`func (o *CatalogsBaseFilterKeys) GetMAX_PRICEOk() (*CatalogsProductGroupPricingCriteria, bool)`

GetMAX_PRICEOk returns a tuple with the MAX_PRICE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMAX_PRICE

`func (o *CatalogsBaseFilterKeys) SetMAX_PRICE(v CatalogsProductGroupPricingCriteria)`

SetMAX_PRICE sets MAX_PRICE field to given value.


### GetCURRENCY

`func (o *CatalogsBaseFilterKeys) GetCURRENCY() CatalogsProductGroupCurrencyCriteria`

GetCURRENCY returns the CURRENCY field if non-nil, zero value otherwise.

### GetCURRENCYOk

`func (o *CatalogsBaseFilterKeys) GetCURRENCYOk() (*CatalogsProductGroupCurrencyCriteria, bool)`

GetCURRENCYOk returns a tuple with the CURRENCY field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCURRENCY

`func (o *CatalogsBaseFilterKeys) SetCURRENCY(v CatalogsProductGroupCurrencyCriteria)`

SetCURRENCY sets CURRENCY field to given value.


### GetITEM_ID

`func (o *CatalogsBaseFilterKeys) GetITEM_ID() CatalogsProductGroupMultipleStringCriteria`

GetITEM_ID returns the ITEM_ID field if non-nil, zero value otherwise.

### GetITEM_IDOk

`func (o *CatalogsBaseFilterKeys) GetITEM_IDOk() (*CatalogsProductGroupMultipleStringCriteria, bool)`

GetITEM_IDOk returns a tuple with the ITEM_ID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetITEM_ID

`func (o *CatalogsBaseFilterKeys) SetITEM_ID(v CatalogsProductGroupMultipleStringCriteria)`

SetITEM_ID sets ITEM_ID field to given value.


### GetAVAILABILITY

`func (o *CatalogsBaseFilterKeys) GetAVAILABILITY() CatalogsProductGroupMultipleStringCriteria`

GetAVAILABILITY returns the AVAILABILITY field if non-nil, zero value otherwise.

### GetAVAILABILITYOk

`func (o *CatalogsBaseFilterKeys) GetAVAILABILITYOk() (*CatalogsProductGroupMultipleStringCriteria, bool)`

GetAVAILABILITYOk returns a tuple with the AVAILABILITY field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAVAILABILITY

`func (o *CatalogsBaseFilterKeys) SetAVAILABILITY(v CatalogsProductGroupMultipleStringCriteria)`

SetAVAILABILITY sets AVAILABILITY field to given value.


### GetBRAND

`func (o *CatalogsBaseFilterKeys) GetBRAND() CatalogsProductGroupMultipleStringCriteria`

GetBRAND returns the BRAND field if non-nil, zero value otherwise.

### GetBRANDOk

`func (o *CatalogsBaseFilterKeys) GetBRANDOk() (*CatalogsProductGroupMultipleStringCriteria, bool)`

GetBRANDOk returns a tuple with the BRAND field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBRAND

`func (o *CatalogsBaseFilterKeys) SetBRAND(v CatalogsProductGroupMultipleStringCriteria)`

SetBRAND sets BRAND field to given value.


### GetCONDITION

`func (o *CatalogsBaseFilterKeys) GetCONDITION() CatalogsProductGroupMultipleStringCriteria`

GetCONDITION returns the CONDITION field if non-nil, zero value otherwise.

### GetCONDITIONOk

`func (o *CatalogsBaseFilterKeys) GetCONDITIONOk() (*CatalogsProductGroupMultipleStringCriteria, bool)`

GetCONDITIONOk returns a tuple with the CONDITION field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCONDITION

`func (o *CatalogsBaseFilterKeys) SetCONDITION(v CatalogsProductGroupMultipleStringCriteria)`

SetCONDITION sets CONDITION field to given value.


### GetCUSTOMLABEL0

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL0() CatalogsProductGroupFilterOperatorTypeCriteria`

GetCUSTOMLABEL0 returns the CUSTOMLABEL0 field if non-nil, zero value otherwise.

### GetCUSTOMLABEL0Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL0Ok() (*CatalogsProductGroupFilterOperatorTypeCriteria, bool)`

GetCUSTOMLABEL0Ok returns a tuple with the CUSTOMLABEL0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMLABEL0

`func (o *CatalogsBaseFilterKeys) SetCUSTOMLABEL0(v CatalogsProductGroupFilterOperatorTypeCriteria)`

SetCUSTOMLABEL0 sets CUSTOMLABEL0 field to given value.


### GetCUSTOMLABEL1

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL1() CatalogsProductGroupFilterOperatorTypeCriteria`

GetCUSTOMLABEL1 returns the CUSTOMLABEL1 field if non-nil, zero value otherwise.

### GetCUSTOMLABEL1Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL1Ok() (*CatalogsProductGroupFilterOperatorTypeCriteria, bool)`

GetCUSTOMLABEL1Ok returns a tuple with the CUSTOMLABEL1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMLABEL1

`func (o *CatalogsBaseFilterKeys) SetCUSTOMLABEL1(v CatalogsProductGroupFilterOperatorTypeCriteria)`

SetCUSTOMLABEL1 sets CUSTOMLABEL1 field to given value.


### GetCUSTOMLABEL2

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL2() CatalogsProductGroupFilterOperatorTypeCriteria`

GetCUSTOMLABEL2 returns the CUSTOMLABEL2 field if non-nil, zero value otherwise.

### GetCUSTOMLABEL2Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL2Ok() (*CatalogsProductGroupFilterOperatorTypeCriteria, bool)`

GetCUSTOMLABEL2Ok returns a tuple with the CUSTOMLABEL2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMLABEL2

`func (o *CatalogsBaseFilterKeys) SetCUSTOMLABEL2(v CatalogsProductGroupFilterOperatorTypeCriteria)`

SetCUSTOMLABEL2 sets CUSTOMLABEL2 field to given value.


### GetCUSTOMLABEL3

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL3() CatalogsProductGroupFilterOperatorTypeCriteria`

GetCUSTOMLABEL3 returns the CUSTOMLABEL3 field if non-nil, zero value otherwise.

### GetCUSTOMLABEL3Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL3Ok() (*CatalogsProductGroupFilterOperatorTypeCriteria, bool)`

GetCUSTOMLABEL3Ok returns a tuple with the CUSTOMLABEL3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMLABEL3

`func (o *CatalogsBaseFilterKeys) SetCUSTOMLABEL3(v CatalogsProductGroupFilterOperatorTypeCriteria)`

SetCUSTOMLABEL3 sets CUSTOMLABEL3 field to given value.


### GetCUSTOMLABEL4

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL4() CatalogsProductGroupFilterOperatorTypeCriteria`

GetCUSTOMLABEL4 returns the CUSTOMLABEL4 field if non-nil, zero value otherwise.

### GetCUSTOMLABEL4Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMLABEL4Ok() (*CatalogsProductGroupFilterOperatorTypeCriteria, bool)`

GetCUSTOMLABEL4Ok returns a tuple with the CUSTOMLABEL4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMLABEL4

`func (o *CatalogsBaseFilterKeys) SetCUSTOMLABEL4(v CatalogsProductGroupFilterOperatorTypeCriteria)`

SetCUSTOMLABEL4 sets CUSTOMLABEL4 field to given value.


### GetITEM_GROUP_ID

`func (o *CatalogsBaseFilterKeys) GetITEM_GROUP_ID() CatalogsProductGroupMultipleStringCriteria`

GetITEM_GROUP_ID returns the ITEM_GROUP_ID field if non-nil, zero value otherwise.

### GetITEM_GROUP_IDOk

`func (o *CatalogsBaseFilterKeys) GetITEM_GROUP_IDOk() (*CatalogsProductGroupMultipleStringCriteria, bool)`

GetITEM_GROUP_IDOk returns a tuple with the ITEM_GROUP_ID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetITEM_GROUP_ID

`func (o *CatalogsBaseFilterKeys) SetITEM_GROUP_ID(v CatalogsProductGroupMultipleStringCriteria)`

SetITEM_GROUP_ID sets ITEM_GROUP_ID field to given value.


### GetGENDER

`func (o *CatalogsBaseFilterKeys) GetGENDER() CatalogsProductGroupMultipleGenderCriteria`

GetGENDER returns the GENDER field if non-nil, zero value otherwise.

### GetGENDEROk

`func (o *CatalogsBaseFilterKeys) GetGENDEROk() (*CatalogsProductGroupMultipleGenderCriteria, bool)`

GetGENDEROk returns a tuple with the GENDER field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGENDER

`func (o *CatalogsBaseFilterKeys) SetGENDER(v CatalogsProductGroupMultipleGenderCriteria)`

SetGENDER sets GENDER field to given value.


### GetMEDIA_TYPE

`func (o *CatalogsBaseFilterKeys) GetMEDIA_TYPE() CatalogsProductGroupMultipleMediaTypesCriteria`

GetMEDIA_TYPE returns the MEDIA_TYPE field if non-nil, zero value otherwise.

### GetMEDIA_TYPEOk

`func (o *CatalogsBaseFilterKeys) GetMEDIA_TYPEOk() (*CatalogsProductGroupMultipleMediaTypesCriteria, bool)`

GetMEDIA_TYPEOk returns a tuple with the MEDIA_TYPE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMEDIA_TYPE

`func (o *CatalogsBaseFilterKeys) SetMEDIA_TYPE(v CatalogsProductGroupMultipleMediaTypesCriteria)`

SetMEDIA_TYPE sets MEDIA_TYPE field to given value.


### GetPRODUCTTYPE4

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE4() CatalogsProductGroupMultipleStringListCriteria`

GetPRODUCTTYPE4 returns the PRODUCTTYPE4 field if non-nil, zero value otherwise.

### GetPRODUCTTYPE4Ok

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE4Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetPRODUCTTYPE4Ok returns a tuple with the PRODUCTTYPE4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCTTYPE4

`func (o *CatalogsBaseFilterKeys) SetPRODUCTTYPE4(v CatalogsProductGroupMultipleStringListCriteria)`

SetPRODUCTTYPE4 sets PRODUCTTYPE4 field to given value.


### GetPRODUCTTYPE3

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE3() CatalogsProductGroupMultipleStringListCriteria`

GetPRODUCTTYPE3 returns the PRODUCTTYPE3 field if non-nil, zero value otherwise.

### GetPRODUCTTYPE3Ok

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE3Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetPRODUCTTYPE3Ok returns a tuple with the PRODUCTTYPE3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCTTYPE3

`func (o *CatalogsBaseFilterKeys) SetPRODUCTTYPE3(v CatalogsProductGroupMultipleStringListCriteria)`

SetPRODUCTTYPE3 sets PRODUCTTYPE3 field to given value.


### GetPRODUCTTYPE2

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE2() CatalogsProductGroupMultipleStringListCriteria`

GetPRODUCTTYPE2 returns the PRODUCTTYPE2 field if non-nil, zero value otherwise.

### GetPRODUCTTYPE2Ok

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE2Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetPRODUCTTYPE2Ok returns a tuple with the PRODUCTTYPE2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCTTYPE2

`func (o *CatalogsBaseFilterKeys) SetPRODUCTTYPE2(v CatalogsProductGroupMultipleStringListCriteria)`

SetPRODUCTTYPE2 sets PRODUCTTYPE2 field to given value.


### GetPRODUCTTYPE1

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE1() CatalogsProductGroupMultipleStringListCriteria`

GetPRODUCTTYPE1 returns the PRODUCTTYPE1 field if non-nil, zero value otherwise.

### GetPRODUCTTYPE1Ok

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE1Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetPRODUCTTYPE1Ok returns a tuple with the PRODUCTTYPE1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCTTYPE1

`func (o *CatalogsBaseFilterKeys) SetPRODUCTTYPE1(v CatalogsProductGroupMultipleStringListCriteria)`

SetPRODUCTTYPE1 sets PRODUCTTYPE1 field to given value.


### GetPRODUCTTYPE0

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE0() CatalogsProductGroupMultipleStringListCriteria`

GetPRODUCTTYPE0 returns the PRODUCTTYPE0 field if non-nil, zero value otherwise.

### GetPRODUCTTYPE0Ok

`func (o *CatalogsBaseFilterKeys) GetPRODUCTTYPE0Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetPRODUCTTYPE0Ok returns a tuple with the PRODUCTTYPE0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCTTYPE0

`func (o *CatalogsBaseFilterKeys) SetPRODUCTTYPE0(v CatalogsProductGroupMultipleStringListCriteria)`

SetPRODUCTTYPE0 sets PRODUCTTYPE0 field to given value.


### GetGOOGLEPRODUCTCATEGORY6

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY6() CatalogsProductGroupMultipleStringListCriteria`

GetGOOGLEPRODUCTCATEGORY6 returns the GOOGLEPRODUCTCATEGORY6 field if non-nil, zero value otherwise.

### GetGOOGLEPRODUCTCATEGORY6Ok

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY6Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetGOOGLEPRODUCTCATEGORY6Ok returns a tuple with the GOOGLEPRODUCTCATEGORY6 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGOOGLEPRODUCTCATEGORY6

`func (o *CatalogsBaseFilterKeys) SetGOOGLEPRODUCTCATEGORY6(v CatalogsProductGroupMultipleStringListCriteria)`

SetGOOGLEPRODUCTCATEGORY6 sets GOOGLEPRODUCTCATEGORY6 field to given value.


### GetGOOGLEPRODUCTCATEGORY5

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY5() CatalogsProductGroupMultipleStringListCriteria`

GetGOOGLEPRODUCTCATEGORY5 returns the GOOGLEPRODUCTCATEGORY5 field if non-nil, zero value otherwise.

### GetGOOGLEPRODUCTCATEGORY5Ok

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY5Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetGOOGLEPRODUCTCATEGORY5Ok returns a tuple with the GOOGLEPRODUCTCATEGORY5 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGOOGLEPRODUCTCATEGORY5

`func (o *CatalogsBaseFilterKeys) SetGOOGLEPRODUCTCATEGORY5(v CatalogsProductGroupMultipleStringListCriteria)`

SetGOOGLEPRODUCTCATEGORY5 sets GOOGLEPRODUCTCATEGORY5 field to given value.


### GetGOOGLEPRODUCTCATEGORY4

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY4() CatalogsProductGroupMultipleStringListCriteria`

GetGOOGLEPRODUCTCATEGORY4 returns the GOOGLEPRODUCTCATEGORY4 field if non-nil, zero value otherwise.

### GetGOOGLEPRODUCTCATEGORY4Ok

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY4Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetGOOGLEPRODUCTCATEGORY4Ok returns a tuple with the GOOGLEPRODUCTCATEGORY4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGOOGLEPRODUCTCATEGORY4

`func (o *CatalogsBaseFilterKeys) SetGOOGLEPRODUCTCATEGORY4(v CatalogsProductGroupMultipleStringListCriteria)`

SetGOOGLEPRODUCTCATEGORY4 sets GOOGLEPRODUCTCATEGORY4 field to given value.


### GetGOOGLEPRODUCTCATEGORY3

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY3() CatalogsProductGroupMultipleStringListCriteria`

GetGOOGLEPRODUCTCATEGORY3 returns the GOOGLEPRODUCTCATEGORY3 field if non-nil, zero value otherwise.

### GetGOOGLEPRODUCTCATEGORY3Ok

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY3Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetGOOGLEPRODUCTCATEGORY3Ok returns a tuple with the GOOGLEPRODUCTCATEGORY3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGOOGLEPRODUCTCATEGORY3

`func (o *CatalogsBaseFilterKeys) SetGOOGLEPRODUCTCATEGORY3(v CatalogsProductGroupMultipleStringListCriteria)`

SetGOOGLEPRODUCTCATEGORY3 sets GOOGLEPRODUCTCATEGORY3 field to given value.


### GetGOOGLEPRODUCTCATEGORY2

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY2() CatalogsProductGroupMultipleStringListCriteria`

GetGOOGLEPRODUCTCATEGORY2 returns the GOOGLEPRODUCTCATEGORY2 field if non-nil, zero value otherwise.

### GetGOOGLEPRODUCTCATEGORY2Ok

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY2Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetGOOGLEPRODUCTCATEGORY2Ok returns a tuple with the GOOGLEPRODUCTCATEGORY2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGOOGLEPRODUCTCATEGORY2

`func (o *CatalogsBaseFilterKeys) SetGOOGLEPRODUCTCATEGORY2(v CatalogsProductGroupMultipleStringListCriteria)`

SetGOOGLEPRODUCTCATEGORY2 sets GOOGLEPRODUCTCATEGORY2 field to given value.


### GetGOOGLEPRODUCTCATEGORY1

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY1() CatalogsProductGroupMultipleStringListCriteria`

GetGOOGLEPRODUCTCATEGORY1 returns the GOOGLEPRODUCTCATEGORY1 field if non-nil, zero value otherwise.

### GetGOOGLEPRODUCTCATEGORY1Ok

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY1Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetGOOGLEPRODUCTCATEGORY1Ok returns a tuple with the GOOGLEPRODUCTCATEGORY1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGOOGLEPRODUCTCATEGORY1

`func (o *CatalogsBaseFilterKeys) SetGOOGLEPRODUCTCATEGORY1(v CatalogsProductGroupMultipleStringListCriteria)`

SetGOOGLEPRODUCTCATEGORY1 sets GOOGLEPRODUCTCATEGORY1 field to given value.


### GetGOOGLEPRODUCTCATEGORY0

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY0() CatalogsProductGroupMultipleStringListCriteria`

GetGOOGLEPRODUCTCATEGORY0 returns the GOOGLEPRODUCTCATEGORY0 field if non-nil, zero value otherwise.

### GetGOOGLEPRODUCTCATEGORY0Ok

`func (o *CatalogsBaseFilterKeys) GetGOOGLEPRODUCTCATEGORY0Ok() (*CatalogsProductGroupMultipleStringListCriteria, bool)`

GetGOOGLEPRODUCTCATEGORY0Ok returns a tuple with the GOOGLEPRODUCTCATEGORY0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGOOGLEPRODUCTCATEGORY0

`func (o *CatalogsBaseFilterKeys) SetGOOGLEPRODUCTCATEGORY0(v CatalogsProductGroupMultipleStringListCriteria)`

SetGOOGLEPRODUCTCATEGORY0 sets GOOGLEPRODUCTCATEGORY0 field to given value.


### GetCUSTOMNUMBER0

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER0() CatalogsProductGroupUint32Criteria`

GetCUSTOMNUMBER0 returns the CUSTOMNUMBER0 field if non-nil, zero value otherwise.

### GetCUSTOMNUMBER0Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER0Ok() (*CatalogsProductGroupUint32Criteria, bool)`

GetCUSTOMNUMBER0Ok returns a tuple with the CUSTOMNUMBER0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMNUMBER0

`func (o *CatalogsBaseFilterKeys) SetCUSTOMNUMBER0(v CatalogsProductGroupUint32Criteria)`

SetCUSTOMNUMBER0 sets CUSTOMNUMBER0 field to given value.


### GetCUSTOMNUMBER1

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER1() CatalogsProductGroupUint32Criteria`

GetCUSTOMNUMBER1 returns the CUSTOMNUMBER1 field if non-nil, zero value otherwise.

### GetCUSTOMNUMBER1Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER1Ok() (*CatalogsProductGroupUint32Criteria, bool)`

GetCUSTOMNUMBER1Ok returns a tuple with the CUSTOMNUMBER1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMNUMBER1

`func (o *CatalogsBaseFilterKeys) SetCUSTOMNUMBER1(v CatalogsProductGroupUint32Criteria)`

SetCUSTOMNUMBER1 sets CUSTOMNUMBER1 field to given value.


### GetCUSTOMNUMBER2

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER2() CatalogsProductGroupUint32Criteria`

GetCUSTOMNUMBER2 returns the CUSTOMNUMBER2 field if non-nil, zero value otherwise.

### GetCUSTOMNUMBER2Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER2Ok() (*CatalogsProductGroupUint32Criteria, bool)`

GetCUSTOMNUMBER2Ok returns a tuple with the CUSTOMNUMBER2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMNUMBER2

`func (o *CatalogsBaseFilterKeys) SetCUSTOMNUMBER2(v CatalogsProductGroupUint32Criteria)`

SetCUSTOMNUMBER2 sets CUSTOMNUMBER2 field to given value.


### GetCUSTOMNUMBER3

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER3() CatalogsProductGroupUint32Criteria`

GetCUSTOMNUMBER3 returns the CUSTOMNUMBER3 field if non-nil, zero value otherwise.

### GetCUSTOMNUMBER3Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER3Ok() (*CatalogsProductGroupUint32Criteria, bool)`

GetCUSTOMNUMBER3Ok returns a tuple with the CUSTOMNUMBER3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMNUMBER3

`func (o *CatalogsBaseFilterKeys) SetCUSTOMNUMBER3(v CatalogsProductGroupUint32Criteria)`

SetCUSTOMNUMBER3 sets CUSTOMNUMBER3 field to given value.


### GetCUSTOMNUMBER4

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER4() CatalogsProductGroupUint32Criteria`

GetCUSTOMNUMBER4 returns the CUSTOMNUMBER4 field if non-nil, zero value otherwise.

### GetCUSTOMNUMBER4Ok

`func (o *CatalogsBaseFilterKeys) GetCUSTOMNUMBER4Ok() (*CatalogsProductGroupUint32Criteria, bool)`

GetCUSTOMNUMBER4Ok returns a tuple with the CUSTOMNUMBER4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOMNUMBER4

`func (o *CatalogsBaseFilterKeys) SetCUSTOMNUMBER4(v CatalogsProductGroupUint32Criteria)`

SetCUSTOMNUMBER4 sets CUSTOMNUMBER4 field to given value.


### GetTITLE_KEYWORDS

`func (o *CatalogsBaseFilterKeys) GetTITLE_KEYWORDS() CatalogsProductGroupMultipleStringCriteria`

GetTITLE_KEYWORDS returns the TITLE_KEYWORDS field if non-nil, zero value otherwise.

### GetTITLE_KEYWORDSOk

`func (o *CatalogsBaseFilterKeys) GetTITLE_KEYWORDSOk() (*CatalogsProductGroupMultipleStringCriteria, bool)`

GetTITLE_KEYWORDSOk returns a tuple with the TITLE_KEYWORDS field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTITLE_KEYWORDS

`func (o *CatalogsBaseFilterKeys) SetTITLE_KEYWORDS(v CatalogsProductGroupMultipleStringCriteria)`

SetTITLE_KEYWORDS sets TITLE_KEYWORDS field to given value.


### GetPINTEREST_PRODUCT_CATEGORIES

`func (o *CatalogsBaseFilterKeys) GetPINTEREST_PRODUCT_CATEGORIES() CatalogsProductGroupMultiplePinterestProductCategoryCriteria`

GetPINTEREST_PRODUCT_CATEGORIES returns the PINTEREST_PRODUCT_CATEGORIES field if non-nil, zero value otherwise.

### GetPINTEREST_PRODUCT_CATEGORIESOk

`func (o *CatalogsBaseFilterKeys) GetPINTEREST_PRODUCT_CATEGORIESOk() (*CatalogsProductGroupMultiplePinterestProductCategoryCriteria, bool)`

GetPINTEREST_PRODUCT_CATEGORIESOk returns a tuple with the PINTEREST_PRODUCT_CATEGORIES field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPINTEREST_PRODUCT_CATEGORIES

`func (o *CatalogsBaseFilterKeys) SetPINTEREST_PRODUCT_CATEGORIES(v CatalogsProductGroupMultiplePinterestProductCategoryCriteria)`

SetPINTEREST_PRODUCT_CATEGORIES sets PINTEREST_PRODUCT_CATEGORIES field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


