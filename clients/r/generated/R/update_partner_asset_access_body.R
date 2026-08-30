#' Create a new UpdatePartnerAssetAccessBody
#'
#' @description
#' An object with a list of partner asset accesses to assign or update.
#'
#' @docType class
#' @title UpdatePartnerAssetAccessBody
#' @description UpdatePartnerAssetAccessBody Class
#' @format An \code{R6Class} generator object
#' @field accesses List of partner asset accesses to assign or update. list(\link{UpdatePartnerAssetAccessItem})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdatePartnerAssetAccessBody <- R6::R6Class(
  "UpdatePartnerAssetAccessBody",
  public = list(
    `accesses` = NULL,

    #' @description
    #' Initialize a new UpdatePartnerAssetAccessBody class.
    #'
    #' @param accesses List of partner asset accesses to assign or update.
    #' @param ... Other optional arguments.
    initialize = function(`accesses`, ...) {
      if (!missing(`accesses`)) {
        stopifnot(is.vector(`accesses`), length(`accesses`) != 0)
        sapply(`accesses`, function(x) stopifnot(R6::is.R6(x)))
        self$`accesses` <- `accesses`
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
    #' @return UpdatePartnerAssetAccessBody as a base R list.
    #' @examples
    #' # convert array of UpdatePartnerAssetAccessBody (x) to a data frame
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
    #' Convert UpdatePartnerAssetAccessBody to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UpdatePartnerAssetAccessBodyObject <- list()
      if (!is.null(self$`accesses`)) {
        UpdatePartnerAssetAccessBodyObject[["accesses"]] <-
          self$extractSimpleType(self$`accesses`)
      }
      return(UpdatePartnerAssetAccessBodyObject)
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
    #' Deserialize JSON string into an instance of UpdatePartnerAssetAccessBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePartnerAssetAccessBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`accesses`)) {
        self$`accesses` <- ApiClient$new()$deserializeObj(this_object$`accesses`, "array[UpdatePartnerAssetAccessItem]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UpdatePartnerAssetAccessBody in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdatePartnerAssetAccessBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePartnerAssetAccessBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`accesses` <- ApiClient$new()$deserializeObj(this_object$`accesses`, "array[UpdatePartnerAssetAccessItem]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdatePartnerAssetAccessBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `accesses`
      if (!is.null(input_json$`accesses`)) {
        stopifnot(is.vector(input_json$`accesses`), length(input_json$`accesses`) != 0)
        tmp <- sapply(input_json$`accesses`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdatePartnerAssetAccessBody: the required field `accesses` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdatePartnerAssetAccessBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `accesses` is null
      if (is.null(self$`accesses`)) {
        return(FALSE)
      }

      if (length(self$`accesses`) > 50) {
        return(FALSE)
      }
      if (length(self$`accesses`) < 1) {
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
      # check if the required `accesses` is null
      if (is.null(self$`accesses`)) {
        invalid_fields["accesses"] <- "Non-nullable required field `accesses` cannot be null."
      }

      if (length(self$`accesses`) > 50) {
        invalid_fields["accesses"] <- "Invalid length for `accesses`, number of items must be less than or equal to 50."
      }
      if (length(self$`accesses`) < 1) {
        invalid_fields["accesses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdatePartnerAssetAccessBody$unlock()
#
## Below is an example to define the print function
# UpdatePartnerAssetAccessBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdatePartnerAssetAccessBody$lock()

