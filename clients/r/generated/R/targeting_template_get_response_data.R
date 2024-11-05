#' Create a new TargetingTemplateGetResponseData
#'
#' @description
#' TargetingTemplateGetResponseData Class
#'
#' @docType class
#' @title TargetingTemplateGetResponseData
#' @description TargetingTemplateGetResponseData Class
#' @format An \code{R6Class} generator object
#' @field name targeting template name character [optional]
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. character [optional]
#' @field targeting_attributes  \link{TargetingSpec} [optional]
#' @field placement_group  \link{PlacementGroupType} [optional]
#' @field keywords  list(\link{TargetingTemplateKeyword}) [optional]
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @field id Targeting template ID. character [optional]
#' @field created_time Targeting template created time. Unix timestamp in seconds. integer [optional]
#' @field updated_time Targeting template updated time.Unix timestamp in seconds. integer [optional]
#' @field ad_account_id The ID of the advertiser that this targeting template belongs to. character [optional]
#' @field status Indicate targeting template is active or Deleted character [optional]
#' @field sizing  \link{TargetingTemplateAudienceSizing} [optional]
#' @field valid Inform if the targeting template is valid (ex. would be false if has revoked audience) character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTemplateGetResponseData <- R6::R6Class(
  "TargetingTemplateGetResponseData",
  public = list(
    `name` = NULL,
    `auto_targeting_enabled` = NULL,
    `targeting_attributes` = NULL,
    `placement_group` = NULL,
    `keywords` = NULL,
    `tracking_urls` = NULL,
    `id` = NULL,
    `created_time` = NULL,
    `updated_time` = NULL,
    `ad_account_id` = NULL,
    `status` = NULL,
    `sizing` = NULL,
    `valid` = NULL,

    #' @description
    #' Initialize a new TargetingTemplateGetResponseData class.
    #'
    #' @param name targeting template name
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.. Default to TRUE.
    #' @param targeting_attributes targeting_attributes
    #' @param placement_group placement_group
    #' @param keywords keywords
    #' @param tracking_urls tracking_urls
    #' @param id Targeting template ID.
    #' @param created_time Targeting template created time. Unix timestamp in seconds.
    #' @param updated_time Targeting template updated time.Unix timestamp in seconds.
    #' @param ad_account_id The ID of the advertiser that this targeting template belongs to.
    #' @param status Indicate targeting template is active or Deleted. Default to "ACTIVE".
    #' @param sizing sizing
    #' @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience)
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `auto_targeting_enabled` = TRUE, `targeting_attributes` = NULL, `placement_group` = NULL, `keywords` = NULL, `tracking_urls` = NULL, `id` = NULL, `created_time` = NULL, `updated_time` = NULL, `ad_account_id` = NULL, `status` = "ACTIVE", `sizing` = NULL, `valid` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`auto_targeting_enabled`)) {
        if (!(is.logical(`auto_targeting_enabled`) && length(`auto_targeting_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `auto_targeting_enabled`. Must be a boolean:", `auto_targeting_enabled`))
        }
        self$`auto_targeting_enabled` <- `auto_targeting_enabled`
      }
      if (!is.null(`targeting_attributes`)) {
        stopifnot(R6::is.R6(`targeting_attributes`))
        self$`targeting_attributes` <- `targeting_attributes`
      }
      if (!is.null(`placement_group`)) {
        if (!(`placement_group` %in% c())) {
          stop(paste("Error! \"", `placement_group`, "\" cannot be assigned to `placement_group`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`placement_group`))
        self$`placement_group` <- `placement_group`
      }
      if (!is.null(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
      if (!is.null(`tracking_urls`)) {
        stopifnot(R6::is.R6(`tracking_urls`))
        self$`tracking_urls` <- `tracking_urls`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c("ACTIVE", "DELETED"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"ACTIVE\", \"DELETED\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`sizing`)) {
        stopifnot(R6::is.R6(`sizing`))
        self$`sizing` <- `sizing`
      }
      if (!is.null(`valid`)) {
        if (!(is.logical(`valid`) && length(`valid`) == 1)) {
          stop(paste("Error! Invalid data for `valid`. Must be a boolean:", `valid`))
        }
        self$`valid` <- `valid`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateGetResponseData in JSON format
    toJSON = function() {
      TargetingTemplateGetResponseDataObject <- list()
      if (!is.null(self$`name`)) {
        TargetingTemplateGetResponseDataObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`auto_targeting_enabled`)) {
        TargetingTemplateGetResponseDataObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`targeting_attributes`)) {
        TargetingTemplateGetResponseDataObject[["targeting_attributes"]] <-
          self$`targeting_attributes`$toJSON()
      }
      if (!is.null(self$`placement_group`)) {
        TargetingTemplateGetResponseDataObject[["placement_group"]] <-
          self$`placement_group`$toJSON()
      }
      if (!is.null(self$`keywords`)) {
        TargetingTemplateGetResponseDataObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      if (!is.null(self$`tracking_urls`)) {
        TargetingTemplateGetResponseDataObject[["tracking_urls"]] <-
          self$`tracking_urls`$toJSON()
      }
      if (!is.null(self$`id`)) {
        TargetingTemplateGetResponseDataObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created_time`)) {
        TargetingTemplateGetResponseDataObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`updated_time`)) {
        TargetingTemplateGetResponseDataObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`ad_account_id`)) {
        TargetingTemplateGetResponseDataObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`status`)) {
        TargetingTemplateGetResponseDataObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`sizing`)) {
        TargetingTemplateGetResponseDataObject[["sizing"]] <-
          self$`sizing`$toJSON()
      }
      if (!is.null(self$`valid`)) {
        TargetingTemplateGetResponseDataObject[["valid"]] <-
          self$`valid`
      }
      TargetingTemplateGetResponseDataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateGetResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateGetResponseData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`targeting_attributes`)) {
        `targeting_attributes_object` <- TargetingSpec$new()
        `targeting_attributes_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_attributes`, auto_unbox = TRUE, digits = NA))
        self$`targeting_attributes` <- `targeting_attributes_object`
      }
      if (!is.null(this_object$`placement_group`)) {
        `placement_group_object` <- PlacementGroupType$new()
        `placement_group_object`$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
        self$`placement_group` <- `placement_group_object`
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[TargetingTemplateKeyword]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("ACTIVE", "DELETED"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"ACTIVE\", \"DELETED\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`sizing`)) {
        `sizing_object` <- TargetingTemplateAudienceSizing$new()
        `sizing_object`$fromJSON(jsonlite::toJSON(this_object$`sizing`, auto_unbox = TRUE, digits = NA))
        self$`sizing` <- `sizing_object`
      }
      if (!is.null(this_object$`valid`)) {
        self$`valid` <- this_object$`valid`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateGetResponseData in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`auto_targeting_enabled`)) {
          sprintf(
          '"auto_targeting_enabled":
            %s
                    ',
          tolower(self$`auto_targeting_enabled`)
          )
        },
        if (!is.null(self$`targeting_attributes`)) {
          sprintf(
          '"targeting_attributes":
          %s
          ',
          jsonlite::toJSON(self$`targeting_attributes`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`placement_group`)) {
          sprintf(
          '"placement_group":
          %s
          ',
          jsonlite::toJSON(self$`placement_group`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`keywords`)) {
          sprintf(
          '"keywords":
          [%s]
',
          paste(sapply(self$`keywords`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`tracking_urls`)) {
          sprintf(
          '"tracking_urls":
          %s
          ',
          jsonlite::toJSON(self$`tracking_urls`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`created_time`)) {
          sprintf(
          '"created_time":
            %d
                    ',
          self$`created_time`
          )
        },
        if (!is.null(self$`updated_time`)) {
          sprintf(
          '"updated_time":
            %d
                    ',
          self$`updated_time`
          )
        },
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`sizing`)) {
          sprintf(
          '"sizing":
          %s
          ',
          jsonlite::toJSON(self$`sizing`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`valid`)) {
          sprintf(
          '"valid":
            %s
                    ',
          tolower(self$`valid`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateGetResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateGetResponseData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`targeting_attributes` <- TargetingSpec$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_attributes`, auto_unbox = TRUE, digits = NA))
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[TargetingTemplateKeyword]", loadNamespace("openapi"))
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`created_time` <- this_object$`created_time`
      self$`updated_time` <- this_object$`updated_time`
      self$`ad_account_id` <- this_object$`ad_account_id`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("ACTIVE", "DELETED"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"ACTIVE\", \"DELETED\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`sizing` <- TargetingTemplateAudienceSizing$new()$fromJSON(jsonlite::toJSON(this_object$`sizing`, auto_unbox = TRUE, digits = NA))
      self$`valid` <- this_object$`valid`
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingTemplateGetResponseData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTemplateGetResponseData
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
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
# TargetingTemplateGetResponseData$unlock()
#
## Below is an example to define the print function
# TargetingTemplateGetResponseData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTemplateGetResponseData$lock()

