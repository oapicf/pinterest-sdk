package models

type Audience struct {

	// Ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\d+$"`

	// [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
	AudienceType PinnerListType `json:"audience_type,omitempty"`

	// The company that created this audience.
	CreatedByCompanyName *string `json:"created_by_company_name,omitempty"`

	// Creation time. Unix timestamp in seconds.
	CreatedTimestamp *int32 `json:"created_timestamp,omitempty"`

	// Audience description.
	Description *string `json:"description,omitempty"`

	// Audience ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	// Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
	IsNca bool `json:"is_nca,omitempty"`

	// Audience name.
	Name string `json:"name,omitempty"`

	Rule AudienceRule `json:"rule,omitempty"`

	// Audience size.
	Size *int32 `json:"size,omitempty"`

	// Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
	Status AudienceStatus `json:"status,omitempty"`

	// Always \"audience\".
	Type string `json:"type,omitempty"`

	// Last update time. Unix timestamp in seconds.
	UpdatedTimestamp *int32 `json:"updated_timestamp,omitempty"`
}
