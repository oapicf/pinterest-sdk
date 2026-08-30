#' Create a new DynamicTitlesUploadURL
#'
#' @description
#' DynamicTitlesUploadURL Class
#'
#' @docType class
#' @title DynamicTitlesUploadURL
#' @description DynamicTitlesUploadURL Class
#' @format An \code{R6Class} generator object
#' @field existing_filename If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. character [optional]
#' @field request_id Unique identifier for this upload session. Must be passed to the process endpoint. character
#' @field upload_url Pre-signed S3 PUT URL to upload the reviewed CSV file. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DynamicTitlesUploadURL <- R6::R6Class(
  "DynamicTitlesUploadURL",
  public = list(
    `existing_filename` = NULL,
    `request_id` = NULL,
    `upload_url` = NULL,

    #' @description
    #' Initialize a new DynamicTitlesUploadURL class.
    #'
    #' @param request_id Unique identifier for this upload session. Must be passed to the process endpoint.
    #' @param upload_url Pre-signed S3 PUT URL to upload the reviewed CSV file.
    #' @param existing_filename If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
    #' @param ... Other optional arguments.
    initialize = function(`request_id`, `upload_url`, `existing_filename` = NULL, ...) {
      if (!missing(`request_id`)) {
        if (!(is.character(`request_id`) && length(`request_id`) == 1)) {
          stop(paste("Error! Invalid data for `request_id`. Must be a string:", `request_id`))
        }
        self$`request_id` <- `request_id`
      }
      if (!missing(`upload_url`)) {
        if (!(is.character(`upload_url`) && length(`upload_url`) == 1)) {
          stop(paste("Error! Invalid data for `upload_url`. Must be a string:", `upload_url`))
        }
        self$`upload_url` <- `upload_url`
      }
      if (!is.null(`existing_filename`)) {
        if (!(is.character(`existing_filename`) && length(`existing_filename`) == 1)) {
          stop(paste("Error! Invalid data for `existing_filename`. Must be a string:", `existing_filename`))
        }
        self$`existing_filename` <- `existing_filename`
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
    #' @return DynamicTitlesUploadURL as a base R list.
    #' @examples
    #' # convert array of DynamicTitlesUploadURL (x) to a data frame
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
    #' Convert DynamicTitlesUploadURL to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DynamicTitlesUploadURLObject <- list()
      if (!is.null(self$`existing_filename`)) {
        DynamicTitlesUploadURLObject[["existing_filename"]] <-
          self$`existing_filename`
      }
      if (!is.null(self$`request_id`)) {
        DynamicTitlesUploadURLObject[["request_id"]] <-
          self$`request_id`
      }
      if (!is.null(self$`upload_url`)) {
        DynamicTitlesUploadURLObject[["upload_url"]] <-
          self$`upload_url`
      }
      return(DynamicTitlesUploadURLObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesUploadURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesUploadURL
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`existing_filename`)) {
        self$`existing_filename` <- this_object$`existing_filename`
      }
      if (!is.null(this_object$`request_id`)) {
        self$`request_id` <- this_object$`request_id`
      }
      if (!is.null(this_object$`upload_url`)) {
        self$`upload_url` <- this_object$`upload_url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DynamicTitlesUploadURL in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesUploadURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesUploadURL
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`existing_filename` <- this_object$`existing_filename`
      self$`request_id` <- this_object$`request_id`
      self$`upload_url` <- this_object$`upload_url`
      self
    },

    #' @description
    #' Validate JSON input with respect to DynamicTitlesUploadURL and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `request_id`
      if (!is.null(input_json$`request_id`)) {
        if (!(is.character(input_json$`request_id`) && length(input_json$`request_id`) == 1)) {
          stop(paste("Error! Invalid data for `request_id`. Must be a string:", input_json$`request_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DynamicTitlesUploadURL: the required field `request_id` is missing."))
      }
      # check the required field `upload_url`
      if (!is.null(input_json$`upload_url`)) {
        if (!(is.character(input_json$`upload_url`) && length(input_json$`upload_url`) == 1)) {
          stop(paste("Error! Invalid data for `upload_url`. Must be a string:", input_json$`upload_url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DynamicTitlesUploadURL: the required field `upload_url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DynamicTitlesUploadURL
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `request_id` is null
      if (is.null(self$`request_id`)) {
        return(FALSE)
      }

      # check if the required `upload_url` is null
      if (is.null(self$`upload_url`)) {
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
      # check if the required `request_id` is null
      if (is.null(self$`request_id`)) {
        invalid_fields["request_id"] <- "Non-nullable required field `request_id` cannot be null."
      }

      # check if the required `upload_url` is null
      if (is.null(self$`upload_url`)) {
        invalid_fields["upload_url"] <- "Non-nullable required field `upload_url` cannot be null."
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
# DynamicTitlesUploadURL$unlock()
#
## Below is an example to define the print function
# DynamicTitlesUploadURL$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DynamicTitlesUploadURL$lock()

