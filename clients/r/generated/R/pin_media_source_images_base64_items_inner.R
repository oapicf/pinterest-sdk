#' Create a new PinMediaSourceImagesBase64ItemsInner
#'
#' @description
#' PinMediaSourceImagesBase64ItemsInner Class
#'
#' @docType class
#' @title PinMediaSourceImagesBase64ItemsInner
#' @description PinMediaSourceImagesBase64ItemsInner Class
#' @format An \code{R6Class} generator object
#' @field title  character [optional]
#' @field description  character [optional]
#' @field link Destination link for the image. character [optional]
#' @field content_type  character
#' @field data Image to upload as base64 string. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceImagesBase64ItemsInner <- R6::R6Class(
  "PinMediaSourceImagesBase64ItemsInner",
  public = list(
    `title` = NULL,
    `description` = NULL,
    `link` = NULL,
    `content_type` = NULL,
    `data` = NULL,
    #' Initialize a new PinMediaSourceImagesBase64ItemsInner class.
    #'
    #' @description
    #' Initialize a new PinMediaSourceImagesBase64ItemsInner class.
    #'
    #' @param content_type content_type
    #' @param data Image to upload as base64 string.
    #' @param title title
    #' @param description description
    #' @param link Destination link for the image.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`content_type`, `data`, `title` = NULL, `description` = NULL, `link` = NULL, ...) {
      if (!missing(`content_type`)) {
        if (!(`content_type` %in% c("image/jpeg", "image/png"))) {
          stop(paste("Error! \"", `content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
        }
        if (!(is.character(`content_type`) && length(`content_type`) == 1)) {
          stop(paste("Error! Invalid data for `content_type`. Must be a string:", `content_type`))
        }
        self$`content_type` <- `content_type`
      }
      if (!missing(`data`)) {
        if (!(is.character(`data`) && length(`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", `data`))
        }
        self$`data` <- `data`
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
    #' @return PinMediaSourceImagesBase64ItemsInner in JSON format
    #' @export
    toJSON = function() {
      PinMediaSourceImagesBase64ItemsInnerObject <- list()
      if (!is.null(self$`title`)) {
        PinMediaSourceImagesBase64ItemsInnerObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        PinMediaSourceImagesBase64ItemsInnerObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        PinMediaSourceImagesBase64ItemsInnerObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`content_type`)) {
        PinMediaSourceImagesBase64ItemsInnerObject[["content_type"]] <-
          self$`content_type`
      }
      if (!is.null(self$`data`)) {
        PinMediaSourceImagesBase64ItemsInnerObject[["data"]] <-
          self$`data`
      }
      PinMediaSourceImagesBase64ItemsInnerObject
    },
    #' Deserialize JSON string into an instance of PinMediaSourceImagesBase64ItemsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesBase64ItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesBase64ItemsInner
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
      if (!is.null(this_object$`content_type`)) {
        if (!is.null(this_object$`content_type`) && !(this_object$`content_type` %in% c("image/jpeg", "image/png"))) {
          stop(paste("Error! \"", this_object$`content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
        }
        self$`content_type` <- this_object$`content_type`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- this_object$`data`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImagesBase64ItemsInner in JSON format
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
        if (!is.null(self$`content_type`)) {
          sprintf(
          '"content_type":
            "%s"
                    ',
          self$`content_type`
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
            "%s"
                    ',
          self$`data`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinMediaSourceImagesBase64ItemsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesBase64ItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesBase64ItemsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      if (!is.null(this_object$`content_type`) && !(this_object$`content_type` %in% c("image/jpeg", "image/png"))) {
        stop(paste("Error! \"", this_object$`content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
      }
      self$`content_type` <- this_object$`content_type`
      self$`data` <- this_object$`data`
      self
    },
    #' Validate JSON input with respect to PinMediaSourceImagesBase64ItemsInner
    #'
    #' @description
    #' Validate JSON input with respect to PinMediaSourceImagesBase64ItemsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `content_type`
      if (!is.null(input_json$`content_type`)) {
        if (!(is.character(input_json$`content_type`) && length(input_json$`content_type`) == 1)) {
          stop(paste("Error! Invalid data for `content_type`. Must be a string:", input_json$`content_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesBase64ItemsInner: the required field `content_type` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        if (!(is.character(input_json$`data`) && length(input_json$`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", input_json$`data`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesBase64ItemsInner: the required field `data` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceImagesBase64ItemsInner
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
      # check if the required `content_type` is null
      if (is.null(self$`content_type`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      if (!str_detect(self$`data`, "[a-zA-Z0-9+/=]+")) {
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
      # check if the required `content_type` is null
      if (is.null(self$`content_type`)) {
        invalid_fields["content_type"] <- "Non-nullable required field `content_type` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      if (!str_detect(self$`data`, "[a-zA-Z0-9+/=]+")) {
        invalid_fields["data"] <- "Invalid value for `data`, must conform to the pattern [a-zA-Z0-9+/=]+."
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
# PinMediaSourceImagesBase64ItemsInner$unlock()
#
## Below is an example to define the print function
# PinMediaSourceImagesBase64ItemsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceImagesBase64ItemsInner$lock()

