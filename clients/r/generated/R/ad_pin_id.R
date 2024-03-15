#' Create a new AdPinId
#'
#' @description
#' AdPinId Class
#'
#' @docType class
#' @title AdPinId
#' @description AdPinId Class
#' @format An \code{R6Class} generator object
#' @field pin_id Pin ID. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdPinId <- R6::R6Class(
  "AdPinId",
  public = list(
    `pin_id` = NULL,
    #' Initialize a new AdPinId class.
    #'
    #' @description
    #' Initialize a new AdPinId class.
    #'
    #' @param pin_id Pin ID.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`pin_id` = NULL, ...) {
      if (!is.null(`pin_id`)) {
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
    #' @return AdPinId in JSON format
    #' @export
    toJSON = function() {
      AdPinIdObject <- list()
      if (!is.null(self$`pin_id`)) {
        AdPinIdObject[["pin_id"]] <-
          self$`pin_id`
      }
      AdPinIdObject
    },
    #' Deserialize JSON string into an instance of AdPinId
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdPinId
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPinId
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
    #' @return AdPinId in JSON format
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
    #' Deserialize JSON string into an instance of AdPinId
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdPinId
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPinId
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pin_id` <- this_object$`pin_id`
      self
    },
    #' Validate JSON input with respect to AdPinId
    #'
    #' @description
    #' Validate JSON input with respect to AdPinId and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdPinId
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
      if (!str_detect(self$`pin_id`, "^\\d+$")) {
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
      if (!str_detect(self$`pin_id`, "^\\d+$")) {
        invalid_fields["pin_id"] <- "Invalid value for `pin_id`, must conform to the pattern ^\\d+$."
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
# AdPinId$unlock()
#
## Below is an example to define the print function
# AdPinId$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPinId$lock()

