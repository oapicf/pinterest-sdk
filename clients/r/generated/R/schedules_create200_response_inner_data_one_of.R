#' Create a new SchedulesCreate200ResponseInnerDataOneOf
#'
#' @description
#' SchedulesCreate200ResponseInnerDataOneOf Class
#'
#' @docType class
#' @title SchedulesCreate200ResponseInnerDataOneOf
#' @description SchedulesCreate200ResponseInnerDataOneOf Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field schedule_id Schedule ID. character
#' @field exceptions  \link{PinterestLibError}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SchedulesCreate200ResponseInnerDataOneOf <- R6::R6Class(
  "SchedulesCreate200ResponseInnerDataOneOf",
  public = list(
    `id` = NULL,
    `schedule_id` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new SchedulesCreate200ResponseInnerDataOneOf class.
    #'
    #' @param id id
    #' @param schedule_id Schedule ID.
    #' @param exceptions exceptions
    #' @param ... Other optional arguments.
    initialize = function(`id`, `schedule_id`, `exceptions`, ...) {
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
      if (!missing(`exceptions`)) {
        stopifnot(R6::is.R6(`exceptions`))
        self$`exceptions` <- `exceptions`
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
    #' @return SchedulesCreate200ResponseInnerDataOneOf as a base R list.
    #' @examples
    #' # convert array of SchedulesCreate200ResponseInnerDataOneOf (x) to a data frame
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
    #' Convert SchedulesCreate200ResponseInnerDataOneOf to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SchedulesCreate200ResponseInnerDataOneOfObject <- list()
      if (!is.null(self$`id`)) {
        SchedulesCreate200ResponseInnerDataOneOfObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`schedule_id`)) {
        SchedulesCreate200ResponseInnerDataOneOfObject[["schedule_id"]] <-
          self$`schedule_id`
      }
      if (!is.null(self$`exceptions`)) {
        SchedulesCreate200ResponseInnerDataOneOfObject[["exceptions"]] <-
          self$extractSimpleType(self$`exceptions`)
      }
      return(SchedulesCreate200ResponseInnerDataOneOfObject)
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
    #' Deserialize JSON string into an instance of SchedulesCreate200ResponseInnerDataOneOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of SchedulesCreate200ResponseInnerDataOneOf
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`schedule_id`)) {
        self$`schedule_id` <- this_object$`schedule_id`
      }
      if (!is.null(this_object$`exceptions`)) {
        `exceptions_object` <- PinterestLibError$new()
        `exceptions_object`$fromJSON(jsonlite::toJSON(this_object$`exceptions`, auto_unbox = TRUE, digits = NA))
        self$`exceptions` <- `exceptions_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SchedulesCreate200ResponseInnerDataOneOf in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SchedulesCreate200ResponseInnerDataOneOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of SchedulesCreate200ResponseInnerDataOneOf
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`schedule_id` <- this_object$`schedule_id`
      self$`exceptions` <- PinterestLibError$new()$fromJSON(jsonlite::toJSON(this_object$`exceptions`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to SchedulesCreate200ResponseInnerDataOneOf and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for SchedulesCreate200ResponseInnerDataOneOf: the required field `id` is missing."))
      }
      # check the required field `schedule_id`
      if (!is.null(input_json$`schedule_id`)) {
        if (!(is.character(input_json$`schedule_id`) && length(input_json$`schedule_id`) == 1)) {
          stop(paste("Error! Invalid data for `schedule_id`. Must be a string:", input_json$`schedule_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SchedulesCreate200ResponseInnerDataOneOf: the required field `schedule_id` is missing."))
      }
      # check the required field `exceptions`
      if (!is.null(input_json$`exceptions`)) {
        stopifnot(R6::is.R6(input_json$`exceptions`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SchedulesCreate200ResponseInnerDataOneOf: the required field `exceptions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SchedulesCreate200ResponseInnerDataOneOf
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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

      # check if the required `exceptions` is null
      if (is.null(self$`exceptions`)) {
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

      # check if the required `exceptions` is null
      if (is.null(self$`exceptions`)) {
        invalid_fields["exceptions"] <- "Non-nullable required field `exceptions` cannot be null."
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
# SchedulesCreate200ResponseInnerDataOneOf$unlock()
#
## Below is an example to define the print function
# SchedulesCreate200ResponseInnerDataOneOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SchedulesCreate200ResponseInnerDataOneOf$lock()

