#' Create a new PinsSaveRequest
#'
#' @description
#' PinsSaveRequest Class
#'
#' @docType class
#' @title PinsSaveRequest
#' @description PinsSaveRequest Class
#' @format An \code{R6Class} generator object
#' @field board_id Unique identifier of the board to which the pin will be saved. character [optional]
#' @field board_section_id Unique identifier of the board section to which the pin will be saved. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinsSaveRequest <- R6::R6Class(
  "PinsSaveRequest",
  public = list(
    `board_id` = NULL,
    `board_section_id` = NULL,
    #' Initialize a new PinsSaveRequest class.
    #'
    #' @description
    #' Initialize a new PinsSaveRequest class.
    #'
    #' @param board_id Unique identifier of the board to which the pin will be saved.
    #' @param board_section_id Unique identifier of the board section to which the pin will be saved.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`board_id` = NULL, `board_section_id` = NULL, ...) {
      if (!is.null(`board_id`)) {
        if (!(is.character(`board_id`) && length(`board_id`) == 1)) {
          stop(paste("Error! Invalid data for `board_id`. Must be a string:", `board_id`))
        }
        self$`board_id` <- `board_id`
      }
      if (!is.null(`board_section_id`)) {
        if (!(is.character(`board_section_id`) && length(`board_section_id`) == 1)) {
          stop(paste("Error! Invalid data for `board_section_id`. Must be a string:", `board_section_id`))
        }
        self$`board_section_id` <- `board_section_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinsSaveRequest in JSON format
    #' @export
    toJSON = function() {
      PinsSaveRequestObject <- list()
      if (!is.null(self$`board_id`)) {
        PinsSaveRequestObject[["board_id"]] <-
          self$`board_id`
      }
      if (!is.null(self$`board_section_id`)) {
        PinsSaveRequestObject[["board_section_id"]] <-
          self$`board_section_id`
      }
      PinsSaveRequestObject
    },
    #' Deserialize JSON string into an instance of PinsSaveRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinsSaveRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinsSaveRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`board_id`)) {
        self$`board_id` <- this_object$`board_id`
      }
      if (!is.null(this_object$`board_section_id`)) {
        self$`board_section_id` <- this_object$`board_section_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinsSaveRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`board_id`)) {
          sprintf(
          '"board_id":
            "%s"
                    ',
          self$`board_id`
          )
        },
        if (!is.null(self$`board_section_id`)) {
          sprintf(
          '"board_section_id":
            "%s"
                    ',
          self$`board_section_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinsSaveRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinsSaveRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinsSaveRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`board_id` <- this_object$`board_id`
      self$`board_section_id` <- this_object$`board_section_id`
      self
    },
    #' Validate JSON input with respect to PinsSaveRequest
    #'
    #' @description
    #' Validate JSON input with respect to PinsSaveRequest and throw an exception if invalid
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
    #' @return String representation of PinsSaveRequest
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
      if (!str_detect(self$`board_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
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
      if (!str_detect(self$`board_id`, "^\\d+$")) {
        invalid_fields["board_id"] <- "Invalid value for `board_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
        invalid_fields["board_section_id"] <- "Invalid value for `board_section_id`, must conform to the pattern ^\\d+$."
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
# PinsSaveRequest$unlock()
#
## Below is an example to define the print function
# PinsSaveRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinsSaveRequest$lock()

