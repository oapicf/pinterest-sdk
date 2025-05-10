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

    #' @description
    #' Initialize a new MediaUpload class.
    #'
    #' @param media_id Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    #' @param media_type media_type
    #' @param upload_url The URL where you will POST your media file.
    #' @param upload_parameters upload_parameters
    #' @param ... Other optional arguments.
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
    #' @return MediaUpload as a base R list.
    #' @examples
    #' # convert array of MediaUpload (x) to a data frame
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
    #' Convert MediaUpload to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MediaUploadObject <- list()
      if (!is.null(self$`media_id`)) {
        MediaUploadObject[["media_id"]] <-
          self$`media_id`
      }
      if (!is.null(self$`media_type`)) {
        MediaUploadObject[["media_type"]] <-
          self$`media_type`$toSimpleType()
      }
      if (!is.null(self$`upload_url`)) {
        MediaUploadObject[["upload_url"]] <-
          self$`upload_url`
      }
      if (!is.null(self$`upload_parameters`)) {
        MediaUploadObject[["upload_parameters"]] <-
          self$`upload_parameters`$toSimpleType()
      }
      return(MediaUploadObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MediaUpload
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUpload
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MediaUpload in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MediaUpload
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUpload
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_id` <- this_object$`media_id`
      self$`media_type` <- MediaUploadType$new()$fromJSON(jsonlite::toJSON(this_object$`media_type`, auto_unbox = TRUE, digits = NA))
      self$`upload_url` <- this_object$`upload_url`
      self$`upload_parameters` <- MediaUploadAllOfUploadParameters$new()$fromJSON(jsonlite::toJSON(this_object$`upload_parameters`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MediaUpload and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MediaUpload
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
# MediaUpload$unlock()
#
## Below is an example to define the print function
# MediaUpload$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MediaUpload$lock()

