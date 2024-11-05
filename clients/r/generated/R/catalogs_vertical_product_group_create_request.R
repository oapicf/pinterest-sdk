#' @docType class
#' @title CatalogsVerticalProductGroupCreateRequest
#'
#' @description CatalogsVerticalProductGroupCreateRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsVerticalProductGroupCreateRequest <- R6::R6Class(
  "CatalogsVerticalProductGroupCreateRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsProductGroupCreateRequest", "CatalogsHotelProductGroupCreateRequest", "CatalogsRetailProductGroupCreateRequest"),

    #' @description
    #' Initialize a new CatalogsVerticalProductGroupCreateRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsProductGroupCreateRequest", "CatalogsHotelProductGroupCreateRequest", "CatalogsRetailProductGroupCreateRequest"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsProductGroupCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsProductGroupCreateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelProductGroupCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelProductGroupCreateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailProductGroupCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailProductGroupCreateRequest"
      } else {
        stop(paste("Failed to initialize CatalogsVerticalProductGroupCreateRequest with oneOf schemas CatalogsCreativeAssetsProductGroupCreateRequest, CatalogsHotelProductGroupCreateRequest, CatalogsRetailProductGroupCreateRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalProductGroupCreateRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalProductGroupCreateRequest.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalProductGroupCreateRequest.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalProductGroupCreateRequest.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailProductGroupCreateRequest_result` <- tryCatch({
          `CatalogsRetailProductGroupCreateRequest`$public_methods$validateJSON(input)
          `CatalogsRetailProductGroupCreateRequest_instance` <- `CatalogsRetailProductGroupCreateRequest`$new()
          instance <- `CatalogsRetailProductGroupCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailProductGroupCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsRetailProductGroupCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailProductGroupCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailProductGroupCreateRequest_result`["message"])
      }

      `CatalogsHotelProductGroupCreateRequest_result` <- tryCatch({
          `CatalogsHotelProductGroupCreateRequest`$public_methods$validateJSON(input)
          `CatalogsHotelProductGroupCreateRequest_instance` <- `CatalogsHotelProductGroupCreateRequest`$new()
          instance <- `CatalogsHotelProductGroupCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelProductGroupCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsHotelProductGroupCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelProductGroupCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelProductGroupCreateRequest_result`["message"])
      }

      `CatalogsCreativeAssetsProductGroupCreateRequest_result` <- tryCatch({
          `CatalogsCreativeAssetsProductGroupCreateRequest`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsProductGroupCreateRequest_instance` <- `CatalogsCreativeAssetsProductGroupCreateRequest`$new()
          instance <- `CatalogsCreativeAssetsProductGroupCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsProductGroupCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsProductGroupCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsProductGroupCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsProductGroupCreateRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsVerticalProductGroupCreateRequest with oneOf schemas CatalogsCreativeAssetsProductGroupCreateRequest, CatalogsHotelProductGroupCreateRequest, CatalogsRetailProductGroupCreateRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsVerticalProductGroupCreateRequest with oneOf schemas CatalogsCreativeAssetsProductGroupCreateRequest, CatalogsHotelProductGroupCreateRequest, CatalogsRetailProductGroupCreateRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsVerticalProductGroupCreateRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsVerticalProductGroupCreateRequest.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsVerticalProductGroupCreateRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsVerticalProductGroupCreateRequest.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsVerticalProductGroupCreateRequest and
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
#CatalogsVerticalProductGroupCreateRequest$unlock()
#
## Below is an example to define the print function
#CatalogsVerticalProductGroupCreateRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsVerticalProductGroupCreateRequest$lock()

