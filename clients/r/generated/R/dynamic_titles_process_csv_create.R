#' Create a new DynamicTitlesProcessCSVCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title DynamicTitlesProcessCSVCreate
#' @description DynamicTitlesProcessCSVCreate Class
#' @format An \code{R6Class} generator object
#' @field request_id The request_id returned from the GET uploads endpoint. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DynamicTitlesProcessCSVCreate <- R6::R6Class(
  "DynamicTitlesProcessCSVCreate",
  public = list(
    `request_id` = NULL,

    #' @description
    #' Initialize a new DynamicTitlesProcessCSVCreate class.
    #'
    #' @param request_id The request_id returned from the GET uploads endpoint.
    #' @param ... Other optional arguments.
    initialize = function(`request_id`, ...) {
      if (!missing(`request_id`)) {
        if (!(is.character(`request_id`) && length(`request_id`) == 1)) {
          stop(paste("Error! Invalid data for `request_id`. Must be a string:", `request_id`))
        }
        self$`request_id` <- `request_id`
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
    #' @return DynamicTitlesProcessCSVCreate as a base R list.
    #' @examples
    #' # convert array of DynamicTitlesProcessCSVCreate (x) to a data frame
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
    #' Convert DynamicTitlesProcessCSVCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DynamicTitlesProcessCSVCreateObject <- list()
      if (!is.null(self$`request_id`)) {
        DynamicTitlesProcessCSVCreateObject[["request_id"]] <-
          self$`request_id`
      }
      return(DynamicTitlesProcessCSVCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesProcessCSVCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesProcessCSVCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`request_id`)) {
        self$`request_id` <- this_object$`request_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DynamicTitlesProcessCSVCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesProcessCSVCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesProcessCSVCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`request_id` <- this_object$`request_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to DynamicTitlesProcessCSVCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `request_id`
      if (!is.null(input_json$`request_id`)) {
        if (!(is.character(input_json$`request_id`) && length(input_json$`request_id`) == 1)) {
          stop(paste("Error! Invalid data for `request_id`. Must be a string:", input_json$`request_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DynamicTitlesProcessCSVCreate: the required field `request_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DynamicTitlesProcessCSVCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `request_id` is null
      if (is.null(self$`request_id`)) {
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
      # check if the required `request_id` is null
      if (is.null(self$`request_id`)) {
        invalid_fields["request_id"] <- "Non-nullable required field `request_id` cannot be null."
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
# DynamicTitlesProcessCSVCreate$unlock()
#
## Below is an example to define the print function
# DynamicTitlesProcessCSVCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DynamicTitlesProcessCSVCreate$lock()

