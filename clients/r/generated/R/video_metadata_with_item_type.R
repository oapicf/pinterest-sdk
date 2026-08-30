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
#' @field item_type Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload. character
#' @field video_url Video url (720p).  **Note:** This field is limited and not available to all apps. character [optional]
#' @field video_url_hls Video url (HLS).  **Note:** This field is limited and not available to all apps. character [optional]
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
    `video_url_hls` = NULL,
    `width` = NULL,

    #' @description
    #' Initialize a new VideoMetadataWithItemType class.
    #'
    #' @param item_type Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
    #' @param cover_image_url cover_image_url
    #' @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
    #' @param height Height (in pixels). Field maybe null after creation due to video processing time.
    #' @param video_url Video url (720p).  **Note:** This field is limited and not available to all apps.
    #' @param video_url_hls Video url (HLS).  **Note:** This field is limited and not available to all apps.
    #' @param width Width (in pixels). Field maybe null after creation due to video processing time.
    #' @param ... Other optional arguments.
    initialize = function(`item_type`, `cover_image_url` = NULL, `duration` = NULL, `height` = NULL, `video_url` = NULL, `video_url_hls` = NULL, `width` = NULL, ...) {
      if (!missing(`item_type`)) {
        if (!(`item_type` %in% c("video"))) {
          stop(paste("Error! \"", `item_type`, "\" cannot be assigned to `item_type`. Must be \"video\".", sep = ""))
        }
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
      if (!is.null(`duration`)) {
        self$`duration` <- `duration`
      }
      if (!is.null(`height`)) {
        if (!(is.numeric(`height`) && length(`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", `height`))
        }
        self$`height` <- `height`
      }
      if (!is.null(`video_url`)) {
        if (!(is.character(`video_url`) && length(`video_url`) == 1)) {
          stop(paste("Error! Invalid data for `video_url`. Must be a string:", `video_url`))
        }
        self$`video_url` <- `video_url`
      }
      if (!is.null(`video_url_hls`)) {
        if (!(is.character(`video_url_hls`) && length(`video_url_hls`) == 1)) {
          stop(paste("Error! Invalid data for `video_url_hls`. Must be a string:", `video_url_hls`))
        }
        self$`video_url_hls` <- `video_url_hls`
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
      if (!is.null(self$`video_url_hls`)) {
        VideoMetadataWithItemTypeObject[["video_url_hls"]] <-
          self$`video_url_hls`
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
        if (!is.null(this_object$`item_type`) && !(this_object$`item_type` %in% c("video"))) {
          stop(paste("Error! \"", this_object$`item_type`, "\" cannot be assigned to `item_type`. Must be \"video\".", sep = ""))
        }
        self$`item_type` <- this_object$`item_type`
      }
      if (!is.null(this_object$`video_url`)) {
        self$`video_url` <- this_object$`video_url`
      }
      if (!is.null(this_object$`video_url_hls`)) {
        self$`video_url_hls` <- this_object$`video_url_hls`
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
      if (!is.null(this_object$`item_type`) && !(this_object$`item_type` %in% c("video"))) {
        stop(paste("Error! \"", this_object$`item_type`, "\" cannot be assigned to `item_type`. Must be \"video\".", sep = ""))
      }
      self$`item_type` <- this_object$`item_type`
      self$`video_url` <- this_object$`video_url`
      self$`video_url_hls` <- this_object$`video_url_hls`
      self$`width` <- this_object$`width`
      self
    },

    #' @description
    #' Validate JSON input with respect to VideoMetadataWithItemType and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_type`
      if (!is.null(input_json$`item_type`)) {
        if (!(is.character(input_json$`item_type`) && length(input_json$`item_type`) == 1)) {
          stop(paste("Error! Invalid data for `item_type`. Must be a string:", input_json$`item_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VideoMetadataWithItemType: the required field `item_type` is missing."))
      }
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
      # check if the required `item_type` is null
      if (is.null(self$`item_type`)) {
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
      # check if the required `item_type` is null
      if (is.null(self$`item_type`)) {
        invalid_fields["item_type"] <- "Non-nullable required field `item_type` cannot be null."
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
# VideoMetadataWithItemType$unlock()
#
## Below is an example to define the print function
# VideoMetadataWithItemType$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VideoMetadataWithItemType$lock()

