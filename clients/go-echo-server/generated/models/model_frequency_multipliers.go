package models

// FrequencyMultipliers - This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
type FrequencyMultipliers struct {

	// Impression count identifier.
	IMPRESSION_COUNT string `json:"IMPRESSION_COUNT,omitempty"`
}
