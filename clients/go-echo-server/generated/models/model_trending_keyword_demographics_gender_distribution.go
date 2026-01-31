package models

// TrendingKeywordDemographicsGenderDistribution - This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
type TrendingKeywordDemographicsGenderDistribution struct {

	GenderDistribution string `json:"gender_distribution,omitempty"`
}
