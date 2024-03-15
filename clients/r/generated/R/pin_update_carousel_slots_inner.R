#' Create a new PinUpdateCarouselSlotsInner
#'
#' @description
#' PinUpdateCarouselSlotsInner Class
#'
#' @docType class
#' @title PinUpdateCarouselSlotsInner
#' @description PinUpdateCarouselSlotsInner Class
#' @format An \code{R6Class} generator object
#' @field title Carousel Pin slot title. character [optional]
#' @field description Carousel Pin slot description. character [optional]
#' @field link Carousel Pin slot link. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinUpdateCarouselSlotsInner <- R6::R6Class(
  "PinUpdateCarouselSlotsInner",
  public = list(
    `title` = NULL,
    `description` = NULL,
    `link` = NULL,
    #' Initialize a new PinUpdateCarouselSlotsInner class.
    #'
    #' @description
    #' Initialize a new PinUpdateCarouselSlotsInner class.
    #'
    #' @param title Carousel Pin slot title.
    #' @param description Carousel Pin slot description.
    #' @param link Carousel Pin slot link.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`title` = NULL, `description` = NULL, `link` = NULL, ...) {
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
    #' @return PinUpdateCarouselSlotsInner in JSON format
    #' @export
    toJSON = function() {
      PinUpdateCarouselSlotsInnerObject <- list()
      if (!is.null(self$`title`)) {
        PinUpdateCarouselSlotsInnerObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        PinUpdateCarouselSlotsInnerObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        PinUpdateCarouselSlotsInnerObject[["link"]] <-
          self$`link`
      }
      PinUpdateCarouselSlotsInnerObject
    },
    #' Deserialize JSON string into an instance of PinUpdateCarouselSlotsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinUpdateCarouselSlotsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinUpdateCarouselSlotsInner
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
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinUpdateCarouselSlotsInner in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinUpdateCarouselSlotsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinUpdateCarouselSlotsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinUpdateCarouselSlotsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self
    },
    #' Validate JSON input with respect to PinUpdateCarouselSlotsInner
    #'
    #' @description
    #' Validate JSON input with respect to PinUpdateCarouselSlotsInner and throw an exception if invalid
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
    #' @return String representation of PinUpdateCarouselSlotsInner
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
# PinUpdateCarouselSlotsInner$unlock()
#
## Below is an example to define the print function
# PinUpdateCarouselSlotsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinUpdateCarouselSlotsInner$lock()

