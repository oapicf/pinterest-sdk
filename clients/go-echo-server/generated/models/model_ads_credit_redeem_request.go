package models

type AdsCreditRedeemRequest struct {

	// Takes in a SHA256 hash of the offerCode.
	OfferCodeHash string `json:"offerCodeHash" validate:"regexp=^[a-z0-9]*$"`

	// If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
	ValidateOnly bool `json:"validateOnly"`
}
