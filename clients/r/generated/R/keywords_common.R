#' Create a new KeywordsCommon
#'
#' @description
#' KeywordsCommon Class
#'
#' @docType class
#' @title KeywordsCommon
#' @description KeywordsCommon Class
#' @format An \code{R6Class} generator object
#' @field bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. integer [optional]
#' @field match_type  \link{MatchTypeResponse}
#' @field value Keyword value (120 chars max). character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordsCommon <- R6::R6Class(
  "KeywordsCommon",
  public = list(
    `bid` = NULL,
    `match_type` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new KeywordsCommon class.
    #'
    #' @param match_type match_type
    #' @param value Keyword value (120 chars max).
    #' @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
    #' @param ... Other optional arguments.
    initialize = function(`match_type`, `value`, `bid` = NULL, ...) {
      if (!missing(`match_type`)) {
        if (!(`match_type` %in% c())) {
          stop(paste("Error! \"", `match_type`, "\" cannot be assigned to `match_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`match_type`))
        self$`match_type` <- `match_type`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`bid`)) {
        if (!(is.numeric(`bid`) && length(`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", `bid`))
        }
        self$`bid` <- `bid`
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
    #' @return KeywordsCommon as a base R list.
    #' @examples
    #' # convert array of KeywordsCommon (x) to a data frame
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
    #' Convert KeywordsCommon to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      KeywordsCommonObject <- list()
      if (!is.null(self$`bid`)) {
        KeywordsCommonObject[["bid"]] <-
          self$`bid`
      }
      if (!is.null(self$`match_type`)) {
        KeywordsCommonObject[["match_type"]] <-
          self$extractSimpleType(self$`match_type`)
      }
      if (!is.null(self$`value`)) {
        KeywordsCommonObject[["value"]] <-
          self$`value`
      }
      return(KeywordsCommonObject)
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
    #' Deserialize JSON string into an instance of KeywordsCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsCommon
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      if (!is.null(this_object$`match_type`)) {
        `match_type_object` <- MatchTypeResponse$new()
        `match_type_object`$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
        self$`match_type` <- `match_type_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return KeywordsCommon in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordsCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsCommon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid` <- this_object$`bid`
      self$`match_type` <- MatchTypeResponse$new()$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to KeywordsCommon and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `match_type`
      if (!is.null(input_json$`match_type`)) {
        stopifnot(R6::is.R6(input_json$`match_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordsCommon: the required field `match_type` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordsCommon: the required field `value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordsCommon
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `value` is null
      if (is.null(self$`value`)) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# KeywordsCommon$unlock()
#
## Below is an example to define the print function
# KeywordsCommon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordsCommon$lock()

