#' Create a new SSIOAccountAddress
#'
#' @description
#' SSIOAccountAddress Class
#'
#' @docType class
#' @title SSIOAccountAddress
#' @description SSIOAccountAddress Class
#' @format An \code{R6Class} generator object
#' @field display Address display character [optional]
#' @field purpose Purpose for which the address is used, usually Billing or Businness character [optional]
#' @field address_id Salesforce id for address character [optional]
#' @field order_legal_entity Legal entity for this insertion order character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOAccountAddress <- R6::R6Class(
  "SSIOAccountAddress",
  public = list(
    `display` = NULL,
    `purpose` = NULL,
    `address_id` = NULL,
    `order_legal_entity` = NULL,

    #' @description
    #' Initialize a new SSIOAccountAddress class.
    #'
    #' @param display Address display
    #' @param purpose Purpose for which the address is used, usually Billing or Businness
    #' @param address_id Salesforce id for address
    #' @param order_legal_entity Legal entity for this insertion order
    #' @param ... Other optional arguments.
    initialize = function(`display` = NULL, `purpose` = NULL, `address_id` = NULL, `order_legal_entity` = NULL, ...) {
      if (!is.null(`display`)) {
        if (!(is.character(`display`) && length(`display`) == 1)) {
          stop(paste("Error! Invalid data for `display`. Must be a string:", `display`))
        }
        self$`display` <- `display`
      }
      if (!is.null(`purpose`)) {
        if (!(is.character(`purpose`) && length(`purpose`) == 1)) {
          stop(paste("Error! Invalid data for `purpose`. Must be a string:", `purpose`))
        }
        self$`purpose` <- `purpose`
      }
      if (!is.null(`address_id`)) {
        if (!(is.character(`address_id`) && length(`address_id`) == 1)) {
          stop(paste("Error! Invalid data for `address_id`. Must be a string:", `address_id`))
        }
        self$`address_id` <- `address_id`
      }
      if (!is.null(`order_legal_entity`)) {
        if (!(is.character(`order_legal_entity`) && length(`order_legal_entity`) == 1)) {
          stop(paste("Error! Invalid data for `order_legal_entity`. Must be a string:", `order_legal_entity`))
        }
        self$`order_legal_entity` <- `order_legal_entity`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return SSIOAccountAddress in JSON format
    toJSON = function() {
      SSIOAccountAddressObject <- list()
      if (!is.null(self$`display`)) {
        SSIOAccountAddressObject[["display"]] <-
          self$`display`
      }
      if (!is.null(self$`purpose`)) {
        SSIOAccountAddressObject[["purpose"]] <-
          self$`purpose`
      }
      if (!is.null(self$`address_id`)) {
        SSIOAccountAddressObject[["address_id"]] <-
          self$`address_id`
      }
      if (!is.null(self$`order_legal_entity`)) {
        SSIOAccountAddressObject[["order_legal_entity"]] <-
          self$`order_legal_entity`
      }
      SSIOAccountAddressObject
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOAccountAddress
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccountAddress
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`display`)) {
        self$`display` <- this_object$`display`
      }
      if (!is.null(this_object$`purpose`)) {
        self$`purpose` <- this_object$`purpose`
      }
      if (!is.null(this_object$`address_id`)) {
        self$`address_id` <- this_object$`address_id`
      }
      if (!is.null(this_object$`order_legal_entity`)) {
        self$`order_legal_entity` <- this_object$`order_legal_entity`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return SSIOAccountAddress in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`display`)) {
          sprintf(
          '"display":
            "%s"
                    ',
          self$`display`
          )
        },
        if (!is.null(self$`purpose`)) {
          sprintf(
          '"purpose":
            "%s"
                    ',
          self$`purpose`
          )
        },
        if (!is.null(self$`address_id`)) {
          sprintf(
          '"address_id":
            "%s"
                    ',
          self$`address_id`
          )
        },
        if (!is.null(self$`order_legal_entity`)) {
          sprintf(
          '"order_legal_entity":
            "%s"
                    ',
          self$`order_legal_entity`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOAccountAddress
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccountAddress
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`display` <- this_object$`display`
      self$`purpose` <- this_object$`purpose`
      self$`address_id` <- this_object$`address_id`
      self$`order_legal_entity` <- this_object$`order_legal_entity`
      self
    },

    #' @description
    #' Validate JSON input with respect to SSIOAccountAddress and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOAccountAddress
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
# SSIOAccountAddress$unlock()
#
## Below is an example to define the print function
# SSIOAccountAddress$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOAccountAddress$lock()

