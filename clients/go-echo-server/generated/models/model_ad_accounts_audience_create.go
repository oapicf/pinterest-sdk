package models

// AdAccountsAudienceCreate - Resource create operation model.
type AdAccountsAudienceCreate struct {

	// Ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\d+$"`

	// [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
	AudienceType AudienceType `json:"audience_type,omitempty"`

	// Audience description.
	Description *string `json:"description,omitempty"`

	// Audience name.
	Name string `json:"name,omitempty"`

	Rule AdAccountsAudienceRule `json:"rule,omitempty"`
}
