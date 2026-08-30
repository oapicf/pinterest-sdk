#' Create a new CampaignUpdateRequestAllOf2
#'
#' @description
#' CampaignUpdateRequestAllOf2 Class
#'
#' @docType class
#' @title CampaignUpdateRequestAllOf2
#' @description CampaignUpdateRequestAllOf2 Class
#' @format An \code{R6Class} generator object
#' @field bid_options  \link{CampaignBidOptionsUpdate} [optional]
#' @field intended_promotion_type  \link{IntendedPromotionType} [optional]
#' @field is_ltv_optimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. character [optional]
#' @field is_performance_plus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field. character [optional]
#' @field is_top_of_search Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. character [optional]
#' @field objective_type  \link{ObjectiveType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignUpdateRequestAllOf2 <- R6::R6Class(
  "CampaignUpdateRequestAllOf2",
  public = list(
    `bid_options` = NULL,
    `intended_promotion_type` = NULL,
    `is_ltv_optimized` = NULL,
    `is_performance_plus` = NULL,
    `is_top_of_search` = NULL,
    `objective_type` = NULL,

    #' @description
    #' Initialize a new CampaignUpdateRequestAllOf2 class.
    #'
    #' @param bid_options bid_options
    #' @param intended_promotion_type intended_promotion_type
    #' @param is_ltv_optimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
    #' @param is_performance_plus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
    #' @param is_top_of_search Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
    #' @param objective_type objective_type
    #' @param ... Other optional arguments.
    initialize = function(`bid_options` = NULL, `intended_promotion_type` = NULL, `is_ltv_optimized` = NULL, `is_performance_plus` = NULL, `is_top_of_search` = NULL, `objective_type` = NULL, ...) {
      if (!is.null(`bid_options`)) {
        stopifnot(R6::is.R6(`bid_options`))
        self$`bid_options` <- `bid_options`
      }
      if (!is.null(`intended_promotion_type`)) {
        if (!(`intended_promotion_type` %in% c())) {
          stop(paste("Error! \"", `intended_promotion_type`, "\" cannot be assigned to `intended_promotion_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`intended_promotion_type`))
        self$`intended_promotion_type` <- `intended_promotion_type`
      }
      if (!is.null(`is_ltv_optimized`)) {
        if (!(is.logical(`is_ltv_optimized`) && length(`is_ltv_optimized`) == 1)) {
          stop(paste("Error! Invalid data for `is_ltv_optimized`. Must be a boolean:", `is_ltv_optimized`))
        }
        self$`is_ltv_optimized` <- `is_ltv_optimized`
      }
      if (!is.null(`is_performance_plus`)) {
        if (!(is.logical(`is_performance_plus`) && length(`is_performance_plus`) == 1)) {
          stop(paste("Error! Invalid data for `is_performance_plus`. Must be a boolean:", `is_performance_plus`))
        }
        self$`is_performance_plus` <- `is_performance_plus`
      }
      if (!is.null(`is_top_of_search`)) {
        if (!(is.logical(`is_top_of_search`) && length(`is_top_of_search`) == 1)) {
          stop(paste("Error! Invalid data for `is_top_of_search`. Must be a boolean:", `is_top_of_search`))
        }
        self$`is_top_of_search` <- `is_top_of_search`
      }
      if (!is.null(`objective_type`)) {
        if (!(`objective_type` %in% c())) {
          stop(paste("Error! \"", `objective_type`, "\" cannot be assigned to `objective_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`objective_type`))
        self$`objective_type` <- `objective_type`
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
    #' @return CampaignUpdateRequestAllOf2 as a base R list.
    #' @examples
    #' # convert array of CampaignUpdateRequestAllOf2 (x) to a data frame
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
    #' Convert CampaignUpdateRequestAllOf2 to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignUpdateRequestAllOf2Object <- list()
      if (!is.null(self$`bid_options`)) {
        CampaignUpdateRequestAllOf2Object[["bid_options"]] <-
          self$extractSimpleType(self$`bid_options`)
      }
      if (!is.null(self$`intended_promotion_type`)) {
        CampaignUpdateRequestAllOf2Object[["intended_promotion_type"]] <-
          self$extractSimpleType(self$`intended_promotion_type`)
      }
      if (!is.null(self$`is_ltv_optimized`)) {
        CampaignUpdateRequestAllOf2Object[["is_ltv_optimized"]] <-
          self$`is_ltv_optimized`
      }
      if (!is.null(self$`is_performance_plus`)) {
        CampaignUpdateRequestAllOf2Object[["is_performance_plus"]] <-
          self$`is_performance_plus`
      }
      if (!is.null(self$`is_top_of_search`)) {
        CampaignUpdateRequestAllOf2Object[["is_top_of_search"]] <-
          self$`is_top_of_search`
      }
      if (!is.null(self$`objective_type`)) {
        CampaignUpdateRequestAllOf2Object[["objective_type"]] <-
          self$extractSimpleType(self$`objective_type`)
      }
      return(CampaignUpdateRequestAllOf2Object)
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
    #' Deserialize JSON string into an instance of CampaignUpdateRequestAllOf2
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignUpdateRequestAllOf2
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid_options`)) {
        `bid_options_object` <- CampaignBidOptionsUpdate$new()
        `bid_options_object`$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
        self$`bid_options` <- `bid_options_object`
      }
      if (!is.null(this_object$`intended_promotion_type`)) {
        `intended_promotion_type_object` <- IntendedPromotionType$new()
        `intended_promotion_type_object`$fromJSON(jsonlite::toJSON(this_object$`intended_promotion_type`, auto_unbox = TRUE, digits = NA))
        self$`intended_promotion_type` <- `intended_promotion_type_object`
      }
      if (!is.null(this_object$`is_ltv_optimized`)) {
        self$`is_ltv_optimized` <- this_object$`is_ltv_optimized`
      }
      if (!is.null(this_object$`is_performance_plus`)) {
        self$`is_performance_plus` <- this_object$`is_performance_plus`
      }
      if (!is.null(this_object$`is_top_of_search`)) {
        self$`is_top_of_search` <- this_object$`is_top_of_search`
      }
      if (!is.null(this_object$`objective_type`)) {
        `objective_type_object` <- ObjectiveType$new()
        `objective_type_object`$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
        self$`objective_type` <- `objective_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignUpdateRequestAllOf2 in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignUpdateRequestAllOf2
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignUpdateRequestAllOf2
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid_options` <- CampaignBidOptionsUpdate$new()$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
      self$`intended_promotion_type` <- IntendedPromotionType$new()$fromJSON(jsonlite::toJSON(this_object$`intended_promotion_type`, auto_unbox = TRUE, digits = NA))
      self$`is_ltv_optimized` <- this_object$`is_ltv_optimized`
      self$`is_performance_plus` <- this_object$`is_performance_plus`
      self$`is_top_of_search` <- this_object$`is_top_of_search`
      self$`objective_type` <- ObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignUpdateRequestAllOf2 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignUpdateRequestAllOf2
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
# CampaignUpdateRequestAllOf2$unlock()
#
## Below is an example to define the print function
# CampaignUpdateRequestAllOf2$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignUpdateRequestAllOf2$lock()

