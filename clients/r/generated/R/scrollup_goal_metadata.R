#' Create a new ScrollupGoalMetadata
#'
#' @description
#' ScrollupGoalMetadata Class
#'
#' @docType class
#' @title ScrollupGoalMetadata
#' @description ScrollupGoalMetadata Class
#' @format An \code{R6Class} generator object
#' @field scrollup_goal_value_in_micro_currency  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ScrollupGoalMetadata <- R6::R6Class(
  "ScrollupGoalMetadata",
  public = list(
    `scrollup_goal_value_in_micro_currency` = NULL,

    #' @description
    #' Initialize a new ScrollupGoalMetadata class.
    #'
    #' @param scrollup_goal_value_in_micro_currency scrollup_goal_value_in_micro_currency
    #' @param ... Other optional arguments.
    initialize = function(`scrollup_goal_value_in_micro_currency` = NULL, ...) {
      if (!is.null(`scrollup_goal_value_in_micro_currency`)) {
        if (!(is.character(`scrollup_goal_value_in_micro_currency`) && length(`scrollup_goal_value_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `scrollup_goal_value_in_micro_currency`. Must be a string:", `scrollup_goal_value_in_micro_currency`))
        }
        self$`scrollup_goal_value_in_micro_currency` <- `scrollup_goal_value_in_micro_currency`
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
    #' @return ScrollupGoalMetadata as a base R list.
    #' @examples
    #' # convert array of ScrollupGoalMetadata (x) to a data frame
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
    #' Convert ScrollupGoalMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ScrollupGoalMetadataObject <- list()
      if (!is.null(self$`scrollup_goal_value_in_micro_currency`)) {
        ScrollupGoalMetadataObject[["scrollup_goal_value_in_micro_currency"]] <-
          self$`scrollup_goal_value_in_micro_currency`
      }
      return(ScrollupGoalMetadataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ScrollupGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScrollupGoalMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`scrollup_goal_value_in_micro_currency`)) {
        self$`scrollup_goal_value_in_micro_currency` <- this_object$`scrollup_goal_value_in_micro_currency`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ScrollupGoalMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ScrollupGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScrollupGoalMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`scrollup_goal_value_in_micro_currency` <- this_object$`scrollup_goal_value_in_micro_currency`
      self
    },

    #' @description
    #' Validate JSON input with respect to ScrollupGoalMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ScrollupGoalMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`scrollup_goal_value_in_micro_currency`, "^\\d+$")) {
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
      if (!str_detect(self$`scrollup_goal_value_in_micro_currency`, "^\\d+$")) {
        invalid_fields["scrollup_goal_value_in_micro_currency"] <- "Invalid value for `scrollup_goal_value_in_micro_currency`, must conform to the pattern ^\\d+$."
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
# ScrollupGoalMetadata$unlock()
#
## Below is an example to define the print function
# ScrollupGoalMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ScrollupGoalMetadata$lock()

