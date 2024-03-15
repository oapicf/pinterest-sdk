package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CampaignTargetingAnalyticsGet - Get targeting analytics for campaigns
func (c *Container) CampaignTargetingAnalyticsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CampaignsAnalytics - Get campaign analytics
func (c *Container) CampaignsAnalytics(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CampaignsCreate - Create campaigns
func (c *Container) CampaignsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CampaignsGet - Get campaign
func (c *Container) CampaignsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CampaignsList - List campaigns
func (c *Container) CampaignsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CampaignsUpdate - Update campaigns
func (c *Container) CampaignsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

