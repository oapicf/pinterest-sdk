#' Create a new CatalogsProductGroupFiltersRequestAnyOf
#'
#' @description
#' CatalogsProductGroupFiltersRequestAnyOf Class
#'
#' @docType class
#' @title CatalogsProductGroupFiltersRequestAnyOf
#' @description CatalogsProductGroupFiltersRequestAnyOf Class
#' @format An \code{R6Class} generator object
#' @field any_of  list(\link{CatalogsProductGroupFilterKeys})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupFiltersRequestAnyOf <- R6::R6Class(
  "CatalogsProductGroupFiltersRequestAnyOf",
  public = list(
    `any_of` = NULL,

    #' @description
    #' Initialize a new CatalogsProductGroupFiltersRequestAnyOf class.
    #'
    #' @param any_of any_of
    #' @param ... Other optional arguments.
    initialize = function(`any_of`, ...) {
      if (!missing(`any_of`)) {
        stopifnot(is.vector(`any_of`), length(`any_of`) != 0)
        sapply(`any_of`, function(x) stopifnot(R6::is.R6(x)))
        self$`any_of` <- `any_of`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupFiltersRequestAnyOf in JSON format
    toJSON = function() {
      CatalogsProductGroupFiltersRequestAnyOfObject <- list()
      if (!is.null(self$`any_of`)) {
        CatalogsProductGroupFiltersRequestAnyOfObject[["any_of"]] <-
          lapply(self$`any_of`, function(x) x$toJSON())
      }
      CatalogsProductGroupFiltersRequestAnyOfObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFiltersRequestAnyOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupFiltersRequestAnyOf
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`any_of`)) {
        self$`any_of` <- ApiClient$new()$deserializeObj(this_object$`any_of`, "array[CatalogsProductGroupFilterKeys]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupFiltersRequestAnyOf in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`any_of`)) {
          sprintf(
          '"any_of":
          [%s]
',
          paste(sapply(self$`any_of`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFiltersRequestAnyOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupFiltersRequestAnyOf
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`any_of` <- ApiClient$new()$deserializeObj(this_object$`any_of`, "array[CatalogsProductGroupFilterKeys]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupFiltersRequestAnyOf and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `any_of`
      if (!is.null(input_json$`any_of`)) {
        stopifnot(is.vector(input_json$`any_of`), length(input_json$`any_of`) != 0)
        tmp <- sapply(input_json$`any_of`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupFiltersRequestAnyOf: the required field `any_of` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupFiltersRequestAnyOf
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `any_of` is null
      if (is.null(self$`any_of`)) {
        return(FALSE)
      }

      if (length(self$`any_of`) < 1) {
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
      # check if the required `any_of` is null
      if (is.null(self$`any_of`)) {
        invalid_fields["any_of"] <- "Non-nullable required field `any_of` cannot be null."
      }

      if (length(self$`any_of`) < 1) {
        invalid_fields["any_of"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CatalogsProductGroupFiltersRequestAnyOf$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupFiltersRequestAnyOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupFiltersRequestAnyOf$lock()

