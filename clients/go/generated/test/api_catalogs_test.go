/*
Pinterest REST API

Testing CatalogsAPIService

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

func Test_openapi_CatalogsAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test CatalogsAPIService CatalogsCreate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsCreate(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsList(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupPinsList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var productGroupId string

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupPinsList(context.Background(), productGroupId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupsCreate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupsCreate(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupsCreateMany", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupsCreateMany(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupsDelete", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var productGroupId string

		httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupsDelete(context.Background(), productGroupId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupsDeleteMany", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupsDeleteMany(context.Background()).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupsGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var productGroupId string

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupsGet(context.Background(), productGroupId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupsList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupsList(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupsProductCountsGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var productGroupId string

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupsProductCountsGet(context.Background(), productGroupId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService CatalogsProductGroupsUpdate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var productGroupId string

		resp, httpRes, err := apiClient.CatalogsAPI.CatalogsProductGroupsUpdate(context.Background(), productGroupId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService FeedProcessingResultsList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var feedId string

		resp, httpRes, err := apiClient.CatalogsAPI.FeedProcessingResultsList(context.Background(), feedId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService FeedsCreate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.FeedsCreate(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService FeedsDelete", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var feedId string

		httpRes, err := apiClient.CatalogsAPI.FeedsDelete(context.Background(), feedId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService FeedsGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var feedId string

		resp, httpRes, err := apiClient.CatalogsAPI.FeedsGet(context.Background(), feedId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService FeedsIngest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var feedId string

		resp, httpRes, err := apiClient.CatalogsAPI.FeedsIngest(context.Background(), feedId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService FeedsList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.FeedsList(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService FeedsUpdate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var feedId string

		resp, httpRes, err := apiClient.CatalogsAPI.FeedsUpdate(context.Background(), feedId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ItemsBatchGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var batchId string

		resp, httpRes, err := apiClient.CatalogsAPI.ItemsBatchGet(context.Background(), batchId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ItemsBatchPost", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.ItemsBatchPost(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ItemsGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.ItemsGet(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ItemsIssuesList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var processingResultId string

		resp, httpRes, err := apiClient.CatalogsAPI.ItemsIssuesList(context.Background(), processingResultId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ItemsPost", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.ItemsPost(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ProductsByProductGroupFilterList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.ProductsByProductGroupFilterList(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ReportsCreate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.ReportsCreate(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ReportsGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.ReportsGet(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test CatalogsAPIService ReportsStats", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.CatalogsAPI.ReportsStats(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
