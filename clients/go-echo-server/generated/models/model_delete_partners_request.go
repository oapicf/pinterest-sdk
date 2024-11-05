package models

type DeletePartnersRequest struct {

	PartnerIds []string `json:"partner_ids"`

	PartnerType *string `json:"partner_type,omitempty"`
}
