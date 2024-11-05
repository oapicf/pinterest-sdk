#' Create a new BusinessSharedAudienceResponse
#'
#' @description
#' BusinessSharedAudienceResponse Class
#'
#' @docType class
#' @title BusinessSharedAudienceResponse
#' @description BusinessSharedAudienceResponse Class
#' @format An \code{R6Class} generator object
#' @field audience_id Audience ID that was shared character [optional]
#' @field permissions  list(\link{Role}) [optional]
#' @field recipient_business_ids Business IDs that received the audience list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessSharedAudienceResponse <- R6::R6Class(
  "BusinessSharedAudienceResponse",
  public = list(
    `audience_id` = NULL,
    `permissions` = NULL,
    `recipient_business_ids` = NULL,

    #' @description
    #' Initialize a new BusinessSharedAudienceResponse class.
    #'
    #' @param audience_id Audience ID that was shared
    #' @param permissions permissions
    #' @param recipient_business_ids Business IDs that received the audience
    #' @param ... Other optional arguments.
    initialize = function(`audience_id` = NULL, `permissions` = NULL, `recipient_business_ids` = NULL, ...) {
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
      if (!is.null(`recipient_business_ids`)) {
        stopifnot(is.vector(`recipient_business_ids`), length(`recipient_business_ids`) != 0)
        sapply(`recipient_business_ids`, function(x) stopifnot(is.character(x)))
        self$`recipient_business_ids` <- `recipient_business_ids`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessSharedAudienceResponse in JSON format
    toJSON = function() {
      BusinessSharedAudienceResponseObject <- list()
      if (!is.null(self$`audience_id`)) {
        BusinessSharedAudienceResponseObject[["audience_id"]] <-
          self$`audience_id`
      }
      if (!is.null(self$`permissions`)) {
        BusinessSharedAudienceResponseObject[["permissions"]] <-
          lapply(self$`permissions`, function(x) x$toJSON())
      }
      if (!is.null(self$`recipient_business_ids`)) {
        BusinessSharedAudienceResponseObject[["recipient_business_ids"]] <-
          self$`recipient_business_ids`
      }
      BusinessSharedAudienceResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessSharedAudienceResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessSharedAudienceResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_id`)) {
        self$`audience_id` <- this_object$`audience_id`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[Role]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`recipient_business_ids`)) {
        self$`recipient_business_ids` <- ApiClient$new()$deserializeObj(this_object$`recipient_business_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessSharedAudienceResponse in JSON format
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
        },
        if (!is.null(self$`recipient_business_ids`)) {
          sprintf(
          '"recipient_business_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`recipient_business_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessSharedAudienceResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessSharedAudienceResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_id` <- this_object$`audience_id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[Role]", loadNamespace("openapi"))
      self$`recipient_business_ids` <- ApiClient$new()$deserializeObj(this_object$`recipient_business_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BusinessSharedAudienceResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BusinessSharedAudienceResponse
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
# BusinessSharedAudienceResponse$unlock()
#
## Below is an example to define the print function
# BusinessSharedAudienceResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessSharedAudienceResponse$lock()

