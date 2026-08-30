#' Create a new DeleteBusinessPartnersDelete
#'
#' @description
#' DeleteBusinessPartnersDelete Class
#'
#' @docType class
#' @title DeleteBusinessPartnersDelete
#' @description DeleteBusinessPartnersDelete Class
#' @format An \code{R6Class} generator object
#' @field partner_ids A list of partner ids to be deleted list(character)
#' @field partner_type  \link{NullablePartnerType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteBusinessPartnersDelete <- R6::R6Class(
  "DeleteBusinessPartnersDelete",
  public = list(
    `partner_ids` = NULL,
    `partner_type` = NULL,

    #' @description
    #' Initialize a new DeleteBusinessPartnersDelete class.
    #'
    #' @param partner_ids A list of partner ids to be deleted
    #' @param partner_type partner_type
    #' @param ... Other optional arguments.
    initialize = function(`partner_ids`, `partner_type` = NULL, ...) {
      if (!missing(`partner_ids`)) {
        stopifnot(is.vector(`partner_ids`), length(`partner_ids`) != 0)
        sapply(`partner_ids`, function(x) stopifnot(is.character(x)))
        self$`partner_ids` <- `partner_ids`
      }
      if (!is.null(`partner_type`)) {
        if (!(`partner_type` %in% c())) {
          stop(paste("Error! \"", `partner_type`, "\" cannot be assigned to `partner_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`partner_type`))
        self$`partner_type` <- `partner_type`
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
    #' @return DeleteBusinessPartnersDelete as a base R list.
    #' @examples
    #' # convert array of DeleteBusinessPartnersDelete (x) to a data frame
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
    #' Convert DeleteBusinessPartnersDelete to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DeleteBusinessPartnersDeleteObject <- list()
      if (!is.null(self$`partner_ids`)) {
        DeleteBusinessPartnersDeleteObject[["partner_ids"]] <-
          self$`partner_ids`
      }
      if (!is.null(self$`partner_type`)) {
        DeleteBusinessPartnersDeleteObject[["partner_type"]] <-
          self$extractSimpleType(self$`partner_type`)
      }
      return(DeleteBusinessPartnersDeleteObject)
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
    #' Deserialize JSON string into an instance of DeleteBusinessPartnersDelete
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteBusinessPartnersDelete
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`partner_ids`)) {
        self$`partner_ids` <- ApiClient$new()$deserializeObj(this_object$`partner_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`partner_type`)) {
        `partner_type_object` <- NullablePartnerType$new()
        `partner_type_object`$fromJSON(jsonlite::toJSON(this_object$`partner_type`, auto_unbox = TRUE, digits = NA))
        self$`partner_type` <- `partner_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DeleteBusinessPartnersDelete in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteBusinessPartnersDelete
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteBusinessPartnersDelete
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`partner_ids` <- ApiClient$new()$deserializeObj(this_object$`partner_ids`, "array[character]", loadNamespace("openapi"))
      self$`partner_type` <- NullablePartnerType$new()$fromJSON(jsonlite::toJSON(this_object$`partner_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeleteBusinessPartnersDelete and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `partner_ids`
      if (!is.null(input_json$`partner_ids`)) {
        stopifnot(is.vector(input_json$`partner_ids`), length(input_json$`partner_ids`) != 0)
        tmp <- sapply(input_json$`partner_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteBusinessPartnersDelete: the required field `partner_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteBusinessPartnersDelete
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `partner_ids` is null
      if (is.null(self$`partner_ids`)) {
        return(FALSE)
      }

      if (length(self$`partner_ids`) > 50) {
        return(FALSE)
      }
      if (length(self$`partner_ids`) < 1) {
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
      # check if the required `partner_ids` is null
      if (is.null(self$`partner_ids`)) {
        invalid_fields["partner_ids"] <- "Non-nullable required field `partner_ids` cannot be null."
      }

      if (length(self$`partner_ids`) > 50) {
        invalid_fields["partner_ids"] <- "Invalid length for `partner_ids`, number of items must be less than or equal to 50."
      }
      if (length(self$`partner_ids`) < 1) {
        invalid_fields["partner_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# DeleteBusinessPartnersDelete$unlock()
#
## Below is an example to define the print function
# DeleteBusinessPartnersDelete$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteBusinessPartnersDelete$lock()

