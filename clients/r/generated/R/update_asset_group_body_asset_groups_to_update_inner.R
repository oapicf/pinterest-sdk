#' Create a new UpdateAssetGroupBodyAssetGroupsToUpdateInner
#'
#' @description
#' UpdateAssetGroupBodyAssetGroupsToUpdateInner Class
#'
#' @docType class
#' @title UpdateAssetGroupBodyAssetGroupsToUpdateInner
#' @description UpdateAssetGroupBodyAssetGroupsToUpdateInner Class
#' @format An \code{R6Class} generator object
#' @field asset_group_id Unique identifier of the asset group to update. character
#' @field name Asset Group name character [optional]
#' @field description Asset group description character [optional]
#' @field asset_group_types Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. list(\link{AssetGroupType}) [optional]
#' @field assets_to_add A list of asset ids to add to the asset group. list(character) [optional]
#' @field assets_to_remove A list of asset ids to remove from the asset group. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateAssetGroupBodyAssetGroupsToUpdateInner <- R6::R6Class(
  "UpdateAssetGroupBodyAssetGroupsToUpdateInner",
  public = list(
    `asset_group_id` = NULL,
    `name` = NULL,
    `description` = NULL,
    `asset_group_types` = NULL,
    `assets_to_add` = NULL,
    `assets_to_remove` = NULL,

    #' @description
    #' Initialize a new UpdateAssetGroupBodyAssetGroupsToUpdateInner class.
    #'
    #' @param asset_group_id Unique identifier of the asset group to update.
    #' @param name Asset Group name
    #' @param description Asset group description
    #' @param asset_group_types Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
    #' @param assets_to_add A list of asset ids to add to the asset group.
    #' @param assets_to_remove A list of asset ids to remove from the asset group.
    #' @param ... Other optional arguments.
    initialize = function(`asset_group_id`, `name` = NULL, `description` = NULL, `asset_group_types` = NULL, `assets_to_add` = NULL, `assets_to_remove` = NULL, ...) {
      if (!missing(`asset_group_id`)) {
        if (!(is.character(`asset_group_id`) && length(`asset_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_id`. Must be a string:", `asset_group_id`))
        }
        self$`asset_group_id` <- `asset_group_id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`asset_group_types`)) {
        stopifnot(is.vector(`asset_group_types`), length(`asset_group_types`) != 0)
        sapply(`asset_group_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`asset_group_types` <- `asset_group_types`
      }
      if (!is.null(`assets_to_add`)) {
        stopifnot(is.vector(`assets_to_add`), length(`assets_to_add`) != 0)
        sapply(`assets_to_add`, function(x) stopifnot(is.character(x)))
        self$`assets_to_add` <- `assets_to_add`
      }
      if (!is.null(`assets_to_remove`)) {
        stopifnot(is.vector(`assets_to_remove`), length(`assets_to_remove`) != 0)
        sapply(`assets_to_remove`, function(x) stopifnot(is.character(x)))
        self$`assets_to_remove` <- `assets_to_remove`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateAssetGroupBodyAssetGroupsToUpdateInner in JSON format
    toJSON = function() {
      UpdateAssetGroupBodyAssetGroupsToUpdateInnerObject <- list()
      if (!is.null(self$`asset_group_id`)) {
        UpdateAssetGroupBodyAssetGroupsToUpdateInnerObject[["asset_group_id"]] <-
          self$`asset_group_id`
      }
      if (!is.null(self$`name`)) {
        UpdateAssetGroupBodyAssetGroupsToUpdateInnerObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        UpdateAssetGroupBodyAssetGroupsToUpdateInnerObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`asset_group_types`)) {
        UpdateAssetGroupBodyAssetGroupsToUpdateInnerObject[["asset_group_types"]] <-
          lapply(self$`asset_group_types`, function(x) x$toJSON())
      }
      if (!is.null(self$`assets_to_add`)) {
        UpdateAssetGroupBodyAssetGroupsToUpdateInnerObject[["assets_to_add"]] <-
          self$`assets_to_add`
      }
      if (!is.null(self$`assets_to_remove`)) {
        UpdateAssetGroupBodyAssetGroupsToUpdateInnerObject[["assets_to_remove"]] <-
          self$`assets_to_remove`
      }
      UpdateAssetGroupBodyAssetGroupsToUpdateInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateAssetGroupBodyAssetGroupsToUpdateInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateAssetGroupBodyAssetGroupsToUpdateInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_group_id`)) {
        self$`asset_group_id` <- this_object$`asset_group_id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`asset_group_types`)) {
        self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[AssetGroupType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`assets_to_add`)) {
        self$`assets_to_add` <- ApiClient$new()$deserializeObj(this_object$`assets_to_add`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`assets_to_remove`)) {
        self$`assets_to_remove` <- ApiClient$new()$deserializeObj(this_object$`assets_to_remove`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateAssetGroupBodyAssetGroupsToUpdateInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`asset_group_id`)) {
          sprintf(
          '"asset_group_id":
            "%s"
                    ',
          self$`asset_group_id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`asset_group_types`)) {
          sprintf(
          '"asset_group_types":
          [%s]
',
          paste(sapply(self$`asset_group_types`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`assets_to_add`)) {
          sprintf(
          '"assets_to_add":
             [%s]
          ',
          paste(unlist(lapply(self$`assets_to_add`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`assets_to_remove`)) {
          sprintf(
          '"assets_to_remove":
             [%s]
          ',
          paste(unlist(lapply(self$`assets_to_remove`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateAssetGroupBodyAssetGroupsToUpdateInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateAssetGroupBodyAssetGroupsToUpdateInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_group_id` <- this_object$`asset_group_id`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[AssetGroupType]", loadNamespace("openapi"))
      self$`assets_to_add` <- ApiClient$new()$deserializeObj(this_object$`assets_to_add`, "array[character]", loadNamespace("openapi"))
      self$`assets_to_remove` <- ApiClient$new()$deserializeObj(this_object$`assets_to_remove`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdateAssetGroupBodyAssetGroupsToUpdateInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `asset_group_id`
      if (!is.null(input_json$`asset_group_id`)) {
        if (!(is.character(input_json$`asset_group_id`) && length(input_json$`asset_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_id`. Must be a string:", input_json$`asset_group_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateAssetGroupBodyAssetGroupsToUpdateInner: the required field `asset_group_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateAssetGroupBodyAssetGroupsToUpdateInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `asset_group_id` is null
      if (is.null(self$`asset_group_id`)) {
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
      # check if the required `asset_group_id` is null
      if (is.null(self$`asset_group_id`)) {
        invalid_fields["asset_group_id"] <- "Non-nullable required field `asset_group_id` cannot be null."
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
# UpdateAssetGroupBodyAssetGroupsToUpdateInner$unlock()
#
## Below is an example to define the print function
# UpdateAssetGroupBodyAssetGroupsToUpdateInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateAssetGroupBodyAssetGroupsToUpdateInner$lock()

