#' Create a new AdGroupDeliveryEstimates
#'
#' @description
#' Ad group configuration for delivery estimates.
#'
#' @docType class
#' @title AdGroupDeliveryEstimates
#' @description AdGroupDeliveryEstimates Class
#' @format An \code{R6Class} generator object
#' @field auto_targeting_enabled  character [optional]
#' @field creative_types Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. list(\link{AdGroupAudienceSizingCreativeTypes}) [optional]
#' @field keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted. list(\link{AdGroupDeliveryEstimatesKeywordsItems}) [optional]
#' @field monthly_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. integer [optional]
#' @field optimization_goal_metadata  \link{OptimizationGoalMetadata} [optional]
#' @field optimization_type Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. \link{OptimizationType} [optional]
#' @field placement_group  \link{PlacementGroupType} [optional]
#' @field product_group_ids [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. list(character) [optional]
#' @field targeting_spec  \link{TargetingSpecOptimal} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupDeliveryEstimates <- R6::R6Class(
  "AdGroupDeliveryEstimates",
  public = list(
    `auto_targeting_enabled` = NULL,
    `creative_types` = NULL,
    `keywords` = NULL,
    `monthly_frequency_cap` = NULL,
    `optimization_goal_metadata` = NULL,
    `optimization_type` = NULL,
    `placement_group` = NULL,
    `product_group_ids` = NULL,
    `targeting_spec` = NULL,

    #' @description
    #' Initialize a new AdGroupDeliveryEstimates class.
    #'
    #' @param auto_targeting_enabled auto_targeting_enabled
    #' @param creative_types Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    #' @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
    #' @param monthly_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
    #' @param optimization_goal_metadata optimization_goal_metadata
    #' @param optimization_type Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
    #' @param placement_group placement_group
    #' @param product_group_ids [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
    #' @param targeting_spec targeting_spec
    #' @param ... Other optional arguments.
    initialize = function(`auto_targeting_enabled` = NULL, `creative_types` = NULL, `keywords` = NULL, `monthly_frequency_cap` = NULL, `optimization_goal_metadata` = NULL, `optimization_type` = NULL, `placement_group` = NULL, `product_group_ids` = NULL, `targeting_spec` = NULL, ...) {
      if (!is.null(`auto_targeting_enabled`)) {
        if (!(is.logical(`auto_targeting_enabled`) && length(`auto_targeting_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `auto_targeting_enabled`. Must be a boolean:", `auto_targeting_enabled`))
        }
        self$`auto_targeting_enabled` <- `auto_targeting_enabled`
      }
      if (!is.null(`creative_types`)) {
        stopifnot(is.vector(`creative_types`), length(`creative_types`) != 0)
        sapply(`creative_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`creative_types` <- `creative_types`
      }
      if (!is.null(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
      if (!is.null(`monthly_frequency_cap`)) {
        if (!(is.numeric(`monthly_frequency_cap`) && length(`monthly_frequency_cap`) == 1)) {
          stop(paste("Error! Invalid data for `monthly_frequency_cap`. Must be an integer:", `monthly_frequency_cap`))
        }
        self$`monthly_frequency_cap` <- `monthly_frequency_cap`
      }
      if (!is.null(`optimization_goal_metadata`)) {
        stopifnot(R6::is.R6(`optimization_goal_metadata`))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata`
      }
      if (!is.null(`optimization_type`)) {
        if (!(`optimization_type` %in% c())) {
          stop(paste("Error! \"", `optimization_type`, "\" cannot be assigned to `optimization_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`optimization_type`))
        self$`optimization_type` <- `optimization_type`
      }
      if (!is.null(`placement_group`)) {
        if (!(`placement_group` %in% c())) {
          stop(paste("Error! \"", `placement_group`, "\" cannot be assigned to `placement_group`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`placement_group`))
        self$`placement_group` <- `placement_group`
      }
      if (!is.null(`product_group_ids`)) {
        stopifnot(is.vector(`product_group_ids`), length(`product_group_ids`) != 0)
        sapply(`product_group_ids`, function(x) stopifnot(is.character(x)))
        self$`product_group_ids` <- `product_group_ids`
      }
      if (!is.null(`targeting_spec`)) {
        stopifnot(R6::is.R6(`targeting_spec`))
        self$`targeting_spec` <- `targeting_spec`
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
    #' @return AdGroupDeliveryEstimates as a base R list.
    #' @examples
    #' # convert array of AdGroupDeliveryEstimates (x) to a data frame
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
    #' Convert AdGroupDeliveryEstimates to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupDeliveryEstimatesObject <- list()
      if (!is.null(self$`auto_targeting_enabled`)) {
        AdGroupDeliveryEstimatesObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`creative_types`)) {
        AdGroupDeliveryEstimatesObject[["creative_types"]] <-
          self$extractSimpleType(self$`creative_types`)
      }
      if (!is.null(self$`keywords`)) {
        AdGroupDeliveryEstimatesObject[["keywords"]] <-
          self$extractSimpleType(self$`keywords`)
      }
      if (!is.null(self$`monthly_frequency_cap`)) {
        AdGroupDeliveryEstimatesObject[["monthly_frequency_cap"]] <-
          self$`monthly_frequency_cap`
      }
      if (!is.null(self$`optimization_goal_metadata`)) {
        AdGroupDeliveryEstimatesObject[["optimization_goal_metadata"]] <-
          self$extractSimpleType(self$`optimization_goal_metadata`)
      }
      if (!is.null(self$`optimization_type`)) {
        AdGroupDeliveryEstimatesObject[["optimization_type"]] <-
          self$extractSimpleType(self$`optimization_type`)
      }
      if (!is.null(self$`placement_group`)) {
        AdGroupDeliveryEstimatesObject[["placement_group"]] <-
          self$extractSimpleType(self$`placement_group`)
      }
      if (!is.null(self$`product_group_ids`)) {
        AdGroupDeliveryEstimatesObject[["product_group_ids"]] <-
          self$`product_group_ids`
      }
      if (!is.null(self$`targeting_spec`)) {
        AdGroupDeliveryEstimatesObject[["targeting_spec"]] <-
          self$extractSimpleType(self$`targeting_spec`)
      }
      return(AdGroupDeliveryEstimatesObject)
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
    #' Deserialize JSON string into an instance of AdGroupDeliveryEstimates
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupDeliveryEstimates
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`creative_types`)) {
        self$`creative_types` <- ApiClient$new()$deserializeObj(this_object$`creative_types`, "array[AdGroupAudienceSizingCreativeTypes]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[AdGroupDeliveryEstimatesKeywordsItems]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`monthly_frequency_cap`)) {
        self$`monthly_frequency_cap` <- this_object$`monthly_frequency_cap`
      }
      if (!is.null(this_object$`optimization_goal_metadata`)) {
        `optimization_goal_metadata_object` <- OptimizationGoalMetadata$new()
        `optimization_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata_object`
      }
      if (!is.null(this_object$`optimization_type`)) {
        `optimization_type_object` <- OptimizationType$new()
        `optimization_type_object`$fromJSON(jsonlite::toJSON(this_object$`optimization_type`, auto_unbox = TRUE, digits = NA))
        self$`optimization_type` <- `optimization_type_object`
      }
      if (!is.null(this_object$`placement_group`)) {
        `placement_group_object` <- PlacementGroupType$new()
        `placement_group_object`$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
        self$`placement_group` <- `placement_group_object`
      }
      if (!is.null(this_object$`product_group_ids`)) {
        self$`product_group_ids` <- ApiClient$new()$deserializeObj(this_object$`product_group_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`targeting_spec`)) {
        `targeting_spec_object` <- TargetingSpecOptimal$new()
        `targeting_spec_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
        self$`targeting_spec` <- `targeting_spec_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupDeliveryEstimates in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupDeliveryEstimates
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupDeliveryEstimates
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`creative_types` <- ApiClient$new()$deserializeObj(this_object$`creative_types`, "array[AdGroupAudienceSizingCreativeTypes]", loadNamespace("openapi"))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[AdGroupDeliveryEstimatesKeywordsItems]", loadNamespace("openapi"))
      self$`monthly_frequency_cap` <- this_object$`monthly_frequency_cap`
      self$`optimization_goal_metadata` <- OptimizationGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`optimization_type` <- OptimizationType$new()$fromJSON(jsonlite::toJSON(this_object$`optimization_type`, auto_unbox = TRUE, digits = NA))
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`product_group_ids` <- ApiClient$new()$deserializeObj(this_object$`product_group_ids`, "array[character]", loadNamespace("openapi"))
      self$`targeting_spec` <- TargetingSpecOptimal$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupDeliveryEstimates and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupDeliveryEstimates
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`monthly_frequency_cap` < 0) {
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
      if (self$`monthly_frequency_cap` < 0) {
        invalid_fields["monthly_frequency_cap"] <- "Invalid value for `monthly_frequency_cap`, must be bigger than or equal to 0."
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
# AdGroupDeliveryEstimates$unlock()
#
## Below is an example to define the print function
# AdGroupDeliveryEstimates$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupDeliveryEstimates$lock()

