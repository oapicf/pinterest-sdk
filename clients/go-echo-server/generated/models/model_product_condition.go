package models

type ProductCondition string

// List of ProductCondition
const (
	NEW ProductCondition = "NEW"
	USED ProductCondition = "USED"
	REFURBISHED ProductCondition = "REFURBISHED"
)
