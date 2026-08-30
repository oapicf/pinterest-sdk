package models
// SsioOrderLineType : The type of an SSIO order line.
type SsioOrderLineType string

// List of SsioOrderLineType
const (
	BUDGET SsioOrderLineType = "BUDGET"
	PERPETUALS SsioOrderLineType = "PERPETUALS"
)
