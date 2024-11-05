#' @docType class
#' @title CatalogsVerticalProductGroupUpdateRequest
#'
#' @description CatalogsVerticalProductGroupUpdateRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsVerticalProductGroupUpdateRequest <- R6::R6Class(
  "CatalogsVerticalProductGroupUpdateRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsProductGroupUpdateRequest", "CatalogsHotelProductGroupUpdateRequest", "CatalogsRetailProductGroupUpdateRequest"),

    #' @description
    #' Initialize a new CatalogsVerticalProductGroupUpdateRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsProductGroupUpdateRequest", "CatalogsHotelProductGroupUpdateRequest", "CatalogsRetailProductGroupUpdateRequest"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsProductGroupUpdateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsProductGroupUpdateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelProductGroupUpdateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelProductGroupUpdateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailProductGroupUpdateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailProductGroupUpdateRequest"
      } else {
        stop(paste("Failed to initialize CatalogsVerticalProductGroupUpdateRequest with oneOf schemas CatalogsCreativeAssetsProductGroupUpdateRequest, CatalogsHotelProductGroupUpdateRequest, CatalogsRetailProductGroupUpdateRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalProductGroupUpdateRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalProductGroupUpdateRequest.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalProductGroupUpdateRequest.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalProductGroupUpdateRequest.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailProductGroupUpdateRequest_result` <- tryCatch({
          `CatalogsRetailProductGroupUpdateRequest`$public_methods$validateJSON(input)
          `CatalogsRetailProductGroupUpdateRequest_instance` <- `CatalogsRetailProductGroupUpdateRequest`$new()
          instance <- `CatalogsRetailProductGroupUpdateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailProductGroupUpdateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsRetailProductGroupUpdateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailProductGroupUpdateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailProductGroupUpdateRequest_result`["message"])
      }

      `CatalogsHotelProductGroupUpdateRequest_result` <- tryCatch({
          `CatalogsHotelProductGroupUpdateRequest`$public_methods$validateJSON(input)
          `CatalogsHotelProductGroupUpdateRequest_instance` <- `CatalogsHotelProductGroupUpdateRequest`$new()
          instance <- `CatalogsHotelProductGroupUpdateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelProductGroupUpdateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsHotelProductGroupUpdateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelProductGroupUpdateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelProductGroupUpdateRequest_result`["message"])
      }

      `CatalogsCreativeAssetsProductGroupUpdateRequest_result` <- tryCatch({
          `CatalogsCreativeAssetsProductGroupUpdateRequest`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsProductGroupUpdateRequest_instance` <- `CatalogsCreativeAssetsProductGroupUpdateRequest`$new()
          instance <- `CatalogsCreativeAssetsProductGroupUpdateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsProductGroupUpdateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsProductGroupUpdateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsProductGroupUpdateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsProductGroupUpdateRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsVerticalProductGroupUpdateRequest with oneOf schemas CatalogsCreativeAssetsProductGroupUpdateRequest, CatalogsHotelProductGroupUpdateRequest, CatalogsRetailProductGroupUpdateRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsVerticalProductGroupUpdateRequest with oneOf schemas CatalogsCreativeAssetsProductGroupUpdateRequest, CatalogsHotelProductGroupUpdateRequest, CatalogsRetailProductGroupUpdateRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsVerticalProductGroupUpdateRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsVerticalProductGroupUpdateRequest.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsVerticalProductGroupUpdateRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsVerticalProductGroupUpdateRequest.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsVerticalProductGroupUpdateRequest and
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
#CatalogsVerticalProductGroupUpdateRequest$unlock()
#
## Below is an example to define the print function
#CatalogsVerticalProductGroupUpdateRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsVerticalProductGroupUpdateRequest$lock()

