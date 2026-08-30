#' Create a new LocalInventoryItemsGetCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title LocalInventoryItemsGetCreate
#' @description LocalInventoryItemsGetCreate Class
#' @format An \code{R6Class} generator object
#' @field item_filters Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. list(\link{ItemIdStoreCodePair})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocalInventoryItemsGetCreate <- R6::R6Class(
  "LocalInventoryItemsGetCreate",
  public = list(
    `item_filters` = NULL,

    #' @description
    #' Initialize a new LocalInventoryItemsGetCreate class.
    #'
    #' @param item_filters Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
    #' @param ... Other optional arguments.
    initialize = function(`item_filters`, ...) {
      if (!missing(`item_filters`)) {
        stopifnot(is.vector(`item_filters`), length(`item_filters`) != 0)
        sapply(`item_filters`, function(x) stopifnot(R6::is.R6(x)))
        self$`item_filters` <- `item_filters`
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
    #' @return LocalInventoryItemsGetCreate as a base R list.
    #' @examples
    #' # convert array of LocalInventoryItemsGetCreate (x) to a data frame
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
    #' Convert LocalInventoryItemsGetCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocalInventoryItemsGetCreateObject <- list()
      if (!is.null(self$`item_filters`)) {
        LocalInventoryItemsGetCreateObject[["item_filters"]] <-
          self$extractSimpleType(self$`item_filters`)
      }
      return(LocalInventoryItemsGetCreateObject)
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
    #' Deserialize JSON string into an instance of LocalInventoryItemsGetCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalInventoryItemsGetCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_filters`)) {
        self$`item_filters` <- ApiClient$new()$deserializeObj(this_object$`item_filters`, "array[ItemIdStoreCodePair]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocalInventoryItemsGetCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocalInventoryItemsGetCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalInventoryItemsGetCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_filters` <- ApiClient$new()$deserializeObj(this_object$`item_filters`, "array[ItemIdStoreCodePair]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocalInventoryItemsGetCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_filters`
      if (!is.null(input_json$`item_filters`)) {
        stopifnot(is.vector(input_json$`item_filters`), length(input_json$`item_filters`) != 0)
        tmp <- sapply(input_json$`item_filters`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryItemsGetCreate: the required field `item_filters` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocalInventoryItemsGetCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `item_filters` is null
      if (is.null(self$`item_filters`)) {
        return(FALSE)
      }

      if (length(self$`item_filters`) > 1000) {
        return(FALSE)
      }
      if (length(self$`item_filters`) < 1) {
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
      # check if the required `item_filters` is null
      if (is.null(self$`item_filters`)) {
        invalid_fields["item_filters"] <- "Non-nullable required field `item_filters` cannot be null."
      }

      if (length(self$`item_filters`) > 1000) {
        invalid_fields["item_filters"] <- "Invalid length for `item_filters`, number of items must be less than or equal to 1000."
      }
      if (length(self$`item_filters`) < 1) {
        invalid_fields["item_filters"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# LocalInventoryItemsGetCreate$unlock()
#
## Below is an example to define the print function
# LocalInventoryItemsGetCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocalInventoryItemsGetCreate$lock()

