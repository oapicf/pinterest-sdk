#' Create a new BoardMedia
#'
#' @description
#' Board media.
#'
#' @docType class
#' @title BoardMedia
#' @description BoardMedia Class
#' @format An \code{R6Class} generator object
#' @field image_cover_url Board cover image. character [optional]
#' @field pin_thumbnail_urls Board pin thumbnail urls. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BoardMedia <- R6::R6Class(
  "BoardMedia",
  public = list(
    `image_cover_url` = NULL,
    `pin_thumbnail_urls` = NULL,

    #' @description
    #' Initialize a new BoardMedia class.
    #'
    #' @param image_cover_url Board cover image.
    #' @param pin_thumbnail_urls Board pin thumbnail urls.
    #' @param ... Other optional arguments.
    initialize = function(`image_cover_url` = NULL, `pin_thumbnail_urls` = NULL, ...) {
      if (!is.null(`image_cover_url`)) {
        if (!(is.character(`image_cover_url`) && length(`image_cover_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_cover_url`. Must be a string:", `image_cover_url`))
        }
        self$`image_cover_url` <- `image_cover_url`
      }
      if (!is.null(`pin_thumbnail_urls`)) {
        stopifnot(is.vector(`pin_thumbnail_urls`), length(`pin_thumbnail_urls`) != 0)
        sapply(`pin_thumbnail_urls`, function(x) stopifnot(is.character(x)))
        self$`pin_thumbnail_urls` <- `pin_thumbnail_urls`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BoardMedia in JSON format
    toJSON = function() {
      BoardMediaObject <- list()
      if (!is.null(self$`image_cover_url`)) {
        BoardMediaObject[["image_cover_url"]] <-
          self$`image_cover_url`
      }
      if (!is.null(self$`pin_thumbnail_urls`)) {
        BoardMediaObject[["pin_thumbnail_urls"]] <-
          self$`pin_thumbnail_urls`
      }
      BoardMediaObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BoardMedia
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardMedia
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`image_cover_url`)) {
        self$`image_cover_url` <- this_object$`image_cover_url`
      }
      if (!is.null(this_object$`pin_thumbnail_urls`)) {
        self$`pin_thumbnail_urls` <- ApiClient$new()$deserializeObj(this_object$`pin_thumbnail_urls`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BoardMedia in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`image_cover_url`)) {
          sprintf(
          '"image_cover_url":
            "%s"
                    ',
          self$`image_cover_url`
          )
        },
        if (!is.null(self$`pin_thumbnail_urls`)) {
          sprintf(
          '"pin_thumbnail_urls":
             [%s]
          ',
          paste(unlist(lapply(self$`pin_thumbnail_urls`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BoardMedia
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardMedia
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`image_cover_url` <- this_object$`image_cover_url`
      self$`pin_thumbnail_urls` <- ApiClient$new()$deserializeObj(this_object$`pin_thumbnail_urls`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BoardMedia and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BoardMedia
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
# BoardMedia$unlock()
#
## Below is an example to define the print function
# BoardMedia$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BoardMedia$lock()

