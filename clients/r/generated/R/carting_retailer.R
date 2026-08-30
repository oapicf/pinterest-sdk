#' Create a new CartingRetailer
#'
#' @description
#' CartingRetailer Class
#'
#' @docType class
#' @title CartingRetailer
#' @description CartingRetailer Class
#' @format An \code{R6Class} generator object
#' @field retailer_id Unique identifier for the retailer character
#' @field retailer_name Name of the retailer character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CartingRetailer <- R6::R6Class(
  "CartingRetailer",
  public = list(
    `retailer_id` = NULL,
    `retailer_name` = NULL,

    #' @description
    #' Initialize a new CartingRetailer class.
    #'
    #' @param retailer_id Unique identifier for the retailer
    #' @param retailer_name Name of the retailer
    #' @param ... Other optional arguments.
    initialize = function(`retailer_id`, `retailer_name`, ...) {
      if (!missing(`retailer_id`)) {
        if (!(is.character(`retailer_id`) && length(`retailer_id`) == 1)) {
          stop(paste("Error! Invalid data for `retailer_id`. Must be a string:", `retailer_id`))
        }
        self$`retailer_id` <- `retailer_id`
      }
      if (!missing(`retailer_name`)) {
        if (!(is.character(`retailer_name`) && length(`retailer_name`) == 1)) {
          stop(paste("Error! Invalid data for `retailer_name`. Must be a string:", `retailer_name`))
        }
        self$`retailer_name` <- `retailer_name`
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
    #' @return CartingRetailer as a base R list.
    #' @examples
    #' # convert array of CartingRetailer (x) to a data frame
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
    #' Convert CartingRetailer to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CartingRetailerObject <- list()
      if (!is.null(self$`retailer_id`)) {
        CartingRetailerObject[["retailer_id"]] <-
          self$`retailer_id`
      }
      if (!is.null(self$`retailer_name`)) {
        CartingRetailerObject[["retailer_name"]] <-
          self$`retailer_name`
      }
      return(CartingRetailerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CartingRetailer
    #'
    #' @param input_json the JSON input
    #' @return the instance of CartingRetailer
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`retailer_id`)) {
        self$`retailer_id` <- this_object$`retailer_id`
      }
      if (!is.null(this_object$`retailer_name`)) {
        self$`retailer_name` <- this_object$`retailer_name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CartingRetailer in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CartingRetailer
    #'
    #' @param input_json the JSON input
    #' @return the instance of CartingRetailer
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`retailer_id` <- this_object$`retailer_id`
      self$`retailer_name` <- this_object$`retailer_name`
      self
    },

    #' @description
    #' Validate JSON input with respect to CartingRetailer and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `retailer_id`
      if (!is.null(input_json$`retailer_id`)) {
        if (!(is.character(input_json$`retailer_id`) && length(input_json$`retailer_id`) == 1)) {
          stop(paste("Error! Invalid data for `retailer_id`. Must be a string:", input_json$`retailer_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CartingRetailer: the required field `retailer_id` is missing."))
      }
      # check the required field `retailer_name`
      if (!is.null(input_json$`retailer_name`)) {
        if (!(is.character(input_json$`retailer_name`) && length(input_json$`retailer_name`) == 1)) {
          stop(paste("Error! Invalid data for `retailer_name`. Must be a string:", input_json$`retailer_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CartingRetailer: the required field `retailer_name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CartingRetailer
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `retailer_id` is null
      if (is.null(self$`retailer_id`)) {
        return(FALSE)
      }

      # check if the required `retailer_name` is null
      if (is.null(self$`retailer_name`)) {
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
      # check if the required `retailer_id` is null
      if (is.null(self$`retailer_id`)) {
        invalid_fields["retailer_id"] <- "Non-nullable required field `retailer_id` cannot be null."
      }

      # check if the required `retailer_name` is null
      if (is.null(self$`retailer_name`)) {
        invalid_fields["retailer_name"] <- "Non-nullable required field `retailer_name` cannot be null."
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
# CartingRetailer$unlock()
#
## Below is an example to define the print function
# CartingRetailer$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CartingRetailer$lock()

