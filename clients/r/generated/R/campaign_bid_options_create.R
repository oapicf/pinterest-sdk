#' Create a new CampaignBidOptionsCreate
#'
#' @description
#' Object describing the campaign level bid multipliers.
#'
#' @docType class
#' @title CampaignBidOptionsCreate
#' @description CampaignBidOptionsCreate Class
#' @format An \code{R6Class} generator object
#' @field app_type_multipliers  \link{AppTypeMultipliers} [optional]
#' @field audience_multipliers  \link{CampaignAudienceMultipliers} [optional]
#' @field placement_multipliers  \link{PlacementMultipliers} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignBidOptionsCreate <- R6::R6Class(
  "CampaignBidOptionsCreate",
  public = list(
    `app_type_multipliers` = NULL,
    `audience_multipliers` = NULL,
    `placement_multipliers` = NULL,

    #' @description
    #' Initialize a new CampaignBidOptionsCreate class.
    #'
    #' @param app_type_multipliers app_type_multipliers
    #' @param audience_multipliers audience_multipliers
    #' @param placement_multipliers placement_multipliers
    #' @param ... Other optional arguments.
    initialize = function(`app_type_multipliers` = NULL, `audience_multipliers` = NULL, `placement_multipliers` = NULL, ...) {
      if (!is.null(`app_type_multipliers`)) {
        stopifnot(R6::is.R6(`app_type_multipliers`))
        self$`app_type_multipliers` <- `app_type_multipliers`
      }
      if (!is.null(`audience_multipliers`)) {
        stopifnot(R6::is.R6(`audience_multipliers`))
        self$`audience_multipliers` <- `audience_multipliers`
      }
      if (!is.null(`placement_multipliers`)) {
        stopifnot(R6::is.R6(`placement_multipliers`))
        self$`placement_multipliers` <- `placement_multipliers`
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
    #' @return CampaignBidOptionsCreate as a base R list.
    #' @examples
    #' # convert array of CampaignBidOptionsCreate (x) to a data frame
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
    #' Convert CampaignBidOptionsCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignBidOptionsCreateObject <- list()
      if (!is.null(self$`app_type_multipliers`)) {
        CampaignBidOptionsCreateObject[["app_type_multipliers"]] <-
          self$`app_type_multipliers`$toSimpleType()
      }
      if (!is.null(self$`audience_multipliers`)) {
        CampaignBidOptionsCreateObject[["audience_multipliers"]] <-
          self$`audience_multipliers`$toSimpleType()
      }
      if (!is.null(self$`placement_multipliers`)) {
        CampaignBidOptionsCreateObject[["placement_multipliers"]] <-
          self$`placement_multipliers`$toSimpleType()
      }
      return(CampaignBidOptionsCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignBidOptionsCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignBidOptionsCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`app_type_multipliers`)) {
        `app_type_multipliers_object` <- AppTypeMultipliers$new()
        `app_type_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`app_type_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`app_type_multipliers` <- `app_type_multipliers_object`
      }
      if (!is.null(this_object$`audience_multipliers`)) {
        `audience_multipliers_object` <- CampaignAudienceMultipliers$new()
        `audience_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`audience_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`audience_multipliers` <- `audience_multipliers_object`
      }
      if (!is.null(this_object$`placement_multipliers`)) {
        `placement_multipliers_object` <- PlacementMultipliers$new()
        `placement_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`placement_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`placement_multipliers` <- `placement_multipliers_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignBidOptionsCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignBidOptionsCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignBidOptionsCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`app_type_multipliers` <- AppTypeMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`app_type_multipliers`, auto_unbox = TRUE, digits = NA))
      self$`audience_multipliers` <- CampaignAudienceMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`audience_multipliers`, auto_unbox = TRUE, digits = NA))
      self$`placement_multipliers` <- PlacementMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`placement_multipliers`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignBidOptionsCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignBidOptionsCreate
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
# CampaignBidOptionsCreate$unlock()
#
## Below is an example to define the print function
# CampaignBidOptionsCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignBidOptionsCreate$lock()

