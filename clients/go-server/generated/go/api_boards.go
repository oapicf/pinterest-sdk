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
	"reflect"

	"github.com/gorilla/mux"
)

// BoardsAPIController binds http requests to an api service and writes the service results to the http response
type BoardsAPIController struct {
	service BoardsAPIServicer
	errorHandler ErrorHandler
}

// BoardsAPIOption for how the controller is set up.
type BoardsAPIOption func(*BoardsAPIController)

// WithBoardsAPIErrorHandler inject ErrorHandler into controller
func WithBoardsAPIErrorHandler(h ErrorHandler) BoardsAPIOption {
	return func(c *BoardsAPIController) {
		c.errorHandler = h
	}
}

// NewBoardsAPIController creates a default api controller
func NewBoardsAPIController(s BoardsAPIServicer, opts ...BoardsAPIOption) *BoardsAPIController {
	controller := &BoardsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BoardsAPIController
func (c *BoardsAPIController) Routes() Routes {
	return Routes{
		"BoardsList": Route{
			strings.ToUpper("Get"),
			"/v5/boards",
			c.BoardsList,
		},
		"BoardsCreate": Route{
			strings.ToUpper("Post"),
			"/v5/boards",
			c.BoardsCreate,
		},
		"BoardsGet": Route{
			strings.ToUpper("Get"),
			"/v5/boards/{board_id}",
			c.BoardsGet,
		},
		"BoardsDelete": Route{
			strings.ToUpper("Delete"),
			"/v5/boards/{board_id}",
			c.BoardsDelete,
		},
		"BoardsUpdate": Route{
			strings.ToUpper("Patch"),
			"/v5/boards/{board_id}",
			c.BoardsUpdate,
		},
		"BoardsListPins": Route{
			strings.ToUpper("Get"),
			"/v5/boards/{board_id}/pins",
			c.BoardsListPins,
		},
		"BoardSectionsList": Route{
			strings.ToUpper("Get"),
			"/v5/boards/{board_id}/sections",
			c.BoardSectionsList,
		},
		"BoardSectionsCreate": Route{
			strings.ToUpper("Post"),
			"/v5/boards/{board_id}/sections",
			c.BoardSectionsCreate,
		},
		"BoardSectionsDelete": Route{
			strings.ToUpper("Delete"),
			"/v5/boards/{board_id}/sections/{section_id}",
			c.BoardSectionsDelete,
		},
		"BoardSectionsUpdate": Route{
			strings.ToUpper("Patch"),
			"/v5/boards/{board_id}/sections/{section_id}",
			c.BoardSectionsUpdate,
		},
		"BoardSectionsListPins": Route{
			strings.ToUpper("Get"),
			"/v5/boards/{board_id}/sections/{section_id}/pins",
			c.BoardSectionsListPins,
		},
	}
}

// BoardsList - List boards
func (c *BoardsAPIController) BoardsList(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
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
	var privacyParam string
	if query.Has("privacy") {
		param := query.Get("privacy")

		privacyParam = param
	} else {
	}
	result, err := c.service.BoardsList(r.Context(), adAccountIdParam, bookmarkParam, pageSizeParam, privacyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardsCreate - Create board
func (c *BoardsAPIController) BoardsCreate(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardParam := Board{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&boardParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertBoardRequired(boardParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertBoardConstraints(boardParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.BoardsCreate(r.Context(), boardParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardsGet - Get board
func (c *BoardsAPIController) BoardsGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.BoardsGet(r.Context(), boardIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardsDelete - Delete board
func (c *BoardsAPIController) BoardsDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.BoardsDelete(r.Context(), boardIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardsUpdate - Update board
func (c *BoardsAPIController) BoardsUpdate(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
		return
	}
	boardUpdateParam := BoardUpdate{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&boardUpdateParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertBoardUpdateRequired(boardUpdateParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertBoardUpdateConstraints(boardUpdateParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.BoardsUpdate(r.Context(), boardIdParam, boardUpdateParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardsListPins - List Pins on board
func (c *BoardsAPIController) BoardsListPins(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
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
	var creativeTypesParam []string
	if query.Has("creative_types") {
		creativeTypesParam = strings.Split(query.Get("creative_types"), ",")
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	var pinMetricsParam bool
	if query.Has("pin_metrics") {
		param, err := parseBoolParameter(
			query.Get("pin_metrics"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "pin_metrics", Err: err}, nil)
			return
		}

		pinMetricsParam = param
	} else {
		var param bool = false
		pinMetricsParam = param
	}
	result, err := c.service.BoardsListPins(r.Context(), boardIdParam, bookmarkParam, pageSizeParam, creativeTypesParam, adAccountIdParam, pinMetricsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardSectionsList - List board sections
func (c *BoardsAPIController) BoardSectionsList(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
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
	result, err := c.service.BoardSectionsList(r.Context(), boardIdParam, adAccountIdParam, bookmarkParam, pageSizeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardSectionsCreate - Create board section
func (c *BoardsAPIController) BoardSectionsCreate(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
		return
	}
	boardSectionParam := BoardSection{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&boardSectionParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertBoardSectionRequired(boardSectionParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertBoardSectionConstraints(boardSectionParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.BoardSectionsCreate(r.Context(), boardIdParam, boardSectionParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardSectionsDelete - Delete board section
func (c *BoardsAPIController) BoardSectionsDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
		return
	}
	sectionIdParam := params["section_id"]
	if sectionIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"section_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.BoardSectionsDelete(r.Context(), boardIdParam, sectionIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardSectionsUpdate - Update board section
func (c *BoardsAPIController) BoardSectionsUpdate(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
		return
	}
	sectionIdParam := params["section_id"]
	if sectionIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"section_id"}, nil)
		return
	}
	boardSectionParam := BoardSection{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&boardSectionParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertBoardSectionRequired(boardSectionParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertBoardSectionConstraints(boardSectionParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.BoardSectionsUpdate(r.Context(), boardIdParam, sectionIdParam, boardSectionParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// BoardSectionsListPins - List Pins on board section
func (c *BoardsAPIController) BoardSectionsListPins(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	boardIdParam := params["board_id"]
	if boardIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"board_id"}, nil)
		return
	}
	sectionIdParam := params["section_id"]
	if sectionIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"section_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
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
	result, err := c.service.BoardSectionsListPins(r.Context(), boardIdParam, sectionIdParam, adAccountIdParam, bookmarkParam, pageSizeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
