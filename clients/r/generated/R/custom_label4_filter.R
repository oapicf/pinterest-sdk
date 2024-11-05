#' Create a new CustomLabel4Filter
#'
#' @description
#' CustomLabel4Filter Class
#'
#' @docType class
#' @title CustomLabel4Filter
#' @description CustomLabel4Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_LABEL_4  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomLabel4Filter <- R6::R6Class(
  "CustomLabel4Filter",
  public = list(
    `CUSTOM_LABEL_4` = NULL,

    #' @description
    #' Initialize a new CustomLabel4Filter class.
    #'
    #' @param CUSTOM_LABEL_4 CUSTOM_LABEL_4
    #' @param ... Other optional arguments.
    initialize = function(`CUSTOM_LABEL_4`, ...) {
      if (!missing(`CUSTOM_LABEL_4`)) {
        stopifnot(R6::is.R6(`CUSTOM_LABEL_4`))
        self$`CUSTOM_LABEL_4` <- `CUSTOM_LABEL_4`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel4Filter in JSON format
    toJSON = function() {
      CustomLabel4FilterObject <- list()
      if (!is.null(self$`CUSTOM_LABEL_4`)) {
        CustomLabel4FilterObject[["CUSTOM_LABEL_4"]] <-
          self$`CUSTOM_LABEL_4`$toJSON()
      }
      CustomLabel4FilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomLabel4Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel4Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_LABEL_4`)) {
        `custom_label_4_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `custom_label_4_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_4`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_LABEL_4` <- `custom_label_4_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CustomLabel4Filter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`CUSTOM_LABEL_4`)) {
          sprintf(
          '"CUSTOM_LABEL_4":
          %s
          ',
          jsonlite::toJSON(self$`CUSTOM_LABEL_4`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomLabel4Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel4Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_LABEL_4` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_4`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomLabel4Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_LABEL_4`
      if (!is.null(input_json$`CUSTOM_LABEL_4`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_LABEL_4`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomLabel4Filter: the required field `CUSTOM_LABEL_4` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomLabel4Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CUSTOM_LABEL_4` is null
      if (is.null(self$`CUSTOM_LABEL_4`)) {
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
      # check if the required `CUSTOM_LABEL_4` is null
      if (is.null(self$`CUSTOM_LABEL_4`)) {
        invalid_fields["CUSTOM_LABEL_4"] <- "Non-nullable required field `CUSTOM_LABEL_4` cannot be null."
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
# CustomLabel4Filter$unlock()
#
## Below is an example to define the print function
# CustomLabel4Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomLabel4Filter$lock()

