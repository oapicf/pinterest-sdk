#' Create a new CatalogsHotelProductGroupFiltersAnyOf
#'
#' @description
#' CatalogsHotelProductGroupFiltersAnyOf Class
#'
#' @docType class
#' @title CatalogsHotelProductGroupFiltersAnyOf
#' @description CatalogsHotelProductGroupFiltersAnyOf Class
#' @format An \code{R6Class} generator object
#' @field any_of  list(\link{CatalogsHotelProductGroupFilterKeys})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductGroupFiltersAnyOf <- R6::R6Class(
  "CatalogsHotelProductGroupFiltersAnyOf",
  public = list(
    `any_of` = NULL,
    #' Initialize a new CatalogsHotelProductGroupFiltersAnyOf class.
    #'
    #' @description
    #' Initialize a new CatalogsHotelProductGroupFiltersAnyOf class.
    #'
    #' @param any_of any_of
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`any_of`, ...) {
      if (!missing(`any_of`)) {
        stopifnot(is.vector(`any_of`), length(`any_of`) != 0)
        sapply(`any_of`, function(x) stopifnot(R6::is.R6(x)))
        self$`any_of` <- `any_of`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroupFiltersAnyOf in JSON format
    #' @export
    toJSON = function() {
      CatalogsHotelProductGroupFiltersAnyOfObject <- list()
      if (!is.null(self$`any_of`)) {
        CatalogsHotelProductGroupFiltersAnyOfObject[["any_of"]] <-
          lapply(self$`any_of`, function(x) x$toJSON())
      }
      CatalogsHotelProductGroupFiltersAnyOfObject
    },
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFiltersAnyOf
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFiltersAnyOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupFiltersAnyOf
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`any_of`)) {
        self$`any_of` <- ApiClient$new()$deserializeObj(this_object$`any_of`, "array[CatalogsHotelProductGroupFilterKeys]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroupFiltersAnyOf in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFiltersAnyOf
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFiltersAnyOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupFiltersAnyOf
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`any_of` <- ApiClient$new()$deserializeObj(this_object$`any_of`, "array[CatalogsHotelProductGroupFilterKeys]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CatalogsHotelProductGroupFiltersAnyOf
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsHotelProductGroupFiltersAnyOf and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `any_of`
      if (!is.null(input_json$`any_of`)) {
        stopifnot(is.vector(input_json$`any_of`), length(input_json$`any_of`) != 0)
        tmp <- sapply(input_json$`any_of`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroupFiltersAnyOf: the required field `any_of` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelProductGroupFiltersAnyOf
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
      # check if the required `any_of` is null
      if (is.null(self$`any_of`)) {
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
      # check if the required `any_of` is null
      if (is.null(self$`any_of`)) {
        invalid_fields["any_of"] <- "Non-nullable required field `any_of` cannot be null."
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
# CatalogsHotelProductGroupFiltersAnyOf$unlock()
#
## Below is an example to define the print function
# CatalogsHotelProductGroupFiltersAnyOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelProductGroupFiltersAnyOf$lock()

