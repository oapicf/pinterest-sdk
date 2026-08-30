#' Create a new KeywordUpdateItem
#'
#' @description
#' KeywordUpdateItem Class
#'
#' @docType class
#' @title KeywordUpdateItem
#' @description KeywordUpdateItem Class
#' @format An \code{R6Class} generator object
#' @field archived  character [optional]
#' @field bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. integer [optional]
#' @field id Keyword ID . character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordUpdateItem <- R6::R6Class(
  "KeywordUpdateItem",
  public = list(
    `archived` = NULL,
    `bid` = NULL,
    `id` = NULL,

    #' @description
    #' Initialize a new KeywordUpdateItem class.
    #'
    #' @param id Keyword ID .
    #' @param archived archived
    #' @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `archived` = NULL, `bid` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`archived`)) {
        if (!(is.logical(`archived`) && length(`archived`) == 1)) {
          stop(paste("Error! Invalid data for `archived`. Must be a boolean:", `archived`))
        }
        self$`archived` <- `archived`
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
    #' @return KeywordUpdateItem as a base R list.
    #' @examples
    #' # convert array of KeywordUpdateItem (x) to a data frame
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
    #' Convert KeywordUpdateItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      KeywordUpdateItemObject <- list()
      if (!is.null(self$`archived`)) {
        KeywordUpdateItemObject[["archived"]] <-
          self$`archived`
      }
      if (!is.null(self$`bid`)) {
        KeywordUpdateItemObject[["bid"]] <-
          self$`bid`
      }
      if (!is.null(self$`id`)) {
        KeywordUpdateItemObject[["id"]] <-
          self$`id`
      }
      return(KeywordUpdateItemObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordUpdateItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordUpdateItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`archived`)) {
        self$`archived` <- this_object$`archived`
      }
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return KeywordUpdateItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordUpdateItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordUpdateItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`archived` <- this_object$`archived`
      self$`bid` <- this_object$`bid`
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to KeywordUpdateItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordUpdateItem: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordUpdateItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# KeywordUpdateItem$unlock()
#
## Below is an example to define the print function
# KeywordUpdateItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordUpdateItem$lock()

