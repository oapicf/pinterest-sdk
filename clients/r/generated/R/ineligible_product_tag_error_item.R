#' Create a new IneligibleProductTagErrorItem
#'
#' @description
#' Error item for a product tag that failed eligibility check.
#'
#' @docType class
#' @title IneligibleProductTagErrorItem
#' @description IneligibleProductTagErrorItem Class
#' @format An \code{R6Class} generator object
#' @field error_message Reason why the pin is ineligible for tagging. \link{IneligibleProductTagReason}
#' @field pin_id Pin ID that failed eligibility check. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IneligibleProductTagErrorItem <- R6::R6Class(
  "IneligibleProductTagErrorItem",
  public = list(
    `error_message` = NULL,
    `pin_id` = NULL,

    #' @description
    #' Initialize a new IneligibleProductTagErrorItem class.
    #'
    #' @param error_message Reason why the pin is ineligible for tagging.
    #' @param pin_id Pin ID that failed eligibility check.
    #' @param ... Other optional arguments.
    initialize = function(`error_message`, `pin_id`, ...) {
      if (!missing(`error_message`)) {
        if (!(`error_message` %in% c())) {
          stop(paste("Error! \"", `error_message`, "\" cannot be assigned to `error_message`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`error_message`))
        self$`error_message` <- `error_message`
      }
      if (!missing(`pin_id`)) {
        if (!(is.character(`pin_id`) && length(`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", `pin_id`))
        }
        self$`pin_id` <- `pin_id`
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
    #' @return IneligibleProductTagErrorItem as a base R list.
    #' @examples
    #' # convert array of IneligibleProductTagErrorItem (x) to a data frame
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
    #' Convert IneligibleProductTagErrorItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      IneligibleProductTagErrorItemObject <- list()
      if (!is.null(self$`error_message`)) {
        IneligibleProductTagErrorItemObject[["error_message"]] <-
          self$extractSimpleType(self$`error_message`)
      }
      if (!is.null(self$`pin_id`)) {
        IneligibleProductTagErrorItemObject[["pin_id"]] <-
          self$`pin_id`
      }
      return(IneligibleProductTagErrorItemObject)
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
    #' Deserialize JSON string into an instance of IneligibleProductTagErrorItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of IneligibleProductTagErrorItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`error_message`)) {
        `error_message_object` <- IneligibleProductTagReason$new()
        `error_message_object`$fromJSON(jsonlite::toJSON(this_object$`error_message`, auto_unbox = TRUE, digits = NA))
        self$`error_message` <- `error_message_object`
      }
      if (!is.null(this_object$`pin_id`)) {
        self$`pin_id` <- this_object$`pin_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return IneligibleProductTagErrorItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of IneligibleProductTagErrorItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of IneligibleProductTagErrorItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`error_message` <- IneligibleProductTagReason$new()$fromJSON(jsonlite::toJSON(this_object$`error_message`, auto_unbox = TRUE, digits = NA))
      self$`pin_id` <- this_object$`pin_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to IneligibleProductTagErrorItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `error_message`
      if (!is.null(input_json$`error_message`)) {
        stopifnot(R6::is.R6(input_json$`error_message`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IneligibleProductTagErrorItem: the required field `error_message` is missing."))
      }
      # check the required field `pin_id`
      if (!is.null(input_json$`pin_id`)) {
        if (!(is.character(input_json$`pin_id`) && length(input_json$`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", input_json$`pin_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IneligibleProductTagErrorItem: the required field `pin_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IneligibleProductTagErrorItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `error_message` is null
      if (is.null(self$`error_message`)) {
        return(FALSE)
      }

      # check if the required `pin_id` is null
      if (is.null(self$`pin_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`pin_id`, "^\\d+$")) {
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
      # check if the required `error_message` is null
      if (is.null(self$`error_message`)) {
        invalid_fields["error_message"] <- "Non-nullable required field `error_message` cannot be null."
      }

      # check if the required `pin_id` is null
      if (is.null(self$`pin_id`)) {
        invalid_fields["pin_id"] <- "Non-nullable required field `pin_id` cannot be null."
      }

      if (!str_detect(self$`pin_id`, "^\\d+$")) {
        invalid_fields["pin_id"] <- "Invalid value for `pin_id`, must conform to the pattern ^\\d+$."
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
# IneligibleProductTagErrorItem$unlock()
#
## Below is an example to define the print function
# IneligibleProductTagErrorItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IneligibleProductTagErrorItem$lock()

