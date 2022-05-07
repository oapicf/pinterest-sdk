package models

import (
	"time"
)

type CatalogsDbItem struct {

	CreatedAt time.Time `json:"created_at,omitempty"`

	Id string `json:"id,omitempty"`

	UpdatedAt time.Time `json:"updated_at,omitempty"`
}
