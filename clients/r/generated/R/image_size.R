#' Create a new ImageSize
#'
#' @description
#' ImageSize Class
#'
#' @docType class
#' @title ImageSize
#' @description ImageSize Class
#' @format An \code{R6Class} generator object
#' @field 1200x  \link{ImageDetails} [optional]
#' @field 150x150  \link{ImageDetails} [optional]
#' @field 400x300  \link{ImageDetails} [optional]
#' @field 600x  \link{ImageDetails} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ImageSize <- R6::R6Class(
  "ImageSize",
  public = list(
    `1200x` = NULL,
    `150x150` = NULL,
    `400x300` = NULL,
    `600x` = NULL,

    #' @description
    #' Initialize a new ImageSize class.
    #'
    #' @param 1200x 1200x
    #' @param 150x150 150x150
    #' @param 400x300 400x300
    #' @param 600x 600x
    #' @param ... Other optional arguments.
    initialize = function(`1200x` = NULL, `150x150` = NULL, `400x300` = NULL, `600x` = NULL, ...) {
      if (!is.null(`1200x`)) {
        stopifnot(R6::is.R6(`1200x`))
        self$`1200x` <- `1200x`
      }
      if (!is.null(`150x150`)) {
        stopifnot(R6::is.R6(`150x150`))
        self$`150x150` <- `150x150`
      }
      if (!is.null(`400x300`)) {
        stopifnot(R6::is.R6(`400x300`))
        self$`400x300` <- `400x300`
      }
      if (!is.null(`600x`)) {
        stopifnot(R6::is.R6(`600x`))
        self$`600x` <- `600x`
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
    #' @return ImageSize as a base R list.
    #' @examples
    #' # convert array of ImageSize (x) to a data frame
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
    #' Convert ImageSize to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ImageSizeObject <- list()
      if (!is.null(self$`1200x`)) {
        ImageSizeObject[["1200x"]] <-
          self$`1200x`$toSimpleType()
      }
      if (!is.null(self$`150x150`)) {
        ImageSizeObject[["150x150"]] <-
          self$`150x150`$toSimpleType()
      }
      if (!is.null(self$`400x300`)) {
        ImageSizeObject[["400x300"]] <-
          self$`400x300`$toSimpleType()
      }
      if (!is.null(self$`600x`)) {
        ImageSizeObject[["600x"]] <-
          self$`600x`$toSimpleType()
      }
      return(ImageSizeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageSize
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageSize
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`1200x`)) {
        `1200x_object` <- ImageDetails$new()
        `1200x_object`$fromJSON(jsonlite::toJSON(this_object$`1200x`, auto_unbox = TRUE, digits = NA))
        self$`1200x` <- `1200x_object`
      }
      if (!is.null(this_object$`150x150`)) {
        `150x150_object` <- ImageDetails$new()
        `150x150_object`$fromJSON(jsonlite::toJSON(this_object$`150x150`, auto_unbox = TRUE, digits = NA))
        self$`150x150` <- `150x150_object`
      }
      if (!is.null(this_object$`400x300`)) {
        `400x300_object` <- ImageDetails$new()
        `400x300_object`$fromJSON(jsonlite::toJSON(this_object$`400x300`, auto_unbox = TRUE, digits = NA))
        self$`400x300` <- `400x300_object`
      }
      if (!is.null(this_object$`600x`)) {
        `600x_object` <- ImageDetails$new()
        `600x_object`$fromJSON(jsonlite::toJSON(this_object$`600x`, auto_unbox = TRUE, digits = NA))
        self$`600x` <- `600x_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ImageSize in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageSize
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageSize
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`1200x` <- ImageDetails$new()$fromJSON(jsonlite::toJSON(this_object$`1200x`, auto_unbox = TRUE, digits = NA))
      self$`150x150` <- ImageDetails$new()$fromJSON(jsonlite::toJSON(this_object$`150x150`, auto_unbox = TRUE, digits = NA))
      self$`400x300` <- ImageDetails$new()$fromJSON(jsonlite::toJSON(this_object$`400x300`, auto_unbox = TRUE, digits = NA))
      self$`600x` <- ImageDetails$new()$fromJSON(jsonlite::toJSON(this_object$`600x`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ImageSize and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ImageSize
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# ImageSize$unlock()
#
## Below is an example to define the print function
# ImageSize$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ImageSize$lock()

