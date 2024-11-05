#' @docType class
#' @title CatalogsVerticalsListProductsByCatalogBasedFilterRequest
#'
#' @description CatalogsVerticalsListProductsByCatalogBasedFilterRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsVerticalsListProductsByCatalogBasedFilterRequest <- R6::R6Class(
  "CatalogsVerticalsListProductsByCatalogBasedFilterRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest", "CatalogsHotelListProductsByCatalogBasedFilterRequest", "CatalogsRetailListProductsByCatalogBasedFilterRequest"),

    #' @description
    #' Initialize a new CatalogsVerticalsListProductsByCatalogBasedFilterRequest.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest", "CatalogsHotelListProductsByCatalogBasedFilterRequest", "CatalogsRetailListProductsByCatalogBasedFilterRequest"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelListProductsByCatalogBasedFilterRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelListProductsByCatalogBasedFilterRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailListProductsByCatalogBasedFilterRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailListProductsByCatalogBasedFilterRequest"
      } else {
        stop(paste("Failed to initialize CatalogsVerticalsListProductsByCatalogBasedFilterRequest with oneOf schemas CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest, CatalogsHotelListProductsByCatalogBasedFilterRequest, CatalogsRetailListProductsByCatalogBasedFilterRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalsListProductsByCatalogBasedFilterRequest.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalsListProductsByCatalogBasedFilterRequest.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalsListProductsByCatalogBasedFilterRequest.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalsListProductsByCatalogBasedFilterRequest.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailListProductsByCatalogBasedFilterRequest_result` <- tryCatch({
          `CatalogsRetailListProductsByCatalogBasedFilterRequest`$public_methods$validateJSON(input)
          `CatalogsRetailListProductsByCatalogBasedFilterRequest_instance` <- `CatalogsRetailListProductsByCatalogBasedFilterRequest`$new()
          instance <- `CatalogsRetailListProductsByCatalogBasedFilterRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailListProductsByCatalogBasedFilterRequest"
          matched_schemas <- append(matched_schemas, "CatalogsRetailListProductsByCatalogBasedFilterRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailListProductsByCatalogBasedFilterRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailListProductsByCatalogBasedFilterRequest_result`["message"])
      }

      `CatalogsHotelListProductsByCatalogBasedFilterRequest_result` <- tryCatch({
          `CatalogsHotelListProductsByCatalogBasedFilterRequest`$public_methods$validateJSON(input)
          `CatalogsHotelListProductsByCatalogBasedFilterRequest_instance` <- `CatalogsHotelListProductsByCatalogBasedFilterRequest`$new()
          instance <- `CatalogsHotelListProductsByCatalogBasedFilterRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelListProductsByCatalogBasedFilterRequest"
          matched_schemas <- append(matched_schemas, "CatalogsHotelListProductsByCatalogBasedFilterRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelListProductsByCatalogBasedFilterRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelListProductsByCatalogBasedFilterRequest_result`["message"])
      }

      `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_result` <- tryCatch({
          `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_instance` <- `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest`$new()
          instance <- `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsVerticalsListProductsByCatalogBasedFilterRequest with oneOf schemas CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest, CatalogsHotelListProductsByCatalogBasedFilterRequest, CatalogsRetailListProductsByCatalogBasedFilterRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsVerticalsListProductsByCatalogBasedFilterRequest with oneOf schemas CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest, CatalogsHotelListProductsByCatalogBasedFilterRequest, CatalogsRetailListProductsByCatalogBasedFilterRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsVerticalsListProductsByCatalogBasedFilterRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsVerticalsListProductsByCatalogBasedFilterRequest.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsVerticalsListProductsByCatalogBasedFilterRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsVerticalsListProductsByCatalogBasedFilterRequest.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsVerticalsListProductsByCatalogBasedFilterRequest and
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
#CatalogsVerticalsListProductsByCatalogBasedFilterRequest$unlock()
#
## Below is an example to define the print function
#CatalogsVerticalsListProductsByCatalogBasedFilterRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsVerticalsListProductsByCatalogBasedFilterRequest$lock()

