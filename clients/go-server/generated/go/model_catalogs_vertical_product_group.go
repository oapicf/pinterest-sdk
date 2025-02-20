// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi


import (
	"gopkg.in/validator.v2"
)



type CatalogsVerticalProductGroup struct {

	CatalogType string `json:"catalog_type"`

	// ID of the creative assets product group.
	Id string `json:"id"`

	// Name of creative assets product group
	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Type CatalogsProductGroupType `json:"type,omitempty"`

	Status CatalogsProductGroupStatus `json:"status,omitempty"`

	// Unix timestamp in seconds of when catalog product group was created.
	CreatedAt int32 `json:"created_at,omitempty"`

	// Unix timestamp in seconds of last time catalog product group was updated.
	UpdatedAt int32 `json:"updated_at,omitempty"`

	// Catalog id pertaining to the creative assets product group.
	CatalogId string `json:"catalog_id"`

	// id of the catalogs feed belonging to this catalog product group
	FeedId *string `json:"feed_id"`

	Country *string `json:"country,omitempty"`

	Locale *string `json:"locale,omitempty"`
}

// AssertCatalogsVerticalProductGroupRequired checks if the required fields are not zero-ed
func AssertCatalogsVerticalProductGroupRequired(obj CatalogsVerticalProductGroup) error {
	elements := map[string]interface{}{
		"catalog_type": obj.CatalogType,
		"id": obj.Id,
		"filters": obj.Filters,
		"catalog_id": obj.CatalogId,
		"feed_id": obj.FeedId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertCatalogsCreativeAssetsProductGroupFiltersRequired(obj.Filters); err != nil {
		return err
	}
	return nil
}

// AssertCatalogsVerticalProductGroupConstraints checks if the values respects the defined constraints
func AssertCatalogsVerticalProductGroupConstraints(obj CatalogsVerticalProductGroup) error {
	if err := AssertCatalogsCreativeAssetsProductGroupFiltersConstraints(obj.Filters); err != nil {
		return err
	}
	return nil
}
