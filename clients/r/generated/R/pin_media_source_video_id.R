#' Create a new PinMediaSourceVideoID
#'
#' @description
#' Video ID-based media source.
#'
#' @docType class
#' @title PinMediaSourceVideoID
#' @description PinMediaSourceVideoID Class
#' @format An \code{R6Class} generator object
#' @field cover_image_content_type Content type for cover image Base64. \link{ContentType} [optional]
#' @field cover_image_data Cover image Base64. character [optional]
#' @field cover_image_key_frame_time Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. integer [optional]
#' @field cover_image_url Cover image URL. character [optional]
#' @field is_standard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. character [optional]
#' @field media_id  character
#' @field source_type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceVideoID <- R6::R6Class(
  "PinMediaSourceVideoID",
  public = list(
    `cover_image_content_type` = NULL,
    `cover_image_data` = NULL,
    `cover_image_key_frame_time` = NULL,
    `cover_image_url` = NULL,
    `is_standard` = NULL,
    `media_id` = NULL,
    `source_type` = NULL,

    #' @description
    #' Initialize a new PinMediaSourceVideoID class.
    #'
    #' @param media_id media_id
    #' @param source_type source_type
    #' @param cover_image_content_type Content type for cover image Base64.
    #' @param cover_image_data Cover image Base64.
    #' @param cover_image_key_frame_time Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
    #' @param cover_image_url Cover image URL.
    #' @param is_standard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.. Default to TRUE.
    #' @param ... Other optional arguments.
    initialize = function(`media_id`, `source_type`, `cover_image_content_type` = NULL, `cover_image_data` = NULL, `cover_image_key_frame_time` = NULL, `cover_image_url` = NULL, `is_standard` = TRUE, ...) {
      if (!missing(`media_id`)) {
        if (!(is.character(`media_id`) && length(`media_id`) == 1)) {
          stop(paste("Error! Invalid data for `media_id`. Must be a string:", `media_id`))
        }
        self$`media_id` <- `media_id`
      }
      if (!missing(`source_type`)) {
        if (!(`source_type` %in% c("video_id"))) {
          stop(paste("Error! \"", `source_type`, "\" cannot be assigned to `source_type`. Must be \"video_id\".", sep = ""))
        }
        if (!(is.character(`source_type`) && length(`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", `source_type`))
        }
        self$`source_type` <- `source_type`
      }
      if (!is.null(`cover_image_content_type`)) {
        if (!(`cover_image_content_type` %in% c())) {
          stop(paste("Error! \"", `cover_image_content_type`, "\" cannot be assigned to `cover_image_content_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`cover_image_content_type`))
        self$`cover_image_content_type` <- `cover_image_content_type`
      }
      if (!is.null(`cover_image_data`)) {
        if (!(is.character(`cover_image_data`) && length(`cover_image_data`) == 1)) {
          stop(paste("Error! Invalid data for `cover_image_data`. Must be a string:", `cover_image_data`))
        }
        self$`cover_image_data` <- `cover_image_data`
      }
      if (!is.null(`cover_image_key_frame_time`)) {
        if (!(is.numeric(`cover_image_key_frame_time`) && length(`cover_image_key_frame_time`) == 1)) {
          stop(paste("Error! Invalid data for `cover_image_key_frame_time`. Must be an integer:", `cover_image_key_frame_time`))
        }
        self$`cover_image_key_frame_time` <- `cover_image_key_frame_time`
      }
      if (!is.null(`cover_image_url`)) {
        if (!(is.character(`cover_image_url`) && length(`cover_image_url`) == 1)) {
          stop(paste("Error! Invalid data for `cover_image_url`. Must be a string:", `cover_image_url`))
        }
        self$`cover_image_url` <- `cover_image_url`
      }
      if (!is.null(`is_standard`)) {
        if (!(is.logical(`is_standard`) && length(`is_standard`) == 1)) {
          stop(paste("Error! Invalid data for `is_standard`. Must be a boolean:", `is_standard`))
        }
        self$`is_standard` <- `is_standard`
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
    #' @return PinMediaSourceVideoID as a base R list.
    #' @examples
    #' # convert array of PinMediaSourceVideoID (x) to a data frame
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
    #' Convert PinMediaSourceVideoID to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinMediaSourceVideoIDObject <- list()
      if (!is.null(self$`cover_image_content_type`)) {
        PinMediaSourceVideoIDObject[["cover_image_content_type"]] <-
          self$extractSimpleType(self$`cover_image_content_type`)
      }
      if (!is.null(self$`cover_image_data`)) {
        PinMediaSourceVideoIDObject[["cover_image_data"]] <-
          self$`cover_image_data`
      }
      if (!is.null(self$`cover_image_key_frame_time`)) {
        PinMediaSourceVideoIDObject[["cover_image_key_frame_time"]] <-
          self$`cover_image_key_frame_time`
      }
      if (!is.null(self$`cover_image_url`)) {
        PinMediaSourceVideoIDObject[["cover_image_url"]] <-
          self$`cover_image_url`
      }
      if (!is.null(self$`is_standard`)) {
        PinMediaSourceVideoIDObject[["is_standard"]] <-
          self$`is_standard`
      }
      if (!is.null(self$`media_id`)) {
        PinMediaSourceVideoIDObject[["media_id"]] <-
          self$`media_id`
      }
      if (!is.null(self$`source_type`)) {
        PinMediaSourceVideoIDObject[["source_type"]] <-
          self$`source_type`
      }
      return(PinMediaSourceVideoIDObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceVideoID
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceVideoID
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cover_image_content_type`)) {
        `cover_image_content_type_object` <- ContentType$new()
        `cover_image_content_type_object`$fromJSON(jsonlite::toJSON(this_object$`cover_image_content_type`, auto_unbox = TRUE, digits = NA))
        self$`cover_image_content_type` <- `cover_image_content_type_object`
      }
      if (!is.null(this_object$`cover_image_data`)) {
        self$`cover_image_data` <- this_object$`cover_image_data`
      }
      if (!is.null(this_object$`cover_image_key_frame_time`)) {
        self$`cover_image_key_frame_time` <- this_object$`cover_image_key_frame_time`
      }
      if (!is.null(this_object$`cover_image_url`)) {
        self$`cover_image_url` <- this_object$`cover_image_url`
      }
      if (!is.null(this_object$`is_standard`)) {
        self$`is_standard` <- this_object$`is_standard`
      }
      if (!is.null(this_object$`media_id`)) {
        self$`media_id` <- this_object$`media_id`
      }
      if (!is.null(this_object$`source_type`)) {
        if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("video_id"))) {
          stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"video_id\".", sep = ""))
        }
        self$`source_type` <- this_object$`source_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinMediaSourceVideoID in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceVideoID
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceVideoID
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cover_image_content_type` <- ContentType$new()$fromJSON(jsonlite::toJSON(this_object$`cover_image_content_type`, auto_unbox = TRUE, digits = NA))
      self$`cover_image_data` <- this_object$`cover_image_data`
      self$`cover_image_key_frame_time` <- this_object$`cover_image_key_frame_time`
      self$`cover_image_url` <- this_object$`cover_image_url`
      self$`is_standard` <- this_object$`is_standard`
      self$`media_id` <- this_object$`media_id`
      if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("video_id"))) {
        stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"video_id\".", sep = ""))
      }
      self$`source_type` <- this_object$`source_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaSourceVideoID and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `media_id`
      if (!is.null(input_json$`media_id`)) {
        if (!(is.character(input_json$`media_id`) && length(input_json$`media_id`) == 1)) {
          stop(paste("Error! Invalid data for `media_id`. Must be a string:", input_json$`media_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceVideoID: the required field `media_id` is missing."))
      }
      # check the required field `source_type`
      if (!is.null(input_json$`source_type`)) {
        if (!(is.character(input_json$`source_type`) && length(input_json$`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", input_json$`source_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceVideoID: the required field `source_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceVideoID
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`cover_image_key_frame_time` < 0) {
        return(FALSE)
      }

      # check if the required `media_id` is null
      if (is.null(self$`media_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`media_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
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
      if (self$`cover_image_key_frame_time` < 0) {
        invalid_fields["cover_image_key_frame_time"] <- "Invalid value for `cover_image_key_frame_time`, must be bigger than or equal to 0."
      }

      # check if the required `media_id` is null
      if (is.null(self$`media_id`)) {
        invalid_fields["media_id"] <- "Non-nullable required field `media_id` cannot be null."
      }

      if (!str_detect(self$`media_id`, "^\\d+$")) {
        invalid_fields["media_id"] <- "Invalid value for `media_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        invalid_fields["source_type"] <- "Non-nullable required field `source_type` cannot be null."
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
# PinMediaSourceVideoID$unlock()
#
## Below is an example to define the print function
# PinMediaSourceVideoID$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceVideoID$lock()

