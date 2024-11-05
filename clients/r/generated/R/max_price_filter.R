#' Create a new MaxPriceFilter
#'
#' @description
#' MaxPriceFilter Class
#'
#' @docType class
#' @title MaxPriceFilter
#' @description MaxPriceFilter Class
#' @format An \code{R6Class} generator object
#' @field MAX_PRICE  \link{CatalogsProductGroupPricingCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MaxPriceFilter <- R6::R6Class(
  "MaxPriceFilter",
  public = list(
    `MAX_PRICE` = NULL,

    #' @description
    #' Initialize a new MaxPriceFilter class.
    #'
    #' @param MAX_PRICE MAX_PRICE
    #' @param ... Other optional arguments.
    initialize = function(`MAX_PRICE`, ...) {
      if (!missing(`MAX_PRICE`)) {
        stopifnot(R6::is.R6(`MAX_PRICE`))
        self$`MAX_PRICE` <- `MAX_PRICE`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MaxPriceFilter in JSON format
    toJSON = function() {
      MaxPriceFilterObject <- list()
      if (!is.null(self$`MAX_PRICE`)) {
        MaxPriceFilterObject[["MAX_PRICE"]] <-
          self$`MAX_PRICE`$toJSON()
      }
      MaxPriceFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MaxPriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of MaxPriceFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`MAX_PRICE`)) {
        `max_price_object` <- CatalogsProductGroupPricingCriteria$new()
        `max_price_object`$fromJSON(jsonlite::toJSON(this_object$`MAX_PRICE`, auto_unbox = TRUE, digits = NA))
        self$`MAX_PRICE` <- `max_price_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MaxPriceFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`MAX_PRICE`)) {
          sprintf(
          '"MAX_PRICE":
          %s
          ',
          jsonlite::toJSON(self$`MAX_PRICE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MaxPriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of MaxPriceFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`MAX_PRICE` <- CatalogsProductGroupPricingCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`MAX_PRICE`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MaxPriceFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `MAX_PRICE`
      if (!is.null(input_json$`MAX_PRICE`)) {
        stopifnot(R6::is.R6(input_json$`MAX_PRICE`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MaxPriceFilter: the required field `MAX_PRICE` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MaxPriceFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `MAX_PRICE` is null
      if (is.null(self$`MAX_PRICE`)) {
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
      # check if the required `MAX_PRICE` is null
      if (is.null(self$`MAX_PRICE`)) {
        invalid_fields["MAX_PRICE"] <- "Non-nullable required field `MAX_PRICE` cannot be null."
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
# MaxPriceFilter$unlock()
#
## Below is an example to define the print function
# MaxPriceFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MaxPriceFilter$lock()

