#' Create a new AdGroupAudienceSizingCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title AdGroupAudienceSizingCreate
#' @description AdGroupAudienceSizingCreate Class
#' @format An \code{R6Class} generator object
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). character [optional]
#' @field creative_types Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. list(\link{AdGroupAudienceSizingCreativeTypes}) [optional]
#' @field keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted. list(\link{AdGroupAudienceSizingKeyword}) [optional]
#' @field placement_group [Placement group](/docs/redoc/#section/Placement-group). \link{AdgroupPlacementGroupType} [optional]
#' @field product_group_ids Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. list(character) [optional]
#' @field targeting_spec  \link{TargetingSpecOptimal} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupAudienceSizingCreate <- R6::R6Class(
  "AdGroupAudienceSizingCreate",
  public = list(
    `auto_targeting_enabled` = NULL,
    `creative_types` = NULL,
    `keywords` = NULL,
    `placement_group` = NULL,
    `product_group_ids` = NULL,
    `targeting_spec` = NULL,

    #' @description
    #' Initialize a new AdGroupAudienceSizingCreate class.
    #'
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).. Default to TRUE.
    #' @param creative_types Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    #' @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
    #' @param placement_group [Placement group](/docs/redoc/#section/Placement-group).
    #' @param product_group_ids Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
    #' @param targeting_spec targeting_spec
    #' @param ... Other optional arguments.
    initialize = function(`auto_targeting_enabled` = TRUE, `creative_types` = NULL, `keywords` = NULL, `placement_group` = NULL, `product_group_ids` = NULL, `targeting_spec` = NULL, ...) {
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
    #' @return AdGroupAudienceSizingCreate as a base R list.
    #' @examples
    #' # convert array of AdGroupAudienceSizingCreate (x) to a data frame
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
    #' Convert AdGroupAudienceSizingCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupAudienceSizingCreateObject <- list()
      if (!is.null(self$`auto_targeting_enabled`)) {
        AdGroupAudienceSizingCreateObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`creative_types`)) {
        AdGroupAudienceSizingCreateObject[["creative_types"]] <-
          self$extractSimpleType(self$`creative_types`)
      }
      if (!is.null(self$`keywords`)) {
        AdGroupAudienceSizingCreateObject[["keywords"]] <-
          self$extractSimpleType(self$`keywords`)
      }
      if (!is.null(self$`placement_group`)) {
        AdGroupAudienceSizingCreateObject[["placement_group"]] <-
          self$extractSimpleType(self$`placement_group`)
      }
      if (!is.null(self$`product_group_ids`)) {
        AdGroupAudienceSizingCreateObject[["product_group_ids"]] <-
          self$`product_group_ids`
      }
      if (!is.null(self$`targeting_spec`)) {
        AdGroupAudienceSizingCreateObject[["targeting_spec"]] <-
          self$extractSimpleType(self$`targeting_spec`)
      }
      return(AdGroupAudienceSizingCreateObject)
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
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`creative_types`)) {
        self$`creative_types` <- ApiClient$new()$deserializeObj(this_object$`creative_types`, "array[AdGroupAudienceSizingCreativeTypes]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[AdGroupAudienceSizingKeyword]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`placement_group`)) {
        `placement_group_object` <- AdgroupPlacementGroupType$new()
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
    #' @return AdGroupAudienceSizingCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`creative_types` <- ApiClient$new()$deserializeObj(this_object$`creative_types`, "array[AdGroupAudienceSizingCreativeTypes]", loadNamespace("openapi"))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[AdGroupAudienceSizingKeyword]", loadNamespace("openapi"))
      self$`placement_group` <- AdgroupPlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`product_group_ids` <- ApiClient$new()$deserializeObj(this_object$`product_group_ids`, "array[character]", loadNamespace("openapi"))
      self$`targeting_spec` <- TargetingSpecOptimal$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupAudienceSizingCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupAudienceSizingCreate
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
# AdGroupAudienceSizingCreate$unlock()
#
## Below is an example to define the print function
# AdGroupAudienceSizingCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupAudienceSizingCreate$lock()

