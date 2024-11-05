#' @docType class
#' @title FeedsUpdateRequest
#'
#' @description FeedsUpdateRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedsUpdateRequest <- R6::R6Class(
  "FeedsUpdateRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsFeedsUpdateRequest", "CatalogsVerticalFeedsUpdateRequest"),

    #' @description
    #' Initialize a new FeedsUpdateRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsFeedsUpdateRequest", "CatalogsVerticalFeedsUpdateRequest"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsFeedsUpdateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsFeedsUpdateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsVerticalFeedsUpdateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsVerticalFeedsUpdateRequest"
      } else {
        stop(paste("Failed to initialize FeedsUpdateRequest with oneOf schemas CatalogsFeedsUpdateRequest, CatalogsVerticalFeedsUpdateRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of FeedsUpdateRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of FeedsUpdateRequest.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of FeedsUpdateRequest.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of FeedsUpdateRequest.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsVerticalFeedsUpdateRequest_result` <- tryCatch({
          `CatalogsVerticalFeedsUpdateRequest`$public_methods$validateJSON(input)
          `CatalogsVerticalFeedsUpdateRequest_instance` <- `CatalogsVerticalFeedsUpdateRequest`$new()
          instance <- `CatalogsVerticalFeedsUpdateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsVerticalFeedsUpdateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsVerticalFeedsUpdateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsVerticalFeedsUpdateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsVerticalFeedsUpdateRequest_result`["message"])
      }

      `CatalogsFeedsUpdateRequest_result` <- tryCatch({
          `CatalogsFeedsUpdateRequest`$public_methods$validateJSON(input)
          `CatalogsFeedsUpdateRequest_instance` <- `CatalogsFeedsUpdateRequest`$new()
          instance <- `CatalogsFeedsUpdateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsFeedsUpdateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsFeedsUpdateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsFeedsUpdateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsFeedsUpdateRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into FeedsUpdateRequest with oneOf schemas CatalogsFeedsUpdateRequest, CatalogsVerticalFeedsUpdateRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into FeedsUpdateRequest with oneOf schemas CatalogsFeedsUpdateRequest, CatalogsVerticalFeedsUpdateRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize FeedsUpdateRequest to JSON string.
    #'
    #' @return JSON string representation of the FeedsUpdateRequest.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize FeedsUpdateRequest to JSON.
    #'
    #' @return JSON representation of the FeedsUpdateRequest.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to FeedsUpdateRequest and
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
#FeedsUpdateRequest$unlock()
#
## Below is an example to define the print function
#FeedsUpdateRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#FeedsUpdateRequest$lock()

