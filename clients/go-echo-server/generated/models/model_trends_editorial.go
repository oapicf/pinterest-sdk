package models

// TrendsEditorial - Information of the published editorial article.
type TrendsEditorial struct {

	// URL of the editorial board
	BoardUrl string `json:"board_url"`

	// Description of the editorial article
	Description string `json:"description"`

	// List of interests related to the editorial article
	Interests []string `json:"interests"`

	// URL of the pins related to the editorial article
	PinsUrl []string `json:"pins_url"`

	// List of keywords related to the editorial article
	RelatedKeywords []KeywordInfo `json:"related_keywords"`

	// Title of the editorial article
	Title string `json:"title"`
}
