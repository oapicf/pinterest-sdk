#' Create a new LabelErrorData
#'
#' @description
#' LabelErrorData Class
#'
#' @docType class
#' @title LabelErrorData
#' @description LabelErrorData Class
#' @format An \code{R6Class} generator object
#' @field id Label ID. character [optional]
#' @field label_type  \link{NullableLabelType} [optional]
#' @field status  \link{NullableLabelStatus} [optional]
#' @field value Label name. 100-character limit. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabelErrorData <- R6::R6Class(
  "LabelErrorData",
  public = list(
    `id` = NULL,
    `label_type` = NULL,
    `status` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new LabelErrorData class.
    #'
    #' @param id Label ID.
    #' @param label_type label_type
    #' @param status status
    #' @param value Label name. 100-character limit.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `label_type` = NULL, `status` = NULL, `value` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`label_type`)) {
        if (!(`label_type` %in% c())) {
          stop(paste("Error! \"", `label_type`, "\" cannot be assigned to `label_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`label_type`))
        self$`label_type` <- `label_type`
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
    #' @return LabelErrorData as a base R list.
    #' @examples
    #' # convert array of LabelErrorData (x) to a data frame
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
    #' Convert LabelErrorData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabelErrorDataObject <- list()
      if (!is.null(self$`id`)) {
        LabelErrorDataObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`label_type`)) {
        LabelErrorDataObject[["label_type"]] <-
          self$extractSimpleType(self$`label_type`)
      }
      if (!is.null(self$`status`)) {
        LabelErrorDataObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`value`)) {
        LabelErrorDataObject[["value"]] <-
          self$`value`
      }
      return(LabelErrorDataObject)
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
    #' Deserialize JSON string into an instance of LabelErrorData
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelErrorData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`label_type`)) {
        `label_type_object` <- NullableLabelType$new()
        `label_type_object`$fromJSON(jsonlite::toJSON(this_object$`label_type`, auto_unbox = TRUE, digits = NA))
        self$`label_type` <- `label_type_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- NullableLabelStatus$new()
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
    #' @return LabelErrorData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelErrorData
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelErrorData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`label_type` <- NullableLabelType$new()$fromJSON(jsonlite::toJSON(this_object$`label_type`, auto_unbox = TRUE, digits = NA))
      self$`status` <- NullableLabelStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to LabelErrorData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabelErrorData
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# LabelErrorData$unlock()
#
## Below is an example to define the print function
# LabelErrorData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabelErrorData$lock()

