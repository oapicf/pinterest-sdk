package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// SearchPartnerPins - Search pins by a given search term
func (c *Container) SearchPartnerPins(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SearchUserBoardsGet - Search user's boards
func (c *Container) SearchUserBoardsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SearchUserPinsList - Search user's Pins
func (c *Container) SearchUserPinsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

