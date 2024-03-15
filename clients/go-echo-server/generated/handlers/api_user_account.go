package handlers
import (
	"github.com/oapicf/pinterest-sdk/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// BoardsUserFollowsList - List following boards
func (c *Container) BoardsUserFollowsList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// FollowUserUpdate - Follow user
func (c *Container) FollowUserUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// FollowersList - List followers
func (c *Container) FollowersList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// LinkedBusinessAccountsGet - List linked businesses
func (c *Container) LinkedBusinessAccountsGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UnverifyWebsiteDelete - Unverify website
func (c *Container) UnverifyWebsiteDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UserAccountAnalytics - Get user account analytics
func (c *Container) UserAccountAnalytics(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UserAccountAnalyticsTopPins - Get user account top pins analytics
func (c *Container) UserAccountAnalyticsTopPins(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UserAccountAnalyticsTopVideoPins - Get user account top video pins analytics
func (c *Container) UserAccountAnalyticsTopVideoPins(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UserAccountFollowedInterests - List following interests
func (c *Container) UserAccountFollowedInterests(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UserAccountGet - Get user account
func (c *Container) UserAccountGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UserFollowingGet - List following
func (c *Container) UserFollowingGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UserWebsitesGet - Get user websites
func (c *Container) UserWebsitesGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// VerifyWebsiteUpdate - Verify website
func (c *Container) VerifyWebsiteUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// WebsiteVerificationGet - Get user verification code for website claiming
func (c *Container) WebsiteVerificationGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

