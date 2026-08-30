#' Create a new AdPreviewSourcePinId
#'
#' @description
#' Ad preview source from an existing Pin.
#'
#' @docType class
#' @title AdPreviewSourcePinId
#' @description AdPreviewSourcePinId Class
#' @format An \code{R6Class} generator object
#' @field creative_type Creative type of the ad preview. \link{AdPinPreviewCreativeType} [optional]
#' @field pin_id Pin ID. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdPreviewSourcePinId <- R6::R6Class(
  "AdPreviewSourcePinId",
  public = list(
    `creative_type` = NULL,
    `pin_id` = NULL,

    #' @description
    #' Initialize a new AdPreviewSourcePinId class.
    #'
    #' @param pin_id Pin ID.
    #' @param creative_type Creative type of the ad preview.
    #' @param ... Other optional arguments.
    initialize = function(`pin_id`, `creative_type` = NULL, ...) {
      if (!missing(`pin_id`)) {
        if (!(is.character(`pin_id`) && length(`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", `pin_id`))
        }
        self$`pin_id` <- `pin_id`
      }
      if (!is.null(`creative_type`)) {
        if (!(`creative_type` %in% c())) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creative_type`))
        self$`creative_type` <- `creative_type`
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
    #' @return AdPreviewSourcePinId as a base R list.
    #' @examples
    #' # convert array of AdPreviewSourcePinId (x) to a data frame
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
    #' Convert AdPreviewSourcePinId to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdPreviewSourcePinIdObject <- list()
      if (!is.null(self$`creative_type`)) {
        AdPreviewSourcePinIdObject[["creative_type"]] <-
          self$extractSimpleType(self$`creative_type`)
      }
      if (!is.null(self$`pin_id`)) {
        AdPreviewSourcePinIdObject[["pin_id"]] <-
          self$`pin_id`
      }
      return(AdPreviewSourcePinIdObject)
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
    #' Deserialize JSON string into an instance of AdPreviewSourcePinId
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewSourcePinId
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`creative_type`)) {
        `creative_type_object` <- AdPinPreviewCreativeType$new()
        `creative_type_object`$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
        self$`creative_type` <- `creative_type_object`
      }
      if (!is.null(this_object$`pin_id`)) {
        self$`pin_id` <- this_object$`pin_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdPreviewSourcePinId in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPreviewSourcePinId
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewSourcePinId
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`creative_type` <- AdPinPreviewCreativeType$new()$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
      self$`pin_id` <- this_object$`pin_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdPreviewSourcePinId and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `pin_id`
      if (!is.null(input_json$`pin_id`)) {
        if (!(is.character(input_json$`pin_id`) && length(input_json$`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", input_json$`pin_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPreviewSourcePinId: the required field `pin_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdPreviewSourcePinId
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `pin_id` is null
      if (is.null(self$`pin_id`)) {
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
      # check if the required `pin_id` is null
      if (is.null(self$`pin_id`)) {
        invalid_fields["pin_id"] <- "Non-nullable required field `pin_id` cannot be null."
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
# AdPreviewSourcePinId$unlock()
#
## Below is an example to define the print function
# AdPreviewSourcePinId$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPreviewSourcePinId$lock()

