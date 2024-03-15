#' @docType class
#' @title CatalogsItemsBatchRequest
#'
#' @description CatalogsItemsBatchRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemsBatchRequest <- R6::R6Class(
  "CatalogsItemsBatchRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsItemsCreateBatchRequest", "CatalogsItemsDeleteBatchRequest", "CatalogsItemsDeleteDiscontinuedBatchRequest", "CatalogsItemsUpdateBatchRequest", "CatalogsItemsUpsertBatchRequest"),
    #' Initialize a new CatalogsItemsBatchRequest.
    #'
    #' @description
    #' Initialize a new CatalogsItemsBatchRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsItemsCreateBatchRequest", "CatalogsItemsDeleteBatchRequest", "CatalogsItemsDeleteDiscontinuedBatchRequest", "CatalogsItemsUpdateBatchRequest", "CatalogsItemsUpsertBatchRequest"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsItemsCreateBatchRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsItemsCreateBatchRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsItemsDeleteBatchRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsItemsDeleteBatchRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsItemsDeleteDiscontinuedBatchRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsItemsDeleteDiscontinuedBatchRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsItemsUpdateBatchRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsItemsUpdateBatchRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsItemsUpsertBatchRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsItemsUpsertBatchRequest"
      } else {
        stop(paste("Failed to initialize CatalogsItemsBatchRequest with oneOf schemas CatalogsItemsCreateBatchRequest, CatalogsItemsDeleteBatchRequest, CatalogsItemsDeleteDiscontinuedBatchRequest, CatalogsItemsUpdateBatchRequest, CatalogsItemsUpsertBatchRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CatalogsItemsBatchRequest.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsBatchRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsItemsBatchRequest.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CatalogsItemsBatchRequest.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsBatchRequest.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsItemsBatchRequest.
    #' @export
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsItemsUpdateBatchRequest_result` <- tryCatch({
          `CatalogsItemsUpdateBatchRequest`$public_methods$validateJSON(input)
          `CatalogsItemsUpdateBatchRequest_instance` <- `CatalogsItemsUpdateBatchRequest`$new()
          instance <- `CatalogsItemsUpdateBatchRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsItemsUpdateBatchRequest"
          matched_schemas <- append(matched_schemas, "CatalogsItemsUpdateBatchRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsItemsUpdateBatchRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsItemsUpdateBatchRequest_result`["message"])
      }

      `CatalogsItemsUpsertBatchRequest_result` <- tryCatch({
          `CatalogsItemsUpsertBatchRequest`$public_methods$validateJSON(input)
          `CatalogsItemsUpsertBatchRequest_instance` <- `CatalogsItemsUpsertBatchRequest`$new()
          instance <- `CatalogsItemsUpsertBatchRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsItemsUpsertBatchRequest"
          matched_schemas <- append(matched_schemas, "CatalogsItemsUpsertBatchRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsItemsUpsertBatchRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsItemsUpsertBatchRequest_result`["message"])
      }

      `CatalogsItemsCreateBatchRequest_result` <- tryCatch({
          `CatalogsItemsCreateBatchRequest`$public_methods$validateJSON(input)
          `CatalogsItemsCreateBatchRequest_instance` <- `CatalogsItemsCreateBatchRequest`$new()
          instance <- `CatalogsItemsCreateBatchRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsItemsCreateBatchRequest"
          matched_schemas <- append(matched_schemas, "CatalogsItemsCreateBatchRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsItemsCreateBatchRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsItemsCreateBatchRequest_result`["message"])
      }

      `CatalogsItemsDeleteDiscontinuedBatchRequest_result` <- tryCatch({
          `CatalogsItemsDeleteDiscontinuedBatchRequest`$public_methods$validateJSON(input)
          `CatalogsItemsDeleteDiscontinuedBatchRequest_instance` <- `CatalogsItemsDeleteDiscontinuedBatchRequest`$new()
          instance <- `CatalogsItemsDeleteDiscontinuedBatchRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsItemsDeleteDiscontinuedBatchRequest"
          matched_schemas <- append(matched_schemas, "CatalogsItemsDeleteDiscontinuedBatchRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsItemsDeleteDiscontinuedBatchRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsItemsDeleteDiscontinuedBatchRequest_result`["message"])
      }

      `CatalogsItemsDeleteBatchRequest_result` <- tryCatch({
          `CatalogsItemsDeleteBatchRequest`$public_methods$validateJSON(input)
          `CatalogsItemsDeleteBatchRequest_instance` <- `CatalogsItemsDeleteBatchRequest`$new()
          instance <- `CatalogsItemsDeleteBatchRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsItemsDeleteBatchRequest"
          matched_schemas <- append(matched_schemas, "CatalogsItemsDeleteBatchRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsItemsDeleteBatchRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsItemsDeleteBatchRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsItemsBatchRequest with oneOf schemas CatalogsItemsCreateBatchRequest, CatalogsItemsDeleteBatchRequest, CatalogsItemsDeleteDiscontinuedBatchRequest, CatalogsItemsUpdateBatchRequest, CatalogsItemsUpsertBatchRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsItemsBatchRequest with oneOf schemas CatalogsItemsCreateBatchRequest, CatalogsItemsDeleteBatchRequest, CatalogsItemsDeleteDiscontinuedBatchRequest, CatalogsItemsUpdateBatchRequest, CatalogsItemsUpsertBatchRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },
    #' Serialize CatalogsItemsBatchRequest to JSON string.
    #'
    #' @description
    #' Serialize CatalogsItemsBatchRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsItemsBatchRequest.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },
    #' Serialize CatalogsItemsBatchRequest to JSON.
    #'
    #' @description
    #' Serialize CatalogsItemsBatchRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsItemsBatchRequest.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CatalogsItemsBatchRequest.
    #'
    #' @description
    #' Validate the input JSON with respect to CatalogsItemsBatchRequest and
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
#CatalogsItemsBatchRequest$unlock()
#
## Below is an example to define the print function
#CatalogsItemsBatchRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsItemsBatchRequest$lock()

