#' Create a new AssetGroupUpdateItemReadOrUpdateItem
#'
#' @description
#' AssetGroupUpdateItemReadOrUpdateItem Class
#'
#' @docType class
#' @title AssetGroupUpdateItemReadOrUpdateItem
#' @description AssetGroupUpdateItemReadOrUpdateItem Class
#' @format An \code{R6Class} generator object
#' @field asset_group_id Unique identifier of the asset group to update. character
#' @field asset_group_types Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. list(\link{AssetGroupType}) [optional]
#' @field assets_to_add A list of asset ids to add to the asset group. list(character) [optional]
#' @field assets_to_remove A list of asset ids to remove from the asset group. list(character) [optional]
#' @field description Asset group description. character [optional]
#' @field name Asset Group name. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetGroupUpdateItemReadOrUpdateItem <- R6::R6Class(
  "AssetGroupUpdateItemReadOrUpdateItem",
  public = list(
    `asset_group_id` = NULL,
    `asset_group_types` = NULL,
    `assets_to_add` = NULL,
    `assets_to_remove` = NULL,
    `description` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new AssetGroupUpdateItemReadOrUpdateItem class.
    #'
    #' @param asset_group_id Unique identifier of the asset group to update.
    #' @param asset_group_types Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
    #' @param assets_to_add A list of asset ids to add to the asset group.
    #' @param assets_to_remove A list of asset ids to remove from the asset group.
    #' @param description Asset group description.
    #' @param name Asset Group name.
    #' @param ... Other optional arguments.
    initialize = function(`asset_group_id`, `asset_group_types` = NULL, `assets_to_add` = NULL, `assets_to_remove` = NULL, `description` = NULL, `name` = NULL, ...) {
      if (!missing(`asset_group_id`)) {
        if (!(is.character(`asset_group_id`) && length(`asset_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_id`. Must be a string:", `asset_group_id`))
        }
        self$`asset_group_id` <- `asset_group_id`
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
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return AssetGroupUpdateItemReadOrUpdateItem as a base R list.
    #' @examples
    #' # convert array of AssetGroupUpdateItemReadOrUpdateItem (x) to a data frame
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
    #' Convert AssetGroupUpdateItemReadOrUpdateItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssetGroupUpdateItemReadOrUpdateItemObject <- list()
      if (!is.null(self$`asset_group_id`)) {
        AssetGroupUpdateItemReadOrUpdateItemObject[["asset_group_id"]] <-
          self$`asset_group_id`
      }
      if (!is.null(self$`asset_group_types`)) {
        AssetGroupUpdateItemReadOrUpdateItemObject[["asset_group_types"]] <-
          self$extractSimpleType(self$`asset_group_types`)
      }
      if (!is.null(self$`assets_to_add`)) {
        AssetGroupUpdateItemReadOrUpdateItemObject[["assets_to_add"]] <-
          self$`assets_to_add`
      }
      if (!is.null(self$`assets_to_remove`)) {
        AssetGroupUpdateItemReadOrUpdateItemObject[["assets_to_remove"]] <-
          self$`assets_to_remove`
      }
      if (!is.null(self$`description`)) {
        AssetGroupUpdateItemReadOrUpdateItemObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`name`)) {
        AssetGroupUpdateItemReadOrUpdateItemObject[["name"]] <-
          self$`name`
      }
      return(AssetGroupUpdateItemReadOrUpdateItemObject)
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
    #' Deserialize JSON string into an instance of AssetGroupUpdateItemReadOrUpdateItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupUpdateItemReadOrUpdateItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_group_id`)) {
        self$`asset_group_id` <- this_object$`asset_group_id`
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
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssetGroupUpdateItemReadOrUpdateItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupUpdateItemReadOrUpdateItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupUpdateItemReadOrUpdateItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_group_id` <- this_object$`asset_group_id`
      self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[AssetGroupType]", loadNamespace("openapi"))
      self$`assets_to_add` <- ApiClient$new()$deserializeObj(this_object$`assets_to_add`, "array[character]", loadNamespace("openapi"))
      self$`assets_to_remove` <- ApiClient$new()$deserializeObj(this_object$`assets_to_remove`, "array[character]", loadNamespace("openapi"))
      self$`description` <- this_object$`description`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetGroupUpdateItemReadOrUpdateItem and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupUpdateItemReadOrUpdateItem: the required field `asset_group_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssetGroupUpdateItemReadOrUpdateItem
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
# AssetGroupUpdateItemReadOrUpdateItem$unlock()
#
## Below is an example to define the print function
# AssetGroupUpdateItemReadOrUpdateItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssetGroupUpdateItemReadOrUpdateItem$lock()

