#' @docType class
#' @title CatalogsVerticalBatchRequest
#'
#' @description CatalogsVerticalBatchRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsVerticalBatchRequest <- R6::R6Class(
  "CatalogsVerticalBatchRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsBatchRequest", "CatalogsHotelBatchRequest", "CatalogsRetailBatchRequest"),

    #' @description
    #' Initialize a new CatalogsVerticalBatchRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsBatchRequest", "CatalogsHotelBatchRequest", "CatalogsRetailBatchRequest"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsBatchRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsBatchRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelBatchRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelBatchRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailBatchRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailBatchRequest"
      } else {
        stop(paste("Failed to initialize CatalogsVerticalBatchRequest with oneOf schemas CatalogsCreativeAssetsBatchRequest, CatalogsHotelBatchRequest, CatalogsRetailBatchRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalBatchRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalBatchRequest.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalBatchRequest.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalBatchRequest.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailBatchRequest_result` <- tryCatch({
          `CatalogsRetailBatchRequest`$public_methods$validateJSON(input)
          `CatalogsRetailBatchRequest_instance` <- `CatalogsRetailBatchRequest`$new()
          instance <- `CatalogsRetailBatchRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailBatchRequest"
          matched_schemas <- append(matched_schemas, "CatalogsRetailBatchRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailBatchRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailBatchRequest_result`["message"])
      }

      `CatalogsHotelBatchRequest_result` <- tryCatch({
          `CatalogsHotelBatchRequest`$public_methods$validateJSON(input)
          `CatalogsHotelBatchRequest_instance` <- `CatalogsHotelBatchRequest`$new()
          instance <- `CatalogsHotelBatchRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelBatchRequest"
          matched_schemas <- append(matched_schemas, "CatalogsHotelBatchRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelBatchRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelBatchRequest_result`["message"])
      }

      `CatalogsCreativeAssetsBatchRequest_result` <- tryCatch({
          `CatalogsCreativeAssetsBatchRequest`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsBatchRequest_instance` <- `CatalogsCreativeAssetsBatchRequest`$new()
          instance <- `CatalogsCreativeAssetsBatchRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsBatchRequest"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsBatchRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsBatchRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsBatchRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsVerticalBatchRequest with oneOf schemas CatalogsCreativeAssetsBatchRequest, CatalogsHotelBatchRequest, CatalogsRetailBatchRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsVerticalBatchRequest with oneOf schemas CatalogsCreativeAssetsBatchRequest, CatalogsHotelBatchRequest, CatalogsRetailBatchRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsVerticalBatchRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsVerticalBatchRequest.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsVerticalBatchRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsVerticalBatchRequest.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsVerticalBatchRequest and
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
#CatalogsVerticalBatchRequest$unlock()
#
## Below is an example to define the print function
#CatalogsVerticalBatchRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsVerticalBatchRequest$lock()

