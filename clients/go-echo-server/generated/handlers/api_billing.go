package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdsCreditRedeem - Redeem ad credits
func (c *Container) AdsCreditRedeem(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdsCreditsDiscountsGet - Get ads credit discounts
func (c *Container) AdsCreditsDiscountsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BillingProfilesGet - Get billing profiles
func (c *Container) BillingProfilesGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SsioAccountsGet - Get Salesforce account details including bill-to information.
func (c *Container) SsioAccountsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SsioInsertionOrderCreate - Create insertion order through SSIO.
func (c *Container) SsioInsertionOrderCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SsioInsertionOrderEdit - Edit insertion order through SSIO.
func (c *Container) SsioInsertionOrderEdit(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SsioInsertionOrdersStatusGetByAdAccount - Get insertion order status by ad account id.
func (c *Container) SsioInsertionOrdersStatusGetByAdAccount(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SsioInsertionOrdersStatusGetByPinOrderId - Get insertion order status by pin order id.
func (c *Container) SsioInsertionOrdersStatusGetByPinOrderId(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SsioOrderLinesGetByAdAccount - Get Salesforce order lines by ad account id.
func (c *Container) SsioOrderLinesGetByAdAccount(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

