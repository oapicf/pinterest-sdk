#' Create a new PinMediaWithVideo
#'
#' @description
#' Pin with video.
#'
#' @docType class
#' @title PinMediaWithVideo
#' @description PinMediaWithVideo Class
#' @format An \code{R6Class} generator object
#' @field media_type  character [optional]
#' @field images  \link{PinMediaWithImageAllOfImages} [optional]
#' @field cover_image_url  character [optional]
#' @field video_url Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. character [optional]
#' @field duration Duration (in milliseconds) numeric [optional]
#' @field height Height (in pixels) integer [optional]
#' @field width Width (in pixels) integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaWithVideo <- R6::R6Class(
  "PinMediaWithVideo",
  inherit = PinMedia,
  public = list(
    `media_type` = NULL,
    `images` = NULL,
    `cover_image_url` = NULL,
    `video_url` = NULL,
    `duration` = NULL,
    `height` = NULL,
    `width` = NULL,

    #' @description
    #' Initialize a new PinMediaWithVideo class.
    #'
    #' @param media_type media_type
    #' @param images images
    #' @param cover_image_url cover_image_url
    #' @param video_url Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
    #' @param duration Duration (in milliseconds)
    #' @param height Height (in pixels)
    #' @param width Width (in pixels)
    #' @param ... Other optional arguments.
    initialize = function(`media_type` = NULL, `images` = NULL, `cover_image_url` = NULL, `video_url` = NULL, `duration` = NULL, `height` = NULL, `width` = NULL, ...) {
      if (!is.null(`media_type`)) {
        if (!(is.character(`media_type`) && length(`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", `media_type`))
        }
        self$`media_type` <- `media_type`
      }
      if (!is.null(`images`)) {
        stopifnot(R6::is.R6(`images`))
        self$`images` <- `images`
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

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaWithVideo in JSON format
    toJSON = function() {
      PinMediaWithVideoObject <- list()
      if (!is.null(self$`media_type`)) {
        PinMediaWithVideoObject[["media_type"]] <-
          self$`media_type`
      }
      if (!is.null(self$`images`)) {
        PinMediaWithVideoObject[["images"]] <-
          self$`images`$toJSON()
      }
      if (!is.null(self$`cover_image_url`)) {
        PinMediaWithVideoObject[["cover_image_url"]] <-
          self$`cover_image_url`
      }
      if (!is.null(self$`video_url`)) {
        PinMediaWithVideoObject[["video_url"]] <-
          self$`video_url`
      }
      if (!is.null(self$`duration`)) {
        PinMediaWithVideoObject[["duration"]] <-
          self$`duration`
      }
      if (!is.null(self$`height`)) {
        PinMediaWithVideoObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`width`)) {
        PinMediaWithVideoObject[["width"]] <-
          self$`width`
      }
      PinMediaWithVideoObject
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithVideo
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithVideo
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_type`)) {
        self$`media_type` <- this_object$`media_type`
      }
      if (!is.null(this_object$`images`)) {
        `images_object` <- PinMediaWithImageAllOfImages$new()
        `images_object`$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
        self$`images` <- `images_object`
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

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaWithVideo in JSON format
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
        if (!is.null(self$`images`)) {
          sprintf(
          '"images":
          %s
          ',
          jsonlite::toJSON(self$`images`$toJSON(), auto_unbox = TRUE, digits = NA)
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

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithVideo
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithVideo
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_type` <- this_object$`media_type`
      self$`images` <- PinMediaWithImageAllOfImages$new()$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
      self$`cover_image_url` <- this_object$`cover_image_url`
      self$`video_url` <- this_object$`video_url`
      self$`duration` <- this_object$`duration`
      self$`height` <- this_object$`height`
      self$`width` <- this_object$`width`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaWithVideo and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaWithVideo
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
# PinMediaWithVideo$unlock()
#
## Below is an example to define the print function
# PinMediaWithVideo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaWithVideo$lock()

