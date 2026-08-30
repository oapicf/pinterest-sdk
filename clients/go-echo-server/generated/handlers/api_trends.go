package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// TrendsEditorialArticlesList - Returns editorial articles for a given region
func (c *Container) TrendsEditorialArticlesList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// TrendsFeaturedTopicsList - Get featured topics
func (c *Container) TrendsFeaturedTopicsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// TrendsProductCategoriesDetailsList - Get product category details
func (c *Container) TrendsProductCategoriesDetailsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// TrendsProductCategoriesTrendingList - Get a list of growing Shopping Product Categories
func (c *Container) TrendsProductCategoriesTrendingList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

