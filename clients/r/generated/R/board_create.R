#' Create a new BoardCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title BoardCreate
#' @description BoardCreate Class
#' @format An \code{R6Class} generator object
#' @field description  character [optional]
#' @field is_ads_only If set to `true`, the board will be ad-only and can store ad-only Pins. character [optional]
#' @field name Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". character
#' @field privacy Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. \link{BoardPrivacy} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BoardCreate <- R6::R6Class(
  "BoardCreate",
  public = list(
    `description` = NULL,
    `is_ads_only` = NULL,
    `name` = NULL,
    `privacy` = NULL,

    #' @description
    #' Initialize a new BoardCreate class.
    #'
    #' @param name Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
    #' @param description description
    #' @param is_ads_only If set to `true`, the board will be ad-only and can store ad-only Pins.. Default to FALSE.
    #' @param privacy Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`.
    #' @param ... Other optional arguments.
    initialize = function(`name`, `description` = NULL, `is_ads_only` = FALSE, `privacy` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`is_ads_only`)) {
        if (!(is.logical(`is_ads_only`) && length(`is_ads_only`) == 1)) {
          stop(paste("Error! Invalid data for `is_ads_only`. Must be a boolean:", `is_ads_only`))
        }
        self$`is_ads_only` <- `is_ads_only`
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
    #' @return BoardCreate as a base R list.
    #' @examples
    #' # convert array of BoardCreate (x) to a data frame
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
    #' Convert BoardCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BoardCreateObject <- list()
      if (!is.null(self$`description`)) {
        BoardCreateObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`is_ads_only`)) {
        BoardCreateObject[["is_ads_only"]] <-
          self$`is_ads_only`
      }
      if (!is.null(self$`name`)) {
        BoardCreateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`privacy`)) {
        BoardCreateObject[["privacy"]] <-
          self$extractSimpleType(self$`privacy`)
      }
      return(BoardCreateObject)
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
    #' Deserialize JSON string into an instance of BoardCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`is_ads_only`)) {
        self$`is_ads_only` <- this_object$`is_ads_only`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`privacy`)) {
        `privacy_object` <- BoardPrivacy$new()
        `privacy_object`$fromJSON(jsonlite::toJSON(this_object$`privacy`, auto_unbox = TRUE, digits = NA))
        self$`privacy` <- `privacy_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BoardCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BoardCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`is_ads_only` <- this_object$`is_ads_only`
      self$`name` <- this_object$`name`
      self$`privacy` <- BoardPrivacy$new()$fromJSON(jsonlite::toJSON(this_object$`privacy`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BoardCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BoardCreate: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BoardCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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
# BoardCreate$unlock()
#
## Below is an example to define the print function
# BoardCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BoardCreate$lock()

