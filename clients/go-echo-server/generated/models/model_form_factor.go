package models
// FormFactor : Device form factor
type FormFactor string

// List of FormFactor
const (
	DESKTOP FormFactor = "desktop"
	LAPTOP FormFactor = "laptop"
	CELLPHONE FormFactor = "cellphone"
	TABLET FormFactor = "tablet"
	SMARTWATCH FormFactor = "smartwatch"
	TV FormFactor = "tv"
	VR FormFactor = "vr"
	CONSOLE FormFactor = "console"
	OTHER FormFactor = "other"
)
