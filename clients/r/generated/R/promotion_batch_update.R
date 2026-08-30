#' Create a new PromotionBatchUpdate
#'
#' @description
#' PromotionBatchUpdate Class
#'
#' @docType class
#' @title PromotionBatchUpdate
#' @description PromotionBatchUpdate Class
#' @format An \code{R6Class} generator object
#' @field discount_status  \link{DiscountStatus} [optional]
#' @field end_time Promotion end time. Unix timestamp in seconds. Independent of campaign end time. integer [optional]
#' @field external_id Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. character [optional]
#' @field id Promotion ID character
#' @field platform_type The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. character [optional]
#' @field promotion_code Code that can be used to redeem a promotion. character [optional]
#' @field promotion_custom_id An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. character [optional]
#' @field promotion_title Internal name for the promotion. character [optional]
#' @field promotion_type  \link{PromotionType} [optional]
#' @field start_time Promotion start time. Unix timestamp in seconds. Independent of campaign start time. integer [optional]
#' @field template_values List of values to be inserted in the promotion type-specific template. list(\link{PromotionTemplateValue}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromotionBatchUpdate <- R6::R6Class(
  "PromotionBatchUpdate",
  public = list(
    `discount_status` = NULL,
    `end_time` = NULL,
    `external_id` = NULL,
    `id` = NULL,
    `platform_type` = NULL,
    `promotion_code` = NULL,
    `promotion_custom_id` = NULL,
    `promotion_title` = NULL,
    `promotion_type` = NULL,
    `start_time` = NULL,
    `template_values` = NULL,

    #' @description
    #' Initialize a new PromotionBatchUpdate class.
    #'
    #' @param id Promotion ID
    #' @param discount_status discount_status
    #' @param end_time Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
    #' @param external_id Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
    #' @param platform_type The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
    #' @param promotion_code Code that can be used to redeem a promotion.
    #' @param promotion_custom_id An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
    #' @param promotion_title Internal name for the promotion.
    #' @param promotion_type promotion_type
    #' @param start_time Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
    #' @param template_values List of values to be inserted in the promotion type-specific template.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `discount_status` = NULL, `end_time` = NULL, `external_id` = NULL, `platform_type` = NULL, `promotion_code` = NULL, `promotion_custom_id` = NULL, `promotion_title` = NULL, `promotion_type` = NULL, `start_time` = NULL, `template_values` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`discount_status`)) {
        if (!(`discount_status` %in% c())) {
          stop(paste("Error! \"", `discount_status`, "\" cannot be assigned to `discount_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`discount_status`))
        self$`discount_status` <- `discount_status`
      }
      if (!is.null(`end_time`)) {
        if (!(is.numeric(`end_time`) && length(`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be an integer:", `end_time`))
        }
        self$`end_time` <- `end_time`
      }
      if (!is.null(`external_id`)) {
        if (!(is.character(`external_id`) && length(`external_id`) == 1)) {
          stop(paste("Error! Invalid data for `external_id`. Must be a string:", `external_id`))
        }
        self$`external_id` <- `external_id`
      }
      if (!is.null(`platform_type`)) {
        if (!(is.character(`platform_type`) && length(`platform_type`) == 1)) {
          stop(paste("Error! Invalid data for `platform_type`. Must be a string:", `platform_type`))
        }
        self$`platform_type` <- `platform_type`
      }
      if (!is.null(`promotion_code`)) {
        if (!(is.character(`promotion_code`) && length(`promotion_code`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_code`. Must be a string:", `promotion_code`))
        }
        self$`promotion_code` <- `promotion_code`
      }
      if (!is.null(`promotion_custom_id`)) {
        if (!(is.character(`promotion_custom_id`) && length(`promotion_custom_id`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_custom_id`. Must be a string:", `promotion_custom_id`))
        }
        self$`promotion_custom_id` <- `promotion_custom_id`
      }
      if (!is.null(`promotion_title`)) {
        if (!(is.character(`promotion_title`) && length(`promotion_title`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_title`. Must be a string:", `promotion_title`))
        }
        self$`promotion_title` <- `promotion_title`
      }
      if (!is.null(`promotion_type`)) {
        if (!(`promotion_type` %in% c())) {
          stop(paste("Error! \"", `promotion_type`, "\" cannot be assigned to `promotion_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`promotion_type`))
        self$`promotion_type` <- `promotion_type`
      }
      if (!is.null(`start_time`)) {
        if (!(is.numeric(`start_time`) && length(`start_time`) == 1)) {
          stop(paste("Error! Invalid data for `start_time`. Must be an integer:", `start_time`))
        }
        self$`start_time` <- `start_time`
      }
      if (!is.null(`template_values`)) {
        stopifnot(is.vector(`template_values`), length(`template_values`) != 0)
        sapply(`template_values`, function(x) stopifnot(R6::is.R6(x)))
        self$`template_values` <- `template_values`
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
    #' @return PromotionBatchUpdate as a base R list.
    #' @examples
    #' # convert array of PromotionBatchUpdate (x) to a data frame
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
    #' Convert PromotionBatchUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PromotionBatchUpdateObject <- list()
      if (!is.null(self$`discount_status`)) {
        PromotionBatchUpdateObject[["discount_status"]] <-
          self$extractSimpleType(self$`discount_status`)
      }
      if (!is.null(self$`end_time`)) {
        PromotionBatchUpdateObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`external_id`)) {
        PromotionBatchUpdateObject[["external_id"]] <-
          self$`external_id`
      }
      if (!is.null(self$`id`)) {
        PromotionBatchUpdateObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`platform_type`)) {
        PromotionBatchUpdateObject[["platform_type"]] <-
          self$`platform_type`
      }
      if (!is.null(self$`promotion_code`)) {
        PromotionBatchUpdateObject[["promotion_code"]] <-
          self$`promotion_code`
      }
      if (!is.null(self$`promotion_custom_id`)) {
        PromotionBatchUpdateObject[["promotion_custom_id"]] <-
          self$`promotion_custom_id`
      }
      if (!is.null(self$`promotion_title`)) {
        PromotionBatchUpdateObject[["promotion_title"]] <-
          self$`promotion_title`
      }
      if (!is.null(self$`promotion_type`)) {
        PromotionBatchUpdateObject[["promotion_type"]] <-
          self$extractSimpleType(self$`promotion_type`)
      }
      if (!is.null(self$`start_time`)) {
        PromotionBatchUpdateObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`template_values`)) {
        PromotionBatchUpdateObject[["template_values"]] <-
          self$extractSimpleType(self$`template_values`)
      }
      return(PromotionBatchUpdateObject)
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
    #' Deserialize JSON string into an instance of PromotionBatchUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromotionBatchUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`discount_status`)) {
        `discount_status_object` <- DiscountStatus$new()
        `discount_status_object`$fromJSON(jsonlite::toJSON(this_object$`discount_status`, auto_unbox = TRUE, digits = NA))
        self$`discount_status` <- `discount_status_object`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`external_id`)) {
        self$`external_id` <- this_object$`external_id`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`platform_type`)) {
        self$`platform_type` <- this_object$`platform_type`
      }
      if (!is.null(this_object$`promotion_code`)) {
        self$`promotion_code` <- this_object$`promotion_code`
      }
      if (!is.null(this_object$`promotion_custom_id`)) {
        self$`promotion_custom_id` <- this_object$`promotion_custom_id`
      }
      if (!is.null(this_object$`promotion_title`)) {
        self$`promotion_title` <- this_object$`promotion_title`
      }
      if (!is.null(this_object$`promotion_type`)) {
        `promotion_type_object` <- PromotionType$new()
        `promotion_type_object`$fromJSON(jsonlite::toJSON(this_object$`promotion_type`, auto_unbox = TRUE, digits = NA))
        self$`promotion_type` <- `promotion_type_object`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`template_values`)) {
        self$`template_values` <- ApiClient$new()$deserializeObj(this_object$`template_values`, "array[PromotionTemplateValue]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PromotionBatchUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PromotionBatchUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromotionBatchUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`discount_status` <- DiscountStatus$new()$fromJSON(jsonlite::toJSON(this_object$`discount_status`, auto_unbox = TRUE, digits = NA))
      self$`end_time` <- this_object$`end_time`
      self$`external_id` <- this_object$`external_id`
      self$`id` <- this_object$`id`
      self$`platform_type` <- this_object$`platform_type`
      self$`promotion_code` <- this_object$`promotion_code`
      self$`promotion_custom_id` <- this_object$`promotion_custom_id`
      self$`promotion_title` <- this_object$`promotion_title`
      self$`promotion_type` <- PromotionType$new()$fromJSON(jsonlite::toJSON(this_object$`promotion_type`, auto_unbox = TRUE, digits = NA))
      self$`start_time` <- this_object$`start_time`
      self$`template_values` <- ApiClient$new()$deserializeObj(this_object$`template_values`, "array[PromotionTemplateValue]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PromotionBatchUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PromotionBatchUpdate: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PromotionBatchUpdate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`external_id`) > 64) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (nchar(self$`id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (nchar(self$`promotion_custom_id`) > 50) {
        return(FALSE)
      }

      if (length(self$`template_values`) > 2) {
        return(FALSE)
      }
      if (length(self$`template_values`) < 0) {
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
      if (nchar(self$`external_id`) > 64) {
        invalid_fields["external_id"] <- "Invalid length for `external_id`, must be smaller than or equal to 64."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (nchar(self$`id`) > 18) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (nchar(self$`promotion_custom_id`) > 50) {
        invalid_fields["promotion_custom_id"] <- "Invalid length for `promotion_custom_id`, must be smaller than or equal to 50."
      }

      if (length(self$`template_values`) > 2) {
        invalid_fields["template_values"] <- "Invalid length for `template_values`, number of items must be less than or equal to 2."
      }
      if (length(self$`template_values`) < 0) {
        invalid_fields["template_values"] <- "Invalid length for ``, number of items must be greater than or equal to 0."
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
# PromotionBatchUpdate$unlock()
#
## Below is an example to define the print function
# PromotionBatchUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromotionBatchUpdate$lock()

