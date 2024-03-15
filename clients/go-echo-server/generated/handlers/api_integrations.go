package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// IntegrationsCommerceDel - Delete commerce integration
func (c *Container) IntegrationsCommerceDel(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// IntegrationsCommerceGet - Get commerce integration
func (c *Container) IntegrationsCommerceGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// IntegrationsCommercePatch - Update commerce integration
func (c *Container) IntegrationsCommercePatch(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// IntegrationsCommercePost - Create commerce integration
func (c *Container) IntegrationsCommercePost(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// IntegrationsGetById - Get integration metadata
func (c *Container) IntegrationsGetById(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// IntegrationsGetList - Get integration metadata list
func (c *Container) IntegrationsGetList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// IntegrationsLogsPost - Receives batched logs from integration applications.
func (c *Container) IntegrationsLogsPost(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

