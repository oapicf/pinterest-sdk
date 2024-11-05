#' Create a new BaseInviteDataResponse
#'
#' @description
#' BaseInviteDataResponse Class
#'
#' @docType class
#' @title BaseInviteDataResponse
#' @description BaseInviteDataResponse Class
#' @format An \code{R6Class} generator object
#' @field id Unique identifier of the invite/request. character [optional]
#' @field invite_data  \link{BaseInviteDataResponseInviteData} [optional]
#' @field is_received_invite Indicates whether the invite/request was received. character [optional]
#' @field user Metadata for the member/partner that was sent the invite/request. \link{BusinessAccessUserSummary} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BaseInviteDataResponse <- R6::R6Class(
  "BaseInviteDataResponse",
  public = list(
    `id` = NULL,
    `invite_data` = NULL,
    `is_received_invite` = NULL,
    `user` = NULL,

    #' @description
    #' Initialize a new BaseInviteDataResponse class.
    #'
    #' @param id Unique identifier of the invite/request.
    #' @param invite_data invite_data
    #' @param is_received_invite Indicates whether the invite/request was received.
    #' @param user Metadata for the member/partner that was sent the invite/request.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `invite_data` = NULL, `is_received_invite` = NULL, `user` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`invite_data`)) {
        stopifnot(R6::is.R6(`invite_data`))
        self$`invite_data` <- `invite_data`
      }
      if (!is.null(`is_received_invite`)) {
        if (!(is.logical(`is_received_invite`) && length(`is_received_invite`) == 1)) {
          stop(paste("Error! Invalid data for `is_received_invite`. Must be a boolean:", `is_received_invite`))
        }
        self$`is_received_invite` <- `is_received_invite`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BaseInviteDataResponse in JSON format
    toJSON = function() {
      BaseInviteDataResponseObject <- list()
      if (!is.null(self$`id`)) {
        BaseInviteDataResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`invite_data`)) {
        BaseInviteDataResponseObject[["invite_data"]] <-
          self$`invite_data`$toJSON()
      }
      if (!is.null(self$`is_received_invite`)) {
        BaseInviteDataResponseObject[["is_received_invite"]] <-
          self$`is_received_invite`
      }
      if (!is.null(self$`user`)) {
        BaseInviteDataResponseObject[["user"]] <-
          self$`user`$toJSON()
      }
      BaseInviteDataResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BaseInviteDataResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BaseInviteDataResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`invite_data`)) {
        `invite_data_object` <- BaseInviteDataResponseInviteData$new()
        `invite_data_object`$fromJSON(jsonlite::toJSON(this_object$`invite_data`, auto_unbox = TRUE, digits = NA))
        self$`invite_data` <- `invite_data_object`
      }
      if (!is.null(this_object$`is_received_invite`)) {
        self$`is_received_invite` <- this_object$`is_received_invite`
      }
      if (!is.null(this_object$`user`)) {
        `user_object` <- BusinessAccessUserSummary$new()
        `user_object`$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
        self$`user` <- `user_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BaseInviteDataResponse in JSON format
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
        if (!is.null(self$`invite_data`)) {
          sprintf(
          '"invite_data":
          %s
          ',
          jsonlite::toJSON(self$`invite_data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`is_received_invite`)) {
          sprintf(
          '"is_received_invite":
            %s
                    ',
          tolower(self$`is_received_invite`)
          )
        },
        if (!is.null(self$`user`)) {
          sprintf(
          '"user":
          %s
          ',
          jsonlite::toJSON(self$`user`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BaseInviteDataResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BaseInviteDataResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`invite_data` <- BaseInviteDataResponseInviteData$new()$fromJSON(jsonlite::toJSON(this_object$`invite_data`, auto_unbox = TRUE, digits = NA))
      self$`is_received_invite` <- this_object$`is_received_invite`
      self$`user` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BaseInviteDataResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BaseInviteDataResponse
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
# BaseInviteDataResponse$unlock()
#
## Below is an example to define the print function
# BaseInviteDataResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BaseInviteDataResponse$lock()

