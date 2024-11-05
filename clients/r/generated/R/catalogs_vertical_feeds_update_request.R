#' @docType class
#' @title CatalogsVerticalFeedsUpdateRequest
#'
#' @description CatalogsVerticalFeedsUpdateRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsVerticalFeedsUpdateRequest <- R6::R6Class(
  "CatalogsVerticalFeedsUpdateRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsFeedsUpdateRequest", "CatalogsHotelFeedsUpdateRequest", "CatalogsRetailFeedsUpdateRequest"),

    #' @description
    #' Initialize a new CatalogsVerticalFeedsUpdateRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsFeedsUpdateRequest", "CatalogsHotelFeedsUpdateRequest", "CatalogsRetailFeedsUpdateRequest"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsFeedsUpdateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsFeedsUpdateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelFeedsUpdateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelFeedsUpdateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailFeedsUpdateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailFeedsUpdateRequest"
      } else {
        stop(paste("Failed to initialize CatalogsVerticalFeedsUpdateRequest with oneOf schemas CatalogsCreativeAssetsFeedsUpdateRequest, CatalogsHotelFeedsUpdateRequest, CatalogsRetailFeedsUpdateRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalFeedsUpdateRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalFeedsUpdateRequest.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalFeedsUpdateRequest.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalFeedsUpdateRequest.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailFeedsUpdateRequest_result` <- tryCatch({
          `CatalogsRetailFeedsUpdateRequest`$public_methods$validateJSON(input)
          `CatalogsRetailFeedsUpdateRequest_instance` <- `CatalogsRetailFeedsUpdateRequest`$new()
          instance <- `CatalogsRetailFeedsUpdateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailFeedsUpdateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsRetailFeedsUpdateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailFeedsUpdateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailFeedsUpdateRequest_result`["message"])
      }

      `CatalogsHotelFeedsUpdateRequest_result` <- tryCatch({
          `CatalogsHotelFeedsUpdateRequest`$public_methods$validateJSON(input)
          `CatalogsHotelFeedsUpdateRequest_instance` <- `CatalogsHotelFeedsUpdateRequest`$new()
          instance <- `CatalogsHotelFeedsUpdateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelFeedsUpdateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsHotelFeedsUpdateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelFeedsUpdateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelFeedsUpdateRequest_result`["message"])
      }

      `CatalogsCreativeAssetsFeedsUpdateRequest_result` <- tryCatch({
          `CatalogsCreativeAssetsFeedsUpdateRequest`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsFeedsUpdateRequest_instance` <- `CatalogsCreativeAssetsFeedsUpdateRequest`$new()
          instance <- `CatalogsCreativeAssetsFeedsUpdateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsFeedsUpdateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsFeedsUpdateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsFeedsUpdateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsFeedsUpdateRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsVerticalFeedsUpdateRequest with oneOf schemas CatalogsCreativeAssetsFeedsUpdateRequest, CatalogsHotelFeedsUpdateRequest, CatalogsRetailFeedsUpdateRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsVerticalFeedsUpdateRequest with oneOf schemas CatalogsCreativeAssetsFeedsUpdateRequest, CatalogsHotelFeedsUpdateRequest, CatalogsRetailFeedsUpdateRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsVerticalFeedsUpdateRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsVerticalFeedsUpdateRequest.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsVerticalFeedsUpdateRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsVerticalFeedsUpdateRequest.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsVerticalFeedsUpdateRequest and
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
#CatalogsVerticalFeedsUpdateRequest$unlock()
#
## Below is an example to define the print function
#CatalogsVerticalFeedsUpdateRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsVerticalFeedsUpdateRequest$lock()

