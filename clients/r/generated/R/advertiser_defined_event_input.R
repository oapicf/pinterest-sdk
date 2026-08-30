#' Create a new AdvertiserDefinedEventInput
#'
#' @description
#' Advertiser defined event input for create/update operations
#'
#' @docType class
#' @title AdvertiserDefinedEventInput
#' @description AdvertiserDefinedEventInput Class
#' @format An \code{R6Class} generator object
#' @field mapped_conversion_type Pinterest standard event type to map this custom event to for campaign optimization and reporting \link{AdvertiserDefinedEventMappingType}
#' @field name Raw string name of the event character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvertiserDefinedEventInput <- R6::R6Class(
  "AdvertiserDefinedEventInput",
  public = list(
    `mapped_conversion_type` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new AdvertiserDefinedEventInput class.
    #'
    #' @param mapped_conversion_type Pinterest standard event type to map this custom event to for campaign optimization and reporting
    #' @param name Raw string name of the event
    #' @param ... Other optional arguments.
    initialize = function(`mapped_conversion_type`, `name`, ...) {
      if (!missing(`mapped_conversion_type`)) {
        if (!(`mapped_conversion_type` %in% c())) {
          stop(paste("Error! \"", `mapped_conversion_type`, "\" cannot be assigned to `mapped_conversion_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`mapped_conversion_type`))
        self$`mapped_conversion_type` <- `mapped_conversion_type`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return AdvertiserDefinedEventInput as a base R list.
    #' @examples
    #' # convert array of AdvertiserDefinedEventInput (x) to a data frame
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
    #' Convert AdvertiserDefinedEventInput to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdvertiserDefinedEventInputObject <- list()
      if (!is.null(self$`mapped_conversion_type`)) {
        AdvertiserDefinedEventInputObject[["mapped_conversion_type"]] <-
          self$extractSimpleType(self$`mapped_conversion_type`)
      }
      if (!is.null(self$`name`)) {
        AdvertiserDefinedEventInputObject[["name"]] <-
          self$`name`
      }
      return(AdvertiserDefinedEventInputObject)
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
    #' Deserialize JSON string into an instance of AdvertiserDefinedEventInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvertiserDefinedEventInput
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`mapped_conversion_type`)) {
        `mapped_conversion_type_object` <- AdvertiserDefinedEventMappingType$new()
        `mapped_conversion_type_object`$fromJSON(jsonlite::toJSON(this_object$`mapped_conversion_type`, auto_unbox = TRUE, digits = NA))
        self$`mapped_conversion_type` <- `mapped_conversion_type_object`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdvertiserDefinedEventInput in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvertiserDefinedEventInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvertiserDefinedEventInput
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`mapped_conversion_type` <- AdvertiserDefinedEventMappingType$new()$fromJSON(jsonlite::toJSON(this_object$`mapped_conversion_type`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdvertiserDefinedEventInput and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `mapped_conversion_type`
      if (!is.null(input_json$`mapped_conversion_type`)) {
        stopifnot(R6::is.R6(input_json$`mapped_conversion_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvertiserDefinedEventInput: the required field `mapped_conversion_type` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvertiserDefinedEventInput: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdvertiserDefinedEventInput
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `mapped_conversion_type` is null
      if (is.null(self$`mapped_conversion_type`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `mapped_conversion_type` is null
      if (is.null(self$`mapped_conversion_type`)) {
        invalid_fields["mapped_conversion_type"] <- "Non-nullable required field `mapped_conversion_type` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# AdvertiserDefinedEventInput$unlock()
#
## Below is an example to define the print function
# AdvertiserDefinedEventInput$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdvertiserDefinedEventInput$lock()

