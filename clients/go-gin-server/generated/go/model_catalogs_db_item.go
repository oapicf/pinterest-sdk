/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"time"
)

type CatalogsDbItem struct {

	CreatedAt time.Time `json:"created_at,omitempty"`

	Id string `json:"id,omitempty"`

	UpdatedAt time.Time `json:"updated_at,omitempty"`
}