#' Create a new ImageMetadata
#'
#' @description
#' ImageMetadata Class
#'
#' @docType class
#' @title ImageMetadata
#' @description ImageMetadata Class
#' @format An \code{R6Class} generator object
#' @field item_type  character [optional]
#' @field title  character [optional]
#' @field description  character [optional]
#' @field link  character [optional]
#' @field images  \link{ImageMetadataImages} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ImageMetadata <- R6::R6Class(
  "ImageMetadata",
  public = list(
    `item_type` = NULL,
    `title` = NULL,
    `description` = NULL,
    `link` = NULL,
    `images` = NULL,
    #' Initialize a new ImageMetadata class.
    #'
    #' @description
    #' Initialize a new ImageMetadata class.
    #'
    #' @param item_type item_type
    #' @param title title
    #' @param description description
    #' @param link link
    #' @param images images
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`item_type` = NULL, `title` = NULL, `description` = NULL, `link` = NULL, `images` = NULL, ...) {
      if (!is.null(`item_type`)) {
        if (!(is.character(`item_type`) && length(`item_type`) == 1)) {
          stop(paste("Error! Invalid data for `item_type`. Must be a string:", `item_type`))
        }
        self$`item_type` <- `item_type`
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
      if (!is.null(`images`)) {
        stopifnot(R6::is.R6(`images`))
        self$`images` <- `images`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ImageMetadata in JSON format
    #' @export
    toJSON = function() {
      ImageMetadataObject <- list()
      if (!is.null(self$`item_type`)) {
        ImageMetadataObject[["item_type"]] <-
          self$`item_type`
      }
      if (!is.null(self$`title`)) {
        ImageMetadataObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        ImageMetadataObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        ImageMetadataObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`images`)) {
        ImageMetadataObject[["images"]] <-
          self$`images`$toJSON()
      }
      ImageMetadataObject
    },
    #' Deserialize JSON string into an instance of ImageMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of ImageMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageMetadata
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_type`)) {
        self$`item_type` <- this_object$`item_type`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`images`)) {
        `images_object` <- ImageMetadataImages$new()
        `images_object`$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
        self$`images` <- `images_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ImageMetadata in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_type`)) {
          sprintf(
          '"item_type":
            "%s"
                    ',
          self$`item_type`
          )
        },
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
        if (!is.null(self$`images`)) {
          sprintf(
          '"images":
          %s
          ',
          jsonlite::toJSON(self$`images`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ImageMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of ImageMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageMetadata
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_type` <- this_object$`item_type`
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self$`images` <- ImageMetadataImages$new()$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ImageMetadata
    #'
    #' @description
    #' Validate JSON input with respect to ImageMetadata and throw an exception if invalid
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
    #' @return String representation of ImageMetadata
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
# ImageMetadata$unlock()
#
## Below is an example to define the print function
# ImageMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ImageMetadata$lock()

