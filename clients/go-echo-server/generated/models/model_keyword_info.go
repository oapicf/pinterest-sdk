package models

// KeywordInfo - Related Keyword information of the editorial article
type KeywordInfo struct {

	// Keyword Name
	Name string `json:"name"`

	// MoM growth as a percentage, if there is no growth rate, this field is not present
	PctGrowthMom float32 `json:"pct_growth_mom,omitempty"`
}
