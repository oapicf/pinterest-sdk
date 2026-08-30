#' Create a new PinsSaveRequestCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title PinsSaveRequestCreate
#' @description PinsSaveRequestCreate Class
#' @format An \code{R6Class} generator object
#' @field board_id Unique identifier of the board to which the pin will be saved. character [optional]
#' @field board_section_id Unique identifier of the board section to which the pin will be saved. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinsSaveRequestCreate <- R6::R6Class(
  "PinsSaveRequestCreate",
  public = list(
    `board_id` = NULL,
    `board_section_id` = NULL,

    #' @description
    #' Initialize a new PinsSaveRequestCreate class.
    #'
    #' @param board_id Unique identifier of the board to which the pin will be saved.
    #' @param board_section_id Unique identifier of the board section to which the pin will be saved.
    #' @param ... Other optional arguments.
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
    #' @return PinsSaveRequestCreate as a base R list.
    #' @examples
    #' # convert array of PinsSaveRequestCreate (x) to a data frame
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
    #' Convert PinsSaveRequestCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinsSaveRequestCreateObject <- list()
      if (!is.null(self$`board_id`)) {
        PinsSaveRequestCreateObject[["board_id"]] <-
          self$`board_id`
      }
      if (!is.null(self$`board_section_id`)) {
        PinsSaveRequestCreateObject[["board_section_id"]] <-
          self$`board_section_id`
      }
      return(PinsSaveRequestCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PinsSaveRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinsSaveRequestCreate
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinsSaveRequestCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinsSaveRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinsSaveRequestCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`board_id` <- this_object$`board_id`
      self$`board_section_id` <- this_object$`board_section_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinsSaveRequestCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinsSaveRequestCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`board_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
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
      if (!str_detect(self$`board_id`, "^\\d+$")) {
        invalid_fields["board_id"] <- "Invalid value for `board_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
        invalid_fields["board_section_id"] <- "Invalid value for `board_section_id`, must conform to the pattern ^\\d+$."
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
# PinsSaveRequestCreate$unlock()
#
## Below is an example to define the print function
# PinsSaveRequestCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinsSaveRequestCreate$lock()

