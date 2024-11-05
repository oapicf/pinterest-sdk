#' Create a new AssetGroupBinding
#'
#' @description
#' AssetGroupBinding Class
#'
#' @docType class
#' @title AssetGroupBinding
#' @description AssetGroupBinding Class
#' @format An \code{R6Class} generator object
#' @field id Asset Group ID. character [optional]
#' @field asset_group_name Asset Group name character [optional]
#' @field asset_group_description Asset group description character [optional]
#' @field asset_group_types Asset group types list(character) [optional]
#' @field ad_accounts_ids A list of ad account IDs under the asset group list(character) [optional]
#' @field profiles_ids A list of profile IDs under asset group list(character) [optional]
#' @field created_time The creation time of the asset group integer [optional]
#' @field updated_time The last update time of the asset group integer [optional]
#' @field owner The data of the business that owns the asset group. \link{BusinessAccessUserSummary} [optional]
#' @field created_by The data of the user that created the asset group. \link{BusinessAccessUserSummary} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetGroupBinding <- R6::R6Class(
  "AssetGroupBinding",
  public = list(
    `id` = NULL,
    `asset_group_name` = NULL,
    `asset_group_description` = NULL,
    `asset_group_types` = NULL,
    `ad_accounts_ids` = NULL,
    `profiles_ids` = NULL,
    `created_time` = NULL,
    `updated_time` = NULL,
    `owner` = NULL,
    `created_by` = NULL,

    #' @description
    #' Initialize a new AssetGroupBinding class.
    #'
    #' @param id Asset Group ID.
    #' @param asset_group_name Asset Group name
    #' @param asset_group_description Asset group description
    #' @param asset_group_types Asset group types
    #' @param ad_accounts_ids A list of ad account IDs under the asset group
    #' @param profiles_ids A list of profile IDs under asset group
    #' @param created_time The creation time of the asset group
    #' @param updated_time The last update time of the asset group
    #' @param owner The data of the business that owns the asset group.
    #' @param created_by The data of the user that created the asset group.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `asset_group_name` = NULL, `asset_group_description` = NULL, `asset_group_types` = NULL, `ad_accounts_ids` = NULL, `profiles_ids` = NULL, `created_time` = NULL, `updated_time` = NULL, `owner` = NULL, `created_by` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`asset_group_name`)) {
        if (!(is.character(`asset_group_name`) && length(`asset_group_name`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_name`. Must be a string:", `asset_group_name`))
        }
        self$`asset_group_name` <- `asset_group_name`
      }
      if (!is.null(`asset_group_description`)) {
        if (!(is.character(`asset_group_description`) && length(`asset_group_description`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_description`. Must be a string:", `asset_group_description`))
        }
        self$`asset_group_description` <- `asset_group_description`
      }
      if (!is.null(`asset_group_types`)) {
        stopifnot(is.vector(`asset_group_types`), length(`asset_group_types`) != 0)
        sapply(`asset_group_types`, function(x) stopifnot(is.character(x)))
        self$`asset_group_types` <- `asset_group_types`
      }
      if (!is.null(`ad_accounts_ids`)) {
        stopifnot(is.vector(`ad_accounts_ids`), length(`ad_accounts_ids`) != 0)
        sapply(`ad_accounts_ids`, function(x) stopifnot(is.character(x)))
        self$`ad_accounts_ids` <- `ad_accounts_ids`
      }
      if (!is.null(`profiles_ids`)) {
        stopifnot(is.vector(`profiles_ids`), length(`profiles_ids`) != 0)
        sapply(`profiles_ids`, function(x) stopifnot(is.character(x)))
        self$`profiles_ids` <- `profiles_ids`
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
      if (!is.null(`owner`)) {
        stopifnot(R6::is.R6(`owner`))
        self$`owner` <- `owner`
      }
      if (!is.null(`created_by`)) {
        stopifnot(R6::is.R6(`created_by`))
        self$`created_by` <- `created_by`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AssetGroupBinding in JSON format
    toJSON = function() {
      AssetGroupBindingObject <- list()
      if (!is.null(self$`id`)) {
        AssetGroupBindingObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`asset_group_name`)) {
        AssetGroupBindingObject[["asset_group_name"]] <-
          self$`asset_group_name`
      }
      if (!is.null(self$`asset_group_description`)) {
        AssetGroupBindingObject[["asset_group_description"]] <-
          self$`asset_group_description`
      }
      if (!is.null(self$`asset_group_types`)) {
        AssetGroupBindingObject[["asset_group_types"]] <-
          self$`asset_group_types`
      }
      if (!is.null(self$`ad_accounts_ids`)) {
        AssetGroupBindingObject[["ad_accounts_ids"]] <-
          self$`ad_accounts_ids`
      }
      if (!is.null(self$`profiles_ids`)) {
        AssetGroupBindingObject[["profiles_ids"]] <-
          self$`profiles_ids`
      }
      if (!is.null(self$`created_time`)) {
        AssetGroupBindingObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`updated_time`)) {
        AssetGroupBindingObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`owner`)) {
        AssetGroupBindingObject[["owner"]] <-
          self$`owner`$toJSON()
      }
      if (!is.null(self$`created_by`)) {
        AssetGroupBindingObject[["created_by"]] <-
          self$`created_by`$toJSON()
      }
      AssetGroupBindingObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupBinding
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`asset_group_name`)) {
        self$`asset_group_name` <- this_object$`asset_group_name`
      }
      if (!is.null(this_object$`asset_group_description`)) {
        self$`asset_group_description` <- this_object$`asset_group_description`
      }
      if (!is.null(this_object$`asset_group_types`)) {
        self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_accounts_ids`)) {
        self$`ad_accounts_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_accounts_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`profiles_ids`)) {
        self$`profiles_ids` <- ApiClient$new()$deserializeObj(this_object$`profiles_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`owner`)) {
        `owner_object` <- BusinessAccessUserSummary$new()
        `owner_object`$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
        self$`owner` <- `owner_object`
      }
      if (!is.null(this_object$`created_by`)) {
        `created_by_object` <- BusinessAccessUserSummary$new()
        `created_by_object`$fromJSON(jsonlite::toJSON(this_object$`created_by`, auto_unbox = TRUE, digits = NA))
        self$`created_by` <- `created_by_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AssetGroupBinding in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`asset_group_name`)) {
          sprintf(
          '"asset_group_name":
            "%s"
                    ',
          self$`asset_group_name`
          )
        },
        if (!is.null(self$`asset_group_description`)) {
          sprintf(
          '"asset_group_description":
            "%s"
                    ',
          self$`asset_group_description`
          )
        },
        if (!is.null(self$`asset_group_types`)) {
          sprintf(
          '"asset_group_types":
             [%s]
          ',
          paste(unlist(lapply(self$`asset_group_types`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`ad_accounts_ids`)) {
          sprintf(
          '"ad_accounts_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`ad_accounts_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`profiles_ids`)) {
          sprintf(
          '"profiles_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`profiles_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
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
        if (!is.null(self$`owner`)) {
          sprintf(
          '"owner":
          %s
          ',
          jsonlite::toJSON(self$`owner`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`created_by`)) {
          sprintf(
          '"created_by":
          %s
          ',
          jsonlite::toJSON(self$`created_by`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupBinding
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`asset_group_name` <- this_object$`asset_group_name`
      self$`asset_group_description` <- this_object$`asset_group_description`
      self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[character]", loadNamespace("openapi"))
      self$`ad_accounts_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_accounts_ids`, "array[character]", loadNamespace("openapi"))
      self$`profiles_ids` <- ApiClient$new()$deserializeObj(this_object$`profiles_ids`, "array[character]", loadNamespace("openapi"))
      self$`created_time` <- this_object$`created_time`
      self$`updated_time` <- this_object$`updated_time`
      self$`owner` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
      self$`created_by` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`created_by`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetGroupBinding and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssetGroupBinding
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
# AssetGroupBinding$unlock()
#
## Below is an example to define the print function
# AssetGroupBinding$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssetGroupBinding$lock()

