package models

type EntityDataChangeHistory struct {

	// A string identifier representing the changed field on the entity
	ChangedFieldId string `json:"changed_field_id,omitempty"`

	// The human readable name of the changed field on the entity
	ChangedFieldName string `json:"changed_field_name,omitempty"`

	// Specifies the type of the field's data values
	DataType ChangeHistoryDataType `json:"data_type,omitempty"`

	// A string representation of the value of the changed field, after the change
	NewDataValue string `json:"new_data_value,omitempty"`

	// A string representation of the value of the changed field, before the change
	OldDataValue string `json:"old_data_value,omitempty"`
}
