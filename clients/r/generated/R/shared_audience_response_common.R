#' Create a new SharedAudienceResponseCommon
#'
#' @description
#' SharedAudienceResponseCommon Class
#'
#' @docType class
#' @title SharedAudienceResponseCommon
#' @description SharedAudienceResponseCommon Class
#' @format An \code{R6Class} generator object
#' @field audience_id Audience ID that was shared character [optional]
#' @field permissions  list(\link{Role}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SharedAudienceResponseCommon <- R6::R6Class(
  "SharedAudienceResponseCommon",
  public = list(
    `audience_id` = NULL,
    `permissions` = NULL,

    #' @description
    #' Initialize a new SharedAudienceResponseCommon class.
    #'
    #' @param audience_id Audience ID that was shared
    #' @param permissions permissions
    #' @param ... Other optional arguments.
    initialize = function(`audience_id` = NULL, `permissions` = NULL, ...) {
      if (!is.null(`audience_id`)) {
        if (!(is.character(`audience_id`) && length(`audience_id`) == 1)) {
          stop(paste("Error! Invalid data for `audience_id`. Must be a string:", `audience_id`))
        }
        self$`audience_id` <- `audience_id`
      }
      if (!is.null(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(R6::is.R6(x)))
        self$`permissions` <- `permissions`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return SharedAudienceResponseCommon in JSON format
    toJSON = function() {
      SharedAudienceResponseCommonObject <- list()
      if (!is.null(self$`audience_id`)) {
        SharedAudienceResponseCommonObject[["audience_id"]] <-
          self$`audience_id`
      }
      if (!is.null(self$`permissions`)) {
        SharedAudienceResponseCommonObject[["permissions"]] <-
          lapply(self$`permissions`, function(x) x$toJSON())
      }
      SharedAudienceResponseCommonObject
    },

    #' @description
    #' Deserialize JSON string into an instance of SharedAudienceResponseCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of SharedAudienceResponseCommon
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_id`)) {
        self$`audience_id` <- this_object$`audience_id`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[Role]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return SharedAudienceResponseCommon in JSON format
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
        if (!is.null(self$`permissions`)) {
          sprintf(
          '"permissions":
          [%s]
',
          paste(sapply(self$`permissions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of SharedAudienceResponseCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of SharedAudienceResponseCommon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_id` <- this_object$`audience_id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[Role]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to SharedAudienceResponseCommon and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SharedAudienceResponseCommon
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
# SharedAudienceResponseCommon$unlock()
#
## Below is an example to define the print function
# SharedAudienceResponseCommon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SharedAudienceResponseCommon$lock()

