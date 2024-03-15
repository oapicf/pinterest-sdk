package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CatalogsList - List catalogs
func (c *Container) CatalogsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupPinsList - List products for a Product Group
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


// CatalogsProductGroupsDelete - Delete product group
func (c *Container) CatalogsProductGroupsDelete(ctx echo.Context) error {
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


// CatalogsProductGroupsProductCountsGet - Get product counts for a Product Group
func (c *Container) CatalogsProductGroupsProductCountsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CatalogsProductGroupsUpdate - Update product group
func (c *Container) CatalogsProductGroupsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// FeedProcessingResultsList - List processing results for a given feed
func (c *Container) FeedProcessingResultsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// FeedsCreate - Create feed
func (c *Container) FeedsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// FeedsDelete - Delete feed
func (c *Container) FeedsDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// FeedsGet - Get feed
func (c *Container) FeedsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// FeedsList - List feeds
func (c *Container) FeedsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// FeedsUpdate - Update feed
func (c *Container) FeedsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemsBatchGet - Get catalogs item batch status
func (c *Container) ItemsBatchGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemsBatchPost - Operate on item batch
func (c *Container) ItemsBatchPost(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemsGet - Get catalogs items
func (c *Container) ItemsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemsIssuesList - List item issues for a given processing result
func (c *Container) ItemsIssuesList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProductsByProductGroupFilterList - List filtered products
func (c *Container) ProductsByProductGroupFilterList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

