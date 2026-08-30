#' Create a new ScheduleCreateRequest
#'
#' @description
#' ScheduleCreateRequest Class
#'
#' @docType class
#' @title ScheduleCreateRequest
#' @description ScheduleCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field entity_id  character
#' @field entity_type Entity type character
#' @field delta_value  \link{ScheduleCommonDeltaValue}
#' @field end_timestamp Schedule end time. Unix timestamp in seconds. integer
#' @field name  character
#' @field schedule_action  \link{ScheduleAction}
#' @field schedule_status  \link{ScheduleStatus}
#' @field schedule_type  \link{ScheduleType}
#' @field start_timestamp Schedule start time. Unix timestamp in seconds. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ScheduleCreateRequest <- R6::R6Class(
  "ScheduleCreateRequest",
  public = list(
    `entity_id` = NULL,
    `entity_type` = NULL,
    `delta_value` = NULL,
    `end_timestamp` = NULL,
    `name` = NULL,
    `schedule_action` = NULL,
    `schedule_status` = NULL,
    `schedule_type` = NULL,
    `start_timestamp` = NULL,

    #' @description
    #' Initialize a new ScheduleCreateRequest class.
    #'
    #' @param entity_id entity_id
    #' @param entity_type Entity type
    #' @param delta_value delta_value
    #' @param end_timestamp Schedule end time. Unix timestamp in seconds.
    #' @param name name
    #' @param schedule_action schedule_action
    #' @param schedule_status schedule_status
    #' @param schedule_type schedule_type
    #' @param start_timestamp Schedule start time. Unix timestamp in seconds.
    #' @param ... Other optional arguments.
    initialize = function(`entity_id`, `entity_type`, `delta_value`, `end_timestamp`, `name`, `schedule_action`, `schedule_status`, `schedule_type`, `start_timestamp`, ...) {
      if (!missing(`entity_id`)) {
        if (!(is.character(`entity_id`) && length(`entity_id`) == 1)) {
          stop(paste("Error! Invalid data for `entity_id`. Must be a string:", `entity_id`))
        }
        self$`entity_id` <- `entity_id`
      }
      if (!missing(`entity_type`)) {
        if (!(is.character(`entity_type`) && length(`entity_type`) == 1)) {
          stop(paste("Error! Invalid data for `entity_type`. Must be a string:", `entity_type`))
        }
        self$`entity_type` <- `entity_type`
      }
      if (!missing(`delta_value`)) {
        stopifnot(R6::is.R6(`delta_value`))
        self$`delta_value` <- `delta_value`
      }
      if (!missing(`end_timestamp`)) {
        if (!(is.numeric(`end_timestamp`) && length(`end_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `end_timestamp`. Must be an integer:", `end_timestamp`))
        }
        self$`end_timestamp` <- `end_timestamp`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`schedule_action`)) {
        if (!(`schedule_action` %in% c())) {
          stop(paste("Error! \"", `schedule_action`, "\" cannot be assigned to `schedule_action`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`schedule_action`))
        self$`schedule_action` <- `schedule_action`
      }
      if (!missing(`schedule_status`)) {
        if (!(`schedule_status` %in% c())) {
          stop(paste("Error! \"", `schedule_status`, "\" cannot be assigned to `schedule_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`schedule_status`))
        self$`schedule_status` <- `schedule_status`
      }
      if (!missing(`schedule_type`)) {
        if (!(`schedule_type` %in% c())) {
          stop(paste("Error! \"", `schedule_type`, "\" cannot be assigned to `schedule_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`schedule_type`))
        self$`schedule_type` <- `schedule_type`
      }
      if (!missing(`start_timestamp`)) {
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
    #' @return ScheduleCreateRequest as a base R list.
    #' @examples
    #' # convert array of ScheduleCreateRequest (x) to a data frame
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
    #' Convert ScheduleCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ScheduleCreateRequestObject <- list()
      if (!is.null(self$`entity_id`)) {
        ScheduleCreateRequestObject[["entity_id"]] <-
          self$`entity_id`
      }
      if (!is.null(self$`entity_type`)) {
        ScheduleCreateRequestObject[["entity_type"]] <-
          self$`entity_type`
      }
      if (!is.null(self$`delta_value`)) {
        ScheduleCreateRequestObject[["delta_value"]] <-
          self$extractSimpleType(self$`delta_value`)
      }
      if (!is.null(self$`end_timestamp`)) {
        ScheduleCreateRequestObject[["end_timestamp"]] <-
          self$`end_timestamp`
      }
      if (!is.null(self$`name`)) {
        ScheduleCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`schedule_action`)) {
        ScheduleCreateRequestObject[["schedule_action"]] <-
          self$extractSimpleType(self$`schedule_action`)
      }
      if (!is.null(self$`schedule_status`)) {
        ScheduleCreateRequestObject[["schedule_status"]] <-
          self$extractSimpleType(self$`schedule_status`)
      }
      if (!is.null(self$`schedule_type`)) {
        ScheduleCreateRequestObject[["schedule_type"]] <-
          self$extractSimpleType(self$`schedule_type`)
      }
      if (!is.null(self$`start_timestamp`)) {
        ScheduleCreateRequestObject[["start_timestamp"]] <-
          self$`start_timestamp`
      }
      return(ScheduleCreateRequestObject)
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
    #' Deserialize JSON string into an instance of ScheduleCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entity_id`)) {
        self$`entity_id` <- this_object$`entity_id`
      }
      if (!is.null(this_object$`entity_type`)) {
        self$`entity_type` <- this_object$`entity_type`
      }
      if (!is.null(this_object$`delta_value`)) {
        `delta_value_object` <- ScheduleCommonDeltaValue$new()
        `delta_value_object`$fromJSON(jsonlite::toJSON(this_object$`delta_value`, auto_unbox = TRUE, digits = NA))
        self$`delta_value` <- `delta_value_object`
      }
      if (!is.null(this_object$`end_timestamp`)) {
        self$`end_timestamp` <- this_object$`end_timestamp`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`schedule_action`)) {
        `schedule_action_object` <- ScheduleAction$new()
        `schedule_action_object`$fromJSON(jsonlite::toJSON(this_object$`schedule_action`, auto_unbox = TRUE, digits = NA))
        self$`schedule_action` <- `schedule_action_object`
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
    #' @return ScheduleCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ScheduleCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entity_id` <- this_object$`entity_id`
      self$`entity_type` <- this_object$`entity_type`
      self$`delta_value` <- ScheduleCommonDeltaValue$new()$fromJSON(jsonlite::toJSON(this_object$`delta_value`, auto_unbox = TRUE, digits = NA))
      self$`end_timestamp` <- this_object$`end_timestamp`
      self$`name` <- this_object$`name`
      self$`schedule_action` <- ScheduleAction$new()$fromJSON(jsonlite::toJSON(this_object$`schedule_action`, auto_unbox = TRUE, digits = NA))
      self$`schedule_status` <- ScheduleStatus$new()$fromJSON(jsonlite::toJSON(this_object$`schedule_status`, auto_unbox = TRUE, digits = NA))
      self$`schedule_type` <- ScheduleType$new()$fromJSON(jsonlite::toJSON(this_object$`schedule_type`, auto_unbox = TRUE, digits = NA))
      self$`start_timestamp` <- this_object$`start_timestamp`
      self
    },

    #' @description
    #' Validate JSON input with respect to ScheduleCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `entity_id`
      if (!is.null(input_json$`entity_id`)) {
        if (!(is.character(input_json$`entity_id`) && length(input_json$`entity_id`) == 1)) {
          stop(paste("Error! Invalid data for `entity_id`. Must be a string:", input_json$`entity_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `entity_id` is missing."))
      }
      # check the required field `entity_type`
      if (!is.null(input_json$`entity_type`)) {
        if (!(is.character(input_json$`entity_type`) && length(input_json$`entity_type`) == 1)) {
          stop(paste("Error! Invalid data for `entity_type`. Must be a string:", input_json$`entity_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `entity_type` is missing."))
      }
      # check the required field `delta_value`
      if (!is.null(input_json$`delta_value`)) {
        stopifnot(R6::is.R6(input_json$`delta_value`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `delta_value` is missing."))
      }
      # check the required field `end_timestamp`
      if (!is.null(input_json$`end_timestamp`)) {
        if (!(is.numeric(input_json$`end_timestamp`) && length(input_json$`end_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `end_timestamp`. Must be an integer:", input_json$`end_timestamp`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `end_timestamp` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `name` is missing."))
      }
      # check the required field `schedule_action`
      if (!is.null(input_json$`schedule_action`)) {
        stopifnot(R6::is.R6(input_json$`schedule_action`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `schedule_action` is missing."))
      }
      # check the required field `schedule_status`
      if (!is.null(input_json$`schedule_status`)) {
        stopifnot(R6::is.R6(input_json$`schedule_status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `schedule_status` is missing."))
      }
      # check the required field `schedule_type`
      if (!is.null(input_json$`schedule_type`)) {
        stopifnot(R6::is.R6(input_json$`schedule_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `schedule_type` is missing."))
      }
      # check the required field `start_timestamp`
      if (!is.null(input_json$`start_timestamp`)) {
        if (!(is.numeric(input_json$`start_timestamp`) && length(input_json$`start_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `start_timestamp`. Must be an integer:", input_json$`start_timestamp`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ScheduleCreateRequest: the required field `start_timestamp` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ScheduleCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `entity_id` is null
      if (is.null(self$`entity_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`entity_id`, "^[C]?\\d+$")) {
        return(FALSE)
      }

      # check if the required `entity_type` is null
      if (is.null(self$`entity_type`)) {
        return(FALSE)
      }

      # check if the required `delta_value` is null
      if (is.null(self$`delta_value`)) {
        return(FALSE)
      }

      # check if the required `end_timestamp` is null
      if (is.null(self$`end_timestamp`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `schedule_action` is null
      if (is.null(self$`schedule_action`)) {
        return(FALSE)
      }

      # check if the required `schedule_status` is null
      if (is.null(self$`schedule_status`)) {
        return(FALSE)
      }

      # check if the required `schedule_type` is null
      if (is.null(self$`schedule_type`)) {
        return(FALSE)
      }

      # check if the required `start_timestamp` is null
      if (is.null(self$`start_timestamp`)) {
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
      # check if the required `entity_id` is null
      if (is.null(self$`entity_id`)) {
        invalid_fields["entity_id"] <- "Non-nullable required field `entity_id` cannot be null."
      }

      if (!str_detect(self$`entity_id`, "^[C]?\\d+$")) {
        invalid_fields["entity_id"] <- "Invalid value for `entity_id`, must conform to the pattern ^[C]?\\d+$."
      }

      # check if the required `entity_type` is null
      if (is.null(self$`entity_type`)) {
        invalid_fields["entity_type"] <- "Non-nullable required field `entity_type` cannot be null."
      }

      # check if the required `delta_value` is null
      if (is.null(self$`delta_value`)) {
        invalid_fields["delta_value"] <- "Non-nullable required field `delta_value` cannot be null."
      }

      # check if the required `end_timestamp` is null
      if (is.null(self$`end_timestamp`)) {
        invalid_fields["end_timestamp"] <- "Non-nullable required field `end_timestamp` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `schedule_action` is null
      if (is.null(self$`schedule_action`)) {
        invalid_fields["schedule_action"] <- "Non-nullable required field `schedule_action` cannot be null."
      }

      # check if the required `schedule_status` is null
      if (is.null(self$`schedule_status`)) {
        invalid_fields["schedule_status"] <- "Non-nullable required field `schedule_status` cannot be null."
      }

      # check if the required `schedule_type` is null
      if (is.null(self$`schedule_type`)) {
        invalid_fields["schedule_type"] <- "Non-nullable required field `schedule_type` cannot be null."
      }

      # check if the required `start_timestamp` is null
      if (is.null(self$`start_timestamp`)) {
        invalid_fields["start_timestamp"] <- "Non-nullable required field `start_timestamp` cannot be null."
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
# ScheduleCreateRequest$unlock()
#
## Below is an example to define the print function
# ScheduleCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ScheduleCreateRequest$lock()

