package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ConversionTagsCreate - Create conversion tag
func (c *Container) ConversionTagsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ConversionTagsGet - Get conversion tag
func (c *Container) ConversionTagsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ConversionTagsList - Get conversion tags
func (c *Container) ConversionTagsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// OcpmEligibleConversionTagsGet - Get Ocpm eligible conversion tags
func (c *Container) OcpmEligibleConversionTagsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PageVisitConversionTagsGet - Get page visit conversion tags
func (c *Container) PageVisitConversionTagsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

