#' Create a new ImageDetails
#'
#' @description
#' ImageDetails Class
#'
#' @docType class
#' @title ImageDetails
#' @description ImageDetails Class
#' @format An \code{R6Class} generator object
#' @field width  integer
#' @field height  integer
#' @field url  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ImageDetails <- R6::R6Class(
  "ImageDetails",
  public = list(
    `width` = NULL,
    `height` = NULL,
    `url` = NULL,

    #' @description
    #' Initialize a new ImageDetails class.
    #'
    #' @param width width
    #' @param height height
    #' @param url url
    #' @param ... Other optional arguments.
    initialize = function(`width`, `height`, `url`, ...) {
      if (!missing(`width`)) {
        if (!(is.numeric(`width`) && length(`width`) == 1)) {
          stop(paste("Error! Invalid data for `width`. Must be an integer:", `width`))
        }
        self$`width` <- `width`
      }
      if (!missing(`height`)) {
        if (!(is.numeric(`height`) && length(`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", `height`))
        }
        self$`height` <- `height`
      }
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ImageDetails in JSON format
    toJSON = function() {
      ImageDetailsObject <- list()
      if (!is.null(self$`width`)) {
        ImageDetailsObject[["width"]] <-
          self$`width`
      }
      if (!is.null(self$`height`)) {
        ImageDetailsObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`url`)) {
        ImageDetailsObject[["url"]] <-
          self$`url`
      }
      ImageDetailsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`width`)) {
        self$`width` <- this_object$`width`
      }
      if (!is.null(this_object$`height`)) {
        self$`height` <- this_object$`height`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ImageDetails in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`width`)) {
          sprintf(
          '"width":
            %d
                    ',
          self$`width`
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
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`width` <- this_object$`width`
      self$`height` <- this_object$`height`
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to ImageDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `width`
      if (!is.null(input_json$`width`)) {
        if (!(is.numeric(input_json$`width`) && length(input_json$`width`) == 1)) {
          stop(paste("Error! Invalid data for `width`. Must be an integer:", input_json$`width`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ImageDetails: the required field `width` is missing."))
      }
      # check the required field `height`
      if (!is.null(input_json$`height`)) {
        if (!(is.numeric(input_json$`height`) && length(input_json$`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", input_json$`height`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ImageDetails: the required field `height` is missing."))
      }
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ImageDetails: the required field `url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ImageDetails
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `width` is null
      if (is.null(self$`width`)) {
        return(FALSE)
      }

      if (self$`width` < 100) {
        return(FALSE)
      }

      if (self$`height` < 100) {
        return(FALSE)
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
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
      # check if the required `width` is null
      if (is.null(self$`width`)) {
        invalid_fields["width"] <- "Non-nullable required field `width` cannot be null."
      }

      if (self$`width` < 100) {
        invalid_fields["width"] <- "Invalid value for `width`, must be bigger than or equal to 100."
      }

      if (self$`height` < 100) {
        invalid_fields["height"] <- "Invalid value for `height`, must be bigger than or equal to 100."
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
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
# ImageDetails$unlock()
#
## Below is an example to define the print function
# ImageDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ImageDetails$lock()

