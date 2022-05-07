package main

import (
	"github.com/GIT_USER_ID/GIT_REPO_ID/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

    //todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// AdAccountAnalytics - Get ad account analytics
	e.GET("/v5/ad_accounts/:ad_account_id/analytics", c.AdAccountAnalytics)

	// AdAccountsList - List ad accounts
	e.GET("/v5/ad_accounts", c.AdAccountsList)

	// AdGroupsAnalytics - Get ad group analytics
	e.GET("/v5/ad_accounts/:ad_account_id/ad_groups/analytics", c.AdGroupsAnalytics)

	// AdGroupsList - List ad groups
	e.GET("/v5/ad_accounts/:ad_account_id/ad_groups", c.AdGroupsList)

	// AdsAnalytics - Get ad analytics
	e.GET("/v5/ad_accounts/:ad_account_id/ads/analytics", c.AdsAnalytics)

	// AdsList - List ads
	e.GET("/v5/ad_accounts/:ad_account_id/ads", c.AdsList)

	// AnalyticsCreateReport - Create async request for an account analytics report
	e.POST("/v5/ad_accounts/:ad_account_id/reports", c.AnalyticsCreateReport)

	// AnalyticsGetReport - Get the account analytics report created by the async call
	e.GET("/v5/ad_accounts/:ad_account_id/reports", c.AnalyticsGetReport)

	// CampaignsAnalytics - Get campaign analytics
	e.GET("/v5/ad_accounts/:ad_account_id/campaigns/analytics", c.CampaignsAnalytics)

	// CampaignsList - List campaigns
	e.GET("/v5/ad_accounts/:ad_account_id/campaigns", c.CampaignsList)

	// ProductGroupsAnalytics - Get product group analytics
	e.GET("/v5/ad_accounts/:ad_account_id/product_groups/analytics", c.ProductGroupsAnalytics)

	// BoardSectionsCreate - Create board section
	e.POST("/v5/boards/:board_id/sections", c.BoardSectionsCreate)

	// BoardSectionsDelete - Delete board section
	e.DELETE("/v5/boards/:board_id/sections/:section_id", c.BoardSectionsDelete)

	// BoardSectionsList - List board sections
	e.GET("/v5/boards/:board_id/sections", c.BoardSectionsList)

	// BoardSectionsListPins - List Pins on board section
	e.GET("/v5/boards/:board_id/sections/:section_id/pins", c.BoardSectionsListPins)

	// BoardSectionsUpdate - Update board section
	e.PATCH("/v5/boards/:board_id/sections/:section_id", c.BoardSectionsUpdate)

	// BoardsCreate - Create board
	e.POST("/v5/boards", c.BoardsCreate)

	// BoardsDelete - Delete board
	e.DELETE("/v5/boards/:board_id", c.BoardsDelete)

	// BoardsGet - Get board
	e.GET("/v5/boards/:board_id", c.BoardsGet)

	// BoardsList - List boards
	e.GET("/v5/boards", c.BoardsList)

	// BoardsListPins - List Pins on board
	e.GET("/v5/boards/:board_id/pins", c.BoardsListPins)

	// BoardsUpdate - Update board
	e.PATCH("/v5/boards/:board_id", c.BoardsUpdate)

	// CatalogsProductGroupsCreate - Create product group
	e.POST("/v5/catalogs/product_groups", c.CatalogsProductGroupsCreate)

	// CatalogsProductGroupsDelete - Delete product group
	e.DELETE("/v5/catalogs/product_groups/:product_group_id", c.CatalogsProductGroupsDelete)

	// CatalogsProductGroupsList - Get product groups list
	e.GET("/v5/catalogs/product_groups", c.CatalogsProductGroupsList)

	// CatalogsProductGroupsUpdate - Update product group
	e.PATCH("/v5/catalogs/product_groups/:product_group_id", c.CatalogsProductGroupsUpdate)

	// FeedProcessingResultsList - List processing results for a given feed
	e.GET("/v5/catalogs/feeds/:feed_id/processing_results", c.FeedProcessingResultsList)

	// FeedsCreate - Create feed
	e.POST("/v5/catalogs/feeds", c.FeedsCreate)

	// FeedsDelete - Delete feed
	e.DELETE("/v5/catalogs/feeds/:feed_id", c.FeedsDelete)

	// FeedsGet - Get feed
	e.GET("/v5/catalogs/feeds/:feed_id", c.FeedsGet)

	// FeedsList - List feeds
	e.GET("/v5/catalogs/feeds", c.FeedsList)

	// FeedsUpdate - Update feed
	e.PATCH("/v5/catalogs/feeds/:feed_id", c.FeedsUpdate)

	// ItemsBatchGet - Get catalogs items batch
	e.GET("/v5/catalogs/items/batch/:batch_id", c.ItemsBatchGet)

	// ItemsBatchPost - Perform an operation on an item batch
	e.POST("/v5/catalogs/items/batch", c.ItemsBatchPost)

	// ItemsGet - Get catalogs items
	e.GET("/v5/catalogs/items", c.ItemsGet)

	// MediaCreate - Register media upload
	e.POST("/v5/media", c.MediaCreate)

	// MediaGet - Get media upload details
	e.GET("/v5/media/:media_id", c.MediaGet)

	// MediaList - List media uploads
	e.GET("/v5/media", c.MediaList)

	// OauthToken - Generate OAuth access token
	e.POST("/v5/oauth/token", c.OauthToken)

	// PinsAnalytics - Get Pin analytics
	e.GET("/v5/pins/:pin_id/analytics", c.PinsAnalytics)

	// PinsCreate - Create Pin
	e.POST("/v5/pins", c.PinsCreate)

	// PinsDelete - Delete Pin
	e.DELETE("/v5/pins/:pin_id", c.PinsDelete)

	// PinsGet - Get Pin
	e.GET("/v5/pins/:pin_id", c.PinsGet)

	// UserAccountAnalytics - Get user account analytics
	e.GET("/v5/user_account/analytics", c.UserAccountAnalytics)

	// UserAccountGet - Get user account
	e.GET("/v5/user_account", c.UserAccountGet)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}