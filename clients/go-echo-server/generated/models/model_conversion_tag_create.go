package models

// ConversionTagCreate - Resource create operation model.
type ConversionTagCreate struct {

	// Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	AemDbEnabled *bool `json:"aem_db_enabled,omitempty"`

	// Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	AemEnabled *bool `json:"aem_enabled,omitempty"`

	// Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	AemExternalIdEnabled *bool `json:"aem_external_id_enabled,omitempty"`

	// Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	AemFnlnEnabled *bool `json:"aem_fnln_enabled,omitempty"`

	// Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	AemGeEnabled *bool `json:"aem_ge_enabled,omitempty"`

	// Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	AemLocEnabled *bool `json:"aem_loc_enabled,omitempty"`

	// Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	AemPhEnabled *bool `json:"aem_ph_enabled,omitempty"`

	// Metadata ingestion frequency.
	MdFrequency *float32 `json:"md_frequency,omitempty"`

	// Conversion tag name.
	Name string `json:"name"`
}
