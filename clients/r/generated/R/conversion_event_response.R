#' Create a new ConversionEventResponse
#'
#' @description
#' ConversionEventResponse Class
#'
#' @docType class
#' @title ConversionEventResponse
#' @description ConversionEventResponse Class
#' @format An \code{R6Class} generator object
#' @field conversion_event  \link{ConversionTagType} [optional]
#' @field conversion_tag_id Id of the tag. character [optional]
#' @field ad_account_id Id of the ad account. character [optional]
#' @field created_time Creation date in epoch format. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventResponse <- R6::R6Class(
  "ConversionEventResponse",
  public = list(
    `conversion_event` = NULL,
    `conversion_tag_id` = NULL,
    `ad_account_id` = NULL,
    `created_time` = NULL,

    #' @description
    #' Initialize a new ConversionEventResponse class.
    #'
    #' @param conversion_event conversion_event
    #' @param conversion_tag_id Id of the tag.
    #' @param ad_account_id Id of the ad account.
    #' @param created_time Creation date in epoch format.
    #' @param ... Other optional arguments.
    initialize = function(`conversion_event` = NULL, `conversion_tag_id` = NULL, `ad_account_id` = NULL, `created_time` = NULL, ...) {
      if (!is.null(`conversion_event`)) {
        if (!(`conversion_event` %in% c())) {
          stop(paste("Error! \"", `conversion_event`, "\" cannot be assigned to `conversion_event`. Must be .", sep = ""))
        }
        if (!(is.character(`conversion_event`) && length(`conversion_event`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_event`. Must be a string:", `conversion_event`))
        }
        stopifnot(R6::is.R6(`conversion_event`))
        self$`conversion_event` <- `conversion_event`
      }
      if (!is.null(`conversion_tag_id`)) {
        if (!(is.character(`conversion_tag_id`) && length(`conversion_tag_id`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_tag_id`. Must be a string:", `conversion_tag_id`))
        }
        self$`conversion_tag_id` <- `conversion_tag_id`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
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
    #' @return ConversionEventResponse in JSON format
    toJSON = function() {
      ConversionEventResponseObject <- list()
      if (!is.null(self$`conversion_event`)) {
        ConversionEventResponseObject[["conversion_event"]] <-
          self$`conversion_event`$toJSON()
      }
      if (!is.null(self$`conversion_tag_id`)) {
        ConversionEventResponseObject[["conversion_tag_id"]] <-
          self$`conversion_tag_id`
      }
      if (!is.null(self$`ad_account_id`)) {
        ConversionEventResponseObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`created_time`)) {
        ConversionEventResponseObject[["created_time"]] <-
          self$`created_time`
      }
      ConversionEventResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`conversion_event`)) {
        `conversion_event_object` <- ConversionTagType$new()
        `conversion_event_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_event`, auto_unbox = TRUE, digits = NA))
        self$`conversion_event` <- `conversion_event_object`
      }
      if (!is.null(this_object$`conversion_tag_id`)) {
        self$`conversion_tag_id` <- this_object$`conversion_tag_id`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`conversion_event`)) {
          sprintf(
          '"conversion_event":
          %s
          ',
          jsonlite::toJSON(self$`conversion_event`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`conversion_tag_id`)) {
          sprintf(
          '"conversion_tag_id":
            "%s"
                    ',
          self$`conversion_tag_id`
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
    #' Deserialize JSON string into an instance of ConversionEventResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`conversion_event` <- ConversionTagType$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_event`, auto_unbox = TRUE, digits = NA))
      self$`conversion_tag_id` <- this_object$`conversion_tag_id`
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`created_time` <- this_object$`created_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`conversion_tag_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
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
      if (!str_detect(self$`conversion_tag_id`, "^\\d+$")) {
        invalid_fields["conversion_tag_id"] <- "Invalid value for `conversion_tag_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
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
# ConversionEventResponse$unlock()
#
## Below is an example to define the print function
# ConversionEventResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventResponse$lock()

