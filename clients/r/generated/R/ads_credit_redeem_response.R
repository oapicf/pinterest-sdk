#' Create a new AdsCreditRedeemResponse
#'
#' @description
#' AdsCreditRedeemResponse Class
#'
#' @docType class
#' @title AdsCreditRedeemResponse
#' @description AdsCreditRedeemResponse Class
#' @format An \code{R6Class} generator object
#' @field success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). character [optional]
#' @field errorCode Error code type if error occurs integer [optional]
#' @field errorMessage Reason for failure character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsCreditRedeemResponse <- R6::R6Class(
  "AdsCreditRedeemResponse",
  public = list(
    `success` = NULL,
    `errorCode` = NULL,
    `errorMessage` = NULL,
    #' Initialize a new AdsCreditRedeemResponse class.
    #'
    #' @description
    #' Initialize a new AdsCreditRedeemResponse class.
    #'
    #' @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
    #' @param errorCode Error code type if error occurs
    #' @param errorMessage Reason for failure
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`success` = NULL, `errorCode` = NULL, `errorMessage` = NULL, ...) {
      if (!is.null(`success`)) {
        if (!(is.logical(`success`) && length(`success`) == 1)) {
          stop(paste("Error! Invalid data for `success`. Must be a boolean:", `success`))
        }
        self$`success` <- `success`
      }
      if (!is.null(`errorCode`)) {
        if (!(is.numeric(`errorCode`) && length(`errorCode`) == 1)) {
          stop(paste("Error! Invalid data for `errorCode`. Must be an integer:", `errorCode`))
        }
        self$`errorCode` <- `errorCode`
      }
      if (!is.null(`errorMessage`)) {
        if (!(is.character(`errorMessage`) && length(`errorMessage`) == 1)) {
          stop(paste("Error! Invalid data for `errorMessage`. Must be a string:", `errorMessage`))
        }
        self$`errorMessage` <- `errorMessage`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsCreditRedeemResponse in JSON format
    #' @export
    toJSON = function() {
      AdsCreditRedeemResponseObject <- list()
      if (!is.null(self$`success`)) {
        AdsCreditRedeemResponseObject[["success"]] <-
          self$`success`
      }
      if (!is.null(self$`errorCode`)) {
        AdsCreditRedeemResponseObject[["errorCode"]] <-
          self$`errorCode`
      }
      if (!is.null(self$`errorMessage`)) {
        AdsCreditRedeemResponseObject[["errorMessage"]] <-
          self$`errorMessage`
      }
      AdsCreditRedeemResponseObject
    },
    #' Deserialize JSON string into an instance of AdsCreditRedeemResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsCreditRedeemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditRedeemResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`success`)) {
        self$`success` <- this_object$`success`
      }
      if (!is.null(this_object$`errorCode`)) {
        self$`errorCode` <- this_object$`errorCode`
      }
      if (!is.null(this_object$`errorMessage`)) {
        self$`errorMessage` <- this_object$`errorMessage`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsCreditRedeemResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`success`)) {
          sprintf(
          '"success":
            %s
                    ',
          tolower(self$`success`)
          )
        },
        if (!is.null(self$`errorCode`)) {
          sprintf(
          '"errorCode":
            %d
                    ',
          self$`errorCode`
          )
        },
        if (!is.null(self$`errorMessage`)) {
          sprintf(
          '"errorMessage":
            "%s"
                    ',
          self$`errorMessage`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdsCreditRedeemResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsCreditRedeemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditRedeemResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`success` <- this_object$`success`
      self$`errorCode` <- this_object$`errorCode`
      self$`errorMessage` <- this_object$`errorMessage`
      self
    },
    #' Validate JSON input with respect to AdsCreditRedeemResponse
    #'
    #' @description
    #' Validate JSON input with respect to AdsCreditRedeemResponse and throw an exception if invalid
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
    #' @return String representation of AdsCreditRedeemResponse
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
# AdsCreditRedeemResponse$unlock()
#
## Below is an example to define the print function
# AdsCreditRedeemResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsCreditRedeemResponse$lock()

