package models

// SsioAccountAddress - Salesforce address information.
type SsioAccountAddress struct {

	// Salesforce id for address
	AddressId string `json:"address_id,omitempty"`

	// Address display
	Display string `json:"display,omitempty"`

	// Legal entity for this insertion order
	OrderLegalEntity string `json:"order_legal_entity,omitempty"`

	// Purpose for which the address is used, usually Billing or Businness
	Purpose string `json:"purpose,omitempty"`
}
