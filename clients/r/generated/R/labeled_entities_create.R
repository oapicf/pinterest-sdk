#' Create a new LabeledEntitiesCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title LabeledEntitiesCreate
#' @description LabeledEntitiesCreate Class
#' @format An \code{R6Class} generator object
#' @field entity_ids Entity IDs to apply label to. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabeledEntitiesCreate <- R6::R6Class(
  "LabeledEntitiesCreate",
  public = list(
    `entity_ids` = NULL,

    #' @description
    #' Initialize a new LabeledEntitiesCreate class.
    #'
    #' @param entity_ids Entity IDs to apply label to.
    #' @param ... Other optional arguments.
    initialize = function(`entity_ids`, ...) {
      if (!missing(`entity_ids`)) {
        stopifnot(is.vector(`entity_ids`), length(`entity_ids`) != 0)
        sapply(`entity_ids`, function(x) stopifnot(is.character(x)))
        self$`entity_ids` <- `entity_ids`
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
    #' @return LabeledEntitiesCreate as a base R list.
    #' @examples
    #' # convert array of LabeledEntitiesCreate (x) to a data frame
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
    #' Convert LabeledEntitiesCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabeledEntitiesCreateObject <- list()
      if (!is.null(self$`entity_ids`)) {
        LabeledEntitiesCreateObject[["entity_ids"]] <-
          self$`entity_ids`
      }
      return(LabeledEntitiesCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LabeledEntitiesCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabeledEntitiesCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entity_ids`)) {
        self$`entity_ids` <- ApiClient$new()$deserializeObj(this_object$`entity_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LabeledEntitiesCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabeledEntitiesCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabeledEntitiesCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entity_ids` <- ApiClient$new()$deserializeObj(this_object$`entity_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LabeledEntitiesCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `entity_ids`
      if (!is.null(input_json$`entity_ids`)) {
        stopifnot(is.vector(input_json$`entity_ids`), length(input_json$`entity_ids`) != 0)
        tmp <- sapply(input_json$`entity_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabeledEntitiesCreate: the required field `entity_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabeledEntitiesCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `entity_ids` is null
      if (is.null(self$`entity_ids`)) {
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
      # check if the required `entity_ids` is null
      if (is.null(self$`entity_ids`)) {
        invalid_fields["entity_ids"] <- "Non-nullable required field `entity_ids` cannot be null."
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
# LabeledEntitiesCreate$unlock()
#
## Below is an example to define the print function
# LabeledEntitiesCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabeledEntitiesCreate$lock()

