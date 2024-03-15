package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// OauthToken - Generate OAuth access token
func (c *Container) OauthToken(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

