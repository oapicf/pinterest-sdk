package models

type LeadFormCreateRequest struct {

	// Internal name of the lead form.
	Name *string `json:"name"`

	// A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
	PrivacyPolicyLink *string `json:"privacy_policy_link"`

	// Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
	HasAcceptedTerms bool `json:"has_accepted_terms"`

	// A message for people who complete the form to let them know what happens next.
	CompletionMessage *string `json:"completion_message"`

	Status LeadFormStatus `json:"status,omitempty"`

	// Additional disclosure language to be included in the lead form.
	DisclosureLanguage *string `json:"disclosure_language,omitempty"`

	// List of questions to be displayed on the lead form.
	Questions []LeadFormQuestion `json:"questions"`

	// List of additional policy links to be displayed on the lead form.
	PolicyLinks []LeadFormCommonPolicyLinksInner `json:"policy_links,omitempty"`
}
