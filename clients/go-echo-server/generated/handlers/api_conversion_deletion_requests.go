package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ConversionDeletionRequestCreate - Create a conversion deletion request
func (c *Container) ConversionDeletionRequestCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ConversionDeletionRequestDelete - Delete a conversion deletion request
func (c *Container) ConversionDeletionRequestDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ConversionDeletionRequestGet - Get a single conversion deletion request
func (c *Container) ConversionDeletionRequestGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ConversionDeletionRequestList - List conversion deletion requests
func (c *Container) ConversionDeletionRequestList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

