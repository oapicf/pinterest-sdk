package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AssetGroupCreate - Create a new asset group.
func (c *Container) AssetGroupCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AssetGroupDelete - Delete asset groups.
func (c *Container) AssetGroupDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AssetGroupUpdate - Update asset groups.
func (c *Container) AssetGroupUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BusinessAssetMembersGet - Get members with access to asset
func (c *Container) BusinessAssetMembersGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BusinessAssetPartnersGet - Get partners with access to asset
func (c *Container) BusinessAssetPartnersGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BusinessAssetsGet - List business assets
func (c *Container) BusinessAssetsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BusinessMemberAssetsGet - Get assets assigned to a member
func (c *Container) BusinessMemberAssetsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BusinessMembersAssetAccessDelete - Delete member access to asset
func (c *Container) BusinessMembersAssetAccessDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions
func (c *Container) BusinessMembersAssetAccessUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner
func (c *Container) BusinessPartnerAssetAccessGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeletePartnerAssetAccessHandlerImpl - Delete partner access to asset
func (c *Container) DeletePartnerAssetAccessHandlerImpl(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions
func (c *Container) UpdatePartnerAssetAccessHandlerImpl(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

