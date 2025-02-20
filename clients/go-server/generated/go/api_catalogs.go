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

// CatalogsAPIController binds http requests to an api service and writes the service results to the http response
type CatalogsAPIController struct {
	service CatalogsAPIServicer
	errorHandler ErrorHandler
}

// CatalogsAPIOption for how the controller is set up.
type CatalogsAPIOption func(*CatalogsAPIController)

// WithCatalogsAPIErrorHandler inject ErrorHandler into controller
func WithCatalogsAPIErrorHandler(h ErrorHandler) CatalogsAPIOption {
	return func(c *CatalogsAPIController) {
		c.errorHandler = h
	}
}

// NewCatalogsAPIController creates a default api controller
func NewCatalogsAPIController(s CatalogsAPIServicer, opts ...CatalogsAPIOption) *CatalogsAPIController {
	controller := &CatalogsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the CatalogsAPIController
func (c *CatalogsAPIController) Routes() Routes {
	return Routes{
		"CatalogsList": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs",
			c.CatalogsList,
		},
		"CatalogsCreate": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs",
			c.CatalogsCreate,
		},
		"FeedsList": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/feeds",
			c.FeedsList,
		},
		"FeedsCreate": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs/feeds",
			c.FeedsCreate,
		},
		"FeedsGet": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/feeds/{feed_id}",
			c.FeedsGet,
		},
		"FeedsDelete": Route{
			strings.ToUpper("Delete"),
			"/v5/catalogs/feeds/{feed_id}",
			c.FeedsDelete,
		},
		"FeedsUpdate": Route{
			strings.ToUpper("Patch"),
			"/v5/catalogs/feeds/{feed_id}",
			c.FeedsUpdate,
		},
		"FeedsIngest": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs/feeds/{feed_id}/ingest",
			c.FeedsIngest,
		},
		"FeedProcessingResultsList": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/feeds/{feed_id}/processing_results",
			c.FeedProcessingResultsList,
		},
		"ItemsIssuesList": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/processing_results/{processing_result_id}/item_issues",
			c.ItemsIssuesList,
		},
		"ItemsGet": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/items",
			c.ItemsGet,
		},
		"ItemsPost": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs/items",
			c.ItemsPost,
		},
		"ItemsBatchPost": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs/items/batch",
			c.ItemsBatchPost,
		},
		"ItemsBatchGet": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/items/batch/{batch_id}",
			c.ItemsBatchGet,
		},
		"CatalogsProductGroupsCreateMany": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs/product_groups/multiple",
			c.CatalogsProductGroupsCreateMany,
		},
		"CatalogsProductGroupsDeleteMany": Route{
			strings.ToUpper("Delete"),
			"/v5/catalogs/product_groups/multiple",
			c.CatalogsProductGroupsDeleteMany,
		},
		"CatalogsProductGroupsList": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/product_groups",
			c.CatalogsProductGroupsList,
		},
		"CatalogsProductGroupsCreate": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs/product_groups",
			c.CatalogsProductGroupsCreate,
		},
		"CatalogsProductGroupsGet": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/product_groups/{product_group_id}",
			c.CatalogsProductGroupsGet,
		},
		"CatalogsProductGroupsDelete": Route{
			strings.ToUpper("Delete"),
			"/v5/catalogs/product_groups/{product_group_id}",
			c.CatalogsProductGroupsDelete,
		},
		"CatalogsProductGroupsUpdate": Route{
			strings.ToUpper("Patch"),
			"/v5/catalogs/product_groups/{product_group_id}",
			c.CatalogsProductGroupsUpdate,
		},
		"CatalogsProductGroupsProductCountsGet": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/product_groups/{product_group_id}/product_counts",
			c.CatalogsProductGroupsProductCountsGet,
		},
		"CatalogsProductGroupPinsList": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/product_groups/{product_group_id}/products",
			c.CatalogsProductGroupPinsList,
		},
		"ProductsByProductGroupFilterList": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs/products/get_by_product_group_filters",
			c.ProductsByProductGroupFilterList,
		},
		"ReportsGet": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/reports",
			c.ReportsGet,
		},
		"ReportsCreate": Route{
			strings.ToUpper("Post"),
			"/v5/catalogs/reports",
			c.ReportsCreate,
		},
		"ReportsStats": Route{
			strings.ToUpper("Get"),
			"/v5/catalogs/reports/stats",
			c.ReportsStats,
		},
	}
}

