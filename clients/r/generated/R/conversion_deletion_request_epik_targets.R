#' Create a new ConversionDeletionRequestEPIKTargets
#'
#' @description
#' ConversionDeletionRequestEPIKTargets Class
#'
#' @docType class
#' @title ConversionDeletionRequestEPIKTargets
#' @description ConversionDeletionRequestEPIKTargets Class
#' @format An \code{R6Class} generator object
#' @field epiks Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionDeletionRequestEPIKTargets <- R6::R6Class(
  "ConversionDeletionRequestEPIKTargets",
  public = list(
    `epiks` = NULL,

    #' @description
    #' Initialize a new ConversionDeletionRequestEPIKTargets class.
    #'
    #' @param epiks Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
    #' @param ... Other optional arguments.
    initialize = function(`epiks`, ...) {
      if (!missing(`epiks`)) {
        stopifnot(is.vector(`epiks`), length(`epiks`) != 0)
        sapply(`epiks`, function(x) stopifnot(is.character(x)))
        self$`epiks` <- `epiks`
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
    #' @return ConversionDeletionRequestEPIKTargets as a base R list.
    #' @examples
    #' # convert array of ConversionDeletionRequestEPIKTargets (x) to a data frame
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
    #' Convert ConversionDeletionRequestEPIKTargets to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionDeletionRequestEPIKTargetsObject <- list()
      if (!is.null(self$`epiks`)) {
        ConversionDeletionRequestEPIKTargetsObject[["epiks"]] <-
          self$`epiks`
      }
      return(ConversionDeletionRequestEPIKTargetsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionDeletionRequestEPIKTargets
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionDeletionRequestEPIKTargets
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`epiks`)) {
        self$`epiks` <- ApiClient$new()$deserializeObj(this_object$`epiks`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionDeletionRequestEPIKTargets in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionDeletionRequestEPIKTargets
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionDeletionRequestEPIKTargets
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`epiks` <- ApiClient$new()$deserializeObj(this_object$`epiks`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionDeletionRequestEPIKTargets and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `epiks`
      if (!is.null(input_json$`epiks`)) {
        stopifnot(is.vector(input_json$`epiks`), length(input_json$`epiks`) != 0)
        tmp <- sapply(input_json$`epiks`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionDeletionRequestEPIKTargets: the required field `epiks` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionDeletionRequestEPIKTargets
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `epiks` is null
      if (is.null(self$`epiks`)) {
        return(FALSE)
      }

      if (length(self$`epiks`) < 1) {
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
      # check if the required `epiks` is null
      if (is.null(self$`epiks`)) {
        invalid_fields["epiks"] <- "Non-nullable required field `epiks` cannot be null."
      }

      if (length(self$`epiks`) < 1) {
        invalid_fields["epiks"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# ConversionDeletionRequestEPIKTargets$unlock()
#
## Below is an example to define the print function
# ConversionDeletionRequestEPIKTargets$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionDeletionRequestEPIKTargets$lock()

