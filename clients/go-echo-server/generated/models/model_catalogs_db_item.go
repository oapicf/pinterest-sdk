package models

import (
	"time"
)

type CatalogsDbItem struct {

	CreatedAt time.Time `json:"created_at"`

	Id string `json:"id"`

	UpdatedAt time.Time `json:"updated_at"`
}
