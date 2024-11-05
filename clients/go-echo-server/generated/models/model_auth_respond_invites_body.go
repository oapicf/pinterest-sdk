package models

// AuthRespondInvitesBody - An object with a list of all the invites the user would like to respond to and the action to take.
type AuthRespondInvitesBody struct {

	Invites []AuthRespondInvitesBodyInvitesInner `json:"invites"`
}
