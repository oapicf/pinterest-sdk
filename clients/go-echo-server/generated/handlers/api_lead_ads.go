package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdAccountsSubscriptionsDelById - Delete lead ads subscription
func (c *Container) AdAccountsSubscriptionsDelById(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdAccountsSubscriptionsGetById - Get lead ads subscription
func (c *Container) AdAccountsSubscriptionsGetById(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdAccountsSubscriptionsGetList - Get lead ads subscriptions
func (c *Container) AdAccountsSubscriptionsGetList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdAccountsSubscriptionsPost - Create lead ads subscription
func (c *Container) AdAccountsSubscriptionsPost(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

