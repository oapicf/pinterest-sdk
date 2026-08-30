#' Create a new AdGroupCreateRequestAllOf1
#'
#' @description
#' AdGroupCreateRequestAllOf1 Class
#'
#' @docType class
#' @title AdGroupCreateRequestAllOf1
#' @description AdGroupCreateRequestAllOf1 Class
#' @format An \code{R6Class} generator object
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. character [optional]
#' @field bid_multiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. numeric [optional]
#' @field budget_type  \link{BudgetType} [optional]
#' @field pacing_delivery_type  \link{PacingDeliveryType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupCreateRequestAllOf1 <- R6::R6Class(
  "AdGroupCreateRequestAllOf1",
  public = list(
    `auto_targeting_enabled` = NULL,
    `bid_multiplier` = NULL,
    `budget_type` = NULL,
    `pacing_delivery_type` = NULL,

    #' @description
    #' Initialize a new AdGroupCreateRequestAllOf1 class.
    #'
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
    #' @param bid_multiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
    #' @param budget_type budget_type
    #' @param pacing_delivery_type pacing_delivery_type
    #' @param ... Other optional arguments.
    initialize = function(`auto_targeting_enabled` = NULL, `bid_multiplier` = NULL, `budget_type` = NULL, `pacing_delivery_type` = NULL, ...) {
      if (!is.null(`auto_targeting_enabled`)) {
        if (!(is.logical(`auto_targeting_enabled`) && length(`auto_targeting_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `auto_targeting_enabled`. Must be a boolean:", `auto_targeting_enabled`))
        }
        self$`auto_targeting_enabled` <- `auto_targeting_enabled`
      }
      if (!is.null(`bid_multiplier`)) {
        self$`bid_multiplier` <- `bid_multiplier`
      }
      if (!is.null(`budget_type`)) {
        if (!(`budget_type` %in% c())) {
          stop(paste("Error! \"", `budget_type`, "\" cannot be assigned to `budget_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`budget_type`))
        self$`budget_type` <- `budget_type`
      }
      if (!is.null(`pacing_delivery_type`)) {
        if (!(`pacing_delivery_type` %in% c())) {
          stop(paste("Error! \"", `pacing_delivery_type`, "\" cannot be assigned to `pacing_delivery_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`pacing_delivery_type`))
        self$`pacing_delivery_type` <- `pacing_delivery_type`
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
    #' @return AdGroupCreateRequestAllOf1 as a base R list.
    #' @examples
    #' # convert array of AdGroupCreateRequestAllOf1 (x) to a data frame
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
    #' Convert AdGroupCreateRequestAllOf1 to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupCreateRequestAllOf1Object <- list()
      if (!is.null(self$`auto_targeting_enabled`)) {
        AdGroupCreateRequestAllOf1Object[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`bid_multiplier`)) {
        AdGroupCreateRequestAllOf1Object[["bid_multiplier"]] <-
          self$`bid_multiplier`
      }
      if (!is.null(self$`budget_type`)) {
        AdGroupCreateRequestAllOf1Object[["budget_type"]] <-
          self$extractSimpleType(self$`budget_type`)
      }
      if (!is.null(self$`pacing_delivery_type`)) {
        AdGroupCreateRequestAllOf1Object[["pacing_delivery_type"]] <-
          self$extractSimpleType(self$`pacing_delivery_type`)
      }
      return(AdGroupCreateRequestAllOf1Object)
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
    #' Deserialize JSON string into an instance of AdGroupCreateRequestAllOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupCreateRequestAllOf1
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`bid_multiplier`)) {
        self$`bid_multiplier` <- this_object$`bid_multiplier`
      }
      if (!is.null(this_object$`budget_type`)) {
        `budget_type_object` <- BudgetType$new()
        `budget_type_object`$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
        self$`budget_type` <- `budget_type_object`
      }
      if (!is.null(this_object$`pacing_delivery_type`)) {
        `pacing_delivery_type_object` <- PacingDeliveryType$new()
        `pacing_delivery_type_object`$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
        self$`pacing_delivery_type` <- `pacing_delivery_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupCreateRequestAllOf1 in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupCreateRequestAllOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupCreateRequestAllOf1
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`bid_multiplier` <- this_object$`bid_multiplier`
      self$`budget_type` <- BudgetType$new()$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
      self$`pacing_delivery_type` <- PacingDeliveryType$new()$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupCreateRequestAllOf1 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupCreateRequestAllOf1
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`bid_multiplier` > 10) {
        return(FALSE)
      }
      if (self$`bid_multiplier` < 0) {
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
      if (self$`bid_multiplier` > 10) {
        invalid_fields["bid_multiplier"] <- "Invalid value for `bid_multiplier`, must be smaller than or equal to 10."
      }
      if (self$`bid_multiplier` < 0) {
        invalid_fields["bid_multiplier"] <- "Invalid value for `bid_multiplier`, must be bigger than or equal to 0."
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
# AdGroupCreateRequestAllOf1$unlock()
#
## Below is an example to define the print function
# AdGroupCreateRequestAllOf1$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupCreateRequestAllOf1$lock()

