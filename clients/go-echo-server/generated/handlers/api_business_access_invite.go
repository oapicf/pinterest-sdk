package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AssetAccessRequestsCreate - Create a request to access an existing partner's assets.
func (c *Container) AssetAccessRequestsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CancelInvitesOrRequests - Cancel invites/requests
func (c *Container) CancelInvitesOrRequests(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateAssetInvites - Update invite/request with an asset permission
func (c *Container) CreateAssetInvites(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateMembershipOrPartnershipInvites - Create invites or requests
func (c *Container) CreateMembershipOrPartnershipInvites(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetInvites - Get invites/requests
func (c *Container) GetInvites(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RespondBusinessAccessInvites - Accept or decline an invite/request
func (c *Container) RespondBusinessAccessInvites(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

