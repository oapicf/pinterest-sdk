package models

type FollowUserRequest struct {

	// Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
	AutoFollow bool `json:"auto_follow,omitempty"`
}
