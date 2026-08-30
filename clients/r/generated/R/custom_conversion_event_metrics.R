#' Create a new CustomConversionEventMetrics
#'
#' @description
#' CustomConversionEventMetrics Class
#'
#' @docType class
#' @title CustomConversionEventMetrics
#' @description CustomConversionEventMetrics Class
#' @format An \code{R6Class} generator object
#' @field custom_event_metrics_type  \link{AdeColumnType}
#' @field custom_event_name Name of the advertiser-defined custom conversion event character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomConversionEventMetrics <- R6::R6Class(
  "CustomConversionEventMetrics",
  public = list(
    `custom_event_metrics_type` = NULL,
    `custom_event_name` = NULL,

    #' @description
    #' Initialize a new CustomConversionEventMetrics class.
    #'
    #' @param custom_event_metrics_type custom_event_metrics_type
    #' @param custom_event_name Name of the advertiser-defined custom conversion event
    #' @param ... Other optional arguments.
    initialize = function(`custom_event_metrics_type`, `custom_event_name`, ...) {
      if (!missing(`custom_event_metrics_type`)) {
        if (!(`custom_event_metrics_type` %in% c())) {
          stop(paste("Error! \"", `custom_event_metrics_type`, "\" cannot be assigned to `custom_event_metrics_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`custom_event_metrics_type`))
        self$`custom_event_metrics_type` <- `custom_event_metrics_type`
      }
      if (!missing(`custom_event_name`)) {
        if (!(is.character(`custom_event_name`) && length(`custom_event_name`) == 1)) {
          stop(paste("Error! Invalid data for `custom_event_name`. Must be a string:", `custom_event_name`))
        }
        self$`custom_event_name` <- `custom_event_name`
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
    #' @return CustomConversionEventMetrics as a base R list.
    #' @examples
    #' # convert array of CustomConversionEventMetrics (x) to a data frame
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
    #' Convert CustomConversionEventMetrics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomConversionEventMetricsObject <- list()
      if (!is.null(self$`custom_event_metrics_type`)) {
        CustomConversionEventMetricsObject[["custom_event_metrics_type"]] <-
          self$extractSimpleType(self$`custom_event_metrics_type`)
      }
      if (!is.null(self$`custom_event_name`)) {
        CustomConversionEventMetricsObject[["custom_event_name"]] <-
          self$`custom_event_name`
      }
      return(CustomConversionEventMetricsObject)
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
    #' Deserialize JSON string into an instance of CustomConversionEventMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomConversionEventMetrics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`custom_event_metrics_type`)) {
        `custom_event_metrics_type_object` <- AdeColumnType$new()
        `custom_event_metrics_type_object`$fromJSON(jsonlite::toJSON(this_object$`custom_event_metrics_type`, auto_unbox = TRUE, digits = NA))
        self$`custom_event_metrics_type` <- `custom_event_metrics_type_object`
      }
      if (!is.null(this_object$`custom_event_name`)) {
        self$`custom_event_name` <- this_object$`custom_event_name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomConversionEventMetrics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomConversionEventMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomConversionEventMetrics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`custom_event_metrics_type` <- AdeColumnType$new()$fromJSON(jsonlite::toJSON(this_object$`custom_event_metrics_type`, auto_unbox = TRUE, digits = NA))
      self$`custom_event_name` <- this_object$`custom_event_name`
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomConversionEventMetrics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `custom_event_metrics_type`
      if (!is.null(input_json$`custom_event_metrics_type`)) {
        stopifnot(R6::is.R6(input_json$`custom_event_metrics_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomConversionEventMetrics: the required field `custom_event_metrics_type` is missing."))
      }
      # check the required field `custom_event_name`
      if (!is.null(input_json$`custom_event_name`)) {
        if (!(is.character(input_json$`custom_event_name`) && length(input_json$`custom_event_name`) == 1)) {
          stop(paste("Error! Invalid data for `custom_event_name`. Must be a string:", input_json$`custom_event_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomConversionEventMetrics: the required field `custom_event_name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomConversionEventMetrics
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `custom_event_metrics_type` is null
      if (is.null(self$`custom_event_metrics_type`)) {
        return(FALSE)
      }

      # check if the required `custom_event_name` is null
      if (is.null(self$`custom_event_name`)) {
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
      # check if the required `custom_event_metrics_type` is null
      if (is.null(self$`custom_event_metrics_type`)) {
        invalid_fields["custom_event_metrics_type"] <- "Non-nullable required field `custom_event_metrics_type` cannot be null."
      }

      # check if the required `custom_event_name` is null
      if (is.null(self$`custom_event_name`)) {
        invalid_fields["custom_event_name"] <- "Non-nullable required field `custom_event_name` cannot be null."
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
# CustomConversionEventMetrics$unlock()
#
## Below is an example to define the print function
# CustomConversionEventMetrics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomConversionEventMetrics$lock()

