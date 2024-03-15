#' Create a new CatalogsProductGroupFiltersAllOf
#'
#' @description
#' CatalogsProductGroupFiltersAllOf Class
#'
#' @docType class
#' @title CatalogsProductGroupFiltersAllOf
#' @description CatalogsProductGroupFiltersAllOf Class
#' @format An \code{R6Class} generator object
#' @field all_of  list(\link{CatalogsProductGroupFilterKeys})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupFiltersAllOf <- R6::R6Class(
  "CatalogsProductGroupFiltersAllOf",
  public = list(
    `all_of` = NULL,
    #' Initialize a new CatalogsProductGroupFiltersAllOf class.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupFiltersAllOf class.
    #'
    #' @param all_of all_of
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`all_of`, ...) {
      if (!missing(`all_of`)) {
        stopifnot(is.vector(`all_of`), length(`all_of`) != 0)
        sapply(`all_of`, function(x) stopifnot(R6::is.R6(x)))
        self$`all_of` <- `all_of`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupFiltersAllOf in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductGroupFiltersAllOfObject <- list()
      if (!is.null(self$`all_of`)) {
        CatalogsProductGroupFiltersAllOfObject[["all_of"]] <-
          lapply(self$`all_of`, function(x) x$toJSON())
      }
      CatalogsProductGroupFiltersAllOfObject
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupFiltersAllOf
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFiltersAllOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupFiltersAllOf
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`all_of`)) {
        self$`all_of` <- ApiClient$new()$deserializeObj(this_object$`all_of`, "array[CatalogsProductGroupFilterKeys]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupFiltersAllOf in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`all_of`)) {
          sprintf(
          '"all_of":
          [%s]
',
          paste(sapply(self$`all_of`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupFiltersAllOf
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFiltersAllOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupFiltersAllOf
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`all_of` <- ApiClient$new()$deserializeObj(this_object$`all_of`, "array[CatalogsProductGroupFilterKeys]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CatalogsProductGroupFiltersAllOf
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupFiltersAllOf and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `all_of`
      if (!is.null(input_json$`all_of`)) {
        stopifnot(is.vector(input_json$`all_of`), length(input_json$`all_of`) != 0)
        tmp <- sapply(input_json$`all_of`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupFiltersAllOf: the required field `all_of` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupFiltersAllOf
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `all_of` is null
      if (is.null(self$`all_of`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `all_of` is null
      if (is.null(self$`all_of`)) {
        invalid_fields["all_of"] <- "Non-nullable required field `all_of` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsProductGroupFiltersAllOf$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupFiltersAllOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupFiltersAllOf$lock()

