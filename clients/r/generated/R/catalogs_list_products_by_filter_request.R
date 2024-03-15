#' @docType class
#' @title CatalogsListProductsByFilterRequest
#'
#' @description CatalogsListProductsByFilterRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsListProductsByFilterRequest <- R6::R6Class(
  "CatalogsListProductsByFilterRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsListProductsByFilterRequestOneOf"),
    #' Initialize a new CatalogsListProductsByFilterRequest.
    #'
    #' @description
    #' Initialize a new CatalogsListProductsByFilterRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsListProductsByFilterRequestOneOf"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsListProductsByFilterRequestOneOf") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsListProductsByFilterRequestOneOf"
      } else {
        stop(paste("Failed to initialize CatalogsListProductsByFilterRequest with oneOf schemas CatalogsListProductsByFilterRequestOneOf. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CatalogsListProductsByFilterRequest.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsListProductsByFilterRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsListProductsByFilterRequest.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CatalogsListProductsByFilterRequest.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsListProductsByFilterRequest.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsListProductsByFilterRequest.
    #' @export
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsListProductsByFilterRequestOneOf_result` <- tryCatch({
          `CatalogsListProductsByFilterRequestOneOf`$public_methods$validateJSON(input)
          `CatalogsListProductsByFilterRequestOneOf_instance` <- `CatalogsListProductsByFilterRequestOneOf`$new()
          instance <- `CatalogsListProductsByFilterRequestOneOf_instance`$fromJSON(input)
          instance_type <- "CatalogsListProductsByFilterRequestOneOf"
          matched_schemas <- append(matched_schemas, "CatalogsListProductsByFilterRequestOneOf")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsListProductsByFilterRequestOneOf_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsListProductsByFilterRequestOneOf_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsListProductsByFilterRequest with oneOf schemas CatalogsListProductsByFilterRequestOneOf. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsListProductsByFilterRequest with oneOf schemas CatalogsListProductsByFilterRequestOneOf. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },
    #' Serialize CatalogsListProductsByFilterRequest to JSON string.
    #'
    #' @description
    #' Serialize CatalogsListProductsByFilterRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsListProductsByFilterRequest.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },
    #' Serialize CatalogsListProductsByFilterRequest to JSON.
    #'
    #' @description
    #' Serialize CatalogsListProductsByFilterRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsListProductsByFilterRequest.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CatalogsListProductsByFilterRequest.
    #'
    #' @description
    #' Validate the input JSON with respect to CatalogsListProductsByFilterRequest and
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
#CatalogsListProductsByFilterRequest$unlock()
#
## Below is an example to define the print function
#CatalogsListProductsByFilterRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsListProductsByFilterRequest$lock()

