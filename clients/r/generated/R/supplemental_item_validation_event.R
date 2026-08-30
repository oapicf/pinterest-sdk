#' Create a new SupplementalItemValidationEvent
#'
#' @description
#' Item validation event
#'
#' @docType class
#' @title SupplementalItemValidationEvent
#' @description SupplementalItemValidationEvent Class
#' @format An \code{R6Class} generator object
#' @field attribute The item attribute referenced by the validation event eg. price, availability, ad_link character
#' @field code The event code that the item validation event references integer
#' @field message Title message describing the item validation event character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SupplementalItemValidationEvent <- R6::R6Class(
  "SupplementalItemValidationEvent",
  public = list(
    `attribute` = NULL,
    `code` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new SupplementalItemValidationEvent class.
    #'
    #' @param attribute The item attribute referenced by the validation event eg. price, availability, ad_link
    #' @param code The event code that the item validation event references
    #' @param message Title message describing the item validation event
    #' @param ... Other optional arguments.
    initialize = function(`attribute`, `code`, `message`, ...) {
      if (!missing(`attribute`)) {
        if (!(is.character(`attribute`) && length(`attribute`) == 1)) {
          stop(paste("Error! Invalid data for `attribute`. Must be a string:", `attribute`))
        }
        self$`attribute` <- `attribute`
      }
      if (!missing(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
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
    #' @return SupplementalItemValidationEvent as a base R list.
    #' @examples
    #' # convert array of SupplementalItemValidationEvent (x) to a data frame
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
    #' Convert SupplementalItemValidationEvent to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SupplementalItemValidationEventObject <- list()
      if (!is.null(self$`attribute`)) {
        SupplementalItemValidationEventObject[["attribute"]] <-
          self$`attribute`
      }
      if (!is.null(self$`code`)) {
        SupplementalItemValidationEventObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        SupplementalItemValidationEventObject[["message"]] <-
          self$`message`
      }
      return(SupplementalItemValidationEventObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SupplementalItemValidationEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of SupplementalItemValidationEvent
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attribute`)) {
        self$`attribute` <- this_object$`attribute`
      }
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SupplementalItemValidationEvent in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SupplementalItemValidationEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of SupplementalItemValidationEvent
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attribute` <- this_object$`attribute`
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to SupplementalItemValidationEvent and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `attribute`
      if (!is.null(input_json$`attribute`)) {
        if (!(is.character(input_json$`attribute`) && length(input_json$`attribute`) == 1)) {
          stop(paste("Error! Invalid data for `attribute`. Must be a string:", input_json$`attribute`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalItemValidationEvent: the required field `attribute` is missing."))
      }
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        if (!(is.numeric(input_json$`code`) && length(input_json$`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", input_json$`code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalItemValidationEvent: the required field `code` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalItemValidationEvent: the required field `message` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SupplementalItemValidationEvent
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `attribute` is null
      if (is.null(self$`attribute`)) {
        return(FALSE)
      }

      # check if the required `code` is null
      if (is.null(self$`code`)) {
        return(FALSE)
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
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
      # check if the required `attribute` is null
      if (is.null(self$`attribute`)) {
        invalid_fields["attribute"] <- "Non-nullable required field `attribute` cannot be null."
      }

      # check if the required `code` is null
      if (is.null(self$`code`)) {
        invalid_fields["code"] <- "Non-nullable required field `code` cannot be null."
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
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
# SupplementalItemValidationEvent$unlock()
#
## Below is an example to define the print function
# SupplementalItemValidationEvent$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SupplementalItemValidationEvent$lock()

