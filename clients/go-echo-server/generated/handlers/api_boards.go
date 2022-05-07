package handlers
import (
    "github.com/GIT_USER_ID/GIT_REPO_ID/models"
    "github.com/labstack/echo/v4"
    "net/http"
)

// BoardSectionsCreate - Create board section
func (c *Container) BoardSectionsCreate(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardSectionsDelete - Delete board section
func (c *Container) BoardSectionsDelete(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardSectionsList - List board sections
func (c *Container) BoardSectionsList(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardSectionsListPins - List Pins on board section
func (c *Container) BoardSectionsListPins(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardSectionsUpdate - Update board section
func (c *Container) BoardSectionsUpdate(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardsCreate - Create board
func (c *Container) BoardsCreate(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardsDelete - Delete board
func (c *Container) BoardsDelete(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardsGet - Get board
func (c *Container) BoardsGet(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardsList - List boards
func (c *Container) BoardsList(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardsListPins - List Pins on board
func (c *Container) BoardsListPins(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// BoardsUpdate - Update board
func (c *Container) BoardsUpdate(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}