// CatalogsList - List catalogs
func (c *CatalogsAPIController) CatalogsList(w http.ResponseWriter, r *http.Request) {
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
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsList(r.Context(), bookmarkParam, pageSizeParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsCreate - Create catalog
func (c *CatalogsAPIController) CatalogsCreate(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	catalogsCreateRequestParam := CatalogsCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&catalogsCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCatalogsCreateRequestRequired(catalogsCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCatalogsCreateRequestConstraints(catalogsCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsCreate(r.Context(), catalogsCreateRequestParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// FeedsList - List feeds
func (c *CatalogsAPIController) FeedsList(w http.ResponseWriter, r *http.Request) {
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
	var catalogIdParam string
	if query.Has("catalog_id") {
		param := query.Get("catalog_id")

		catalogIdParam = param
	} else {
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.FeedsList(r.Context(), bookmarkParam, pageSizeParam, catalogIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// FeedsCreate - Create feed
func (c *CatalogsAPIController) FeedsCreate(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	feedsCreateRequestParam := FeedsCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&feedsCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertFeedsCreateRequestRequired(feedsCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertFeedsCreateRequestConstraints(feedsCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.FeedsCreate(r.Context(), feedsCreateRequestParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// FeedsGet - Get feed
func (c *CatalogsAPIController) FeedsGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	feedIdParam := params["feed_id"]
	if feedIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"feed_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.FeedsGet(r.Context(), feedIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// FeedsDelete - Delete feed
func (c *CatalogsAPIController) FeedsDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	feedIdParam := params["feed_id"]
	if feedIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"feed_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.FeedsDelete(r.Context(), feedIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// FeedsUpdate - Update feed
func (c *CatalogsAPIController) FeedsUpdate(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	feedIdParam := params["feed_id"]
	if feedIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"feed_id"}, nil)
		return
	}
	feedsUpdateRequestParam := FeedsUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&feedsUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertFeedsUpdateRequestRequired(feedsUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertFeedsUpdateRequestConstraints(feedsUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.FeedsUpdate(r.Context(), feedIdParam, feedsUpdateRequestParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// FeedsIngest - Ingest feed items
func (c *CatalogsAPIController) FeedsIngest(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	feedIdParam := params["feed_id"]
	if feedIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"feed_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.FeedsIngest(r.Context(), feedIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// FeedProcessingResultsList - List feed processing results
func (c *CatalogsAPIController) FeedProcessingResultsList(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	feedIdParam := params["feed_id"]
	if feedIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"feed_id"}, nil)
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
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.FeedProcessingResultsList(r.Context(), feedIdParam, bookmarkParam, pageSizeParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ItemsIssuesList - List item issues
func (c *CatalogsAPIController) ItemsIssuesList(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	processingResultIdParam := params["processing_result_id"]
	if processingResultIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"processing_result_id"}, nil)
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
	itemNumbersParam, err := parseNumericArrayParameter[int32](
		query.Get("item_numbers"), ",", false,
		WithParse[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "item_numbers", Err: err}, nil)
		return
	}
	var itemValidationIssueParam CatalogsItemValidationIssue
	if query.Has("item_validation_issue") {
		param := CatalogsItemValidationIssue(query.Get("item_validation_issue"))

		itemValidationIssueParam = param
	} else {
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.ItemsIssuesList(r.Context(), processingResultIdParam, bookmarkParam, pageSizeParam, itemNumbersParam, itemValidationIssueParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ItemsGet - Get catalogs items
// Deprecated
func (c *CatalogsAPIController) ItemsGet(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var countryParam string
	if query.Has("country") {
		param := query.Get("country")

		countryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "country"}, nil)
		return
	}
	var languageParam string
	if query.Has("language") {
		param := query.Get("language")

		languageParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "language"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	var itemIdsParam []string
	if query.Has("item_ids") {
		itemIdsParam = strings.Split(query.Get("item_ids"), ",")
	}
	var filtersParam CatalogsItemsFilters
	if query.Has("filters") {
		param := CatalogsItemsFilters(query.Get("filters"))

		filtersParam = param
	} else {
	}
	result, err := c.service.ItemsGet(r.Context(), countryParam, languageParam, adAccountIdParam, itemIdsParam, filtersParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ItemsPost - Get catalogs items (POST)
func (c *CatalogsAPIController) ItemsPost(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	catalogsItemsRequestParam := CatalogsItemsRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&catalogsItemsRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCatalogsItemsRequestRequired(catalogsItemsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCatalogsItemsRequestConstraints(catalogsItemsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.ItemsPost(r.Context(), catalogsItemsRequestParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ItemsBatchPost - Operate on item batch
func (c *CatalogsAPIController) ItemsBatchPost(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	itemsBatchPostRequestParam := ItemsBatchPostRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&itemsBatchPostRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertItemsBatchPostRequestRequired(itemsBatchPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertItemsBatchPostRequestConstraints(itemsBatchPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.ItemsBatchPost(r.Context(), itemsBatchPostRequestParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ItemsBatchGet - Get item batch status
func (c *CatalogsAPIController) ItemsBatchGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	batchIdParam := params["batch_id"]
	if batchIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"batch_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.ItemsBatchGet(r.Context(), batchIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupsCreateMany - Create product groups
func (c *CatalogsAPIController) CatalogsProductGroupsCreateMany(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	multipleProductGroupsInnerParam := []MultipleProductGroupsInner{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&multipleProductGroupsInnerParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	for _, el := range multipleProductGroupsInnerParam {
		if err := AssertMultipleProductGroupsInnerRequired(el); err != nil {
			c.errorHandler(w, r, err, nil)
			return
		}
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsProductGroupsCreateMany(r.Context(), multipleProductGroupsInnerParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupsDeleteMany - Delete product groups
func (c *CatalogsAPIController) CatalogsProductGroupsDeleteMany(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	idParam, err := parseNumericArrayParameter[int32](
		query.Get("id"), ",", true,
		WithParse[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "id", Err: err}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsProductGroupsDeleteMany(r.Context(), idParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupsList - List product groups
func (c *CatalogsAPIController) CatalogsProductGroupsList(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	idParam, err := parseNumericArrayParameter[int32](
		query.Get("id"), ",", false,
		WithParse[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "id", Err: err}, nil)
		return
	}
	var feedIdParam string
	if query.Has("feed_id") {
		param := query.Get("feed_id")

		feedIdParam = param
	} else {
	}
	var catalogIdParam string
	if query.Has("catalog_id") {
		param := query.Get("catalog_id")

		catalogIdParam = param
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
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsProductGroupsList(r.Context(), idParam, feedIdParam, catalogIdParam, bookmarkParam, pageSizeParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupsCreate - Create product group
func (c *CatalogsAPIController) CatalogsProductGroupsCreate(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	multipleProductGroupsInnerParam := MultipleProductGroupsInner{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&multipleProductGroupsInnerParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertMultipleProductGroupsInnerRequired(multipleProductGroupsInnerParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertMultipleProductGroupsInnerConstraints(multipleProductGroupsInnerParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsProductGroupsCreate(r.Context(), multipleProductGroupsInnerParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupsGet - Get product group
func (c *CatalogsAPIController) CatalogsProductGroupsGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	productGroupIdParam := params["product_group_id"]
	if productGroupIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"product_group_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsProductGroupsGet(r.Context(), productGroupIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupsDelete - Delete product group
func (c *CatalogsAPIController) CatalogsProductGroupsDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	productGroupIdParam := params["product_group_id"]
	if productGroupIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"product_group_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsProductGroupsDelete(r.Context(), productGroupIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupsUpdate - Update single product group
func (c *CatalogsAPIController) CatalogsProductGroupsUpdate(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	productGroupIdParam := params["product_group_id"]
	if productGroupIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"product_group_id"}, nil)
		return
	}
	catalogsProductGroupsUpdateRequestParam := CatalogsProductGroupsUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&catalogsProductGroupsUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCatalogsProductGroupsUpdateRequestRequired(catalogsProductGroupsUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCatalogsProductGroupsUpdateRequestConstraints(catalogsProductGroupsUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsProductGroupsUpdate(r.Context(), productGroupIdParam, catalogsProductGroupsUpdateRequestParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupsProductCountsGet - Get product counts
func (c *CatalogsAPIController) CatalogsProductGroupsProductCountsGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	productGroupIdParam := params["product_group_id"]
	if productGroupIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"product_group_id"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.CatalogsProductGroupsProductCountsGet(r.Context(), productGroupIdParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// CatalogsProductGroupPinsList - List products by product group
func (c *CatalogsAPIController) CatalogsProductGroupPinsList(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	productGroupIdParam := params["product_group_id"]
	if productGroupIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"product_group_id"}, nil)
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
	result, err := c.service.CatalogsProductGroupPinsList(r.Context(), productGroupIdParam, bookmarkParam, pageSizeParam, adAccountIdParam, pinMetricsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProductsByProductGroupFilterList - List products by filter
func (c *CatalogsAPIController) ProductsByProductGroupFilterList(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	catalogsListProductsByFilterRequestParam := CatalogsListProductsByFilterRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&catalogsListProductsByFilterRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCatalogsListProductsByFilterRequestRequired(catalogsListProductsByFilterRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCatalogsListProductsByFilterRequestConstraints(catalogsListProductsByFilterRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
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
	result, err := c.service.ProductsByProductGroupFilterList(r.Context(), catalogsListProductsByFilterRequestParam, bookmarkParam, pageSizeParam, adAccountIdParam, pinMetricsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ReportsGet - Get catalogs report
func (c *CatalogsAPIController) ReportsGet(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var tokenParam string
	if query.Has("token") {
		param := query.Get("token")

		tokenParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "token"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.ReportsGet(r.Context(), tokenParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ReportsCreate - Build catalogs report
func (c *CatalogsAPIController) ReportsCreate(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	catalogsReportParametersParam := CatalogsReportParameters{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&catalogsReportParametersParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCatalogsReportParametersRequired(catalogsReportParametersParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCatalogsReportParametersConstraints(catalogsReportParametersParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
	} else {
	}
	result, err := c.service.ReportsCreate(r.Context(), catalogsReportParametersParam, adAccountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ReportsStats - List report stats
func (c *CatalogsAPIController) ReportsStats(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var parametersParam CatalogsReportParameters
	if query.Has("parameters") {
		param := CatalogsReportParameters(query.Get("parameters"))

		parametersParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "parameters"}, nil)
		return
	}
	var adAccountIdParam string
	if query.Has("ad_account_id") {
		param := query.Get("ad_account_id")

		adAccountIdParam = param
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
	var bookmarkParam string
	if query.Has("bookmark") {
		param := query.Get("bookmark")

		bookmarkParam = param
	} else {
	}
	result, err := c.service.ReportsStats(r.Context(), parametersParam, adAccountIdParam, pageSizeParam, bookmarkParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
