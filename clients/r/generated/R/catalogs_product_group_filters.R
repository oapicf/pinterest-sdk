#' @docType class
#' @title CatalogsProductGroupFilters
#'
#' @description CatalogsProductGroupFilters Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupFilters <- R6::R6Class(
  "CatalogsProductGroupFilters",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("CatalogsProductGroupFiltersAllOf", "CatalogsProductGroupFiltersAnyOf"),
    #' Initialize a new CatalogsProductGroupFilters.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupFilters.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "CatalogsProductGroupFiltersAllOf", "CatalogsProductGroupFiltersAnyOf"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsProductGroupFiltersAllOf") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsProductGroupFiltersAllOf"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsProductGroupFiltersAnyOf") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsProductGroupFiltersAnyOf"
      } else {
        stop(paste("Failed to initialize CatalogsProductGroupFilters with anyOf schemas CatalogsProductGroupFiltersAllOf, CatalogsProductGroupFiltersAnyOf. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilters.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilters.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsProductGroupFilters.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilters.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilters.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsProductGroupFilters.
    #' @export
    fromJSON = function(input) {
      error_messages <- list()

      `CatalogsProductGroupFiltersAnyOf_result` <- tryCatch({
          `CatalogsProductGroupFiltersAnyOf`$public_methods$validateJSON(input)
          `CatalogsProductGroupFiltersAnyOf_instance` <- `CatalogsProductGroupFiltersAnyOf`$new()
          self$actual_instance <- `CatalogsProductGroupFiltersAnyOf_instance`$fromJSON(input)
          self$actual_type <- "CatalogsProductGroupFiltersAnyOf"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsProductGroupFiltersAnyOf_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsProductGroupFiltersAnyOf_result`["message"])
      }

      `CatalogsProductGroupFiltersAllOf_result` <- tryCatch({
          `CatalogsProductGroupFiltersAllOf`$public_methods$validateJSON(input)
          `CatalogsProductGroupFiltersAllOf_instance` <- `CatalogsProductGroupFiltersAllOf`$new()
          self$actual_instance <- `CatalogsProductGroupFiltersAllOf_instance`$fromJSON(input)
          self$actual_type <- "CatalogsProductGroupFiltersAllOf"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsProductGroupFiltersAllOf_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsProductGroupFiltersAllOf_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsProductGroupFilters with anyOf schemas CatalogsProductGroupFiltersAllOf, CatalogsProductGroupFiltersAnyOf. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },
    #' Serialize CatalogsProductGroupFilters to JSON string.
    #'
    #' @description
    #' Serialize CatalogsProductGroupFilters to JSON string.
    #'
    #' @return JSON string representation of the CatalogsProductGroupFilters.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },
    #' Serialize CatalogsProductGroupFilters to JSON.
    #'
    #' @description
    #' Serialize CatalogsProductGroupFilters to JSON.
    #'
    #' @return JSON representation of the CatalogsProductGroupFilters.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CatalogsProductGroupFilters.
    #'
    #' @description
    #' Validate the input JSON with respect to CatalogsProductGroupFilters and
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
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
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
#CatalogsProductGroupFilters$unlock()
#
## Below is an example to define the print function
#CatalogsProductGroupFilters$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsProductGroupFilters$lock()

