package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CatalogsProductGroupPinsList - List products by product group
func (c *Container) CatalogsProductGroupPinsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsCreate - Create product group
func (c *Container) CatalogsProductGroupsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsCreateMany - Create product groups
func (c *Container) CatalogsProductGroupsCreateMany(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsDelete - Delete product group
func (c *Container) CatalogsProductGroupsDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsDeleteMany - Delete product groups
func (c *Container) CatalogsProductGroupsDeleteMany(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsGet - Get product group
func (c *Container) CatalogsProductGroupsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsList - List product groups
func (c *Container) CatalogsProductGroupsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsProductCountsGet - Get product counts
func (c *Container) CatalogsProductGroupsProductCountsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsUpdate - Update single product group
func (c *Container) CatalogsProductGroupsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProductsByProductGroupFilterList - List products by filter
func (c *Container) ProductsByProductGroupFilterList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

