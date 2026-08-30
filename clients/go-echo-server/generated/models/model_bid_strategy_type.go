package models
// BidStrategyType : Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
type BidStrategyType string

// List of BidStrategyType
const (
	AUTOMATIC_BID BidStrategyType = "AUTOMATIC_BID"
	MAX_BID BidStrategyType = "MAX_BID"
	TARGET_AVG BidStrategyType = "TARGET_AVG"
)
