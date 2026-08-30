#' Create a new CustomerSegmentCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title CustomerSegmentCreate
#' @description CustomerSegmentCreate Class
#' @format An \code{R6Class} generator object
#' @field audience_ids Audience IDs included in the customer segment. list(character)
#' @field name Customer segment name. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerSegmentCreate <- R6::R6Class(
  "CustomerSegmentCreate",
  public = list(
    `audience_ids` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new CustomerSegmentCreate class.
    #'
    #' @param audience_ids Audience IDs included in the customer segment.
    #' @param name Customer segment name.
    #' @param ... Other optional arguments.
    initialize = function(`audience_ids`, `name`, ...) {
      if (!missing(`audience_ids`)) {
        stopifnot(is.vector(`audience_ids`), length(`audience_ids`) != 0)
        sapply(`audience_ids`, function(x) stopifnot(is.character(x)))
        self$`audience_ids` <- `audience_ids`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return CustomerSegmentCreate as a base R list.
    #' @examples
    #' # convert array of CustomerSegmentCreate (x) to a data frame
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
    #' Convert CustomerSegmentCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerSegmentCreateObject <- list()
      if (!is.null(self$`audience_ids`)) {
        CustomerSegmentCreateObject[["audience_ids"]] <-
          self$`audience_ids`
      }
      if (!is.null(self$`name`)) {
        CustomerSegmentCreateObject[["name"]] <-
          self$`name`
      }
      return(CustomerSegmentCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerSegmentCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerSegmentCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_ids`)) {
        self$`audience_ids` <- ApiClient$new()$deserializeObj(this_object$`audience_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerSegmentCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerSegmentCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerSegmentCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_ids` <- ApiClient$new()$deserializeObj(this_object$`audience_ids`, "array[character]", loadNamespace("openapi"))
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerSegmentCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `audience_ids`
      if (!is.null(input_json$`audience_ids`)) {
        stopifnot(is.vector(input_json$`audience_ids`), length(input_json$`audience_ids`) != 0)
        tmp <- sapply(input_json$`audience_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerSegmentCreate: the required field `audience_ids` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerSegmentCreate: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerSegmentCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `audience_ids` is null
      if (is.null(self$`audience_ids`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `audience_ids` is null
      if (is.null(self$`audience_ids`)) {
        invalid_fields["audience_ids"] <- "Non-nullable required field `audience_ids` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# CustomerSegmentCreate$unlock()
#
## Below is an example to define the print function
# CustomerSegmentCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerSegmentCreate$lock()

