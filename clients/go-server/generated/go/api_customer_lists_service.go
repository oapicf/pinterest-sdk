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
)

// CustomerListsAPIService is a service that implements the logic for the CustomerListsAPIServicer
// This service should implement the business logic for every endpoint for the CustomerListsAPI API.
// Include any external packages or services that will be required by this service.
type CustomerListsAPIService struct {
}

// NewCustomerListsAPIService creates a default api service
func NewCustomerListsAPIService() CustomerListsAPIServicer {
	return &CustomerListsAPIService{}
}

// CustomerListsCreate - Create customer lists
func (s *CustomerListsAPIService) CustomerListsCreate(ctx context.Context, adAccountId string, customerListRequest CustomerListRequest) (ImplResponse, error) {
	// TODO - update CustomerListsCreate with the required logic for this service method.
	// Add api_customer_lists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomerList{}) or use other options such as http.Ok ...
	// return Response(200, CustomerList{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CustomerListsCreate method not implemented")
}

// CustomerListsGet - Get customer list
func (s *CustomerListsAPIService) CustomerListsGet(ctx context.Context, adAccountId string, customerListId string) (ImplResponse, error) {
	// TODO - update CustomerListsGet with the required logic for this service method.
	// Add api_customer_lists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomerList{}) or use other options such as http.Ok ...
	// return Response(200, CustomerList{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CustomerListsGet method not implemented")
}

// CustomerListsList - Get customer lists
func (s *CustomerListsAPIService) CustomerListsList(ctx context.Context, adAccountId string, pageSize int32, order string, bookmark string) (ImplResponse, error) {
	// TODO - update CustomerListsList with the required logic for this service method.
	// Add api_customer_lists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomerListsList200Response{}) or use other options such as http.Ok ...
	// return Response(200, CustomerListsList200Response{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CustomerListsList method not implemented")
}

// CustomerListsUpdate - Update customer list
func (s *CustomerListsAPIService) CustomerListsUpdate(ctx context.Context, adAccountId string, customerListId string, customerListUpdateRequest CustomerListUpdateRequest) (ImplResponse, error) {
	// TODO - update CustomerListsUpdate with the required logic for this service method.
	// Add api_customer_lists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomerList{}) or use other options such as http.Ok ...
	// return Response(200, CustomerList{}), nil

	// TODO: Uncomment the next line to return response Response(0, Error{}) or use other options such as http.Ok ...
	// return Response(0, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CustomerListsUpdate method not implemented")
}