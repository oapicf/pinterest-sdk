#' Create a new EntityDataChangeHistory
#'
#' @description
#' EntityDataChangeHistory Class
#'
#' @docType class
#' @title EntityDataChangeHistory
#' @description EntityDataChangeHistory Class
#' @format An \code{R6Class} generator object
#' @field changed_field_id A string identifier representing the changed field on the entity character [optional]
#' @field changed_field_name The human readable name of the changed field on the entity character [optional]
#' @field data_type Specifies the type of the field's data values \link{ChangeHistoryDataType} [optional]
#' @field new_data_value A string representation of the value of the changed field, after the change character [optional]
#' @field old_data_value A string representation of the value of the changed field, before the change character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EntityDataChangeHistory <- R6::R6Class(
  "EntityDataChangeHistory",
  public = list(
    `changed_field_id` = NULL,
    `changed_field_name` = NULL,
    `data_type` = NULL,
    `new_data_value` = NULL,
    `old_data_value` = NULL,

    #' @description
    #' Initialize a new EntityDataChangeHistory class.
    #'
    #' @param changed_field_id A string identifier representing the changed field on the entity
    #' @param changed_field_name The human readable name of the changed field on the entity
    #' @param data_type Specifies the type of the field's data values
    #' @param new_data_value A string representation of the value of the changed field, after the change
    #' @param old_data_value A string representation of the value of the changed field, before the change
    #' @param ... Other optional arguments.
    initialize = function(`changed_field_id` = NULL, `changed_field_name` = NULL, `data_type` = NULL, `new_data_value` = NULL, `old_data_value` = NULL, ...) {
      if (!is.null(`changed_field_id`)) {
        if (!(is.character(`changed_field_id`) && length(`changed_field_id`) == 1)) {
          stop(paste("Error! Invalid data for `changed_field_id`. Must be a string:", `changed_field_id`))
        }
        self$`changed_field_id` <- `changed_field_id`
      }
      if (!is.null(`changed_field_name`)) {
        if (!(is.character(`changed_field_name`) && length(`changed_field_name`) == 1)) {
          stop(paste("Error! Invalid data for `changed_field_name`. Must be a string:", `changed_field_name`))
        }
        self$`changed_field_name` <- `changed_field_name`
      }
      if (!is.null(`data_type`)) {
        if (!(`data_type` %in% c())) {
          stop(paste("Error! \"", `data_type`, "\" cannot be assigned to `data_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`data_type`))
        self$`data_type` <- `data_type`
      }
      if (!is.null(`new_data_value`)) {
        if (!(is.character(`new_data_value`) && length(`new_data_value`) == 1)) {
          stop(paste("Error! Invalid data for `new_data_value`. Must be a string:", `new_data_value`))
        }
        self$`new_data_value` <- `new_data_value`
      }
      if (!is.null(`old_data_value`)) {
        if (!(is.character(`old_data_value`) && length(`old_data_value`) == 1)) {
          stop(paste("Error! Invalid data for `old_data_value`. Must be a string:", `old_data_value`))
        }
        self$`old_data_value` <- `old_data_value`
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
    #' @return EntityDataChangeHistory as a base R list.
    #' @examples
    #' # convert array of EntityDataChangeHistory (x) to a data frame
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
    #' Convert EntityDataChangeHistory to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EntityDataChangeHistoryObject <- list()
      if (!is.null(self$`changed_field_id`)) {
        EntityDataChangeHistoryObject[["changed_field_id"]] <-
          self$`changed_field_id`
      }
      if (!is.null(self$`changed_field_name`)) {
        EntityDataChangeHistoryObject[["changed_field_name"]] <-
          self$`changed_field_name`
      }
      if (!is.null(self$`data_type`)) {
        EntityDataChangeHistoryObject[["data_type"]] <-
          self$extractSimpleType(self$`data_type`)
      }
      if (!is.null(self$`new_data_value`)) {
        EntityDataChangeHistoryObject[["new_data_value"]] <-
          self$`new_data_value`
      }
      if (!is.null(self$`old_data_value`)) {
        EntityDataChangeHistoryObject[["old_data_value"]] <-
          self$`old_data_value`
      }
      return(EntityDataChangeHistoryObject)
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
    #' Deserialize JSON string into an instance of EntityDataChangeHistory
    #'
    #' @param input_json the JSON input
    #' @return the instance of EntityDataChangeHistory
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`changed_field_id`)) {
        self$`changed_field_id` <- this_object$`changed_field_id`
      }
      if (!is.null(this_object$`changed_field_name`)) {
        self$`changed_field_name` <- this_object$`changed_field_name`
      }
      if (!is.null(this_object$`data_type`)) {
        `data_type_object` <- ChangeHistoryDataType$new()
        `data_type_object`$fromJSON(jsonlite::toJSON(this_object$`data_type`, auto_unbox = TRUE, digits = NA))
        self$`data_type` <- `data_type_object`
      }
      if (!is.null(this_object$`new_data_value`)) {
        self$`new_data_value` <- this_object$`new_data_value`
      }
      if (!is.null(this_object$`old_data_value`)) {
        self$`old_data_value` <- this_object$`old_data_value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EntityDataChangeHistory in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EntityDataChangeHistory
    #'
    #' @param input_json the JSON input
    #' @return the instance of EntityDataChangeHistory
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`changed_field_id` <- this_object$`changed_field_id`
      self$`changed_field_name` <- this_object$`changed_field_name`
      self$`data_type` <- ChangeHistoryDataType$new()$fromJSON(jsonlite::toJSON(this_object$`data_type`, auto_unbox = TRUE, digits = NA))
      self$`new_data_value` <- this_object$`new_data_value`
      self$`old_data_value` <- this_object$`old_data_value`
      self
    },

    #' @description
    #' Validate JSON input with respect to EntityDataChangeHistory and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EntityDataChangeHistory
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
# EntityDataChangeHistory$unlock()
#
## Below is an example to define the print function
# EntityDataChangeHistory$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EntityDataChangeHistory$lock()

