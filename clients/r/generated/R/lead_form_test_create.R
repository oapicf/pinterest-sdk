#' Create a new LeadFormTestCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title LeadFormTestCreate
#' @description LeadFormTestCreate Class
#' @format An \code{R6Class} generator object
#' @field answers Test lead answers. Should follow the creation order. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormTestCreate <- R6::R6Class(
  "LeadFormTestCreate",
  public = list(
    `answers` = NULL,

    #' @description
    #' Initialize a new LeadFormTestCreate class.
    #'
    #' @param answers Test lead answers. Should follow the creation order.
    #' @param ... Other optional arguments.
    initialize = function(`answers`, ...) {
      if (!missing(`answers`)) {
        stopifnot(is.vector(`answers`), length(`answers`) != 0)
        sapply(`answers`, function(x) stopifnot(is.character(x)))
        self$`answers` <- `answers`
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
    #' @return LeadFormTestCreate as a base R list.
    #' @examples
    #' # convert array of LeadFormTestCreate (x) to a data frame
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
    #' Convert LeadFormTestCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadFormTestCreateObject <- list()
      if (!is.null(self$`answers`)) {
        LeadFormTestCreateObject[["answers"]] <-
          self$`answers`
      }
      return(LeadFormTestCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormTestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormTestCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`answers`)) {
        self$`answers` <- ApiClient$new()$deserializeObj(this_object$`answers`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadFormTestCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormTestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormTestCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`answers` <- ApiClient$new()$deserializeObj(this_object$`answers`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadFormTestCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `answers`
      if (!is.null(input_json$`answers`)) {
        stopifnot(is.vector(input_json$`answers`), length(input_json$`answers`) != 0)
        tmp <- sapply(input_json$`answers`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadFormTestCreate: the required field `answers` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadFormTestCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `answers` is null
      if (is.null(self$`answers`)) {
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
      # check if the required `answers` is null
      if (is.null(self$`answers`)) {
        invalid_fields["answers"] <- "Non-nullable required field `answers` cannot be null."
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
# LeadFormTestCreate$unlock()
#
## Below is an example to define the print function
# LeadFormTestCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormTestCreate$lock()

