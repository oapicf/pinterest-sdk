package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ProductGroupPromotionsCreate - Create product group promotions
func (c *Container) ProductGroupPromotionsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProductGroupPromotionsGet - Get a product group promotion by id
func (c *Container) ProductGroupPromotionsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProductGroupPromotionsList - Get product group promotions
func (c *Container) ProductGroupPromotionsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProductGroupPromotionsUpdate - Update product group promotions
func (c *Container) ProductGroupPromotionsUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProductGroupsAnalytics - Get product group analytics
func (c *Container) ProductGroupsAnalytics(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

