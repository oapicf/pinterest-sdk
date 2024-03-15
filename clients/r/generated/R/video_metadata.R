#' Create a new VideoMetadata
#'
#' @description
#' VideoMetadata Class
#'
#' @docType class
#' @title VideoMetadata
#' @description VideoMetadata Class
#' @format An \code{R6Class} generator object
#' @field item_type  character [optional]
#' @field cover_image_url  character [optional]
#' @field video_url Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. character [optional]
#' @field duration Duration (in milliseconds) numeric [optional]
#' @field height Height (in pixels) integer [optional]
#' @field width Width (in pixels) integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VideoMetadata <- R6::R6Class(
  "VideoMetadata",
  public = list(
    `item_type` = NULL,
    `cover_image_url` = NULL,
    `video_url` = NULL,
    `duration` = NULL,
    `height` = NULL,
    `width` = NULL,
    #' Initialize a new VideoMetadata class.
    #'
    #' @description
    #' Initialize a new VideoMetadata class.
    #'
    #' @param item_type item_type
    #' @param cover_image_url cover_image_url
    #' @param video_url Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
    #' @param duration Duration (in milliseconds)
    #' @param height Height (in pixels)
    #' @param width Width (in pixels)
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`item_type` = NULL, `cover_image_url` = NULL, `video_url` = NULL, `duration` = NULL, `height` = NULL, `width` = NULL, ...) {
      if (!is.null(`item_type`)) {
        if (!(is.character(`item_type`) && length(`item_type`) == 1)) {
          stop(paste("Error! Invalid data for `item_type`. Must be a string:", `item_type`))
        }
        self$`item_type` <- `item_type`
      }
      if (!is.null(`cover_image_url`)) {
        if (!(is.character(`cover_image_url`) && length(`cover_image_url`) == 1)) {
          stop(paste("Error! Invalid data for `cover_image_url`. Must be a string:", `cover_image_url`))
        }
        self$`cover_image_url` <- `cover_image_url`
      }
      if (!is.null(`video_url`)) {
        if (!(is.character(`video_url`) && length(`video_url`) == 1)) {
          stop(paste("Error! Invalid data for `video_url`. Must be a string:", `video_url`))
        }
        self$`video_url` <- `video_url`
      }
      if (!is.null(`duration`)) {
        self$`duration` <- `duration`
      }
      if (!is.null(`height`)) {
        if (!(is.numeric(`height`) && length(`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", `height`))
        }
        self$`height` <- `height`
      }
      if (!is.null(`width`)) {
        if (!(is.numeric(`width`) && length(`width`) == 1)) {
          stop(paste("Error! Invalid data for `width`. Must be an integer:", `width`))
        }
        self$`width` <- `width`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VideoMetadata in JSON format
    #' @export
    toJSON = function() {
      VideoMetadataObject <- list()
      if (!is.null(self$`item_type`)) {
        VideoMetadataObject[["item_type"]] <-
          self$`item_type`
      }
      if (!is.null(self$`cover_image_url`)) {
        VideoMetadataObject[["cover_image_url"]] <-
          self$`cover_image_url`
      }
      if (!is.null(self$`video_url`)) {
        VideoMetadataObject[["video_url"]] <-
          self$`video_url`
      }
      if (!is.null(self$`duration`)) {
        VideoMetadataObject[["duration"]] <-
          self$`duration`
      }
      if (!is.null(self$`height`)) {
        VideoMetadataObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`width`)) {
        VideoMetadataObject[["width"]] <-
          self$`width`
      }
      VideoMetadataObject
    },
    #' Deserialize JSON string into an instance of VideoMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of VideoMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of VideoMetadata
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_type`)) {
        self$`item_type` <- this_object$`item_type`
      }
      if (!is.null(this_object$`cover_image_url`)) {
        self$`cover_image_url` <- this_object$`cover_image_url`
      }
      if (!is.null(this_object$`video_url`)) {
        self$`video_url` <- this_object$`video_url`
      }
      if (!is.null(this_object$`duration`)) {
        self$`duration` <- this_object$`duration`
      }
      if (!is.null(this_object$`height`)) {
        self$`height` <- this_object$`height`
      }
      if (!is.null(this_object$`width`)) {
        self$`width` <- this_object$`width`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VideoMetadata in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_type`)) {
          sprintf(
          '"item_type":
            "%s"
                    ',
          self$`item_type`
          )
        },
        if (!is.null(self$`cover_image_url`)) {
          sprintf(
          '"cover_image_url":
            "%s"
                    ',
          self$`cover_image_url`
          )
        },
        if (!is.null(self$`video_url`)) {
          sprintf(
          '"video_url":
            "%s"
                    ',
          self$`video_url`
          )
        },
        if (!is.null(self$`duration`)) {
          sprintf(
          '"duration":
            %d
                    ',
          self$`duration`
          )
        },
        if (!is.null(self$`height`)) {
          sprintf(
          '"height":
            %d
                    ',
          self$`height`
          )
        },
        if (!is.null(self$`width`)) {
          sprintf(
          '"width":
            %d
                    ',
          self$`width`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of VideoMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of VideoMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of VideoMetadata
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_type` <- this_object$`item_type`
      self$`cover_image_url` <- this_object$`cover_image_url`
      self$`video_url` <- this_object$`video_url`
      self$`duration` <- this_object$`duration`
      self$`height` <- this_object$`height`
      self$`width` <- this_object$`width`
      self
    },
    #' Validate JSON input with respect to VideoMetadata
    #'
    #' @description
    #' Validate JSON input with respect to VideoMetadata and throw an exception if invalid
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
    #' @return String representation of VideoMetadata
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
# VideoMetadata$unlock()
#
## Below is an example to define the print function
# VideoMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VideoMetadata$lock()

