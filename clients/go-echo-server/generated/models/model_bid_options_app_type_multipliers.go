package models

// BidOptionsAppTypeMultipliers - This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
type BidOptionsAppTypeMultipliers struct {

	AndroidMobile float32 `json:"android_mobile,omitempty"`

	AndroidTablet float32 `json:"android_tablet,omitempty"`

	Ipad float32 `json:"ipad,omitempty"`

	Iphone float32 `json:"iphone,omitempty"`

	Web float32 `json:"web,omitempty"`

	WebMobile float32 `json:"web_mobile,omitempty"`
}
