package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account
func (c *Container) AdAccountsAudiencesSharedAccountsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business
func (c *Container) BusinessAccountAudiencesSharedAccountsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SharedAudiencesForBusinessList - List received audiences for a business
func (c *Container) SharedAudiencesForBusinessList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts
func (c *Container) UpdateAdAccountToAdAccountSharedAudience(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses
func (c *Container) UpdateAdAccountToBusinessSharedAudience(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts
func (c *Container) UpdateBusinessToAdAccountSharedAudience(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses
func (c *Container) UpdateBusinessToBusinessSharedAudience(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

