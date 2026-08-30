#' Create a new CampaignCreateRequestAllOf1
#'
#' @description
#' CampaignCreateRequestAllOf1 Class
#'
#' @docType class
#' @title CampaignCreateRequestAllOf1
#' @description CampaignCreateRequestAllOf1 Class
#' @format An \code{R6Class} generator object
#' @field bid_options  \link{CampaignBidOptionsCreate} [optional]
#' @field intended_promotion_type  \link{IntendedPromotionType} [optional]
#' @field is_automated_campaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES character [optional]
#' @field is_campaign_budget_optimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. character [optional]
#' @field is_flexible_daily_budgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. character [optional]
#' @field is_ltv_optimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. character [optional]
#' @field is_performance_plus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. character [optional]
#' @field is_top_of_search <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>. character [optional]
#' @field objective_type  \link{ObjectiveType}
#' @field status  \link{EntityStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignCreateRequestAllOf1 <- R6::R6Class(
  "CampaignCreateRequestAllOf1",
  public = list(
    `bid_options` = NULL,
    `intended_promotion_type` = NULL,
    `is_automated_campaign` = NULL,
    `is_campaign_budget_optimization` = NULL,
    `is_flexible_daily_budgets` = NULL,
    `is_ltv_optimized` = NULL,
    `is_performance_plus` = NULL,
    `is_top_of_search` = NULL,
    `objective_type` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new CampaignCreateRequestAllOf1 class.
    #'
    #' @param objective_type objective_type
    #' @param bid_options bid_options
    #' @param intended_promotion_type intended_promotion_type
    #' @param is_automated_campaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
    #' @param is_campaign_budget_optimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
    #' @param is_flexible_daily_budgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
    #' @param is_ltv_optimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
    #' @param is_performance_plus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.. Default to FALSE.
    #' @param is_top_of_search <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.. Default to FALSE.
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`objective_type`, `bid_options` = NULL, `intended_promotion_type` = NULL, `is_automated_campaign` = NULL, `is_campaign_budget_optimization` = NULL, `is_flexible_daily_budgets` = NULL, `is_ltv_optimized` = NULL, `is_performance_plus` = FALSE, `is_top_of_search` = FALSE, `status` = NULL, ...) {
      if (!missing(`objective_type`)) {
        if (!(`objective_type` %in% c())) {
          stop(paste("Error! \"", `objective_type`, "\" cannot be assigned to `objective_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`objective_type`))
        self$`objective_type` <- `objective_type`
      }
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
      if (!is.null(`is_automated_campaign`)) {
        if (!(is.logical(`is_automated_campaign`) && length(`is_automated_campaign`) == 1)) {
          stop(paste("Error! Invalid data for `is_automated_campaign`. Must be a boolean:", `is_automated_campaign`))
        }
        self$`is_automated_campaign` <- `is_automated_campaign`
      }
      if (!is.null(`is_campaign_budget_optimization`)) {
        if (!(is.logical(`is_campaign_budget_optimization`) && length(`is_campaign_budget_optimization`) == 1)) {
          stop(paste("Error! Invalid data for `is_campaign_budget_optimization`. Must be a boolean:", `is_campaign_budget_optimization`))
        }
        self$`is_campaign_budget_optimization` <- `is_campaign_budget_optimization`
      }
      if (!is.null(`is_flexible_daily_budgets`)) {
        if (!(is.logical(`is_flexible_daily_budgets`) && length(`is_flexible_daily_budgets`) == 1)) {
          stop(paste("Error! Invalid data for `is_flexible_daily_budgets`. Must be a boolean:", `is_flexible_daily_budgets`))
        }
        self$`is_flexible_daily_budgets` <- `is_flexible_daily_budgets`
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
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
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
    #' @return CampaignCreateRequestAllOf1 as a base R list.
    #' @examples
    #' # convert array of CampaignCreateRequestAllOf1 (x) to a data frame
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
    #' Convert CampaignCreateRequestAllOf1 to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignCreateRequestAllOf1Object <- list()
      if (!is.null(self$`bid_options`)) {
        CampaignCreateRequestAllOf1Object[["bid_options"]] <-
          self$extractSimpleType(self$`bid_options`)
      }
      if (!is.null(self$`intended_promotion_type`)) {
        CampaignCreateRequestAllOf1Object[["intended_promotion_type"]] <-
          self$extractSimpleType(self$`intended_promotion_type`)
      }
      if (!is.null(self$`is_automated_campaign`)) {
        CampaignCreateRequestAllOf1Object[["is_automated_campaign"]] <-
          self$`is_automated_campaign`
      }
      if (!is.null(self$`is_campaign_budget_optimization`)) {
        CampaignCreateRequestAllOf1Object[["is_campaign_budget_optimization"]] <-
          self$`is_campaign_budget_optimization`
      }
      if (!is.null(self$`is_flexible_daily_budgets`)) {
        CampaignCreateRequestAllOf1Object[["is_flexible_daily_budgets"]] <-
          self$`is_flexible_daily_budgets`
      }
      if (!is.null(self$`is_ltv_optimized`)) {
        CampaignCreateRequestAllOf1Object[["is_ltv_optimized"]] <-
          self$`is_ltv_optimized`
      }
      if (!is.null(self$`is_performance_plus`)) {
        CampaignCreateRequestAllOf1Object[["is_performance_plus"]] <-
          self$`is_performance_plus`
      }
      if (!is.null(self$`is_top_of_search`)) {
        CampaignCreateRequestAllOf1Object[["is_top_of_search"]] <-
          self$`is_top_of_search`
      }
      if (!is.null(self$`objective_type`)) {
        CampaignCreateRequestAllOf1Object[["objective_type"]] <-
          self$extractSimpleType(self$`objective_type`)
      }
      if (!is.null(self$`status`)) {
        CampaignCreateRequestAllOf1Object[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      return(CampaignCreateRequestAllOf1Object)
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
    #' Deserialize JSON string into an instance of CampaignCreateRequestAllOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateRequestAllOf1
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid_options`)) {
        `bid_options_object` <- CampaignBidOptionsCreate$new()
        `bid_options_object`$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
        self$`bid_options` <- `bid_options_object`
      }
      if (!is.null(this_object$`intended_promotion_type`)) {
        `intended_promotion_type_object` <- IntendedPromotionType$new()
        `intended_promotion_type_object`$fromJSON(jsonlite::toJSON(this_object$`intended_promotion_type`, auto_unbox = TRUE, digits = NA))
        self$`intended_promotion_type` <- `intended_promotion_type_object`
      }
      if (!is.null(this_object$`is_automated_campaign`)) {
        self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      }
      if (!is.null(this_object$`is_campaign_budget_optimization`)) {
        self$`is_campaign_budget_optimization` <- this_object$`is_campaign_budget_optimization`
      }
      if (!is.null(this_object$`is_flexible_daily_budgets`)) {
        self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
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
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignCreateRequestAllOf1 in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateRequestAllOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateRequestAllOf1
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid_options` <- CampaignBidOptionsCreate$new()$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
      self$`intended_promotion_type` <- IntendedPromotionType$new()$fromJSON(jsonlite::toJSON(this_object$`intended_promotion_type`, auto_unbox = TRUE, digits = NA))
      self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      self$`is_campaign_budget_optimization` <- this_object$`is_campaign_budget_optimization`
      self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
      self$`is_ltv_optimized` <- this_object$`is_ltv_optimized`
      self$`is_performance_plus` <- this_object$`is_performance_plus`
      self$`is_top_of_search` <- this_object$`is_top_of_search`
      self$`objective_type` <- ObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignCreateRequestAllOf1 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `objective_type`
      if (!is.null(input_json$`objective_type`)) {
        stopifnot(R6::is.R6(input_json$`objective_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignCreateRequestAllOf1: the required field `objective_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignCreateRequestAllOf1
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `objective_type` is null
      if (is.null(self$`objective_type`)) {
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
      # check if the required `objective_type` is null
      if (is.null(self$`objective_type`)) {
        invalid_fields["objective_type"] <- "Non-nullable required field `objective_type` cannot be null."
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
# CampaignCreateRequestAllOf1$unlock()
#
## Below is an example to define the print function
# CampaignCreateRequestAllOf1$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignCreateRequestAllOf1$lock()

