#' @docType class
#' @title CatalogsFeedsCreateRequestDefaultLocale
#'
#' @description CatalogsFeedsCreateRequestDefaultLocale Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedsCreateRequestDefaultLocale <- R6::R6Class(
  "CatalogsFeedsCreateRequestDefaultLocale",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("CatalogsLocale", "character"),

    #' @description
    #' Initialize a new CatalogsFeedsCreateRequestDefaultLocale.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "CatalogsLocale", "character"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsLocale") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsLocale"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "character") {
        self$actual_instance <- instance
        self$actual_type <- "character"
      } else {
        stop(paste("Failed to initialize CatalogsFeedsCreateRequestDefaultLocale with anyOf schemas CatalogsLocale, character. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedsCreateRequestDefaultLocale.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsFeedsCreateRequestDefaultLocale.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedsCreateRequestDefaultLocale.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsFeedsCreateRequestDefaultLocale.
    fromJSON = function(input) {
      error_messages <- list()

      `CatalogsLocale_result` <- tryCatch({
          `CatalogsLocale`$public_methods$validateJSON(input)
          `CatalogsLocale_instance` <- `CatalogsLocale`$new()
          self$actual_instance <- `CatalogsLocale_instance`$fromJSON(input)
          self$actual_type <- "CatalogsLocale"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsLocale_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsLocale_result`["message"])
      }

      `character_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "character") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "character", typeof(instance)))
          }
          self$actual_instance <- `character_instance`$fromJSON(input)
          self$actual_type <- "character"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`character_result`["error"])) {
        error_messages <- append(error_messages, `character_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsFeedsCreateRequestDefaultLocale with anyOf schemas CatalogsLocale, character. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize CatalogsFeedsCreateRequestDefaultLocale to JSON string.
    #'
    #' @return JSON string representation of the CatalogsFeedsCreateRequestDefaultLocale.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsFeedsCreateRequestDefaultLocale to JSON.
    #'
    #' @return JSON representation of the CatalogsFeedsCreateRequestDefaultLocale.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsFeedsCreateRequestDefaultLocale and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
#CatalogsFeedsCreateRequestDefaultLocale$unlock()
#
## Below is an example to define the print function
#CatalogsFeedsCreateRequestDefaultLocale$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsFeedsCreateRequestDefaultLocale$lock()

