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




type SsioAccountResponse struct {

	// Advertiser eligible to create order lines
	Eligible bool `json:"eligible,omitempty"`

	// Advertiser eligible to update order lines
	CanEdit bool `json:"can_edit,omitempty"`

	// An array of Salesforce account information that includes address, io terms, etc.
	BilltoInfos []SsioAccountItem `json:"billto_infos,omitempty"`

	Currency string `json:"currency,omitempty"`

	PmpNames []SsioAccountPmpName `json:"pmp_names,omitempty"`

	// Error indicator from Salesforce which could be \"No Error\"
	Error string `json:"error,omitempty"`
}

// AssertSsioAccountResponseRequired checks if the required fields are not zero-ed
func AssertSsioAccountResponseRequired(obj SsioAccountResponse) error {
	for _, el := range obj.BilltoInfos {
		if err := AssertSsioAccountItemRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.PmpNames {
		if err := AssertSsioAccountPmpNameRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertSsioAccountResponseConstraints checks if the values respects the defined constraints
func AssertSsioAccountResponseConstraints(obj SsioAccountResponse) error {
	return nil
}