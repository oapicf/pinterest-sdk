package models

type UpdatePartnerResultsResponseArrayItemsInner struct {

	Exception *BusinessAccessError `json:"exception,omitempty"`

	MemberOrPartnerId *string `json:"member_or_partner_id,omitempty" validate:"regexp=^\\\\d+$"`
}
