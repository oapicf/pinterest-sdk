#' Create a new PinMedia
#'
#' @description
#' Pin media objects.
#'
#' @docType class
#' @title PinMedia
#' @description PinMedia Class
#' @format An \code{R6Class} generator object
#' @field media_type  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMedia <- R6::R6Class(
  "PinMedia",
  public = list(
    `media_type` = NULL,
    `_discriminator_property_name` = 'media_type',
    `_discriminator_mapping_name` = c('image' = 'PinMediaWithImage', 'multiple_images' = 'PinMediaWithImages', 'multiple_mixed' = 'PinMediaWithImageAndVideo', 'multiple_videos' = 'PinMediaWithVideos', 'video' = 'PinMediaWithVideo'),
    #' Initialize a new PinMedia class.
    #'
    #' @description
    #' Initialize a new PinMedia class.
    #'
    #' @param media_type media_type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`media_type` = NULL, ...) {
      if (!is.null(`media_type`)) {
        if (!(is.character(`media_type`) && length(`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", `media_type`))
        }
        self$`media_type` <- `media_type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMedia in JSON format
    #' @export
    toJSON = function() {
      PinMediaObject <- list()
      if (!is.null(self$`media_type`)) {
        PinMediaObject[["media_type"]] <-
          self$`media_type`
      }
      PinMediaObject
    },
    #' Deserialize JSON string into an instance of PinMedia
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMedia
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMedia
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_type`)) {
        self$`media_type` <- this_object$`media_type`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMedia in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinMedia
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMedia
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMedia
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_type` <- this_object$`media_type`
      self
    },
    #' Validate JSON input with respect to PinMedia
    #'
    #' @description
    #' Validate JSON input with respect to PinMedia and throw an exception if invalid
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
    #' @return String representation of PinMedia
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
# PinMedia$unlock()
#
## Below is an example to define the print function
# PinMedia$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMedia$lock()

