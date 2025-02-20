// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// IntegrationsAPIController binds http requests to an api service and writes the service results to the http response
type IntegrationsAPIController struct {
	service IntegrationsAPIServicer
	errorHandler ErrorHandler
}

// IntegrationsAPIOption for how the controller is set up.
type IntegrationsAPIOption func(*IntegrationsAPIController)

// WithIntegrationsAPIErrorHandler inject ErrorHandler into controller
func WithIntegrationsAPIErrorHandler(h ErrorHandler) IntegrationsAPIOption {
	return func(c *IntegrationsAPIController) {
		c.errorHandler = h
	}
}

// NewIntegrationsAPIController creates a default api controller
func NewIntegrationsAPIController(s IntegrationsAPIServicer, opts ...IntegrationsAPIOption) *IntegrationsAPIController {
	controller := &IntegrationsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the IntegrationsAPIController
func (c *IntegrationsAPIController) Routes() Routes {
	return Routes{
		"IntegrationsCommercePost": Route{
			strings.ToUpper("Post"),
			"/v5/integrations/commerce",
			c.IntegrationsCommercePost,
		},
		"IntegrationsCommerceGet": Route{
			strings.ToUpper("Get"),
			"/v5/integrations/commerce/{external_business_id}",
			c.IntegrationsCommerceGet,
		},
		"IntegrationsCommerceDel": Route{
			strings.ToUpper("Delete"),
			"/v5/integrations/commerce/{external_business_id}",
			c.IntegrationsCommerceDel,
		},
		"IntegrationsCommercePatch": Route{
			strings.ToUpper("Patch"),
			"/v5/integrations/commerce/{external_business_id}",
			c.IntegrationsCommercePatch,
		},
		"IntegrationsLogsPost": Route{
			strings.ToUpper("Post"),
			"/v5/integrations/logs",
			c.IntegrationsLogsPost,
		},
		"IntegrationsGetList": Route{
			strings.ToUpper("Get"),
			"/v5/integrations",
			c.IntegrationsGetList,
		},
		"IntegrationsGetById": Route{
			strings.ToUpper("Get"),
			"/v5/integrations/{id}",
			c.IntegrationsGetById,
		},
	}
}

// IntegrationsCommercePost - Create commerce integration
func (c *IntegrationsAPIController) IntegrationsCommercePost(w http.ResponseWriter, r *http.Request) {
	integrationRequestParam := IntegrationRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&integrationRequestParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertIntegrationRequestRequired(integrationRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertIntegrationRequestConstraints(integrationRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.IntegrationsCommercePost(r.Context(), integrationRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// IntegrationsCommerceGet - Get commerce integration
func (c *IntegrationsAPIController) IntegrationsCommerceGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	externalBusinessIdParam := params["external_business_id"]
	if externalBusinessIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"external_business_id"}, nil)
		return
	}
	result, err := c.service.IntegrationsCommerceGet(r.Context(), externalBusinessIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// IntegrationsCommerceDel - Delete commerce integration
func (c *IntegrationsAPIController) IntegrationsCommerceDel(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	externalBusinessIdParam := params["external_business_id"]
	if externalBusinessIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"external_business_id"}, nil)
		return
	}
	result, err := c.service.IntegrationsCommerceDel(r.Context(), externalBusinessIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// IntegrationsCommercePatch - Update commerce integration
func (c *IntegrationsAPIController) IntegrationsCommercePatch(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	externalBusinessIdParam := params["external_business_id"]
	if externalBusinessIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"external_business_id"}, nil)
		return
	}
	integrationRequestPatchParam := IntegrationRequestPatch{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&integrationRequestPatchParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertIntegrationRequestPatchRequired(integrationRequestPatchParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertIntegrationRequestPatchConstraints(integrationRequestPatchParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.IntegrationsCommercePatch(r.Context(), externalBusinessIdParam, integrationRequestPatchParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// IntegrationsLogsPost - Receives batched logs from integration applications.
func (c *IntegrationsAPIController) IntegrationsLogsPost(w http.ResponseWriter, r *http.Request) {
	integrationLogsRequestParam := IntegrationLogsRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&integrationLogsRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertIntegrationLogsRequestRequired(integrationLogsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertIntegrationLogsRequestConstraints(integrationLogsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.IntegrationsLogsPost(r.Context(), integrationLogsRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// IntegrationsGetList - Get integration metadata list
func (c *IntegrationsAPIController) IntegrationsGetList(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var bookmarkParam string
	if query.Has("bookmark") {
		param := query.Get("bookmark")

		bookmarkParam = param
	} else {
	}
	var pageSizeParam int32
	if query.Has("page_size") {
		param, err := parseNumericParameter[int32](
			query.Get("page_size"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1),
			WithMaximum[int32](250),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "page_size", Err: err}, nil)
			return
		}

		pageSizeParam = param
	} else {
		var param int32 = 25
		pageSizeParam = param
	}
	result, err := c.service.IntegrationsGetList(r.Context(), bookmarkParam, pageSizeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// IntegrationsGetById - Get integration metadata
func (c *IntegrationsAPIController) IntegrationsGetById(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.IntegrationsGetById(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
