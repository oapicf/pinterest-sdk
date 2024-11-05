#' Create a new BusinessAccessUserSummary
#'
#' @description
#' Metadata of the member/partner that has access to the asset.
#'
#' @docType class
#' @title BusinessAccessUserSummary
#' @description BusinessAccessUserSummary Class
#' @format An \code{R6Class} generator object
#' @field email Email of the business member/partner. character [optional]
#' @field id Unique identifier of the business member/partner. character [optional]
#' @field username Username of the business member/partner. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessAccessUserSummary <- R6::R6Class(
  "BusinessAccessUserSummary",
  public = list(
    `email` = NULL,
    `id` = NULL,
    `username` = NULL,

    #' @description
    #' Initialize a new BusinessAccessUserSummary class.
    #'
    #' @param email Email of the business member/partner.
    #' @param id Unique identifier of the business member/partner.
    #' @param username Username of the business member/partner.
    #' @param ... Other optional arguments.
    initialize = function(`email` = NULL, `id` = NULL, `username` = NULL, ...) {
      if (!is.null(`email`)) {
        if (!(is.character(`email`) && length(`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", `email`))
        }
        self$`email` <- `email`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessAccessUserSummary in JSON format
    toJSON = function() {
      BusinessAccessUserSummaryObject <- list()
      if (!is.null(self$`email`)) {
        BusinessAccessUserSummaryObject[["email"]] <-
          self$`email`
      }
      if (!is.null(self$`id`)) {
        BusinessAccessUserSummaryObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`username`)) {
        BusinessAccessUserSummaryObject[["username"]] <-
          self$`username`
      }
      BusinessAccessUserSummaryObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessAccessUserSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessAccessUserSummary
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`email`)) {
        self$`email` <- this_object$`email`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessAccessUserSummary in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`email`)) {
          sprintf(
          '"email":
            "%s"
                    ',
          self$`email`
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
        if (!is.null(self$`username`)) {
          sprintf(
          '"username":
            "%s"
                    ',
          self$`username`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessAccessUserSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessAccessUserSummary
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`email` <- this_object$`email`
      self$`id` <- this_object$`id`
      self$`username` <- this_object$`username`
      self
    },

    #' @description
    #' Validate JSON input with respect to BusinessAccessUserSummary and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BusinessAccessUserSummary
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`id`) > 20) {
        return(FALSE)
      }
      if (nchar(self$`id`) < 1) {
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
      if (nchar(self$`id`) > 20) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 20."
      }
      if (nchar(self$`id`) < 1) {
        invalid_fields["id"] <- "Invalid length for `id`, must be bigger than or equal to 1."
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
# BusinessAccessUserSummary$unlock()
#
## Below is an example to define the print function
# BusinessAccessUserSummary$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessAccessUserSummary$lock()

