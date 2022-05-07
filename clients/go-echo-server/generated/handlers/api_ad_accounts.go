package handlers
import (
    "github.com/GIT_USER_ID/GIT_REPO_ID/models"
    "github.com/labstack/echo/v4"
    "net/http"
)

// AdAccountAnalytics - Get ad account analytics
func (c *Container) AdAccountAnalytics(ctx echo.Context) error {
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


// AdGroupsAnalytics - Get ad group analytics
func (c *Container) AdGroupsAnalytics(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// AdGroupsList - List ad groups
func (c *Container) AdGroupsList(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// AdsAnalytics - Get ad analytics
func (c *Container) AdsAnalytics(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// AdsList - List ads
func (c *Container) AdsList(ctx echo.Context) error {
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


// AnalyticsGetReport - Get the account analytics report created by the async call
func (c *Container) AnalyticsGetReport(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// CampaignsAnalytics - Get campaign analytics
func (c *Container) CampaignsAnalytics(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// CampaignsList - List campaigns
func (c *Container) CampaignsList(ctx echo.Context) error {
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
