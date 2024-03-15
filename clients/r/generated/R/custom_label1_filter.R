#' Create a new CustomLabel1Filter
#'
#' @description
#' CustomLabel1Filter Class
#'
#' @docType class
#' @title CustomLabel1Filter
#' @description CustomLabel1Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_LABEL_1  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomLabel1Filter <- R6::R6Class(
  "CustomLabel1Filter",
  public = list(
    `CUSTOM_LABEL_1` = NULL,
    #' Initialize a new CustomLabel1Filter class.
    #'
    #' @description
    #' Initialize a new CustomLabel1Filter class.
    #'
    #' @param CUSTOM_LABEL_1 CUSTOM_LABEL_1
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`CUSTOM_LABEL_1`, ...) {
      if (!missing(`CUSTOM_LABEL_1`)) {
        stopifnot(R6::is.R6(`CUSTOM_LABEL_1`))
        self$`CUSTOM_LABEL_1` <- `CUSTOM_LABEL_1`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel1Filter in JSON format
    #' @export
    toJSON = function() {
      CustomLabel1FilterObject <- list()
      if (!is.null(self$`CUSTOM_LABEL_1`)) {
        CustomLabel1FilterObject[["CUSTOM_LABEL_1"]] <-
          self$`CUSTOM_LABEL_1`$toJSON()
      }
      CustomLabel1FilterObject
    },
    #' Deserialize JSON string into an instance of CustomLabel1Filter
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomLabel1Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel1Filter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_LABEL_1`)) {
        `custom_label_1_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `custom_label_1_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_1`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_LABEL_1` <- `custom_label_1_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel1Filter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`CUSTOM_LABEL_1`)) {
          sprintf(
          '"CUSTOM_LABEL_1":
          %s
          ',
          jsonlite::toJSON(self$`CUSTOM_LABEL_1`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CustomLabel1Filter
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomLabel1Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel1Filter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_LABEL_1` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_1`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CustomLabel1Filter
    #'
    #' @description
    #' Validate JSON input with respect to CustomLabel1Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_LABEL_1`
      if (!is.null(input_json$`CUSTOM_LABEL_1`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_LABEL_1`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomLabel1Filter: the required field `CUSTOM_LABEL_1` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomLabel1Filter
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
      # check if the required `CUSTOM_LABEL_1` is null
      if (is.null(self$`CUSTOM_LABEL_1`)) {
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
      # check if the required `CUSTOM_LABEL_1` is null
      if (is.null(self$`CUSTOM_LABEL_1`)) {
        invalid_fields["CUSTOM_LABEL_1"] <- "Non-nullable required field `CUSTOM_LABEL_1` cannot be null."
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
# CustomLabel1Filter$unlock()
#
## Below is an example to define the print function
# CustomLabel1Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomLabel1Filter$lock()

