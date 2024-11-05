#' Create a new PinMediaWithImageAllOfImages
#'
#' @description
#' PinMediaWithImageAllOfImages Class
#'
#' @docType class
#' @title PinMediaWithImageAllOfImages
#' @description PinMediaWithImageAllOfImages Class
#' @format An \code{R6Class} generator object
#' @field 150x150  object [optional]
#' @field 400x300  object [optional]
#' @field 600x  object [optional]
#' @field 1200x  object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaWithImageAllOfImages <- R6::R6Class(
  "PinMediaWithImageAllOfImages",
  public = list(
    `150x150` = NULL,
    `400x300` = NULL,
    `600x` = NULL,
    `1200x` = NULL,

    #' @description
    #' Initialize a new PinMediaWithImageAllOfImages class.
    #'
    #' @param 150x150 150x150
    #' @param 400x300 400x300
    #' @param 600x 600x
    #' @param 1200x 1200x
    #' @param ... Other optional arguments.
    initialize = function(`150x150` = NULL, `400x300` = NULL, `600x` = NULL, `1200x` = NULL, ...) {
      if (!is.null(`150x150`)) {
        self$`150x150` <- `150x150`
      }
      if (!is.null(`400x300`)) {
        self$`400x300` <- `400x300`
      }
      if (!is.null(`600x`)) {
        self$`600x` <- `600x`
      }
      if (!is.null(`1200x`)) {
        self$`1200x` <- `1200x`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaWithImageAllOfImages in JSON format
    toJSON = function() {
      PinMediaWithImageAllOfImagesObject <- list()
      if (!is.null(self$`150x150`)) {
        PinMediaWithImageAllOfImagesObject[["150x150"]] <-
          self$`150x150`
      }
      if (!is.null(self$`400x300`)) {
        PinMediaWithImageAllOfImagesObject[["400x300"]] <-
          self$`400x300`
      }
      if (!is.null(self$`600x`)) {
        PinMediaWithImageAllOfImagesObject[["600x"]] <-
          self$`600x`
      }
      if (!is.null(self$`1200x`)) {
        PinMediaWithImageAllOfImagesObject[["1200x"]] <-
          self$`1200x`
      }
      PinMediaWithImageAllOfImagesObject
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImageAllOfImages
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImageAllOfImages
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`150x150`)) {
        self$`150x150` <- this_object$`150x150`
      }
      if (!is.null(this_object$`400x300`)) {
        self$`400x300` <- this_object$`400x300`
      }
      if (!is.null(this_object$`600x`)) {
        self$`600x` <- this_object$`600x`
      }
      if (!is.null(this_object$`1200x`)) {
        self$`1200x` <- this_object$`1200x`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaWithImageAllOfImages in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`150x150`)) {
          sprintf(
          '"150x150":
            "%s"
                    ',
          self$`150x150`
          )
        },
        if (!is.null(self$`400x300`)) {
          sprintf(
          '"400x300":
            "%s"
                    ',
          self$`400x300`
          )
        },
        if (!is.null(self$`600x`)) {
          sprintf(
          '"600x":
            "%s"
                    ',
          self$`600x`
          )
        },
        if (!is.null(self$`1200x`)) {
          sprintf(
          '"1200x":
            "%s"
                    ',
          self$`1200x`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImageAllOfImages
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImageAllOfImages
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`150x150` <- this_object$`150x150`
      self$`400x300` <- this_object$`400x300`
      self$`600x` <- this_object$`600x`
      self$`1200x` <- this_object$`1200x`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaWithImageAllOfImages and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaWithImageAllOfImages
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# PinMediaWithImageAllOfImages$unlock()
#
## Below is an example to define the print function
# PinMediaWithImageAllOfImages$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaWithImageAllOfImages$lock()

