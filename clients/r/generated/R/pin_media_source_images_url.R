#' Create a new PinMediaSourceImagesURL
#'
#' @description
#' Multiple URL-based images media source
#'
#' @docType class
#' @title PinMediaSourceImagesURL
#' @description PinMediaSourceImagesURL Class
#' @format An \code{R6Class} generator object
#' @field index  integer [optional]
#' @field items Array with image objects. list(\link{PinMediaSourceImagesURLItem})
#' @field source_type The source type of the media. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceImagesURL <- R6::R6Class(
  "PinMediaSourceImagesURL",
  public = list(
    `index` = NULL,
    `items` = NULL,
    `source_type` = NULL,

    #' @description
    #' Initialize a new PinMediaSourceImagesURL class.
    #'
    #' @param items Array with image objects.
    #' @param source_type The source type of the media.
    #' @param index index
    #' @param ... Other optional arguments.
    initialize = function(`items`, `source_type`, `index` = NULL, ...) {
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
      if (!missing(`source_type`)) {
        if (!(`source_type` %in% c("multiple_image_urls"))) {
          stop(paste("Error! \"", `source_type`, "\" cannot be assigned to `source_type`. Must be \"multiple_image_urls\".", sep = ""))
        }
        if (!(is.character(`source_type`) && length(`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", `source_type`))
        }
        self$`source_type` <- `source_type`
      }
      if (!is.null(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
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
    #' @return PinMediaSourceImagesURL as a base R list.
    #' @examples
    #' # convert array of PinMediaSourceImagesURL (x) to a data frame
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
    #' Convert PinMediaSourceImagesURL to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinMediaSourceImagesURLObject <- list()
      if (!is.null(self$`index`)) {
        PinMediaSourceImagesURLObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`items`)) {
        PinMediaSourceImagesURLObject[["items"]] <-
          self$extractSimpleType(self$`items`)
      }
      if (!is.null(self$`source_type`)) {
        PinMediaSourceImagesURLObject[["source_type"]] <-
          self$`source_type`
      }
      return(PinMediaSourceImagesURLObject)
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
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesURL
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[PinMediaSourceImagesURLItem]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`source_type`)) {
        if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("multiple_image_urls"))) {
          stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"multiple_image_urls\".", sep = ""))
        }
        self$`source_type` <- this_object$`source_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinMediaSourceImagesURL in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesURL
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[PinMediaSourceImagesURLItem]", loadNamespace("openapi"))
      if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("multiple_image_urls"))) {
        stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"multiple_image_urls\".", sep = ""))
      }
      self$`source_type` <- this_object$`source_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaSourceImagesURL and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesURL: the required field `items` is missing."))
      }
      # check the required field `source_type`
      if (!is.null(input_json$`source_type`)) {
        if (!(is.character(input_json$`source_type`) && length(input_json$`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", input_json$`source_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesURL: the required field `source_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceImagesURL
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`index` < 0) {
        return(FALSE)
      }

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      if (length(self$`items`) > 5) {
        return(FALSE)
      }
      if (length(self$`items`) < 2) {
        return(FALSE)
      }

      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
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
      if (self$`index` < 0) {
        invalid_fields["index"] <- "Invalid value for `index`, must be bigger than or equal to 0."
      }

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      if (length(self$`items`) > 5) {
        invalid_fields["items"] <- "Invalid length for `items`, number of items must be less than or equal to 5."
      }
      if (length(self$`items`) < 2) {
        invalid_fields["items"] <- "Invalid length for ``, number of items must be greater than or equal to 2."
      }

      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        invalid_fields["source_type"] <- "Non-nullable required field `source_type` cannot be null."
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
# PinMediaSourceImagesURL$unlock()
#
## Below is an example to define the print function
# PinMediaSourceImagesURL$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceImagesURL$lock()

