package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// BulkDownloadCreate - Get advertiser entities in bulk
func (c *Container) BulkDownloadCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BulkRequestGet - Download advertiser entities in bulk
func (c *Container) BulkRequestGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BulkUpsertCreate - Create/update ad entities in bulk
func (c *Container) BulkUpsertCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

