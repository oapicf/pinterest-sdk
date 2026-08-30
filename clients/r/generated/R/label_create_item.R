#' Create a new LabelCreateItem
#'
#' @description
#' LabelCreateItem Class
#'
#' @docType class
#' @title LabelCreateItem
#' @description LabelCreateItem Class
#' @format An \code{R6Class} generator object
#' @field label_type  \link{LabelType}
#' @field value Label name. 100-character limit. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabelCreateItem <- R6::R6Class(
  "LabelCreateItem",
  public = list(
    `label_type` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new LabelCreateItem class.
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
    #' @return LabelCreateItem as a base R list.
    #' @examples
    #' # convert array of LabelCreateItem (x) to a data frame
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
    #' Convert LabelCreateItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabelCreateItemObject <- list()
      if (!is.null(self$`label_type`)) {
        LabelCreateItemObject[["label_type"]] <-
          self$extractSimpleType(self$`label_type`)
      }
      if (!is.null(self$`value`)) {
        LabelCreateItemObject[["value"]] <-
          self$`value`
      }
      return(LabelCreateItemObject)
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
    #' Deserialize JSON string into an instance of LabelCreateItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelCreateItem
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
    #' @return LabelCreateItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelCreateItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelCreateItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`label_type` <- LabelType$new()$fromJSON(jsonlite::toJSON(this_object$`label_type`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to LabelCreateItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `label_type`
      if (!is.null(input_json$`label_type`)) {
        stopifnot(R6::is.R6(input_json$`label_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelCreateItem: the required field `label_type` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelCreateItem: the required field `value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabelCreateItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `label_type` is null
      if (is.null(self$`label_type`)) {
        return(FALSE)
      }

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
      # check if the required `label_type` is null
      if (is.null(self$`label_type`)) {
        invalid_fields["label_type"] <- "Non-nullable required field `label_type` cannot be null."
      }

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
# LabelCreateItem$unlock()
#
## Below is an example to define the print function
# LabelCreateItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabelCreateItem$lock()

