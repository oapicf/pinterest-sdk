#' Create a new PriceFilter
#'
#' @description
#' PriceFilter Class
#'
#' @docType class
#' @title PriceFilter
#' @description PriceFilter Class
#' @format An \code{R6Class} generator object
#' @field PRICE  \link{CatalogsProductGroupPricingCurrencyCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceFilter <- R6::R6Class(
  "PriceFilter",
  public = list(
    `PRICE` = NULL,
    #' Initialize a new PriceFilter class.
    #'
    #' @description
    #' Initialize a new PriceFilter class.
    #'
    #' @param PRICE PRICE
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`PRICE`, ...) {
      if (!missing(`PRICE`)) {
        stopifnot(R6::is.R6(`PRICE`))
        self$`PRICE` <- `PRICE`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceFilter in JSON format
    #' @export
    toJSON = function() {
      PriceFilterObject <- list()
      if (!is.null(self$`PRICE`)) {
        PriceFilterObject[["PRICE"]] <-
          self$`PRICE`$toJSON()
      }
      PriceFilterObject
    },
    #' Deserialize JSON string into an instance of PriceFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`PRICE`)) {
        `price_object` <- CatalogsProductGroupPricingCurrencyCriteria$new()
        `price_object`$fromJSON(jsonlite::toJSON(this_object$`PRICE`, auto_unbox = TRUE, digits = NA))
        self$`PRICE` <- `price_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`PRICE`)) {
          sprintf(
          '"PRICE":
          %s
          ',
          jsonlite::toJSON(self$`PRICE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PriceFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`PRICE` <- CatalogsProductGroupPricingCurrencyCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`PRICE`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to PriceFilter
    #'
    #' @description
    #' Validate JSON input with respect to PriceFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `PRICE`
      if (!is.null(input_json$`PRICE`)) {
        stopifnot(R6::is.R6(input_json$`PRICE`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceFilter: the required field `PRICE` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PriceFilter
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
      # check if the required `PRICE` is null
      if (is.null(self$`PRICE`)) {
        return(FALSE)
      }

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
      # check if the required `PRICE` is null
      if (is.null(self$`PRICE`)) {
        invalid_fields["PRICE"] <- "Non-nullable required field `PRICE` cannot be null."
      }

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
# PriceFilter$unlock()
#
## Below is an example to define the print function
# PriceFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceFilter$lock()

