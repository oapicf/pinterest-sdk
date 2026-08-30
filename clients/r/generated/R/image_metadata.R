#' Create a new ImageMetadata
#'
#' @description
#' ImageMetadata Class
#'
#' @docType class
#' @title ImageMetadata
#' @description ImageMetadata Class
#' @format An \code{R6Class} generator object
#' @field description  character [optional]
#' @field images  \link{ImageSize} [optional]
#' @field item_type Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload. character
#' @field link  character [optional]
#' @field title  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ImageMetadata <- R6::R6Class(
  "ImageMetadata",
  public = list(
    `description` = NULL,
    `images` = NULL,
    `item_type` = NULL,
    `link` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new ImageMetadata class.
    #'
    #' @param item_type Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
    #' @param description description
    #' @param images images
    #' @param link link
    #' @param title title
    #' @param ... Other optional arguments.
    initialize = function(`item_type`, `description` = NULL, `images` = NULL, `link` = NULL, `title` = NULL, ...) {
      if (!missing(`item_type`)) {
        if (!(`item_type` %in% c("image"))) {
          stop(paste("Error! \"", `item_type`, "\" cannot be assigned to `item_type`. Must be \"image\".", sep = ""))
        }
        if (!(is.character(`item_type`) && length(`item_type`) == 1)) {
          stop(paste("Error! Invalid data for `item_type`. Must be a string:", `item_type`))
        }
        self$`item_type` <- `item_type`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`images`)) {
        stopifnot(R6::is.R6(`images`))
        self$`images` <- `images`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
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
    #' @return ImageMetadata as a base R list.
    #' @examples
    #' # convert array of ImageMetadata (x) to a data frame
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
    #' Convert ImageMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ImageMetadataObject <- list()
      if (!is.null(self$`description`)) {
        ImageMetadataObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`images`)) {
        ImageMetadataObject[["images"]] <-
          self$extractSimpleType(self$`images`)
      }
      if (!is.null(self$`item_type`)) {
        ImageMetadataObject[["item_type"]] <-
          self$`item_type`
      }
      if (!is.null(self$`link`)) {
        ImageMetadataObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`title`)) {
        ImageMetadataObject[["title"]] <-
          self$`title`
      }
      return(ImageMetadataObject)
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
    #' Deserialize JSON string into an instance of ImageMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`images`)) {
        `images_object` <- ImageSize$new()
        `images_object`$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
        self$`images` <- `images_object`
      }
      if (!is.null(this_object$`item_type`)) {
        if (!is.null(this_object$`item_type`) && !(this_object$`item_type` %in% c("image"))) {
          stop(paste("Error! \"", this_object$`item_type`, "\" cannot be assigned to `item_type`. Must be \"image\".", sep = ""))
        }
        self$`item_type` <- this_object$`item_type`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ImageMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ImageMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImageMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`images` <- ImageSize$new()$fromJSON(jsonlite::toJSON(this_object$`images`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`item_type`) && !(this_object$`item_type` %in% c("image"))) {
        stop(paste("Error! \"", this_object$`item_type`, "\" cannot be assigned to `item_type`. Must be \"image\".", sep = ""))
      }
      self$`item_type` <- this_object$`item_type`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to ImageMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_type`
      if (!is.null(input_json$`item_type`)) {
        if (!(is.character(input_json$`item_type`) && length(input_json$`item_type`) == 1)) {
          stop(paste("Error! Invalid data for `item_type`. Must be a string:", input_json$`item_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ImageMetadata: the required field `item_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ImageMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `item_type` is null
      if (is.null(self$`item_type`)) {
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
      # check if the required `item_type` is null
      if (is.null(self$`item_type`)) {
        invalid_fields["item_type"] <- "Non-nullable required field `item_type` cannot be null."
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
# ImageMetadata$unlock()
#
## Below is an example to define the print function
# ImageMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ImageMetadata$lock()

