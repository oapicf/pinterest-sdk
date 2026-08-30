#' Create a new AdvancedAuctionBidOptions
#'
#' @description
#' Object describing a retail catalog item's bid options (bid price and bid multipliers).
#'
#' @docType class
#' @title AdvancedAuctionBidOptions
#' @description AdvancedAuctionBidOptions Class
#' @format An \code{R6Class} generator object
#' @field app_type_multipliers  \link{AppTypeMultipliers} [optional]
#' @field bid_in_micro_currency Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. integer [optional]
#' @field placement_multipliers  \link{PlacementMultipliers} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvancedAuctionBidOptions <- R6::R6Class(
  "AdvancedAuctionBidOptions",
  public = list(
    `app_type_multipliers` = NULL,
    `bid_in_micro_currency` = NULL,
    `placement_multipliers` = NULL,

    #' @description
    #' Initialize a new AdvancedAuctionBidOptions class.
    #'
    #' @param app_type_multipliers app_type_multipliers
    #' @param bid_in_micro_currency Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
    #' @param placement_multipliers placement_multipliers
    #' @param ... Other optional arguments.
    initialize = function(`app_type_multipliers` = NULL, `bid_in_micro_currency` = NULL, `placement_multipliers` = NULL, ...) {
      if (!is.null(`app_type_multipliers`)) {
        stopifnot(R6::is.R6(`app_type_multipliers`))
        self$`app_type_multipliers` <- `app_type_multipliers`
      }
      if (!is.null(`bid_in_micro_currency`)) {
        if (!(is.numeric(`bid_in_micro_currency`) && length(`bid_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `bid_in_micro_currency`. Must be an integer:", `bid_in_micro_currency`))
        }
        self$`bid_in_micro_currency` <- `bid_in_micro_currency`
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
    #' @return AdvancedAuctionBidOptions as a base R list.
    #' @examples
    #' # convert array of AdvancedAuctionBidOptions (x) to a data frame
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
    #' Convert AdvancedAuctionBidOptions to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdvancedAuctionBidOptionsObject <- list()
      if (!is.null(self$`app_type_multipliers`)) {
        AdvancedAuctionBidOptionsObject[["app_type_multipliers"]] <-
          self$extractSimpleType(self$`app_type_multipliers`)
      }
      if (!is.null(self$`bid_in_micro_currency`)) {
        AdvancedAuctionBidOptionsObject[["bid_in_micro_currency"]] <-
          self$`bid_in_micro_currency`
      }
      if (!is.null(self$`placement_multipliers`)) {
        AdvancedAuctionBidOptionsObject[["placement_multipliers"]] <-
          self$extractSimpleType(self$`placement_multipliers`)
      }
      return(AdvancedAuctionBidOptionsObject)
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
    #' Deserialize JSON string into an instance of AdvancedAuctionBidOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionBidOptions
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`app_type_multipliers`)) {
        `app_type_multipliers_object` <- AppTypeMultipliers$new()
        `app_type_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`app_type_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`app_type_multipliers` <- `app_type_multipliers_object`
      }
      if (!is.null(this_object$`bid_in_micro_currency`)) {
        self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
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
    #' @return AdvancedAuctionBidOptions in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionBidOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionBidOptions
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`app_type_multipliers` <- AppTypeMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`app_type_multipliers`, auto_unbox = TRUE, digits = NA))
      self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      self$`placement_multipliers` <- PlacementMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`placement_multipliers`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdvancedAuctionBidOptions and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdvancedAuctionBidOptions
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
# AdvancedAuctionBidOptions$unlock()
#
## Below is an example to define the print function
# AdvancedAuctionBidOptions$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdvancedAuctionBidOptions$lock()

