#' Create a new CampaignPlanningConversionAttribution
#'
#' @description
#' Attribution windows for a conversion event.
#'
#' @docType class
#' @title CampaignPlanningConversionAttribution
#' @description CampaignPlanningConversionAttribution Class
#' @format An \code{R6Class} generator object
#' @field click_window_days Number of days to use as the conversion attribution window for a pin click action. \link{CampaignPlanningConversionAttributionWindowDays} [optional]
#' @field engagement_window_days Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. \link{CampaignPlanningConversionAttributionWindowDays} [optional]
#' @field view_window_days Number of days to use as the conversion attribution window for a view action. \link{CampaignPlanningConversionAttributionWindowDays} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningConversionAttribution <- R6::R6Class(
  "CampaignPlanningConversionAttribution",
  public = list(
    `click_window_days` = NULL,
    `engagement_window_days` = NULL,
    `view_window_days` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningConversionAttribution class.
    #'
    #' @param click_window_days Number of days to use as the conversion attribution window for a pin click action.
    #' @param engagement_window_days Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
    #' @param view_window_days Number of days to use as the conversion attribution window for a view action.
    #' @param ... Other optional arguments.
    initialize = function(`click_window_days` = NULL, `engagement_window_days` = NULL, `view_window_days` = NULL, ...) {
      if (!is.null(`click_window_days`)) {
        if (!(`click_window_days` %in% c())) {
          stop(paste("Error! \"", `click_window_days`, "\" cannot be assigned to `click_window_days`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`click_window_days`))
        self$`click_window_days` <- `click_window_days`
      }
      if (!is.null(`engagement_window_days`)) {
        if (!(`engagement_window_days` %in% c())) {
          stop(paste("Error! \"", `engagement_window_days`, "\" cannot be assigned to `engagement_window_days`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`engagement_window_days`))
        self$`engagement_window_days` <- `engagement_window_days`
      }
      if (!is.null(`view_window_days`)) {
        if (!(`view_window_days` %in% c())) {
          stop(paste("Error! \"", `view_window_days`, "\" cannot be assigned to `view_window_days`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`view_window_days`))
        self$`view_window_days` <- `view_window_days`
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
    #' @return CampaignPlanningConversionAttribution as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningConversionAttribution (x) to a data frame
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
    #' Convert CampaignPlanningConversionAttribution to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningConversionAttributionObject <- list()
      if (!is.null(self$`click_window_days`)) {
        CampaignPlanningConversionAttributionObject[["click_window_days"]] <-
          self$extractSimpleType(self$`click_window_days`)
      }
      if (!is.null(self$`engagement_window_days`)) {
        CampaignPlanningConversionAttributionObject[["engagement_window_days"]] <-
          self$extractSimpleType(self$`engagement_window_days`)
      }
      if (!is.null(self$`view_window_days`)) {
        CampaignPlanningConversionAttributionObject[["view_window_days"]] <-
          self$extractSimpleType(self$`view_window_days`)
      }
      return(CampaignPlanningConversionAttributionObject)
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
    #' Deserialize JSON string into an instance of CampaignPlanningConversionAttribution
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningConversionAttribution
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`click_window_days`)) {
        `click_window_days_object` <- CampaignPlanningConversionAttributionWindowDays$new()
        `click_window_days_object`$fromJSON(jsonlite::toJSON(this_object$`click_window_days`, auto_unbox = TRUE, digits = NA))
        self$`click_window_days` <- `click_window_days_object`
      }
      if (!is.null(this_object$`engagement_window_days`)) {
        `engagement_window_days_object` <- CampaignPlanningConversionAttributionWindowDays$new()
        `engagement_window_days_object`$fromJSON(jsonlite::toJSON(this_object$`engagement_window_days`, auto_unbox = TRUE, digits = NA))
        self$`engagement_window_days` <- `engagement_window_days_object`
      }
      if (!is.null(this_object$`view_window_days`)) {
        `view_window_days_object` <- CampaignPlanningConversionAttributionWindowDays$new()
        `view_window_days_object`$fromJSON(jsonlite::toJSON(this_object$`view_window_days`, auto_unbox = TRUE, digits = NA))
        self$`view_window_days` <- `view_window_days_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningConversionAttribution in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningConversionAttribution
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningConversionAttribution
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`click_window_days` <- CampaignPlanningConversionAttributionWindowDays$new()$fromJSON(jsonlite::toJSON(this_object$`click_window_days`, auto_unbox = TRUE, digits = NA))
      self$`engagement_window_days` <- CampaignPlanningConversionAttributionWindowDays$new()$fromJSON(jsonlite::toJSON(this_object$`engagement_window_days`, auto_unbox = TRUE, digits = NA))
      self$`view_window_days` <- CampaignPlanningConversionAttributionWindowDays$new()$fromJSON(jsonlite::toJSON(this_object$`view_window_days`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningConversionAttribution and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningConversionAttribution
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
# CampaignPlanningConversionAttribution$unlock()
#
## Below is an example to define the print function
# CampaignPlanningConversionAttribution$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningConversionAttribution$lock()

