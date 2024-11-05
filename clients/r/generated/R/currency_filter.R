#' Create a new CurrencyFilter
#'
#' @description
#' CurrencyFilter Class
#'
#' @docType class
#' @title CurrencyFilter
#' @description CurrencyFilter Class
#' @format An \code{R6Class} generator object
#' @field CURRENCY  \link{CatalogsProductGroupCurrencyCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CurrencyFilter <- R6::R6Class(
  "CurrencyFilter",
  public = list(
    `CURRENCY` = NULL,

    #' @description
    #' Initialize a new CurrencyFilter class.
    #'
    #' @param CURRENCY CURRENCY
    #' @param ... Other optional arguments.
    initialize = function(`CURRENCY`, ...) {
      if (!missing(`CURRENCY`)) {
        stopifnot(R6::is.R6(`CURRENCY`))
        self$`CURRENCY` <- `CURRENCY`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CurrencyFilter in JSON format
    toJSON = function() {
      CurrencyFilterObject <- list()
      if (!is.null(self$`CURRENCY`)) {
        CurrencyFilterObject[["CURRENCY"]] <-
          self$`CURRENCY`$toJSON()
      }
      CurrencyFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CurrencyFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CurrencyFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CURRENCY`)) {
        `currency_object` <- CatalogsProductGroupCurrencyCriteria$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`CURRENCY`, auto_unbox = TRUE, digits = NA))
        self$`CURRENCY` <- `currency_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CurrencyFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`CURRENCY`)) {
          sprintf(
          '"CURRENCY":
          %s
          ',
          jsonlite::toJSON(self$`CURRENCY`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CurrencyFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CurrencyFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CURRENCY` <- CatalogsProductGroupCurrencyCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CURRENCY`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CurrencyFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CURRENCY`
      if (!is.null(input_json$`CURRENCY`)) {
        stopifnot(R6::is.R6(input_json$`CURRENCY`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CurrencyFilter: the required field `CURRENCY` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CurrencyFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CURRENCY` is null
      if (is.null(self$`CURRENCY`)) {
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
      # check if the required `CURRENCY` is null
      if (is.null(self$`CURRENCY`)) {
        invalid_fields["CURRENCY"] <- "Non-nullable required field `CURRENCY` cannot be null."
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
# CurrencyFilter$unlock()
#
## Below is an example to define the print function
# CurrencyFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CurrencyFilter$lock()

