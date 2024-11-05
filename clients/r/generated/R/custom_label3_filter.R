#' Create a new CustomLabel3Filter
#'
#' @description
#' CustomLabel3Filter Class
#'
#' @docType class
#' @title CustomLabel3Filter
#' @description CustomLabel3Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_LABEL_3  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomLabel3Filter <- R6::R6Class(
  "CustomLabel3Filter",
  public = list(
    `CUSTOM_LABEL_3` = NULL,

    #' @description
    #' Initialize a new CustomLabel3Filter class.
    #'
    #' @param CUSTOM_LABEL_3 CUSTOM_LABEL_3
    #' @param ... Other optional arguments.
    initialize = function(`CUSTOM_LABEL_3`, ...) {
      if (!missing(`CUSTOM_LABEL_3`)) {
        stopifnot(R6::is.R6(`CUSTOM_LABEL_3`))
        self$`CUSTOM_LABEL_3` <- `CUSTOM_LABEL_3`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel3Filter in JSON format
    toJSON = function() {
      CustomLabel3FilterObject <- list()
      if (!is.null(self$`CUSTOM_LABEL_3`)) {
        CustomLabel3FilterObject[["CUSTOM_LABEL_3"]] <-
          self$`CUSTOM_LABEL_3`$toJSON()
      }
      CustomLabel3FilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomLabel3Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel3Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_LABEL_3`)) {
        `custom_label_3_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `custom_label_3_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_3`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_LABEL_3` <- `custom_label_3_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel3Filter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`CUSTOM_LABEL_3`)) {
          sprintf(
          '"CUSTOM_LABEL_3":
          %s
          ',
          jsonlite::toJSON(self$`CUSTOM_LABEL_3`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomLabel3Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel3Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_LABEL_3` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_3`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomLabel3Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_LABEL_3`
      if (!is.null(input_json$`CUSTOM_LABEL_3`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_LABEL_3`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomLabel3Filter: the required field `CUSTOM_LABEL_3` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomLabel3Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CUSTOM_LABEL_3` is null
      if (is.null(self$`CUSTOM_LABEL_3`)) {
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
      # check if the required `CUSTOM_LABEL_3` is null
      if (is.null(self$`CUSTOM_LABEL_3`)) {
        invalid_fields["CUSTOM_LABEL_3"] <- "Non-nullable required field `CUSTOM_LABEL_3` cannot be null."
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
# CustomLabel3Filter$unlock()
#
## Below is an example to define the print function
# CustomLabel3Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomLabel3Filter$lock()

