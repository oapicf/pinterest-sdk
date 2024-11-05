#' Create a new Interest
#'
#' @description
#' Interest Class
#'
#' @docType class
#' @title Interest
#' @description Interest Class
#' @format An \code{R6Class} generator object
#' @field canonical_url  character [optional]
#' @field id  character [optional]
#' @field key  character [optional]
#' @field name  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Interest <- R6::R6Class(
  "Interest",
  public = list(
    `canonical_url` = NULL,
    `id` = NULL,
    `key` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new Interest class.
    #'
    #' @param canonical_url canonical_url
    #' @param id id
    #' @param key key
    #' @param name name
    #' @param ... Other optional arguments.
    initialize = function(`canonical_url` = NULL, `id` = NULL, `key` = NULL, `name` = NULL, ...) {
      if (!is.null(`canonical_url`)) {
        if (!(is.character(`canonical_url`) && length(`canonical_url`) == 1)) {
          stop(paste("Error! Invalid data for `canonical_url`. Must be a string:", `canonical_url`))
        }
        self$`canonical_url` <- `canonical_url`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`key`)) {
        if (!(is.character(`key`) && length(`key`) == 1)) {
          stop(paste("Error! Invalid data for `key`. Must be a string:", `key`))
        }
        self$`key` <- `key`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return Interest in JSON format
    toJSON = function() {
      InterestObject <- list()
      if (!is.null(self$`canonical_url`)) {
        InterestObject[["canonical_url"]] <-
          self$`canonical_url`
      }
      if (!is.null(self$`id`)) {
        InterestObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`key`)) {
        InterestObject[["key"]] <-
          self$`key`
      }
      if (!is.null(self$`name`)) {
        InterestObject[["name"]] <-
          self$`name`
      }
      InterestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of Interest
    #'
    #' @param input_json the JSON input
    #' @return the instance of Interest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`canonical_url`)) {
        self$`canonical_url` <- this_object$`canonical_url`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`key`)) {
        self$`key` <- this_object$`key`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return Interest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`canonical_url`)) {
          sprintf(
          '"canonical_url":
            "%s"
                    ',
          self$`canonical_url`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`key`)) {
          sprintf(
          '"key":
            "%s"
                    ',
          self$`key`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of Interest
    #'
    #' @param input_json the JSON input
    #' @return the instance of Interest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`canonical_url` <- this_object$`canonical_url`
      self$`id` <- this_object$`id`
      self$`key` <- this_object$`key`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to Interest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Interest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# Interest$unlock()
#
## Below is an example to define the print function
# Interest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Interest$lock()

