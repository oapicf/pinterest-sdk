#' Create a new SummaryPin
#'
#' @description
#' Summarized pin information
#'
#' @docType class
#' @title SummaryPin
#' @description SummaryPin Class
#' @format An \code{R6Class} generator object
#' @field media  \link{SummaryPinMedia} [optional]
#' @field alt_text  character [optional]
#' @field link  character [optional]
#' @field title  character [optional]
#' @field description  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SummaryPin <- R6::R6Class(
  "SummaryPin",
  public = list(
    `media` = NULL,
    `alt_text` = NULL,
    `link` = NULL,
    `title` = NULL,
    `description` = NULL,
    #' Initialize a new SummaryPin class.
    #'
    #' @description
    #' Initialize a new SummaryPin class.
    #'
    #' @param media media
    #' @param alt_text alt_text
    #' @param link link
    #' @param title title
    #' @param description description
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`media` = NULL, `alt_text` = NULL, `link` = NULL, `title` = NULL, `description` = NULL, ...) {
      if (!is.null(`media`)) {
        stopifnot(R6::is.R6(`media`))
        self$`media` <- `media`
      }
      if (!is.null(`alt_text`)) {
        if (!(is.character(`alt_text`) && length(`alt_text`) == 1)) {
          stop(paste("Error! Invalid data for `alt_text`. Must be a string:", `alt_text`))
        }
        self$`alt_text` <- `alt_text`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SummaryPin in JSON format
    #' @export
    toJSON = function() {
      SummaryPinObject <- list()
      if (!is.null(self$`media`)) {
        SummaryPinObject[["media"]] <-
          self$`media`$toJSON()
      }
      if (!is.null(self$`alt_text`)) {
        SummaryPinObject[["alt_text"]] <-
          self$`alt_text`
      }
      if (!is.null(self$`link`)) {
        SummaryPinObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`title`)) {
        SummaryPinObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        SummaryPinObject[["description"]] <-
          self$`description`
      }
      SummaryPinObject
    },
    #' Deserialize JSON string into an instance of SummaryPin
    #'
    #' @description
    #' Deserialize JSON string into an instance of SummaryPin
    #'
    #' @param input_json the JSON input
    #' @return the instance of SummaryPin
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media`)) {
        `media_object` <- SummaryPinMedia$new()
        `media_object`$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
        self$`media` <- `media_object`
      }
      if (!is.null(this_object$`alt_text`)) {
        self$`alt_text` <- this_object$`alt_text`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SummaryPin in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`media`)) {
          sprintf(
          '"media":
          %s
          ',
          jsonlite::toJSON(self$`media`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`alt_text`)) {
          sprintf(
          '"alt_text":
            "%s"
                    ',
          self$`alt_text`
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SummaryPin
    #'
    #' @description
    #' Deserialize JSON string into an instance of SummaryPin
    #'
    #' @param input_json the JSON input
    #' @return the instance of SummaryPin
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media` <- SummaryPinMedia$new()$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
      self$`alt_text` <- this_object$`alt_text`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self
    },
    #' Validate JSON input with respect to SummaryPin
    #'
    #' @description
    #' Validate JSON input with respect to SummaryPin and throw an exception if invalid
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
    #' @return String representation of SummaryPin
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
      if (nchar(self$`alt_text`) > 500) {
        return(FALSE)
      }

      if (nchar(self$`link`) > 2048) {
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
      if (nchar(self$`alt_text`) > 500) {
        invalid_fields["alt_text"] <- "Invalid length for `alt_text`, must be smaller than or equal to 500."
      }

      if (nchar(self$`link`) > 2048) {
        invalid_fields["link"] <- "Invalid length for `link`, must be smaller than or equal to 2048."
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
# SummaryPin$unlock()
#
## Below is an example to define the print function
# SummaryPin$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SummaryPin$lock()

