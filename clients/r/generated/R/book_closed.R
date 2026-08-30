#' Create a new BookClosed
#'
#' @description
#' BookClosed Class
#'
#' @docType class
#' @title BookClosed
#' @description BookClosed Class
#' @format An \code{R6Class} generator object
#' @field conversion_metrics_ready Are conversion metrics ready? character
#' @field non_conversion_metrics_ready Are non-conversion metrics ready? character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BookClosed <- R6::R6Class(
  "BookClosed",
  public = list(
    `conversion_metrics_ready` = NULL,
    `non_conversion_metrics_ready` = NULL,

    #' @description
    #' Initialize a new BookClosed class.
    #'
    #' @param conversion_metrics_ready Are conversion metrics ready?
    #' @param non_conversion_metrics_ready Are non-conversion metrics ready?
    #' @param ... Other optional arguments.
    initialize = function(`conversion_metrics_ready`, `non_conversion_metrics_ready`, ...) {
      if (!missing(`conversion_metrics_ready`)) {
        if (!(is.logical(`conversion_metrics_ready`) && length(`conversion_metrics_ready`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_metrics_ready`. Must be a boolean:", `conversion_metrics_ready`))
        }
        self$`conversion_metrics_ready` <- `conversion_metrics_ready`
      }
      if (!missing(`non_conversion_metrics_ready`)) {
        if (!(is.logical(`non_conversion_metrics_ready`) && length(`non_conversion_metrics_ready`) == 1)) {
          stop(paste("Error! Invalid data for `non_conversion_metrics_ready`. Must be a boolean:", `non_conversion_metrics_ready`))
        }
        self$`non_conversion_metrics_ready` <- `non_conversion_metrics_ready`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return BookClosed as a base R list.
    #' @examples
    #' # convert array of BookClosed (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert BookClosed to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BookClosedObject <- list()
      if (!is.null(self$`conversion_metrics_ready`)) {
        BookClosedObject[["conversion_metrics_ready"]] <-
          self$`conversion_metrics_ready`
      }
      if (!is.null(self$`non_conversion_metrics_ready`)) {
        BookClosedObject[["non_conversion_metrics_ready"]] <-
          self$`non_conversion_metrics_ready`
      }
      return(BookClosedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BookClosed
    #'
    #' @param input_json the JSON input
    #' @return the instance of BookClosed
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`conversion_metrics_ready`)) {
        self$`conversion_metrics_ready` <- this_object$`conversion_metrics_ready`
      }
      if (!is.null(this_object$`non_conversion_metrics_ready`)) {
        self$`non_conversion_metrics_ready` <- this_object$`non_conversion_metrics_ready`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BookClosed in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BookClosed
    #'
    #' @param input_json the JSON input
    #' @return the instance of BookClosed
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`conversion_metrics_ready` <- this_object$`conversion_metrics_ready`
      self$`non_conversion_metrics_ready` <- this_object$`non_conversion_metrics_ready`
      self
    },

    #' @description
    #' Validate JSON input with respect to BookClosed and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `conversion_metrics_ready`
      if (!is.null(input_json$`conversion_metrics_ready`)) {
        if (!(is.logical(input_json$`conversion_metrics_ready`) && length(input_json$`conversion_metrics_ready`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_metrics_ready`. Must be a boolean:", input_json$`conversion_metrics_ready`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BookClosed: the required field `conversion_metrics_ready` is missing."))
      }
      # check the required field `non_conversion_metrics_ready`
      if (!is.null(input_json$`non_conversion_metrics_ready`)) {
        if (!(is.logical(input_json$`non_conversion_metrics_ready`) && length(input_json$`non_conversion_metrics_ready`) == 1)) {
          stop(paste("Error! Invalid data for `non_conversion_metrics_ready`. Must be a boolean:", input_json$`non_conversion_metrics_ready`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BookClosed: the required field `non_conversion_metrics_ready` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BookClosed
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `conversion_metrics_ready` is null
      if (is.null(self$`conversion_metrics_ready`)) {
        return(FALSE)
      }

      # check if the required `non_conversion_metrics_ready` is null
      if (is.null(self$`non_conversion_metrics_ready`)) {
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
      # check if the required `conversion_metrics_ready` is null
      if (is.null(self$`conversion_metrics_ready`)) {
        invalid_fields["conversion_metrics_ready"] <- "Non-nullable required field `conversion_metrics_ready` cannot be null."
      }

      # check if the required `non_conversion_metrics_ready` is null
      if (is.null(self$`non_conversion_metrics_ready`)) {
        invalid_fields["non_conversion_metrics_ready"] <- "Non-nullable required field `non_conversion_metrics_ready` cannot be null."
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
# BookClosed$unlock()
#
## Below is an example to define the print function
# BookClosed$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BookClosed$lock()

