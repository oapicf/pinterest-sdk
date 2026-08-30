package models

// TrendsAgeDistribution - This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
type TrendsAgeDistribution struct {

	AgeDistribution TrendsAgeBucket `json:"age_distribution,omitempty"`
}
