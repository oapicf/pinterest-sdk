#' Create a new PinMediaWithVideos
#'
#' @description
#' Pin with multiple videos.
#'
#' @docType class
#' @title PinMediaWithVideos
#' @description PinMediaWithVideos Class
#' @format An \code{R6Class} generator object
#' @field items  list(\link{VideoMetadataWithItemType}) [optional]
#' @field media_type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaWithVideos <- R6::R6Class(
  "PinMediaWithVideos",
  public = list(
    `items` = NULL,
    `media_type` = NULL,

    #' @description
    #' Initialize a new PinMediaWithVideos class.
    #'
    #' @param media_type media_type
    #' @param items items
    #' @param ... Other optional arguments.
    initialize = function(`media_type`, `items` = NULL, ...) {
      if (!missing(`media_type`)) {
        if (!(`media_type` %in% c("multiple_videos"))) {
          stop(paste("Error! \"", `media_type`, "\" cannot be assigned to `media_type`. Must be \"multiple_videos\".", sep = ""))
        }
        if (!(is.character(`media_type`) && length(`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", `media_type`))
        }
        self$`media_type` <- `media_type`
      }
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
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
    #' @return PinMediaWithVideos as a base R list.
    #' @examples
    #' # convert array of PinMediaWithVideos (x) to a data frame
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
    #' Convert PinMediaWithVideos to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinMediaWithVideosObject <- list()
      if (!is.null(self$`items`)) {
        PinMediaWithVideosObject[["items"]] <-
          self$extractSimpleType(self$`items`)
      }
      if (!is.null(self$`media_type`)) {
        PinMediaWithVideosObject[["media_type"]] <-
          self$`media_type`
      }
      return(PinMediaWithVideosObject)
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
    #' Deserialize JSON string into an instance of PinMediaWithVideos
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithVideos
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[VideoMetadataWithItemType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`media_type`)) {
        if (!is.null(this_object$`media_type`) && !(this_object$`media_type` %in% c("multiple_videos"))) {
          stop(paste("Error! \"", this_object$`media_type`, "\" cannot be assigned to `media_type`. Must be \"multiple_videos\".", sep = ""))
        }
        self$`media_type` <- this_object$`media_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinMediaWithVideos in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithVideos
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithVideos
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[VideoMetadataWithItemType]", loadNamespace("openapi"))
      if (!is.null(this_object$`media_type`) && !(this_object$`media_type` %in% c("multiple_videos"))) {
        stop(paste("Error! \"", this_object$`media_type`, "\" cannot be assigned to `media_type`. Must be \"multiple_videos\".", sep = ""))
      }
      self$`media_type` <- this_object$`media_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaWithVideos and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PinMediaWithVideos: the required field `media_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaWithVideos
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
# PinMediaWithVideos$unlock()
#
## Below is an example to define the print function
# PinMediaWithVideos$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaWithVideos$lock()

