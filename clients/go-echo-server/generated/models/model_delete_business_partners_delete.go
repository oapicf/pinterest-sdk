package models

type DeleteBusinessPartnersDelete struct {

	// A list of partner ids to be deleted
	PartnerIds []string `json:"partner_ids"`

	PartnerType *NullablePartnerType `json:"partner_type,omitempty"`
}
