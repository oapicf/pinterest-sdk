package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdAccountCountriesGet - Get ad accounts countries
func (c *Container) AdAccountCountriesGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeliveryMetricsGet - Get available metrics' definitions
func (c *Container) DeliveryMetricsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// InterestTargetingOptionsGet - Get interest details
func (c *Container) InterestTargetingOptionsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// LeadFormQuestionsGet - Get lead form questions
func (c *Container) LeadFormQuestionsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// MetricsReadyStateGet - Get metrics ready state
func (c *Container) MetricsReadyStateGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// TargetingOptionsGet - Get targeting options
func (c *Container) TargetingOptionsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

