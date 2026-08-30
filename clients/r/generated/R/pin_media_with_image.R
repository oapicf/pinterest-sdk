#' Create a new PinMediaWithImage
#'
#' @description
#' Pin with image.
#'
#' @docType class
#' @title PinMediaWithImage
#' @description PinMediaWithImage Class
#' @format An \code{R6Class} generator object
#' @field images  \link{ImageSize} [optional]
#' @field media_type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaWithImage <- R6::R6Class(
  "PinMediaWithImage",
  public = list(
    `images` = NULL,
    `media_type` = NULL,

    #' @description
    #' Initialize a new PinMediaWithImage class.
    #'
    #' @param media_type media_type
    #' @param images images
    #' @param ... Other optional arguments.
    initialize = function(`media_type`, `images` = NULL, ...) {
      if (!missing(`media_type`)) {
        if (!(`media_type` %in% c("image"))) {
          stop(paste("Error! \"", `media_type`, "\" cannot be assigned to `media_type`. Must be \"image\".", sep = ""))
        }
        if (!(is.character(`media_type`) && length(`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", `media_type`))
        }
        self$`media_type` <- `media_type`
      }
      if (!is.null(`images`)) {
        stopifnot(R6::is.R6(`images`))
        self$`images` <- `images`
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
    #' @return PinMediaWithImage as a base R list.
    #' @examples
    #' # convert array of PinMediaWithImage (x) to a data frame
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
    #' Convert PinMediaWithImage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinMediaWithImageObject <- list()
      if (!is.null(self$`images`)) {
        PinMediaWithImageObject[["images"]] <-
          self$extractSimpleType(self$`images`)
      }
      if (!is.null(self$`media_type`)) {
        PinMediaWithImageObject[["media_type"]] <-
          self$`media_type`
      }
      return(PinMediaWithImageObject)
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
    #' Deserialize JSON string into an instance of PinMediaWithImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`images`)) {
        `images_object` <- ImageSize$new()
        `images_object`$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
        self$`images` <- `images_object`
      }
      if (!is.null(this_object$`media_type`)) {
        if (!is.null(this_object$`media_type`) && !(this_object$`media_type` %in% c("image"))) {
          stop(paste("Error! \"", this_object$`media_type`, "\" cannot be assigned to `media_type`. Must be \"image\".", sep = ""))
        }
        self$`media_type` <- this_object$`media_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinMediaWithImage in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`images` <- ImageSize$new()$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`media_type`) && !(this_object$`media_type` %in% c("image"))) {
        stop(paste("Error! \"", this_object$`media_type`, "\" cannot be assigned to `media_type`. Must be \"image\".", sep = ""))
      }
      self$`media_type` <- this_object$`media_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaWithImage and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `media_type`
      if (!is.null(input_json$`media_type`)) {
        if (!(is.character(input_json$`media_type`) && length(input_json$`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", input_json$`media_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaWithImage: the required field `media_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaWithImage
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `media_type` is null
      if (is.null(self$`media_type`)) {
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
      # check if the required `media_type` is null
      if (is.null(self$`media_type`)) {
        invalid_fields["media_type"] <- "Non-nullable required field `media_type` cannot be null."
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
# PinMediaWithImage$unlock()
#
## Below is an example to define the print function
# PinMediaWithImage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaWithImage$lock()

