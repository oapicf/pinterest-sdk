#' Create a new ImageMetadataImages
#'
#' @description
#' ImageMetadataImages Class
#'
#' @docType class
#' @title ImageMetadataImages
#' @description ImageMetadataImages Class
#' @format An \code{R6Class} generator object
#' @field 150x150  \link{ImageDetails} [optional]
#' @field 400x300  \link{ImageDetails} [optional]
#' @field 600x  \link{ImageDetails} [optional]
#' @field 1200x  \link{ImageDetails} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ImageMetadataImages <- R6::R6Class(
  "ImageMetadataImages",
  public = list(
    `150x150` = NULL,
    `400x300` = NULL,
    `600x` = NULL,
    `1200x` = NULL,

    #' @description
    #' Initialize a new ImageMetadataImages class.
    #'
    #' @param 150x150 150x150
    #' @param 400x300 400x300
    #' @param 600x 600x
    #' @param 1200x 1200x
    #' @param ... Other optional arguments.
    initialize = function(`150x150` = NULL, `400x300` = NULL, `600x` = NULL, `1200x` = NULL, ...) {
      if (!is.null(`150x150`)) {
        stopifnot(R6::is.R6(`150x150`))
        self$`150x150` <- `150x150`
      }
      if (!is.null(`400x300`)) {
        stopifnot(R6::is.R6(`400x300`))
        self$`400x300` <- `400x300`
      }
      if (!is.null(`600x`)) {
        stopifnot(R6::is.R6(`600x`))
        self$`600x` <- `600x`
      }
      if (!is.null(`1200x`)) {
        stopifnot(R6::is.R6(`1200x`))
        self$`1200x` <- `1200x`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ImageMetadataImages in JSON format
    toJSON = function() {
      ImageMetadataImagesObject <- list()
      if (!is.null(self$`150x150`)) {
        ImageMetadataImagesObject[["150x150"]] <-
          self$`150x150`$toJSON()
      }
      if (!is.null(self$`400x300`)) {
        ImageMetadataImagesObject[["400x300"]] <-
          self$`400x300`$toJSON()
      }
      if (!is.null(self$`600x`)) {
        ImageMetadataImagesObject[["600x"]] <-
          self$`600x`$toJSON()
      }
      if (!is.null(self$`1200x`)) {
        ImageMetadataImagesObject[["1200x"]] <-
          self$`1200x`$toJSON()
      }
      ImageMetadataImagesObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageMetadataImages
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageMetadataImages
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`150x150`)) {
        `150x150_object` <- ImageDetails$new()
        `150x150_object`$fromJSON(jsonlite::toJSON(this_object$`150x150`, auto_unbox = TRUE, digits = NA))
        self$`150x150` <- `150x150_object`
      }
      if (!is.null(this_object$`400x300`)) {
        `400x300_object` <- ImageDetails$new()
        `400x300_object`$fromJSON(jsonlite::toJSON(this_object$`400x300`, auto_unbox = TRUE, digits = NA))
        self$`400x300` <- `400x300_object`
      }
      if (!is.null(this_object$`600x`)) {
        `600x_object` <- ImageDetails$new()
        `600x_object`$fromJSON(jsonlite::toJSON(this_object$`600x`, auto_unbox = TRUE, digits = NA))
        self$`600x` <- `600x_object`
      }
      if (!is.null(this_object$`1200x`)) {
        `1200x_object` <- ImageDetails$new()
        `1200x_object`$fromJSON(jsonlite::toJSON(this_object$`1200x`, auto_unbox = TRUE, digits = NA))
        self$`1200x` <- `1200x_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ImageMetadataImages in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`150x150`)) {
          sprintf(
          '"150x150":
          %s
          ',
          jsonlite::toJSON(self$`150x150`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`400x300`)) {
          sprintf(
          '"400x300":
          %s
          ',
          jsonlite::toJSON(self$`400x300`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`600x`)) {
          sprintf(
          '"600x":
          %s
          ',
          jsonlite::toJSON(self$`600x`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`1200x`)) {
          sprintf(
          '"1200x":
          %s
          ',
          jsonlite::toJSON(self$`1200x`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageMetadataImages
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageMetadataImages
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`150x150` <- ImageDetails$new()$fromJSON(jsonlite::toJSON(this_object$`150x150`, auto_unbox = TRUE, digits = NA))
      self$`400x300` <- ImageDetails$new()$fromJSON(jsonlite::toJSON(this_object$`400x300`, auto_unbox = TRUE, digits = NA))
      self$`600x` <- ImageDetails$new()$fromJSON(jsonlite::toJSON(this_object$`600x`, auto_unbox = TRUE, digits = NA))
      self$`1200x` <- ImageDetails$new()$fromJSON(jsonlite::toJSON(this_object$`1200x`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ImageMetadataImages and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ImageMetadataImages
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
# ImageMetadataImages$unlock()
#
## Below is an example to define the print function
# ImageMetadataImages$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ImageMetadataImages$lock()

