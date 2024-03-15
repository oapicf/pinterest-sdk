#' Create a new AdGroupAudienceSizingRequest
#'
#' @description
#' AdGroupAudienceSizingRequest Class
#'
#' @docType class
#' @title AdGroupAudienceSizingRequest
#' @description AdGroupAudienceSizingRequest Class
#' @format An \code{R6Class} generator object
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. character [optional]
#' @field placement_group <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. \link{PlacementGroupType} [optional]
#' @field creative_types Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. list(character) [optional]
#' @field targeting_spec  \link{TargetingSpec} [optional]
#' @field product_group_ids Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. list(character) [optional]
#' @field keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted. list(\link{AdGroupAudienceSizingRequestKeywordsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupAudienceSizingRequest <- R6::R6Class(
  "AdGroupAudienceSizingRequest",
  public = list(
    `auto_targeting_enabled` = NULL,
    `placement_group` = NULL,
    `creative_types` = NULL,
    `targeting_spec` = NULL,
    `product_group_ids` = NULL,
    `keywords` = NULL,
    #' Initialize a new AdGroupAudienceSizingRequest class.
    #'
    #' @description
    #' Initialize a new AdGroupAudienceSizingRequest class.
    #'
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.. Default to TRUE.
    #' @param placement_group <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.. Default to "ALL".
    #' @param creative_types Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    #' @param targeting_spec targeting_spec
    #' @param product_group_ids Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
    #' @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`auto_targeting_enabled` = TRUE, `placement_group` = "ALL", `creative_types` = NULL, `targeting_spec` = NULL, `product_group_ids` = NULL, `keywords` = NULL, ...) {
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
      if (!is.null(`creative_types`)) {
        stopifnot(is.vector(`creative_types`), length(`creative_types`) != 0)
        sapply(`creative_types`, function(x) stopifnot(is.character(x)))
        self$`creative_types` <- `creative_types`
      }
      if (!is.null(`targeting_spec`)) {
        stopifnot(R6::is.R6(`targeting_spec`))
        self$`targeting_spec` <- `targeting_spec`
      }
      if (!is.null(`product_group_ids`)) {
        stopifnot(is.vector(`product_group_ids`), length(`product_group_ids`) != 0)
        sapply(`product_group_ids`, function(x) stopifnot(is.character(x)))
        self$`product_group_ids` <- `product_group_ids`
      }
      if (!is.null(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupAudienceSizingRequest in JSON format
    #' @export
    toJSON = function() {
      AdGroupAudienceSizingRequestObject <- list()
      if (!is.null(self$`auto_targeting_enabled`)) {
        AdGroupAudienceSizingRequestObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`placement_group`)) {
        AdGroupAudienceSizingRequestObject[["placement_group"]] <-
          self$`placement_group`$toJSON()
      }
      if (!is.null(self$`creative_types`)) {
        AdGroupAudienceSizingRequestObject[["creative_types"]] <-
          self$`creative_types`
      }
      if (!is.null(self$`targeting_spec`)) {
        AdGroupAudienceSizingRequestObject[["targeting_spec"]] <-
          self$`targeting_spec`$toJSON()
      }
      if (!is.null(self$`product_group_ids`)) {
        AdGroupAudienceSizingRequestObject[["product_group_ids"]] <-
          self$`product_group_ids`
      }
      if (!is.null(self$`keywords`)) {
        AdGroupAudienceSizingRequestObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      AdGroupAudienceSizingRequestObject
    },
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`placement_group`)) {
        `placement_group_object` <- PlacementGroupType$new()
        `placement_group_object`$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
        self$`placement_group` <- `placement_group_object`
      }
      if (!is.null(this_object$`creative_types`)) {
        self$`creative_types` <- ApiClient$new()$deserializeObj(this_object$`creative_types`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`targeting_spec`)) {
        `targeting_spec_object` <- TargetingSpec$new()
        `targeting_spec_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
        self$`targeting_spec` <- `targeting_spec_object`
      }
      if (!is.null(this_object$`product_group_ids`)) {
        self$`product_group_ids` <- ApiClient$new()$deserializeObj(this_object$`product_group_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[AdGroupAudienceSizingRequestKeywordsInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupAudienceSizingRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`auto_targeting_enabled`)) {
          sprintf(
          '"auto_targeting_enabled":
            %s
                    ',
          tolower(self$`auto_targeting_enabled`)
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
        if (!is.null(self$`creative_types`)) {
          sprintf(
          '"creative_types":
             [%s]
          ',
          paste(unlist(lapply(self$`creative_types`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`targeting_spec`)) {
          sprintf(
          '"targeting_spec":
          %s
          ',
          jsonlite::toJSON(self$`targeting_spec`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`product_group_ids`)) {
          sprintf(
          '"product_group_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`product_group_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`keywords`)) {
          sprintf(
          '"keywords":
          [%s]
',
          paste(sapply(self$`keywords`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`creative_types` <- ApiClient$new()$deserializeObj(this_object$`creative_types`, "array[character]", loadNamespace("openapi"))
      self$`targeting_spec` <- TargetingSpec$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
      self$`product_group_ids` <- ApiClient$new()$deserializeObj(this_object$`product_group_ids`, "array[character]", loadNamespace("openapi"))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[AdGroupAudienceSizingRequestKeywordsInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to AdGroupAudienceSizingRequest
    #'
    #' @description
    #' Validate JSON input with respect to AdGroupAudienceSizingRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupAudienceSizingRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# AdGroupAudienceSizingRequest$unlock()
#
## Below is an example to define the print function
# AdGroupAudienceSizingRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupAudienceSizingRequest$lock()

