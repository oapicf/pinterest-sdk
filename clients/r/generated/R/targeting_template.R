#' Create a new TargetingTemplate
#'
#' @description
#' TargetingTemplate Class
#'
#' @docType class
#' @title TargetingTemplate
#' @description TargetingTemplate Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id The ID of the advertiser that this targeting template belongs to. character [optional]
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). character [optional]
#' @field created_time Targeting template created time. Unix timestamp in seconds. integer [optional]
#' @field id Targeting template ID. character [optional]
#' @field keywords  list(\link{TargetingTemplateKeyword}) [optional]
#' @field name targeting template name character
#' @field placement_group  \link{PlacementGroupType} [optional]
#' @field sizing  \link{TargetingTemplateAudienceSizing} [optional]
#' @field status Indicate targeting template is active or Deleted \link{TargetingTemplateStatus} [optional]
#' @field targeting_attributes targeting profile attributes \link{TargetingSpecOptimal}
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @field updated_time Targeting template updated time.Unix timestamp in seconds. integer [optional]
#' @field valid Inform if the targeting template is valid (ex. would be false if has revoked audience) character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTemplate <- R6::R6Class(
  "TargetingTemplate",
  public = list(
    `ad_account_id` = NULL,
    `auto_targeting_enabled` = NULL,
    `created_time` = NULL,
    `id` = NULL,
    `keywords` = NULL,
    `name` = NULL,
    `placement_group` = NULL,
    `sizing` = NULL,
    `status` = NULL,
    `targeting_attributes` = NULL,
    `tracking_urls` = NULL,
    `updated_time` = NULL,
    `valid` = NULL,

    #' @description
    #' Initialize a new TargetingTemplate class.
    #'
    #' @param name targeting template name
    #' @param targeting_attributes targeting profile attributes
    #' @param ad_account_id The ID of the advertiser that this targeting template belongs to.
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).. Default to TRUE.
    #' @param created_time Targeting template created time. Unix timestamp in seconds.
    #' @param id Targeting template ID.
    #' @param keywords keywords
    #' @param placement_group placement_group
    #' @param sizing sizing
    #' @param status Indicate targeting template is active or Deleted
    #' @param tracking_urls tracking_urls
    #' @param updated_time Targeting template updated time.Unix timestamp in seconds.
    #' @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience)
    #' @param ... Other optional arguments.
    initialize = function(`name`, `targeting_attributes`, `ad_account_id` = NULL, `auto_targeting_enabled` = TRUE, `created_time` = NULL, `id` = NULL, `keywords` = NULL, `placement_group` = NULL, `sizing` = NULL, `status` = NULL, `tracking_urls` = NULL, `updated_time` = NULL, `valid` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`targeting_attributes`)) {
        stopifnot(R6::is.R6(`targeting_attributes`))
        self$`targeting_attributes` <- `targeting_attributes`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`auto_targeting_enabled`)) {
        if (!(is.logical(`auto_targeting_enabled`) && length(`auto_targeting_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `auto_targeting_enabled`. Must be a boolean:", `auto_targeting_enabled`))
        }
        self$`auto_targeting_enabled` <- `auto_targeting_enabled`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
      if (!is.null(`sizing`)) {
        stopifnot(R6::is.R6(`sizing`))
        self$`sizing` <- `sizing`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`tracking_urls`)) {
        stopifnot(R6::is.R6(`tracking_urls`))
        self$`tracking_urls` <- `tracking_urls`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`valid`)) {
        if (!(is.logical(`valid`) && length(`valid`) == 1)) {
          stop(paste("Error! Invalid data for `valid`. Must be a boolean:", `valid`))
        }
        self$`valid` <- `valid`
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
    #' @return TargetingTemplate as a base R list.
    #' @examples
    #' # convert array of TargetingTemplate (x) to a data frame
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
    #' Convert TargetingTemplate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TargetingTemplateObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        TargetingTemplateObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`auto_targeting_enabled`)) {
        TargetingTemplateObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`created_time`)) {
        TargetingTemplateObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`id`)) {
        TargetingTemplateObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`keywords`)) {
        TargetingTemplateObject[["keywords"]] <-
          self$extractSimpleType(self$`keywords`)
      }
      if (!is.null(self$`name`)) {
        TargetingTemplateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`placement_group`)) {
        TargetingTemplateObject[["placement_group"]] <-
          self$extractSimpleType(self$`placement_group`)
      }
      if (!is.null(self$`sizing`)) {
        TargetingTemplateObject[["sizing"]] <-
          self$extractSimpleType(self$`sizing`)
      }
      if (!is.null(self$`status`)) {
        TargetingTemplateObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`targeting_attributes`)) {
        TargetingTemplateObject[["targeting_attributes"]] <-
          self$extractSimpleType(self$`targeting_attributes`)
      }
      if (!is.null(self$`tracking_urls`)) {
        TargetingTemplateObject[["tracking_urls"]] <-
          self$extractSimpleType(self$`tracking_urls`)
      }
      if (!is.null(self$`updated_time`)) {
        TargetingTemplateObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`valid`)) {
        TargetingTemplateObject[["valid"]] <-
          self$`valid`
      }
      return(TargetingTemplateObject)
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
    #' Deserialize JSON string into an instance of TargetingTemplate
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[TargetingTemplateKeyword]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`placement_group`)) {
        `placement_group_object` <- PlacementGroupType$new()
        `placement_group_object`$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
        self$`placement_group` <- `placement_group_object`
      }
      if (!is.null(this_object$`sizing`)) {
        `sizing_object` <- TargetingTemplateAudienceSizing$new()
        `sizing_object`$fromJSON(jsonlite::toJSON(this_object$`sizing`, auto_unbox = TRUE, digits = NA))
        self$`sizing` <- `sizing_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- TargetingTemplateStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`targeting_attributes`)) {
        `targeting_attributes_object` <- TargetingSpecOptimal$new()
        `targeting_attributes_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_attributes`, auto_unbox = TRUE, digits = NA))
        self$`targeting_attributes` <- `targeting_attributes_object`
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`valid`)) {
        self$`valid` <- this_object$`valid`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TargetingTemplate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplate
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`created_time` <- this_object$`created_time`
      self$`id` <- this_object$`id`
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[TargetingTemplateKeyword]", loadNamespace("openapi"))
      self$`name` <- this_object$`name`
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`sizing` <- TargetingTemplateAudienceSizing$new()$fromJSON(jsonlite::toJSON(this_object$`sizing`, auto_unbox = TRUE, digits = NA))
      self$`status` <- TargetingTemplateStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`targeting_attributes` <- TargetingSpecOptimal$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_attributes`, auto_unbox = TRUE, digits = NA))
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`updated_time` <- this_object$`updated_time`
      self$`valid` <- this_object$`valid`
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingTemplate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingTemplate: the required field `name` is missing."))
      }
      # check the required field `targeting_attributes`
      if (!is.null(input_json$`targeting_attributes`)) {
        stopifnot(R6::is.R6(input_json$`targeting_attributes`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingTemplate: the required field `targeting_attributes` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTemplate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `targeting_attributes` is null
      if (is.null(self$`targeting_attributes`)) {
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `targeting_attributes` is null
      if (is.null(self$`targeting_attributes`)) {
        invalid_fields["targeting_attributes"] <- "Non-nullable required field `targeting_attributes` cannot be null."
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
# TargetingTemplate$unlock()
#
## Below is an example to define the print function
# TargetingTemplate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTemplate$lock()

