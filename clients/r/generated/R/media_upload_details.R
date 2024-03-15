#' Create a new MediaUploadDetails
#'
#' @description
#' Media upload details
#'
#' @docType class
#' @title MediaUploadDetails
#' @description MediaUploadDetails Class
#' @format An \code{R6Class} generator object
#' @field media_id  character [optional]
#' @field media_type  \link{MediaUploadType} [optional]
#' @field status  \link{MediaUploadStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MediaUploadDetails <- R6::R6Class(
  "MediaUploadDetails",
  public = list(
    `media_id` = NULL,
    `media_type` = NULL,
    `status` = NULL,
    #' Initialize a new MediaUploadDetails class.
    #'
    #' @description
    #' Initialize a new MediaUploadDetails class.
    #'
    #' @param media_id media_id
    #' @param media_type media_type
    #' @param status status
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`media_id` = NULL, `media_type` = NULL, `status` = NULL, ...) {
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
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MediaUploadDetails in JSON format
    #' @export
    toJSON = function() {
      MediaUploadDetailsObject <- list()
      if (!is.null(self$`media_id`)) {
        MediaUploadDetailsObject[["media_id"]] <-
          self$`media_id`
      }
      if (!is.null(self$`media_type`)) {
        MediaUploadDetailsObject[["media_type"]] <-
          self$`media_type`$toJSON()
      }
      if (!is.null(self$`status`)) {
        MediaUploadDetailsObject[["status"]] <-
          self$`status`$toJSON()
      }
      MediaUploadDetailsObject
    },
    #' Deserialize JSON string into an instance of MediaUploadDetails
    #'
    #' @description
    #' Deserialize JSON string into an instance of MediaUploadDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadDetails
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
      if (!is.null(this_object$`status`)) {
        `status_object` <- MediaUploadStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MediaUploadDetails in JSON format
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
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MediaUploadDetails
    #'
    #' @description
    #' Deserialize JSON string into an instance of MediaUploadDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadDetails
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_id` <- this_object$`media_id`
      self$`media_type` <- MediaUploadType$new()$fromJSON(jsonlite::toJSON(this_object$`media_type`, auto_unbox = TRUE, digits = NA))
      self$`status` <- MediaUploadStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to MediaUploadDetails
    #'
    #' @description
    #' Validate JSON input with respect to MediaUploadDetails and throw an exception if invalid
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
    #' @return String representation of MediaUploadDetails
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
      if (!str_detect(self$`media_id`, "^\\d+$")) {
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
      if (!str_detect(self$`media_id`, "^\\d+$")) {
        invalid_fields["media_id"] <- "Invalid value for `media_id`, must conform to the pattern ^\\d+$."
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
# MediaUploadDetails$unlock()
#
## Below is an example to define the print function
# MediaUploadDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MediaUploadDetails$lock()

