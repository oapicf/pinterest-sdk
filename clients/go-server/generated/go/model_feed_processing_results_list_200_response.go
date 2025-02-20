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




type FeedProcessingResultsList200Response struct {

	Items []CatalogsFeedProcessingResult `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}

// AssertFeedProcessingResultsList200ResponseRequired checks if the required fields are not zero-ed
func AssertFeedProcessingResultsList200ResponseRequired(obj FeedProcessingResultsList200Response) error {
	elements := map[string]interface{}{
		"items": obj.Items,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Items {
		if err := AssertCatalogsFeedProcessingResultRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertFeedProcessingResultsList200ResponseConstraints checks if the values respects the defined constraints
func AssertFeedProcessingResultsList200ResponseConstraints(obj FeedProcessingResultsList200Response) error {
	for _, el := range obj.Items {
		if err := AssertCatalogsFeedProcessingResultConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
