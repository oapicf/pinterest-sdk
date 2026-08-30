#' Create a new ConversionDeletionRequestCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title ConversionDeletionRequestCreate
#' @description ConversionDeletionRequestCreate Class
#' @format An \code{R6Class} generator object
#' @field deletion_targets Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. \link{ConversionDeletionRequestTargets}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionDeletionRequestCreate <- R6::R6Class(
  "ConversionDeletionRequestCreate",
  public = list(
    `deletion_targets` = NULL,

    #' @description
    #' Initialize a new ConversionDeletionRequestCreate class.
    #'
    #' @param deletion_targets Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
    #' @param ... Other optional arguments.
    initialize = function(`deletion_targets`, ...) {
      if (!missing(`deletion_targets`)) {
        stopifnot(R6::is.R6(`deletion_targets`))
        self$`deletion_targets` <- `deletion_targets`
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
    #' @return ConversionDeletionRequestCreate as a base R list.
    #' @examples
    #' # convert array of ConversionDeletionRequestCreate (x) to a data frame
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
    #' Convert ConversionDeletionRequestCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionDeletionRequestCreateObject <- list()
      if (!is.null(self$`deletion_targets`)) {
        ConversionDeletionRequestCreateObject[["deletion_targets"]] <-
          self$extractSimpleType(self$`deletion_targets`)
      }
      return(ConversionDeletionRequestCreateObject)
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
    #' Deserialize JSON string into an instance of ConversionDeletionRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionDeletionRequestCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deletion_targets`)) {
        `deletion_targets_object` <- ConversionDeletionRequestTargets$new()
        `deletion_targets_object`$fromJSON(jsonlite::toJSON(this_object$`deletion_targets`, auto_unbox = TRUE, digits = NA))
        self$`deletion_targets` <- `deletion_targets_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionDeletionRequestCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionDeletionRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionDeletionRequestCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deletion_targets` <- ConversionDeletionRequestTargets$new()$fromJSON(jsonlite::toJSON(this_object$`deletion_targets`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionDeletionRequestCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `deletion_targets`
      if (!is.null(input_json$`deletion_targets`)) {
        stopifnot(R6::is.R6(input_json$`deletion_targets`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionDeletionRequestCreate: the required field `deletion_targets` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionDeletionRequestCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `deletion_targets` is null
      if (is.null(self$`deletion_targets`)) {
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
      # check if the required `deletion_targets` is null
      if (is.null(self$`deletion_targets`)) {
        invalid_fields["deletion_targets"] <- "Non-nullable required field `deletion_targets` cannot be null."
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
# ConversionDeletionRequestCreate$unlock()
#
## Below is an example to define the print function
# ConversionDeletionRequestCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionDeletionRequestCreate$lock()

