package models

type IntegrationsLogsPost400Response struct {

	Code int32 `json:"code"`

	Message string `json:"message"`

	Details map[string]interface{} `json:"details"`
}
