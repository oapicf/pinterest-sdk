#' Create a new VideoMetadataWithItemType
#'
#' @description
#' VideoMetadataWithItemType Class
#'
#' @docType class
#' @title VideoMetadataWithItemType
#' @description VideoMetadataWithItemType Class
#' @format An \code{R6Class} generator object
#' @field cover_image_url  character [optional]
#' @field duration Duration (in miliseconds). Field maybe null after creation due to video processing time. numeric [optional]
#' @field height Height (in pixels). Field maybe null after creation due to video processing time. integer [optional]
#' @field item_type  character [optional]
#' @field video_url Video url (720p).  **Note:** This field is limited and not available to all apps. character [optional]
#' @field width Width (in pixels). Field maybe null after creation due to video processing time. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VideoMetadataWithItemType <- R6::R6Class(
  "VideoMetadataWithItemType",
  public = list(
    `cover_image_url` = NULL,
    `duration` = NULL,
    `height` = NULL,
    `item_type` = NULL,
    `video_url` = NULL,
    `width` = NULL,

    #' @description
    #' Initialize a new VideoMetadataWithItemType class.
    #'
    #' @param cover_image_url cover_image_url
    #' @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
    #' @param height Height (in pixels). Field maybe null after creation due to video processing time.
    #' @param item_type item_type
    #' @param video_url Video url (720p).  **Note:** This field is limited and not available to all apps.
    #' @param width Width (in pixels). Field maybe null after creation due to video processing time.
    #' @param ... Other optional arguments.
    initialize = function(`cover_image_url` = NULL, `duration` = NULL, `height` = NULL, `item_type` = NULL, `video_url` = NULL, `width` = NULL, ...) {
      if (!is.null(`cover_image_url`)) {
        if (!(is.character(`cover_image_url`) && length(`cover_image_url`) == 1)) {
          stop(paste("Error! Invalid data for `cover_image_url`. Must be a string:", `cover_image_url`))
        }
        self$`cover_image_url` <- `cover_image_url`
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
      if (!is.null(`item_type`)) {
        if (!(is.character(`item_type`) && length(`item_type`) == 1)) {
          stop(paste("Error! Invalid data for `item_type`. Must be a string:", `item_type`))
        }
        self$`item_type` <- `item_type`
      }
      if (!is.null(`video_url`)) {
        if (!(is.character(`video_url`) && length(`video_url`) == 1)) {
          stop(paste("Error! Invalid data for `video_url`. Must be a string:", `video_url`))
        }
        self$`video_url` <- `video_url`
      }
      if (!is.null(`width`)) {
        if (!(is.numeric(`width`) && length(`width`) == 1)) {
          stop(paste("Error! Invalid data for `width`. Must be an integer:", `width`))
        }
        self$`width` <- `width`
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
    #' @return VideoMetadataWithItemType as a base R list.
    #' @examples
    #' # convert array of VideoMetadataWithItemType (x) to a data frame
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
    #' Convert VideoMetadataWithItemType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VideoMetadataWithItemTypeObject <- list()
      if (!is.null(self$`cover_image_url`)) {
        VideoMetadataWithItemTypeObject[["cover_image_url"]] <-
          self$`cover_image_url`
      }
      if (!is.null(self$`duration`)) {
        VideoMetadataWithItemTypeObject[["duration"]] <-
          self$`duration`
      }
      if (!is.null(self$`height`)) {
        VideoMetadataWithItemTypeObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`item_type`)) {
        VideoMetadataWithItemTypeObject[["item_type"]] <-
          self$`item_type`
      }
      if (!is.null(self$`video_url`)) {
        VideoMetadataWithItemTypeObject[["video_url"]] <-
          self$`video_url`
      }
      if (!is.null(self$`width`)) {
        VideoMetadataWithItemTypeObject[["width"]] <-
          self$`width`
      }
      return(VideoMetadataWithItemTypeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VideoMetadataWithItemType
    #'
    #' @param input_json the JSON input
    #' @return the instance of VideoMetadataWithItemType
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cover_image_url`)) {
        self$`cover_image_url` <- this_object$`cover_image_url`
      }
      if (!is.null(this_object$`duration`)) {
        self$`duration` <- this_object$`duration`
      }
      if (!is.null(this_object$`height`)) {
        self$`height` <- this_object$`height`
      }
      if (!is.null(this_object$`item_type`)) {
        self$`item_type` <- this_object$`item_type`
      }
      if (!is.null(this_object$`video_url`)) {
        self$`video_url` <- this_object$`video_url`
      }
      if (!is.null(this_object$`width`)) {
        self$`width` <- this_object$`width`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VideoMetadataWithItemType in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VideoMetadataWithItemType
    #'
    #' @param input_json the JSON input
    #' @return the instance of VideoMetadataWithItemType
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cover_image_url` <- this_object$`cover_image_url`
      self$`duration` <- this_object$`duration`
      self$`height` <- this_object$`height`
      self$`item_type` <- this_object$`item_type`
      self$`video_url` <- this_object$`video_url`
      self$`width` <- this_object$`width`
      self
    },

    #' @description
    #' Validate JSON input with respect to VideoMetadataWithItemType and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VideoMetadataWithItemType
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
# VideoMetadataWithItemType$unlock()
#
## Below is an example to define the print function
# VideoMetadataWithItemType$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VideoMetadataWithItemType$lock()

