package models

type RelatedTerms struct {

	// First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
	Id string `json:"id,omitempty"`

	// Total number of related terms returned
	RelatedTermCount int32 `json:"related_term_count,omitempty"`

	// The id of the advertiser.
	RelatedTermsList []RelatedTermsRelatedTermsListInner `json:"related_terms_list,omitempty"`
}
