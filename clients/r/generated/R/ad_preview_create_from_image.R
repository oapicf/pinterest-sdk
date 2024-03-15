#' Create a new AdPreviewCreateFromImage
#'
#' @description
#' AdPreviewCreateFromImage Class
#'
#' @docType class
#' @title AdPreviewCreateFromImage
#' @description AdPreviewCreateFromImage Class
#' @format An \code{R6Class} generator object
#' @field image_url Image URL. character
#' @field title Title displayed below ad. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdPreviewCreateFromImage <- R6::R6Class(
  "AdPreviewCreateFromImage",
  public = list(
    `image_url` = NULL,
    `title` = NULL,
    #' Initialize a new AdPreviewCreateFromImage class.
    #'
    #' @description
    #' Initialize a new AdPreviewCreateFromImage class.
    #'
    #' @param image_url Image URL.
    #' @param title Title displayed below ad.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`image_url`, `title`, ...) {
      if (!missing(`image_url`)) {
        if (!(is.character(`image_url`) && length(`image_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_url`. Must be a string:", `image_url`))
        }
        self$`image_url` <- `image_url`
      }
      if (!missing(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdPreviewCreateFromImage in JSON format
    #' @export
    toJSON = function() {
      AdPreviewCreateFromImageObject <- list()
      if (!is.null(self$`image_url`)) {
        AdPreviewCreateFromImageObject[["image_url"]] <-
          self$`image_url`
      }
      if (!is.null(self$`title`)) {
        AdPreviewCreateFromImageObject[["title"]] <-
          self$`title`
      }
      AdPreviewCreateFromImageObject
    },
    #' Deserialize JSON string into an instance of AdPreviewCreateFromImage
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdPreviewCreateFromImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewCreateFromImage
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`image_url`)) {
        self$`image_url` <- this_object$`image_url`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdPreviewCreateFromImage in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`image_url`)) {
          sprintf(
          '"image_url":
            "%s"
                    ',
          self$`image_url`
          )
        },
        if (!is.null(self$`title`)) {
          sprintf(
          '"title":
            "%s"
                    ',
          self$`title`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdPreviewCreateFromImage
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdPreviewCreateFromImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewCreateFromImage
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`image_url` <- this_object$`image_url`
      self$`title` <- this_object$`title`
      self
    },
    #' Validate JSON input with respect to AdPreviewCreateFromImage
    #'
    #' @description
    #' Validate JSON input with respect to AdPreviewCreateFromImage and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `image_url`
      if (!is.null(input_json$`image_url`)) {
        if (!(is.character(input_json$`image_url`) && length(input_json$`image_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_url`. Must be a string:", input_json$`image_url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPreviewCreateFromImage: the required field `image_url` is missing."))
      }
      # check the required field `title`
      if (!is.null(input_json$`title`)) {
        if (!(is.character(input_json$`title`) && length(input_json$`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", input_json$`title`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPreviewCreateFromImage: the required field `title` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdPreviewCreateFromImage
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
      # check if the required `image_url` is null
      if (is.null(self$`image_url`)) {
        return(FALSE)
      }

      # check if the required `title` is null
      if (is.null(self$`title`)) {
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
      # check if the required `image_url` is null
      if (is.null(self$`image_url`)) {
        invalid_fields["image_url"] <- "Non-nullable required field `image_url` cannot be null."
      }

      # check if the required `title` is null
      if (is.null(self$`title`)) {
        invalid_fields["title"] <- "Non-nullable required field `title` cannot be null."
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
# AdPreviewCreateFromImage$unlock()
#
## Below is an example to define the print function
# AdPreviewCreateFromImage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPreviewCreateFromImage$lock()

