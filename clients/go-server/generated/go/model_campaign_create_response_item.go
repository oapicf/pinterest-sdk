/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CampaignCreateResponseItem struct {

	Data CampaignCreateResponseData `json:"data,omitempty"`

	Exceptions []Exception `json:"exceptions,omitempty"`
}

// AssertCampaignCreateResponseItemRequired checks if the required fields are not zero-ed
func AssertCampaignCreateResponseItemRequired(obj CampaignCreateResponseItem) error {
	if err := AssertCampaignCreateResponseDataRequired(obj.Data); err != nil {
		return err
	}
	for _, el := range obj.Exceptions {
		if err := AssertExceptionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCampaignCreateResponseItemConstraints checks if the values respects the defined constraints
func AssertCampaignCreateResponseItemConstraints(obj CampaignCreateResponseItem) error {
	return nil
}