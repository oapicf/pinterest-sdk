#' Create a new IntegrationLog
#'
#' @description
#' Schema for log sent from an integration application.
#'
#' @docType class
#' @title IntegrationLog
#' @description IntegrationLog Class
#' @format An \code{R6Class} generator object
#' @field client_timestamp Timestamp in milliseconds of when the log was executed at the client. integer
#' @field event_type Log event type character
#' @field log_level Log level type character
#' @field external_business_id  character [optional]
#' @field advertiser_id  character [optional]
#' @field merchant_id  character [optional]
#' @field tag_id  character [optional]
#' @field feed_profile_id  character [optional]
#' @field message Explanation of the event that occured. character [optional]
#' @field app_version_number Version number of the integration application. character [optional]
#' @field platform_version_number Version number of the platform the integration application is running on. character [optional]
#' @field error  \link{IntegrationLogClientError} [optional]
#' @field request  \link{IntegrationLogClientRequest} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLog <- R6::R6Class(
  "IntegrationLog",
  public = list(
    `client_timestamp` = NULL,
    `event_type` = NULL,
    `log_level` = NULL,
    `external_business_id` = NULL,
    `advertiser_id` = NULL,
    `merchant_id` = NULL,
    `tag_id` = NULL,
    `feed_profile_id` = NULL,
    `message` = NULL,
    `app_version_number` = NULL,
    `platform_version_number` = NULL,
    `error` = NULL,
    `request` = NULL,
    #' Initialize a new IntegrationLog class.
    #'
    #' @description
    #' Initialize a new IntegrationLog class.
    #'
    #' @param client_timestamp Timestamp in milliseconds of when the log was executed at the client.
    #' @param event_type Log event type
    #' @param log_level Log level type
    #' @param external_business_id external_business_id
    #' @param advertiser_id advertiser_id
    #' @param merchant_id merchant_id
    #' @param tag_id tag_id
    #' @param feed_profile_id feed_profile_id
    #' @param message Explanation of the event that occured.
    #' @param app_version_number Version number of the integration application.
    #' @param platform_version_number Version number of the platform the integration application is running on.
    #' @param error error
    #' @param request request
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`client_timestamp`, `event_type`, `log_level`, `external_business_id` = NULL, `advertiser_id` = NULL, `merchant_id` = NULL, `tag_id` = NULL, `feed_profile_id` = NULL, `message` = NULL, `app_version_number` = NULL, `platform_version_number` = NULL, `error` = NULL, `request` = NULL, ...) {
      if (!missing(`client_timestamp`)) {
        if (!(is.numeric(`client_timestamp`) && length(`client_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `client_timestamp`. Must be an integer:", `client_timestamp`))
        }
        self$`client_timestamp` <- `client_timestamp`
      }
      if (!missing(`event_type`)) {
        if (!(`event_type` %in% c("APP", "API"))) {
          stop(paste("Error! \"", `event_type`, "\" cannot be assigned to `event_type`. Must be \"APP\", \"API\".", sep = ""))
        }
        if (!(is.character(`event_type`) && length(`event_type`) == 1)) {
          stop(paste("Error! Invalid data for `event_type`. Must be a string:", `event_type`))
        }
        self$`event_type` <- `event_type`
      }
      if (!missing(`log_level`)) {
        if (!(`log_level` %in% c("INFO", "WARN", "ERROR"))) {
          stop(paste("Error! \"", `log_level`, "\" cannot be assigned to `log_level`. Must be \"INFO\", \"WARN\", \"ERROR\".", sep = ""))
        }
        if (!(is.character(`log_level`) && length(`log_level`) == 1)) {
          stop(paste("Error! Invalid data for `log_level`. Must be a string:", `log_level`))
        }
        self$`log_level` <- `log_level`
      }
      if (!is.null(`external_business_id`)) {
        if (!(is.character(`external_business_id`) && length(`external_business_id`) == 1)) {
          stop(paste("Error! Invalid data for `external_business_id`. Must be a string:", `external_business_id`))
        }
        self$`external_business_id` <- `external_business_id`
      }
      if (!is.null(`advertiser_id`)) {
        if (!(is.character(`advertiser_id`) && length(`advertiser_id`) == 1)) {
          stop(paste("Error! Invalid data for `advertiser_id`. Must be a string:", `advertiser_id`))
        }
        self$`advertiser_id` <- `advertiser_id`
      }
      if (!is.null(`merchant_id`)) {
        if (!(is.character(`merchant_id`) && length(`merchant_id`) == 1)) {
          stop(paste("Error! Invalid data for `merchant_id`. Must be a string:", `merchant_id`))
        }
        self$`merchant_id` <- `merchant_id`
      }
      if (!is.null(`tag_id`)) {
        if (!(is.character(`tag_id`) && length(`tag_id`) == 1)) {
          stop(paste("Error! Invalid data for `tag_id`. Must be a string:", `tag_id`))
        }
        self$`tag_id` <- `tag_id`
      }
      if (!is.null(`feed_profile_id`)) {
        if (!(is.character(`feed_profile_id`) && length(`feed_profile_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_profile_id`. Must be a string:", `feed_profile_id`))
        }
        self$`feed_profile_id` <- `feed_profile_id`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`app_version_number`)) {
        if (!(is.character(`app_version_number`) && length(`app_version_number`) == 1)) {
          stop(paste("Error! Invalid data for `app_version_number`. Must be a string:", `app_version_number`))
        }
        self$`app_version_number` <- `app_version_number`
      }
      if (!is.null(`platform_version_number`)) {
        if (!(is.character(`platform_version_number`) && length(`platform_version_number`) == 1)) {
          stop(paste("Error! Invalid data for `platform_version_number`. Must be a string:", `platform_version_number`))
        }
        self$`platform_version_number` <- `platform_version_number`
      }
      if (!is.null(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
      }
      if (!is.null(`request`)) {
        stopifnot(R6::is.R6(`request`))
        self$`request` <- `request`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLog in JSON format
    #' @export
    toJSON = function() {
      IntegrationLogObject <- list()
      if (!is.null(self$`client_timestamp`)) {
        IntegrationLogObject[["client_timestamp"]] <-
          self$`client_timestamp`
      }
      if (!is.null(self$`event_type`)) {
        IntegrationLogObject[["event_type"]] <-
          self$`event_type`
      }
      if (!is.null(self$`log_level`)) {
        IntegrationLogObject[["log_level"]] <-
          self$`log_level`
      }
      if (!is.null(self$`external_business_id`)) {
        IntegrationLogObject[["external_business_id"]] <-
          self$`external_business_id`
      }
      if (!is.null(self$`advertiser_id`)) {
        IntegrationLogObject[["advertiser_id"]] <-
          self$`advertiser_id`
      }
      if (!is.null(self$`merchant_id`)) {
        IntegrationLogObject[["merchant_id"]] <-
          self$`merchant_id`
      }
      if (!is.null(self$`tag_id`)) {
        IntegrationLogObject[["tag_id"]] <-
          self$`tag_id`
      }
      if (!is.null(self$`feed_profile_id`)) {
        IntegrationLogObject[["feed_profile_id"]] <-
          self$`feed_profile_id`
      }
      if (!is.null(self$`message`)) {
        IntegrationLogObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`app_version_number`)) {
        IntegrationLogObject[["app_version_number"]] <-
          self$`app_version_number`
      }
      if (!is.null(self$`platform_version_number`)) {
        IntegrationLogObject[["platform_version_number"]] <-
          self$`platform_version_number`
      }
      if (!is.null(self$`error`)) {
        IntegrationLogObject[["error"]] <-
          self$`error`$toJSON()
      }
      if (!is.null(self$`request`)) {
        IntegrationLogObject[["request"]] <-
          self$`request`$toJSON()
      }
      IntegrationLogObject
    },
    #' Deserialize JSON string into an instance of IntegrationLog
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLog
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLog
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`client_timestamp`)) {
        self$`client_timestamp` <- this_object$`client_timestamp`
      }
      if (!is.null(this_object$`event_type`)) {
        if (!is.null(this_object$`event_type`) && !(this_object$`event_type` %in% c("APP", "API"))) {
          stop(paste("Error! \"", this_object$`event_type`, "\" cannot be assigned to `event_type`. Must be \"APP\", \"API\".", sep = ""))
        }
        self$`event_type` <- this_object$`event_type`
      }
      if (!is.null(this_object$`log_level`)) {
        if (!is.null(this_object$`log_level`) && !(this_object$`log_level` %in% c("INFO", "WARN", "ERROR"))) {
          stop(paste("Error! \"", this_object$`log_level`, "\" cannot be assigned to `log_level`. Must be \"INFO\", \"WARN\", \"ERROR\".", sep = ""))
        }
        self$`log_level` <- this_object$`log_level`
      }
      if (!is.null(this_object$`external_business_id`)) {
        self$`external_business_id` <- this_object$`external_business_id`
      }
      if (!is.null(this_object$`advertiser_id`)) {
        self$`advertiser_id` <- this_object$`advertiser_id`
      }
      if (!is.null(this_object$`merchant_id`)) {
        self$`merchant_id` <- this_object$`merchant_id`
      }
      if (!is.null(this_object$`tag_id`)) {
        self$`tag_id` <- this_object$`tag_id`
      }
      if (!is.null(this_object$`feed_profile_id`)) {
        self$`feed_profile_id` <- this_object$`feed_profile_id`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`app_version_number`)) {
        self$`app_version_number` <- this_object$`app_version_number`
      }
      if (!is.null(this_object$`platform_version_number`)) {
        self$`platform_version_number` <- this_object$`platform_version_number`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- IntegrationLogClientError$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      if (!is.null(this_object$`request`)) {
        `request_object` <- IntegrationLogClientRequest$new()
        `request_object`$fromJSON(jsonlite::toJSON(this_object$`request`, auto_unbox = TRUE, digits = NA))
        self$`request` <- `request_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLog in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`client_timestamp`)) {
          sprintf(
          '"client_timestamp":
            %d
                    ',
          self$`client_timestamp`
          )
        },
        if (!is.null(self$`event_type`)) {
          sprintf(
          '"event_type":
            "%s"
                    ',
          self$`event_type`
          )
        },
        if (!is.null(self$`log_level`)) {
          sprintf(
          '"log_level":
            "%s"
                    ',
          self$`log_level`
          )
        },
        if (!is.null(self$`external_business_id`)) {
          sprintf(
          '"external_business_id":
            "%s"
                    ',
          self$`external_business_id`
          )
        },
        if (!is.null(self$`advertiser_id`)) {
          sprintf(
          '"advertiser_id":
            "%s"
                    ',
          self$`advertiser_id`
          )
        },
        if (!is.null(self$`merchant_id`)) {
          sprintf(
          '"merchant_id":
            "%s"
                    ',
          self$`merchant_id`
          )
        },
        if (!is.null(self$`tag_id`)) {
          sprintf(
          '"tag_id":
            "%s"
                    ',
          self$`tag_id`
          )
        },
        if (!is.null(self$`feed_profile_id`)) {
          sprintf(
          '"feed_profile_id":
            "%s"
                    ',
          self$`feed_profile_id`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        },
        if (!is.null(self$`app_version_number`)) {
          sprintf(
          '"app_version_number":
            "%s"
                    ',
          self$`app_version_number`
          )
        },
        if (!is.null(self$`platform_version_number`)) {
          sprintf(
          '"platform_version_number":
            "%s"
                    ',
          self$`platform_version_number`
          )
        },
        if (!is.null(self$`error`)) {
          sprintf(
          '"error":
          %s
          ',
          jsonlite::toJSON(self$`error`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`request`)) {
          sprintf(
          '"request":
          %s
          ',
          jsonlite::toJSON(self$`request`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of IntegrationLog
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLog
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLog
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`client_timestamp` <- this_object$`client_timestamp`
      if (!is.null(this_object$`event_type`) && !(this_object$`event_type` %in% c("APP", "API"))) {
        stop(paste("Error! \"", this_object$`event_type`, "\" cannot be assigned to `event_type`. Must be \"APP\", \"API\".", sep = ""))
      }
      self$`event_type` <- this_object$`event_type`
      if (!is.null(this_object$`log_level`) && !(this_object$`log_level` %in% c("INFO", "WARN", "ERROR"))) {
        stop(paste("Error! \"", this_object$`log_level`, "\" cannot be assigned to `log_level`. Must be \"INFO\", \"WARN\", \"ERROR\".", sep = ""))
      }
      self$`log_level` <- this_object$`log_level`
      self$`external_business_id` <- this_object$`external_business_id`
      self$`advertiser_id` <- this_object$`advertiser_id`
      self$`merchant_id` <- this_object$`merchant_id`
      self$`tag_id` <- this_object$`tag_id`
      self$`feed_profile_id` <- this_object$`feed_profile_id`
      self$`message` <- this_object$`message`
      self$`app_version_number` <- this_object$`app_version_number`
      self$`platform_version_number` <- this_object$`platform_version_number`
      self$`error` <- IntegrationLogClientError$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self$`request` <- IntegrationLogClientRequest$new()$fromJSON(jsonlite::toJSON(this_object$`request`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to IntegrationLog
    #'
    #' @description
    #' Validate JSON input with respect to IntegrationLog and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `client_timestamp`
      if (!is.null(input_json$`client_timestamp`)) {
        if (!(is.numeric(input_json$`client_timestamp`) && length(input_json$`client_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `client_timestamp`. Must be an integer:", input_json$`client_timestamp`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLog: the required field `client_timestamp` is missing."))
      }
      # check the required field `event_type`
      if (!is.null(input_json$`event_type`)) {
        if (!(is.character(input_json$`event_type`) && length(input_json$`event_type`) == 1)) {
          stop(paste("Error! Invalid data for `event_type`. Must be a string:", input_json$`event_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLog: the required field `event_type` is missing."))
      }
      # check the required field `log_level`
      if (!is.null(input_json$`log_level`)) {
        if (!(is.character(input_json$`log_level`) && length(input_json$`log_level`) == 1)) {
          stop(paste("Error! Invalid data for `log_level`. Must be a string:", input_json$`log_level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLog: the required field `log_level` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLog
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
      # check if the required `client_timestamp` is null
      if (is.null(self$`client_timestamp`)) {
        return(FALSE)
      }

      # check if the required `event_type` is null
      if (is.null(self$`event_type`)) {
        return(FALSE)
      }

      # check if the required `log_level` is null
      if (is.null(self$`log_level`)) {
        return(FALSE)
      }

      if (nchar(self$`external_business_id`) > 2048) {
        return(FALSE)
      }

      if (nchar(self$`advertiser_id`) > 128) {
        return(FALSE)
      }

      if (nchar(self$`merchant_id`) > 128) {
        return(FALSE)
      }

      if (nchar(self$`tag_id`) > 128) {
        return(FALSE)
      }

      if (nchar(self$`feed_profile_id`) > 128) {
        return(FALSE)
      }

      if (nchar(self$`message`) > 2048) {
        return(FALSE)
      }

      if (nchar(self$`app_version_number`) > 20) {
        return(FALSE)
      }

      if (nchar(self$`platform_version_number`) > 20) {
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
      # check if the required `client_timestamp` is null
      if (is.null(self$`client_timestamp`)) {
        invalid_fields["client_timestamp"] <- "Non-nullable required field `client_timestamp` cannot be null."
      }

      # check if the required `event_type` is null
      if (is.null(self$`event_type`)) {
        invalid_fields["event_type"] <- "Non-nullable required field `event_type` cannot be null."
      }

      # check if the required `log_level` is null
      if (is.null(self$`log_level`)) {
        invalid_fields["log_level"] <- "Non-nullable required field `log_level` cannot be null."
      }

      if (nchar(self$`external_business_id`) > 2048) {
        invalid_fields["external_business_id"] <- "Invalid length for `external_business_id`, must be smaller than or equal to 2048."
      }

      if (nchar(self$`advertiser_id`) > 128) {
        invalid_fields["advertiser_id"] <- "Invalid length for `advertiser_id`, must be smaller than or equal to 128."
      }

      if (nchar(self$`merchant_id`) > 128) {
        invalid_fields["merchant_id"] <- "Invalid length for `merchant_id`, must be smaller than or equal to 128."
      }

      if (nchar(self$`tag_id`) > 128) {
        invalid_fields["tag_id"] <- "Invalid length for `tag_id`, must be smaller than or equal to 128."
      }

      if (nchar(self$`feed_profile_id`) > 128) {
        invalid_fields["feed_profile_id"] <- "Invalid length for `feed_profile_id`, must be smaller than or equal to 128."
      }

      if (nchar(self$`message`) > 2048) {
        invalid_fields["message"] <- "Invalid length for `message`, must be smaller than or equal to 2048."
      }

      if (nchar(self$`app_version_number`) > 20) {
        invalid_fields["app_version_number"] <- "Invalid length for `app_version_number`, must be smaller than or equal to 20."
      }

      if (nchar(self$`platform_version_number`) > 20) {
        invalid_fields["platform_version_number"] <- "Invalid length for `platform_version_number`, must be smaller than or equal to 20."
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
# IntegrationLog$unlock()
#
## Below is an example to define the print function
# IntegrationLog$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLog$lock()

