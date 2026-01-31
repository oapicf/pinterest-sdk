#' Create a new LabelUpdateRequest
#'
#' @description
#' LabelUpdateRequest Class
#'
#' @docType class
#' @title LabelUpdateRequest
#' @description LabelUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field labels Labels that you are applying to the campaign. list(\link{LabelUpdateRequestLabelsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabelUpdateRequest <- R6::R6Class(
  "LabelUpdateRequest",
  public = list(
    `labels` = NULL,

    #' @description
    #' Initialize a new LabelUpdateRequest class.
    #'
    #' @param labels Labels that you are applying to the campaign.
    #' @param ... Other optional arguments.
    initialize = function(`labels`, ...) {
      if (!missing(`labels`)) {
        stopifnot(is.vector(`labels`), length(`labels`) != 0)
        sapply(`labels`, function(x) stopifnot(R6::is.R6(x)))
        self$`labels` <- `labels`
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
    #' @return LabelUpdateRequest as a base R list.
    #' @examples
    #' # convert array of LabelUpdateRequest (x) to a data frame
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
    #' Convert LabelUpdateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabelUpdateRequestObject <- list()
      if (!is.null(self$`labels`)) {
        LabelUpdateRequestObject[["labels"]] <-
          lapply(self$`labels`, function(x) x$toSimpleType())
      }
      return(LabelUpdateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`labels`)) {
        self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[LabelUpdateRequestLabelsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LabelUpdateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[LabelUpdateRequestLabelsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LabelUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `labels`
      if (!is.null(input_json$`labels`)) {
        stopifnot(is.vector(input_json$`labels`), length(input_json$`labels`) != 0)
        tmp <- sapply(input_json$`labels`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelUpdateRequest: the required field `labels` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabelUpdateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `labels` is null
      if (is.null(self$`labels`)) {
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
      # check if the required `labels` is null
      if (is.null(self$`labels`)) {
        invalid_fields["labels"] <- "Non-nullable required field `labels` cannot be null."
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
# LabelUpdateRequest$unlock()
#
## Below is an example to define the print function
# LabelUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabelUpdateRequest$lock()

