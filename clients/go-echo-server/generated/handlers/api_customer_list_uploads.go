package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CustomerListUploadsCreate - Create customer list upload
func (c *Container) CustomerListUploadsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CustomerListUploadsGet - Get customer list upload
func (c *Container) CustomerListUploadsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CustomerListUploadsRun - Run customer list upload
func (c *Container) CustomerListUploadsRun(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

