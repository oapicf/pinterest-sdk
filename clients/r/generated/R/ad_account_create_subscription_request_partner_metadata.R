#' Create a new AdAccountCreateSubscriptionRequestPartnerMetadata
#'
#' @description
#' Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
#'
#' @docType class
#' @title AdAccountCreateSubscriptionRequestPartnerMetadata
#' @description AdAccountCreateSubscriptionRequestPartnerMetadata Class
#' @format An \code{R6Class} generator object
#' @field subscriber_key Text field value that uniquely identifies a subscriber. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountCreateSubscriptionRequestPartnerMetadata <- R6::R6Class(
  "AdAccountCreateSubscriptionRequestPartnerMetadata",
  public = list(
    `subscriber_key` = NULL,

    #' @description
    #' Initialize a new AdAccountCreateSubscriptionRequestPartnerMetadata class.
    #'
    #' @param subscriber_key Text field value that uniquely identifies a subscriber.
    #' @param ... Other optional arguments.
    initialize = function(`subscriber_key` = NULL, ...) {
      if (!is.null(`subscriber_key`)) {
        if (!(is.character(`subscriber_key`) && length(`subscriber_key`) == 1)) {
          stop(paste("Error! Invalid data for `subscriber_key`. Must be a string:", `subscriber_key`))
        }
        self$`subscriber_key` <- `subscriber_key`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdAccountCreateSubscriptionRequestPartnerMetadata in JSON format
    toJSON = function() {
      AdAccountCreateSubscriptionRequestPartnerMetadataObject <- list()
      if (!is.null(self$`subscriber_key`)) {
        AdAccountCreateSubscriptionRequestPartnerMetadataObject[["subscriber_key"]] <-
          self$`subscriber_key`
      }
      AdAccountCreateSubscriptionRequestPartnerMetadataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountCreateSubscriptionRequestPartnerMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountCreateSubscriptionRequestPartnerMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`subscriber_key`)) {
        self$`subscriber_key` <- this_object$`subscriber_key`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdAccountCreateSubscriptionRequestPartnerMetadata in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`subscriber_key`)) {
          sprintf(
          '"subscriber_key":
            "%s"
                    ',
          self$`subscriber_key`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountCreateSubscriptionRequestPartnerMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountCreateSubscriptionRequestPartnerMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`subscriber_key` <- this_object$`subscriber_key`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdAccountCreateSubscriptionRequestPartnerMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccountCreateSubscriptionRequestPartnerMetadata
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
# AdAccountCreateSubscriptionRequestPartnerMetadata$unlock()
#
## Below is an example to define the print function
# AdAccountCreateSubscriptionRequestPartnerMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountCreateSubscriptionRequestPartnerMetadata$lock()

