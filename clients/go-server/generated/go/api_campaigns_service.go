/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
	"reflect"
)

// CampaignsAPIService is a service that implements the logic for the CampaignsAPIServicer
// This service should implement the business logic for every endpoint for the CampaignsAPI API.
// Include any external packages or services that will be required by this service.
type CampaignsAPIService struct {
}

// NewCampaignsAPIService creates a default api service
func NewCampaignsAPIService() CampaignsAPIServicer {
	return &CampaignsAPIService{}
}

// CampaignTargetingAnalyticsGet - Get targeting analytics for campaigns
func (s *CampaignsAPIService) CampaignTargetingAnalyticsGet(ctx context.Context, adAccountId string, campaignIds []string, startDate string, endDate string, targetingTypes []AdsAnalyticsTargetingType, columns []string, granularity Granularity, clickWindowDays int32, engagementWindowDays int32, viewWindowDays int32, conversionReportTime string, attributionTypes ConversionReportAttributionType) (ImplResponse, error) {
	// TODO - update CampaignTargetingAnalyticsGet with the required logic for this service method.
	// Add api_campaigns_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MetricsResponse{}) or use other options such as http.Ok ...
	// return Response(200, MetricsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CampaignTargetingAnalyticsGet method not implemented")
}

// CampaignsAnalytics - Get campaign analytics
func (s *CampaignsAPIService) CampaignsAnalytics(ctx context.Context, adAccountId string, startDate string, endDate string, campaignIds []string, columns []string, granularity Granularity, clickWindowDays int32, engagementWindowDays int32, viewWindowDays int32, conversionReportTime string) (ImplResponse, error) {
	// TODO - update CampaignsAnalytics with the required logic for this service method.
	// Add api_campaigns_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []CampaignsAnalyticsResponseInner{}) or use other options such as http.Ok ...
	// return Response(200, []CampaignsAnalyticsResponseInner{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CampaignsAnalytics method not implemented")
}

// CampaignsCreate - Create campaigns
func (s *CampaignsAPIService) CampaignsCreate(ctx context.Context, adAccountId string, campaignCreateRequest []CampaignCreateRequest) (ImplResponse, error) {
	// TODO - update CampaignsCreate with the required logic for this service method.
	// Add api_campaigns_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CampaignCreateResponse{}) or use other options such as http.Ok ...
	// return Response(200, CampaignCreateResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CampaignsCreate method not implemented")
}

// CampaignsGet - Get campaign
func (s *CampaignsAPIService) CampaignsGet(ctx context.Context, adAccountId string, campaignId string) (ImplResponse, error) {
	// TODO - update CampaignsGet with the required logic for this service method.
	// Add api_campaigns_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CampaignResponse{}) or use other options such as http.Ok ...
	// return Response(200, CampaignResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CampaignsGet method not implemented")
}

// CampaignsList - List campaigns
func (s *CampaignsAPIService) CampaignsList(ctx context.Context, adAccountId string, campaignIds []string, entityStatuses []string, pageSize int32, order string, bookmark string) (ImplResponse, error) {
	// TODO - update CampaignsList with the required logic for this service method.
	// Add api_campaigns_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CampaignsList200Response{}) or use other options such as http.Ok ...
	// return Response(200, CampaignsList200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CampaignsList method not implemented")
}

// CampaignsUpdate - Update campaigns
func (s *CampaignsAPIService) CampaignsUpdate(ctx context.Context, adAccountId string, campaignUpdateRequest []CampaignUpdateRequest) (ImplResponse, error) {
	// TODO - update CampaignsUpdate with the required logic for this service method.
	// Add api_campaigns_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CampaignUpdateResponse{}) or use other options such as http.Ok ...
	// return Response(200, CampaignUpdateResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CampaignsUpdate method not implemented")
}