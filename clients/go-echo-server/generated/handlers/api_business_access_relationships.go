package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// BrandAccountsCreate - Create a Brand Account
func (c *Container) BrandAccountsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BrandAccountsUpdate - Update a Brand Account
func (c *Container) BrandAccountsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


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


// SystemUserUpdate - Update a system user information.
func (c *Container) SystemUserUpdate(ctx echo.Context) error {
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

