package models

type CampaignObjectivesFilter struct {

	// List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
	CampaignObjectiveTypes []ObjectiveType `json:"campaign_objective_types,omitempty"`
}
