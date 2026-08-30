#' Create a new ConversionDeletionRequestUserEmailTargets
#'
#' @description
#' ConversionDeletionRequestUserEmailTargets Class
#'
#' @docType class
#' @title ConversionDeletionRequestUserEmailTargets
#' @description ConversionDeletionRequestUserEmailTargets Class
#' @format An \code{R6Class} generator object
#' @field user_emails Array of plain text user emails. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionDeletionRequestUserEmailTargets <- R6::R6Class(
  "ConversionDeletionRequestUserEmailTargets",
  public = list(
    `user_emails` = NULL,

    #' @description
    #' Initialize a new ConversionDeletionRequestUserEmailTargets class.
    #'
    #' @param user_emails Array of plain text user emails.
    #' @param ... Other optional arguments.
    initialize = function(`user_emails`, ...) {
      if (!missing(`user_emails`)) {
        stopifnot(is.vector(`user_emails`), length(`user_emails`) != 0)
        sapply(`user_emails`, function(x) stopifnot(is.character(x)))
        self$`user_emails` <- `user_emails`
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
    #' @return ConversionDeletionRequestUserEmailTargets as a base R list.
    #' @examples
    #' # convert array of ConversionDeletionRequestUserEmailTargets (x) to a data frame
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
    #' Convert ConversionDeletionRequestUserEmailTargets to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionDeletionRequestUserEmailTargetsObject <- list()
      if (!is.null(self$`user_emails`)) {
        ConversionDeletionRequestUserEmailTargetsObject[["user_emails"]] <-
          self$`user_emails`
      }
      return(ConversionDeletionRequestUserEmailTargetsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionDeletionRequestUserEmailTargets
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionDeletionRequestUserEmailTargets
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`user_emails`)) {
        self$`user_emails` <- ApiClient$new()$deserializeObj(this_object$`user_emails`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionDeletionRequestUserEmailTargets in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionDeletionRequestUserEmailTargets
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionDeletionRequestUserEmailTargets
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`user_emails` <- ApiClient$new()$deserializeObj(this_object$`user_emails`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionDeletionRequestUserEmailTargets and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `user_emails`
      if (!is.null(input_json$`user_emails`)) {
        stopifnot(is.vector(input_json$`user_emails`), length(input_json$`user_emails`) != 0)
        tmp <- sapply(input_json$`user_emails`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionDeletionRequestUserEmailTargets: the required field `user_emails` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionDeletionRequestUserEmailTargets
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `user_emails` is null
      if (is.null(self$`user_emails`)) {
        return(FALSE)
      }

      if (length(self$`user_emails`) < 1) {
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
      # check if the required `user_emails` is null
      if (is.null(self$`user_emails`)) {
        invalid_fields["user_emails"] <- "Non-nullable required field `user_emails` cannot be null."
      }

      if (length(self$`user_emails`) < 1) {
        invalid_fields["user_emails"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# ConversionDeletionRequestUserEmailTargets$unlock()
#
## Below is an example to define the print function
# ConversionDeletionRequestUserEmailTargets$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionDeletionRequestUserEmailTargets$lock()

