#' Create a new MinPriceFilter
#'
#' @description
#' MinPriceFilter Class
#'
#' @docType class
#' @title MinPriceFilter
#' @description MinPriceFilter Class
#' @format An \code{R6Class} generator object
#' @field MIN_PRICE  \link{CatalogsProductGroupPricingCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MinPriceFilter <- R6::R6Class(
  "MinPriceFilter",
  public = list(
    `MIN_PRICE` = NULL,
    #' Initialize a new MinPriceFilter class.
    #'
    #' @description
    #' Initialize a new MinPriceFilter class.
    #'
    #' @param MIN_PRICE MIN_PRICE
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`MIN_PRICE`, ...) {
      if (!missing(`MIN_PRICE`)) {
        stopifnot(R6::is.R6(`MIN_PRICE`))
        self$`MIN_PRICE` <- `MIN_PRICE`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MinPriceFilter in JSON format
    #' @export
    toJSON = function() {
      MinPriceFilterObject <- list()
      if (!is.null(self$`MIN_PRICE`)) {
        MinPriceFilterObject[["MIN_PRICE"]] <-
          self$`MIN_PRICE`$toJSON()
      }
      MinPriceFilterObject
    },
    #' Deserialize JSON string into an instance of MinPriceFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of MinPriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of MinPriceFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`MIN_PRICE`)) {
        `min_price_object` <- CatalogsProductGroupPricingCriteria$new()
        `min_price_object`$fromJSON(jsonlite::toJSON(this_object$`MIN_PRICE`, auto_unbox = TRUE, digits = NA))
        self$`MIN_PRICE` <- `min_price_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MinPriceFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`MIN_PRICE`)) {
          sprintf(
          '"MIN_PRICE":
          %s
          ',
          jsonlite::toJSON(self$`MIN_PRICE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MinPriceFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of MinPriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of MinPriceFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`MIN_PRICE` <- CatalogsProductGroupPricingCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`MIN_PRICE`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to MinPriceFilter
    #'
    #' @description
    #' Validate JSON input with respect to MinPriceFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `MIN_PRICE`
      if (!is.null(input_json$`MIN_PRICE`)) {
        stopifnot(R6::is.R6(input_json$`MIN_PRICE`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MinPriceFilter: the required field `MIN_PRICE` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MinPriceFilter
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
      # check if the required `MIN_PRICE` is null
      if (is.null(self$`MIN_PRICE`)) {
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
      # check if the required `MIN_PRICE` is null
      if (is.null(self$`MIN_PRICE`)) {
        invalid_fields["MIN_PRICE"] <- "Non-nullable required field `MIN_PRICE` cannot be null."
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
# MinPriceFilter$unlock()
#
## Below is an example to define the print function
# MinPriceFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MinPriceFilter$lock()

