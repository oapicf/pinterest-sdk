#' Create a new PinMediaWithImageAndVideo
#'
#' @description
#' Pin with a mix of images and videos.
#'
#' @docType class
#' @title PinMediaWithImageAndVideo
#' @description PinMediaWithImageAndVideo Class
#' @format An \code{R6Class} generator object
#' @field media_type  character [optional]
#' @field items  list(\link{PinMediaMetadata}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaWithImageAndVideo <- R6::R6Class(
  "PinMediaWithImageAndVideo",
  inherit = PinMedia,
  public = list(
    `media_type` = NULL,
    `items` = NULL,

    #' @description
    #' Initialize a new PinMediaWithImageAndVideo class.
    #'
    #' @param media_type media_type
    #' @param items items
    #' @param ... Other optional arguments.
    initialize = function(`media_type` = NULL, `items` = NULL, ...) {
      if (!is.null(`media_type`)) {
        if (!(is.character(`media_type`) && length(`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", `media_type`))
        }
        self$`media_type` <- `media_type`
      }
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaWithImageAndVideo in JSON format
    toJSON = function() {
      PinMediaWithImageAndVideoObject <- list()
      if (!is.null(self$`media_type`)) {
        PinMediaWithImageAndVideoObject[["media_type"]] <-
          self$`media_type`
      }
      if (!is.null(self$`items`)) {
        PinMediaWithImageAndVideoObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      PinMediaWithImageAndVideoObject
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImageAndVideo
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImageAndVideo
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_type`)) {
        self$`media_type` <- this_object$`media_type`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[PinMediaMetadata]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaWithImageAndVideo in JSON format
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
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImageAndVideo
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImageAndVideo
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_type` <- this_object$`media_type`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[PinMediaMetadata]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaWithImageAndVideo and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaWithImageAndVideo
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
# PinMediaWithImageAndVideo$unlock()
#
## Below is an example to define the print function
# PinMediaWithImageAndVideo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaWithImageAndVideo$lock()

