/*
Pinterest REST API

Testing AudiencesAPIService

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

func Test_openapi_AudiencesAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test AudiencesAPIService AudiencesCreate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AudiencesAPI.AudiencesCreate(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudiencesAPIService AudiencesCreateCustom", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AudiencesAPI.AudiencesCreateCustom(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudiencesAPIService AudiencesGet", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string
		var audienceId string

		resp, httpRes, err := apiClient.AudiencesAPI.AudiencesGet(context.Background(), adAccountId, audienceId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudiencesAPIService AudiencesList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string

		resp, httpRes, err := apiClient.AudiencesAPI.AudiencesList(context.Background(), adAccountId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AudiencesAPIService AudiencesUpdate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var adAccountId string
		var audienceId string

		resp, httpRes, err := apiClient.AudiencesAPI.AudiencesUpdate(context.Background(), adAccountId, audienceId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
