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
    #' Initialize a new GenderFilter class.
    #'
    #' @description
    #' Initialize a new GenderFilter class.
    #'
    #' @param GENDER GENDER
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`GENDER`, ...) {
      if (!missing(`GENDER`)) {
        stopifnot(R6::is.R6(`GENDER`))
        self$`GENDER` <- `GENDER`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenderFilter in JSON format
    #' @export
    toJSON = function() {
      GenderFilterObject <- list()
      if (!is.null(self$`GENDER`)) {
        GenderFilterObject[["GENDER"]] <-
          self$`GENDER`$toJSON()
      }
      GenderFilterObject
    },
    #' Deserialize JSON string into an instance of GenderFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenderFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`GENDER`)) {
        `gender_object` <- CatalogsProductGroupMultipleGenderCriteria$new()
        `gender_object`$fromJSON(jsonlite::toJSON(this_object$`GENDER`, auto_unbox = TRUE, digits = NA))
        self$`GENDER` <- `gender_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenderFilter in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of GenderFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenderFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`GENDER` <- CatalogsProductGroupMultipleGenderCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`GENDER`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GenderFilter
    #'
    #' @description
    #' Validate JSON input with respect to GenderFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `GENDER`
      if (!is.null(input_json$`GENDER`)) {
        stopifnot(R6::is.R6(input_json$`GENDER`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderFilter: the required field `GENDER` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenderFilter
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
      # check if the required `GENDER` is null
      if (is.null(self$`GENDER`)) {
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
      # check if the required `GENDER` is null
      if (is.null(self$`GENDER`)) {
        invalid_fields["GENDER"] <- "Non-nullable required field `GENDER` cannot be null."
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
# GenderFilter$unlock()
#
## Below is an example to define the print function
# GenderFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenderFilter$lock()

