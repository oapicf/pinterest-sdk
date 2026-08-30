package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdPreviewsCreate - Create ad preview with pin or image
func (c *Container) AdPreviewsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdTargetingAnalyticsGet - Get targeting analytics for ads
func (c *Container) AdTargetingAnalyticsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdsAnalytics - Get ad analytics
func (c *Container) AdsAnalytics(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdsCreate - Create ads
func (c *Container) AdsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdsGet - Get ad
func (c *Container) AdsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdsList - List ads
func (c *Container) AdsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdsUpdate - Update ads
func (c *Container) AdsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CampaignAdPreviewCreate - Create ad preview records for one or more ad groups
func (c *Container) CampaignAdPreviewCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CampaignAdPreviewDelete - Delete ad preview records for one or more ad groups
func (c *Container) CampaignAdPreviewDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CampaignAdPreviewRead - Fetch ad preview records for one or more ad groups
func (c *Container) CampaignAdPreviewRead(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

