#' Create a new GenderFilter
#'
#' @description
#' GenderFilter Class
#'
#' @docType class
#' @title GenderFilter
#' @description GenderFilter Class
#' @format An \code{R6Class} generator object
#' @field GENDER  \link{CatalogsProductGroupMultipleGenderCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenderFilter <- R6::R6Class(
  "GenderFilter",
  public = list(
    `GENDER` = NULL,

    #' @description
    #' Initialize a new GenderFilter class.
    #'
    #' @param GENDER GENDER
    #' @param ... Other optional arguments.
    initialize = function(`GENDER`, ...) {
      if (!missing(`GENDER`)) {
        stopifnot(R6::is.R6(`GENDER`))
        self$`GENDER` <- `GENDER`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return GenderFilter in JSON format
    toJSON = function() {
      GenderFilterObject <- list()
      if (!is.null(self$`GENDER`)) {
        GenderFilterObject[["GENDER"]] <-
          self$`GENDER`$toJSON()
      }
      GenderFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`GENDER`)) {
        `gender_object` <- CatalogsProductGroupMultipleGenderCriteria$new()
        `gender_object`$fromJSON(jsonlite::toJSON(this_object$`GENDER`, auto_unbox = TRUE, digits = NA))
        self$`GENDER` <- `gender_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return GenderFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`GENDER`)) {
          sprintf(
          '"GENDER":
          %s
          ',
          jsonlite::toJSON(self$`GENDER`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`GENDER` <- CatalogsProductGroupMultipleGenderCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`GENDER`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to GenderFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `GENDER`
      if (!is.null(input_json$`GENDER`)) {
        stopifnot(R6::is.R6(input_json$`GENDER`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderFilter: the required field `GENDER` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenderFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `GENDER` is null
      if (is.null(self$`GENDER`)) {
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
      # check if the required `GENDER` is null
      if (is.null(self$`GENDER`)) {
        invalid_fields["GENDER"] <- "Non-nullable required field `GENDER` cannot be null."
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
# GenderFilter$unlock()
#
## Below is an example to define the print function
# GenderFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenderFilter$lock()

