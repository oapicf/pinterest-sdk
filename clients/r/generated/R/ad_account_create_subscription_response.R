#' Create a new AdAccountCreateSubscriptionResponse
#'
#' @description
#' AdAccountCreateSubscriptionResponse Class
#'
#' @docType class
#' @title AdAccountCreateSubscriptionResponse
#' @description AdAccountCreateSubscriptionResponse Class
#' @format An \code{R6Class} generator object
#' @field id Subscription ID. character [optional]
#' @field cryptographic_key Base64 encoded key for client to decrypt lead data. character [optional]
#' @field cryptographic_algorithm Lead data encryption algorithm. character [optional]
#' @field created_time Subscription creation time. Unix timestamp in milliseconds. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountCreateSubscriptionResponse <- R6::R6Class(
  "AdAccountCreateSubscriptionResponse",
  public = list(
    `id` = NULL,
    `cryptographic_key` = NULL,
    `cryptographic_algorithm` = NULL,
    `created_time` = NULL,

    #' @description
    #' Initialize a new AdAccountCreateSubscriptionResponse class.
    #'
    #' @param id Subscription ID.
    #' @param cryptographic_key Base64 encoded key for client to decrypt lead data.
    #' @param cryptographic_algorithm Lead data encryption algorithm.
    #' @param created_time Subscription creation time. Unix timestamp in milliseconds.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `cryptographic_key` = NULL, `cryptographic_algorithm` = NULL, `created_time` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`cryptographic_key`)) {
        if (!(is.character(`cryptographic_key`) && length(`cryptographic_key`) == 1)) {
          stop(paste("Error! Invalid data for `cryptographic_key`. Must be a string:", `cryptographic_key`))
        }
        self$`cryptographic_key` <- `cryptographic_key`
      }
      if (!is.null(`cryptographic_algorithm`)) {
        if (!(is.character(`cryptographic_algorithm`) && length(`cryptographic_algorithm`) == 1)) {
          stop(paste("Error! Invalid data for `cryptographic_algorithm`. Must be a string:", `cryptographic_algorithm`))
        }
        self$`cryptographic_algorithm` <- `cryptographic_algorithm`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdAccountCreateSubscriptionResponse in JSON format
    toJSON = function() {
      AdAccountCreateSubscriptionResponseObject <- list()
      if (!is.null(self$`id`)) {
        AdAccountCreateSubscriptionResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`cryptographic_key`)) {
        AdAccountCreateSubscriptionResponseObject[["cryptographic_key"]] <-
          self$`cryptographic_key`
      }
      if (!is.null(self$`cryptographic_algorithm`)) {
        AdAccountCreateSubscriptionResponseObject[["cryptographic_algorithm"]] <-
          self$`cryptographic_algorithm`
      }
      if (!is.null(self$`created_time`)) {
        AdAccountCreateSubscriptionResponseObject[["created_time"]] <-
          self$`created_time`
      }
      AdAccountCreateSubscriptionResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountCreateSubscriptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountCreateSubscriptionResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`cryptographic_key`)) {
        self$`cryptographic_key` <- this_object$`cryptographic_key`
      }
      if (!is.null(this_object$`cryptographic_algorithm`)) {
        self$`cryptographic_algorithm` <- this_object$`cryptographic_algorithm`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdAccountCreateSubscriptionResponse in JSON format
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
        if (!is.null(self$`cryptographic_key`)) {
          sprintf(
          '"cryptographic_key":
            "%s"
                    ',
          self$`cryptographic_key`
          )
        },
        if (!is.null(self$`cryptographic_algorithm`)) {
          sprintf(
          '"cryptographic_algorithm":
            "%s"
                    ',
          self$`cryptographic_algorithm`
          )
        },
        if (!is.null(self$`created_time`)) {
          sprintf(
          '"created_time":
            %d
                    ',
          self$`created_time`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountCreateSubscriptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountCreateSubscriptionResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`cryptographic_key` <- this_object$`cryptographic_key`
      self$`cryptographic_algorithm` <- this_object$`cryptographic_algorithm`
      self$`created_time` <- this_object$`created_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdAccountCreateSubscriptionResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccountCreateSubscriptionResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# AdAccountCreateSubscriptionResponse$unlock()
#
## Below is an example to define the print function
# AdAccountCreateSubscriptionResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountCreateSubscriptionResponse$lock()

