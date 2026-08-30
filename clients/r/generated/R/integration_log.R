#' Create a new IntegrationLog
#'
#' @description
#' Schema for log sent from an integration application.
#'
#' @docType class
#' @title IntegrationLog
#' @description IntegrationLog Class
#' @format An \code{R6Class} generator object
#' @field advertiser_id  character [optional]
#' @field app_version_number Version number of the integration application. character [optional]
#' @field client_timestamp Timestamp in milliseconds of when the log was executed at the client. integer
#' @field error  \link{IntegrationLogClientError} [optional]
#' @field event_type Log event type \link{IntegrationLogEventType}
#' @field external_business_id  character [optional]
#' @field feed_profile_id  character [optional]
#' @field log_level Log level type \link{IntegrationLogLevel}
#' @field merchant_id  character [optional]
#' @field message Explanation of the event that occured. character [optional]
#' @field platform_version_number Version number of the platform the integration application is running on. character [optional]
#' @field request  \link{IntegrationLogClientRequest} [optional]
#' @field tag_id  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLog <- R6::R6Class(
  "IntegrationLog",
  public = list(
    `advertiser_id` = NULL,
    `app_version_number` = NULL,
    `client_timestamp` = NULL,
    `error` = NULL,
    `event_type` = NULL,
    `external_business_id` = NULL,
    `feed_profile_id` = NULL,
    `log_level` = NULL,
    `merchant_id` = NULL,
    `message` = NULL,
    `platform_version_number` = NULL,
    `request` = NULL,
    `tag_id` = NULL,

    #' @description
    #' Initialize a new IntegrationLog class.
    #'
    #' @param client_timestamp Timestamp in milliseconds of when the log was executed at the client.
    #' @param event_type Log event type
    #' @param log_level Log level type
    #' @param advertiser_id advertiser_id
    #' @param app_version_number Version number of the integration application.
    #' @param error error
    #' @param external_business_id external_business_id
    #' @param feed_profile_id feed_profile_id
    #' @param merchant_id merchant_id
    #' @param message Explanation of the event that occured.
    #' @param platform_version_number Version number of the platform the integration application is running on.
    #' @param request request
    #' @param tag_id tag_id
    #' @param ... Other optional arguments.
    initialize = function(`client_timestamp`, `event_type`, `log_level`, `advertiser_id` = NULL, `app_version_number` = NULL, `error` = NULL, `external_business_id` = NULL, `feed_profile_id` = NULL, `merchant_id` = NULL, `message` = NULL, `platform_version_number` = NULL, `request` = NULL, `tag_id` = NULL, ...) {
      if (!missing(`client_timestamp`)) {
        if (!(is.numeric(`client_timestamp`) && length(`client_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `client_timestamp`. Must be an integer:", `client_timestamp`))
        }
        self$`client_timestamp` <- `client_timestamp`
      }
      if (!missing(`event_type`)) {
        if (!(`event_type` %in% c())) {
          stop(paste("Error! \"", `event_type`, "\" cannot be assigned to `event_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`event_type`))
        self$`event_type` <- `event_type`
      }
      if (!missing(`log_level`)) {
        if (!(`log_level` %in% c())) {
          stop(paste("Error! \"", `log_level`, "\" cannot be assigned to `log_level`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`log_level`))
        self$`log_level` <- `log_level`
      }
      if (!is.null(`advertiser_id`)) {
        if (!(is.character(`advertiser_id`) && length(`advertiser_id`) == 1)) {
          stop(paste("Error! Invalid data for `advertiser_id`. Must be a string:", `advertiser_id`))
        }
        self$`advertiser_id` <- `advertiser_id`
      }
      if (!is.null(`app_version_number`)) {
        if (!(is.character(`app_version_number`) && length(`app_version_number`) == 1)) {
          stop(paste("Error! Invalid data for `app_version_number`. Must be a string:", `app_version_number`))
        }
        self$`app_version_number` <- `app_version_number`
      }
      if (!is.null(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
      }
      if (!is.null(`external_business_id`)) {
        if (!(is.character(`external_business_id`) && length(`external_business_id`) == 1)) {
          stop(paste("Error! Invalid data for `external_business_id`. Must be a string:", `external_business_id`))
        }
        self$`external_business_id` <- `external_business_id`
      }
      if (!is.null(`feed_profile_id`)) {
        if (!(is.character(`feed_profile_id`) && length(`feed_profile_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_profile_id`. Must be a string:", `feed_profile_id`))
        }
        self$`feed_profile_id` <- `feed_profile_id`
      }
      if (!is.null(`merchant_id`)) {
        if (!(is.character(`merchant_id`) && length(`merchant_id`) == 1)) {
          stop(paste("Error! Invalid data for `merchant_id`. Must be a string:", `merchant_id`))
        }
        self$`merchant_id` <- `merchant_id`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`platform_version_number`)) {
        if (!(is.character(`platform_version_number`) && length(`platform_version_number`) == 1)) {
          stop(paste("Error! Invalid data for `platform_version_number`. Must be a string:", `platform_version_number`))
        }
        self$`platform_version_number` <- `platform_version_number`
      }
      if (!is.null(`request`)) {
        stopifnot(R6::is.R6(`request`))
        self$`request` <- `request`
      }
      if (!is.null(`tag_id`)) {
        if (!(is.character(`tag_id`) && length(`tag_id`) == 1)) {
          stop(paste("Error! Invalid data for `tag_id`. Must be a string:", `tag_id`))
        }
        self$`tag_id` <- `tag_id`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return IntegrationLog as a base R list.
    #' @examples
    #' # convert array of IntegrationLog (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert IntegrationLog to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      IntegrationLogObject <- list()
      if (!is.null(self$`advertiser_id`)) {
        IntegrationLogObject[["advertiser_id"]] <-
          self$`advertiser_id`
      }
      if (!is.null(self$`app_version_number`)) {
        IntegrationLogObject[["app_version_number"]] <-
          self$`app_version_number`
      }
      if (!is.null(self$`client_timestamp`)) {
        IntegrationLogObject[["client_timestamp"]] <-
          self$`client_timestamp`
      }
      if (!is.null(self$`error`)) {
        IntegrationLogObject[["error"]] <-
          self$extractSimpleType(self$`error`)
      }
      if (!is.null(self$`event_type`)) {
        IntegrationLogObject[["event_type"]] <-
          self$extractSimpleType(self$`event_type`)
      }
      if (!is.null(self$`external_business_id`)) {
        IntegrationLogObject[["external_business_id"]] <-
          self$`external_business_id`
      }
      if (!is.null(self$`feed_profile_id`)) {
        IntegrationLogObject[["feed_profile_id"]] <-
          self$`feed_profile_id`
      }
      if (!is.null(self$`log_level`)) {
        IntegrationLogObject[["log_level"]] <-
          self$extractSimpleType(self$`log_level`)
      }
      if (!is.null(self$`merchant_id`)) {
        IntegrationLogObject[["merchant_id"]] <-
          self$`merchant_id`
      }
      if (!is.null(self$`message`)) {
        IntegrationLogObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`platform_version_number`)) {
        IntegrationLogObject[["platform_version_number"]] <-
          self$`platform_version_number`
      }
      if (!is.null(self$`request`)) {
        IntegrationLogObject[["request"]] <-
          self$extractSimpleType(self$`request`)
      }
      if (!is.null(self$`tag_id`)) {
        IntegrationLogObject[["tag_id"]] <-
          self$`tag_id`
      }
      return(IntegrationLogObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLog
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLog
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`advertiser_id`)) {
        self$`advertiser_id` <- this_object$`advertiser_id`
      }
      if (!is.null(this_object$`app_version_number`)) {
        self$`app_version_number` <- this_object$`app_version_number`
      }
      if (!is.null(this_object$`client_timestamp`)) {
        self$`client_timestamp` <- this_object$`client_timestamp`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- IntegrationLogClientError$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      if (!is.null(this_object$`event_type`)) {
        `event_type_object` <- IntegrationLogEventType$new()
        `event_type_object`$fromJSON(jsonlite::toJSON(this_object$`event_type`, auto_unbox = TRUE, digits = NA))
        self$`event_type` <- `event_type_object`
      }
      if (!is.null(this_object$`external_business_id`)) {
        self$`external_business_id` <- this_object$`external_business_id`
      }
      if (!is.null(this_object$`feed_profile_id`)) {
        self$`feed_profile_id` <- this_object$`feed_profile_id`
      }
      if (!is.null(this_object$`log_level`)) {
        `log_level_object` <- IntegrationLogLevel$new()
        `log_level_object`$fromJSON(jsonlite::toJSON(this_object$`log_level`, auto_unbox = TRUE, digits = NA))
        self$`log_level` <- `log_level_object`
      }
      if (!is.null(this_object$`merchant_id`)) {
        self$`merchant_id` <- this_object$`merchant_id`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`platform_version_number`)) {
        self$`platform_version_number` <- this_object$`platform_version_number`
      }
      if (!is.null(this_object$`request`)) {
        `request_object` <- IntegrationLogClientRequest$new()
        `request_object`$fromJSON(jsonlite::toJSON(this_object$`request`, auto_unbox = TRUE, digits = NA))
        self$`request` <- `request_object`
      }
      if (!is.null(this_object$`tag_id`)) {
        self$`tag_id` <- this_object$`tag_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return IntegrationLog in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLog
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLog
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`advertiser_id` <- this_object$`advertiser_id`
      self$`app_version_number` <- this_object$`app_version_number`
      self$`client_timestamp` <- this_object$`client_timestamp`
      self$`error` <- IntegrationLogClientError$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self$`event_type` <- IntegrationLogEventType$new()$fromJSON(jsonlite::toJSON(this_object$`event_type`, auto_unbox = TRUE, digits = NA))
      self$`external_business_id` <- this_object$`external_business_id`
      self$`feed_profile_id` <- this_object$`feed_profile_id`
      self$`log_level` <- IntegrationLogLevel$new()$fromJSON(jsonlite::toJSON(this_object$`log_level`, auto_unbox = TRUE, digits = NA))
      self$`merchant_id` <- this_object$`merchant_id`
      self$`message` <- this_object$`message`
      self$`platform_version_number` <- this_object$`platform_version_number`
      self$`request` <- IntegrationLogClientRequest$new()$fromJSON(jsonlite::toJSON(this_object$`request`, auto_unbox = TRUE, digits = NA))
      self$`tag_id` <- this_object$`tag_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to IntegrationLog and throw an exception if invalid
    #'
    #' @param input the JSON input
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
        stopifnot(R6::is.R6(input_json$`event_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLog: the required field `event_type` is missing."))
      }
      # check the required field `log_level`
      if (!is.null(input_json$`log_level`)) {
        stopifnot(R6::is.R6(input_json$`log_level`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLog: the required field `log_level` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLog
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`advertiser_id`) > 128) {
        return(FALSE)
      }

      if (nchar(self$`app_version_number`) > 20) {
        return(FALSE)
      }

      # check if the required `client_timestamp` is null
      if (is.null(self$`client_timestamp`)) {
        return(FALSE)
      }

      # check if the required `event_type` is null
      if (is.null(self$`event_type`)) {
        return(FALSE)
      }

      if (nchar(self$`external_business_id`) > 2048) {
        return(FALSE)
      }

      if (nchar(self$`feed_profile_id`) > 128) {
        return(FALSE)
      }

      # check if the required `log_level` is null
      if (is.null(self$`log_level`)) {
        return(FALSE)
      }

      if (nchar(self$`merchant_id`) > 128) {
        return(FALSE)
      }

      if (nchar(self$`message`) > 8192) {
        return(FALSE)
      }

      if (nchar(self$`platform_version_number`) > 20) {
        return(FALSE)
      }

      if (nchar(self$`tag_id`) > 128) {
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
      if (nchar(self$`advertiser_id`) > 128) {
        invalid_fields["advertiser_id"] <- "Invalid length for `advertiser_id`, must be smaller than or equal to 128."
      }

      if (nchar(self$`app_version_number`) > 20) {
        invalid_fields["app_version_number"] <- "Invalid length for `app_version_number`, must be smaller than or equal to 20."
      }

      # check if the required `client_timestamp` is null
      if (is.null(self$`client_timestamp`)) {
        invalid_fields["client_timestamp"] <- "Non-nullable required field `client_timestamp` cannot be null."
      }

      # check if the required `event_type` is null
      if (is.null(self$`event_type`)) {
        invalid_fields["event_type"] <- "Non-nullable required field `event_type` cannot be null."
      }

      if (nchar(self$`external_business_id`) > 2048) {
        invalid_fields["external_business_id"] <- "Invalid length for `external_business_id`, must be smaller than or equal to 2048."
      }

      if (nchar(self$`feed_profile_id`) > 128) {
        invalid_fields["feed_profile_id"] <- "Invalid length for `feed_profile_id`, must be smaller than or equal to 128."
      }

      # check if the required `log_level` is null
      if (is.null(self$`log_level`)) {
        invalid_fields["log_level"] <- "Non-nullable required field `log_level` cannot be null."
      }

      if (nchar(self$`merchant_id`) > 128) {
        invalid_fields["merchant_id"] <- "Invalid length for `merchant_id`, must be smaller than or equal to 128."
      }

      if (nchar(self$`message`) > 8192) {
        invalid_fields["message"] <- "Invalid length for `message`, must be smaller than or equal to 8192."
      }

      if (nchar(self$`platform_version_number`) > 20) {
        invalid_fields["platform_version_number"] <- "Invalid length for `platform_version_number`, must be smaller than or equal to 20."
      }

      if (nchar(self$`tag_id`) > 128) {
        invalid_fields["tag_id"] <- "Invalid length for `tag_id`, must be smaller than or equal to 128."
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
# IntegrationLog$unlock()
#
## Below is an example to define the print function
# IntegrationLog$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLog$lock()

