#' Create a new MediaTypeFilter
#'
#' @description
#' MediaTypeFilter Class
#'
#' @docType class
#' @title MediaTypeFilter
#' @description MediaTypeFilter Class
#' @format An \code{R6Class} generator object
#' @field MEDIA_TYPE  \link{CatalogsProductGroupMultipleMediaTypesCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MediaTypeFilter <- R6::R6Class(
  "MediaTypeFilter",
  public = list(
    `MEDIA_TYPE` = NULL,

    #' @description
    #' Initialize a new MediaTypeFilter class.
    #'
    #' @param MEDIA_TYPE MEDIA_TYPE
    #' @param ... Other optional arguments.
    initialize = function(`MEDIA_TYPE`, ...) {
      if (!missing(`MEDIA_TYPE`)) {
        stopifnot(R6::is.R6(`MEDIA_TYPE`))
        self$`MEDIA_TYPE` <- `MEDIA_TYPE`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MediaTypeFilter in JSON format
    toJSON = function() {
      MediaTypeFilterObject <- list()
      if (!is.null(self$`MEDIA_TYPE`)) {
        MediaTypeFilterObject[["MEDIA_TYPE"]] <-
          self$`MEDIA_TYPE`$toJSON()
      }
      MediaTypeFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MediaTypeFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaTypeFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`MEDIA_TYPE`)) {
        `media_type_object` <- CatalogsProductGroupMultipleMediaTypesCriteria$new()
        `media_type_object`$fromJSON(jsonlite::toJSON(this_object$`MEDIA_TYPE`, auto_unbox = TRUE, digits = NA))
        self$`MEDIA_TYPE` <- `media_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MediaTypeFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`MEDIA_TYPE`)) {
          sprintf(
          '"MEDIA_TYPE":
          %s
          ',
          jsonlite::toJSON(self$`MEDIA_TYPE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MediaTypeFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaTypeFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`MEDIA_TYPE` <- CatalogsProductGroupMultipleMediaTypesCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`MEDIA_TYPE`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MediaTypeFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `MEDIA_TYPE`
      if (!is.null(input_json$`MEDIA_TYPE`)) {
        stopifnot(R6::is.R6(input_json$`MEDIA_TYPE`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MediaTypeFilter: the required field `MEDIA_TYPE` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MediaTypeFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `MEDIA_TYPE` is null
      if (is.null(self$`MEDIA_TYPE`)) {
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
      # check if the required `MEDIA_TYPE` is null
      if (is.null(self$`MEDIA_TYPE`)) {
        invalid_fields["MEDIA_TYPE"] <- "Non-nullable required field `MEDIA_TYPE` cannot be null."
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
# MediaTypeFilter$unlock()
#
## Below is an example to define the print function
# MediaTypeFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MediaTypeFilter$lock()

