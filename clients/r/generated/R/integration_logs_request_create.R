#' Create a new IntegrationLogsRequestCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title IntegrationLogsRequestCreate
#' @description IntegrationLogsRequestCreate Class
#' @format An \code{R6Class} generator object
#' @field logs  list(\link{IntegrationLog})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLogsRequestCreate <- R6::R6Class(
  "IntegrationLogsRequestCreate",
  public = list(
    `logs` = NULL,

    #' @description
    #' Initialize a new IntegrationLogsRequestCreate class.
    #'
    #' @param logs logs
    #' @param ... Other optional arguments.
    initialize = function(`logs`, ...) {
      if (!missing(`logs`)) {
        stopifnot(is.vector(`logs`), length(`logs`) != 0)
        sapply(`logs`, function(x) stopifnot(R6::is.R6(x)))
        self$`logs` <- `logs`
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
    #' @return IntegrationLogsRequestCreate as a base R list.
    #' @examples
    #' # convert array of IntegrationLogsRequestCreate (x) to a data frame
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
    #' Convert IntegrationLogsRequestCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      IntegrationLogsRequestCreateObject <- list()
      if (!is.null(self$`logs`)) {
        IntegrationLogsRequestCreateObject[["logs"]] <-
          self$extractSimpleType(self$`logs`)
      }
      return(IntegrationLogsRequestCreateObject)
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
    #' Deserialize JSON string into an instance of IntegrationLogsRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsRequestCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`logs`)) {
        self$`logs` <- ApiClient$new()$deserializeObj(this_object$`logs`, "array[IntegrationLog]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return IntegrationLogsRequestCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsRequestCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`logs` <- ApiClient$new()$deserializeObj(this_object$`logs`, "array[IntegrationLog]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to IntegrationLogsRequestCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `logs`
      if (!is.null(input_json$`logs`)) {
        stopifnot(is.vector(input_json$`logs`), length(input_json$`logs`) != 0)
        tmp <- sapply(input_json$`logs`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLogsRequestCreate: the required field `logs` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLogsRequestCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `logs` is null
      if (is.null(self$`logs`)) {
        return(FALSE)
      }

      if (length(self$`logs`) > 250) {
        return(FALSE)
      }
      if (length(self$`logs`) < 1) {
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
      # check if the required `logs` is null
      if (is.null(self$`logs`)) {
        invalid_fields["logs"] <- "Non-nullable required field `logs` cannot be null."
      }

      if (length(self$`logs`) > 250) {
        invalid_fields["logs"] <- "Invalid length for `logs`, number of items must be less than or equal to 250."
      }
      if (length(self$`logs`) < 1) {
        invalid_fields["logs"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# IntegrationLogsRequestCreate$unlock()
#
## Below is an example to define the print function
# IntegrationLogsRequestCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogsRequestCreate$lock()

