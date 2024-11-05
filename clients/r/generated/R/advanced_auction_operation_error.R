#' Create a new AdvancedAuctionOperationError
#'
#' @description
#' Error which occurred when applying a bid options operation to a specific item.
#'
#' @docType class
#' @title AdvancedAuctionOperationError
#' @description AdvancedAuctionOperationError Class
#' @format An \code{R6Class} generator object
#' @field code The error code for the item bid option operation validation error integer [optional]
#' @field message Message describing the item bid option operation validation error character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvancedAuctionOperationError <- R6::R6Class(
  "AdvancedAuctionOperationError",
  public = list(
    `code` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new AdvancedAuctionOperationError class.
    #'
    #' @param code The error code for the item bid option operation validation error
    #' @param message Message describing the item bid option operation validation error
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `message` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionOperationError in JSON format
    toJSON = function() {
      AdvancedAuctionOperationErrorObject <- list()
      if (!is.null(self$`code`)) {
        AdvancedAuctionOperationErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        AdvancedAuctionOperationErrorObject[["message"]] <-
          self$`message`
      }
      AdvancedAuctionOperationErrorObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionOperationError
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionOperationError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionOperationError in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            %d
                    ',
          self$`code`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionOperationError
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionOperationError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdvancedAuctionOperationError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdvancedAuctionOperationError
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
# AdvancedAuctionOperationError$unlock()
#
## Below is an example to define the print function
# AdvancedAuctionOperationError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdvancedAuctionOperationError$lock()

