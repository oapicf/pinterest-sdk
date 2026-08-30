#' Create a new ProductTagsError
#'
#' @description
#' Error response for requests containing ineligible product tags.
#'
#' @docType class
#' @title ProductTagsError
#' @description ProductTagsError Class
#' @format An \code{R6Class} generator object
#' @field code  integer
#' @field details Details about which product tags failed eligibility check. \link{IneligibleProductTagsErrorDetails} [optional]
#' @field message  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductTagsError <- R6::R6Class(
  "ProductTagsError",
  public = list(
    `code` = NULL,
    `details` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new ProductTagsError class.
    #'
    #' @param code code
    #' @param message message
    #' @param details Details about which product tags failed eligibility check.
    #' @param ... Other optional arguments.
    initialize = function(`code`, `message`, `details` = NULL, ...) {
      if (!missing(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`details`)) {
        stopifnot(R6::is.R6(`details`))
        self$`details` <- `details`
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
    #' @return ProductTagsError as a base R list.
    #' @examples
    #' # convert array of ProductTagsError (x) to a data frame
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
    #' Convert ProductTagsError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductTagsErrorObject <- list()
      if (!is.null(self$`code`)) {
        ProductTagsErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`details`)) {
        ProductTagsErrorObject[["details"]] <-
          self$extractSimpleType(self$`details`)
      }
      if (!is.null(self$`message`)) {
        ProductTagsErrorObject[["message"]] <-
          self$`message`
      }
      return(ProductTagsErrorObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductTagsError
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductTagsError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`details`)) {
        `details_object` <- IneligibleProductTagsErrorDetails$new()
        `details_object`$fromJSON(jsonlite::toJSON(this_object$`details`, auto_unbox = TRUE, digits = NA))
        self$`details` <- `details_object`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductTagsError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductTagsError
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductTagsError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`details` <- IneligibleProductTagsErrorDetails$new()$fromJSON(jsonlite::toJSON(this_object$`details`, auto_unbox = TRUE, digits = NA))
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductTagsError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        if (!(is.numeric(input_json$`code`) && length(input_json$`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", input_json$`code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductTagsError: the required field `code` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductTagsError: the required field `message` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductTagsError
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        return(FALSE)
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
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
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        invalid_fields["code"] <- "Non-nullable required field `code` cannot be null."
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
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
# ProductTagsError$unlock()
#
## Below is an example to define the print function
# ProductTagsError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductTagsError$lock()

