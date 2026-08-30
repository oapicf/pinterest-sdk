package models
// OsFamily : Operating system family.
type OsFamily string

// List of OsFamily
const (
	IOS OsFamily = "ios"
	ANDROID OsFamily = "android"
	MACOS OsFamily = "macos"
	WINDOWS OsFamily = "windows"
	LINUX OsFamily = "linux"
	BSD OsFamily = "bsd"
	OTHER OsFamily = "other"
)
