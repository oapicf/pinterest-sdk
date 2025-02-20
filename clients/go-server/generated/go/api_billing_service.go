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

// BillingAPIService is a service that implements the logic for the BillingAPIServicer
// This service should implement the business logic for every endpoint for the BillingAPI API.
// Include any external packages or services that will be required by this service.
type BillingAPIService struct {
}

// NewBillingAPIService creates a default api service
func NewBillingAPIService() *BillingAPIService {
	return &BillingAPIService{}
}

// AdsCreditsDiscountsGet - Get ads credit discounts
func (s *BillingAPIService) AdsCreditsDiscountsGet(ctx context.Context, adAccountId string, bookmark string, pageSize int32) (ImplResponse, error) {
	// TODO - update AdsCreditsDiscountsGet with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AdsCreditsDiscountsGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, AdsCreditsDiscountsGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AdsCreditsDiscountsGet method not implemented")
}

// AdsCreditRedeem - Redeem ad credits
func (s *BillingAPIService) AdsCreditRedeem(ctx context.Context, adAccountId string, adsCreditRedeemRequest AdsCreditRedeemRequest) (ImplResponse, error) {
	// TODO - update AdsCreditRedeem with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AdsCreditRedeemResponse{}) or use other options such as http.Ok ...
	// return Response(200, AdsCreditRedeemResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AdsCreditRedeem method not implemented")
}

// BillingProfilesGet - Get billing profiles
func (s *BillingAPIService) BillingProfilesGet(ctx context.Context, adAccountId string, isActive bool, bookmark string, pageSize int32) (ImplResponse, error) {
	// TODO - update BillingProfilesGet with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BillingProfilesGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, BillingProfilesGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BillingProfilesGet method not implemented")
}

// SsioAccountsGet - Get Salesforce account details including bill-to information.
func (s *BillingAPIService) SsioAccountsGet(ctx context.Context, adAccountId string) (ImplResponse, error) {
	// TODO - update SsioAccountsGet with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SsioAccountResponse{}) or use other options such as http.Ok ...
	// return Response(200, SsioAccountResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SsioAccountsGet method not implemented")
}

// SsioInsertionOrderCreate - Create insertion order through SSIO.
func (s *BillingAPIService) SsioInsertionOrderCreate(ctx context.Context, adAccountId string, ssioCreateInsertionOrderRequest SsioCreateInsertionOrderRequest) (ImplResponse, error) {
	// TODO - update SsioInsertionOrderCreate with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SsioCreateInsertionOrderResponse{}) or use other options such as http.Ok ...
	// return Response(200, SsioCreateInsertionOrderResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SsioInsertionOrderCreate method not implemented")
}

// SsioInsertionOrderEdit - Edit insertion order through SSIO.
func (s *BillingAPIService) SsioInsertionOrderEdit(ctx context.Context, adAccountId string, ssioEditInsertionOrderRequest SsioEditInsertionOrderRequest) (ImplResponse, error) {
	// TODO - update SsioInsertionOrderEdit with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SsioEditInsertionOrderResponse{}) or use other options such as http.Ok ...
	// return Response(200, SsioEditInsertionOrderResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SsioInsertionOrderEdit method not implemented")
}

// SsioInsertionOrdersStatusGetByAdAccount - Get insertion order status by ad account id.
func (s *BillingAPIService) SsioInsertionOrdersStatusGetByAdAccount(ctx context.Context, adAccountId string, bookmark string, pageSize int32) (ImplResponse, error) {
	// TODO - update SsioInsertionOrdersStatusGetByAdAccount with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SsioInsertionOrdersStatusGetByAdAccount200Response{}) or use other options such as http.Ok ...
	// return Response(200, SsioInsertionOrdersStatusGetByAdAccount200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SsioInsertionOrdersStatusGetByAdAccount method not implemented")
}

// SsioInsertionOrdersStatusGetByPinOrderId - Get insertion order status by pin order id.
func (s *BillingAPIService) SsioInsertionOrdersStatusGetByPinOrderId(ctx context.Context, adAccountId string, pinOrderId string) (ImplResponse, error) {
	// TODO - update SsioInsertionOrdersStatusGetByPinOrderId with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SsioInsertionOrderStatusResponse{}) or use other options such as http.Ok ...
	// return Response(200, SsioInsertionOrderStatusResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SsioInsertionOrdersStatusGetByPinOrderId method not implemented")
}

// SsioOrderLinesGetByAdAccount - Get Salesforce order lines by ad account id.
func (s *BillingAPIService) SsioOrderLinesGetByAdAccount(ctx context.Context, adAccountId string, bookmark string, pageSize int32, pinOrderId string) (ImplResponse, error) {
	// TODO - update SsioOrderLinesGetByAdAccount with the required logic for this service method.
	// Add api_billing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SsioOrderLinesGetByAdAccount200Response{}) or use other options such as http.Ok ...
	// return Response(200, SsioOrderLinesGetByAdAccount200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SsioOrderLinesGetByAdAccount method not implemented")
}
