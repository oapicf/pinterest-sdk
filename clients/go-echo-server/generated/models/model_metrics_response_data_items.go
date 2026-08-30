package models

type MetricsResponseDataItems struct {

	// Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
	Metrics map[string]interface{} `json:"metrics"`

	// The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
	TargetingType string `json:"targeting_type"`

	// The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
	TargetingValue string `json:"targeting_value"`
}
