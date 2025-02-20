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
	"context"
	"net/http"
	"errors"
)

// ConversionTagsAPIService is a service that implements the logic for the ConversionTagsAPIServicer
// This service should implement the business logic for every endpoint for the ConversionTagsAPI API.
// Include any external packages or services that will be required by this service.
type ConversionTagsAPIService struct {
}

// NewConversionTagsAPIService creates a default api service
func NewConversionTagsAPIService() *ConversionTagsAPIService {
	return &ConversionTagsAPIService{}
}

// ConversionTagsList - Get conversion tags
func (s *ConversionTagsAPIService) ConversionTagsList(ctx context.Context, adAccountId string, filterDeleted bool) (ImplResponse, error) {
	// TODO - update ConversionTagsList with the required logic for this service method.
	// Add api_conversion_tags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ConversionTagListResponse{}) or use other options such as http.Ok ...
	// return Response(200, ConversionTagListResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ConversionTagsList method not implemented")
}

// ConversionTagsCreate - Create conversion tag
func (s *ConversionTagsAPIService) ConversionTagsCreate(ctx context.Context, adAccountId string, conversionTagCreate ConversionTagCreate) (ImplResponse, error) {
	// TODO - update ConversionTagsCreate with the required logic for this service method.
	// Add api_conversion_tags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ConversionTagResponse{}) or use other options such as http.Ok ...
	// return Response(200, ConversionTagResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ConversionTagsCreate method not implemented")
}

// OcpmEligibleConversionTagsGet - Get Ocpm eligible conversion tags
func (s *ConversionTagsAPIService) OcpmEligibleConversionTagsGet(ctx context.Context, adAccountId string) (ImplResponse, error) {
	// TODO - update OcpmEligibleConversionTagsGet with the required logic for this service method.
	// Add api_conversion_tags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, map[string][]ConversionEventResponse{}) or use other options such as http.Ok ...
	// return Response(200, map[string][]ConversionEventResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("OcpmEligibleConversionTagsGet method not implemented")
}

// PageVisitConversionTagsGet - Get page visit conversion tags
func (s *ConversionTagsAPIService) PageVisitConversionTagsGet(ctx context.Context, adAccountId string, pageSize int32, order string, bookmark string) (ImplResponse, error) {
	// TODO - update PageVisitConversionTagsGet with the required logic for this service method.
	// Add api_conversion_tags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageVisitConversionTagsGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, PageVisitConversionTagsGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PageVisitConversionTagsGet method not implemented")
}

// ConversionTagsGet - Get conversion tag
func (s *ConversionTagsAPIService) ConversionTagsGet(ctx context.Context, adAccountId string, conversionTagId string) (ImplResponse, error) {
	// TODO - update ConversionTagsGet with the required logic for this service method.
	// Add api_conversion_tags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ConversionTagResponse{}) or use other options such as http.Ok ...
	// return Response(200, ConversionTagResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ConversionTagsGet method not implemented")
}
