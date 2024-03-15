#' Create a new PinMediaSourceImagesURLItemsInner
#'
#' @description
#' PinMediaSourceImagesURLItemsInner Class
#'
#' @docType class
#' @title PinMediaSourceImagesURLItemsInner
#' @description PinMediaSourceImagesURLItemsInner Class
#' @format An \code{R6Class} generator object
#' @field title  character [optional]
#' @field description  character [optional]
#' @field link Destination link for the image. character [optional]
#' @field url URL of image to upload. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceImagesURLItemsInner <- R6::R6Class(
  "PinMediaSourceImagesURLItemsInner",
  public = list(
    `title` = NULL,
    `description` = NULL,
    `link` = NULL,
    `url` = NULL,
    #' Initialize a new PinMediaSourceImagesURLItemsInner class.
    #'
    #' @description
    #' Initialize a new PinMediaSourceImagesURLItemsInner class.
    #'
    #' @param url URL of image to upload.
    #' @param title title
    #' @param description description
    #' @param link Destination link for the image.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`url`, `title` = NULL, `description` = NULL, `link` = NULL, ...) {
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImagesURLItemsInner in JSON format
    #' @export
    toJSON = function() {
      PinMediaSourceImagesURLItemsInnerObject <- list()
      if (!is.null(self$`title`)) {
        PinMediaSourceImagesURLItemsInnerObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        PinMediaSourceImagesURLItemsInnerObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        PinMediaSourceImagesURLItemsInnerObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`url`)) {
        PinMediaSourceImagesURLItemsInnerObject[["url"]] <-
          self$`url`
      }
      PinMediaSourceImagesURLItemsInnerObject
    },
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURLItemsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURLItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesURLItemsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImagesURLItemsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`title`)) {
          sprintf(
          '"title":
            "%s"
                    ',
          self$`title`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
            "%s"
                    ',
          self$`link`
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
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURLItemsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURLItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesURLItemsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self$`url` <- this_object$`url`
      self
    },
    #' Validate JSON input with respect to PinMediaSourceImagesURLItemsInner
    #'
    #' @description
    #' Validate JSON input with respect to PinMediaSourceImagesURLItemsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesURLItemsInner: the required field `url` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceImagesURLItemsInner
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
      # check if the required `url` is null
      if (is.null(self$`url`)) {
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
      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
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
# PinMediaSourceImagesURLItemsInner$unlock()
#
## Below is an example to define the print function
# PinMediaSourceImagesURLItemsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceImagesURLItemsInner$lock()

