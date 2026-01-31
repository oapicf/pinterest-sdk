#' Create a new PinMediaSourceImagesURLItem
#'
#' @description
#' PinMediaSourceImagesURLItem Class
#'
#' @docType class
#' @title PinMediaSourceImagesURLItem
#' @description PinMediaSourceImagesURLItem Class
#' @format An \code{R6Class} generator object
#' @field description  character [optional]
#' @field link  character [optional]
#' @field title  character [optional]
#' @field url  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceImagesURLItem <- R6::R6Class(
  "PinMediaSourceImagesURLItem",
  public = list(
    `description` = NULL,
    `link` = NULL,
    `title` = NULL,
    `url` = NULL,

    #' @description
    #' Initialize a new PinMediaSourceImagesURLItem class.
    #'
    #' @param url url
    #' @param description description
    #' @param link link
    #' @param title title
    #' @param ... Other optional arguments.
    initialize = function(`url`, `description` = NULL, `link` = NULL, `title` = NULL, ...) {
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
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
    #' @return PinMediaSourceImagesURLItem as a base R list.
    #' @examples
    #' # convert array of PinMediaSourceImagesURLItem (x) to a data frame
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
    #' Convert PinMediaSourceImagesURLItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinMediaSourceImagesURLItemObject <- list()
      if (!is.null(self$`description`)) {
        PinMediaSourceImagesURLItemObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        PinMediaSourceImagesURLItemObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`title`)) {
        PinMediaSourceImagesURLItemObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`url`)) {
        PinMediaSourceImagesURLItemObject[["url"]] <-
          self$`url`
      }
      return(PinMediaSourceImagesURLItemObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURLItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesURLItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinMediaSourceImagesURLItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURLItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesURLItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaSourceImagesURLItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesURLItem: the required field `url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceImagesURLItem
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
# PinMediaSourceImagesURLItem$unlock()
#
## Below is an example to define the print function
# PinMediaSourceImagesURLItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceImagesURLItem$lock()

