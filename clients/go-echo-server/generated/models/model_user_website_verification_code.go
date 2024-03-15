package models

type UserWebsiteVerificationCode struct {

	// Code to check against the user claiming the website
	VerificationCode string `json:"verification_code,omitempty"`

	// DNS TXT record to check against for the website to be claimed
	DnsTxtRecord string `json:"dns_txt_record,omitempty"`

	// Metatag the verification process searchs for the website to be claimed
	Metatag string `json:"metatag,omitempty"`

	// File expected to find on the website being claimed
	Filename string `json:"filename,omitempty"`

	// A full html file to upload to the website in order for it to be claimed
	FileContent string `json:"file_content,omitempty"`
}
