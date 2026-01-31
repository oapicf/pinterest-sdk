#' Create a new ConversionHealthSelectionItem
#'
#' @description
#' User selection of conversion health criteria for a single feature
#'
#' @docType class
#' @title ConversionHealthSelectionItem
#' @description ConversionHealthSelectionItem Class
#' @format An \code{R6Class} generator object
#' @field conversionType Status for conversion types object [optional]
#' @field criteria Status for criteria object [optional]
#' @field ingestionSource Status for ingestion sources object [optional]
#' @field status Overall status for this selection item \link{AnyType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionHealthSelectionItem <- R6::R6Class(
  "ConversionHealthSelectionItem",
  public = list(
    `conversionType` = NULL,
    `criteria` = NULL,
    `ingestionSource` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new ConversionHealthSelectionItem class.
    #'
    #' @param status Overall status for this selection item
    #' @param conversionType Status for conversion types
    #' @param criteria Status for criteria
    #' @param ingestionSource Status for ingestion sources
    #' @param ... Other optional arguments.
    initialize = function(`status`, `conversionType` = NULL, `criteria` = NULL, `ingestionSource` = NULL, ...) {
      if (!missing(`status`)) {
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`conversionType`)) {
        self$`conversionType` <- `conversionType`
      }
      if (!is.null(`criteria`)) {
        self$`criteria` <- `criteria`
      }
      if (!is.null(`ingestionSource`)) {
        self$`ingestionSource` <- `ingestionSource`
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
    #' @return ConversionHealthSelectionItem as a base R list.
    #' @examples
    #' # convert array of ConversionHealthSelectionItem (x) to a data frame
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
    #' Convert ConversionHealthSelectionItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionHealthSelectionItemObject <- list()
      if (!is.null(self$`conversionType`)) {
        ConversionHealthSelectionItemObject[["conversionType"]] <-
          self$`conversionType`
      }
      if (!is.null(self$`criteria`)) {
        ConversionHealthSelectionItemObject[["criteria"]] <-
          self$`criteria`
      }
      if (!is.null(self$`ingestionSource`)) {
        ConversionHealthSelectionItemObject[["ingestionSource"]] <-
          self$`ingestionSource`
      }
      if (!is.null(self$`status`)) {
        ConversionHealthSelectionItemObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      return(ConversionHealthSelectionItemObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionHealthSelectionItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionHealthSelectionItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`conversionType`)) {
        self$`conversionType` <- this_object$`conversionType`
      }
      if (!is.null(this_object$`criteria`)) {
        self$`criteria` <- this_object$`criteria`
      }
      if (!is.null(this_object$`ingestionSource`)) {
        self$`ingestionSource` <- this_object$`ingestionSource`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- AnyType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionHealthSelectionItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionHealthSelectionItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionHealthSelectionItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`conversionType` <- this_object$`conversionType`
      self$`criteria` <- this_object$`criteria`
      self$`ingestionSource` <- this_object$`ingestionSource`
      self$`status` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionHealthSelectionItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionHealthSelectionItem: the required field `status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionHealthSelectionItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# ConversionHealthSelectionItem$unlock()
#
## Below is an example to define the print function
# ConversionHealthSelectionItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionHealthSelectionItem$lock()

