#' @docType class
#' @title CatalogsFeed
#'
#' @description CatalogsFeed Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeed <- R6::R6Class(
  "CatalogsFeed",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsHotelFeed", "CatalogsRetailFeed"),
    #' Initialize a new CatalogsFeed.
    #'
    #' @description
    #' Initialize a new CatalogsFeed.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsHotelFeed", "CatalogsRetailFeed"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelFeed") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelFeed"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailFeed") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailFeed"
      } else {
        stop(paste("Failed to initialize CatalogsFeed with oneOf schemas CatalogsHotelFeed, CatalogsRetailFeed. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CatalogsFeed.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeed.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsFeed.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CatalogsFeed.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeed.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsFeed.
    #' @export
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailFeed_result` <- tryCatch({
          `CatalogsRetailFeed`$public_methods$validateJSON(input)
          `CatalogsRetailFeed_instance` <- `CatalogsRetailFeed`$new()
          instance <- `CatalogsRetailFeed_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailFeed"
          matched_schemas <- append(matched_schemas, "CatalogsRetailFeed")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailFeed_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailFeed_result`["message"])
      }

      `CatalogsHotelFeed_result` <- tryCatch({
          `CatalogsHotelFeed`$public_methods$validateJSON(input)
          `CatalogsHotelFeed_instance` <- `CatalogsHotelFeed`$new()
          instance <- `CatalogsHotelFeed_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelFeed"
          matched_schemas <- append(matched_schemas, "CatalogsHotelFeed")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelFeed_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelFeed_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsFeed with oneOf schemas CatalogsHotelFeed, CatalogsRetailFeed. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsFeed with oneOf schemas CatalogsHotelFeed, CatalogsRetailFeed. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },
    #' Serialize CatalogsFeed to JSON string.
    #'
    #' @description
    #' Serialize CatalogsFeed to JSON string.
    #'
    #' @return JSON string representation of the CatalogsFeed.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },
    #' Serialize CatalogsFeed to JSON.
    #'
    #' @description
    #' Serialize CatalogsFeed to JSON.
    #'
    #' @return JSON representation of the CatalogsFeed.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CatalogsFeed.
    #'
    #' @description
    #' Validate the input JSON with respect to CatalogsFeed and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    #' @export
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
    #' Returns the string representation of the instance.
    #'
    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    #' @export
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
#CatalogsFeed$unlock()
#
## Below is an example to define the print function
#CatalogsFeed$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsFeed$lock()

