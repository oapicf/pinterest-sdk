#' Create a new AdGroupIdFilter
#'
#' @description
#' AdGroupIdFilter Class
#'
#' @docType class
#' @title AdGroupIdFilter
#' @description AdGroupIdFilter Class
#' @format An \code{R6Class} generator object
#' @field ad_group_ids List of ad group ids list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupIdFilter <- R6::R6Class(
  "AdGroupIdFilter",
  public = list(
    `ad_group_ids` = NULL,

    #' @description
    #' Initialize a new AdGroupIdFilter class.
    #'
    #' @param ad_group_ids List of ad group ids
    #' @param ... Other optional arguments.
    initialize = function(`ad_group_ids` = NULL, ...) {
      if (!is.null(`ad_group_ids`)) {
        stopifnot(is.vector(`ad_group_ids`), length(`ad_group_ids`) != 0)
        sapply(`ad_group_ids`, function(x) stopifnot(is.character(x)))
        self$`ad_group_ids` <- `ad_group_ids`
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
    #' @return AdGroupIdFilter as a base R list.
    #' @examples
    #' # convert array of AdGroupIdFilter (x) to a data frame
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
    #' Convert AdGroupIdFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupIdFilterObject <- list()
      if (!is.null(self$`ad_group_ids`)) {
        AdGroupIdFilterObject[["ad_group_ids"]] <-
          self$`ad_group_ids`
      }
      return(AdGroupIdFilterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupIdFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_group_ids`)) {
        self$`ad_group_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_group_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupIdFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupIdFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_group_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_group_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupIdFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupIdFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`ad_group_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`ad_group_ids`) < 1) {
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
      if (length(self$`ad_group_ids`) > 500) {
        invalid_fields["ad_group_ids"] <- "Invalid length for `ad_group_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`ad_group_ids`) < 1) {
        invalid_fields["ad_group_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# AdGroupIdFilter$unlock()
#
## Below is an example to define the print function
# AdGroupIdFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupIdFilter$lock()

