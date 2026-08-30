#' Create a new AdGroupDeliveryEstimatesKeywordsItems
#'
#' @description
#' AdGroupDeliveryEstimatesKeywordsItems Class
#'
#' @docType class
#' @title AdGroupDeliveryEstimatesKeywordsItems
#' @description AdGroupDeliveryEstimatesKeywordsItems Class
#' @format An \code{R6Class} generator object
#' @field match_type  \link{NullalbleMatchType}
#' @field value Keyword value (120 chars max). character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupDeliveryEstimatesKeywordsItems <- R6::R6Class(
  "AdGroupDeliveryEstimatesKeywordsItems",
  public = list(
    `match_type` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new AdGroupDeliveryEstimatesKeywordsItems class.
    #'
    #' @param match_type match_type
    #' @param value Keyword value (120 chars max).
    #' @param ... Other optional arguments.
    initialize = function(`match_type`, `value`, ...) {
      if (!missing(`match_type`)) {
        if (!(`match_type` %in% c())) {
          stop(paste("Error! \"", `match_type`, "\" cannot be assigned to `match_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`match_type`))
        self$`match_type` <- `match_type`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
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
    #' @return AdGroupDeliveryEstimatesKeywordsItems as a base R list.
    #' @examples
    #' # convert array of AdGroupDeliveryEstimatesKeywordsItems (x) to a data frame
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
    #' Convert AdGroupDeliveryEstimatesKeywordsItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupDeliveryEstimatesKeywordsItemsObject <- list()
      if (!is.null(self$`match_type`)) {
        AdGroupDeliveryEstimatesKeywordsItemsObject[["match_type"]] <-
          self$extractSimpleType(self$`match_type`)
      }
      if (!is.null(self$`value`)) {
        AdGroupDeliveryEstimatesKeywordsItemsObject[["value"]] <-
          self$`value`
      }
      return(AdGroupDeliveryEstimatesKeywordsItemsObject)
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
    #' Deserialize JSON string into an instance of AdGroupDeliveryEstimatesKeywordsItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupDeliveryEstimatesKeywordsItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`match_type`)) {
        `match_type_object` <- NullalbleMatchType$new()
        `match_type_object`$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
        self$`match_type` <- `match_type_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupDeliveryEstimatesKeywordsItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupDeliveryEstimatesKeywordsItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupDeliveryEstimatesKeywordsItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`match_type` <- NullalbleMatchType$new()$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupDeliveryEstimatesKeywordsItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `match_type`
      if (!is.null(input_json$`match_type`)) {
        stopifnot(R6::is.R6(input_json$`match_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupDeliveryEstimatesKeywordsItems: the required field `match_type` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupDeliveryEstimatesKeywordsItems: the required field `value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupDeliveryEstimatesKeywordsItems
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `value` is null
      if (is.null(self$`value`)) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# AdGroupDeliveryEstimatesKeywordsItems$unlock()
#
## Below is an example to define the print function
# AdGroupDeliveryEstimatesKeywordsItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupDeliveryEstimatesKeywordsItems$lock()

