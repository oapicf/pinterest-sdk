#' Create a new LinkFilter
#'
#' @description
#' LinkFilter Class
#'
#' @docType class
#' @title LinkFilter
#' @description LinkFilter Class
#' @format An \code{R6Class} generator object
#' @field LINK  \link{CatalogsProductGroupFilterOperatorTypeCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LinkFilter <- R6::R6Class(
  "LinkFilter",
  public = list(
    `LINK` = NULL,

    #' @description
    #' Initialize a new LinkFilter class.
    #'
    #' @param LINK LINK
    #' @param ... Other optional arguments.
    initialize = function(`LINK`, ...) {
      if (!missing(`LINK`)) {
        stopifnot(R6::is.R6(`LINK`))
        self$`LINK` <- `LINK`
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
    #' @return LinkFilter as a base R list.
    #' @examples
    #' # convert array of LinkFilter (x) to a data frame
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
    #' Convert LinkFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LinkFilterObject <- list()
      if (!is.null(self$`LINK`)) {
        LinkFilterObject[["LINK"]] <-
          self$extractSimpleType(self$`LINK`)
      }
      return(LinkFilterObject)
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
    #' Deserialize JSON string into an instance of LinkFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of LinkFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`LINK`)) {
        `link_object` <- CatalogsProductGroupFilterOperatorTypeCriteria$new()
        `link_object`$fromJSON(jsonlite::toJSON(this_object$`LINK`, auto_unbox = TRUE, digits = NA))
        self$`LINK` <- `link_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LinkFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LinkFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of LinkFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`LINK` <- CatalogsProductGroupFilterOperatorTypeCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`LINK`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to LinkFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `LINK`
      if (!is.null(input_json$`LINK`)) {
        stopifnot(R6::is.R6(input_json$`LINK`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LinkFilter: the required field `LINK` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LinkFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `LINK` is null
      if (is.null(self$`LINK`)) {
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
      # check if the required `LINK` is null
      if (is.null(self$`LINK`)) {
        invalid_fields["LINK"] <- "Non-nullable required field `LINK` cannot be null."
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
# LinkFilter$unlock()
#
## Below is an example to define the print function
# LinkFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LinkFilter$lock()

