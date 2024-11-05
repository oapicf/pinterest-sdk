#' Create a new TermsOfService
#'
#' @description
#' TermsOfService Class
#'
#' @docType class
#' @title TermsOfService
#' @description TermsOfService Class
#' @format An \code{R6Class} generator object
#' @field id The ID of the terms of service character [optional]
#' @field html The terms of service content character [optional]
#' @field has_accepted Whether the ad account has accepted terms of service. character [optional]
#' @field ad_account_id The ID of the ad account. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TermsOfService <- R6::R6Class(
  "TermsOfService",
  public = list(
    `id` = NULL,
    `html` = NULL,
    `has_accepted` = NULL,
    `ad_account_id` = NULL,

    #' @description
    #' Initialize a new TermsOfService class.
    #'
    #' @param id The ID of the terms of service
    #' @param html The terms of service content
    #' @param has_accepted Whether the ad account has accepted terms of service.
    #' @param ad_account_id The ID of the ad account.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `html` = NULL, `has_accepted` = NULL, `ad_account_id` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`html`)) {
        if (!(is.character(`html`) && length(`html`) == 1)) {
          stop(paste("Error! Invalid data for `html`. Must be a string:", `html`))
        }
        self$`html` <- `html`
      }
      if (!is.null(`has_accepted`)) {
        if (!(is.logical(`has_accepted`) && length(`has_accepted`) == 1)) {
          stop(paste("Error! Invalid data for `has_accepted`. Must be a boolean:", `has_accepted`))
        }
        self$`has_accepted` <- `has_accepted`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TermsOfService in JSON format
    toJSON = function() {
      TermsOfServiceObject <- list()
      if (!is.null(self$`id`)) {
        TermsOfServiceObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`html`)) {
        TermsOfServiceObject[["html"]] <-
          self$`html`
      }
      if (!is.null(self$`has_accepted`)) {
        TermsOfServiceObject[["has_accepted"]] <-
          self$`has_accepted`
      }
      if (!is.null(self$`ad_account_id`)) {
        TermsOfServiceObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      TermsOfServiceObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TermsOfService
    #'
    #' @param input_json the JSON input
    #' @return the instance of TermsOfService
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`html`)) {
        self$`html` <- this_object$`html`
      }
      if (!is.null(this_object$`has_accepted`)) {
        self$`has_accepted` <- this_object$`has_accepted`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TermsOfService in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`html`)) {
          sprintf(
          '"html":
            "%s"
                    ',
          self$`html`
          )
        },
        if (!is.null(self$`has_accepted`)) {
          sprintf(
          '"has_accepted":
            %s
                    ',
          tolower(self$`has_accepted`)
          )
        },
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TermsOfService
    #'
    #' @param input_json the JSON input
    #' @return the instance of TermsOfService
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`html` <- this_object$`html`
      self$`has_accepted` <- this_object$`has_accepted`
      self$`ad_account_id` <- this_object$`ad_account_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to TermsOfService and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TermsOfService
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
# TermsOfService$unlock()
#
## Below is an example to define the print function
# TermsOfService$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TermsOfService$lock()

