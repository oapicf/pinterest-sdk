/*
Pinterest REST API

Testing AudienceSharingAPIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package openapi

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func Test_openapi_AudienceSharingAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test AudienceSharingAPIService AdAccountsAudiencesSharedAccountsList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AudienceSharingAPI.AdAccountsAudiencesSharedAccountsList(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudienceSharingAPIService BusinessAccountAudiencesSharedAccountsList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var businessId string

		resp, httpRes, err := apiClient.AudienceSharingAPI.BusinessAccountAudiencesSharedAccountsList(context.Background(), businessId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudienceSharingAPIService SharedAudiencesForBusinessList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var businessId string

		resp, httpRes, err := apiClient.AudienceSharingAPI.SharedAudiencesForBusinessList(context.Background(), businessId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudienceSharingAPIService UpdateAdAccountToAdAccountSharedAudience", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AudienceSharingAPI.UpdateAdAccountToAdAccountSharedAudience(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudienceSharingAPIService UpdateAdAccountToBusinessSharedAudience", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AudienceSharingAPI.UpdateAdAccountToBusinessSharedAudience(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudienceSharingAPIService UpdateBusinessToAdAccountSharedAudience", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var businessId string

		resp, httpRes, err := apiClient.AudienceSharingAPI.UpdateBusinessToAdAccountSharedAudience(context.Background(), businessId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudienceSharingAPIService UpdateBusinessToBusinessSharedAudience", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var businessId string

		resp, httpRes, err := apiClient.AudienceSharingAPI.UpdateBusinessToBusinessSharedAudience(context.Background(), businessId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
