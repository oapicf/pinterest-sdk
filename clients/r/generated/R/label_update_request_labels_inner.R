#' Create a new LabelUpdateRequestLabelsInner
#'
#' @description
#' LabelUpdateRequestLabelsInner Class
#'
#' @docType class
#' @title LabelUpdateRequestLabelsInner
#' @description LabelUpdateRequestLabelsInner Class
#' @format An \code{R6Class} generator object
#' @field id Label ID. character
#' @field status  \link{LabelStatus} [optional]
#' @field value Label name. 100-character limit. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabelUpdateRequestLabelsInner <- R6::R6Class(
  "LabelUpdateRequestLabelsInner",
  public = list(
    `id` = NULL,
    `status` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new LabelUpdateRequestLabelsInner class.
    #'
    #' @param id Label ID.
    #' @param status status
    #' @param value Label name. 100-character limit.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `status` = NULL, `value` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
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
    #' @return LabelUpdateRequestLabelsInner as a base R list.
    #' @examples
    #' # convert array of LabelUpdateRequestLabelsInner (x) to a data frame
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
    #' Convert LabelUpdateRequestLabelsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabelUpdateRequestLabelsInnerObject <- list()
      if (!is.null(self$`id`)) {
        LabelUpdateRequestLabelsInnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`status`)) {
        LabelUpdateRequestLabelsInnerObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`value`)) {
        LabelUpdateRequestLabelsInnerObject[["value"]] <-
          self$`value`
      }
      return(LabelUpdateRequestLabelsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelUpdateRequestLabelsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelUpdateRequestLabelsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- LabelStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LabelUpdateRequestLabelsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelUpdateRequestLabelsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelUpdateRequestLabelsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`status` <- LabelStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to LabelUpdateRequestLabelsInner and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for LabelUpdateRequestLabelsInner: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabelUpdateRequestLabelsInner
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

      if (nchar(self$`value`) > 100) {
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

      if (nchar(self$`value`) > 100) {
        invalid_fields["value"] <- "Invalid length for `value`, must be smaller than or equal to 100."
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
# LabelUpdateRequestLabelsInner$unlock()
#
## Below is an example to define the print function
# LabelUpdateRequestLabelsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabelUpdateRequestLabelsInner$lock()

