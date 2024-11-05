package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdvancedAuctionItemsGetPost - Get item bid options (POST)
func (c *Container) AdvancedAuctionItemsGetPost(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdvancedAuctionItemsSubmitPost - Operate on item level bid options
func (c *Container) AdvancedAuctionItemsSubmitPost(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

