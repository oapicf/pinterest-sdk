package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdAccountsCatalogsProductGroupsList - Get catalog product groups
// Deprecated
func (c *Container) AdAccountsCatalogsProductGroupsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

