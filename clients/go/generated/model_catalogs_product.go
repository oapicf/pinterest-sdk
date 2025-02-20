/*
Pinterest REST API

Pinterest's REST API

API version: 5.14.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"gopkg.in/validator.v2"
	"fmt"
)

// CatalogsProduct - Catalogs product for all verticals
type CatalogsProduct struct {
	CatalogsCreativeAssetsProduct *CatalogsCreativeAssetsProduct
	CatalogsHotelProduct *CatalogsHotelProduct
	CatalogsRetailProduct *CatalogsRetailProduct
}

// CatalogsCreativeAssetsProductAsCatalogsProduct is a convenience function that returns CatalogsCreativeAssetsProduct wrapped in CatalogsProduct
func CatalogsCreativeAssetsProductAsCatalogsProduct(v *CatalogsCreativeAssetsProduct) CatalogsProduct {
	return CatalogsProduct{
		CatalogsCreativeAssetsProduct: v,
	}
}

// CatalogsHotelProductAsCatalogsProduct is a convenience function that returns CatalogsHotelProduct wrapped in CatalogsProduct
func CatalogsHotelProductAsCatalogsProduct(v *CatalogsHotelProduct) CatalogsProduct {
	return CatalogsProduct{
		CatalogsHotelProduct: v,
	}
}

// CatalogsRetailProductAsCatalogsProduct is a convenience function that returns CatalogsRetailProduct wrapped in CatalogsProduct
func CatalogsRetailProductAsCatalogsProduct(v *CatalogsRetailProduct) CatalogsProduct {
	return CatalogsProduct{
		CatalogsRetailProduct: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CatalogsProduct) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into CatalogsCreativeAssetsProduct
	err = newStrictDecoder(data).Decode(&dst.CatalogsCreativeAssetsProduct)
	if err == nil {
		jsonCatalogsCreativeAssetsProduct, _ := json.Marshal(dst.CatalogsCreativeAssetsProduct)
		if string(jsonCatalogsCreativeAssetsProduct) == "{}" { // empty struct
			dst.CatalogsCreativeAssetsProduct = nil
		} else {
			if err = validator.Validate(dst.CatalogsCreativeAssetsProduct); err != nil {
				dst.CatalogsCreativeAssetsProduct = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsCreativeAssetsProduct = nil
	}

	// try to unmarshal data into CatalogsHotelProduct
	err = newStrictDecoder(data).Decode(&dst.CatalogsHotelProduct)
	if err == nil {
		jsonCatalogsHotelProduct, _ := json.Marshal(dst.CatalogsHotelProduct)
		if string(jsonCatalogsHotelProduct) == "{}" { // empty struct
			dst.CatalogsHotelProduct = nil
		} else {
			if err = validator.Validate(dst.CatalogsHotelProduct); err != nil {
				dst.CatalogsHotelProduct = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsHotelProduct = nil
	}

	// try to unmarshal data into CatalogsRetailProduct
	err = newStrictDecoder(data).Decode(&dst.CatalogsRetailProduct)
	if err == nil {
		jsonCatalogsRetailProduct, _ := json.Marshal(dst.CatalogsRetailProduct)
		if string(jsonCatalogsRetailProduct) == "{}" { // empty struct
			dst.CatalogsRetailProduct = nil
		} else {
			if err = validator.Validate(dst.CatalogsRetailProduct); err != nil {
				dst.CatalogsRetailProduct = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsRetailProduct = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.CatalogsCreativeAssetsProduct = nil
		dst.CatalogsHotelProduct = nil
		dst.CatalogsRetailProduct = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CatalogsProduct)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CatalogsProduct)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CatalogsProduct) MarshalJSON() ([]byte, error) {
	if src.CatalogsCreativeAssetsProduct != nil {
		return json.Marshal(&src.CatalogsCreativeAssetsProduct)
	}

	if src.CatalogsHotelProduct != nil {
		return json.Marshal(&src.CatalogsHotelProduct)
	}

	if src.CatalogsRetailProduct != nil {
		return json.Marshal(&src.CatalogsRetailProduct)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CatalogsProduct) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.CatalogsCreativeAssetsProduct != nil {
		return obj.CatalogsCreativeAssetsProduct
	}

	if obj.CatalogsHotelProduct != nil {
		return obj.CatalogsHotelProduct
	}

	if obj.CatalogsRetailProduct != nil {
		return obj.CatalogsRetailProduct
	}

	// all schemas are nil
	return nil
}

type NullableCatalogsProduct struct {
	value *CatalogsProduct
	isSet bool
}

func (v NullableCatalogsProduct) Get() *CatalogsProduct {
	return v.value
}

func (v *NullableCatalogsProduct) Set(val *CatalogsProduct) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsProduct) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsProduct) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsProduct(val *CatalogsProduct) *NullableCatalogsProduct {
	return &NullableCatalogsProduct{value: val, isSet: true}
}

func (v NullableCatalogsProduct) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsProduct) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


