#' Create a new Promotion
#'
#' @description
#' Promotion Class
#'
#' @docType class
#' @title Promotion
#' @description Promotion Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id The Ad Account ID that this promotion belongs to. character
#' @field discount_status  \link{DiscountStatus} [optional]
#' @field end_time Promotion end time. Unix timestamp in seconds. Independent of campaign end time. integer [optional]
#' @field external_id Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. character [optional]
#' @field id Promotion ID character
#' @field platform_type The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. character [optional]
#' @field promotion_code Code that can be used to redeem a promotion. character [optional]
#' @field promotion_custom_id An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. character [optional]
#' @field promotion_title Internal name for the promotion. character
#' @field promotion_type  \link{PromotionType}
#' @field start_time Promotion start time. Unix timestamp in seconds. Independent of campaign start time. integer [optional]
#' @field status  \link{EntityStatus} [optional]
#' @field template_values List of values to be inserted in the promotion type-specific template. list(\link{PromotionTemplateValue}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Promotion <- R6::R6Class(
  "Promotion",
  public = list(
    `ad_account_id` = NULL,
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
    `status` = NULL,
    `template_values` = NULL,

    #' @description
    #' Initialize a new Promotion class.
    #'
    #' @param ad_account_id The Ad Account ID that this promotion belongs to.
    #' @param id Promotion ID
    #' @param promotion_title Internal name for the promotion.
    #' @param promotion_type promotion_type
    #' @param discount_status discount_status
    #' @param end_time Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
    #' @param external_id Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
    #' @param platform_type The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
    #' @param promotion_code Code that can be used to redeem a promotion.
    #' @param promotion_custom_id An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
    #' @param start_time Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
    #' @param status status
    #' @param template_values List of values to be inserted in the promotion type-specific template.
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id`, `id`, `promotion_title`, `promotion_type`, `discount_status` = NULL, `end_time` = NULL, `external_id` = NULL, `platform_type` = NULL, `promotion_code` = NULL, `promotion_custom_id` = NULL, `start_time` = NULL, `status` = NULL, `template_values` = NULL, ...) {
      if (!missing(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`promotion_title`)) {
        if (!(is.character(`promotion_title`) && length(`promotion_title`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_title`. Must be a string:", `promotion_title`))
        }
        self$`promotion_title` <- `promotion_title`
      }
      if (!missing(`promotion_type`)) {
        if (!(`promotion_type` %in% c())) {
          stop(paste("Error! \"", `promotion_type`, "\" cannot be assigned to `promotion_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`promotion_type`))
        self$`promotion_type` <- `promotion_type`
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
      if (!is.null(`start_time`)) {
        if (!(is.numeric(`start_time`) && length(`start_time`) == 1)) {
          stop(paste("Error! Invalid data for `start_time`. Must be an integer:", `start_time`))
        }
        self$`start_time` <- `start_time`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
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
    #' @return Promotion as a base R list.
    #' @examples
    #' # convert array of Promotion (x) to a data frame
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
    #' Convert Promotion to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PromotionObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        PromotionObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`discount_status`)) {
        PromotionObject[["discount_status"]] <-
          self$extractSimpleType(self$`discount_status`)
      }
      if (!is.null(self$`end_time`)) {
        PromotionObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`external_id`)) {
        PromotionObject[["external_id"]] <-
          self$`external_id`
      }
      if (!is.null(self$`id`)) {
        PromotionObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`platform_type`)) {
        PromotionObject[["platform_type"]] <-
          self$`platform_type`
      }
      if (!is.null(self$`promotion_code`)) {
        PromotionObject[["promotion_code"]] <-
          self$`promotion_code`
      }
      if (!is.null(self$`promotion_custom_id`)) {
        PromotionObject[["promotion_custom_id"]] <-
          self$`promotion_custom_id`
      }
      if (!is.null(self$`promotion_title`)) {
        PromotionObject[["promotion_title"]] <-
          self$`promotion_title`
      }
      if (!is.null(self$`promotion_type`)) {
        PromotionObject[["promotion_type"]] <-
          self$extractSimpleType(self$`promotion_type`)
      }
      if (!is.null(self$`start_time`)) {
        PromotionObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`status`)) {
        PromotionObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`template_values`)) {
        PromotionObject[["template_values"]] <-
          self$extractSimpleType(self$`template_values`)
      }
      return(PromotionObject)
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
    #' Deserialize JSON string into an instance of Promotion
    #'
    #' @param input_json the JSON input
    #' @return the instance of Promotion
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
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
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
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
    #' @return Promotion in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Promotion
    #'
    #' @param input_json the JSON input
    #' @return the instance of Promotion
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
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
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`template_values` <- ApiClient$new()$deserializeObj(this_object$`template_values`, "array[PromotionTemplateValue]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to Promotion and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_account_id`
      if (!is.null(input_json$`ad_account_id`)) {
        if (!(is.character(input_json$`ad_account_id`) && length(input_json$`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", input_json$`ad_account_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Promotion: the required field `ad_account_id` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Promotion: the required field `id` is missing."))
      }
      # check the required field `promotion_title`
      if (!is.null(input_json$`promotion_title`)) {
        if (!(is.character(input_json$`promotion_title`) && length(input_json$`promotion_title`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_title`. Must be a string:", input_json$`promotion_title`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Promotion: the required field `promotion_title` is missing."))
      }
      # check the required field `promotion_type`
      if (!is.null(input_json$`promotion_type`)) {
        stopifnot(R6::is.R6(input_json$`promotion_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Promotion: the required field `promotion_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Promotion
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

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

      # check if the required `promotion_title` is null
      if (is.null(self$`promotion_title`)) {
        return(FALSE)
      }

      # check if the required `promotion_type` is null
      if (is.null(self$`promotion_type`)) {
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
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        invalid_fields["ad_account_id"] <- "Non-nullable required field `ad_account_id` cannot be null."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

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

      # check if the required `promotion_title` is null
      if (is.null(self$`promotion_title`)) {
        invalid_fields["promotion_title"] <- "Non-nullable required field `promotion_title` cannot be null."
      }

      # check if the required `promotion_type` is null
      if (is.null(self$`promotion_type`)) {
        invalid_fields["promotion_type"] <- "Non-nullable required field `promotion_type` cannot be null."
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
# Promotion$unlock()
#
## Below is an example to define the print function
# Promotion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Promotion$lock()

