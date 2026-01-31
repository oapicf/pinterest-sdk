#' Create a new PinMediaSourceImagesBase64Item
#'
#' @description
#' PinMediaSourceImagesBase64Item Class
#'
#' @docType class
#' @title PinMediaSourceImagesBase64Item
#' @description PinMediaSourceImagesBase64Item Class
#' @format An \code{R6Class} generator object
#' @field content_type  \link{ContentType}
#' @field data  character
#' @field description  character [optional]
#' @field link  character [optional]
#' @field title  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceImagesBase64Item <- R6::R6Class(
  "PinMediaSourceImagesBase64Item",
  public = list(
    `content_type` = NULL,
    `data` = NULL,
    `description` = NULL,
    `link` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new PinMediaSourceImagesBase64Item class.
    #'
    #' @param content_type content_type
    #' @param data data
    #' @param description description
    #' @param link link
    #' @param title title
    #' @param ... Other optional arguments.
    initialize = function(`content_type`, `data`, `description` = NULL, `link` = NULL, `title` = NULL, ...) {
      if (!missing(`content_type`)) {
        if (!(`content_type` %in% c())) {
          stop(paste("Error! \"", `content_type`, "\" cannot be assigned to `content_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`content_type`))
        self$`content_type` <- `content_type`
      }
      if (!missing(`data`)) {
        if (!(is.character(`data`) && length(`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", `data`))
        }
        self$`data` <- `data`
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
    #' @return PinMediaSourceImagesBase64Item as a base R list.
    #' @examples
    #' # convert array of PinMediaSourceImagesBase64Item (x) to a data frame
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
    #' Convert PinMediaSourceImagesBase64Item to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinMediaSourceImagesBase64ItemObject <- list()
      if (!is.null(self$`content_type`)) {
        PinMediaSourceImagesBase64ItemObject[["content_type"]] <-
          self$`content_type`$toSimpleType()
      }
      if (!is.null(self$`data`)) {
        PinMediaSourceImagesBase64ItemObject[["data"]] <-
          self$`data`
      }
      if (!is.null(self$`description`)) {
        PinMediaSourceImagesBase64ItemObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        PinMediaSourceImagesBase64ItemObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`title`)) {
        PinMediaSourceImagesBase64ItemObject[["title"]] <-
          self$`title`
      }
      return(PinMediaSourceImagesBase64ItemObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesBase64Item
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesBase64Item
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`content_type`)) {
        `content_type_object` <- ContentType$new()
        `content_type_object`$fromJSON(jsonlite::toJSON(this_object$`content_type`, auto_unbox = TRUE, digits = NA))
        self$`content_type` <- `content_type_object`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- this_object$`data`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
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
    #' @return PinMediaSourceImagesBase64Item in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesBase64Item
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesBase64Item
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`content_type` <- ContentType$new()$fromJSON(jsonlite::toJSON(this_object$`content_type`, auto_unbox = TRUE, digits = NA))
      self$`data` <- this_object$`data`
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaSourceImagesBase64Item and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `content_type`
      if (!is.null(input_json$`content_type`)) {
        stopifnot(R6::is.R6(input_json$`content_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesBase64Item: the required field `content_type` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        if (!(is.character(input_json$`data`) && length(input_json$`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", input_json$`data`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesBase64Item: the required field `data` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceImagesBase64Item
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `content_type` is null
      if (is.null(self$`content_type`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      if (!str_detect(self$`data`, "^[a-zA-Z0-9+/=]+$")) {
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
      # check if the required `content_type` is null
      if (is.null(self$`content_type`)) {
        invalid_fields["content_type"] <- "Non-nullable required field `content_type` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      if (!str_detect(self$`data`, "^[a-zA-Z0-9+/=]+$")) {
        invalid_fields["data"] <- "Invalid value for `data`, must conform to the pattern ^[a-zA-Z0-9+/=]+$."
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
# PinMediaSourceImagesBase64Item$unlock()
#
## Below is an example to define the print function
# PinMediaSourceImagesBase64Item$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceImagesBase64Item$lock()

