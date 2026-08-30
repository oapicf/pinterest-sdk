#' Create a new AssetGroupBinding
#'
#' @description
#' AssetGroupBinding Class
#'
#' @docType class
#' @title AssetGroupBinding
#' @description AssetGroupBinding Class
#' @format An \code{R6Class} generator object
#' @field ad_accounts_ids A list of ad account IDs under the asset group list(character)
#' @field asset_group_description Asset group description character
#' @field asset_group_name Asset Group name character
#' @field asset_group_types Asset group types list(character)
#' @field catalogs_ids A list of catalog IDs under asset group list(character)
#' @field created_by The data of the user that created the asset group. \link{BusinessAccessUserSummary}
#' @field created_time The creation time of the asset group integer
#' @field id Asset Group ID. character
#' @field owner The data of the business that owns the asset group. \link{BusinessAccessUserSummary}
#' @field profiles_ids A list of profile IDs under asset group list(character)
#' @field updated_time The last update time of the asset group integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetGroupBinding <- R6::R6Class(
  "AssetGroupBinding",
  public = list(
    `ad_accounts_ids` = NULL,
    `asset_group_description` = NULL,
    `asset_group_name` = NULL,
    `asset_group_types` = NULL,
    `catalogs_ids` = NULL,
    `created_by` = NULL,
    `created_time` = NULL,
    `id` = NULL,
    `owner` = NULL,
    `profiles_ids` = NULL,
    `updated_time` = NULL,

    #' @description
    #' Initialize a new AssetGroupBinding class.
    #'
    #' @param ad_accounts_ids A list of ad account IDs under the asset group
    #' @param asset_group_description Asset group description
    #' @param asset_group_name Asset Group name
    #' @param asset_group_types Asset group types
    #' @param catalogs_ids A list of catalog IDs under asset group
    #' @param created_by The data of the user that created the asset group.
    #' @param created_time The creation time of the asset group
    #' @param id Asset Group ID.
    #' @param owner The data of the business that owns the asset group.
    #' @param profiles_ids A list of profile IDs under asset group
    #' @param updated_time The last update time of the asset group
    #' @param ... Other optional arguments.
    initialize = function(`ad_accounts_ids`, `asset_group_description`, `asset_group_name`, `asset_group_types`, `catalogs_ids`, `created_by`, `created_time`, `id`, `owner`, `profiles_ids`, `updated_time`, ...) {
      if (!missing(`ad_accounts_ids`)) {
        stopifnot(is.vector(`ad_accounts_ids`), length(`ad_accounts_ids`) != 0)
        sapply(`ad_accounts_ids`, function(x) stopifnot(is.character(x)))
        self$`ad_accounts_ids` <- `ad_accounts_ids`
      }
      if (!missing(`asset_group_description`)) {
        if (!(is.character(`asset_group_description`) && length(`asset_group_description`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_description`. Must be a string:", `asset_group_description`))
        }
        self$`asset_group_description` <- `asset_group_description`
      }
      if (!missing(`asset_group_name`)) {
        if (!(is.character(`asset_group_name`) && length(`asset_group_name`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_name`. Must be a string:", `asset_group_name`))
        }
        self$`asset_group_name` <- `asset_group_name`
      }
      if (!missing(`asset_group_types`)) {
        stopifnot(is.vector(`asset_group_types`), length(`asset_group_types`) != 0)
        sapply(`asset_group_types`, function(x) stopifnot(is.character(x)))
        self$`asset_group_types` <- `asset_group_types`
      }
      if (!missing(`catalogs_ids`)) {
        stopifnot(is.vector(`catalogs_ids`), length(`catalogs_ids`) != 0)
        sapply(`catalogs_ids`, function(x) stopifnot(is.character(x)))
        self$`catalogs_ids` <- `catalogs_ids`
      }
      if (!missing(`created_by`)) {
        stopifnot(R6::is.R6(`created_by`))
        self$`created_by` <- `created_by`
      }
      if (!missing(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`owner`)) {
        stopifnot(R6::is.R6(`owner`))
        self$`owner` <- `owner`
      }
      if (!missing(`profiles_ids`)) {
        stopifnot(is.vector(`profiles_ids`), length(`profiles_ids`) != 0)
        sapply(`profiles_ids`, function(x) stopifnot(is.character(x)))
        self$`profiles_ids` <- `profiles_ids`
      }
      if (!missing(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
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
    #' @return AssetGroupBinding as a base R list.
    #' @examples
    #' # convert array of AssetGroupBinding (x) to a data frame
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
    #' Convert AssetGroupBinding to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssetGroupBindingObject <- list()
      if (!is.null(self$`ad_accounts_ids`)) {
        AssetGroupBindingObject[["ad_accounts_ids"]] <-
          self$`ad_accounts_ids`
      }
      if (!is.null(self$`asset_group_description`)) {
        AssetGroupBindingObject[["asset_group_description"]] <-
          self$`asset_group_description`
      }
      if (!is.null(self$`asset_group_name`)) {
        AssetGroupBindingObject[["asset_group_name"]] <-
          self$`asset_group_name`
      }
      if (!is.null(self$`asset_group_types`)) {
        AssetGroupBindingObject[["asset_group_types"]] <-
          self$`asset_group_types`
      }
      if (!is.null(self$`catalogs_ids`)) {
        AssetGroupBindingObject[["catalogs_ids"]] <-
          self$`catalogs_ids`
      }
      if (!is.null(self$`created_by`)) {
        AssetGroupBindingObject[["created_by"]] <-
          self$extractSimpleType(self$`created_by`)
      }
      if (!is.null(self$`created_time`)) {
        AssetGroupBindingObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`id`)) {
        AssetGroupBindingObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`owner`)) {
        AssetGroupBindingObject[["owner"]] <-
          self$extractSimpleType(self$`owner`)
      }
      if (!is.null(self$`profiles_ids`)) {
        AssetGroupBindingObject[["profiles_ids"]] <-
          self$`profiles_ids`
      }
      if (!is.null(self$`updated_time`)) {
        AssetGroupBindingObject[["updated_time"]] <-
          self$`updated_time`
      }
      return(AssetGroupBindingObject)
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
    #' Deserialize JSON string into an instance of AssetGroupBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupBinding
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_accounts_ids`)) {
        self$`ad_accounts_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_accounts_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`asset_group_description`)) {
        self$`asset_group_description` <- this_object$`asset_group_description`
      }
      if (!is.null(this_object$`asset_group_name`)) {
        self$`asset_group_name` <- this_object$`asset_group_name`
      }
      if (!is.null(this_object$`asset_group_types`)) {
        self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`catalogs_ids`)) {
        self$`catalogs_ids` <- ApiClient$new()$deserializeObj(this_object$`catalogs_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`created_by`)) {
        `created_by_object` <- BusinessAccessUserSummary$new()
        `created_by_object`$fromJSON(jsonlite::toJSON(this_object$`created_by`, auto_unbox = TRUE, digits = NA))
        self$`created_by` <- `created_by_object`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`owner`)) {
        `owner_object` <- BusinessAccessUserSummary$new()
        `owner_object`$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
        self$`owner` <- `owner_object`
      }
      if (!is.null(this_object$`profiles_ids`)) {
        self$`profiles_ids` <- ApiClient$new()$deserializeObj(this_object$`profiles_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssetGroupBinding in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupBinding
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_accounts_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_accounts_ids`, "array[character]", loadNamespace("openapi"))
      self$`asset_group_description` <- this_object$`asset_group_description`
      self$`asset_group_name` <- this_object$`asset_group_name`
      self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[character]", loadNamespace("openapi"))
      self$`catalogs_ids` <- ApiClient$new()$deserializeObj(this_object$`catalogs_ids`, "array[character]", loadNamespace("openapi"))
      self$`created_by` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`created_by`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`id` <- this_object$`id`
      self$`owner` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
      self$`profiles_ids` <- ApiClient$new()$deserializeObj(this_object$`profiles_ids`, "array[character]", loadNamespace("openapi"))
      self$`updated_time` <- this_object$`updated_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetGroupBinding and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_accounts_ids`
      if (!is.null(input_json$`ad_accounts_ids`)) {
        stopifnot(is.vector(input_json$`ad_accounts_ids`), length(input_json$`ad_accounts_ids`) != 0)
        tmp <- sapply(input_json$`ad_accounts_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `ad_accounts_ids` is missing."))
      }
      # check the required field `asset_group_description`
      if (!is.null(input_json$`asset_group_description`)) {
        if (!(is.character(input_json$`asset_group_description`) && length(input_json$`asset_group_description`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_description`. Must be a string:", input_json$`asset_group_description`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `asset_group_description` is missing."))
      }
      # check the required field `asset_group_name`
      if (!is.null(input_json$`asset_group_name`)) {
        if (!(is.character(input_json$`asset_group_name`) && length(input_json$`asset_group_name`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_name`. Must be a string:", input_json$`asset_group_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `asset_group_name` is missing."))
      }
      # check the required field `asset_group_types`
      if (!is.null(input_json$`asset_group_types`)) {
        stopifnot(is.vector(input_json$`asset_group_types`), length(input_json$`asset_group_types`) != 0)
        tmp <- sapply(input_json$`asset_group_types`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `asset_group_types` is missing."))
      }
      # check the required field `catalogs_ids`
      if (!is.null(input_json$`catalogs_ids`)) {
        stopifnot(is.vector(input_json$`catalogs_ids`), length(input_json$`catalogs_ids`) != 0)
        tmp <- sapply(input_json$`catalogs_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `catalogs_ids` is missing."))
      }
      # check the required field `created_by`
      if (!is.null(input_json$`created_by`)) {
        stopifnot(R6::is.R6(input_json$`created_by`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `created_by` is missing."))
      }
      # check the required field `created_time`
      if (!is.null(input_json$`created_time`)) {
        if (!(is.numeric(input_json$`created_time`) && length(input_json$`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", input_json$`created_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `created_time` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `id` is missing."))
      }
      # check the required field `owner`
      if (!is.null(input_json$`owner`)) {
        stopifnot(R6::is.R6(input_json$`owner`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `owner` is missing."))
      }
      # check the required field `profiles_ids`
      if (!is.null(input_json$`profiles_ids`)) {
        stopifnot(is.vector(input_json$`profiles_ids`), length(input_json$`profiles_ids`) != 0)
        tmp <- sapply(input_json$`profiles_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `profiles_ids` is missing."))
      }
      # check the required field `updated_time`
      if (!is.null(input_json$`updated_time`)) {
        if (!(is.numeric(input_json$`updated_time`) && length(input_json$`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", input_json$`updated_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssetGroupBinding: the required field `updated_time` is missing."))
      }
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
      # check if the required `ad_accounts_ids` is null
      if (is.null(self$`ad_accounts_ids`)) {
        return(FALSE)
      }

      # check if the required `asset_group_types` is null
      if (is.null(self$`asset_group_types`)) {
        return(FALSE)
      }

      # check if the required `catalogs_ids` is null
      if (is.null(self$`catalogs_ids`)) {
        return(FALSE)
      }

      # check if the required `created_by` is null
      if (is.null(self$`created_by`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `owner` is null
      if (is.null(self$`owner`)) {
        return(FALSE)
      }

      # check if the required `profiles_ids` is null
      if (is.null(self$`profiles_ids`)) {
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
      # check if the required `ad_accounts_ids` is null
      if (is.null(self$`ad_accounts_ids`)) {
        invalid_fields["ad_accounts_ids"] <- "Non-nullable required field `ad_accounts_ids` cannot be null."
      }

      # check if the required `asset_group_types` is null
      if (is.null(self$`asset_group_types`)) {
        invalid_fields["asset_group_types"] <- "Non-nullable required field `asset_group_types` cannot be null."
      }

      # check if the required `catalogs_ids` is null
      if (is.null(self$`catalogs_ids`)) {
        invalid_fields["catalogs_ids"] <- "Non-nullable required field `catalogs_ids` cannot be null."
      }

      # check if the required `created_by` is null
      if (is.null(self$`created_by`)) {
        invalid_fields["created_by"] <- "Non-nullable required field `created_by` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `owner` is null
      if (is.null(self$`owner`)) {
        invalid_fields["owner"] <- "Non-nullable required field `owner` cannot be null."
      }

      # check if the required `profiles_ids` is null
      if (is.null(self$`profiles_ids`)) {
        invalid_fields["profiles_ids"] <- "Non-nullable required field `profiles_ids` cannot be null."
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

