#' Create a new AdGroupAudienceSizing
#'
#' @description
#' AdGroupAudienceSizing Class
#'
#' @docType class
#' @title AdGroupAudienceSizing
#' @description AdGroupAudienceSizing Class
#' @format An \code{R6Class} generator object
#' @field audience_size_lower_bound The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. numeric [optional]
#' @field audience_size_upper_bound The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupAudienceSizing <- R6::R6Class(
  "AdGroupAudienceSizing",
  public = list(
    `audience_size_lower_bound` = NULL,
    `audience_size_upper_bound` = NULL,

    #' @description
    #' Initialize a new AdGroupAudienceSizing class.
    #'
    #' @param audience_size_lower_bound The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    #' @param audience_size_upper_bound The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    #' @param ... Other optional arguments.
    initialize = function(`audience_size_lower_bound` = NULL, `audience_size_upper_bound` = NULL, ...) {
      if (!is.null(`audience_size_lower_bound`)) {
        self$`audience_size_lower_bound` <- `audience_size_lower_bound`
      }
      if (!is.null(`audience_size_upper_bound`)) {
        self$`audience_size_upper_bound` <- `audience_size_upper_bound`
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
    #' @return AdGroupAudienceSizing as a base R list.
    #' @examples
    #' # convert array of AdGroupAudienceSizing (x) to a data frame
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
    #' Convert AdGroupAudienceSizing to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupAudienceSizingObject <- list()
      if (!is.null(self$`audience_size_lower_bound`)) {
        AdGroupAudienceSizingObject[["audience_size_lower_bound"]] <-
          self$`audience_size_lower_bound`
      }
      if (!is.null(self$`audience_size_upper_bound`)) {
        AdGroupAudienceSizingObject[["audience_size_upper_bound"]] <-
          self$`audience_size_upper_bound`
      }
      return(AdGroupAudienceSizingObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizing
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizing
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_size_lower_bound`)) {
        self$`audience_size_lower_bound` <- this_object$`audience_size_lower_bound`
      }
      if (!is.null(this_object$`audience_size_upper_bound`)) {
        self$`audience_size_upper_bound` <- this_object$`audience_size_upper_bound`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupAudienceSizing in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizing
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizing
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_size_lower_bound` <- this_object$`audience_size_lower_bound`
      self$`audience_size_upper_bound` <- this_object$`audience_size_upper_bound`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupAudienceSizing and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupAudienceSizing
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
# AdGroupAudienceSizing$unlock()
#
## Below is an example to define the print function
# AdGroupAudienceSizing$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupAudienceSizing$lock()

