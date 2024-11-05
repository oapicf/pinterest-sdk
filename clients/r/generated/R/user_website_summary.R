#' Create a new UserWebsiteSummary
#'
#' @description
#' UserWebsiteSummary Class
#'
#' @docType class
#' @title UserWebsiteSummary
#' @description UserWebsiteSummary Class
#' @format An \code{R6Class} generator object
#' @field website Website with path or domain only character [optional]
#' @field status Status of the verification process character [optional]
#' @field verified_at UTC timestamp when the verification happened - sometimes missing character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserWebsiteSummary <- R6::R6Class(
  "UserWebsiteSummary",
  public = list(
    `website` = NULL,
    `status` = NULL,
    `verified_at` = NULL,

    #' @description
    #' Initialize a new UserWebsiteSummary class.
    #'
    #' @param website Website with path or domain only
    #' @param status Status of the verification process
    #' @param verified_at UTC timestamp when the verification happened - sometimes missing
    #' @param ... Other optional arguments.
    initialize = function(`website` = NULL, `status` = NULL, `verified_at` = NULL, ...) {
      if (!is.null(`website`)) {
        if (!(is.character(`website`) && length(`website`) == 1)) {
          stop(paste("Error! Invalid data for `website`. Must be a string:", `website`))
        }
        self$`website` <- `website`
      }
      if (!is.null(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`verified_at`)) {
        if (!(is.character(`verified_at`) && length(`verified_at`) == 1)) {
          stop(paste("Error! Invalid data for `verified_at`. Must be a string:", `verified_at`))
        }
        self$`verified_at` <- `verified_at`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UserWebsiteSummary in JSON format
    toJSON = function() {
      UserWebsiteSummaryObject <- list()
      if (!is.null(self$`website`)) {
        UserWebsiteSummaryObject[["website"]] <-
          self$`website`
      }
      if (!is.null(self$`status`)) {
        UserWebsiteSummaryObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`verified_at`)) {
        UserWebsiteSummaryObject[["verified_at"]] <-
          self$`verified_at`
      }
      UserWebsiteSummaryObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteSummary
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`website`)) {
        self$`website` <- this_object$`website`
      }
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`verified_at`)) {
        self$`verified_at` <- this_object$`verified_at`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UserWebsiteSummary in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`website`)) {
          sprintf(
          '"website":
            "%s"
                    ',
          self$`website`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`verified_at`)) {
          sprintf(
          '"verified_at":
            "%s"
                    ',
          self$`verified_at`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteSummary
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`website` <- this_object$`website`
      self$`status` <- this_object$`status`
      self$`verified_at` <- this_object$`verified_at`
      self
    },

    #' @description
    #' Validate JSON input with respect to UserWebsiteSummary and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UserWebsiteSummary
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
# UserWebsiteSummary$unlock()
#
## Below is an example to define the print function
# UserWebsiteSummary$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserWebsiteSummary$lock()

