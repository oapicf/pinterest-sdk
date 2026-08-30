#' Create a new CampaignPlanningConversionRate
#'
#' @description
#' Conversion rate estimate for a specific conversion event and attribution window combination.
#'
#' @docType class
#' @title CampaignPlanningConversionRate
#' @description CampaignPlanningConversionRate Class
#' @format An \code{R6Class} generator object
#' @field attribution_windows  \link{CampaignPlanningConversionAttribution}
#' @field conversion_event  \link{CampaignPlanningConversionEvent}
#' @field conversion_rate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningConversionRate <- R6::R6Class(
  "CampaignPlanningConversionRate",
  public = list(
    `attribution_windows` = NULL,
    `conversion_event` = NULL,
    `conversion_rate` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningConversionRate class.
    #'
    #' @param attribution_windows attribution_windows
    #' @param conversion_event conversion_event
    #' @param conversion_rate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
    #' @param ... Other optional arguments.
    initialize = function(`attribution_windows`, `conversion_event`, `conversion_rate`, ...) {
      if (!missing(`attribution_windows`)) {
        stopifnot(R6::is.R6(`attribution_windows`))
        self$`attribution_windows` <- `attribution_windows`
      }
      if (!missing(`conversion_event`)) {
        if (!(`conversion_event` %in% c())) {
          stop(paste("Error! \"", `conversion_event`, "\" cannot be assigned to `conversion_event`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`conversion_event`))
        self$`conversion_event` <- `conversion_event`
      }
      if (!missing(`conversion_rate`)) {
        if (!(is.numeric(`conversion_rate`) && length(`conversion_rate`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_rate`. Must be a number:", `conversion_rate`))
        }
        self$`conversion_rate` <- `conversion_rate`
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
    #' @return CampaignPlanningConversionRate as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningConversionRate (x) to a data frame
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
    #' Convert CampaignPlanningConversionRate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningConversionRateObject <- list()
      if (!is.null(self$`attribution_windows`)) {
        CampaignPlanningConversionRateObject[["attribution_windows"]] <-
          self$extractSimpleType(self$`attribution_windows`)
      }
      if (!is.null(self$`conversion_event`)) {
        CampaignPlanningConversionRateObject[["conversion_event"]] <-
          self$extractSimpleType(self$`conversion_event`)
      }
      if (!is.null(self$`conversion_rate`)) {
        CampaignPlanningConversionRateObject[["conversion_rate"]] <-
          self$`conversion_rate`
      }
      return(CampaignPlanningConversionRateObject)
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
    #' Deserialize JSON string into an instance of CampaignPlanningConversionRate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningConversionRate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attribution_windows`)) {
        `attribution_windows_object` <- CampaignPlanningConversionAttribution$new()
        `attribution_windows_object`$fromJSON(jsonlite::toJSON(this_object$`attribution_windows`, auto_unbox = TRUE, digits = NA))
        self$`attribution_windows` <- `attribution_windows_object`
      }
      if (!is.null(this_object$`conversion_event`)) {
        `conversion_event_object` <- CampaignPlanningConversionEvent$new()
        `conversion_event_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_event`, auto_unbox = TRUE, digits = NA))
        self$`conversion_event` <- `conversion_event_object`
      }
      if (!is.null(this_object$`conversion_rate`)) {
        self$`conversion_rate` <- this_object$`conversion_rate`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningConversionRate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningConversionRate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningConversionRate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attribution_windows` <- CampaignPlanningConversionAttribution$new()$fromJSON(jsonlite::toJSON(this_object$`attribution_windows`, auto_unbox = TRUE, digits = NA))
      self$`conversion_event` <- CampaignPlanningConversionEvent$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_event`, auto_unbox = TRUE, digits = NA))
      self$`conversion_rate` <- this_object$`conversion_rate`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningConversionRate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `attribution_windows`
      if (!is.null(input_json$`attribution_windows`)) {
        stopifnot(R6::is.R6(input_json$`attribution_windows`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignPlanningConversionRate: the required field `attribution_windows` is missing."))
      }
      # check the required field `conversion_event`
      if (!is.null(input_json$`conversion_event`)) {
        stopifnot(R6::is.R6(input_json$`conversion_event`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignPlanningConversionRate: the required field `conversion_event` is missing."))
      }
      # check the required field `conversion_rate`
      if (!is.null(input_json$`conversion_rate`)) {
        if (!(is.numeric(input_json$`conversion_rate`) && length(input_json$`conversion_rate`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_rate`. Must be a number:", input_json$`conversion_rate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignPlanningConversionRate: the required field `conversion_rate` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningConversionRate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `attribution_windows` is null
      if (is.null(self$`attribution_windows`)) {
        return(FALSE)
      }

      # check if the required `conversion_event` is null
      if (is.null(self$`conversion_event`)) {
        return(FALSE)
      }

      # check if the required `conversion_rate` is null
      if (is.null(self$`conversion_rate`)) {
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
      # check if the required `attribution_windows` is null
      if (is.null(self$`attribution_windows`)) {
        invalid_fields["attribution_windows"] <- "Non-nullable required field `attribution_windows` cannot be null."
      }

      # check if the required `conversion_event` is null
      if (is.null(self$`conversion_event`)) {
        invalid_fields["conversion_event"] <- "Non-nullable required field `conversion_event` cannot be null."
      }

      # check if the required `conversion_rate` is null
      if (is.null(self$`conversion_rate`)) {
        invalid_fields["conversion_rate"] <- "Non-nullable required field `conversion_rate` cannot be null."
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
# CampaignPlanningConversionRate$unlock()
#
## Below is an example to define the print function
# CampaignPlanningConversionRate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningConversionRate$lock()

