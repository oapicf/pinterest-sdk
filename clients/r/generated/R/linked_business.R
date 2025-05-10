#' Create a new LinkedBusiness
#'
#' @description
#' LinkedBusiness Class
#'
#' @docType class
#' @title LinkedBusiness
#' @description LinkedBusiness Class
#' @format An \code{R6Class} generator object
#' @field username Username character [optional]
#' @field image_small_url image_small_url character [optional]
#' @field image_medium_url image_medium_url character [optional]
#' @field image_large_url image_large_url character [optional]
#' @field image_xlarge_url image_xlarge_url character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LinkedBusiness <- R6::R6Class(
  "LinkedBusiness",
  public = list(
    `username` = NULL,
    `image_small_url` = NULL,
    `image_medium_url` = NULL,
    `image_large_url` = NULL,
    `image_xlarge_url` = NULL,

    #' @description
    #' Initialize a new LinkedBusiness class.
    #'
    #' @param username Username
    #' @param image_small_url image_small_url
    #' @param image_medium_url image_medium_url
    #' @param image_large_url image_large_url
    #' @param image_xlarge_url image_xlarge_url
    #' @param ... Other optional arguments.
    initialize = function(`username` = NULL, `image_small_url` = NULL, `image_medium_url` = NULL, `image_large_url` = NULL, `image_xlarge_url` = NULL, ...) {
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
      if (!is.null(`image_small_url`)) {
        if (!(is.character(`image_small_url`) && length(`image_small_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_small_url`. Must be a string:", `image_small_url`))
        }
        self$`image_small_url` <- `image_small_url`
      }
      if (!is.null(`image_medium_url`)) {
        if (!(is.character(`image_medium_url`) && length(`image_medium_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_medium_url`. Must be a string:", `image_medium_url`))
        }
        self$`image_medium_url` <- `image_medium_url`
      }
      if (!is.null(`image_large_url`)) {
        if (!(is.character(`image_large_url`) && length(`image_large_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_large_url`. Must be a string:", `image_large_url`))
        }
        self$`image_large_url` <- `image_large_url`
      }
      if (!is.null(`image_xlarge_url`)) {
        if (!(is.character(`image_xlarge_url`) && length(`image_xlarge_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_xlarge_url`. Must be a string:", `image_xlarge_url`))
        }
        self$`image_xlarge_url` <- `image_xlarge_url`
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
    #' @return LinkedBusiness as a base R list.
    #' @examples
    #' # convert array of LinkedBusiness (x) to a data frame
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
    #' Convert LinkedBusiness to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LinkedBusinessObject <- list()
      if (!is.null(self$`username`)) {
        LinkedBusinessObject[["username"]] <-
          self$`username`
      }
      if (!is.null(self$`image_small_url`)) {
        LinkedBusinessObject[["image_small_url"]] <-
          self$`image_small_url`
      }
      if (!is.null(self$`image_medium_url`)) {
        LinkedBusinessObject[["image_medium_url"]] <-
          self$`image_medium_url`
      }
      if (!is.null(self$`image_large_url`)) {
        LinkedBusinessObject[["image_large_url"]] <-
          self$`image_large_url`
      }
      if (!is.null(self$`image_xlarge_url`)) {
        LinkedBusinessObject[["image_xlarge_url"]] <-
          self$`image_xlarge_url`
      }
      return(LinkedBusinessObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LinkedBusiness
    #'
    #' @param input_json the JSON input
    #' @return the instance of LinkedBusiness
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      if (!is.null(this_object$`image_small_url`)) {
        self$`image_small_url` <- this_object$`image_small_url`
      }
      if (!is.null(this_object$`image_medium_url`)) {
        self$`image_medium_url` <- this_object$`image_medium_url`
      }
      if (!is.null(this_object$`image_large_url`)) {
        self$`image_large_url` <- this_object$`image_large_url`
      }
      if (!is.null(this_object$`image_xlarge_url`)) {
        self$`image_xlarge_url` <- this_object$`image_xlarge_url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LinkedBusiness in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LinkedBusiness
    #'
    #' @param input_json the JSON input
    #' @return the instance of LinkedBusiness
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`username` <- this_object$`username`
      self$`image_small_url` <- this_object$`image_small_url`
      self$`image_medium_url` <- this_object$`image_medium_url`
      self$`image_large_url` <- this_object$`image_large_url`
      self$`image_xlarge_url` <- this_object$`image_xlarge_url`
      self
    },

    #' @description
    #' Validate JSON input with respect to LinkedBusiness and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LinkedBusiness
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
# LinkedBusiness$unlock()
#
## Below is an example to define the print function
# LinkedBusiness$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LinkedBusiness$lock()

