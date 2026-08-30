#' Create a new CustomerListRecordRow
#'
#' @description
#' A single row in a multi-field customer list (v2 format).
#'
#' @docType class
#' @title CustomerListRecordRow
#' @description CustomerListRecordRow Class
#' @format An \code{R6Class} generator object
#' @field email Email address (plain or hashed with SHA1, SHA256, or MD5). character [optional]
#' @field external_id External ID identifier (not hashed). character [optional]
#' @field hashed_phone_number Hashed phone number (hashed with SHA1, SHA256, or MD5). character [optional]
#' @field hashed_pinner_id Hashed pinner ID (hashed with SHA1, SHA256, or MD5). character [optional]
#' @field ip_address IP address (not hashed). character [optional]
#' @field liveramp_envelope LiveRamp envelope identifier (Base64-encoded, not hashed). character [optional]
#' @field maid Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). character [optional]
#' @field user_agent User agent string (not hashed). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerListRecordRow <- R6::R6Class(
  "CustomerListRecordRow",
  public = list(
    `email` = NULL,
    `external_id` = NULL,
    `hashed_phone_number` = NULL,
    `hashed_pinner_id` = NULL,
    `ip_address` = NULL,
    `liveramp_envelope` = NULL,
    `maid` = NULL,
    `user_agent` = NULL,

    #' @description
    #' Initialize a new CustomerListRecordRow class.
    #'
    #' @param email Email address (plain or hashed with SHA1, SHA256, or MD5).
    #' @param external_id External ID identifier (not hashed).
    #' @param hashed_phone_number Hashed phone number (hashed with SHA1, SHA256, or MD5).
    #' @param hashed_pinner_id Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
    #' @param ip_address IP address (not hashed).
    #' @param liveramp_envelope LiveRamp envelope identifier (Base64-encoded, not hashed).
    #' @param maid Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
    #' @param user_agent User agent string (not hashed).
    #' @param ... Other optional arguments.
    initialize = function(`email` = NULL, `external_id` = NULL, `hashed_phone_number` = NULL, `hashed_pinner_id` = NULL, `ip_address` = NULL, `liveramp_envelope` = NULL, `maid` = NULL, `user_agent` = NULL, ...) {
      if (!is.null(`email`)) {
        if (!(is.character(`email`) && length(`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", `email`))
        }
        self$`email` <- `email`
      }
      if (!is.null(`external_id`)) {
        if (!(is.character(`external_id`) && length(`external_id`) == 1)) {
          stop(paste("Error! Invalid data for `external_id`. Must be a string:", `external_id`))
        }
        self$`external_id` <- `external_id`
      }
      if (!is.null(`hashed_phone_number`)) {
        if (!(is.character(`hashed_phone_number`) && length(`hashed_phone_number`) == 1)) {
          stop(paste("Error! Invalid data for `hashed_phone_number`. Must be a string:", `hashed_phone_number`))
        }
        self$`hashed_phone_number` <- `hashed_phone_number`
      }
      if (!is.null(`hashed_pinner_id`)) {
        if (!(is.character(`hashed_pinner_id`) && length(`hashed_pinner_id`) == 1)) {
          stop(paste("Error! Invalid data for `hashed_pinner_id`. Must be a string:", `hashed_pinner_id`))
        }
        self$`hashed_pinner_id` <- `hashed_pinner_id`
      }
      if (!is.null(`ip_address`)) {
        if (!(is.character(`ip_address`) && length(`ip_address`) == 1)) {
          stop(paste("Error! Invalid data for `ip_address`. Must be a string:", `ip_address`))
        }
        self$`ip_address` <- `ip_address`
      }
      if (!is.null(`liveramp_envelope`)) {
        if (!(is.character(`liveramp_envelope`) && length(`liveramp_envelope`) == 1)) {
          stop(paste("Error! Invalid data for `liveramp_envelope`. Must be a string:", `liveramp_envelope`))
        }
        self$`liveramp_envelope` <- `liveramp_envelope`
      }
      if (!is.null(`maid`)) {
        if (!(is.character(`maid`) && length(`maid`) == 1)) {
          stop(paste("Error! Invalid data for `maid`. Must be a string:", `maid`))
        }
        self$`maid` <- `maid`
      }
      if (!is.null(`user_agent`)) {
        if (!(is.character(`user_agent`) && length(`user_agent`) == 1)) {
          stop(paste("Error! Invalid data for `user_agent`. Must be a string:", `user_agent`))
        }
        self$`user_agent` <- `user_agent`
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
    #' @return CustomerListRecordRow as a base R list.
    #' @examples
    #' # convert array of CustomerListRecordRow (x) to a data frame
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
    #' Convert CustomerListRecordRow to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerListRecordRowObject <- list()
      if (!is.null(self$`email`)) {
        CustomerListRecordRowObject[["email"]] <-
          self$`email`
      }
      if (!is.null(self$`external_id`)) {
        CustomerListRecordRowObject[["external_id"]] <-
          self$`external_id`
      }
      if (!is.null(self$`hashed_phone_number`)) {
        CustomerListRecordRowObject[["hashed_phone_number"]] <-
          self$`hashed_phone_number`
      }
      if (!is.null(self$`hashed_pinner_id`)) {
        CustomerListRecordRowObject[["hashed_pinner_id"]] <-
          self$`hashed_pinner_id`
      }
      if (!is.null(self$`ip_address`)) {
        CustomerListRecordRowObject[["ip_address"]] <-
          self$`ip_address`
      }
      if (!is.null(self$`liveramp_envelope`)) {
        CustomerListRecordRowObject[["liveramp_envelope"]] <-
          self$`liveramp_envelope`
      }
      if (!is.null(self$`maid`)) {
        CustomerListRecordRowObject[["maid"]] <-
          self$`maid`
      }
      if (!is.null(self$`user_agent`)) {
        CustomerListRecordRowObject[["user_agent"]] <-
          self$`user_agent`
      }
      return(CustomerListRecordRowObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListRecordRow
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListRecordRow
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`email`)) {
        self$`email` <- this_object$`email`
      }
      if (!is.null(this_object$`external_id`)) {
        self$`external_id` <- this_object$`external_id`
      }
      if (!is.null(this_object$`hashed_phone_number`)) {
        self$`hashed_phone_number` <- this_object$`hashed_phone_number`
      }
      if (!is.null(this_object$`hashed_pinner_id`)) {
        self$`hashed_pinner_id` <- this_object$`hashed_pinner_id`
      }
      if (!is.null(this_object$`ip_address`)) {
        self$`ip_address` <- this_object$`ip_address`
      }
      if (!is.null(this_object$`liveramp_envelope`)) {
        self$`liveramp_envelope` <- this_object$`liveramp_envelope`
      }
      if (!is.null(this_object$`maid`)) {
        self$`maid` <- this_object$`maid`
      }
      if (!is.null(this_object$`user_agent`)) {
        self$`user_agent` <- this_object$`user_agent`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerListRecordRow in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListRecordRow
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListRecordRow
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`email` <- this_object$`email`
      self$`external_id` <- this_object$`external_id`
      self$`hashed_phone_number` <- this_object$`hashed_phone_number`
      self$`hashed_pinner_id` <- this_object$`hashed_pinner_id`
      self$`ip_address` <- this_object$`ip_address`
      self$`liveramp_envelope` <- this_object$`liveramp_envelope`
      self$`maid` <- this_object$`maid`
      self$`user_agent` <- this_object$`user_agent`
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerListRecordRow and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerListRecordRow
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
# CustomerListRecordRow$unlock()
#
## Below is an example to define the print function
# CustomerListRecordRow$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerListRecordRow$lock()

