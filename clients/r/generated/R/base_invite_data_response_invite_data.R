#' Create a new BaseInviteDataResponseInviteData
#'
#' @description
#' Metadata for the invite/request.
#'
#' @docType class
#' @title BaseInviteDataResponseInviteData
#' @description BaseInviteDataResponseInviteData Class
#' @format An \code{R6Class} generator object
#' @field invite_expiration The date and time when the invite/request will expire. Returned in milliseconds. integer [optional]
#' @field invite_status The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. character [optional]
#' @field invite_type The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets. character [optional]
#' @field last_updated_time The date and time the invite/request was last updated. Returned in milliseconds. integer [optional]
#' @field sent_at The date and time the invite/request was sent/created. Returned in milliseconds. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BaseInviteDataResponseInviteData <- R6::R6Class(
  "BaseInviteDataResponseInviteData",
  public = list(
    `invite_expiration` = NULL,
    `invite_status` = NULL,
    `invite_type` = NULL,
    `last_updated_time` = NULL,
    `sent_at` = NULL,

    #' @description
    #' Initialize a new BaseInviteDataResponseInviteData class.
    #'
    #' @param invite_expiration The date and time when the invite/request will expire. Returned in milliseconds.
    #' @param invite_status The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
    #' @param invite_type The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
    #' @param last_updated_time The date and time the invite/request was last updated. Returned in milliseconds.
    #' @param sent_at The date and time the invite/request was sent/created. Returned in milliseconds.
    #' @param ... Other optional arguments.
    initialize = function(`invite_expiration` = NULL, `invite_status` = NULL, `invite_type` = NULL, `last_updated_time` = NULL, `sent_at` = NULL, ...) {
      if (!is.null(`invite_expiration`)) {
        if (!(is.numeric(`invite_expiration`) && length(`invite_expiration`) == 1)) {
          stop(paste("Error! Invalid data for `invite_expiration`. Must be an integer:", `invite_expiration`))
        }
        self$`invite_expiration` <- `invite_expiration`
      }
      if (!is.null(`invite_status`)) {
        if (!(is.character(`invite_status`) && length(`invite_status`) == 1)) {
          stop(paste("Error! Invalid data for `invite_status`. Must be a string:", `invite_status`))
        }
        self$`invite_status` <- `invite_status`
      }
      if (!is.null(`invite_type`)) {
        if (!(is.character(`invite_type`) && length(`invite_type`) == 1)) {
          stop(paste("Error! Invalid data for `invite_type`. Must be a string:", `invite_type`))
        }
        self$`invite_type` <- `invite_type`
      }
      if (!is.null(`last_updated_time`)) {
        if (!(is.numeric(`last_updated_time`) && length(`last_updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `last_updated_time`. Must be an integer:", `last_updated_time`))
        }
        self$`last_updated_time` <- `last_updated_time`
      }
      if (!is.null(`sent_at`)) {
        if (!(is.numeric(`sent_at`) && length(`sent_at`) == 1)) {
          stop(paste("Error! Invalid data for `sent_at`. Must be an integer:", `sent_at`))
        }
        self$`sent_at` <- `sent_at`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BaseInviteDataResponseInviteData in JSON format
    toJSON = function() {
      BaseInviteDataResponseInviteDataObject <- list()
      if (!is.null(self$`invite_expiration`)) {
        BaseInviteDataResponseInviteDataObject[["invite_expiration"]] <-
          self$`invite_expiration`
      }
      if (!is.null(self$`invite_status`)) {
        BaseInviteDataResponseInviteDataObject[["invite_status"]] <-
          self$`invite_status`
      }
      if (!is.null(self$`invite_type`)) {
        BaseInviteDataResponseInviteDataObject[["invite_type"]] <-
          self$`invite_type`
      }
      if (!is.null(self$`last_updated_time`)) {
        BaseInviteDataResponseInviteDataObject[["last_updated_time"]] <-
          self$`last_updated_time`
      }
      if (!is.null(self$`sent_at`)) {
        BaseInviteDataResponseInviteDataObject[["sent_at"]] <-
          self$`sent_at`
      }
      BaseInviteDataResponseInviteDataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BaseInviteDataResponseInviteData
    #'
    #' @param input_json the JSON input
    #' @return the instance of BaseInviteDataResponseInviteData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`invite_expiration`)) {
        self$`invite_expiration` <- this_object$`invite_expiration`
      }
      if (!is.null(this_object$`invite_status`)) {
        self$`invite_status` <- this_object$`invite_status`
      }
      if (!is.null(this_object$`invite_type`)) {
        self$`invite_type` <- this_object$`invite_type`
      }
      if (!is.null(this_object$`last_updated_time`)) {
        self$`last_updated_time` <- this_object$`last_updated_time`
      }
      if (!is.null(this_object$`sent_at`)) {
        self$`sent_at` <- this_object$`sent_at`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BaseInviteDataResponseInviteData in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`invite_expiration`)) {
          sprintf(
          '"invite_expiration":
            %d
                    ',
          self$`invite_expiration`
          )
        },
        if (!is.null(self$`invite_status`)) {
          sprintf(
          '"invite_status":
            "%s"
                    ',
          self$`invite_status`
          )
        },
        if (!is.null(self$`invite_type`)) {
          sprintf(
          '"invite_type":
            "%s"
                    ',
          self$`invite_type`
          )
        },
        if (!is.null(self$`last_updated_time`)) {
          sprintf(
          '"last_updated_time":
            %d
                    ',
          self$`last_updated_time`
          )
        },
        if (!is.null(self$`sent_at`)) {
          sprintf(
          '"sent_at":
            %d
                    ',
          self$`sent_at`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BaseInviteDataResponseInviteData
    #'
    #' @param input_json the JSON input
    #' @return the instance of BaseInviteDataResponseInviteData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`invite_expiration` <- this_object$`invite_expiration`
      self$`invite_status` <- this_object$`invite_status`
      self$`invite_type` <- this_object$`invite_type`
      self$`last_updated_time` <- this_object$`last_updated_time`
      self$`sent_at` <- this_object$`sent_at`
      self
    },

    #' @description
    #' Validate JSON input with respect to BaseInviteDataResponseInviteData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BaseInviteDataResponseInviteData
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
# BaseInviteDataResponseInviteData$unlock()
#
## Below is an example to define the print function
# BaseInviteDataResponseInviteData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BaseInviteDataResponseInviteData$lock()

