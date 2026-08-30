#' Create a new ScheduleUpdateRequestAllOf1
#'
#' @description
#' ScheduleUpdateRequestAllOf1 Class
#'
#' @docType class
#' @title ScheduleUpdateRequestAllOf1
#' @description ScheduleUpdateRequestAllOf1 Class
#' @format An \code{R6Class} generator object
#' @field entity_id  character [optional]
#' @field entity_type Entity type character [optional]
#' @field id Schedule ID. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ScheduleUpdateRequestAllOf1 <- R6::R6Class(
  "ScheduleUpdateRequestAllOf1",
  public = list(
    `entity_id` = NULL,
    `entity_type` = NULL,
    `id` = NULL,

    #' @description
    #' Initialize a new ScheduleUpdateRequestAllOf1 class.
    #'
    #' @param id Schedule ID.
    #' @param entity_id entity_id
    #' @param entity_type Entity type
    #' @param ... Other optional arguments.
    initialize = function(`id`, `entity_id` = NULL, `entity_type` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`entity_id`)) {
        if (!(is.character(`entity_id`) && length(`entity_id`) == 1)) {
          stop(paste("Error! Invalid data for `entity_id`. Must be a string:", `entity_id`))
        }
        self$`entity_id` <- `entity_id`
      }
      if (!is.null(`entity_type`)) {
        if (!(is.character(`entity_type`) && length(`entity_type`) == 1)) {
          stop(paste("Error! Invalid data for `entity_type`. Must be a string:", `entity_type`))
        }
        self$`entity_type` <- `entity_type`
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
    #' @return ScheduleUpdateRequestAllOf1 as a base R list.
    #' @examples
    #' # convert array of ScheduleUpdateRequestAllOf1 (x) to a data frame
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
    #' Convert ScheduleUpdateRequestAllOf1 to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ScheduleUpdateRequestAllOf1Object <- list()
      if (!is.null(self$`entity_id`)) {
        ScheduleUpdateRequestAllOf1Object[["entity_id"]] <-
          self$`entity_id`
      }
      if (!is.null(self$`entity_type`)) {
        ScheduleUpdateRequestAllOf1Object[["entity_type"]] <-
          self$`entity_type`
      }
      if (!is.null(self$`id`)) {
        ScheduleUpdateRequestAllOf1Object[["id"]] <-
          self$`id`
      }
      return(ScheduleUpdateRequestAllOf1Object)
    },

    #' @description
    #' Deserialize JSON string into an instance of ScheduleUpdateRequestAllOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleUpdateRequestAllOf1
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entity_id`)) {
        self$`entity_id` <- this_object$`entity_id`
      }
      if (!is.null(this_object$`entity_type`)) {
        self$`entity_type` <- this_object$`entity_type`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ScheduleUpdateRequestAllOf1 in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ScheduleUpdateRequestAllOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleUpdateRequestAllOf1
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entity_id` <- this_object$`entity_id`
      self$`entity_type` <- this_object$`entity_type`
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to ScheduleUpdateRequestAllOf1 and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ScheduleUpdateRequestAllOf1: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ScheduleUpdateRequestAllOf1
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`entity_id`, "^[C]?\\d+$")) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
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
      if (!str_detect(self$`entity_id`, "^[C]?\\d+$")) {
        invalid_fields["entity_id"] <- "Invalid value for `entity_id`, must conform to the pattern ^[C]?\\d+$."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
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
# ScheduleUpdateRequestAllOf1$unlock()
#
## Below is an example to define the print function
# ScheduleUpdateRequestAllOf1$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ScheduleUpdateRequestAllOf1$lock()

