package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch
func (c *Container) CatalogsLocalInventoryItemsBatchOperate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsLocalInventoryItemsPost - Get local inventory items (POST)
func (c *Container) CatalogsLocalInventoryItemsPost(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsLocalStoresCreate - Create local stores
func (c *Container) CatalogsLocalStoresCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsLocalStoresDelete - Delete local stores
func (c *Container) CatalogsLocalStoresDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsLocalStoresList - List local stores
func (c *Container) CatalogsLocalStoresList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsLocalStoresUpdate - Update local stores
func (c *Container) CatalogsLocalStoresUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsSupplementalItemsBatchGet - Get supplemental items batch status
func (c *Container) CatalogsSupplementalItemsBatchGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

