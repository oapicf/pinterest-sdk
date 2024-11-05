#' Create a new CountryFilter
#'
#' @description
#' CountryFilter Class
#'
#' @docType class
#' @title CountryFilter
#' @description CountryFilter Class
#' @format An \code{R6Class} generator object
#' @field COUNTRY  \link{CatalogsProductGroupMultipleCountriesCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CountryFilter <- R6::R6Class(
  "CountryFilter",
  public = list(
    `COUNTRY` = NULL,

    #' @description
    #' Initialize a new CountryFilter class.
    #'
    #' @param COUNTRY COUNTRY
    #' @param ... Other optional arguments.
    initialize = function(`COUNTRY`, ...) {
      if (!missing(`COUNTRY`)) {
        stopifnot(R6::is.R6(`COUNTRY`))
        self$`COUNTRY` <- `COUNTRY`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CountryFilter in JSON format
    toJSON = function() {
      CountryFilterObject <- list()
      if (!is.null(self$`COUNTRY`)) {
        CountryFilterObject[["COUNTRY"]] <-
          self$`COUNTRY`$toJSON()
      }
      CountryFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CountryFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CountryFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`COUNTRY`)) {
        `country_object` <- CatalogsProductGroupMultipleCountriesCriteria$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`COUNTRY`, auto_unbox = TRUE, digits = NA))
        self$`COUNTRY` <- `country_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CountryFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`COUNTRY`)) {
          sprintf(
          '"COUNTRY":
          %s
          ',
          jsonlite::toJSON(self$`COUNTRY`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CountryFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CountryFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`COUNTRY` <- CatalogsProductGroupMultipleCountriesCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`COUNTRY`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CountryFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `COUNTRY`
      if (!is.null(input_json$`COUNTRY`)) {
        stopifnot(R6::is.R6(input_json$`COUNTRY`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CountryFilter: the required field `COUNTRY` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CountryFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `COUNTRY` is null
      if (is.null(self$`COUNTRY`)) {
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
      # check if the required `COUNTRY` is null
      if (is.null(self$`COUNTRY`)) {
        invalid_fields["COUNTRY"] <- "Non-nullable required field `COUNTRY` cannot be null."
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
# CountryFilter$unlock()
#
## Below is an example to define the print function
# CountryFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CountryFilter$lock()

