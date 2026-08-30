package models
// TieBreakerType : Quiz ad tie breaker type, default is RANDOM
type TieBreakerType string

// List of TieBreakerType
const (
	RANDOM TieBreakerType = "RANDOM"
	CUSTOM TieBreakerType = "CUSTOM"
)
