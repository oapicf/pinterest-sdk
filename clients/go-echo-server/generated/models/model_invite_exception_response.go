package models

// InviteExceptionResponse - An exception object if there is an error performing the action. Will only be provided if there is an error.
type InviteExceptionResponse struct {

	// Error code associated with the error in performing the action on the invite/request.
	Code int32 `json:"code,omitempty"`

	// Unique identifier of the invite/request.
	InviteOrRequestId *string `json:"invite_or_request_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Error message associated with the error in performing the action on the invite/request.
	Message string `json:"message,omitempty"`

	// A list of users' usernames or emails OR a list of partner ids that caused the error.
	UsersOrPartnerIds *[]string `json:"users_or_partner_ids,omitempty"`
}
