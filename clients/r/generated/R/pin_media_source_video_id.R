#' Create a new PinMediaSourceVideoID
#'
#' @description
#' Video ID-based media source
#'
#' @docType class
#' @title PinMediaSourceVideoID
#' @description PinMediaSourceVideoID Class
#' @format An \code{R6Class} generator object
#' @field source_type  character
#' @field cover_image_url Cover image url. character [optional]
#' @field cover_image_content_type Content type for cover image Base64. character [optional]
#' @field cover_image_data Cover image Base64. character [optional]
#' @field media_id  character
#' @field is_standard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceVideoID <- R6::R6Class(
  "PinMediaSourceVideoID",
  public = list(
    `source_type` = NULL,
    `cover_image_url` = NULL,
    `cover_image_content_type` = NULL,
    `cover_image_data` = NULL,
    `media_id` = NULL,
    `is_standard` = NULL,
    #' Initialize a new PinMediaSourceVideoID class.
    #'
    #' @description
    #' Initialize a new PinMediaSourceVideoID class.
    #'
    #' @param source_type source_type
    #' @param media_id media_id
    #' @param cover_image_url Cover image url.
    #' @param cover_image_content_type Content type for cover image Base64.
    #' @param cover_image_data Cover image Base64.
    #' @param is_standard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.. Default to TRUE.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`source_type`, `media_id`, `cover_image_url` = NULL, `cover_image_content_type` = NULL, `cover_image_data` = NULL, `is_standard` = TRUE, ...) {
      if (!missing(`source_type`)) {
        if (!(`source_type` %in% c("video_id"))) {
          stop(paste("Error! \"", `source_type`, "\" cannot be assigned to `source_type`. Must be \"video_id\".", sep = ""))
        }
        if (!(is.character(`source_type`) && length(`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", `source_type`))
        }
        self$`source_type` <- `source_type`
      }
      if (!missing(`media_id`)) {
        if (!(is.character(`media_id`) && length(`media_id`) == 1)) {
          stop(paste("Error! Invalid data for `media_id`. Must be a string:", `media_id`))
        }
        self$`media_id` <- `media_id`
      }
      if (!is.null(`cover_image_url`)) {
        if (!(is.character(`cover_image_url`) && length(`cover_image_url`) == 1)) {
          stop(paste("Error! Invalid data for `cover_image_url`. Must be a string:", `cover_image_url`))
        }
        self$`cover_image_url` <- `cover_image_url`
      }
      if (!is.null(`cover_image_content_type`)) {
        if (!(`cover_image_content_type` %in% c("image/jpeg", "image/png"))) {
          stop(paste("Error! \"", `cover_image_content_type`, "\" cannot be assigned to `cover_image_content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
        }
        if (!(is.character(`cover_image_content_type`) && length(`cover_image_content_type`) == 1)) {
          stop(paste("Error! Invalid data for `cover_image_content_type`. Must be a string:", `cover_image_content_type`))
        }
        self$`cover_image_content_type` <- `cover_image_content_type`
      }
      if (!is.null(`cover_image_data`)) {
        if (!(is.character(`cover_image_data`) && length(`cover_image_data`) == 1)) {
          stop(paste("Error! Invalid data for `cover_image_data`. Must be a string:", `cover_image_data`))
        }
        self$`cover_image_data` <- `cover_image_data`
      }
      if (!is.null(`is_standard`)) {
        if (!(is.logical(`is_standard`) && length(`is_standard`) == 1)) {
          stop(paste("Error! Invalid data for `is_standard`. Must be a boolean:", `is_standard`))
        }
        self$`is_standard` <- `is_standard`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceVideoID in JSON format
    #' @export
    toJSON = function() {
      PinMediaSourceVideoIDObject <- list()
      if (!is.null(self$`source_type`)) {
        PinMediaSourceVideoIDObject[["source_type"]] <-
          self$`source_type`
      }
      if (!is.null(self$`cover_image_url`)) {
        PinMediaSourceVideoIDObject[["cover_image_url"]] <-
          self$`cover_image_url`
      }
      if (!is.null(self$`cover_image_content_type`)) {
        PinMediaSourceVideoIDObject[["cover_image_content_type"]] <-
          self$`cover_image_content_type`
      }
      if (!is.null(self$`cover_image_data`)) {
        PinMediaSourceVideoIDObject[["cover_image_data"]] <-
          self$`cover_image_data`
      }
      if (!is.null(self$`media_id`)) {
        PinMediaSourceVideoIDObject[["media_id"]] <-
          self$`media_id`
      }
      if (!is.null(self$`is_standard`)) {
        PinMediaSourceVideoIDObject[["is_standard"]] <-
          self$`is_standard`
      }
      PinMediaSourceVideoIDObject
    },
    #' Deserialize JSON string into an instance of PinMediaSourceVideoID
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceVideoID
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceVideoID
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`)) {
        if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("video_id"))) {
          stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"video_id\".", sep = ""))
        }
        self$`source_type` <- this_object$`source_type`
      }
      if (!is.null(this_object$`cover_image_url`)) {
        self$`cover_image_url` <- this_object$`cover_image_url`
      }
      if (!is.null(this_object$`cover_image_content_type`)) {
        if (!is.null(this_object$`cover_image_content_type`) && !(this_object$`cover_image_content_type` %in% c("image/jpeg", "image/png"))) {
          stop(paste("Error! \"", this_object$`cover_image_content_type`, "\" cannot be assigned to `cover_image_content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
        }
        self$`cover_image_content_type` <- this_object$`cover_image_content_type`
      }
      if (!is.null(this_object$`cover_image_data`)) {
        self$`cover_image_data` <- this_object$`cover_image_data`
      }
      if (!is.null(this_object$`media_id`)) {
        self$`media_id` <- this_object$`media_id`
      }
      if (!is.null(this_object$`is_standard`)) {
        self$`is_standard` <- this_object$`is_standard`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceVideoID in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`source_type`)) {
          sprintf(
          '"source_type":
            "%s"
                    ',
          self$`source_type`
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
        if (!is.null(self$`cover_image_content_type`)) {
          sprintf(
          '"cover_image_content_type":
            "%s"
                    ',
          self$`cover_image_content_type`
          )
        },
        if (!is.null(self$`cover_image_data`)) {
          sprintf(
          '"cover_image_data":
            "%s"
                    ',
          self$`cover_image_data`
          )
        },
        if (!is.null(self$`media_id`)) {
          sprintf(
          '"media_id":
            "%s"
                    ',
          self$`media_id`
          )
        },
        if (!is.null(self$`is_standard`)) {
          sprintf(
          '"is_standard":
            %s
                    ',
          tolower(self$`is_standard`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinMediaSourceVideoID
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceVideoID
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceVideoID
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("video_id"))) {
        stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"video_id\".", sep = ""))
      }
      self$`source_type` <- this_object$`source_type`
      self$`cover_image_url` <- this_object$`cover_image_url`
      if (!is.null(this_object$`cover_image_content_type`) && !(this_object$`cover_image_content_type` %in% c("image/jpeg", "image/png"))) {
        stop(paste("Error! \"", this_object$`cover_image_content_type`, "\" cannot be assigned to `cover_image_content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
      }
      self$`cover_image_content_type` <- this_object$`cover_image_content_type`
      self$`cover_image_data` <- this_object$`cover_image_data`
      self$`media_id` <- this_object$`media_id`
      self$`is_standard` <- this_object$`is_standard`
      self
    },
    #' Validate JSON input with respect to PinMediaSourceVideoID
    #'
    #' @description
    #' Validate JSON input with respect to PinMediaSourceVideoID and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `source_type`
      if (!is.null(input_json$`source_type`)) {
        if (!(is.character(input_json$`source_type`) && length(input_json$`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", input_json$`source_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceVideoID: the required field `source_type` is missing."))
      }
      # check the required field `media_id`
      if (!is.null(input_json$`media_id`)) {
        if (!(is.character(input_json$`media_id`) && length(input_json$`media_id`) == 1)) {
          stop(paste("Error! Invalid data for `media_id`. Must be a string:", input_json$`media_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceVideoID: the required field `media_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceVideoID
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
      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        return(FALSE)
      }

      # check if the required `media_id` is null
      if (is.null(self$`media_id`)) {
        return(FALSE)
      }

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
      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        invalid_fields["source_type"] <- "Non-nullable required field `source_type` cannot be null."
      }

      # check if the required `media_id` is null
      if (is.null(self$`media_id`)) {
        invalid_fields["media_id"] <- "Non-nullable required field `media_id` cannot be null."
      }

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
# PinMediaSourceVideoID$unlock()
#
## Below is an example to define the print function
# PinMediaSourceVideoID$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceVideoID$lock()

