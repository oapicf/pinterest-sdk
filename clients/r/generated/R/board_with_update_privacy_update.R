#' Create a new BoardWithUpdatePrivacyUpdate
#'
#' @description
#' Resource create or update operation model.
#'
#' @docType class
#' @title BoardWithUpdatePrivacyUpdate
#' @description BoardWithUpdatePrivacyUpdate Class
#' @format An \code{R6Class} generator object
#' @field description  character [optional]
#' @field name Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". character [optional]
#' @field privacy  \link{BoardUpdatePrivacy} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BoardWithUpdatePrivacyUpdate <- R6::R6Class(
  "BoardWithUpdatePrivacyUpdate",
  public = list(
    `description` = NULL,
    `name` = NULL,
    `privacy` = NULL,

    #' @description
    #' Initialize a new BoardWithUpdatePrivacyUpdate class.
    #'
    #' @param description description
    #' @param name Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
    #' @param privacy privacy
    #' @param ... Other optional arguments.
    initialize = function(`description` = NULL, `name` = NULL, `privacy` = NULL, ...) {
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`privacy`)) {
        if (!(`privacy` %in% c())) {
          stop(paste("Error! \"", `privacy`, "\" cannot be assigned to `privacy`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`privacy`))
        self$`privacy` <- `privacy`
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
    #' @return BoardWithUpdatePrivacyUpdate as a base R list.
    #' @examples
    #' # convert array of BoardWithUpdatePrivacyUpdate (x) to a data frame
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
    #' Convert BoardWithUpdatePrivacyUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BoardWithUpdatePrivacyUpdateObject <- list()
      if (!is.null(self$`description`)) {
        BoardWithUpdatePrivacyUpdateObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`name`)) {
        BoardWithUpdatePrivacyUpdateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`privacy`)) {
        BoardWithUpdatePrivacyUpdateObject[["privacy"]] <-
          self$extractSimpleType(self$`privacy`)
      }
      return(BoardWithUpdatePrivacyUpdateObject)
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
    #' Deserialize JSON string into an instance of BoardWithUpdatePrivacyUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardWithUpdatePrivacyUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`privacy`)) {
        `privacy_object` <- BoardUpdatePrivacy$new()
        `privacy_object`$fromJSON(jsonlite::toJSON(this_object$`privacy`, auto_unbox = TRUE, digits = NA))
        self$`privacy` <- `privacy_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BoardWithUpdatePrivacyUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BoardWithUpdatePrivacyUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardWithUpdatePrivacyUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`name` <- this_object$`name`
      self$`privacy` <- BoardUpdatePrivacy$new()$fromJSON(jsonlite::toJSON(this_object$`privacy`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BoardWithUpdatePrivacyUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BoardWithUpdatePrivacyUpdate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# BoardWithUpdatePrivacyUpdate$unlock()
#
## Below is an example to define the print function
# BoardWithUpdatePrivacyUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BoardWithUpdatePrivacyUpdate$lock()

