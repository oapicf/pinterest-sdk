#' Create a new MediaUploadRequest
#'
#' @description
#' Media upload request
#'
#' @docType class
#' @title MediaUploadRequest
#' @description MediaUploadRequest Class
#' @format An \code{R6Class} generator object
#' @field media_type  \link{MediaUploadType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MediaUploadRequest <- R6::R6Class(
  "MediaUploadRequest",
  public = list(
    `media_type` = NULL,
    #' Initialize a new MediaUploadRequest class.
    #'
    #' @description
    #' Initialize a new MediaUploadRequest class.
    #'
    #' @param media_type media_type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`media_type`, ...) {
      if (!missing(`media_type`)) {
        if (!(`media_type` %in% c())) {
          stop(paste("Error! \"", `media_type`, "\" cannot be assigned to `media_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`media_type`))
        self$`media_type` <- `media_type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MediaUploadRequest in JSON format
    #' @export
    toJSON = function() {
      MediaUploadRequestObject <- list()
      if (!is.null(self$`media_type`)) {
        MediaUploadRequestObject[["media_type"]] <-
          self$`media_type`$toJSON()
      }
      MediaUploadRequestObject
    },
    #' Deserialize JSON string into an instance of MediaUploadRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of MediaUploadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_type`)) {
        `media_type_object` <- MediaUploadType$new()
        `media_type_object`$fromJSON(jsonlite::toJSON(this_object$`media_type`, auto_unbox = TRUE, digits = NA))
        self$`media_type` <- `media_type_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MediaUploadRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`media_type`)) {
          sprintf(
          '"media_type":
          %s
          ',
          jsonlite::toJSON(self$`media_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MediaUploadRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of MediaUploadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_type` <- MediaUploadType$new()$fromJSON(jsonlite::toJSON(this_object$`media_type`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to MediaUploadRequest
    #'
    #' @description
    #' Validate JSON input with respect to MediaUploadRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `media_type`
      if (!is.null(input_json$`media_type`)) {
        stopifnot(R6::is.R6(input_json$`media_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MediaUploadRequest: the required field `media_type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MediaUploadRequest
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
      # check if the required `media_type` is null
      if (is.null(self$`media_type`)) {
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
      # check if the required `media_type` is null
      if (is.null(self$`media_type`)) {
        invalid_fields["media_type"] <- "Non-nullable required field `media_type` cannot be null."
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
# MediaUploadRequest$unlock()
#
## Below is an example to define the print function
# MediaUploadRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MediaUploadRequest$lock()

