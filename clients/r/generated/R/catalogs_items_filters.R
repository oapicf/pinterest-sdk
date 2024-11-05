#' @docType class
#' @title CatalogsItemsFilters
#'
#' @description CatalogsItemsFilters Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemsFilters <- R6::R6Class(
  "CatalogsItemsFilters",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsItemsFilter", "CatalogsHotelItemsFilter", "CatalogsRetailItemsFilter"),

    #' @description
    #' Initialize a new CatalogsItemsFilters.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsItemsFilter", "CatalogsHotelItemsFilter", "CatalogsRetailItemsFilter"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsItemsFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsItemsFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelItemsFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelItemsFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailItemsFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailItemsFilter"
      } else {
        stop(paste("Failed to initialize CatalogsItemsFilters with oneOf schemas CatalogsCreativeAssetsItemsFilter, CatalogsHotelItemsFilter, CatalogsRetailItemsFilter. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsFilters.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsItemsFilters.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsFilters.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsItemsFilters.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailItemsFilter_result` <- tryCatch({
          `CatalogsRetailItemsFilter`$public_methods$validateJSON(input)
          `CatalogsRetailItemsFilter_instance` <- `CatalogsRetailItemsFilter`$new()
          instance <- `CatalogsRetailItemsFilter_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailItemsFilter"
          matched_schemas <- append(matched_schemas, "CatalogsRetailItemsFilter")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailItemsFilter_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailItemsFilter_result`["message"])
      }

      `CatalogsHotelItemsFilter_result` <- tryCatch({
          `CatalogsHotelItemsFilter`$public_methods$validateJSON(input)
          `CatalogsHotelItemsFilter_instance` <- `CatalogsHotelItemsFilter`$new()
          instance <- `CatalogsHotelItemsFilter_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelItemsFilter"
          matched_schemas <- append(matched_schemas, "CatalogsHotelItemsFilter")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelItemsFilter_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelItemsFilter_result`["message"])
      }

      `CatalogsCreativeAssetsItemsFilter_result` <- tryCatch({
          `CatalogsCreativeAssetsItemsFilter`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsItemsFilter_instance` <- `CatalogsCreativeAssetsItemsFilter`$new()
          instance <- `CatalogsCreativeAssetsItemsFilter_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsItemsFilter"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsItemsFilter")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsItemsFilter_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsItemsFilter_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsItemsFilters with oneOf schemas CatalogsCreativeAssetsItemsFilter, CatalogsHotelItemsFilter, CatalogsRetailItemsFilter. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsItemsFilters with oneOf schemas CatalogsCreativeAssetsItemsFilter, CatalogsHotelItemsFilter, CatalogsRetailItemsFilter. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsItemsFilters to JSON string.
    #'
    #' @return JSON string representation of the CatalogsItemsFilters.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsItemsFilters to JSON.
    #'
    #' @return JSON representation of the CatalogsItemsFilters.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsItemsFilters and
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
#CatalogsItemsFilters$unlock()
#
## Below is an example to define the print function
#CatalogsItemsFilters$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsItemsFilters$lock()

