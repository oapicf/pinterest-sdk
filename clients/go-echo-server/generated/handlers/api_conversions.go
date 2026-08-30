package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdvertiserDefinedEventsCreate - Create advertiser defined events
func (c *Container) AdvertiserDefinedEventsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdvertiserDefinedEventsDelete - Delete advertiser defined events
func (c *Container) AdvertiserDefinedEventsDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdvertiserDefinedEventsGet - Get advertiser defined events
func (c *Container) AdvertiserDefinedEventsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdvertiserDefinedEventsUpdate - Update advertiser defined events
func (c *Container) AdvertiserDefinedEventsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

