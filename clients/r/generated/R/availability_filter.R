#' Create a new AvailabilityFilter
#'
#' @description
#' AvailabilityFilter Class
#'
#' @docType class
#' @title AvailabilityFilter
#' @description AvailabilityFilter Class
#' @format An \code{R6Class} generator object
#' @field AVAILABILITY  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AvailabilityFilter <- R6::R6Class(
  "AvailabilityFilter",
  public = list(
    `AVAILABILITY` = NULL,

    #' @description
    #' Initialize a new AvailabilityFilter class.
    #'
    #' @param AVAILABILITY AVAILABILITY
    #' @param ... Other optional arguments.
    initialize = function(`AVAILABILITY`, ...) {
      if (!missing(`AVAILABILITY`)) {
        stopifnot(R6::is.R6(`AVAILABILITY`))
        self$`AVAILABILITY` <- `AVAILABILITY`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return AvailabilityFilter as a base R list.
    #' @examples
    #' # convert array of AvailabilityFilter (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert AvailabilityFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AvailabilityFilterObject <- list()
      if (!is.null(self$`AVAILABILITY`)) {
        AvailabilityFilterObject[["AVAILABILITY"]] <-
          self$extractSimpleType(self$`AVAILABILITY`)
      }
      return(AvailabilityFilterObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of AvailabilityFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of AvailabilityFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AVAILABILITY`)) {
        `availability_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `availability_object`$fromJSON(jsonlite::toJSON(this_object$`AVAILABILITY`, auto_unbox = TRUE, digits = NA))
        self$`AVAILABILITY` <- `availability_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AvailabilityFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AvailabilityFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of AvailabilityFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AVAILABILITY` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`AVAILABILITY`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AvailabilityFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `AVAILABILITY`
      if (!is.null(input_json$`AVAILABILITY`)) {
        stopifnot(R6::is.R6(input_json$`AVAILABILITY`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AvailabilityFilter: the required field `AVAILABILITY` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AvailabilityFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `AVAILABILITY` is null
      if (is.null(self$`AVAILABILITY`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `AVAILABILITY` is null
      if (is.null(self$`AVAILABILITY`)) {
        invalid_fields["AVAILABILITY"] <- "Non-nullable required field `AVAILABILITY` cannot be null."
      }

      invalid_fields
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
# AvailabilityFilter$unlock()
#
## Below is an example to define the print function
# AvailabilityFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AvailabilityFilter$lock()

