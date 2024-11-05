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

    #' @description
    #' Initialize a new AdsCreditRedeemResponse class.
    #'
    #' @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
    #' @param errorCode Error code type if error occurs
    #' @param errorMessage Reason for failure
    #' @param ... Other optional arguments.
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

    #' @description
    #' To JSON String
    #'
    #' @return AdsCreditRedeemResponse in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of AdsCreditRedeemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditRedeemResponse
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

    #' @description
    #' To JSON String
    #'
    #' @return AdsCreditRedeemResponse in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of AdsCreditRedeemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditRedeemResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`success` <- this_object$`success`
      self$`errorCode` <- this_object$`errorCode`
      self$`errorMessage` <- this_object$`errorMessage`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdsCreditRedeemResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsCreditRedeemResponse
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
# AdsCreditRedeemResponse$unlock()
#
## Below is an example to define the print function
# AdsCreditRedeemResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsCreditRedeemResponse$lock()

