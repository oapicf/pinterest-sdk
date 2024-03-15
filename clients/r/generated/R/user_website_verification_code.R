#' Create a new UserWebsiteVerificationCode
#'
#' @description
#' UserWebsiteVerificationCode Class
#'
#' @docType class
#' @title UserWebsiteVerificationCode
#' @description UserWebsiteVerificationCode Class
#' @format An \code{R6Class} generator object
#' @field verification_code Code to check against the user claiming the website character [optional]
#' @field dns_txt_record DNS TXT record to check against for the website to be claimed character [optional]
#' @field metatag Metatag the verification process searchs for the website to be claimed character [optional]
#' @field filename File expected to find on the website being claimed character [optional]
#' @field file_content A full html file to upload to the website in order for it to be claimed character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserWebsiteVerificationCode <- R6::R6Class(
  "UserWebsiteVerificationCode",
  public = list(
    `verification_code` = NULL,
    `dns_txt_record` = NULL,
    `metatag` = NULL,
    `filename` = NULL,
    `file_content` = NULL,
    #' Initialize a new UserWebsiteVerificationCode class.
    #'
    #' @description
    #' Initialize a new UserWebsiteVerificationCode class.
    #'
    #' @param verification_code Code to check against the user claiming the website
    #' @param dns_txt_record DNS TXT record to check against for the website to be claimed
    #' @param metatag Metatag the verification process searchs for the website to be claimed
    #' @param filename File expected to find on the website being claimed
    #' @param file_content A full html file to upload to the website in order for it to be claimed
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`verification_code` = NULL, `dns_txt_record` = NULL, `metatag` = NULL, `filename` = NULL, `file_content` = NULL, ...) {
      if (!is.null(`verification_code`)) {
        if (!(is.character(`verification_code`) && length(`verification_code`) == 1)) {
          stop(paste("Error! Invalid data for `verification_code`. Must be a string:", `verification_code`))
        }
        self$`verification_code` <- `verification_code`
      }
      if (!is.null(`dns_txt_record`)) {
        if (!(is.character(`dns_txt_record`) && length(`dns_txt_record`) == 1)) {
          stop(paste("Error! Invalid data for `dns_txt_record`. Must be a string:", `dns_txt_record`))
        }
        self$`dns_txt_record` <- `dns_txt_record`
      }
      if (!is.null(`metatag`)) {
        if (!(is.character(`metatag`) && length(`metatag`) == 1)) {
          stop(paste("Error! Invalid data for `metatag`. Must be a string:", `metatag`))
        }
        self$`metatag` <- `metatag`
      }
      if (!is.null(`filename`)) {
        if (!(is.character(`filename`) && length(`filename`) == 1)) {
          stop(paste("Error! Invalid data for `filename`. Must be a string:", `filename`))
        }
        self$`filename` <- `filename`
      }
      if (!is.null(`file_content`)) {
        if (!(is.character(`file_content`) && length(`file_content`) == 1)) {
          stop(paste("Error! Invalid data for `file_content`. Must be a string:", `file_content`))
        }
        self$`file_content` <- `file_content`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UserWebsiteVerificationCode in JSON format
    #' @export
    toJSON = function() {
      UserWebsiteVerificationCodeObject <- list()
      if (!is.null(self$`verification_code`)) {
        UserWebsiteVerificationCodeObject[["verification_code"]] <-
          self$`verification_code`
      }
      if (!is.null(self$`dns_txt_record`)) {
        UserWebsiteVerificationCodeObject[["dns_txt_record"]] <-
          self$`dns_txt_record`
      }
      if (!is.null(self$`metatag`)) {
        UserWebsiteVerificationCodeObject[["metatag"]] <-
          self$`metatag`
      }
      if (!is.null(self$`filename`)) {
        UserWebsiteVerificationCodeObject[["filename"]] <-
          self$`filename`
      }
      if (!is.null(self$`file_content`)) {
        UserWebsiteVerificationCodeObject[["file_content"]] <-
          self$`file_content`
      }
      UserWebsiteVerificationCodeObject
    },
    #' Deserialize JSON string into an instance of UserWebsiteVerificationCode
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteVerificationCode
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteVerificationCode
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`verification_code`)) {
        self$`verification_code` <- this_object$`verification_code`
      }
      if (!is.null(this_object$`dns_txt_record`)) {
        self$`dns_txt_record` <- this_object$`dns_txt_record`
      }
      if (!is.null(this_object$`metatag`)) {
        self$`metatag` <- this_object$`metatag`
      }
      if (!is.null(this_object$`filename`)) {
        self$`filename` <- this_object$`filename`
      }
      if (!is.null(this_object$`file_content`)) {
        self$`file_content` <- this_object$`file_content`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UserWebsiteVerificationCode in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`verification_code`)) {
          sprintf(
          '"verification_code":
            "%s"
                    ',
          self$`verification_code`
          )
        },
        if (!is.null(self$`dns_txt_record`)) {
          sprintf(
          '"dns_txt_record":
            "%s"
                    ',
          self$`dns_txt_record`
          )
        },
        if (!is.null(self$`metatag`)) {
          sprintf(
          '"metatag":
            "%s"
                    ',
          self$`metatag`
          )
        },
        if (!is.null(self$`filename`)) {
          sprintf(
          '"filename":
            "%s"
                    ',
          self$`filename`
          )
        },
        if (!is.null(self$`file_content`)) {
          sprintf(
          '"file_content":
            "%s"
                    ',
          self$`file_content`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UserWebsiteVerificationCode
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteVerificationCode
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteVerificationCode
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`verification_code` <- this_object$`verification_code`
      self$`dns_txt_record` <- this_object$`dns_txt_record`
      self$`metatag` <- this_object$`metatag`
      self$`filename` <- this_object$`filename`
      self$`file_content` <- this_object$`file_content`
      self
    },
    #' Validate JSON input with respect to UserWebsiteVerificationCode
    #'
    #' @description
    #' Validate JSON input with respect to UserWebsiteVerificationCode and throw an exception if invalid
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
    #' @return String representation of UserWebsiteVerificationCode
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
# UserWebsiteVerificationCode$unlock()
#
## Below is an example to define the print function
# UserWebsiteVerificationCode$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserWebsiteVerificationCode$lock()

