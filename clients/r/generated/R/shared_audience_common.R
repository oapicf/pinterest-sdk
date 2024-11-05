#' Create a new SharedAudienceCommon
#'
#' @description
#' SharedAudienceCommon Class
#'
#' @docType class
#' @title SharedAudienceCommon
#' @description SharedAudienceCommon Class
#' @format An \code{R6Class} generator object
#' @field audience_id Unique identifier of an audience character [optional]
#' @field operation_type  \link{OperationType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SharedAudienceCommon <- R6::R6Class(
  "SharedAudienceCommon",
  public = list(
    `audience_id` = NULL,
    `operation_type` = NULL,

    #' @description
    #' Initialize a new SharedAudienceCommon class.
    #'
    #' @param audience_id Unique identifier of an audience
    #' @param operation_type operation_type
    #' @param ... Other optional arguments.
    initialize = function(`audience_id` = NULL, `operation_type` = NULL, ...) {
      if (!is.null(`audience_id`)) {
        if (!(is.character(`audience_id`) && length(`audience_id`) == 1)) {
          stop(paste("Error! Invalid data for `audience_id`. Must be a string:", `audience_id`))
        }
        self$`audience_id` <- `audience_id`
      }
      if (!is.null(`operation_type`)) {
        if (!(`operation_type` %in% c())) {
          stop(paste("Error! \"", `operation_type`, "\" cannot be assigned to `operation_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation_type`))
        self$`operation_type` <- `operation_type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return SharedAudienceCommon in JSON format
    toJSON = function() {
      SharedAudienceCommonObject <- list()
      if (!is.null(self$`audience_id`)) {
        SharedAudienceCommonObject[["audience_id"]] <-
          self$`audience_id`
      }
      if (!is.null(self$`operation_type`)) {
        SharedAudienceCommonObject[["operation_type"]] <-
          self$`operation_type`$toJSON()
      }
      SharedAudienceCommonObject
    },

    #' @description
    #' Deserialize JSON string into an instance of SharedAudienceCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of SharedAudienceCommon
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_id`)) {
        self$`audience_id` <- this_object$`audience_id`
      }
      if (!is.null(this_object$`operation_type`)) {
        `operation_type_object` <- OperationType$new()
        `operation_type_object`$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
        self$`operation_type` <- `operation_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return SharedAudienceCommon in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`audience_id`)) {
          sprintf(
          '"audience_id":
            "%s"
                    ',
          self$`audience_id`
          )
        },
        if (!is.null(self$`operation_type`)) {
          sprintf(
          '"operation_type":
          %s
          ',
          jsonlite::toJSON(self$`operation_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of SharedAudienceCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of SharedAudienceCommon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_id` <- this_object$`audience_id`
      self$`operation_type` <- OperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to SharedAudienceCommon and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SharedAudienceCommon
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`audience_id`, "^\\d+$")) {
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
      if (!str_detect(self$`audience_id`, "^\\d+$")) {
        invalid_fields["audience_id"] <- "Invalid value for `audience_id`, must conform to the pattern ^\\d+$."
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
# SharedAudienceCommon$unlock()
#
## Below is an example to define the print function
# SharedAudienceCommon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SharedAudienceCommon$lock()

