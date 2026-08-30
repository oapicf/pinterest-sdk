package models
// HttpMethod : HTTP request method.
type HttpMethod string

// List of HttpMethod
const (
	GET HttpMethod = "GET"
	HEAD HttpMethod = "HEAD"
	POST HttpMethod = "POST"
	PUT HttpMethod = "PUT"
	DELETE HttpMethod = "DELETE"
	CONNECT HttpMethod = "CONNECT"
	OPTIONS HttpMethod = "OPTIONS"
	TRACE HttpMethod = "TRACE"
	PATCH HttpMethod = "PATCH"
)
