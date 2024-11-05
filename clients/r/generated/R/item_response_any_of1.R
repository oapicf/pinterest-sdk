#' @docType class
#' @title ItemResponseAnyOf1
#'
#' @description ItemResponseAnyOf1 Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemResponseAnyOf1 <- R6::R6Class(
  "ItemResponseAnyOf1",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsItemErrorResponse", "CatalogsHotelItemErrorResponse", "CatalogsRetailItemErrorResponse"),

    #' @description
    #' Initialize a new ItemResponseAnyOf1.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsItemErrorResponse", "CatalogsHotelItemErrorResponse", "CatalogsRetailItemErrorResponse"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsItemErrorResponse") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsItemErrorResponse"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelItemErrorResponse") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelItemErrorResponse"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailItemErrorResponse") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailItemErrorResponse"
      } else {
        stop(paste("Failed to initialize ItemResponseAnyOf1 with oneOf schemas CatalogsCreativeAssetsItemErrorResponse, CatalogsHotelItemErrorResponse, CatalogsRetailItemErrorResponse. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemResponseAnyOf1.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ItemResponseAnyOf1.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemResponseAnyOf1.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ItemResponseAnyOf1.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailItemErrorResponse_result` <- tryCatch({
          `CatalogsRetailItemErrorResponse`$public_methods$validateJSON(input)
          `CatalogsRetailItemErrorResponse_instance` <- `CatalogsRetailItemErrorResponse`$new()
          instance <- `CatalogsRetailItemErrorResponse_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailItemErrorResponse"
          matched_schemas <- append(matched_schemas, "CatalogsRetailItemErrorResponse")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailItemErrorResponse_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailItemErrorResponse_result`["message"])
      }

      `CatalogsHotelItemErrorResponse_result` <- tryCatch({
          `CatalogsHotelItemErrorResponse`$public_methods$validateJSON(input)
          `CatalogsHotelItemErrorResponse_instance` <- `CatalogsHotelItemErrorResponse`$new()
          instance <- `CatalogsHotelItemErrorResponse_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelItemErrorResponse"
          matched_schemas <- append(matched_schemas, "CatalogsHotelItemErrorResponse")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelItemErrorResponse_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelItemErrorResponse_result`["message"])
      }

      `CatalogsCreativeAssetsItemErrorResponse_result` <- tryCatch({
          `CatalogsCreativeAssetsItemErrorResponse`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsItemErrorResponse_instance` <- `CatalogsCreativeAssetsItemErrorResponse`$new()
          instance <- `CatalogsCreativeAssetsItemErrorResponse_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsItemErrorResponse"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsItemErrorResponse")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsItemErrorResponse_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsItemErrorResponse_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into ItemResponseAnyOf1 with oneOf schemas CatalogsCreativeAssetsItemErrorResponse, CatalogsHotelItemErrorResponse, CatalogsRetailItemErrorResponse. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into ItemResponseAnyOf1 with oneOf schemas CatalogsCreativeAssetsItemErrorResponse, CatalogsHotelItemErrorResponse, CatalogsRetailItemErrorResponse. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize ItemResponseAnyOf1 to JSON string.
    #'
    #' @return JSON string representation of the ItemResponseAnyOf1.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize ItemResponseAnyOf1 to JSON.
    #'
    #' @return JSON representation of the ItemResponseAnyOf1.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to ItemResponseAnyOf1 and
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
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
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
#ItemResponseAnyOf1$unlock()
#
## Below is an example to define the print function
#ItemResponseAnyOf1$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#ItemResponseAnyOf1$lock()

