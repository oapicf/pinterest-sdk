#' Create a new AvailabilityFilter
#'
#' @description
#' AvailabilityFilter Class
#'
#' @docType class
#' @title AvailabilityFilter
#' @description AvailabilityFilter Class
#' @format An \code{R6Class} generator object
#' @field AVAILABILITY  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AvailabilityFilter <- R6::R6Class(
  "AvailabilityFilter",
  public = list(
    `AVAILABILITY` = NULL,
    #' Initialize a new AvailabilityFilter class.
    #'
    #' @description
    #' Initialize a new AvailabilityFilter class.
    #'
    #' @param AVAILABILITY AVAILABILITY
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`AVAILABILITY`, ...) {
      if (!missing(`AVAILABILITY`)) {
        stopifnot(R6::is.R6(`AVAILABILITY`))
        self$`AVAILABILITY` <- `AVAILABILITY`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AvailabilityFilter in JSON format
    #' @export
    toJSON = function() {
      AvailabilityFilterObject <- list()
      if (!is.null(self$`AVAILABILITY`)) {
        AvailabilityFilterObject[["AVAILABILITY"]] <-
          self$`AVAILABILITY`$toJSON()
      }
      AvailabilityFilterObject
    },
    #' Deserialize JSON string into an instance of AvailabilityFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of AvailabilityFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of AvailabilityFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AVAILABILITY`)) {
        `availability_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `availability_object`$fromJSON(jsonlite::toJSON(this_object$`AVAILABILITY`, auto_unbox = TRUE, digits = NA))
        self$`AVAILABILITY` <- `availability_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AvailabilityFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`AVAILABILITY`)) {
          sprintf(
          '"AVAILABILITY":
          %s
          ',
          jsonlite::toJSON(self$`AVAILABILITY`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AvailabilityFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of AvailabilityFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of AvailabilityFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AVAILABILITY` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`AVAILABILITY`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to AvailabilityFilter
    #'
    #' @description
    #' Validate JSON input with respect to AvailabilityFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `AVAILABILITY`
      if (!is.null(input_json$`AVAILABILITY`)) {
        stopifnot(R6::is.R6(input_json$`AVAILABILITY`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AvailabilityFilter: the required field `AVAILABILITY` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AvailabilityFilter
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
      # check if the required `AVAILABILITY` is null
      if (is.null(self$`AVAILABILITY`)) {
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
      # check if the required `AVAILABILITY` is null
      if (is.null(self$`AVAILABILITY`)) {
        invalid_fields["AVAILABILITY"] <- "Non-nullable required field `AVAILABILITY` cannot be null."
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
# AvailabilityFilter$unlock()
#
## Below is an example to define the print function
# AvailabilityFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AvailabilityFilter$lock()

