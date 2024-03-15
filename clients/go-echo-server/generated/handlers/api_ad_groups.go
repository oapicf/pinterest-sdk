package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdGroupsAnalytics - Get ad group analytics
func (c *Container) AdGroupsAnalytics(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdGroupsAudienceSizing - Get audience sizing
func (c *Container) AdGroupsAudienceSizing(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdGroupsBidFloorGet - Get bid floors
func (c *Container) AdGroupsBidFloorGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdGroupsCreate - Create ad groups
func (c *Container) AdGroupsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdGroupsGet - Get ad group
func (c *Container) AdGroupsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdGroupsList - List ad groups
func (c *Container) AdGroupsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdGroupsTargetingAnalyticsGet - Get targeting analytics for ad groups
func (c *Container) AdGroupsTargetingAnalyticsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdGroupsUpdate - Update ad groups
func (c *Container) AdGroupsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

