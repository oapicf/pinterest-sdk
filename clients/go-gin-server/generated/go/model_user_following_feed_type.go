/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// UserFollowingFeedType : Specifies the type of followees to be kept when filtering them.
type UserFollowingFeedType string

// List of UserFollowingFeedType
const (
	ALL UserFollowingFeedType = "ALL"
	RANKED UserFollowingFeedType = "RANKED"
	CREATOR_ONLY UserFollowingFeedType = "CREATOR_ONLY"
	RANKED_CREATOR_ONLY UserFollowingFeedType = "RANKED_CREATOR_ONLY"
)
