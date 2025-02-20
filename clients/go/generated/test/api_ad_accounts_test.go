/*
Pinterest REST API

Testing AdAccountsAPIService

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

func Test_openapi_AdAccountsAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test AdAccountsAPIService AdAccountAnalytics", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.AdAccountAnalytics(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AdAccountTargetingAnalyticsGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.AdAccountTargetingAnalyticsGet(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AdAccountsCreate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.AdAccountsAPI.AdAccountsCreate(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AdAccountsGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.AdAccountsGet(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AdAccountsList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.AdAccountsAPI.AdAccountsList(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AnalyticsCreateMmmReport", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.AnalyticsCreateMmmReport(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AnalyticsCreateReport", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.AnalyticsCreateReport(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AnalyticsCreateTemplateReport", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string
		var templateId string

		resp, httpRes, err := apiClient.AdAccountsAPI.AnalyticsCreateTemplateReport(context.Background(), adAccountId, templateId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AnalyticsGetMmmReport", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.AnalyticsGetMmmReport(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService AnalyticsGetReport", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.AnalyticsGetReport(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService SandboxDelete", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.SandboxDelete(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AdAccountsAPIService TemplatesList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AdAccountsAPI.TemplatesList(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
