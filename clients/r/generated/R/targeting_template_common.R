#' Create a new TargetingTemplateCommon
#'
#' @description
#' TargetingTemplateCommon Class
#'
#' @docType class
#' @title TargetingTemplateCommon
#' @description TargetingTemplateCommon Class
#' @format An \code{R6Class} generator object
#' @field name targeting template name character [optional]
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. character [optional]
#' @field targeting_attributes  \link{TargetingSpec} [optional]
#' @field placement_group  \link{PlacementGroupType} [optional]
#' @field keywords  list(\link{TargetingTemplateKeyword}) [optional]
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTemplateCommon <- R6::R6Class(
  "TargetingTemplateCommon",
  public = list(
    `name` = NULL,
    `auto_targeting_enabled` = NULL,
    `targeting_attributes` = NULL,
    `placement_group` = NULL,
    `keywords` = NULL,
    `tracking_urls` = NULL,

    #' @description
    #' Initialize a new TargetingTemplateCommon class.
    #'
    #' @param name targeting template name
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.. Default to TRUE.
    #' @param targeting_attributes targeting_attributes
    #' @param placement_group placement_group
    #' @param keywords keywords
    #' @param tracking_urls tracking_urls
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `auto_targeting_enabled` = TRUE, `targeting_attributes` = NULL, `placement_group` = NULL, `keywords` = NULL, `tracking_urls` = NULL, ...) {
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
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateCommon in JSON format
    toJSON = function() {
      TargetingTemplateCommonObject <- list()
      if (!is.null(self$`name`)) {
        TargetingTemplateCommonObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`auto_targeting_enabled`)) {
        TargetingTemplateCommonObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`targeting_attributes`)) {
        TargetingTemplateCommonObject[["targeting_attributes"]] <-
          self$`targeting_attributes`$toJSON()
      }
      if (!is.null(self$`placement_group`)) {
        TargetingTemplateCommonObject[["placement_group"]] <-
          self$`placement_group`$toJSON()
      }
      if (!is.null(self$`keywords`)) {
        TargetingTemplateCommonObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      if (!is.null(self$`tracking_urls`)) {
        TargetingTemplateCommonObject[["tracking_urls"]] <-
          self$`tracking_urls`$toJSON()
      }
      TargetingTemplateCommonObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateCommon
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
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateCommon in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateCommon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`targeting_attributes` <- TargetingSpec$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_attributes`, auto_unbox = TRUE, digits = NA))
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[TargetingTemplateKeyword]", loadNamespace("openapi"))
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingTemplateCommon and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTemplateCommon
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
# TargetingTemplateCommon$unlock()
#
## Below is an example to define the print function
# TargetingTemplateCommon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTemplateCommon$lock()

