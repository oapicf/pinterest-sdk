#' Create a new Media
#'
#' @description
#' Media Class
#'
#' @docType class
#' @title Media
#' @description Media Class
#' @format An \code{R6Class} generator object
#' @field media_id Unique identifier for this media upload. Used to track status and for attaching during Pin creation. character
#' @field media_type  \link{MediaUploadType}
#' @field status  \link{MediaUploadStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Media <- R6::R6Class(
  "Media",
  public = list(
    `media_id` = NULL,
    `media_type` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new Media class.
    #'
    #' @param media_id Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    #' @param media_type media_type
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`media_id`, `media_type`, `status` = NULL, ...) {
      if (!missing(`media_id`)) {
        if (!(is.character(`media_id`) && length(`media_id`) == 1)) {
          stop(paste("Error! Invalid data for `media_id`. Must be a string:", `media_id`))
        }
        self$`media_id` <- `media_id`
      }
      if (!missing(`media_type`)) {
        if (!(`media_type` %in% c())) {
          stop(paste("Error! \"", `media_type`, "\" cannot be assigned to `media_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`media_type`))
        self$`media_type` <- `media_type`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
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
    #' @return Media as a base R list.
    #' @examples
    #' # convert array of Media (x) to a data frame
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
    #' Convert Media to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MediaObject <- list()
      if (!is.null(self$`media_id`)) {
        MediaObject[["media_id"]] <-
          self$`media_id`
      }
      if (!is.null(self$`media_type`)) {
        MediaObject[["media_type"]] <-
          self$extractSimpleType(self$`media_type`)
      }
      if (!is.null(self$`status`)) {
        MediaObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      return(MediaObject)
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
    #' Deserialize JSON string into an instance of Media
    #'
    #' @param input_json the JSON input
    #' @return the instance of Media
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_id`)) {
        self$`media_id` <- this_object$`media_id`
      }
      if (!is.null(this_object$`media_type`)) {
        `media_type_object` <- MediaUploadType$new()
        `media_type_object`$fromJSON(jsonlite::toJSON(this_object$`media_type`, auto_unbox = TRUE, digits = NA))
        self$`media_type` <- `media_type_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- MediaUploadStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Media in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Media
    #'
    #' @param input_json the JSON input
    #' @return the instance of Media
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_id` <- this_object$`media_id`
      self$`media_type` <- MediaUploadType$new()$fromJSON(jsonlite::toJSON(this_object$`media_type`, auto_unbox = TRUE, digits = NA))
      self$`status` <- MediaUploadStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to Media and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `media_id`
      if (!is.null(input_json$`media_id`)) {
        if (!(is.character(input_json$`media_id`) && length(input_json$`media_id`) == 1)) {
          stop(paste("Error! Invalid data for `media_id`. Must be a string:", input_json$`media_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Media: the required field `media_id` is missing."))
      }
      # check the required field `media_type`
      if (!is.null(input_json$`media_type`)) {
        stopifnot(R6::is.R6(input_json$`media_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Media: the required field `media_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Media
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `media_id` is null
      if (is.null(self$`media_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`media_id`, "^\\d+$")) {
        return(FALSE)
      }

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
      # check if the required `media_id` is null
      if (is.null(self$`media_id`)) {
        invalid_fields["media_id"] <- "Non-nullable required field `media_id` cannot be null."
      }

      if (!str_detect(self$`media_id`, "^\\d+$")) {
        invalid_fields["media_id"] <- "Invalid value for `media_id`, must conform to the pattern ^\\d+$."
      }

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
# Media$unlock()
#
## Below is an example to define the print function
# Media$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Media$lock()

