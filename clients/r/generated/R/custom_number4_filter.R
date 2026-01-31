#' Create a new CustomNumber4Filter
#'
#' @description
#' CustomNumber4Filter Class
#'
#' @docType class
#' @title CustomNumber4Filter
#' @description CustomNumber4Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_NUMBER_4  \link{CatalogsProductGroupUint32Criteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomNumber4Filter <- R6::R6Class(
  "CustomNumber4Filter",
  public = list(
    `CUSTOM_NUMBER_4` = NULL,

    #' @description
    #' Initialize a new CustomNumber4Filter class.
    #'
    #' @param CUSTOM_NUMBER_4 CUSTOM_NUMBER_4
    #' @param ... Other optional arguments.
    initialize = function(`CUSTOM_NUMBER_4`, ...) {
      if (!missing(`CUSTOM_NUMBER_4`)) {
        stopifnot(R6::is.R6(`CUSTOM_NUMBER_4`))
        self$`CUSTOM_NUMBER_4` <- `CUSTOM_NUMBER_4`
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
    #' @return CustomNumber4Filter as a base R list.
    #' @examples
    #' # convert array of CustomNumber4Filter (x) to a data frame
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
    #' Convert CustomNumber4Filter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomNumber4FilterObject <- list()
      if (!is.null(self$`CUSTOM_NUMBER_4`)) {
        CustomNumber4FilterObject[["CUSTOM_NUMBER_4"]] <-
          self$`CUSTOM_NUMBER_4`$toSimpleType()
      }
      return(CustomNumber4FilterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomNumber4Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomNumber4Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_NUMBER_4`)) {
        `custom_number_4_object` <- CatalogsProductGroupUint32Criteria$new()
        `custom_number_4_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_NUMBER_4`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_NUMBER_4` <- `custom_number_4_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomNumber4Filter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomNumber4Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomNumber4Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_NUMBER_4` <- CatalogsProductGroupUint32Criteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_NUMBER_4`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomNumber4Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_NUMBER_4`
      if (!is.null(input_json$`CUSTOM_NUMBER_4`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_NUMBER_4`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomNumber4Filter: the required field `CUSTOM_NUMBER_4` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomNumber4Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CUSTOM_NUMBER_4` is null
      if (is.null(self$`CUSTOM_NUMBER_4`)) {
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
      # check if the required `CUSTOM_NUMBER_4` is null
      if (is.null(self$`CUSTOM_NUMBER_4`)) {
        invalid_fields["CUSTOM_NUMBER_4"] <- "Non-nullable required field `CUSTOM_NUMBER_4` cannot be null."
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
# CustomNumber4Filter$unlock()
#
## Below is an example to define the print function
# CustomNumber4Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomNumber4Filter$lock()

