#' Create a new ConditionFilter
#'
#' @description
#' ConditionFilter Class
#'
#' @docType class
#' @title ConditionFilter
#' @description ConditionFilter Class
#' @format An \code{R6Class} generator object
#' @field CONDITION  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConditionFilter <- R6::R6Class(
  "ConditionFilter",
  public = list(
    `CONDITION` = NULL,

    #' @description
    #' Initialize a new ConditionFilter class.
    #'
    #' @param CONDITION CONDITION
    #' @param ... Other optional arguments.
    initialize = function(`CONDITION`, ...) {
      if (!missing(`CONDITION`)) {
        stopifnot(R6::is.R6(`CONDITION`))
        self$`CONDITION` <- `CONDITION`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConditionFilter in JSON format
    toJSON = function() {
      ConditionFilterObject <- list()
      if (!is.null(self$`CONDITION`)) {
        ConditionFilterObject[["CONDITION"]] <-
          self$`CONDITION`$toJSON()
      }
      ConditionFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ConditionFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConditionFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CONDITION`)) {
        `condition_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `condition_object`$fromJSON(jsonlite::toJSON(this_object$`CONDITION`, auto_unbox = TRUE, digits = NA))
        self$`CONDITION` <- `condition_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConditionFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`CONDITION`)) {
          sprintf(
          '"CONDITION":
          %s
          ',
          jsonlite::toJSON(self$`CONDITION`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConditionFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConditionFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CONDITION` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CONDITION`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConditionFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CONDITION`
      if (!is.null(input_json$`CONDITION`)) {
        stopifnot(R6::is.R6(input_json$`CONDITION`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConditionFilter: the required field `CONDITION` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConditionFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CONDITION` is null
      if (is.null(self$`CONDITION`)) {
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
      # check if the required `CONDITION` is null
      if (is.null(self$`CONDITION`)) {
        invalid_fields["CONDITION"] <- "Non-nullable required field `CONDITION` cannot be null."
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
# ConditionFilter$unlock()
#
## Below is an example to define the print function
# ConditionFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConditionFilter$lock()

