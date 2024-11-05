package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// DeleteBusinessMembership - Terminate business memberships
func (c *Container) DeleteBusinessMembership(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteBusinessPartners - Terminate business partnerships
func (c *Container) DeleteBusinessPartners(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetBusinessEmployers - List business employers for user
func (c *Container) GetBusinessEmployers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetBusinessMembers - Get business members
func (c *Container) GetBusinessMembers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetBusinessPartners - Get business partners
func (c *Container) GetBusinessPartners(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateBusinessMemberships - Update member's business role
func (c *Container) UpdateBusinessMemberships(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

