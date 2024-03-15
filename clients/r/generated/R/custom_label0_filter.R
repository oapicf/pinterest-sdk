#' Create a new CustomLabel0Filter
#'
#' @description
#' CustomLabel0Filter Class
#'
#' @docType class
#' @title CustomLabel0Filter
#' @description CustomLabel0Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_LABEL_0  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomLabel0Filter <- R6::R6Class(
  "CustomLabel0Filter",
  public = list(
    `CUSTOM_LABEL_0` = NULL,
    #' Initialize a new CustomLabel0Filter class.
    #'
    #' @description
    #' Initialize a new CustomLabel0Filter class.
    #'
    #' @param CUSTOM_LABEL_0 CUSTOM_LABEL_0
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`CUSTOM_LABEL_0`, ...) {
      if (!missing(`CUSTOM_LABEL_0`)) {
        stopifnot(R6::is.R6(`CUSTOM_LABEL_0`))
        self$`CUSTOM_LABEL_0` <- `CUSTOM_LABEL_0`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel0Filter in JSON format
    #' @export
    toJSON = function() {
      CustomLabel0FilterObject <- list()
      if (!is.null(self$`CUSTOM_LABEL_0`)) {
        CustomLabel0FilterObject[["CUSTOM_LABEL_0"]] <-
          self$`CUSTOM_LABEL_0`$toJSON()
      }
      CustomLabel0FilterObject
    },
    #' Deserialize JSON string into an instance of CustomLabel0Filter
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomLabel0Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel0Filter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_LABEL_0`)) {
        `custom_label_0_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `custom_label_0_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_0`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_LABEL_0` <- `custom_label_0_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel0Filter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`CUSTOM_LABEL_0`)) {
          sprintf(
          '"CUSTOM_LABEL_0":
          %s
          ',
          jsonlite::toJSON(self$`CUSTOM_LABEL_0`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CustomLabel0Filter
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomLabel0Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel0Filter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_LABEL_0` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_0`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CustomLabel0Filter
    #'
    #' @description
    #' Validate JSON input with respect to CustomLabel0Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_LABEL_0`
      if (!is.null(input_json$`CUSTOM_LABEL_0`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_LABEL_0`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomLabel0Filter: the required field `CUSTOM_LABEL_0` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomLabel0Filter
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
      # check if the required `CUSTOM_LABEL_0` is null
      if (is.null(self$`CUSTOM_LABEL_0`)) {
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
      # check if the required `CUSTOM_LABEL_0` is null
      if (is.null(self$`CUSTOM_LABEL_0`)) {
        invalid_fields["CUSTOM_LABEL_0"] <- "Non-nullable required field `CUSTOM_LABEL_0` cannot be null."
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
# CustomLabel0Filter$unlock()
#
## Below is an example to define the print function
# CustomLabel0Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomLabel0Filter$lock()

