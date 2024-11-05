#' @docType class
#' @title CatalogsVerticalFeedsCreateRequest
#'
#' @description CatalogsVerticalFeedsCreateRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsVerticalFeedsCreateRequest <- R6::R6Class(
  "CatalogsVerticalFeedsCreateRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsFeedsCreateRequest", "CatalogsHotelFeedsCreateRequest", "CatalogsRetailFeedsCreateRequest"),

    #' @description
    #' Initialize a new CatalogsVerticalFeedsCreateRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsFeedsCreateRequest", "CatalogsHotelFeedsCreateRequest", "CatalogsRetailFeedsCreateRequest"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsFeedsCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsFeedsCreateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelFeedsCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelFeedsCreateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailFeedsCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailFeedsCreateRequest"
      } else {
        stop(paste("Failed to initialize CatalogsVerticalFeedsCreateRequest with oneOf schemas CatalogsCreativeAssetsFeedsCreateRequest, CatalogsHotelFeedsCreateRequest, CatalogsRetailFeedsCreateRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalFeedsCreateRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalFeedsCreateRequest.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalFeedsCreateRequest.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalFeedsCreateRequest.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailFeedsCreateRequest_result` <- tryCatch({
          `CatalogsRetailFeedsCreateRequest`$public_methods$validateJSON(input)
          `CatalogsRetailFeedsCreateRequest_instance` <- `CatalogsRetailFeedsCreateRequest`$new()
          instance <- `CatalogsRetailFeedsCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailFeedsCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsRetailFeedsCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailFeedsCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailFeedsCreateRequest_result`["message"])
      }

      `CatalogsHotelFeedsCreateRequest_result` <- tryCatch({
          `CatalogsHotelFeedsCreateRequest`$public_methods$validateJSON(input)
          `CatalogsHotelFeedsCreateRequest_instance` <- `CatalogsHotelFeedsCreateRequest`$new()
          instance <- `CatalogsHotelFeedsCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelFeedsCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsHotelFeedsCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelFeedsCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelFeedsCreateRequest_result`["message"])
      }

      `CatalogsCreativeAssetsFeedsCreateRequest_result` <- tryCatch({
          `CatalogsCreativeAssetsFeedsCreateRequest`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsFeedsCreateRequest_instance` <- `CatalogsCreativeAssetsFeedsCreateRequest`$new()
          instance <- `CatalogsCreativeAssetsFeedsCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsFeedsCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsFeedsCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsFeedsCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsFeedsCreateRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsVerticalFeedsCreateRequest with oneOf schemas CatalogsCreativeAssetsFeedsCreateRequest, CatalogsHotelFeedsCreateRequest, CatalogsRetailFeedsCreateRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsVerticalFeedsCreateRequest with oneOf schemas CatalogsCreativeAssetsFeedsCreateRequest, CatalogsHotelFeedsCreateRequest, CatalogsRetailFeedsCreateRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsVerticalFeedsCreateRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsVerticalFeedsCreateRequest.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsVerticalFeedsCreateRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsVerticalFeedsCreateRequest.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsVerticalFeedsCreateRequest and
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
#CatalogsVerticalFeedsCreateRequest$unlock()
#
## Below is an example to define the print function
#CatalogsVerticalFeedsCreateRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsVerticalFeedsCreateRequest$lock()

