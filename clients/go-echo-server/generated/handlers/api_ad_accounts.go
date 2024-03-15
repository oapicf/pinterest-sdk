package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdAccountAnalytics - Get ad account analytics
func (c *Container) AdAccountAnalytics(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdAccountTargetingAnalyticsGet - Get targeting analytics for an ad account
func (c *Container) AdAccountTargetingAnalyticsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdAccountsCreate - Create ad account
func (c *Container) AdAccountsCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdAccountsGet - Get ad account
func (c *Container) AdAccountsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdAccountsList - List ad accounts
func (c *Container) AdAccountsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AnalyticsCreateMmmReport - Create a request for a Marketing Mix Modeling (MMM) report
func (c *Container) AnalyticsCreateMmmReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AnalyticsCreateReport - Create async request for an account analytics report
func (c *Container) AnalyticsCreateReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AnalyticsCreateTemplateReport - Create async request for an analytics report using a template
func (c *Container) AnalyticsCreateTemplateReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AnalyticsGetMmmReport - Get advertiser Marketing Mix Modeling (MMM) report.
func (c *Container) AnalyticsGetMmmReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AnalyticsGetReport - Get the account analytics report created by the async call
func (c *Container) AnalyticsGetReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SandboxDelete - Delete ads data for ad account in API Sandbox
func (c *Container) SandboxDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// TemplatesList - List templates
func (c *Container) TemplatesList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

