#' Create a new PinMediaWithImage
#'
#' @description
#' Pin with image.
#'
#' @docType class
#' @title PinMediaWithImage
#' @description PinMediaWithImage Class
#' @format An \code{R6Class} generator object
#' @field media_type  character [optional]
#' @field images  \link{ImageMetadataImages} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaWithImage <- R6::R6Class(
  "PinMediaWithImage",
  inherit = PinMedia,
  public = list(
    `media_type` = NULL,
    `images` = NULL,
    #' Initialize a new PinMediaWithImage class.
    #'
    #' @description
    #' Initialize a new PinMediaWithImage class.
    #'
    #' @param media_type media_type
    #' @param images images
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`media_type` = NULL, `images` = NULL, ...) {
      if (!is.null(`media_type`)) {
        if (!(is.character(`media_type`) && length(`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", `media_type`))
        }
        self$`media_type` <- `media_type`
      }
      if (!is.null(`images`)) {
        stopifnot(R6::is.R6(`images`))
        self$`images` <- `images`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaWithImage in JSON format
    #' @export
    toJSON = function() {
      PinMediaWithImageObject <- list()
      if (!is.null(self$`media_type`)) {
        PinMediaWithImageObject[["media_type"]] <-
          self$`media_type`
      }
      if (!is.null(self$`images`)) {
        PinMediaWithImageObject[["images"]] <-
          self$`images`$toJSON()
      }
      PinMediaWithImageObject
    },
    #' Deserialize JSON string into an instance of PinMediaWithImage
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImage
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_type`)) {
        self$`media_type` <- this_object$`media_type`
      }
      if (!is.null(this_object$`images`)) {
        `images_object` <- ImageMetadataImages$new()
        `images_object`$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
        self$`images` <- `images_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaWithImage in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`media_type`)) {
          sprintf(
          '"media_type":
            "%s"
                    ',
          self$`media_type`
          )
        },
        if (!is.null(self$`images`)) {
          sprintf(
          '"images":
          %s
          ',
          jsonlite::toJSON(self$`images`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinMediaWithImage
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImage
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_type` <- this_object$`media_type`
      self$`images` <- ImageMetadataImages$new()$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to PinMediaWithImage
    #'
    #' @description
    #' Validate JSON input with respect to PinMediaWithImage and throw an exception if invalid
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
    #' @return String representation of PinMediaWithImage
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
# PinMediaWithImage$unlock()
#
## Below is an example to define the print function
# PinMediaWithImage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaWithImage$lock()

