#' Create a new AdAccountGetSubscriptionResponse
#'
#' @description
#' AdAccountGetSubscriptionResponse Class
#'
#' @docType class
#' @title AdAccountGetSubscriptionResponse
#' @description AdAccountGetSubscriptionResponse Class
#' @format An \code{R6Class} generator object
#' @field lead_form_id Lead form ID. character [optional]
#' @field webhook_url Standard HTTPS webhook URL. character [optional]
#' @field id Subscription ID. character [optional]
#' @field user_account_id User account used to subscribe lead data. character [optional]
#' @field ad_account_id The Ad Account ID that this lead form belongs to. character [optional]
#' @field api_version API version. character [optional]
#' @field cryptographic_key Base64 encoded key for client to decrypt lead data. character [optional]
#' @field cryptographic_algorithm Lead data encryption algorithm. character [optional]
#' @field created_time Lead form creation time. Unix timestamp in milliseconds. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountGetSubscriptionResponse <- R6::R6Class(
  "AdAccountGetSubscriptionResponse",
  public = list(
    `lead_form_id` = NULL,
    `webhook_url` = NULL,
    `id` = NULL,
    `user_account_id` = NULL,
    `ad_account_id` = NULL,
    `api_version` = NULL,
    `cryptographic_key` = NULL,
    `cryptographic_algorithm` = NULL,
    `created_time` = NULL,
    #' Initialize a new AdAccountGetSubscriptionResponse class.
    #'
    #' @description
    #' Initialize a new AdAccountGetSubscriptionResponse class.
    #'
    #' @param lead_form_id Lead form ID.
    #' @param webhook_url Standard HTTPS webhook URL.
    #' @param id Subscription ID.
    #' @param user_account_id User account used to subscribe lead data.
    #' @param ad_account_id The Ad Account ID that this lead form belongs to.
    #' @param api_version API version.
    #' @param cryptographic_key Base64 encoded key for client to decrypt lead data.
    #' @param cryptographic_algorithm Lead data encryption algorithm.
    #' @param created_time Lead form creation time. Unix timestamp in milliseconds.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`lead_form_id` = NULL, `webhook_url` = NULL, `id` = NULL, `user_account_id` = NULL, `ad_account_id` = NULL, `api_version` = NULL, `cryptographic_key` = NULL, `cryptographic_algorithm` = NULL, `created_time` = NULL, ...) {
      if (!is.null(`lead_form_id`)) {
        if (!(is.character(`lead_form_id`) && length(`lead_form_id`) == 1)) {
          stop(paste("Error! Invalid data for `lead_form_id`. Must be a string:", `lead_form_id`))
        }
        self$`lead_form_id` <- `lead_form_id`
      }
      if (!is.null(`webhook_url`)) {
        if (!(is.character(`webhook_url`) && length(`webhook_url`) == 1)) {
          stop(paste("Error! Invalid data for `webhook_url`. Must be a string:", `webhook_url`))
        }
        self$`webhook_url` <- `webhook_url`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`user_account_id`)) {
        if (!(is.character(`user_account_id`) && length(`user_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_account_id`. Must be a string:", `user_account_id`))
        }
        self$`user_account_id` <- `user_account_id`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`api_version`)) {
        if (!(is.character(`api_version`) && length(`api_version`) == 1)) {
          stop(paste("Error! Invalid data for `api_version`. Must be a string:", `api_version`))
        }
        self$`api_version` <- `api_version`
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdAccountGetSubscriptionResponse in JSON format
    #' @export
    toJSON = function() {
      AdAccountGetSubscriptionResponseObject <- list()
      if (!is.null(self$`lead_form_id`)) {
        AdAccountGetSubscriptionResponseObject[["lead_form_id"]] <-
          self$`lead_form_id`
      }
      if (!is.null(self$`webhook_url`)) {
        AdAccountGetSubscriptionResponseObject[["webhook_url"]] <-
          self$`webhook_url`
      }
      if (!is.null(self$`id`)) {
        AdAccountGetSubscriptionResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`user_account_id`)) {
        AdAccountGetSubscriptionResponseObject[["user_account_id"]] <-
          self$`user_account_id`
      }
      if (!is.null(self$`ad_account_id`)) {
        AdAccountGetSubscriptionResponseObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`api_version`)) {
        AdAccountGetSubscriptionResponseObject[["api_version"]] <-
          self$`api_version`
      }
      if (!is.null(self$`cryptographic_key`)) {
        AdAccountGetSubscriptionResponseObject[["cryptographic_key"]] <-
          self$`cryptographic_key`
      }
      if (!is.null(self$`cryptographic_algorithm`)) {
        AdAccountGetSubscriptionResponseObject[["cryptographic_algorithm"]] <-
          self$`cryptographic_algorithm`
      }
      if (!is.null(self$`created_time`)) {
        AdAccountGetSubscriptionResponseObject[["created_time"]] <-
          self$`created_time`
      }
      AdAccountGetSubscriptionResponseObject
    },
    #' Deserialize JSON string into an instance of AdAccountGetSubscriptionResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdAccountGetSubscriptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountGetSubscriptionResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`lead_form_id`)) {
        self$`lead_form_id` <- this_object$`lead_form_id`
      }
      if (!is.null(this_object$`webhook_url`)) {
        self$`webhook_url` <- this_object$`webhook_url`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`user_account_id`)) {
        self$`user_account_id` <- this_object$`user_account_id`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`api_version`)) {
        self$`api_version` <- this_object$`api_version`
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdAccountGetSubscriptionResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`lead_form_id`)) {
          sprintf(
          '"lead_form_id":
            "%s"
                    ',
          self$`lead_form_id`
          )
        },
        if (!is.null(self$`webhook_url`)) {
          sprintf(
          '"webhook_url":
            "%s"
                    ',
          self$`webhook_url`
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
        if (!is.null(self$`user_account_id`)) {
          sprintf(
          '"user_account_id":
            "%s"
                    ',
          self$`user_account_id`
          )
        },
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
        if (!is.null(self$`api_version`)) {
          sprintf(
          '"api_version":
            "%s"
                    ',
          self$`api_version`
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
    #' Deserialize JSON string into an instance of AdAccountGetSubscriptionResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdAccountGetSubscriptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountGetSubscriptionResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`lead_form_id` <- this_object$`lead_form_id`
      self$`webhook_url` <- this_object$`webhook_url`
      self$`id` <- this_object$`id`
      self$`user_account_id` <- this_object$`user_account_id`
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`api_version` <- this_object$`api_version`
      self$`cryptographic_key` <- this_object$`cryptographic_key`
      self$`cryptographic_algorithm` <- this_object$`cryptographic_algorithm`
      self$`created_time` <- this_object$`created_time`
      self
    },
    #' Validate JSON input with respect to AdAccountGetSubscriptionResponse
    #'
    #' @description
    #' Validate JSON input with respect to AdAccountGetSubscriptionResponse and throw an exception if invalid
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
    #' @return String representation of AdAccountGetSubscriptionResponse
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
      if (!str_detect(self$`lead_form_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`user_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

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
      if (!str_detect(self$`lead_form_id`, "^\\d+$")) {
        invalid_fields["lead_form_id"] <- "Invalid value for `lead_form_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`user_account_id`, "^\\d+$")) {
        invalid_fields["user_account_id"] <- "Invalid value for `user_account_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

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
# AdAccountGetSubscriptionResponse$unlock()
#
## Below is an example to define the print function
# AdAccountGetSubscriptionResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountGetSubscriptionResponse$lock()

