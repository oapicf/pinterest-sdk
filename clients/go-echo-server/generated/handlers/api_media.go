package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// MediaCreate - Register media upload
func (c *Container) MediaCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// MediaGet - Get media upload details
func (c *Container) MediaGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// MediaList - List media uploads
func (c *Container) MediaList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

