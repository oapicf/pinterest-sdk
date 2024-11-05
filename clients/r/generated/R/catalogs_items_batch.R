#' @docType class
#' @title CatalogsItemsBatch
#'
#' @description CatalogsItemsBatch Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemsBatch <- R6::R6Class(
  "CatalogsItemsBatch",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsItemsBatch", "CatalogsHotelItemsBatch", "CatalogsRetailItemsBatch"),

    #' @description
    #' Initialize a new CatalogsItemsBatch.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsItemsBatch", "CatalogsHotelItemsBatch", "CatalogsRetailItemsBatch"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsItemsBatch") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsItemsBatch"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelItemsBatch") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelItemsBatch"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailItemsBatch") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailItemsBatch"
      } else {
        stop(paste("Failed to initialize CatalogsItemsBatch with oneOf schemas CatalogsCreativeAssetsItemsBatch, CatalogsHotelItemsBatch, CatalogsRetailItemsBatch. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsBatch.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsItemsBatch.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsBatch.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsItemsBatch.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailItemsBatch_result` <- tryCatch({
          `CatalogsRetailItemsBatch`$public_methods$validateJSON(input)
          `CatalogsRetailItemsBatch_instance` <- `CatalogsRetailItemsBatch`$new()
          instance <- `CatalogsRetailItemsBatch_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailItemsBatch"
          matched_schemas <- append(matched_schemas, "CatalogsRetailItemsBatch")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailItemsBatch_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailItemsBatch_result`["message"])
      }

      `CatalogsHotelItemsBatch_result` <- tryCatch({
          `CatalogsHotelItemsBatch`$public_methods$validateJSON(input)
          `CatalogsHotelItemsBatch_instance` <- `CatalogsHotelItemsBatch`$new()
          instance <- `CatalogsHotelItemsBatch_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelItemsBatch"
          matched_schemas <- append(matched_schemas, "CatalogsHotelItemsBatch")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelItemsBatch_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelItemsBatch_result`["message"])
      }

      `CatalogsCreativeAssetsItemsBatch_result` <- tryCatch({
          `CatalogsCreativeAssetsItemsBatch`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsItemsBatch_instance` <- `CatalogsCreativeAssetsItemsBatch`$new()
          instance <- `CatalogsCreativeAssetsItemsBatch_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsItemsBatch"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsItemsBatch")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsItemsBatch_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsItemsBatch_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsItemsBatch with oneOf schemas CatalogsCreativeAssetsItemsBatch, CatalogsHotelItemsBatch, CatalogsRetailItemsBatch. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsItemsBatch with oneOf schemas CatalogsCreativeAssetsItemsBatch, CatalogsHotelItemsBatch, CatalogsRetailItemsBatch. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsItemsBatch to JSON string.
    #'
    #' @return JSON string representation of the CatalogsItemsBatch.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsItemsBatch to JSON.
    #'
    #' @return JSON representation of the CatalogsItemsBatch.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsItemsBatch and
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
#CatalogsItemsBatch$unlock()
#
## Below is an example to define the print function
#CatalogsItemsBatch$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsItemsBatch$lock()

