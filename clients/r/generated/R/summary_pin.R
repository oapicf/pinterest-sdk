#' Create a new SummaryPin
#'
#' @description
#' Summarized pin information
#'
#' @docType class
#' @title SummaryPin
#' @description SummaryPin Class
#' @format An \code{R6Class} generator object
#' @field alt_text  character [optional]
#' @field description  character [optional]
#' @field id  character
#' @field link  character [optional]
#' @field media  \link{PinMedia} [optional]
#' @field title  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SummaryPin <- R6::R6Class(
  "SummaryPin",
  public = list(
    `alt_text` = NULL,
    `description` = NULL,
    `id` = NULL,
    `link` = NULL,
    `media` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new SummaryPin class.
    #'
    #' @param id id
    #' @param alt_text alt_text
    #' @param description description
    #' @param link link
    #' @param media media
    #' @param title title
    #' @param ... Other optional arguments.
    initialize = function(`id`, `alt_text` = NULL, `description` = NULL, `link` = NULL, `media` = NULL, `title` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`alt_text`)) {
        if (!(is.character(`alt_text`) && length(`alt_text`) == 1)) {
          stop(paste("Error! Invalid data for `alt_text`. Must be a string:", `alt_text`))
        }
        self$`alt_text` <- `alt_text`
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
      if (!is.null(`media`)) {
        stopifnot(R6::is.R6(`media`))
        self$`media` <- `media`
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
    #' @return SummaryPin as a base R list.
    #' @examples
    #' # convert array of SummaryPin (x) to a data frame
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
    #' Convert SummaryPin to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SummaryPinObject <- list()
      if (!is.null(self$`alt_text`)) {
        SummaryPinObject[["alt_text"]] <-
          self$`alt_text`
      }
      if (!is.null(self$`description`)) {
        SummaryPinObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`id`)) {
        SummaryPinObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`link`)) {
        SummaryPinObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`media`)) {
        SummaryPinObject[["media"]] <-
          self$extractSimpleType(self$`media`)
      }
      if (!is.null(self$`title`)) {
        SummaryPinObject[["title"]] <-
          self$`title`
      }
      return(SummaryPinObject)
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
    #' Deserialize JSON string into an instance of SummaryPin
    #'
    #' @param input_json the JSON input
    #' @return the instance of SummaryPin
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`alt_text`)) {
        self$`alt_text` <- this_object$`alt_text`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`media`)) {
        `media_object` <- PinMedia$new()
        `media_object`$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
        self$`media` <- `media_object`
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
    #' @return SummaryPin in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SummaryPin
    #'
    #' @param input_json the JSON input
    #' @return the instance of SummaryPin
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`alt_text` <- this_object$`alt_text`
      self$`description` <- this_object$`description`
      self$`id` <- this_object$`id`
      self$`link` <- this_object$`link`
      self$`media` <- PinMedia$new()$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to SummaryPin and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SummaryPin: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SummaryPin
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`alt_text`) > 500) {
        return(FALSE)
      }

      if (nchar(self$`description`) > 800) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (nchar(self$`link`) > 2048) {
        return(FALSE)
      }

      if (nchar(self$`title`) > 100) {
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
      if (nchar(self$`alt_text`) > 500) {
        invalid_fields["alt_text"] <- "Invalid length for `alt_text`, must be smaller than or equal to 500."
      }

      if (nchar(self$`description`) > 800) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 800."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (nchar(self$`link`) > 2048) {
        invalid_fields["link"] <- "Invalid length for `link`, must be smaller than or equal to 2048."
      }

      if (nchar(self$`title`) > 100) {
        invalid_fields["title"] <- "Invalid length for `title`, must be smaller than or equal to 100."
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
# SummaryPin$unlock()
#
## Below is an example to define the print function
# SummaryPin$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SummaryPin$lock()

