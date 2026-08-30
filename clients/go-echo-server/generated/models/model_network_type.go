package models
// NetworkType : Type of network connection.
type NetworkType string

// List of NetworkType
const (
	WIFI NetworkType = "wifi"
	CELLULAR_2G NetworkType = "cellular_2g"
	CELLULAR_3G NetworkType = "cellular_3g"
	CELLULAR_4G NetworkType = "cellular_4g"
	CELLULAR_5G NetworkType = "cellular_5g"
	CELLULAR_6G NetworkType = "cellular_6g"
	ETHERNET NetworkType = "ethernet"
	UNKNOWN NetworkType = "unknown"
)
