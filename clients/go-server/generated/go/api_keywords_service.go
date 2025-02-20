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
	"reflect"
)

// KeywordsAPIService is a service that implements the logic for the KeywordsAPIServicer
// This service should implement the business logic for every endpoint for the KeywordsAPI API.
// Include any external packages or services that will be required by this service.
type KeywordsAPIService struct {
}

// NewKeywordsAPIService creates a default api service
func NewKeywordsAPIService() *KeywordsAPIService {
	return &KeywordsAPIService{}
}

// KeywordsGet - Get keywords
func (s *KeywordsAPIService) KeywordsGet(ctx context.Context, adAccountId string, campaignId string, adGroupId string, matchTypes []MatchType, pageSize int32, bookmark string) (ImplResponse, error) {
	// TODO - update KeywordsGet with the required logic for this service method.
	// Add api_keywords_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, KeywordsGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, KeywordsGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("KeywordsGet method not implemented")
}

// KeywordsCreate - Create keywords
func (s *KeywordsAPIService) KeywordsCreate(ctx context.Context, adAccountId string, keywordsRequest KeywordsRequest) (ImplResponse, error) {
	// TODO - update KeywordsCreate with the required logic for this service method.
	// Add api_keywords_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, KeywordsResponse{}) or use other options such as http.Ok ...
	// return Response(200, KeywordsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("KeywordsCreate method not implemented")
}

// KeywordsUpdate - Update keywords
func (s *KeywordsAPIService) KeywordsUpdate(ctx context.Context, adAccountId string, keywordUpdateBody KeywordUpdateBody) (ImplResponse, error) {
	// TODO - update KeywordsUpdate with the required logic for this service method.
	// Add api_keywords_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, KeywordsResponse{}) or use other options such as http.Ok ...
	// return Response(200, KeywordsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("KeywordsUpdate method not implemented")
}

// CountryKeywordsMetricsGet - Get country&#39;s keyword metrics
func (s *KeywordsAPIService) CountryKeywordsMetricsGet(ctx context.Context, adAccountId string, countryCode string, keywords []string) (ImplResponse, error) {
	// TODO - update CountryKeywordsMetricsGet with the required logic for this service method.
	// Add api_keywords_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, KeywordsMetricsArrayResponse{}) or use other options such as http.Ok ...
	// return Response(200, KeywordsMetricsArrayResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CountryKeywordsMetricsGet method not implemented")
}

// TrendingKeywordsList - List trending keywords
func (s *KeywordsAPIService) TrendingKeywordsList(ctx context.Context, region TrendsSupportedRegion, trendType TrendType, interests []string, genders []string, ages []string, includeKeywords []string, normalizeAgainstGroup bool, limit int32) (ImplResponse, error) {
	// TODO - update TrendingKeywordsList with the required logic for this service method.
	// Add api_keywords_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, TrendingKeywordsResponse{}) or use other options such as http.Ok ...
	// return Response(200, TrendingKeywordsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("TrendingKeywordsList method not implemented")
}
