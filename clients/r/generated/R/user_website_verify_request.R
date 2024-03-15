#' Create a new UserWebsiteVerifyRequest
#'
#' @description
#' User website verification request
#'
#' @docType class
#' @title UserWebsiteVerifyRequest
#' @description UserWebsiteVerifyRequest Class
#' @format An \code{R6Class} generator object
#' @field website  character [optional]
#' @field verification_method  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserWebsiteVerifyRequest <- R6::R6Class(
  "UserWebsiteVerifyRequest",
  public = list(
    `website` = NULL,
    `verification_method` = NULL,
    #' Initialize a new UserWebsiteVerifyRequest class.
    #'
    #' @description
    #' Initialize a new UserWebsiteVerifyRequest class.
    #'
    #' @param website website
    #' @param verification_method verification_method. Default to "METATAG".
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`website` = NULL, `verification_method` = "METATAG", ...) {
      if (!is.null(`website`)) {
        if (!(is.character(`website`) && length(`website`) == 1)) {
          stop(paste("Error! Invalid data for `website`. Must be a string:", `website`))
        }
        self$`website` <- `website`
      }
      if (!is.null(`verification_method`)) {
        if (!(`verification_method` %in% c("FILENAME", "METATAG", "DNSTXT"))) {
          stop(paste("Error! \"", `verification_method`, "\" cannot be assigned to `verification_method`. Must be \"FILENAME\", \"METATAG\", \"DNSTXT\".", sep = ""))
        }
        if (!(is.character(`verification_method`) && length(`verification_method`) == 1)) {
          stop(paste("Error! Invalid data for `verification_method`. Must be a string:", `verification_method`))
        }
        self$`verification_method` <- `verification_method`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UserWebsiteVerifyRequest in JSON format
    #' @export
    toJSON = function() {
      UserWebsiteVerifyRequestObject <- list()
      if (!is.null(self$`website`)) {
        UserWebsiteVerifyRequestObject[["website"]] <-
          self$`website`
      }
      if (!is.null(self$`verification_method`)) {
        UserWebsiteVerifyRequestObject[["verification_method"]] <-
          self$`verification_method`
      }
      UserWebsiteVerifyRequestObject
    },
    #' Deserialize JSON string into an instance of UserWebsiteVerifyRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteVerifyRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteVerifyRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`website`)) {
        self$`website` <- this_object$`website`
      }
      if (!is.null(this_object$`verification_method`)) {
        if (!is.null(this_object$`verification_method`) && !(this_object$`verification_method` %in% c("FILENAME", "METATAG", "DNSTXT"))) {
          stop(paste("Error! \"", this_object$`verification_method`, "\" cannot be assigned to `verification_method`. Must be \"FILENAME\", \"METATAG\", \"DNSTXT\".", sep = ""))
        }
        self$`verification_method` <- this_object$`verification_method`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UserWebsiteVerifyRequest in JSON format
    #' @export
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
        if (!is.null(self$`verification_method`)) {
          sprintf(
          '"verification_method":
            "%s"
                    ',
          self$`verification_method`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UserWebsiteVerifyRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteVerifyRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteVerifyRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`website` <- this_object$`website`
      if (!is.null(this_object$`verification_method`) && !(this_object$`verification_method` %in% c("FILENAME", "METATAG", "DNSTXT"))) {
        stop(paste("Error! \"", this_object$`verification_method`, "\" cannot be assigned to `verification_method`. Must be \"FILENAME\", \"METATAG\", \"DNSTXT\".", sep = ""))
      }
      self$`verification_method` <- this_object$`verification_method`
      self
    },
    #' Validate JSON input with respect to UserWebsiteVerifyRequest
    #'
    #' @description
    #' Validate JSON input with respect to UserWebsiteVerifyRequest and throw an exception if invalid
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
    #' @return String representation of UserWebsiteVerifyRequest
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
# UserWebsiteVerifyRequest$unlock()
#
## Below is an example to define the print function
# UserWebsiteVerifyRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserWebsiteVerifyRequest$lock()

