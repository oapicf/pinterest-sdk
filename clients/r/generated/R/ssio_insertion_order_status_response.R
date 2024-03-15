#' Create a new SSIOInsertionOrderStatusResponse
#'
#' @description
#' SSIOInsertionOrderStatusResponse Class
#'
#' @docType class
#' @title SSIOInsertionOrderStatusResponse
#' @description SSIOInsertionOrderStatusResponse Class
#' @format An \code{R6Class} generator object
#' @field pin_order_id Salesforce order id character [optional]
#' @field status Salesforce insertion order status character [optional]
#' @field creation_time Salesforce insertion order creation time character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOInsertionOrderStatusResponse <- R6::R6Class(
  "SSIOInsertionOrderStatusResponse",
  public = list(
    `pin_order_id` = NULL,
    `status` = NULL,
    `creation_time` = NULL,
    #' Initialize a new SSIOInsertionOrderStatusResponse class.
    #'
    #' @description
    #' Initialize a new SSIOInsertionOrderStatusResponse class.
    #'
    #' @param pin_order_id Salesforce order id
    #' @param status Salesforce insertion order status
    #' @param creation_time Salesforce insertion order creation time
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`pin_order_id` = NULL, `status` = NULL, `creation_time` = NULL, ...) {
      if (!is.null(`pin_order_id`)) {
        if (!(is.character(`pin_order_id`) && length(`pin_order_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_order_id`. Must be a string:", `pin_order_id`))
        }
        self$`pin_order_id` <- `pin_order_id`
      }
      if (!is.null(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`creation_time`)) {
        if (!(is.character(`creation_time`) && length(`creation_time`) == 1)) {
          stop(paste("Error! Invalid data for `creation_time`. Must be a string:", `creation_time`))
        }
        self$`creation_time` <- `creation_time`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOInsertionOrderStatusResponse in JSON format
    #' @export
    toJSON = function() {
      SSIOInsertionOrderStatusResponseObject <- list()
      if (!is.null(self$`pin_order_id`)) {
        SSIOInsertionOrderStatusResponseObject[["pin_order_id"]] <-
          self$`pin_order_id`
      }
      if (!is.null(self$`status`)) {
        SSIOInsertionOrderStatusResponseObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`creation_time`)) {
        SSIOInsertionOrderStatusResponseObject[["creation_time"]] <-
          self$`creation_time`
      }
      SSIOInsertionOrderStatusResponseObject
    },
    #' Deserialize JSON string into an instance of SSIOInsertionOrderStatusResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOInsertionOrderStatusResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOInsertionOrderStatusResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pin_order_id`)) {
        self$`pin_order_id` <- this_object$`pin_order_id`
      }
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`creation_time`)) {
        self$`creation_time` <- this_object$`creation_time`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOInsertionOrderStatusResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`pin_order_id`)) {
          sprintf(
          '"pin_order_id":
            "%s"
                    ',
          self$`pin_order_id`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`creation_time`)) {
          sprintf(
          '"creation_time":
            "%s"
                    ',
          self$`creation_time`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SSIOInsertionOrderStatusResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOInsertionOrderStatusResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOInsertionOrderStatusResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pin_order_id` <- this_object$`pin_order_id`
      self$`status` <- this_object$`status`
      self$`creation_time` <- this_object$`creation_time`
      self
    },
    #' Validate JSON input with respect to SSIOInsertionOrderStatusResponse
    #'
    #' @description
    #' Validate JSON input with respect to SSIOInsertionOrderStatusResponse and throw an exception if invalid
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
    #' @return String representation of SSIOInsertionOrderStatusResponse
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
# SSIOInsertionOrderStatusResponse$unlock()
#
## Below is an example to define the print function
# SSIOInsertionOrderStatusResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOInsertionOrderStatusResponse$lock()

