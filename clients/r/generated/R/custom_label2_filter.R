#' Create a new CustomLabel2Filter
#'
#' @description
#' CustomLabel2Filter Class
#'
#' @docType class
#' @title CustomLabel2Filter
#' @description CustomLabel2Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_LABEL_2  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomLabel2Filter <- R6::R6Class(
  "CustomLabel2Filter",
  public = list(
    `CUSTOM_LABEL_2` = NULL,
    #' Initialize a new CustomLabel2Filter class.
    #'
    #' @description
    #' Initialize a new CustomLabel2Filter class.
    #'
    #' @param CUSTOM_LABEL_2 CUSTOM_LABEL_2
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`CUSTOM_LABEL_2`, ...) {
      if (!missing(`CUSTOM_LABEL_2`)) {
        stopifnot(R6::is.R6(`CUSTOM_LABEL_2`))
        self$`CUSTOM_LABEL_2` <- `CUSTOM_LABEL_2`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel2Filter in JSON format
    #' @export
    toJSON = function() {
      CustomLabel2FilterObject <- list()
      if (!is.null(self$`CUSTOM_LABEL_2`)) {
        CustomLabel2FilterObject[["CUSTOM_LABEL_2"]] <-
          self$`CUSTOM_LABEL_2`$toJSON()
      }
      CustomLabel2FilterObject
    },
    #' Deserialize JSON string into an instance of CustomLabel2Filter
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomLabel2Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel2Filter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_LABEL_2`)) {
        `custom_label_2_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `custom_label_2_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_2`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_LABEL_2` <- `custom_label_2_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel2Filter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`CUSTOM_LABEL_2`)) {
          sprintf(
          '"CUSTOM_LABEL_2":
          %s
          ',
          jsonlite::toJSON(self$`CUSTOM_LABEL_2`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CustomLabel2Filter
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomLabel2Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel2Filter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_LABEL_2` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_2`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CustomLabel2Filter
    #'
    #' @description
    #' Validate JSON input with respect to CustomLabel2Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_LABEL_2`
      if (!is.null(input_json$`CUSTOM_LABEL_2`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_LABEL_2`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomLabel2Filter: the required field `CUSTOM_LABEL_2` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomLabel2Filter
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
      # check if the required `CUSTOM_LABEL_2` is null
      if (is.null(self$`CUSTOM_LABEL_2`)) {
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
      # check if the required `CUSTOM_LABEL_2` is null
      if (is.null(self$`CUSTOM_LABEL_2`)) {
        invalid_fields["CUSTOM_LABEL_2"] <- "Non-nullable required field `CUSTOM_LABEL_2` cannot be null."
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
# CustomLabel2Filter$unlock()
#
## Below is an example to define the print function
# CustomLabel2Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomLabel2Filter$lock()

