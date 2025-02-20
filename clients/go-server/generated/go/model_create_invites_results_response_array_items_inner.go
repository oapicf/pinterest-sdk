// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type CreateInvitesResultsResponseArrayItemsInner struct {

	Exception *InviteExceptionResponse `json:"exception,omitempty"`

	Invite *CreateInvitesResultsResponseArrayItemsInnerInvite `json:"invite,omitempty"`
}

// AssertCreateInvitesResultsResponseArrayItemsInnerRequired checks if the required fields are not zero-ed
func AssertCreateInvitesResultsResponseArrayItemsInnerRequired(obj CreateInvitesResultsResponseArrayItemsInner) error {
	if obj.Exception != nil {
		if err := AssertInviteExceptionResponseRequired(*obj.Exception); err != nil {
			return err
		}
	}
	if obj.Invite != nil {
		if err := AssertCreateInvitesResultsResponseArrayItemsInnerInviteRequired(*obj.Invite); err != nil {
			return err
		}
	}
	return nil
}

// AssertCreateInvitesResultsResponseArrayItemsInnerConstraints checks if the values respects the defined constraints
func AssertCreateInvitesResultsResponseArrayItemsInnerConstraints(obj CreateInvitesResultsResponseArrayItemsInner) error {
    if obj.Exception != nil {
     	if err := AssertInviteExceptionResponseConstraints(*obj.Exception); err != nil {
     		return err
     	}
    }
    if obj.Invite != nil {
     	if err := AssertCreateInvitesResultsResponseArrayItemsInnerInviteConstraints(*obj.Invite); err != nil {
     		return err
     	}
    }
	return nil
}
