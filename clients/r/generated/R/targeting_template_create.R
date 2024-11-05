#' Create a new TargetingTemplateCreate
#'
#' @description
#' TargetingTemplateCreate Class
#'
#' @docType class
#' @title TargetingTemplateCreate
#' @description TargetingTemplateCreate Class
#' @format An \code{R6Class} generator object
#' @field name Name of targeting template. character
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. character [optional]
#' @field targeting_attributes  \link{TargetingSpec}
#' @field placement_group  \link{PlacementGroupType} [optional]
#' @field keywords  list(\link{TargetingTemplateKeyword}) [optional]
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTemplateCreate <- R6::R6Class(
  "TargetingTemplateCreate",
  public = list(
    `name` = NULL,
    `auto_targeting_enabled` = NULL,
    `targeting_attributes` = NULL,
    `placement_group` = NULL,
    `keywords` = NULL,
    `tracking_urls` = NULL,

    #' @description
    #' Initialize a new TargetingTemplateCreate class.
    #'
    #' @param name Name of targeting template.
    #' @param targeting_attributes targeting_attributes
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.. Default to TRUE.
    #' @param placement_group placement_group
    #' @param keywords keywords
    #' @param tracking_urls tracking_urls
    #' @param ... Other optional arguments.
    initialize = function(`name`, `targeting_attributes`, `auto_targeting_enabled` = TRUE, `placement_group` = NULL, `keywords` = NULL, `tracking_urls` = NULL, ...) {
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
      if (!is.null(`auto_targeting_enabled`)) {
        if (!(is.logical(`auto_targeting_enabled`) && length(`auto_targeting_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `auto_targeting_enabled`. Must be a boolean:", `auto_targeting_enabled`))
        }
        self$`auto_targeting_enabled` <- `auto_targeting_enabled`
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
    #' @return TargetingTemplateCreate in JSON format
    toJSON = function() {
      TargetingTemplateCreateObject <- list()
      if (!is.null(self$`name`)) {
        TargetingTemplateCreateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`auto_targeting_enabled`)) {
        TargetingTemplateCreateObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`targeting_attributes`)) {
        TargetingTemplateCreateObject[["targeting_attributes"]] <-
          self$`targeting_attributes`$toJSON()
      }
      if (!is.null(self$`placement_group`)) {
        TargetingTemplateCreateObject[["placement_group"]] <-
          self$`placement_group`$toJSON()
      }
      if (!is.null(self$`keywords`)) {
        TargetingTemplateCreateObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      if (!is.null(self$`tracking_urls`)) {
        TargetingTemplateCreateObject[["tracking_urls"]] <-
          self$`tracking_urls`$toJSON()
      }
      TargetingTemplateCreateObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateCreate
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
    #' @return TargetingTemplateCreate in JSON format
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
    #' Deserialize JSON string into an instance of TargetingTemplateCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateCreate
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
    #' Validate JSON input with respect to TargetingTemplateCreate and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for TargetingTemplateCreate: the required field `name` is missing."))
      }
      # check the required field `targeting_attributes`
      if (!is.null(input_json$`targeting_attributes`)) {
        stopifnot(R6::is.R6(input_json$`targeting_attributes`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingTemplateCreate: the required field `targeting_attributes` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTemplateCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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
# TargetingTemplateCreate$unlock()
#
## Below is an example to define the print function
# TargetingTemplateCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTemplateCreate$lock()

