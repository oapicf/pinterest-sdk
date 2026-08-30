#' Create a new MetricsResponseDataItems
#'
#' @description
#' MetricsResponseDataItems Class
#'
#' @docType class
#' @title MetricsResponseDataItems
#' @description MetricsResponseDataItems Class
#' @format An \code{R6Class} generator object
#' @field metrics Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). object
#' @field targeting_type The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) character
#' @field targeting_value The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female') character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MetricsResponseDataItems <- R6::R6Class(
  "MetricsResponseDataItems",
  public = list(
    `metrics` = NULL,
    `targeting_type` = NULL,
    `targeting_value` = NULL,

    #' @description
    #' Initialize a new MetricsResponseDataItems class.
    #'
    #' @param metrics Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
    #' @param targeting_type The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
    #' @param targeting_value The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
    #' @param ... Other optional arguments.
    initialize = function(`metrics`, `targeting_type`, `targeting_value`, ...) {
      if (!missing(`metrics`)) {
        self$`metrics` <- `metrics`
      }
      if (!missing(`targeting_type`)) {
        if (!(is.character(`targeting_type`) && length(`targeting_type`) == 1)) {
          stop(paste("Error! Invalid data for `targeting_type`. Must be a string:", `targeting_type`))
        }
        self$`targeting_type` <- `targeting_type`
      }
      if (!missing(`targeting_value`)) {
        if (!(is.character(`targeting_value`) && length(`targeting_value`) == 1)) {
          stop(paste("Error! Invalid data for `targeting_value`. Must be a string:", `targeting_value`))
        }
        self$`targeting_value` <- `targeting_value`
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
    #' @return MetricsResponseDataItems as a base R list.
    #' @examples
    #' # convert array of MetricsResponseDataItems (x) to a data frame
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
    #' Convert MetricsResponseDataItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MetricsResponseDataItemsObject <- list()
      if (!is.null(self$`metrics`)) {
        MetricsResponseDataItemsObject[["metrics"]] <-
          self$`metrics`
      }
      if (!is.null(self$`targeting_type`)) {
        MetricsResponseDataItemsObject[["targeting_type"]] <-
          self$`targeting_type`
      }
      if (!is.null(self$`targeting_value`)) {
        MetricsResponseDataItemsObject[["targeting_value"]] <-
          self$`targeting_value`
      }
      return(MetricsResponseDataItemsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MetricsResponseDataItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of MetricsResponseDataItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`metrics`)) {
        self$`metrics` <- this_object$`metrics`
      }
      if (!is.null(this_object$`targeting_type`)) {
        self$`targeting_type` <- this_object$`targeting_type`
      }
      if (!is.null(this_object$`targeting_value`)) {
        self$`targeting_value` <- this_object$`targeting_value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MetricsResponseDataItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MetricsResponseDataItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of MetricsResponseDataItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`metrics` <- this_object$`metrics`
      self$`targeting_type` <- this_object$`targeting_type`
      self$`targeting_value` <- this_object$`targeting_value`
      self
    },

    #' @description
    #' Validate JSON input with respect to MetricsResponseDataItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `metrics`
      if (!is.null(input_json$`metrics`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MetricsResponseDataItems: the required field `metrics` is missing."))
      }
      # check the required field `targeting_type`
      if (!is.null(input_json$`targeting_type`)) {
        if (!(is.character(input_json$`targeting_type`) && length(input_json$`targeting_type`) == 1)) {
          stop(paste("Error! Invalid data for `targeting_type`. Must be a string:", input_json$`targeting_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MetricsResponseDataItems: the required field `targeting_type` is missing."))
      }
      # check the required field `targeting_value`
      if (!is.null(input_json$`targeting_value`)) {
        if (!(is.character(input_json$`targeting_value`) && length(input_json$`targeting_value`) == 1)) {
          stop(paste("Error! Invalid data for `targeting_value`. Must be a string:", input_json$`targeting_value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MetricsResponseDataItems: the required field `targeting_value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MetricsResponseDataItems
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `metrics` is null
      if (is.null(self$`metrics`)) {
        return(FALSE)
      }

      # check if the required `targeting_type` is null
      if (is.null(self$`targeting_type`)) {
        return(FALSE)
      }

      # check if the required `targeting_value` is null
      if (is.null(self$`targeting_value`)) {
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
      # check if the required `metrics` is null
      if (is.null(self$`metrics`)) {
        invalid_fields["metrics"] <- "Non-nullable required field `metrics` cannot be null."
      }

      # check if the required `targeting_type` is null
      if (is.null(self$`targeting_type`)) {
        invalid_fields["targeting_type"] <- "Non-nullable required field `targeting_type` cannot be null."
      }

      # check if the required `targeting_value` is null
      if (is.null(self$`targeting_value`)) {
        invalid_fields["targeting_value"] <- "Non-nullable required field `targeting_value` cannot be null."
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
# MetricsResponseDataItems$unlock()
#
## Below is an example to define the print function
# MetricsResponseDataItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MetricsResponseDataItems$lock()

