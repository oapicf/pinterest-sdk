package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ProductTagsBulkAdd - Add product tags to pin
func (c *Container) ProductTagsBulkAdd(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProductTagsBulkDelete - Delete product tags from pin
func (c *Container) ProductTagsBulkDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProductTagsList - Get product tags for pin
func (c *Container) ProductTagsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

