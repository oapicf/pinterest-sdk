#' Create a new AdPreviewCreateFromPin
#'
#' @description
#' AdPreviewCreateFromPin Class
#'
#' @docType class
#' @title AdPreviewCreateFromPin
#' @description AdPreviewCreateFromPin Class
#' @format An \code{R6Class} generator object
#' @field pin_id Pin ID. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdPreviewCreateFromPin <- R6::R6Class(
  "AdPreviewCreateFromPin",
  public = list(
    `pin_id` = NULL,
    #' Initialize a new AdPreviewCreateFromPin class.
    #'
    #' @description
    #' Initialize a new AdPreviewCreateFromPin class.
    #'
    #' @param pin_id Pin ID.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`pin_id`, ...) {
      if (!missing(`pin_id`)) {
        if (!(is.character(`pin_id`) && length(`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", `pin_id`))
        }
        self$`pin_id` <- `pin_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdPreviewCreateFromPin in JSON format
    #' @export
    toJSON = function() {
      AdPreviewCreateFromPinObject <- list()
      if (!is.null(self$`pin_id`)) {
        AdPreviewCreateFromPinObject[["pin_id"]] <-
          self$`pin_id`
      }
      AdPreviewCreateFromPinObject
    },
    #' Deserialize JSON string into an instance of AdPreviewCreateFromPin
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdPreviewCreateFromPin
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewCreateFromPin
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pin_id`)) {
        self$`pin_id` <- this_object$`pin_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdPreviewCreateFromPin in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`pin_id`)) {
          sprintf(
          '"pin_id":
            "%s"
                    ',
          self$`pin_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdPreviewCreateFromPin
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdPreviewCreateFromPin
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewCreateFromPin
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pin_id` <- this_object$`pin_id`
      self
    },
    #' Validate JSON input with respect to AdPreviewCreateFromPin
    #'
    #' @description
    #' Validate JSON input with respect to AdPreviewCreateFromPin and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `pin_id`
      if (!is.null(input_json$`pin_id`)) {
        if (!(is.character(input_json$`pin_id`) && length(input_json$`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", input_json$`pin_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPreviewCreateFromPin: the required field `pin_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdPreviewCreateFromPin
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `pin_id` is null
      if (is.null(self$`pin_id`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `pin_id` is null
      if (is.null(self$`pin_id`)) {
        invalid_fields["pin_id"] <- "Non-nullable required field `pin_id` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# AdPreviewCreateFromPin$unlock()
#
## Below is an example to define the print function
# AdPreviewCreateFromPin$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPreviewCreateFromPin$lock()

