#' Create a new ImageDetails
#'
#' @description
#' ImageDetails Class
#'
#' @docType class
#' @title ImageDetails
#' @description ImageDetails Class
#' @format An \code{R6Class} generator object
#' @field height  integer
#' @field url  character
#' @field width  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ImageDetails <- R6::R6Class(
  "ImageDetails",
  public = list(
    `height` = NULL,
    `url` = NULL,
    `width` = NULL,

    #' @description
    #' Initialize a new ImageDetails class.
    #'
    #' @param height height
    #' @param url url
    #' @param width width
    #' @param ... Other optional arguments.
    initialize = function(`height`, `url`, `width`, ...) {
      if (!missing(`height`)) {
        if (!(is.numeric(`height`) && length(`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", `height`))
        }
        self$`height` <- `height`
      }
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!missing(`width`)) {
        if (!(is.numeric(`width`) && length(`width`) == 1)) {
          stop(paste("Error! Invalid data for `width`. Must be an integer:", `width`))
        }
        self$`width` <- `width`
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
    #' @return ImageDetails as a base R list.
    #' @examples
    #' # convert array of ImageDetails (x) to a data frame
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
    #' Convert ImageDetails to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ImageDetailsObject <- list()
      if (!is.null(self$`height`)) {
        ImageDetailsObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`url`)) {
        ImageDetailsObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`width`)) {
        ImageDetailsObject[["width"]] <-
          self$`width`
      }
      return(ImageDetailsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`height`)) {
        self$`height` <- this_object$`height`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`width`)) {
        self$`width` <- this_object$`width`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ImageDetails in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`height` <- this_object$`height`
      self$`url` <- this_object$`url`
      self$`width` <- this_object$`width`
      self
    },

    #' @description
    #' Validate JSON input with respect to ImageDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `height`
      if (!is.null(input_json$`height`)) {
        if (!(is.numeric(input_json$`height`) && length(input_json$`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", input_json$`height`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ImageDetails: the required field `height` is missing."))
      }
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ImageDetails: the required field `url` is missing."))
      }
      # check the required field `width`
      if (!is.null(input_json$`width`)) {
        if (!(is.numeric(input_json$`width`) && length(input_json$`width`) == 1)) {
          stop(paste("Error! Invalid data for `width`. Must be an integer:", input_json$`width`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ImageDetails: the required field `width` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ImageDetails
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `url` is null
      if (is.null(self$`url`)) {
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
      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
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
# ImageDetails$unlock()
#
## Below is an example to define the print function
# ImageDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ImageDetails$lock()

