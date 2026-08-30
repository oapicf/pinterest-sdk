package models
// OptimizationType : Optimization type for ad group delivery estimates. Supported types vary by objective.
type OptimizationType string

// List of OptimizationType
const (
	CLICKTHROUGH OptimizationType = "CLICKTHROUGH"
	IMPRESSION OptimizationType = "IMPRESSION"
	WEB_CONVERSION OptimizationType = "WEB_CONVERSION"
	ROAS OptimizationType = "ROAS"
	OUTBOUND_CLICK OptimizationType = "OUTBOUND_CLICK"
)
