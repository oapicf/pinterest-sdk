#' Create a new KeywordsCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title KeywordsCreate
#' @description KeywordsCreate Class
#' @format An \code{R6Class} generator object
#' @field keywords Keywords list(\link{KeywordCreateItem})
#' @field parent_id Keyword data character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordsCreate <- R6::R6Class(
  "KeywordsCreate",
  public = list(
    `keywords` = NULL,
    `parent_id` = NULL,

    #' @description
    #' Initialize a new KeywordsCreate class.
    #'
    #' @param keywords Keywords
    #' @param parent_id Keyword data
    #' @param ... Other optional arguments.
    initialize = function(`keywords`, `parent_id`, ...) {
      if (!missing(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
      if (!missing(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
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
    #' @return KeywordsCreate as a base R list.
    #' @examples
    #' # convert array of KeywordsCreate (x) to a data frame
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
    #' Convert KeywordsCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      KeywordsCreateObject <- list()
      if (!is.null(self$`keywords`)) {
        KeywordsCreateObject[["keywords"]] <-
          self$extractSimpleType(self$`keywords`)
      }
      if (!is.null(self$`parent_id`)) {
        KeywordsCreateObject[["parent_id"]] <-
          self$`parent_id`
      }
      return(KeywordsCreateObject)
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
    #' Deserialize JSON string into an instance of KeywordsCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordCreateItem]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`parent_id`)) {
        self$`parent_id` <- this_object$`parent_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return KeywordsCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordsCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordCreateItem]", loadNamespace("openapi"))
      self$`parent_id` <- this_object$`parent_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to KeywordsCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `keywords`
      if (!is.null(input_json$`keywords`)) {
        stopifnot(is.vector(input_json$`keywords`), length(input_json$`keywords`) != 0)
        tmp <- sapply(input_json$`keywords`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordsCreate: the required field `keywords` is missing."))
      }
      # check the required field `parent_id`
      if (!is.null(input_json$`parent_id`)) {
        if (!(is.character(input_json$`parent_id`) && length(input_json$`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", input_json$`parent_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordsCreate: the required field `parent_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordsCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `keywords` is null
      if (is.null(self$`keywords`)) {
        return(FALSE)
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
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
      # check if the required `keywords` is null
      if (is.null(self$`keywords`)) {
        invalid_fields["keywords"] <- "Non-nullable required field `keywords` cannot be null."
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        invalid_fields["parent_id"] <- "Non-nullable required field `parent_id` cannot be null."
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
# KeywordsCreate$unlock()
#
## Below is an example to define the print function
# KeywordsCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordsCreate$lock()

