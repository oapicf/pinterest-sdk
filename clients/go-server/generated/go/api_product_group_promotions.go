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

// ProductGroupPromotionsAPIController binds http requests to an api service and writes the service results to the http response
type ProductGroupPromotionsAPIController struct {
	service ProductGroupPromotionsAPIServicer
	errorHandler ErrorHandler
}

// ProductGroupPromotionsAPIOption for how the controller is set up.
type ProductGroupPromotionsAPIOption func(*ProductGroupPromotionsAPIController)

// WithProductGroupPromotionsAPIErrorHandler inject ErrorHandler into controller
func WithProductGroupPromotionsAPIErrorHandler(h ErrorHandler) ProductGroupPromotionsAPIOption {
	return func(c *ProductGroupPromotionsAPIController) {
		c.errorHandler = h
	}
}

// NewProductGroupPromotionsAPIController creates a default api controller
func NewProductGroupPromotionsAPIController(s ProductGroupPromotionsAPIServicer, opts ...ProductGroupPromotionsAPIOption) *ProductGroupPromotionsAPIController {
	controller := &ProductGroupPromotionsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ProductGroupPromotionsAPIController
func (c *ProductGroupPromotionsAPIController) Routes() Routes {
	return Routes{
		"ProductGroupPromotionsList": Route{
			strings.ToUpper("Get"),
			"/v5/ad_accounts/{ad_account_id}/product_group_promotions",
			c.ProductGroupPromotionsList,
		},
		"ProductGroupPromotionsCreate": Route{
			strings.ToUpper("Post"),
			"/v5/ad_accounts/{ad_account_id}/product_group_promotions",
			c.ProductGroupPromotionsCreate,
		},
		"ProductGroupPromotionsUpdate": Route{
			strings.ToUpper("Patch"),
			"/v5/ad_accounts/{ad_account_id}/product_group_promotions",
			c.ProductGroupPromotionsUpdate,
		},
		"ProductGroupPromotionsGet": Route{
			strings.ToUpper("Get"),
			"/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}",
			c.ProductGroupPromotionsGet,
		},
		"ProductGroupsAnalytics": Route{
			strings.ToUpper("Get"),
			"/v5/ad_accounts/{ad_account_id}/product_groups/analytics",
			c.ProductGroupsAnalytics,
		},
	}
}

// ProductGroupPromotionsList - Get product group promotions
func (c *ProductGroupPromotionsAPIController) ProductGroupPromotionsList(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	adAccountIdParam := params["ad_account_id"]
	if adAccountIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"ad_account_id"}, nil)
		return
	}
	var productGroupPromotionIdsParam []string
	if query.Has("product_group_promotion_ids") {
		productGroupPromotionIdsParam = strings.Split(query.Get("product_group_promotion_ids"), ",")
	}
	var entityStatusesParam []string
	if query.Has("entity_statuses") {
		entityStatusesParam = strings.Split(query.Get("entity_statuses"), ",")
	}
	var adGroupIdParam string
	if query.Has("ad_group_id") {
		param := query.Get("ad_group_id")

		adGroupIdParam = param
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
	var orderParam string
	if query.Has("order") {
		param := query.Get("order")

		orderParam = param
	} else {
	}
	var bookmarkParam string
	if query.Has("bookmark") {
		param := query.Get("bookmark")

		bookmarkParam = param
	} else {
	}
	result, err := c.service.ProductGroupPromotionsList(r.Context(), adAccountIdParam, productGroupPromotionIdsParam, entityStatusesParam, adGroupIdParam, pageSizeParam, orderParam, bookmarkParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProductGroupPromotionsCreate - Create product group promotions
func (c *ProductGroupPromotionsAPIController) ProductGroupPromotionsCreate(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	adAccountIdParam := params["ad_account_id"]
	if adAccountIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"ad_account_id"}, nil)
		return
	}
	productGroupPromotionCreateRequestParam := ProductGroupPromotionCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&productGroupPromotionCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertProductGroupPromotionCreateRequestRequired(productGroupPromotionCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertProductGroupPromotionCreateRequestConstraints(productGroupPromotionCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ProductGroupPromotionsCreate(r.Context(), adAccountIdParam, productGroupPromotionCreateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProductGroupPromotionsUpdate - Update product group promotions
func (c *ProductGroupPromotionsAPIController) ProductGroupPromotionsUpdate(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	adAccountIdParam := params["ad_account_id"]
	if adAccountIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"ad_account_id"}, nil)
		return
	}
	productGroupPromotionUpdateRequestParam := ProductGroupPromotionUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&productGroupPromotionUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertProductGroupPromotionUpdateRequestRequired(productGroupPromotionUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertProductGroupPromotionUpdateRequestConstraints(productGroupPromotionUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ProductGroupPromotionsUpdate(r.Context(), adAccountIdParam, productGroupPromotionUpdateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProductGroupPromotionsGet - Get a product group promotion by id
func (c *ProductGroupPromotionsAPIController) ProductGroupPromotionsGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	adAccountIdParam := params["ad_account_id"]
	if adAccountIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"ad_account_id"}, nil)
		return
	}
	productGroupPromotionIdParam := params["product_group_promotion_id"]
	if productGroupPromotionIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"product_group_promotion_id"}, nil)
		return
	}
	result, err := c.service.ProductGroupPromotionsGet(r.Context(), adAccountIdParam, productGroupPromotionIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProductGroupsAnalytics - Get product group analytics
func (c *ProductGroupPromotionsAPIController) ProductGroupsAnalytics(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	adAccountIdParam := params["ad_account_id"]
	if adAccountIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"ad_account_id"}, nil)
		return
	}
	var startDateParam string
	if query.Has("start_date") {
		param := string(query.Get("start_date"))

		startDateParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "start_date"}, nil)
		return
	}
	var endDateParam string
	if query.Has("end_date") {
		param := string(query.Get("end_date"))

		endDateParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "end_date"}, nil)
		return
	}
	var productGroupIdsParam []string
	if query.Has("product_group_ids") {
		productGroupIdsParam = strings.Split(query.Get("product_group_ids"), ",")
	}
	var columnsParam []string
	if query.Has("columns") {
		columnsParam = strings.Split(query.Get("columns"), ",")
	}
	var granularityParam Granularity
	if query.Has("granularity") {
		param := Granularity(query.Get("granularity"))

		granularityParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "granularity"}, nil)
		return
	}
	var clickWindowDaysParam int32
	if query.Has("click_window_days") {
		param, err := parseNumericParameter[int32](
			query.Get("click_window_days"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "click_window_days", Err: err}, nil)
			return
		}

		clickWindowDaysParam = param
	} else {
		var param int32 = 30
		clickWindowDaysParam = param
	}
	var engagementWindowDaysParam int32
	if query.Has("engagement_window_days") {
		param, err := parseNumericParameter[int32](
			query.Get("engagement_window_days"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "engagement_window_days", Err: err}, nil)
			return
		}

		engagementWindowDaysParam = param
	} else {
		var param int32 = 30
		engagementWindowDaysParam = param
	}
	var viewWindowDaysParam int32
	if query.Has("view_window_days") {
		param, err := parseNumericParameter[int32](
			query.Get("view_window_days"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "view_window_days", Err: err}, nil)
			return
		}

		viewWindowDaysParam = param
	} else {
		var param int32 = 1
		viewWindowDaysParam = param
	}
	var conversionReportTimeParam string
	if query.Has("conversion_report_time") {
		param := query.Get("conversion_report_time")

		conversionReportTimeParam = param
	} else {
		param := "TIME_OF_AD_ACTION"
		conversionReportTimeParam = param
	}
	result, err := c.service.ProductGroupsAnalytics(r.Context(), adAccountIdParam, startDateParam, endDateParam, productGroupIdsParam, columnsParam, granularityParam, clickWindowDaysParam, engagementWindowDaysParam, viewWindowDaysParam, conversionReportTimeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
