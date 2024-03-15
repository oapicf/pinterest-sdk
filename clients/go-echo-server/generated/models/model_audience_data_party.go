package models
// AudienceDataParty : Whether the data is owned by the partner (1p) or by the data provider (3p)
type AudienceDataParty string

// List of AudienceDataParty
const (
	_1P AudienceDataParty = "1p"
	_3P AudienceDataParty = "3p"
)
