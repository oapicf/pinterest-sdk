#' Create a new AdvancedAuctionBidOptions
#'
#' @description
#' Object describing a retail catalog item's bid options (bid price and bid multipliers).
#'
#' @docType class
#' @title AdvancedAuctionBidOptions
#' @description AdvancedAuctionBidOptions Class
#' @format An \code{R6Class} generator object
#' @field bid_in_micro_currency Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. integer [optional]
#' @field app_type_multipliers  \link{AppTypeMultipliers} [optional]
#' @field placement_multipliers  \link{PlacementMultipliers} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvancedAuctionBidOptions <- R6::R6Class(
  "AdvancedAuctionBidOptions",
  public = list(
    `bid_in_micro_currency` = NULL,
    `app_type_multipliers` = NULL,
    `placement_multipliers` = NULL,

    #' @description
    #' Initialize a new AdvancedAuctionBidOptions class.
    #'
    #' @param bid_in_micro_currency Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
    #' @param app_type_multipliers app_type_multipliers
    #' @param placement_multipliers placement_multipliers
    #' @param ... Other optional arguments.
    initialize = function(`bid_in_micro_currency` = NULL, `app_type_multipliers` = NULL, `placement_multipliers` = NULL, ...) {
      if (!is.null(`bid_in_micro_currency`)) {
        if (!(is.numeric(`bid_in_micro_currency`) && length(`bid_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `bid_in_micro_currency`. Must be an integer:", `bid_in_micro_currency`))
        }
        self$`bid_in_micro_currency` <- `bid_in_micro_currency`
      }
      if (!is.null(`app_type_multipliers`)) {
        stopifnot(R6::is.R6(`app_type_multipliers`))
        self$`app_type_multipliers` <- `app_type_multipliers`
      }
      if (!is.null(`placement_multipliers`)) {
        stopifnot(R6::is.R6(`placement_multipliers`))
        self$`placement_multipliers` <- `placement_multipliers`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionBidOptions in JSON format
    toJSON = function() {
      AdvancedAuctionBidOptionsObject <- list()
      if (!is.null(self$`bid_in_micro_currency`)) {
        AdvancedAuctionBidOptionsObject[["bid_in_micro_currency"]] <-
          self$`bid_in_micro_currency`
      }
      if (!is.null(self$`app_type_multipliers`)) {
        AdvancedAuctionBidOptionsObject[["app_type_multipliers"]] <-
          self$`app_type_multipliers`$toJSON()
      }
      if (!is.null(self$`placement_multipliers`)) {
        AdvancedAuctionBidOptionsObject[["placement_multipliers"]] <-
          self$`placement_multipliers`$toJSON()
      }
      AdvancedAuctionBidOptionsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionBidOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionBidOptions
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid_in_micro_currency`)) {
        self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      }
      if (!is.null(this_object$`app_type_multipliers`)) {
        `app_type_multipliers_object` <- AppTypeMultipliers$new()
        `app_type_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`app_type_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`app_type_multipliers` <- `app_type_multipliers_object`
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
    #' @return AdvancedAuctionBidOptions in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`bid_in_micro_currency`)) {
          sprintf(
          '"bid_in_micro_currency":
            %d
                    ',
          self$`bid_in_micro_currency`
          )
        },
        if (!is.null(self$`app_type_multipliers`)) {
          sprintf(
          '"app_type_multipliers":
          %s
          ',
          jsonlite::toJSON(self$`app_type_multipliers`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`placement_multipliers`)) {
          sprintf(
          '"placement_multipliers":
          %s
          ',
          jsonlite::toJSON(self$`placement_multipliers`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionBidOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionBidOptions
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      self$`app_type_multipliers` <- AppTypeMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`app_type_multipliers`, auto_unbox = TRUE, digits = NA))
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

