#' Create a new LabelCreateRequestLabelsInner
#'
#' @description
#' LabelCreateRequestLabelsInner Class
#'
#' @docType class
#' @title LabelCreateRequestLabelsInner
#' @description LabelCreateRequestLabelsInner Class
#' @format An \code{R6Class} generator object
#' @field label_type  \link{LabelType}
#' @field value Label name. 100-character limit. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabelCreateRequestLabelsInner <- R6::R6Class(
  "LabelCreateRequestLabelsInner",
  public = list(
    `label_type` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new LabelCreateRequestLabelsInner class.
    #'
    #' @param label_type label_type
    #' @param value Label name. 100-character limit.
    #' @param ... Other optional arguments.
    initialize = function(`label_type`, `value`, ...) {
      if (!missing(`label_type`)) {
        if (!(`label_type` %in% c())) {
          stop(paste("Error! \"", `label_type`, "\" cannot be assigned to `label_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`label_type`))
        self$`label_type` <- `label_type`
      }
      if (!missing(`value`)) {
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
    #' @return LabelCreateRequestLabelsInner as a base R list.
    #' @examples
    #' # convert array of LabelCreateRequestLabelsInner (x) to a data frame
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
    #' Convert LabelCreateRequestLabelsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabelCreateRequestLabelsInnerObject <- list()
      if (!is.null(self$`label_type`)) {
        LabelCreateRequestLabelsInnerObject[["label_type"]] <-
          self$`label_type`$toSimpleType()
      }
      if (!is.null(self$`value`)) {
        LabelCreateRequestLabelsInnerObject[["value"]] <-
          self$`value`
      }
      return(LabelCreateRequestLabelsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelCreateRequestLabelsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelCreateRequestLabelsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`label_type`)) {
        `label_type_object` <- LabelType$new()
        `label_type_object`$fromJSON(jsonlite::toJSON(this_object$`label_type`, auto_unbox = TRUE, digits = NA))
        self$`label_type` <- `label_type_object`
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
    #' @return LabelCreateRequestLabelsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelCreateRequestLabelsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelCreateRequestLabelsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`label_type` <- LabelType$new()$fromJSON(jsonlite::toJSON(this_object$`label_type`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to LabelCreateRequestLabelsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `label_type`
      if (!is.null(input_json$`label_type`)) {
        stopifnot(R6::is.R6(input_json$`label_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelCreateRequestLabelsInner: the required field `label_type` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelCreateRequestLabelsInner: the required field `value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabelCreateRequestLabelsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `value` is null
      if (is.null(self$`value`)) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# LabelCreateRequestLabelsInner$unlock()
#
## Below is an example to define the print function
# LabelCreateRequestLabelsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabelCreateRequestLabelsInner$lock()

