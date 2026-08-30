package models

// BoardCreate - Resource create operation model.
type BoardCreate struct {

	Description *string `json:"description,omitempty"`

	// If set to `true`, the board will be ad-only and can store ad-only Pins.
	IsAdsOnly bool `json:"is_ads_only,omitempty"`

	//     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	Name string `json:"name"`

	//     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
	Privacy BoardPrivacy `json:"privacy,omitempty"`
}
