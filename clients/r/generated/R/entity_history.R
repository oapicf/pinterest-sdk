#' Create a new EntityHistory
#'
#' @description
#' EntityHistory Class
#'
#' @docType class
#' @title EntityHistory
#' @description EntityHistory Class
#' @format An \code{R6Class} generator object
#' @field change_timestamp A Unix timestamp representing the time of the change in seconds integer [optional]
#' @field data_changes Properties associated with a particular change to an entity's data list(\link{EntityDataChangeHistory}) [optional]
#' @field entity_id The id of the entity that was changed character [optional]
#' @field entity_name The name of the entity that was changed character [optional]
#' @field ldap The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users character [optional]
#' @field operation The type of operation that caused the change \link{ChangeHistoryOperationType} [optional]
#' @field user_id The id of the user who initiated the change character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EntityHistory <- R6::R6Class(
  "EntityHistory",
  public = list(
    `change_timestamp` = NULL,
    `data_changes` = NULL,
    `entity_id` = NULL,
    `entity_name` = NULL,
    `ldap` = NULL,
    `operation` = NULL,
    `user_id` = NULL,

    #' @description
    #' Initialize a new EntityHistory class.
    #'
    #' @param change_timestamp A Unix timestamp representing the time of the change in seconds
    #' @param data_changes Properties associated with a particular change to an entity's data
    #' @param entity_id The id of the entity that was changed
    #' @param entity_name The name of the entity that was changed
    #' @param ldap The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
    #' @param operation The type of operation that caused the change
    #' @param user_id The id of the user who initiated the change
    #' @param ... Other optional arguments.
    initialize = function(`change_timestamp` = NULL, `data_changes` = NULL, `entity_id` = NULL, `entity_name` = NULL, `ldap` = NULL, `operation` = NULL, `user_id` = NULL, ...) {
      if (!is.null(`change_timestamp`)) {
        if (!(is.numeric(`change_timestamp`) && length(`change_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `change_timestamp`. Must be an integer:", `change_timestamp`))
        }
        self$`change_timestamp` <- `change_timestamp`
      }
      if (!is.null(`data_changes`)) {
        stopifnot(is.vector(`data_changes`), length(`data_changes`) != 0)
        sapply(`data_changes`, function(x) stopifnot(R6::is.R6(x)))
        self$`data_changes` <- `data_changes`
      }
      if (!is.null(`entity_id`)) {
        if (!(is.character(`entity_id`) && length(`entity_id`) == 1)) {
          stop(paste("Error! Invalid data for `entity_id`. Must be a string:", `entity_id`))
        }
        self$`entity_id` <- `entity_id`
      }
      if (!is.null(`entity_name`)) {
        if (!(is.character(`entity_name`) && length(`entity_name`) == 1)) {
          stop(paste("Error! Invalid data for `entity_name`. Must be a string:", `entity_name`))
        }
        self$`entity_name` <- `entity_name`
      }
      if (!is.null(`ldap`)) {
        if (!(is.character(`ldap`) && length(`ldap`) == 1)) {
          stop(paste("Error! Invalid data for `ldap`. Must be a string:", `ldap`))
        }
        self$`ldap` <- `ldap`
      }
      if (!is.null(`operation`)) {
        if (!(`operation` %in% c())) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation`))
        self$`operation` <- `operation`
      }
      if (!is.null(`user_id`)) {
        if (!(is.character(`user_id`) && length(`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be a string:", `user_id`))
        }
        self$`user_id` <- `user_id`
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
    #' @return EntityHistory as a base R list.
    #' @examples
    #' # convert array of EntityHistory (x) to a data frame
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
    #' Convert EntityHistory to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EntityHistoryObject <- list()
      if (!is.null(self$`change_timestamp`)) {
        EntityHistoryObject[["change_timestamp"]] <-
          self$`change_timestamp`
      }
      if (!is.null(self$`data_changes`)) {
        EntityHistoryObject[["data_changes"]] <-
          self$extractSimpleType(self$`data_changes`)
      }
      if (!is.null(self$`entity_id`)) {
        EntityHistoryObject[["entity_id"]] <-
          self$`entity_id`
      }
      if (!is.null(self$`entity_name`)) {
        EntityHistoryObject[["entity_name"]] <-
          self$`entity_name`
      }
      if (!is.null(self$`ldap`)) {
        EntityHistoryObject[["ldap"]] <-
          self$`ldap`
      }
      if (!is.null(self$`operation`)) {
        EntityHistoryObject[["operation"]] <-
          self$extractSimpleType(self$`operation`)
      }
      if (!is.null(self$`user_id`)) {
        EntityHistoryObject[["user_id"]] <-
          self$`user_id`
      }
      return(EntityHistoryObject)
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
    #' Deserialize JSON string into an instance of EntityHistory
    #'
    #' @param input_json the JSON input
    #' @return the instance of EntityHistory
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`change_timestamp`)) {
        self$`change_timestamp` <- this_object$`change_timestamp`
      }
      if (!is.null(this_object$`data_changes`)) {
        self$`data_changes` <- ApiClient$new()$deserializeObj(this_object$`data_changes`, "array[EntityDataChangeHistory]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`entity_id`)) {
        self$`entity_id` <- this_object$`entity_id`
      }
      if (!is.null(this_object$`entity_name`)) {
        self$`entity_name` <- this_object$`entity_name`
      }
      if (!is.null(this_object$`ldap`)) {
        self$`ldap` <- this_object$`ldap`
      }
      if (!is.null(this_object$`operation`)) {
        `operation_object` <- ChangeHistoryOperationType$new()
        `operation_object`$fromJSON(jsonlite::toJSON(this_object$`operation`, auto_unbox = TRUE, digits = NA))
        self$`operation` <- `operation_object`
      }
      if (!is.null(this_object$`user_id`)) {
        self$`user_id` <- this_object$`user_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EntityHistory in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EntityHistory
    #'
    #' @param input_json the JSON input
    #' @return the instance of EntityHistory
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`change_timestamp` <- this_object$`change_timestamp`
      self$`data_changes` <- ApiClient$new()$deserializeObj(this_object$`data_changes`, "array[EntityDataChangeHistory]", loadNamespace("openapi"))
      self$`entity_id` <- this_object$`entity_id`
      self$`entity_name` <- this_object$`entity_name`
      self$`ldap` <- this_object$`ldap`
      self$`operation` <- ChangeHistoryOperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation`, auto_unbox = TRUE, digits = NA))
      self$`user_id` <- this_object$`user_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to EntityHistory and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EntityHistory
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`entity_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`user_id`, "^\\d+$")) {
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
      if (!str_detect(self$`entity_id`, "^\\d+$")) {
        invalid_fields["entity_id"] <- "Invalid value for `entity_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`user_id`, "^\\d+$")) {
        invalid_fields["user_id"] <- "Invalid value for `user_id`, must conform to the pattern ^\\d+$."
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
# EntityHistory$unlock()
#
## Below is an example to define the print function
# EntityHistory$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EntityHistory$lock()

