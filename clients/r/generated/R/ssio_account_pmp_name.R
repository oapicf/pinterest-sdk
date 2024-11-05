#' Create a new SSIOAccountPMPName
#'
#' @description
#' SSIOAccountPMPName Class
#'
#' @docType class
#' @title SSIOAccountPMPName
#' @description SSIOAccountPMPName Class
#' @format An \code{R6Class} generator object
#' @field name Display name character [optional]
#' @field id Salesforce id for PMP character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOAccountPMPName <- R6::R6Class(
  "SSIOAccountPMPName",
  public = list(
    `name` = NULL,
    `id` = NULL,

    #' @description
    #' Initialize a new SSIOAccountPMPName class.
    #'
    #' @param name Display name
    #' @param id Salesforce id for PMP
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `id` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return SSIOAccountPMPName in JSON format
    toJSON = function() {
      SSIOAccountPMPNameObject <- list()
      if (!is.null(self$`name`)) {
        SSIOAccountPMPNameObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`id`)) {
        SSIOAccountPMPNameObject[["id"]] <-
          self$`id`
      }
      SSIOAccountPMPNameObject
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOAccountPMPName
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccountPMPName
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return SSIOAccountPMPName in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOAccountPMPName
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccountPMPName
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to SSIOAccountPMPName and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOAccountPMPName
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# SSIOAccountPMPName$unlock()
#
## Below is an example to define the print function
# SSIOAccountPMPName$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOAccountPMPName$lock()

