package models

type SsioAccountAddress struct {

	// Address display
	Display string `json:"display,omitempty"`

	// Purpose for which the address is used, usually Billing or Businness
	Purpose string `json:"purpose,omitempty"`

	// Salesforce id for address
	AddressId string `json:"address_id,omitempty"`

	// Legal entity for this insertion order
	OrderLegalEntity string `json:"order_legal_entity,omitempty"`
}
