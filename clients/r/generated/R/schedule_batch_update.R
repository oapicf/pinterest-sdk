#' Create a new ScheduleBatchUpdate
#'
#' @description
#' ScheduleBatchUpdate Class
#'
#' @docType class
#' @title ScheduleBatchUpdate
#' @description ScheduleBatchUpdate Class
#' @format An \code{R6Class} generator object
#' @field delta_value  \link{ScheduleDeltaValue} [optional]
#' @field end_timestamp Schedule end time. Unix timestamp in seconds. integer [optional]
#' @field entity_id entity ID. character [optional]
#' @field entity_type Specify the entity_type to get summary information \link{AdAccountEntityType} [optional]
#' @field id  character
#' @field name Schedule name. character [optional]
#' @field schedule_action The schedule action. \link{ScheduleAction} [optional]
#' @field schedule_id Schedule ID. character
#' @field schedule_status Schedule status. \link{ScheduleStatus} [optional]
#' @field schedule_type The schedule type. \link{ScheduleType} [optional]
#' @field start_timestamp Schedule start time. Unix timestamp in seconds. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ScheduleBatchUpdate <- R6::R6Class(
  "ScheduleBatchUpdate",
  public = list(
    `delta_value` = NULL,
    `end_timestamp` = NULL,
    `entity_id` = NULL,
    `entity_type` = NULL,
    `id` = NULL,
    `name` = NULL,
    `schedule_action` = NULL,
    `schedule_id` = NULL,
    `schedule_status` = NULL,
    `schedule_type` = NULL,
    `start_timestamp` = NULL,

    #' @description
    #' Initialize a new ScheduleBatchUpdate class.
    #'
    #' @param id id
    #' @param schedule_id Schedule ID.
    #' @param delta_value delta_value
    #' @param end_timestamp Schedule end time. Unix timestamp in seconds.
    #' @param entity_id entity ID.
    #' @param entity_type Specify the entity_type to get summary information
    #' @param name Schedule name.
    #' @param schedule_action The schedule action.
    #' @param schedule_status Schedule status.
    #' @param schedule_type The schedule type.
    #' @param start_timestamp Schedule start time. Unix timestamp in seconds.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `schedule_id`, `delta_value` = NULL, `end_timestamp` = NULL, `entity_id` = NULL, `entity_type` = NULL, `name` = NULL, `schedule_action` = NULL, `schedule_status` = NULL, `schedule_type` = NULL, `start_timestamp` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`schedule_id`)) {
        if (!(is.character(`schedule_id`) && length(`schedule_id`) == 1)) {
          stop(paste("Error! Invalid data for `schedule_id`. Must be a string:", `schedule_id`))
        }
        self$`schedule_id` <- `schedule_id`
      }
      if (!is.null(`delta_value`)) {
        stopifnot(R6::is.R6(`delta_value`))
        self$`delta_value` <- `delta_value`
      }
      if (!is.null(`end_timestamp`)) {
        if (!(is.numeric(`end_timestamp`) && length(`end_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `end_timestamp`. Must be an integer:", `end_timestamp`))
        }
        self$`end_timestamp` <- `end_timestamp`
      }
      if (!is.null(`entity_id`)) {
        if (!(is.character(`entity_id`) && length(`entity_id`) == 1)) {
          stop(paste("Error! Invalid data for `entity_id`. Must be a string:", `entity_id`))
        }
        self$`entity_id` <- `entity_id`
      }
      if (!is.null(`entity_type`)) {
        if (!(`entity_type` %in% c())) {
          stop(paste("Error! \"", `entity_type`, "\" cannot be assigned to `entity_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`entity_type`))
        self$`entity_type` <- `entity_type`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`schedule_action`)) {
        if (!(`schedule_action` %in% c())) {
          stop(paste("Error! \"", `schedule_action`, "\" cannot be assigned to `schedule_action`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`schedule_action`))
        self$`schedule_action` <- `schedule_action`
      }
      if (!is.null(`schedule_status`)) {
        if (!(`schedule_status` %in% c())) {
          stop(paste("Error! \"", `schedule_status`, "\" cannot be assigned to `schedule_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`schedule_status`))
        self$`schedule_status` <- `schedule_status`
      }
      if (!is.null(`schedule_type`)) {
        if (!(`schedule_type` %in% c())) {
          stop(paste("Error! \"", `schedule_type`, "\" cannot be assigned to `schedule_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`schedule_type`))
        self$`schedule_type` <- `schedule_type`
      }
      if (!is.null(`start_timestamp`)) {
        if (!(is.numeric(`start_timestamp`) && length(`start_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `start_timestamp`. Must be an integer:", `start_timestamp`))
        }
        self$`start_timestamp` <- `start_timestamp`
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
    #' @return ScheduleBatchUpdate as a base R list.
    #' @examples
    #' # convert array of ScheduleBatchUpdate (x) to a data frame
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
    #' Convert ScheduleBatchUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ScheduleBatchUpdateObject <- list()
      if (!is.null(self$`delta_value`)) {
        ScheduleBatchUpdateObject[["delta_value"]] <-
          self$extractSimpleType(self$`delta_value`)
      }
      if (!is.null(self$`end_timestamp`)) {
        ScheduleBatchUpdateObject[["end_timestamp"]] <-
          self$`end_timestamp`
      }
      if (!is.null(self$`entity_id`)) {
        ScheduleBatchUpdateObject[["entity_id"]] <-
          self$`entity_id`
      }
      if (!is.null(self$`entity_type`)) {
        ScheduleBatchUpdateObject[["entity_type"]] <-
          self$extractSimpleType(self$`entity_type`)
      }
      if (!is.null(self$`id`)) {
        ScheduleBatchUpdateObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        ScheduleBatchUpdateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`schedule_action`)) {
        ScheduleBatchUpdateObject[["schedule_action"]] <-
          self$extractSimpleType(self$`schedule_action`)
      }
      if (!is.null(self$`schedule_id`)) {
        ScheduleBatchUpdateObject[["schedule_id"]] <-
          self$`schedule_id`
      }
      if (!is.null(self$`schedule_status`)) {
        ScheduleBatchUpdateObject[["schedule_status"]] <-
          self$extractSimpleType(self$`schedule_status`)
      }
      if (!is.null(self$`schedule_type`)) {
        ScheduleBatchUpdateObject[["schedule_type"]] <-
          self$extractSimpleType(self$`schedule_type`)
      }
      if (!is.null(self$`start_timestamp`)) {
        ScheduleBatchUpdateObject[["start_timestamp"]] <-
          self$`start_timestamp`
      }
      return(ScheduleBatchUpdateObject)
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
    #' Deserialize JSON string into an instance of ScheduleBatchUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleBatchUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`delta_value`)) {
        `delta_value_object` <- ScheduleDeltaValue$new()
        `delta_value_object`$fromJSON(jsonlite::toJSON(this_object$`delta_value`, auto_unbox = TRUE, digits = NA))
        self$`delta_value` <- `delta_value_object`
      }
      if (!is.null(this_object$`end_timestamp`)) {
        self$`end_timestamp` <- this_object$`end_timestamp`
      }
      if (!is.null(this_object$`entity_id`)) {
        self$`entity_id` <- this_object$`entity_id`
      }
      if (!is.null(this_object$`entity_type`)) {
        `entity_type_object` <- AdAccountEntityType$new()
        `entity_type_object`$fromJSON(jsonlite::toJSON(this_object$`entity_type`, auto_unbox = TRUE, digits = NA))
        self$`entity_type` <- `entity_type_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`schedule_action`)) {
        `schedule_action_object` <- ScheduleAction$new()
        `schedule_action_object`$fromJSON(jsonlite::toJSON(this_object$`schedule_action`, auto_unbox = TRUE, digits = NA))
        self$`schedule_action` <- `schedule_action_object`
      }
      if (!is.null(this_object$`schedule_id`)) {
        self$`schedule_id` <- this_object$`schedule_id`
      }
      if (!is.null(this_object$`schedule_status`)) {
        `schedule_status_object` <- ScheduleStatus$new()
        `schedule_status_object`$fromJSON(jsonlite::toJSON(this_object$`schedule_status`, auto_unbox = TRUE, digits = NA))
        self$`schedule_status` <- `schedule_status_object`
      }
      if (!is.null(this_object$`schedule_type`)) {
        `schedule_type_object` <- ScheduleType$new()
        `schedule_type_object`$fromJSON(jsonlite::toJSON(this_object$`schedule_type`, auto_unbox = TRUE, digits = NA))
        self$`schedule_type` <- `schedule_type_object`
      }
      if (!is.null(this_object$`start_timestamp`)) {
        self$`start_timestamp` <- this_object$`start_timestamp`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ScheduleBatchUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ScheduleBatchUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleBatchUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`delta_value` <- ScheduleDeltaValue$new()$fromJSON(jsonlite::toJSON(this_object$`delta_value`, auto_unbox = TRUE, digits = NA))
      self$`end_timestamp` <- this_object$`end_timestamp`
      self$`entity_id` <- this_object$`entity_id`
      self$`entity_type` <- AdAccountEntityType$new()$fromJSON(jsonlite::toJSON(this_object$`entity_type`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`schedule_action` <- ScheduleAction$new()$fromJSON(jsonlite::toJSON(this_object$`schedule_action`, auto_unbox = TRUE, digits = NA))
      self$`schedule_id` <- this_object$`schedule_id`
      self$`schedule_status` <- ScheduleStatus$new()$fromJSON(jsonlite::toJSON(this_object$`schedule_status`, auto_unbox = TRUE, digits = NA))
      self$`schedule_type` <- ScheduleType$new()$fromJSON(jsonlite::toJSON(this_object$`schedule_type`, auto_unbox = TRUE, digits = NA))
      self$`start_timestamp` <- this_object$`start_timestamp`
      self
    },

    #' @description
    #' Validate JSON input with respect to ScheduleBatchUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleBatchUpdate: the required field `id` is missing."))
      }
      # check the required field `schedule_id`
      if (!is.null(input_json$`schedule_id`)) {
        if (!(is.character(input_json$`schedule_id`) && length(input_json$`schedule_id`) == 1)) {
          stop(paste("Error! Invalid data for `schedule_id`. Must be a string:", input_json$`schedule_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleBatchUpdate: the required field `schedule_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ScheduleBatchUpdate
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

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (nchar(self$`id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `schedule_id` is null
      if (is.null(self$`schedule_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`schedule_id`, "^\\d+$")) {
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

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (nchar(self$`id`) > 18) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `schedule_id` is null
      if (is.null(self$`schedule_id`)) {
        invalid_fields["schedule_id"] <- "Non-nullable required field `schedule_id` cannot be null."
      }

      if (!str_detect(self$`schedule_id`, "^\\d+$")) {
        invalid_fields["schedule_id"] <- "Invalid value for `schedule_id`, must conform to the pattern ^\\d+$."
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
# ScheduleBatchUpdate$unlock()
#
## Below is an example to define the print function
# ScheduleBatchUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ScheduleBatchUpdate$lock()

