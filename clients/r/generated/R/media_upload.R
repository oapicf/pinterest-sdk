#' Create a new MediaUpload
#'
#' @description
#' Media upload that has been registered but not uploaded/processed yet.
#'
#' @docType class
#' @title MediaUpload
#' @description MediaUpload Class
#' @format An \code{R6Class} generator object
#' @field media_id Unique identifier for this media upload. Used to track status and for attaching during Pin creation. character [optional]
#' @field media_type  \link{MediaUploadType} [optional]
#' @field upload_url The URL where you will POST your media file. character [optional]
#' @field upload_parameters  \link{MediaUploadAllOfUploadParameters} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MediaUpload <- R6::R6Class(
  "MediaUpload",
  public = list(
    `media_id` = NULL,
    `media_type` = NULL,
    `upload_url` = NULL,
    `upload_parameters` = NULL,
    #' Initialize a new MediaUpload class.
    #'
    #' @description
    #' Initialize a new MediaUpload class.
    #'
    #' @param media_id Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    #' @param media_type media_type
    #' @param upload_url The URL where you will POST your media file.
    #' @param upload_parameters upload_parameters
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`media_id` = NULL, `media_type` = NULL, `upload_url` = NULL, `upload_parameters` = NULL, ...) {
      if (!is.null(`media_id`)) {
        if (!(is.character(`media_id`) && length(`media_id`) == 1)) {
          stop(paste("Error! Invalid data for `media_id`. Must be a string:", `media_id`))
        }
        self$`media_id` <- `media_id`
      }
      if (!is.null(`media_type`)) {
        if (!(`media_type` %in% c())) {
          stop(paste("Error! \"", `media_type`, "\" cannot be assigned to `media_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`media_type`))
        self$`media_type` <- `media_type`
      }
      if (!is.null(`upload_url`)) {
        if (!(is.character(`upload_url`) && length(`upload_url`) == 1)) {
          stop(paste("Error! Invalid data for `upload_url`. Must be a string:", `upload_url`))
        }
        self$`upload_url` <- `upload_url`
      }
      if (!is.null(`upload_parameters`)) {
        stopifnot(R6::is.R6(`upload_parameters`))
        self$`upload_parameters` <- `upload_parameters`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MediaUpload in JSON format
    #' @export
    toJSON = function() {
      MediaUploadObject <- list()
      if (!is.null(self$`media_id`)) {
        MediaUploadObject[["media_id"]] <-
          self$`media_id`
      }
      if (!is.null(self$`media_type`)) {
        MediaUploadObject[["media_type"]] <-
          self$`media_type`$toJSON()
      }
      if (!is.null(self$`upload_url`)) {
        MediaUploadObject[["upload_url"]] <-
          self$`upload_url`
      }
      if (!is.null(self$`upload_parameters`)) {
        MediaUploadObject[["upload_parameters"]] <-
          self$`upload_parameters`$toJSON()
      }
      MediaUploadObject
    },
    #' Deserialize JSON string into an instance of MediaUpload
    #'
    #' @description
    #' Deserialize JSON string into an instance of MediaUpload
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUpload
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_id`)) {
        self$`media_id` <- this_object$`media_id`
      }
      if (!is.null(this_object$`media_type`)) {
        `media_type_object` <- MediaUploadType$new()
        `media_type_object`$fromJSON(jsonlite::toJSON(this_object$`media_type`, auto_unbox = TRUE, digits = NA))
        self$`media_type` <- `media_type_object`
      }
      if (!is.null(this_object$`upload_url`)) {
        self$`upload_url` <- this_object$`upload_url`
      }
      if (!is.null(this_object$`upload_parameters`)) {
        `upload_parameters_object` <- MediaUploadAllOfUploadParameters$new()
        `upload_parameters_object`$fromJSON(jsonlite::toJSON(this_object$`upload_parameters`, auto_unbox = TRUE, digits = NA))
        self$`upload_parameters` <- `upload_parameters_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MediaUpload in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`media_id`)) {
          sprintf(
          '"media_id":
            "%s"
                    ',
          self$`media_id`
          )
        },
        if (!is.null(self$`media_type`)) {
          sprintf(
          '"media_type":
          %s
          ',
          jsonlite::toJSON(self$`media_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`upload_url`)) {
          sprintf(
          '"upload_url":
            "%s"
                    ',
          self$`upload_url`
          )
        },
        if (!is.null(self$`upload_parameters`)) {
          sprintf(
          '"upload_parameters":
          %s
          ',
          jsonlite::toJSON(self$`upload_parameters`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MediaUpload
    #'
    #' @description
    #' Deserialize JSON string into an instance of MediaUpload
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUpload
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_id` <- this_object$`media_id`
      self$`media_type` <- MediaUploadType$new()$fromJSON(jsonlite::toJSON(this_object$`media_type`, auto_unbox = TRUE, digits = NA))
      self$`upload_url` <- this_object$`upload_url`
      self$`upload_parameters` <- MediaUploadAllOfUploadParameters$new()$fromJSON(jsonlite::toJSON(this_object$`upload_parameters`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to MediaUpload
    #'
    #' @description
    #' Validate JSON input with respect to MediaUpload and throw an exception if invalid
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
    #' @return String representation of MediaUpload
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
# MediaUpload$unlock()
#
## Below is an example to define the print function
# MediaUpload$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MediaUpload$lock()

