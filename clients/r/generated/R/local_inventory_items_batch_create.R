#' Create a new LocalInventoryItemsBatchCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title LocalInventoryItemsBatchCreate
#' @description LocalInventoryItemsBatchCreate Class
#' @format An \code{R6Class} generator object
#' @field operations Array of inventory operations. Up to 1000 items per request. list(\link{LocalInventoryOperation})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocalInventoryItemsBatchCreate <- R6::R6Class(
  "LocalInventoryItemsBatchCreate",
  public = list(
    `operations` = NULL,

    #' @description
    #' Initialize a new LocalInventoryItemsBatchCreate class.
    #'
    #' @param operations Array of inventory operations. Up to 1000 items per request.
    #' @param ... Other optional arguments.
    initialize = function(`operations`, ...) {
      if (!missing(`operations`)) {
        stopifnot(is.vector(`operations`), length(`operations`) != 0)
        sapply(`operations`, function(x) stopifnot(R6::is.R6(x)))
        self$`operations` <- `operations`
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
    #' @return LocalInventoryItemsBatchCreate as a base R list.
    #' @examples
    #' # convert array of LocalInventoryItemsBatchCreate (x) to a data frame
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
    #' Convert LocalInventoryItemsBatchCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocalInventoryItemsBatchCreateObject <- list()
      if (!is.null(self$`operations`)) {
        LocalInventoryItemsBatchCreateObject[["operations"]] <-
          self$extractSimpleType(self$`operations`)
      }
      return(LocalInventoryItemsBatchCreateObject)
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
    #' Deserialize JSON string into an instance of LocalInventoryItemsBatchCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalInventoryItemsBatchCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`operations`)) {
        self$`operations` <- ApiClient$new()$deserializeObj(this_object$`operations`, "array[LocalInventoryOperation]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocalInventoryItemsBatchCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocalInventoryItemsBatchCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalInventoryItemsBatchCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`operations` <- ApiClient$new()$deserializeObj(this_object$`operations`, "array[LocalInventoryOperation]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocalInventoryItemsBatchCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `operations`
      if (!is.null(input_json$`operations`)) {
        stopifnot(is.vector(input_json$`operations`), length(input_json$`operations`) != 0)
        tmp <- sapply(input_json$`operations`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryItemsBatchCreate: the required field `operations` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocalInventoryItemsBatchCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `operations` is null
      if (is.null(self$`operations`)) {
        return(FALSE)
      }

      if (length(self$`operations`) > 1000) {
        return(FALSE)
      }
      if (length(self$`operations`) < 1) {
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
      # check if the required `operations` is null
      if (is.null(self$`operations`)) {
        invalid_fields["operations"] <- "Non-nullable required field `operations` cannot be null."
      }

      if (length(self$`operations`) > 1000) {
        invalid_fields["operations"] <- "Invalid length for `operations`, number of items must be less than or equal to 1000."
      }
      if (length(self$`operations`) < 1) {
        invalid_fields["operations"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# LocalInventoryItemsBatchCreate$unlock()
#
## Below is an example to define the print function
# LocalInventoryItemsBatchCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocalInventoryItemsBatchCreate$lock()

