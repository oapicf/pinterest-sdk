#' @docType class
#' @title CatalogsItemsPostFilters
#'
#' @description CatalogsItemsPostFilters Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemsPostFilters <- R6::R6Class(
  "CatalogsItemsPostFilters",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsItemsPostFilter", "CatalogsHotelItemsPostFilter", "CatalogsRetailItemsPostFilter"),

    #' @description
    #' Initialize a new CatalogsItemsPostFilters.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsItemsPostFilter", "CatalogsHotelItemsPostFilter", "CatalogsRetailItemsPostFilter"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsItemsPostFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsItemsPostFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelItemsPostFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelItemsPostFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailItemsPostFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailItemsPostFilter"
      } else {
        stop(paste("Failed to initialize CatalogsItemsPostFilters with oneOf schemas CatalogsCreativeAssetsItemsPostFilter, CatalogsHotelItemsPostFilter, CatalogsRetailItemsPostFilter. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsPostFilters.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsItemsPostFilters.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsPostFilters.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsItemsPostFilters.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailItemsPostFilter_result` <- tryCatch({
          `CatalogsRetailItemsPostFilter`$public_methods$validateJSON(input)
          `CatalogsRetailItemsPostFilter_instance` <- `CatalogsRetailItemsPostFilter`$new()
          instance <- `CatalogsRetailItemsPostFilter_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailItemsPostFilter"
          matched_schemas <- append(matched_schemas, "CatalogsRetailItemsPostFilter")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailItemsPostFilter_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailItemsPostFilter_result`["message"])
      }

      `CatalogsHotelItemsPostFilter_result` <- tryCatch({
          `CatalogsHotelItemsPostFilter`$public_methods$validateJSON(input)
          `CatalogsHotelItemsPostFilter_instance` <- `CatalogsHotelItemsPostFilter`$new()
          instance <- `CatalogsHotelItemsPostFilter_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelItemsPostFilter"
          matched_schemas <- append(matched_schemas, "CatalogsHotelItemsPostFilter")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelItemsPostFilter_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelItemsPostFilter_result`["message"])
      }

      `CatalogsCreativeAssetsItemsPostFilter_result` <- tryCatch({
          `CatalogsCreativeAssetsItemsPostFilter`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsItemsPostFilter_instance` <- `CatalogsCreativeAssetsItemsPostFilter`$new()
          instance <- `CatalogsCreativeAssetsItemsPostFilter_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsItemsPostFilter"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsItemsPostFilter")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsItemsPostFilter_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsItemsPostFilter_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsItemsPostFilters with oneOf schemas CatalogsCreativeAssetsItemsPostFilter, CatalogsHotelItemsPostFilter, CatalogsRetailItemsPostFilter. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsItemsPostFilters with oneOf schemas CatalogsCreativeAssetsItemsPostFilter, CatalogsHotelItemsPostFilter, CatalogsRetailItemsPostFilter. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsItemsPostFilters to JSON string.
    #'
    #' @return JSON string representation of the CatalogsItemsPostFilters.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsItemsPostFilters to JSON.
    #'
    #' @return JSON representation of the CatalogsItemsPostFilters.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsItemsPostFilters and
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
#CatalogsItemsPostFilters$unlock()
#
## Below is an example to define the print function
#CatalogsItemsPostFilters$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsItemsPostFilters$lock()

