#' @docType class
#' @title FeedsCreateRequest
#'
#' @description FeedsCreateRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedsCreateRequest <- R6::R6Class(
  "FeedsCreateRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsFeedsCreateRequest", "CatalogsVerticalFeedsCreateRequest"),
    #' Initialize a new FeedsCreateRequest.
    #'
    #' @description
    #' Initialize a new FeedsCreateRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsFeedsCreateRequest", "CatalogsVerticalFeedsCreateRequest"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsFeedsCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsFeedsCreateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsVerticalFeedsCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsVerticalFeedsCreateRequest"
      } else {
        stop(paste("Failed to initialize FeedsCreateRequest with oneOf schemas CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of FeedsCreateRequest.
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedsCreateRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #' @return An instance of FeedsCreateRequest.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of FeedsCreateRequest.
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedsCreateRequest.
    #'
    #' @param input The input JSON.
    #' @return An instance of FeedsCreateRequest.
    #' @export
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsVerticalFeedsCreateRequest_result` <- tryCatch({
          `CatalogsVerticalFeedsCreateRequest`$public_methods$validateJSON(input)
          `CatalogsVerticalFeedsCreateRequest_instance` <- `CatalogsVerticalFeedsCreateRequest`$new()
          instance <- `CatalogsVerticalFeedsCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsVerticalFeedsCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsVerticalFeedsCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsVerticalFeedsCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsVerticalFeedsCreateRequest_result`["message"])
      }

      `CatalogsFeedsCreateRequest_result` <- tryCatch({
          `CatalogsFeedsCreateRequest`$public_methods$validateJSON(input)
          `CatalogsFeedsCreateRequest_instance` <- `CatalogsFeedsCreateRequest`$new()
          instance <- `CatalogsFeedsCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsFeedsCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsFeedsCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsFeedsCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsFeedsCreateRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into FeedsCreateRequest with oneOf schemas CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into FeedsCreateRequest with oneOf schemas CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },
    #' Serialize FeedsCreateRequest to JSON string.
    #'
    #' @description
    #' Serialize FeedsCreateRequest to JSON string.
    #'
    #' @return JSON string representation of the FeedsCreateRequest.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },
    #' Serialize FeedsCreateRequest to JSON.
    #'
    #' @description
    #' Serialize FeedsCreateRequest to JSON.
    #'
    #' @return JSON representation of the FeedsCreateRequest.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to FeedsCreateRequest.
    #'
    #' @description
    #' Validate the input JSON with respect to FeedsCreateRequest and
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
#FeedsCreateRequest$unlock()
#
## Below is an example to define the print function
#FeedsCreateRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#FeedsCreateRequest$lock()

