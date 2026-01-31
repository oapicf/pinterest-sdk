#' Create a new TitleKeywordsFilter
#'
#' @description
#' TitleKeywordsFilter Class
#'
#' @docType class
#' @title TitleKeywordsFilter
#' @description TitleKeywordsFilter Class
#' @format An \code{R6Class} generator object
#' @field TITLE_KEYWORDS  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TitleKeywordsFilter <- R6::R6Class(
  "TitleKeywordsFilter",
  public = list(
    `TITLE_KEYWORDS` = NULL,

    #' @description
    #' Initialize a new TitleKeywordsFilter class.
    #'
    #' @param TITLE_KEYWORDS TITLE_KEYWORDS
    #' @param ... Other optional arguments.
    initialize = function(`TITLE_KEYWORDS`, ...) {
      if (!missing(`TITLE_KEYWORDS`)) {
        stopifnot(R6::is.R6(`TITLE_KEYWORDS`))
        self$`TITLE_KEYWORDS` <- `TITLE_KEYWORDS`
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
    #' @return TitleKeywordsFilter as a base R list.
    #' @examples
    #' # convert array of TitleKeywordsFilter (x) to a data frame
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
    #' Convert TitleKeywordsFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TitleKeywordsFilterObject <- list()
      if (!is.null(self$`TITLE_KEYWORDS`)) {
        TitleKeywordsFilterObject[["TITLE_KEYWORDS"]] <-
          self$`TITLE_KEYWORDS`$toSimpleType()
      }
      return(TitleKeywordsFilterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TitleKeywordsFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of TitleKeywordsFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`TITLE_KEYWORDS`)) {
        `title_keywords_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `title_keywords_object`$fromJSON(jsonlite::toJSON(this_object$`TITLE_KEYWORDS`, auto_unbox = TRUE, digits = NA))
        self$`TITLE_KEYWORDS` <- `title_keywords_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TitleKeywordsFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TitleKeywordsFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of TitleKeywordsFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`TITLE_KEYWORDS` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`TITLE_KEYWORDS`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TitleKeywordsFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `TITLE_KEYWORDS`
      if (!is.null(input_json$`TITLE_KEYWORDS`)) {
        stopifnot(R6::is.R6(input_json$`TITLE_KEYWORDS`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TitleKeywordsFilter: the required field `TITLE_KEYWORDS` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TitleKeywordsFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `TITLE_KEYWORDS` is null
      if (is.null(self$`TITLE_KEYWORDS`)) {
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
      # check if the required `TITLE_KEYWORDS` is null
      if (is.null(self$`TITLE_KEYWORDS`)) {
        invalid_fields["TITLE_KEYWORDS"] <- "Non-nullable required field `TITLE_KEYWORDS` cannot be null."
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
# TitleKeywordsFilter$unlock()
#
## Below is an example to define the print function
# TitleKeywordsFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TitleKeywordsFilter$lock()

