package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AudienceInsightsGet - Get audience insights
func (c *Container) AudienceInsightsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AudienceInsightsScopeAndTypeGet - Get audience insights scope and type
func (c *Container) AudienceInsightsScopeAndTypeGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

